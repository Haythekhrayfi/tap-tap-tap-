package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;

/* JADX INFO: loaded from: classes3.dex */
final class fv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SizeInfo f20870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0 f20871c;

    public fv(Context context, SizeInfo sizeInfo, v0 v0Var) {
        this.f20869a = context.getApplicationContext();
        this.f20870b = sizeInfo;
        this.f20871c = v0Var;
    }

    public final void a() {
        int i10;
        int i11 = this.f20869a.getResources().getConfiguration().orientation;
        Context context = this.f20869a;
        SizeInfo sizeInfo = this.f20870b;
        boolean zB = v6.b(context, sizeInfo);
        boolean zA = v6.a(context, sizeInfo);
        if (zB == zA) {
            i10 = -1;
        } else {
            i10 = (!zA ? 1 == i11 : 1 != i11) ? 6 : 7;
        }
        if (-1 != i10) {
            ((a1) this.f20871c).a(i10);
        }
    }
}
