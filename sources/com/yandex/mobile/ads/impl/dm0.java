package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dm0 {
    public static HashSet a(cj0 cj0Var) {
        HashSet hashSet = new HashSet();
        for (qh0 qh0Var : cj0Var.d()) {
            HashSet hashSet2 = new HashSet();
            Iterator<qa<?>> it = qh0Var.b().iterator();
            while (it.hasNext()) {
                Object objD = it.next().d();
                if (objD instanceof vc0) {
                    hashSet2.add((vc0) objD);
                }
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                zb1 zb1VarC = ((vc0) it2.next()).c();
                vl0 vl0VarC = zb1VarC != null ? zb1VarC.a().c() : null;
                if (vl0VarC != null) {
                    hashSet.add(vl0VarC.getUrl());
                }
            }
        }
        return hashSet;
    }
}
