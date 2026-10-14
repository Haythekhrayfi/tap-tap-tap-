package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jz extends wd<String> implements o2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AdResultReceiver f22197d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jz(Context context, AdResponse<String> adResponse) {
        this(context, adResponse, new AdResultReceiver(new Handler(Looper.getMainLooper())));
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz(Context context, AdResponse<String> adResponse, AdResultReceiver adResultReceiver) {
        super(context, adResponse);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(adResultReceiver, "adResultReceiver");
        this.f22197d = adResultReceiver;
        adResultReceiver.a(this);
    }

    public synchronized void g() {
        this.f22197d.a(null);
    }

    public final AdResultReceiver h() {
        return this.f22197d;
    }
}
