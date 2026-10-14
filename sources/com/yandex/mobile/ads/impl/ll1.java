package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.nativeads.MediaView;

/* JADX INFO: loaded from: classes3.dex */
public final class ll1 extends zc0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pg1<kg0, wa0> f22729c;

    public ll1(MediaView mediaView, mg0 mg0Var, k2 k2Var) {
        super(mediaView, k2Var);
        this.f22729c = new pg1<>(mg0Var);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(View view) {
        this.f22729c.a();
        super.a((MediaView) view);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(qa qaVar, rg1 rg1Var, vc0 vc0Var) {
        vc0 vc0Var2 = vc0Var;
        this.f22729c.a(qaVar, rg1Var, vc0Var2 != null ? vc0Var2.b() : null);
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final void a(vc0 vc0Var) {
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    /* JADX INFO: renamed from: a */
    public final void b(MediaView mediaView, vc0 vc0Var) {
        super.b(mediaView, vc0Var);
        if (vc0Var.b() != null) {
            this.f22729c.b(vc0Var.b());
        }
    }

    @Override // com.yandex.mobile.ads.impl.zc0, com.yandex.mobile.ads.impl.og1
    public final void b(View view, vc0 vc0Var) {
        vc0 vc0Var2 = vc0Var;
        super.b((MediaView) view, vc0Var2);
        if (vc0Var2.b() != null) {
            this.f22729c.b(vc0Var2.b());
        }
    }

    @Override // com.yandex.mobile.ads.impl.og1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean a(MediaView mediaView, vc0 vc0Var) {
        if (vc0Var.b() != null) {
            return this.f22729c.a(vc0Var.b());
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final int c() {
        return 1;
    }
}
