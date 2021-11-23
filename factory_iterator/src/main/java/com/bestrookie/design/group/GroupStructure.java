package com.bestrookie.design.group;

import com.bestrookie.design.lang.Collection;
import com.bestrookie.design.lang.Iterator;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bestrookie
 * @date 2021/11/22 4:04 下午
 */
public class GroupStructure implements Collection<Employee,Link> {
    private String groupId;
    private String groupName;
    private Map<String,Employee> employeeMap = new ConcurrentHashMap<>();
    private Map<String, List<Link>> linkMap = new ConcurrentHashMap<>();
    private Map<String, String> invertedMap = new ConcurrentHashMap<>();

    public GroupStructure(String groupId,String groupName){
        this.groupId = groupId;
        this.groupName = groupName;
    }

    @Override
    public boolean add(Employee employee) {
        return null != employeeMap.put(employee.getUId(),employee);
    }

    @Override
    public boolean remove(Employee employee) {
        return null != employeeMap.remove(employee.getUId());
    }

    @Override
    public boolean addLink(String key, Link link) {
        invertedMap.put(link.getToId(),link.getFormId());
        if (linkMap.containsKey(key)){
            return linkMap.get(key).add(link);
        }else {
            List<Link> links = new ArrayList<Link>();
            links.add(link);
            linkMap.put(key,links);
            return true;
        }
    }

    @Override
    public boolean removeLink(String key) {
        return null != linkMap.remove(key);
    }

    @Override
    public Iterator<Employee> iterator() {
        return new Iterator<Employee>() {
            HashMap<String,Integer> keyMap = new HashMap<String,Integer>(16);
            int totalIdx = 0;
            private String fromId = groupId;
            private String toId = groupId;
            @Override
            public boolean hasNext() {
                return totalIdx < employeeMap.size();
            }

            @Override
            public Employee next() {
                List<Link> links = linkMap.get(toId);
                int cursorIdx = getCursorIdx(toId);
                //如果没有字节点需要遍历返回上一节点
                if (links == null){
                    cursorIdx = getCursorIdx(fromId);
                    links = linkMap.get(fromId);
                }
                //如果此节点编译完 返回到上一节点
                while (cursorIdx > links.size() - 1){
                    fromId = invertedMap.get(fromId);
                    cursorIdx = getCursorIdx(fromId);
                    links = linkMap.get(fromId);
                }
                Link link = links.get(cursorIdx);
                toId = link.getToId();
                fromId = link.getFormId();
                totalIdx++;

                return employeeMap.get(link.getToId());
            }
            //获取节点的遍历进度
            public int getCursorIdx(String key){
                int idx = 0;
                if (keyMap.containsKey(key)){
                    idx = keyMap.get(key);
                    keyMap.put(key,++idx);
                }else {
                    keyMap.put(key,idx);
                }
                return idx;
            }
        };
    }
}
