package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class kl<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22436a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f22437b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<E> f22438c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<E> f22439d = Collections.emptyList();

    public final Set<E> a() {
        Set<E> set;
        synchronized (this.f22436a) {
            set = this.f22438c;
        }
        return set;
    }

    public final void a(E e10) {
        synchronized (this.f22436a) {
            ArrayList arrayList = new ArrayList(this.f22439d);
            arrayList.add(e10);
            this.f22439d = Collections.unmodifiableList(arrayList);
            Integer num = (Integer) this.f22437b.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f22438c);
                hashSet.add(e10);
                this.f22438c = Collections.unmodifiableSet(hashSet);
            }
            this.f22437b.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public final int b(E e10) {
        int iIntValue;
        synchronized (this.f22436a) {
            iIntValue = this.f22437b.containsKey(e10) ? ((Integer) this.f22437b.get(e10)).intValue() : 0;
        }
        return iIntValue;
    }

    public final void c(E e10) {
        synchronized (this.f22436a) {
            Integer num = (Integer) this.f22437b.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f22439d);
            arrayList.remove(e10);
            this.f22439d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f22437b.remove(e10);
                HashSet hashSet = new HashSet(this.f22438c);
                hashSet.remove(e10);
                this.f22438c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f22437b.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f22436a) {
            it = this.f22439d.iterator();
        }
        return it;
    }
}
