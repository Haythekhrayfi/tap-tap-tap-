package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class hy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f21520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hq f21521b = new hq();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21522c;

    public hy0(v0 v0Var, int i10) {
        this.f21520a = v0Var;
        this.f21522c = i10;
    }

    private static vj a(AdResponse adResponse, com.yandex.mobile.ads.nativeads.u uVar, q0 q0Var, h2 h2Var, fy0 fy0Var) {
        z61 z61Var = new z61();
        ei0 ei0Var = new ei0();
        lk0 lk0VarA = uVar.a();
        return new vj(new gy0(adResponse, q0Var, fy0Var, ei0Var, lk0VarA), new vk(adResponse, q0Var, h2Var, lk0VarA), new my0(adResponse, q0Var, z61Var, lk0VarA));
    }

    @Nullable
    public final cq a(Context context, AdResponse adResponse, com.yandex.mobile.ads.nativeads.u uVar, q0 q0Var, h2 h2Var, fy0 fy0Var, @Nullable yp ypVar) {
        y9.l1 l1VarA;
        try {
            Objects.requireNonNull(this.f21521b);
            if (!hq.a(context) || ypVar == null || (l1VarA = qp.a(ypVar)) == null) {
                return null;
            }
            return new cq(l1VarA, a(adResponse, uVar, q0Var, h2Var, fy0Var), this.f21520a, this.f21522c);
        } catch (Throwable unused) {
            return null;
        }
    }
}
