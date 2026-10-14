package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class pl0 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f24080a = new CopyOnWriteArrayList();

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void a() {
        Iterator it = this.f24080a.iterator();
        while (it.hasNext()) {
            ((ul0) it.next()).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void a(long j10, long j11) {
        Iterator it = this.f24080a.iterator();
        while (it.hasNext()) {
            ((ul0) it.next()).a(j10, j11);
        }
    }

    public final void a(ul0 ul0Var) {
        this.f24080a.add(ul0Var);
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void b() {
        Iterator it = this.f24080a.iterator();
        while (it.hasNext()) {
            ((ul0) it.next()).b();
        }
    }

    public final void b(ul0 ul0Var) {
        this.f24080a.remove(ul0Var);
    }
}
