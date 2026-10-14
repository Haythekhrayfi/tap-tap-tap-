package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1962sj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ba f17411a;

    public C1962sj() {
        this(new Ba());
    }

    public C1962sj(Ba ba2) {
        this.f17411a = ba2;
    }

    public void a(C2042vj c2042vj, C2120ym.a aVar) {
        C1760kg.o oVar = new C1760kg.o();
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("sdk_list");
        if (jSONObjectOptJSONObject != null) {
            Long lD = C2120ym.d(jSONObjectOptJSONObject, "min_collecting_interval_seconds");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            oVar.f16705b = C2120ym.a(lD, timeUnit, oVar.f16705b);
            oVar.f16706c = C2120ym.a(C2120ym.d(jSONObjectOptJSONObject, "min_first_collecting_delay_seconds"), timeUnit, oVar.f16706c);
            oVar.f16707d = C2120ym.a(C2120ym.d(jSONObjectOptJSONObject, "min_collecting_delay_after_launch_seconds"), timeUnit, oVar.f16707d);
            oVar.f16708e = C2120ym.a(C2120ym.d(jSONObjectOptJSONObject, "min_request_retry_interval_seconds"), timeUnit, oVar.f16708e);
        }
        c2042vj.a(this.f17411a.a(oVar));
    }
}
