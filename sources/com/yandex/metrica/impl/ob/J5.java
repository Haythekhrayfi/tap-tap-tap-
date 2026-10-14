package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class J5 extends AbstractC1948s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1547c2 f14278b;

    public J5(C1624f4 c1624f4) {
        this(c1624f4, P0.i().m());
    }

    public J5(C1624f4 c1624f4, C1547c2 c1547c2) {
        super(c1624f4);
        this.f14278b = c1547c2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject;
        E0 e10 = null;
        try {
            jSONObjectOptJSONObject = new JSONObject(c1744k0.p()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObjectOptJSONObject = null;
        }
        C1547c2 c1547c2 = this.f14278b;
        String strE = C2120ym.e(jSONObjectOptJSONObject, "trackingId");
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("additionalParams")) {
            jSONObject = null;
        } else {
            try {
                jSONObject = jSONObjectOptJSONObject.getJSONObject("additionalParams");
            } catch (Throwable unused2) {
                jSONObject = null;
            }
        }
        if (jSONObject != null) {
            jSONObject2 = jSONObject;
        }
        boolean zA = C2120ym.a(jSONObjectOptJSONObject, "wasSet", false);
        boolean zA2 = C2120ym.a(jSONObjectOptJSONObject, "autoTracking", false);
        String strE2 = C2120ym.e(jSONObjectOptJSONObject, "source");
        E0[] e0ArrValues = E0.values();
        for (int i10 = 0; i10 < 4; i10++) {
            E0 e11 = e0ArrValues[i10];
            if (fd.j0.d(e11.a(), strE2)) {
                e10 = e11;
                break;
            }
        }
        c1547c2.b(new Le(strE, jSONObject2, zA, zA2, e10 != null ? e10 : E0.UNDEFINED));
        return false;
    }
}
