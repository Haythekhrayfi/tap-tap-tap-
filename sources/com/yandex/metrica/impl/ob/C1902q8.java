package com.yandex.metrica.impl.ob;

import android.util.Base64;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1902q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17167b;

    public String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f17166a;
            if (str == null) {
                str = "";
            }
            return Base64.encodeToString(jSONObject.put("arg_ee", str).put("arg_hv", this.f17167b).toString().getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public void a(String str) {
        this.f17166a = str;
    }

    public void b(String str) {
        this.f17167b = str;
    }
}
