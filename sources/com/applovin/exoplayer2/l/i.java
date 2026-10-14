package com.applovin.exoplayer2.l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f7622a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<E, Integer> f7623b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<E> f7624c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<E> f7625d = Collections.emptyList();

    public Set<E> a() {
        Set<E> set;
        synchronized (this.f7622a) {
            set = this.f7624c;
        }
        return set;
    }

    public void a(E e10) {
        synchronized (this.f7622a) {
            ArrayList arrayList = new ArrayList(this.f7625d);
            arrayList.add(e10);
            this.f7625d = Collections.unmodifiableList(arrayList);
            Integer num = this.f7623b.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f7624c);
                hashSet.add(e10);
                this.f7624c = Collections.unmodifiableSet(hashSet);
            }
            this.f7623b.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public void b(E e10) {
        synchronized (this.f7622a) {
            Integer num = this.f7623b.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f7625d);
            arrayList.remove(e10);
            this.f7625d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f7623b.remove(e10);
                HashSet hashSet = new HashSet(this.f7624c);
                hashSet.remove(e10);
                this.f7624c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f7623b.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public int c(E e10) {
        int iIntValue;
        synchronized (this.f7622a) {
            iIntValue = this.f7623b.containsKey(e10) ? this.f7623b.get(e10).intValue() : 0;
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f7622a) {
            it = this.f7625d.iterator();
        }
        return it;
    }
}
