package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class qs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f24563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdResponse f24564c;

    public qs(Context context, AdResponse adResponse, k2 k2Var) {
        this.f24562a = context.getApplicationContext();
        this.f24563b = k2Var;
        this.f24564c = adResponse;
    }

    public final ft a() {
        return new ft(new os.b(this.f24562a).a(), new rc0(this.f24562a), new lf1(this.f24562a, this.f24564c, this.f24563b));
    }
}
