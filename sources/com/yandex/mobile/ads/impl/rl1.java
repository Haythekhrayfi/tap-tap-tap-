package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class rl1 implements rj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<com.yandex.mobile.ads.nativeads.o> f24788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ol1 f24789b = new ol1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nk1 f24790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mj0 f24791d;

    public rl1(com.yandex.mobile.ads.nativeads.o oVar) {
        this.f24788a = new WeakReference<>(oVar);
        this.f24790c = new nk1(oVar.d());
        this.f24791d = new mj0(oVar.d());
    }

    @Override // com.yandex.mobile.ads.impl.rj0
    public final void a(Context context, AdResponse<cj0> adResponse) {
        com.yandex.mobile.ads.nativeads.o oVar = this.f24788a.get();
        if (oVar != null) {
            oVar.e().b(v3.f25798a);
            nj0 nj0Var = new nj0(adResponse.C());
            this.f24790c.a(context, adResponse, this.f24791d);
            this.f24790c.a(context, adResponse, nj0Var);
            Objects.requireNonNull(this.f24789b);
            com.yandex.mobile.ads.nativeads.s0 s0Var = new com.yandex.mobile.ads.nativeads.s0();
            oVar.a(adResponse, new pi0(new kk1(adResponse), new jk1(), s0Var, new jl1(adResponse), new yl1()), "Yandex");
        }
    }
}
