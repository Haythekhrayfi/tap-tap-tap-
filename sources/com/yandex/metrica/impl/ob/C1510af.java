package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1510af implements InterfaceC1585df {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1585df
    public Vf.b a(String str) {
        String string;
        try {
            if (!TextUtils.isEmpty(str)) {
                C2120ym.a aVar = new C2120ym.a(str);
                if (aVar.d("lon") && aVar.d("lat")) {
                    Vf.b bVar = new Vf.b();
                    try {
                        bVar.f15244c = aVar.getDouble("lon");
                        bVar.f15243b = aVar.getDouble("lat");
                        bVar.f15249h = aVar.optInt("altitude");
                        bVar.f15247f = aVar.optInt("direction");
                        bVar.f15246e = aVar.optInt("precision");
                        bVar.f15248g = aVar.optInt("speed");
                        bVar.f15245d = TimeUnit.MILLISECONDS.toSeconds(aVar.optLong("timestamp"));
                        String string2 = "";
                        if (aVar.d("provider")) {
                            if (aVar.has("provider")) {
                                try {
                                    string = aVar.getString("provider");
                                } catch (Throwable unused) {
                                    string = "";
                                }
                            } else {
                                string = "";
                            }
                            if ("gps".equals(string)) {
                                bVar.f15250i = 1;
                            } else if ("network".equals(string)) {
                                bVar.f15250i = 2;
                            }
                        }
                        if (!aVar.d("original_provider")) {
                            return bVar;
                        }
                        if (aVar.has("original_provider")) {
                            try {
                                string2 = aVar.getString("original_provider");
                            } catch (Throwable unused2) {
                            }
                        }
                        bVar.f15251j = string2;
                        return bVar;
                    } catch (Throwable unused3) {
                        return bVar;
                    }
                }
            }
        } catch (Throwable unused4) {
        }
        return null;
    }
}
