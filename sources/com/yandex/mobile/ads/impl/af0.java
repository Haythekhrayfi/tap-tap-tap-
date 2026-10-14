package com.yandex.mobile.ads.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class af0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18922a;

    public af0(Context context) {
        this.f18922a = context.getApplicationContext();
    }

    public final ze0 a(SSLSocketFactory sSLSocketFactory) {
        return new ze0(this.f18922a, sSLSocketFactory);
    }
}
