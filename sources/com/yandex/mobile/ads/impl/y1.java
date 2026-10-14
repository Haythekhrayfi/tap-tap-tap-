package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i40 f26671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qr0 f26672b = new qr0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x1 f26673c;

    public y1(i40 i40Var) {
        this.f26671a = i40Var;
    }

    public final x1 a() {
        if (this.f26673c == null) {
            g40 g40VarA = this.f26671a.a();
            Objects.requireNonNull(this.f26672b);
            ArrayList arrayList = new ArrayList();
            w50 w50VarC = g40VarA.c();
            if (w50VarC != null) {
                arrayList.add(w50VarC);
            }
            Iterator<rr0> it = g40VarA.a().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            w50 w50VarB = g40VarA.b();
            if (w50VarB != null) {
                arrayList.add(w50VarB);
            }
            this.f26673c = new x1(arrayList);
        }
        return this.f26673c;
    }
}
