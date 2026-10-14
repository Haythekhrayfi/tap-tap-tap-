package com.yandex.metrica.impl.ob;

import com.applovin.sdk.AppLovinMediationProvider;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1720j1 {

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j1$a */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static String a(int i10) {
        Map<String, Integer> map = A2.f13624a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue() == i10) {
                arrayList.add(entry.getKey());
            }
        }
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        return arrayList.size() != 0 ? String.format("One of %s", arrayList) : AppLovinMediationProvider.UNKNOWN;
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
