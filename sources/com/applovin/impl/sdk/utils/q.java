package com.applovin.impl.sdk.utils;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class q<T extends Comparable<? super T>> implements RandomAccess, Set<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<T> f11354a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<T> f11355b = new HashSet<>();

    public T a() {
        return this.f11354a.get(size() - 1);
    }

    public T a(int i10) {
        return this.f11354a.get(i10);
    }

    public void a(int i10, T t10) {
        this.f11355b.remove(this.f11354a.get(i10));
        this.f11354a.set(i10, t10);
        this.f11355b.add(t10);
    }

    @Override // java.util.Set, java.util.Collection
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(T t10) {
        if (contains(t10)) {
            return false;
        }
        if (isEmpty() || t10.compareTo(a()) > 0) {
            this.f11354a.add(t10);
        } else {
            this.f11354a.add(c(t10), t10);
        }
        return this.f11355b.add(t10);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (add(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    public int b(T t10) {
        if (t10 == null || !contains(t10)) {
            return -1;
        }
        return c(t10);
    }

    public T b(int i10) {
        T tRemove = this.f11354a.remove(i10);
        this.f11355b.remove(tRemove);
        return tRemove;
    }

    public int c(T t10) {
        int iBinarySearch = Collections.binarySearch(this.f11354a, t10);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        Comparable comparableA = a(iBinarySearch);
        while (iBinarySearch >= 0 && comparableA == a(iBinarySearch)) {
            iBinarySearch--;
        }
        return iBinarySearch + 1;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f11354a.clear();
        this.f11355b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f11355b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f11355b.containsAll(collection);
    }

    public int d(T t10) {
        int iBinarySearch = Collections.binarySearch(this.f11354a, t10);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        Comparable comparableA = a(iBinarySearch);
        while (iBinarySearch < size() && comparableA == a(iBinarySearch)) {
            iBinarySearch++;
        }
        return iBinarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f11354a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f11354a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int iB = b((Comparable) obj);
        if (iB == -1) {
            return false;
        }
        this.f11354a.remove(iB);
        return this.f11355b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        while (true) {
            boolean z10 = false;
            for (Object obj : collection) {
                if (z10 || remove(obj)) {
                    z10 = true;
                }
            }
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int size = size() - 1; size >= 0; size--) {
            T t10 = this.f11354a.get(size);
            if (!collection.contains(t10)) {
                this.f11354a.remove(size);
                this.f11355b.remove(t10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f11354a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f11354a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T1> T1[] toArray(T1[] t1Arr) {
        return (T1[]) this.f11354a.toArray(t1Arr);
    }
}
