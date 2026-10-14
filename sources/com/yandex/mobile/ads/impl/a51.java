package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class a51 {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase(Locale.US);
    }
}
