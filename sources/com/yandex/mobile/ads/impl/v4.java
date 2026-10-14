package com.yandex.mobile.ads.impl;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t2 f25818a = new t2(1, "Received unsupported ad type. We are already working on this issue.");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t2 f25819b = new t2(5, "android.webkit.WebViewDatabase is inoperable. Try using another device for testing.");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t2 f25820c = new t2(1, "Internal state wasn't completely configured. Please try again later.");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t2 f25821d = new t2(1, "Failed to parse server's response. We are already working on this issue.");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t2 f25822e = new t2(5, "android.webkit.WebView creation failed. Try using another device for testing.");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t2 f25823f = new t2(1, "Unexpected server response code. We are already working on this issue.");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t2 f25824g = new t2(1, "Ad request failed with unexpected exception");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t2 f25825h = new t2(1, "Service temporarily unavailable. Please try again later.");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t2 f25826i = new t2(1, "The loaded banner can't fit in the container.");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t2 f25827j = new t2(1, "Banner rendering failed with timeout. Please try again.");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t2 f25828k = new t2(1, "Invalid SDK state.");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t2 f25829l = new t2(4, "Ad request completed successfully, but there are no ads available.");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final t2 f25830m = new t2(3, "Ad request failed with network error. Please try again later.");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t2 f25831n = new t2(2, "Ad request configured incorrectly");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t2 f25832o = new t2(2, "Invalid request parameters");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t2 f25833p = new t2(2, "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t2 f25834q = new t2(2, "Invalid ad size. Set the ad size using the 'setAdSize' method.");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t2 f25835r = new t2(1, "Invalid sdk configuration. Please request another ad.");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t2 f25836s = new t2(0, "Unknown error");

    public static t2 a(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new t2(1, String.format(Locale.US, "Ad was loaded successfully, but there is not enough space to display it. Requested size: [%dx%d], Received size : [%dx%d], device screen size: [%dx%d].", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15)));
    }

    public static t2 a(String str) {
        return new t2(1, str);
    }

    public static t2 b(String str) {
        return new t2(2, String.format(Locale.US, (str == null || str.isEmpty()) ? "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface." : "Provided AdUnitId '%s' does not exist! Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.", str));
    }
}
