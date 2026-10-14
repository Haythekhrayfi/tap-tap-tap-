package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g70 implements ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f70 f20957a;

    public g70(v0 v0Var, int i10) {
        this.f20957a = new f70(v0Var, i10);
    }

    @Override // com.yandex.mobile.ads.impl.ap
    public final ArrayList a(Context context, AdResponse adResponse, com.yandex.mobile.ads.nativeads.u uVar, uk ukVar, q0 q0Var, um umVar, h2 h2Var, fy0 fy0Var, yp ypVar) {
        dj djVarA = new b70(adResponse, q0Var, ukVar).a(new di0(), umVar);
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList(new as0(djVarA), new w70(djVarA), new v70(djVarA));
        cq cqVarA = this.f20957a.a(context, adResponse, uVar, q0Var, ukVar, h2Var, umVar, ypVar);
        if (cqVarA != null) {
            arrayList.add(cqVarA);
        }
        arrayList.addAll(listAsList);
        return arrayList;
    }
}
