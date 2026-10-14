package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zf0 implements gf0, hf0, wo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f27326a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f27327b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f27328c = new ArrayList();

    @Override // com.yandex.mobile.ads.impl.hf0
    public final void a() {
        Iterator it = this.f27327b.iterator();
        while (it.hasNext()) {
            ((hf0) it.next()).a();
        }
    }

    public final void a(gf0 gf0Var) {
        fd.j0.i(gf0Var, "mobileAdsSchemeImpressionListener");
        this.f27326a.add(gf0Var);
    }

    public final void a(hf0 hf0Var) {
        fd.j0.i(hf0Var, "mobileAdsSchemeRewardListener");
        this.f27327b.add(hf0Var);
    }

    public final void a(wo0 wo0Var) {
        fd.j0.i(wo0Var, "onCloseButtonListener");
        this.f27328c.add(wo0Var);
    }

    @Override // com.yandex.mobile.ads.impl.wo0
    public final void a(boolean z10) {
        Iterator it = this.f27328c.iterator();
        while (it.hasNext()) {
            ((wo0) it.next()).a(z10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gf0
    public final void b() {
        Iterator it = this.f27326a.iterator();
        while (it.hasNext()) {
            ((gf0) it.next()).b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.wo0
    public final void c() {
        Iterator it = this.f27328c.iterator();
        while (it.hasNext()) {
            ((wo0) it.next()).c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gf0
    public final void d() {
        Iterator it = this.f27326a.iterator();
        while (it.hasNext()) {
            ((gf0) it.next()).d();
        }
    }
}
