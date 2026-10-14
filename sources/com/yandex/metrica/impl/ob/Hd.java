package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class Hd {
    public Uf.a a(Tc tc2) {
        Uf.a aVar = new Uf.a();
        aVar.f15157b = tc2.f() == null ? aVar.f15157b : tc2.f().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.f15158c = timeUnit.toSeconds(tc2.d());
        aVar.f15161f = timeUnit.toSeconds(tc2.c());
        aVar.f15162g = tc2.b() == null ? 0 : C1572d2.a(tc2.b());
        aVar.f15163h = tc2.e() == null ? 3 : C1572d2.a(tc2.e());
        JSONArray jSONArrayA = tc2.a();
        if (jSONArrayA != null) {
            aVar.f15159d = C1572d2.b(jSONArrayA);
        }
        JSONArray jSONArrayG = tc2.g();
        if (jSONArrayG != null) {
            aVar.f15160e = C1572d2.a(jSONArrayG);
        }
        return aVar;
    }
}
