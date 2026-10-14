package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class lz {
    public static AdImpressionData a(Map map) {
        String str = (String) map.get(t00.b(9));
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new AdImpressionData(str);
    }
}
