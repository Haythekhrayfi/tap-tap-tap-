package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f20569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hq f20570b = new hq();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20571c;

    public f70(v0 v0Var, int i10) {
        this.f20569a = v0Var;
        this.f20571c = i10;
    }

    @Nullable
    public final cq a(Context context, AdResponse adResponse, com.yandex.mobile.ads.nativeads.u uVar, q0 q0Var, uk ukVar, h2 h2Var, um umVar, @Nullable yp ypVar) {
        y9.l1 l1VarA;
        try {
            Objects.requireNonNull(this.f20570b);
            if (!hq.a(context) || ypVar == null || (l1VarA = qp.a(ypVar)) == null) {
                return null;
            }
            return new cq(l1VarA, new vj(new dj(adResponse, q0Var, new lh1(), ukVar, new ei0(), umVar), new vk(adResponse, q0Var, h2Var, uVar.a())), this.f20569a, this.f20571c);
        } catch (Throwable unused) {
            return null;
        }
    }
}
