package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qa1 f25675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25676c;

    public uj1(Context context, qa1 qa1Var) {
        this.f25674a = context.getApplicationContext();
        this.f25675b = qa1Var;
    }

    public final void a(Context context, List<ac1> list, uw0<List<ac1>> uw0Var) {
        int i10 = this.f25676c + 1;
        this.f25676c = i10;
        if (i10 <= 5) {
            new vj1(this.f25674a, this.f25675b).a(context, list, uw0Var);
        } else {
            uw0Var.a(lc1.b("Maximum count of VAST wrapper requests exceeded."));
        }
    }
}
