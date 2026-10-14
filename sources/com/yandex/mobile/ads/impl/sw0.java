package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class sw0 {
    public static void a(Uri.Builder builder, Integer num) {
        if (num != null) {
            a(builder, "cmp_present", Integer.toString(num.intValue()));
        }
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
