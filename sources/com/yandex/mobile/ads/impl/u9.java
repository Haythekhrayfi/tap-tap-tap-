package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.IIdentifierCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class u9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v9 f25571a = new v9();

    public static String a() {
        return "Internal state wasn't completely configured. Connection timeout.";
    }

    public static String b() {
        return "Internal state wasn't completely configured. Incorrect integration.";
    }

    public static String c() {
        return "Internal state wasn't completely configured. Invalid response.";
    }

    public final String a(IIdentifierCallback.Reason reason) {
        fd.j0.i(reason, "reason");
        Objects.requireNonNull(this.f25571a);
        return l8.a1.a("Internal state wasn't completely configured. ", v9.a(reason), CoreConstants.DOT);
    }
}
