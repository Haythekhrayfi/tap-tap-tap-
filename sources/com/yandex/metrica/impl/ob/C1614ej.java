package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1614ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1555ca f16069a;

    public C1614ej() {
        this(new C1555ca());
    }

    public C1614ej(C1555ca c1555ca) {
        this.f16069a = c1555ca;
    }

    public C1887pi a(JSONObject jSONObject) {
        C1760kg.c cVar = new C1760kg.c();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cache_control");
        if (jSONObjectOptJSONObject != null) {
            Long lD = C2120ym.d(jSONObjectOptJSONObject, "cells_around_ttl");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar.f16613b = C2120ym.a(lD, timeUnit, cVar.f16613b);
            cVar.f16614c = C2120ym.a(C2120ym.d(jSONObjectOptJSONObject, "wifi_networks_ttl"), timeUnit, cVar.f16614c);
            cVar.f16615d = C2120ym.a(C2120ym.d(jSONObjectOptJSONObject, "last_known_location_ttl"), timeUnit, cVar.f16615d);
            cVar.f16616e = C2120ym.a(C2120ym.d(jSONObjectOptJSONObject, "net_interfaces_ttl"), timeUnit, cVar.f16616e);
        }
        return this.f16069a.a(cVar);
    }
}
