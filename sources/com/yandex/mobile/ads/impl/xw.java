package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class xw implements gf0, hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdResponse<String> f26644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdResultReceiver f26645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nk1 f26646d;

    public xw(Context context, k2 k2Var, AdResponse<String> adResponse, AdResultReceiver adResultReceiver) {
        this.f26643a = context;
        this.f26644b = adResponse;
        this.f26645c = adResultReceiver;
        this.f26646d = new nk1(k2Var);
    }

    @Override // com.yandex.mobile.ads.impl.hf0
    public final void a() {
        this.f26646d.a(this.f26643a, this.f26644b);
        this.f26645c.send(13, null);
    }

    @Override // com.yandex.mobile.ads.impl.gf0
    public final void b() {
        this.f26645c.send(15, null);
    }

    @Override // com.yandex.mobile.ads.impl.gf0
    public final void d() {
        this.f26645c.send(14, null);
    }
}
