package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ro0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eo0 f24811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final go0 f24812c = go0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final so0 f24813d = new so0();

    public ro0(Context context, ob1 ob1Var) {
        this.f24810a = context.getApplicationContext();
        this.f24811b = new eo0(context, ob1Var);
    }

    public final qo0 a(ArrayList arrayList) {
        if (this.f24813d.b(this.f24810a)) {
            this.f24812c.a(this.f24810a);
            em1 em1VarA = this.f24811b.a(arrayList);
            if (em1VarA != null) {
                return new qo0(em1VarA, ub0.a(em1VarA), n2.a(em1VarA));
            }
        }
        return null;
    }
}
