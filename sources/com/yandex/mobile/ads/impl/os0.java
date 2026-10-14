package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ImagesContract;

/* JADX INFO: loaded from: classes3.dex */
public final class os0 implements r91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jw0 f23893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x51 f23894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f23895c;

    public os0(jw0 jw0Var, x51 x51Var) {
        fd.j0.i(jw0Var, "reporter");
        fd.j0.i(x51Var, "targetUrlHandler");
        this.f23893a = jw0Var;
        this.f23894b = x51Var;
    }

    @Override // com.yandex.mobile.ads.impl.r91
    public final void a(String str) {
        fd.j0.i(str, ImagesContract.URL);
        this.f23895c = str;
        if (str.length() == 0) {
            x60.c("Tracking url is empty", new Object[0]);
            return;
        }
        x51 x51Var = this.f23894b;
        jw0 jw0Var = this.f23893a;
        String str2 = this.f23895c;
        if (str2 != null) {
            x51Var.a(jw0Var, str2);
        } else {
            fd.j0.r("targetUrl");
            throw null;
        }
    }
}
