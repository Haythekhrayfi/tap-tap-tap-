package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class qp {
    public static y9.l1 a(yp ypVar) {
        try {
            JSONObject jSONObjectA = ypVar.a();
            JSONObject jSONObjectD = ypVar.d();
            int i10 = u9.e.f36170a;
            w8.a aVar = new w8.a(new u9.e() { // from class: u9.d
                @Override // u9.e
                public final void b(Exception exc) {
                    e.a(exc);
                }
            });
            if (jSONObjectD != null) {
                aVar.c(jSONObjectD);
            }
            return y9.l1.f41189h.a(aVar, jSONObjectA);
        } catch (Throwable unused) {
            return null;
        }
    }
}
