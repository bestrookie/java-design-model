package com.bestrookie.design.lang;

/**
 * @author bestrookie
 * @date 2021/11/22 3:51 下午
 */
public interface Collection<E,L> extends Iterable<E>{
    boolean add(E e);
    boolean remove(E e);
    boolean addLink(String key, L l);
    boolean removeLink(String key);
    Iterator<E> iterator();
}
