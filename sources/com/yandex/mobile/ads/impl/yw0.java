package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Log;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.yandex.mobile.ads.BuildConfigFieldProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class yw0 {
    public static xw0 a(Context context, int i10) {
        boolean z10 = ci1.f19511a;
        x60.b("Changing log tag to %s", "Yandex Mobile Ads");
        ci1.f19511a = Log.isLoggable("Yandex Mobile Ads", 2);
        ci1.f19511a = BuildConfigFieldProvider.isDebug();
        return new xw0(new ip(jp.a(context, "mobileads-volley-cache"), (int) he0.a(context, SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE)), new qe(new a10(context, new yy0()).a()), i10);
    }
}
