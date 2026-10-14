package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class lc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22690a;

    public lc1(int i10, String str) {
        this(str);
    }

    private lc1(String str) {
        this.f22690a = str;
    }

    public static lc1 a() {
        return new lc1("Internal error. Failed to parse response");
    }

    public static lc1 a(pr prVar) {
        return new lc1(prVar.getMessage() != null ? prVar.getMessage() : "Ad request completed successfully, but there are no ads available.");
    }

    public static lc1 a(String str) {
        if (str == null) {
            str = "Ad request failed with network error. Please try again later.";
        }
        return new lc1(str);
    }

    public static lc1 b() {
        return new lc1("Server temporarily unavailable. Please, try again later.");
    }

    public static lc1 b(String str) {
        return new lc1(str);
    }

    public final String c() {
        return this.f22690a;
    }
}
