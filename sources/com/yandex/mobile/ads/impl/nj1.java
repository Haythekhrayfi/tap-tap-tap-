package com.yandex.mobile.ads.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class nj1 {
    public static nc1 a(ac1 ac1Var, ac1 ac1Var2) {
        fd.j0.i(ac1Var, "videoAd");
        fd.j0.i(ac1Var2, "wrapperVideoAd");
        nc1 nc1VarL = ac1Var.l();
        fd.j0.h(nc1VarL, "videoAd.videoAdExtensions");
        nc1 nc1VarL2 = ac1Var2.l();
        fd.j0.h(nc1VarL2, "wrapperVideoAd.videoAdExtensions");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(nc1VarL.a());
        arrayList.addAll(nc1VarL2.a());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(nc1VarL.b());
        arrayList2.addAll(nc1VarL2.b());
        return new nc1.a().a(arrayList).b(arrayList2).a();
    }
}
