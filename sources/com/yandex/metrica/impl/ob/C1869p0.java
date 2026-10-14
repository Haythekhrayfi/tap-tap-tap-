package com.yandex.metrica.impl.ob;

import java.util.Collection;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1869p0 implements Wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedList f17028a;

    public C1869p0(C1894q0 c1894q0, LinkedList linkedList) {
        this.f17028a = linkedList;
    }

    @Override // com.yandex.metrica.impl.ob.Wj
    public void a(Collection<Vj> collection) {
        this.f17028a.add(collection);
    }
}
