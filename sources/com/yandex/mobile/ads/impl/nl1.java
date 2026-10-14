package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.nativeads.MediaView;

/* JADX INFO: loaded from: classes3.dex */
public final class nl1 extends zc0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pg1<em0, zb1> f23440c;

    public nl1(MediaView mediaView, kg1 kg1Var, k2 k2Var) {
        super(mediaView, k2Var);
        this.f23440c = new pg1<>(kg1Var);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a() {
        this.f23440c.b();
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(View view) {
        this.f23440c.a();
        super.a((MediaView) view);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(qa qaVar, rg1 rg1Var, vc0 vc0Var) {
        vc0 vc0Var2 = vc0Var;
        this.f23440c.a(qaVar, rg1Var, vc0Var2 != null ? vc0Var2.c() : null);
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final void a(vc0 vc0Var) {
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    /* JADX INFO: renamed from: a */
    public final void b(MediaView mediaView, vc0 vc0Var) {
        super.b(mediaView, vc0Var);
        zb1 zb1VarC = vc0Var.c();
        if (zb1VarC != null) {
            this.f23440c.b(zb1VarC);
        }
    }

    @Override // com.yandex.mobile.ads.impl.zc0, com.yandex.mobile.ads.impl.og1
    public final void b(View view, vc0 vc0Var) {
        vc0 vc0Var2 = vc0Var;
        super.b((MediaView) view, vc0Var2);
        zb1 zb1VarC = vc0Var2.c();
        if (zb1VarC != null) {
            this.f23440c.b(zb1VarC);
        }
    }

    @Override // com.yandex.mobile.ads.impl.og1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean a(MediaView mediaView, vc0 vc0Var) {
        if (vc0Var.c() != null) {
            return this.f23440c.a(vc0Var.c());
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final int c() {
        return 2;
    }
}
