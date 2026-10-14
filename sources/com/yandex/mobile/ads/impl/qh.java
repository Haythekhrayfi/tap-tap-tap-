package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f24494a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f24495b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f24496c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f24497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f24498e;

    static {
        Charset.forName("UTF-16BE");
        f24497d = Charset.forName("UTF-16LE");
        f24498e = Charset.forName("UTF-16");
    }
}
