package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Ee implements InterfaceC1595e0<Le> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1595e0, uc.l
    public Object invoke(ContentValues contentValues) {
        ContentValues contentValues2 = contentValues;
        String asString = contentValues2.getAsString("tracking_id");
        Le le2 = null;
        if (TextUtils.isEmpty(asString)) {
            B2.b("Tracking id is empty", new Object[0]);
        } else {
            try {
                String asString2 = contentValues2.getAsString("additional_params");
                if (TextUtils.isEmpty(asString2)) {
                    B2.b("No additional params", new Object[0]);
                } else {
                    JSONObject jSONObject = new JSONObject(asString2);
                    if (jSONObject.length() == 0) {
                        B2.b("Additional params are empty", new Object[0]);
                    } else {
                        B2.a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
                        le2 = new Le(asString, jSONObject, true, false, E0.RETAIL);
                    }
                }
            } catch (Throwable th) {
                B2.a(th, "Could not parse additional parameters", new Object[0]);
            }
        }
        return le2;
    }
}
