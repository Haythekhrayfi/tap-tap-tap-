package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class vo implements uo<String> {
    @Override // com.yandex.metrica.impl.ob.uo
    public so a(String str) {
        String string;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            string = "ApiKey is empty. Please, read official documentation how to obtain one: https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html";
        } else {
            try {
                UUID.fromString(str2);
                return so.a(this);
            } catch (Throwable unused) {
                StringBuilder sbA = q2.a.a("Invalid ApiKey=", str2, ". ", "Please, read official documentation how to obtain one:", " ");
                sbA.append("https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
                string = sbA.toString();
            }
        }
        return so.a(this, string);
    }
}
