package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public enum b71 {
    f19136b("TLSv1.3"),
    f19137c("TLSv1.2"),
    f19138d("TLSv1.1"),
    f19139e("TLSv1"),
    f19140f("SSLv3");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19142a;

    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static b71 a(String str) {
            fd.j0.i(str, "javaName");
            int iHashCode = str.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return b71.f19138d;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return b71.f19137c;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return b71.f19136b;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return b71.f19139e;
                }
            } else if (str.equals("SSLv3")) {
                return b71.f19140f;
            }
            throw new IllegalArgumentException(fn1.a("Unexpected TLS version: ", str));
        }
    }

    b71(String str) {
        this.f19142a = str;
    }

    public final String a() {
        return this.f19142a;
    }
}
