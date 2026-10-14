package com.yandex.mobile.ads.embedded.guava.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class l0 extends m0.d<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f18363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f18364b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(r rVar, r rVar2) {
        super(0);
        this.f18363a = rVar;
        this.f18364b = rVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f18363a.contains(obj) && this.f18364b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f18363a.containsAll(collection) && this.f18364b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f18364b, this.f18363a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new k0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f18363a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f18364b.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}
