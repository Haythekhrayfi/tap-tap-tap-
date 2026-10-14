package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URI;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class t91 {
    static {
        Pattern.compile("maps.yandex");
    }

    public static boolean a(String str) {
        boolean z10;
        if (!TextUtils.isEmpty(str)) {
            int[] iArrB = a6.b(31);
            int length = iArrB.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                if (str.startsWith(s91.a(iArrB[i10]))) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        } else {
            z10 = false;
            break;
        }
        return !z10 && URLUtil.isNetworkUrl(str);
    }

    public static boolean b(String str) {
        if (!TextUtils.isEmpty(str)) {
            int[] iArr = {10, 11, 13, 14, 15, 16};
            for (int i10 = 0; i10 < 6; i10++) {
                if (str.startsWith(s91.a(iArr[i10]))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(String str) {
        try {
            new URI(str);
            return !TextUtils.isEmpty(str);
        } catch (Exception unused) {
            return false;
        }
    }
}
