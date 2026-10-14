package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import v.e;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(StringBuilder sb2, HashMap<String, String> map) {
        sb2.append("{");
        boolean z10 = true;
        for (String str : map.keySet()) {
            if (!z10) {
                sb2.append(",");
            }
            String str2 = map.get(str);
            e.a(sb2, "\"", str, "\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                e.a(sb2, "\"", str2, "\"");
            }
            z10 = false;
        }
        sb2.append("}");
    }
}
