package com.bestrookie.design;

import com.bestrookie.design.group.Employee;
import com.bestrookie.design.group.GroupStructure;
import com.bestrookie.design.group.Link;
import com.bestrookie.design.lang.Iterator;

/**
 * @author bestrookie
 * @date 2021/11/22 5:09 下午
 */
public class Test {
    public static void main(String[] args) {
        GroupStructure groupStructure = new GroupStructure("1","rookie");

        groupStructure.add(new Employee("2","花花","二级部门"));
        groupStructure.add(new Employee("3","豆包","二级部门"));
        groupStructure.add(new Employee("4","蹦蹦","三级部门"));
        groupStructure.add(new Employee("5","大烧","三级部门"));
        groupStructure.add(new Employee("6","虎哥","四级部门"));
        groupStructure.add(new Employee("7","玲姐","四级部门"));
        groupStructure.add(new Employee("8","秋雅","四级部门"));

        groupStructure.addLink("1",new Link("1","2"));
        groupStructure.addLink("1",new Link("1","3"));
        groupStructure.addLink("2",new Link("2","4"));
        groupStructure.addLink("2",new Link("2","5"));
        groupStructure.addLink("5",new Link("5","6"));
        groupStructure.addLink("5",new Link("5","7"));
        groupStructure.addLink("5",new Link("5","8"));

        Iterator<Employee> iterator = groupStructure.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee.toString());
        }
    }
}
