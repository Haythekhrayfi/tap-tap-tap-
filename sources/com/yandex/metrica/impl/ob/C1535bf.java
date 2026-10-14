package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1535bf implements InterfaceC1635ff {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1635ff
    public Vf.d.a.b a(Integer num, String str, String str2, String str3) {
        Tf[] tfArr;
        Vf.d.a.b bVar = new Vf.d.a.b();
        if (num != null) {
            bVar.f15301d = num.intValue();
        }
        if (str != null) {
            bVar.f15302e = str;
        }
        Tf[] tfArrB = null;
        try {
            try {
                if (!TextUtils.isEmpty(str3)) {
                    tfArrB = C1572d2.b(new JSONArray(str3));
                }
            } catch (Throwable unused) {
            }
            tfArr = tfArrB;
        } catch (Throwable unused2) {
            tfArr = new Tf[]{C1572d2.b(new JSONObject(str3))};
        }
        if (tfArr != null) {
            bVar.f15299b = tfArr;
        }
        if (!TextUtils.isEmpty(str2)) {
            Wf[] wfArrA = new Wf[0];
            try {
                wfArrA = C1572d2.a(new JSONArray(str2));
            } catch (Throwable unused3) {
            }
            bVar.f15300c = wfArrA;
        }
        return bVar;
    }
}
