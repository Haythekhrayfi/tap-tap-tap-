package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1597e2 {
    private Map<String, String> b(String str) {
        HashMap map = new HashMap();
        if (str != null) {
            int iLastIndexOf = str.lastIndexOf(63);
            if (iLastIndexOf >= 0) {
                str = str.substring(iLastIndexOf + 1);
            }
            if (str.contains("=")) {
                for (String str2 : str.split("&")) {
                    int iIndexOf = str2.indexOf("=");
                    if (iIndexOf >= 0) {
                        map.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
                    } else {
                        map.put(str2, "");
                    }
                }
            }
        }
        return map;
    }

    public C2073x0 a(String str) {
        HashMap map;
        String strDecode = Uri.decode((String) ((HashMap) b(str)).get("appmetrica_deep_link"));
        if (TextUtils.isEmpty(strDecode)) {
            map = null;
        } else {
            HashMap map2 = (HashMap) b(strDecode);
            map = new HashMap(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                map.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
        }
        return new C2073x0(strDecode, map, str);
    }
}
