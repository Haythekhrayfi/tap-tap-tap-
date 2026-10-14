package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class na {
    public static boolean a(String str) {
        char c10;
        if ("rtsp" == str) {
            return true;
        }
        if (4 != str.length()) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            char cCharAt = "rtsp".charAt(i10);
            char cCharAt2 = str.charAt(i10);
            if (cCharAt != cCharAt2 && ((c10 = (char) ((cCharAt | ' ') - 97)) >= 26 || c10 != ((char) ((cCharAt2 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static String b(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }
}
