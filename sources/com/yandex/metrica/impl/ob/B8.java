package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class B8 extends AbstractC1926r8 {
    public B8(C2056w8 c2056w8) {
        this(c2056w8, P0.i().y().a());
    }

    public B8(C2056w8 c2056w8, H8 h10) {
        super(c2056w8, h10);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1926r8
    public long a() {
        long jOptLong;
        H8 h8F = f();
        synchronized (h8F) {
            jOptLong = h8F.b().optLong("location_id", -1L);
        }
        return jOptLong;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1926r8
    public void b(long j10) {
        H8 h8F = f();
        synchronized (h8F) {
            JSONObject jSONObjectPut = h8F.b().put("location_id", j10);
            fd.j0.h(jSONObjectPut, "getOrLoadData().put(KEY_LOCATION_ID, value)");
            h8F.a(jSONObjectPut);
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1926r8
    public String e() {
        return "l_dat";
    }
}
