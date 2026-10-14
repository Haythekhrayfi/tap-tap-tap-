package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class dg1 {
    public static String a(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
        }
        return str;
    }
}
