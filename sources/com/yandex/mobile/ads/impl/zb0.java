package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xb0 f27275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf f27276b;

    public zb0(Context context) {
        xb0 xb0VarA = new hv0(context).a();
        this.f27275a = xb0VarA;
        this.f27276b = new kf(xb0VarA);
    }

    public final vb0 a(nl nlVar) {
        double d10 = -1.0d;
        vb0 vb0Var = null;
        for (vb0 vb0Var2 : nlVar.f()) {
            double d11 = "video/mp4".equals(vb0Var2.c()) ? 1.5d : 1.0d;
            int iA = this.f27276b.a(vb0Var2);
            int iA2 = this.f27275a.a();
            int iMax = Math.max(0, iA);
            double dAbs = d11 / ((iMax < 100 ? 10.0d : ((double) Math.abs(iA2 - iMax)) / ((double) iA2)) + 1.0d);
            if (dAbs > d10) {
                vb0Var = vb0Var2;
                d10 = dAbs;
            }
        }
        return vb0Var;
    }
}
