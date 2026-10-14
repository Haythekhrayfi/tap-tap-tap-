package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l20 f22008a = new l20();

    public final ArrayList a(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qa qaVar = (qa) it.next();
            Object objD = qaVar.d();
            String strC = qaVar.c();
            if ("image".equals(strC) && (objD instanceof j20)) {
                Objects.requireNonNull(this.f22008a);
                if (l20.a((j20) objD, map)) {
                    arrayList.add(qaVar);
                }
            } else {
                if ("media".equals(strC) && (objD instanceof vc0) && ((vc0) objD).a() != null) {
                    vc0 vc0Var = (vc0) objD;
                    List<j20> listA = vc0Var.a();
                    j20 j20Var = null;
                    if (listA != null && !listA.isEmpty()) {
                        j20Var = listA.get(0);
                    }
                    zb1 zb1VarC = vc0Var.c();
                    wa0 wa0VarB = vc0Var.b();
                    if (zb1VarC == null && wa0VarB == null) {
                        if (j20Var != null) {
                            Objects.requireNonNull(this.f22008a);
                            if (l20.a(j20Var, map)) {
                            }
                        }
                    }
                }
                arrayList.add(qaVar);
            }
        }
        return arrayList;
    }
}
