package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ib1 extends r71<ac1, List<ac1>> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final va1 f21675u;

    public ib1(Context context, String str, gi1.b bVar, ac1 ac1Var, ak1 ak1Var) {
        super(context, 0, str, bVar, ac1Var, ak1Var);
        this.f21675u = new va1(context);
    }

    @Override // com.yandex.mobile.ads.impl.r71
    public final gx0<List<ac1>> a(wm0 wm0Var, int i10) {
        sa1 sa1VarA = this.f21675u.a(wm0Var);
        if (sa1VarA == null) {
            return gx0.a(new op0("Can't parse VAST response."));
        }
        List<ac1> listB = sa1VarA.b().b();
        return listB.isEmpty() ? gx0.a(new pr()) : gx0.a(listB, null);
    }
}
