package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jl1 implements bd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fd0 f22079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cd0 f22080b = new cd0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ed0 f22081c = new ed0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dd0 f22082d = new dd0();

    public jl1(AdResponse<?> adResponse) {
        this.f22079a = new fd0(adResponse);
    }

    @Override // com.yandex.mobile.ads.impl.bd0
    public final zc0 a(MediaView mediaView, k2 k2Var, g20 g20Var, v20 v20Var, lk0 lk0Var, zj0 zj0Var, d11 d11Var, vc0 vc0Var) {
        pl0 pl0VarA = lk0Var.a();
        om0 om0VarB = lk0Var.b();
        zc0 zc0VarA = null;
        if (vc0Var == null) {
            return null;
        }
        List<j20> listA = vc0Var.a();
        wa0 wa0VarB = vc0Var.b();
        Context context = mediaView.getContext();
        if (pl0VarA != null) {
            zc0VarA = this.f22079a.a(mediaView, k2Var, v20Var, pl0VarA, zj0Var);
        } else if (om0VarB != null && wa0VarB != null && t6.a(context)) {
            try {
                zc0VarA = this.f22082d.a(mediaView, wa0VarB, v20Var, om0VarB, k2Var);
            } catch (xi1 unused) {
            }
        }
        if (zc0VarA != null || listA == null || listA.isEmpty()) {
            return zc0VarA;
        }
        if (listA.size() != 1) {
            try {
                return this.f22081c.a(mediaView, g20Var, listA, k2Var, d11Var);
            } catch (Throwable unused2) {
            }
        }
        return this.f22080b.a(mediaView, g20Var, k2Var);
    }
}
