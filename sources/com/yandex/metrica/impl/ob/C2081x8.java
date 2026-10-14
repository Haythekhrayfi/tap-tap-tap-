package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2081x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, List<String>> f17835a;

    public C2081x8() {
        HashMap<String, List<String>> map = new HashMap<>();
        this.f17835a = map;
        map.put("reports", O8.d.f14623a);
        map.put("sessions", O8.e.f14625a);
        map.put("preferences", O8.c.f14622a);
        map.put("binary_data", O8.b.f14621a);
    }

    public HashMap<String, List<String>> a() {
        return this.f17835a;
    }
}
