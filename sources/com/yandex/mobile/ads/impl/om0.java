package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class om0 implements wo0, hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f23850a = new CopyOnWriteArrayList();

    @Override // com.yandex.mobile.ads.impl.hf0
    public final void a() {
        Iterator it = this.f23850a.iterator();
        while (it.hasNext()) {
            ((pm0) it.next()).a();
        }
    }

    public final void a(pm0 pm0Var) {
        this.f23850a.add(pm0Var);
    }

    @Override // com.yandex.mobile.ads.impl.wo0
    public final void a(boolean z10) {
        Iterator it = this.f23850a.iterator();
        while (it.hasNext()) {
            ((pm0) it.next()).a(z10);
        }
    }

    public final void b(pm0 pm0Var) {
        this.f23850a.remove(pm0Var);
    }

    @Override // com.yandex.mobile.ads.impl.wo0
    public final void c() {
    }
}
