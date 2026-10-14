package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class zh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f27336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdResponse f27337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private fw0.a f27338d;

    public zh0(Context context, AdResponse adResponse, k2 k2Var) {
        this.f27335a = context.getApplicationContext();
        this.f27336b = k2Var;
        this.f27337c = adResponse;
    }

    public final gi a(String str, String str2) {
        return new gi(this.f27335a, this.f27337c, this.f27336b, new ai0(str, str2, this.f27338d));
    }

    public final void a(fw0.a aVar) {
        this.f27338d = aVar;
    }
}
