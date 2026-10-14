package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4 f21320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cf f21321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ue1 f21322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final es0 f21323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21324e;

    public h7(cf cfVar, d4 d4Var, ue1 ue1Var, es0 es0Var) {
        this.f21321b = cfVar;
        this.f21320a = d4Var;
        this.f21322c = ue1Var;
        this.f21323d = es0Var;
    }

    public final void a() {
        af afVarA = this.f21321b.a();
        if (afVarA != null) {
            ir0 ir0VarB = this.f21323d.b();
            if (ir0VarB == null) {
                x60.c("Initialize playback without position provider", new Object[0]);
                return;
            }
            this.f21324e = true;
            int adGroupIndexForPositionUs = this.f21320a.a().getAdGroupIndexForPositionUs(Util.msToUs(ir0VarB.a()), Util.msToUs(this.f21322c.a()));
            if (adGroupIndexForPositionUs == -1 || adGroupIndexForPositionUs != this.f21320a.a().adGroupCount) {
                afVarA.a();
            } else {
                this.f21321b.c();
            }
        }
    }

    public final boolean b() {
        return this.f21324e;
    }
}
