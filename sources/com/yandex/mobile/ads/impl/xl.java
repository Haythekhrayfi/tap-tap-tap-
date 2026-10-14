package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import com.applovin.sdk.AppLovinEventParameters;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class xl {
    public static final String a(String str, String str2, Charset charset) {
        fd.j0.i(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        fd.j0.i(str2, "password");
        fd.j0.i(charset, "charset");
        return fn1.a("Basic ", qd.g.f34892f.c(str + CoreConstants.COLON_CHAR + str2, charset).a());
    }
}
