package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class x00 {
    public static final boolean a(String str) {
        fd.j0.i(str, "method");
        return (fd.j0.d(str, "GET") || fd.j0.d(str, "HEAD")) ? false : true;
    }

    public static boolean b(String str) {
        fd.j0.i(str, "method");
        return !fd.j0.d(str, "PROPFIND");
    }

    public static boolean c(String str) {
        fd.j0.i(str, "method");
        return fd.j0.d(str, "PROPFIND");
    }

    public static final boolean d(String str) {
        fd.j0.i(str, "method");
        return fd.j0.d(str, "POST") || fd.j0.d(str, "PUT") || fd.j0.d(str, "PATCH") || fd.j0.d(str, "PROPPATCH") || fd.j0.d(str, "REPORT");
    }
}
