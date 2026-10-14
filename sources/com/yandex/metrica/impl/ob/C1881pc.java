package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1881pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, C1507ac.a> f17070a;

    static {
        HashMap map = new HashMap();
        map.put("google", C1507ac.a.GOOGLE);
        map.put("huawei", C1507ac.a.HMS);
        map.put("yandex", C1507ac.a.YANDEX);
        f17070a = Collections.unmodifiableMap(map);
    }
}
