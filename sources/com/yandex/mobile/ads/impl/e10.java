package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class e10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f20025a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f20026b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f20027c = 0;

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f20026b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        Objects.requireNonNull(strGroup);
        return Long.parseLong(strGroup);
    }

    public static long a(String str, String str2) {
        long j10;
        if (TextUtils.isEmpty(str)) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                p90.b("HttpUtil", "Unexpected Content-Length [" + str + "]");
                j10 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = f20025a.matcher(str2);
        if (!matcher.matches()) {
            return j10;
        }
        try {
            String strGroup = matcher.group(2);
            Objects.requireNonNull(strGroup);
            long j11 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            Objects.requireNonNull(strGroup2);
            long j12 = (j11 - Long.parseLong(strGroup2)) + 1;
            if (j10 < 0) {
                return j12;
            }
            if (j10 == j12) {
                return j10;
            }
            p90.d("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j10, j12);
        } catch (NumberFormatException unused2) {
            p90.b("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j10;
        }
    }
}
