package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ly0 implements ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hy0 f22837a;

    public ly0(v0 v0Var, int i10) {
        this.f22837a = new hy0(v0Var, i10);
    }

    @Override // com.yandex.mobile.ads.impl.ap
    public final ArrayList a(Context context, AdResponse adResponse, com.yandex.mobile.ads.nativeads.u uVar, uk ukVar, q0 q0Var, um umVar, h2 h2Var, fy0 fy0Var, yp ypVar) {
        ArrayList arrayList = new ArrayList();
        cq cqVarA = this.f22837a.a(context, adResponse, uVar, q0Var, h2Var, fy0Var, ypVar);
        if (cqVarA != null) {
            arrayList.add(cqVarA);
        }
        return arrayList;
    }
}
