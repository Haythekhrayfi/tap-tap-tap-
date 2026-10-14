package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2063wf implements uo<String> {
    @Override // com.yandex.metrica.impl.ob.uo
    public so a(String str) {
        String str2;
        String str3 = str;
        if (str3 == null) {
            str2 = "key is null";
        } else if (str3.startsWith("appmetrica")) {
            str2 = "key starts with appmetrica";
        } else {
            if (str3.length() <= 200) {
                return so.a(this);
            }
            str2 = "key length more then 200 characters";
        }
        return so.a(this, str2);
    }
}
