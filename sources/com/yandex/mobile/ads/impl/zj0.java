package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zj0 implements ti0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f27348a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27349b;

    @Override // com.yandex.mobile.ads.impl.ti0
    public final void a() {
        this.f27349b = false;
        Iterator it = this.f27348a.iterator();
        while (it.hasNext()) {
            ((ti0) it.next()).a();
        }
    }

    public final void a(yj0 yj0Var) {
        fd.j0.i(yj0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f27348a.add(yj0Var);
        if (this.f27349b) {
            yj0Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ti0
    public final void b() {
        this.f27349b = true;
        Iterator it = this.f27348a.iterator();
        while (it.hasNext()) {
            ((ti0) it.next()).b();
        }
    }

    public final void b(yj0 yj0Var) {
        fd.j0.i(yj0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f27348a.remove(yj0Var);
    }
}
