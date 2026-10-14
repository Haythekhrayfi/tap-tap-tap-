package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class O2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14603a = 0;

    static {
        Pattern.compile("[^0-9a-zA-Z,`’\\.\\+\\-'\\s\"]");
        Pattern.compile("\\s+");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char cCharAt = str.charAt(0);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        return Character.toUpperCase(cCharAt) + str.substring(1);
    }

    public static String a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append("0123456789abcdef".charAt((b10 & 240) >> 4));
            sb2.append("0123456789abcdef".charAt(b10 & 15));
        }
        return sb2.toString();
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }

    public static byte[] c(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    public static byte[] d(String str) {
        return str == null ? new byte[0] : str.getBytes();
    }
}
