package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class d20 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e20 f19742b;

    public d20(e20 e20Var) {
        this.f19742b = e20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (e20.a aVar : this.f19742b.f20039d.values()) {
            for (e20.c cVar : aVar.f20045d) {
                if (cVar.f20047b != null) {
                    if (aVar.a() == null) {
                        cVar.f20046a = aVar.f20043b;
                        cVar.f20047b.a(cVar, false);
                    } else {
                        cVar.f20047b.a(aVar.a());
                    }
                }
            }
        }
        this.f19742b.f20039d.clear();
        this.f19742b.f20041f = null;
    }
}
