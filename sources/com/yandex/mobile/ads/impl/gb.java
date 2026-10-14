package com.yandex.mobile.ads.impl;

import android.view.View;
import com.google.android.gms.common.internal.ImagesContract;

/* JADX INFO: loaded from: classes3.dex */
public final class gb implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yo0 f20997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final eg1 f21000d;

    public gb(yo0 yo0Var, String str, String str2, eg1 eg1Var) {
        fd.j0.i(yo0Var, "adClickHandler");
        fd.j0.i(str, ImagesContract.URL);
        fd.j0.i(str2, "assetName");
        fd.j0.i(eg1Var, "videoTracker");
        this.f20997a = yo0Var;
        this.f20998b = str;
        this.f20999c = str2;
        this.f21000d = eg1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fd.j0.i(view, "v");
        this.f21000d.a(this.f20999c);
        this.f20997a.a(this.f20998b);
    }
}
