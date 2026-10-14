package com.yandex.mobile.ads.impl;

import com.yandex.metrica.IIdentifierCallback;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class v9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    private static final Map<IIdentifierCallback.Reason, String> f25919a = kc.f0.e(new jc.h(IIdentifierCallback.Reason.NETWORK, "Network error"), new jc.h(IIdentifierCallback.Reason.INVALID_RESPONSE, "Invalid response"), new jc.h(IIdentifierCallback.Reason.UNKNOWN, "Unknown"));

    public static String a(IIdentifierCallback.Reason reason) {
        String str = f25919a.get(reason);
        return str == null ? "Unknown" : str;
    }
}
