package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class k40 implements uw0<rh1>, t30.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t30 f22248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f22249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cr f22250d = new cr();

    public interface a {
        void a(v50 v50Var);

        void a(String str);
    }

    public k40(Context context, xc1 xc1Var, a aVar) {
        this.f22247a = context.getApplicationContext();
        this.f22249c = aVar;
        this.f22248b = new t30(xc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.uw0
    public final void a(lc1 lc1Var) {
        this.f22249c.a(lc1Var.c());
    }

    @Override // com.yandex.mobile.ads.impl.uw0
    public final void a(rh1 rh1Var) {
        List<q1> listA = rh1Var.a();
        ArrayList arrayList = new ArrayList();
        for (q1 q1Var : listA) {
            if (q1Var.d().contains("linear")) {
                arrayList.add(q1Var);
            }
        }
        if (arrayList.isEmpty()) {
            this.f22249c.a("Received response with no ad breaks");
        } else {
            this.f22248b.a(this.f22247a, arrayList, this);
        }
    }

    public final void a(ArrayList arrayList) {
        Objects.requireNonNull(this.f22250d);
        ArrayList arrayListA = cr.a(arrayList);
        if (arrayListA.isEmpty()) {
            this.f22249c.a("Received response with no ad breaks");
        } else {
            this.f22249c.a(new v50(arrayListA));
        }
    }
}
