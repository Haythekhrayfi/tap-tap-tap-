package com.yandex.mobile.ads.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class iz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f21883a;

    public iz0(g40 g40Var) {
        this.f21883a = a(g40Var);
    }

    private static ArrayList a(g40 g40Var) {
        ArrayList arrayList = new ArrayList();
        w50 w50VarC = g40Var.c();
        if (w50VarC != null) {
            arrayList.add(new rr0(w50VarC, 0L));
        }
        arrayList.addAll(g40Var.a());
        return arrayList;
    }

    public final ArrayList a() {
        return this.f21883a;
    }
}
