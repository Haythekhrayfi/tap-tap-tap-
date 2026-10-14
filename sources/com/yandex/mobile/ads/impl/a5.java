package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a5 {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int length = Uri.encode(str).length();
            if (length <= 1024) {
                return str;
            }
            bu0.f("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. Current size is %s bytes", 1024, Integer.valueOf(length));
            return null;
        } catch (Exception e10) {
            x60.a(e10, e10.getMessage(), new Object[0]);
            return null;
        }
    }

    public static HashMap a(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap map2 = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb2.append("&");
            sb2.append(Uri.encode((String) entry.getKey()));
            sb2.append("=");
            sb2.append(Uri.encode((String) entry.getValue()));
            if (sb2.length() > 61440) {
                bu0.f("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 61440, 61440);
                return map2;
            }
            map2.put((String) entry.getKey(), (String) entry.getValue());
        }
        return map2;
    }
}
