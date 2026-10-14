package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public enum e50 {
    f20071b("design_v1"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("design_v2");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20073a;

    public static final class a {
        public static e50 a(String str) {
            fd.j0.i(str, "value");
            for (e50 e50Var : e50.values()) {
                if (fd.j0.d(e50Var.a(), str)) {
                    return e50Var;
                }
            }
            return null;
        }
    }

    e50(String str) {
        this.f20073a = str;
    }

    public final String a() {
        return this.f20073a;
    }
}
