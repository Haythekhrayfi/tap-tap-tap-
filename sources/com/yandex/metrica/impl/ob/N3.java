package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class N3 implements InterfaceC1595e0<Map<String, ? extends String>> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1595e0, uc.l
    public Object invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap<String, String> mapD = C2120ym.d(asString);
        if (C2120ym.d(mapD)) {
            return mapD;
        }
        B2.b(androidx.activity.j.a("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
