package com.yandex.metrica.impl.ob;

import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1936ri {
    public boolean a(Map<String, String> map, Qi qi, Q q10) {
        Map<String, String> mapB = q10.a(new P3.a(map, E0.APP)).b();
        if (U2.b(mapB)) {
            return true;
        }
        return mapB.equals(C2120ym.a(qi.v()));
    }
}
