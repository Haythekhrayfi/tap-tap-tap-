package h5;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class b0<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<E> f30729c;

    public b0(List<E> list) {
        this.f30729c = Collections.unmodifiableList(list);
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        this.f30729c.add(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e10) {
        return this.f30729c.add(e10);
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        return this.f30729c.addAll(i10, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f30729c.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f30729c.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f30729c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f30729c.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f30729c.equals(obj);
    }

    @Override // java.util.List
    public E get(int i10) {
        return this.f30729c.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f30729c.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f30729c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f30729c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f30729c.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f30729c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f30729c.listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return this.f30729c.listIterator(i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        return this.f30729c.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f30729c.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f30729c.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f30729c.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        return this.f30729c.set(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f30729c.size();
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return this.f30729c.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f30729c.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f30729c.toArray(tArr);
    }
}
