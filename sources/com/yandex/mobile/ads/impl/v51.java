package com.yandex.mobile.ads.impl;

import android.os.Build;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class v51 implements y91 {
    @Override // com.yandex.mobile.ads.impl.y91
    public final String a() {
        String property;
        String property2 = null;
        try {
            property = System.getProperty("http.agent");
        } catch (Exception unused) {
            x60.c("Exception during user-agent property read", new Object[0]);
            property = null;
        }
        if (!(property == null || property.length() == 0)) {
            return property;
        }
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Dalvik/");
        try {
            property2 = System.getProperty("java.vm.version");
        } catch (Exception unused2) {
            x60.c("Exception during JVM version property read", new Object[0]);
        }
        if (property2 == null || property2.length() == 0) {
            property2 = "1.0.0";
        }
        sb2.append(property2);
        sb2.append(" (Linux; U; Android ");
        String str = Build.VERSION.RELEASE;
        if (str.length() == 0) {
            str = "1.0";
        }
        sb2.append(str);
        if (fd.j0.d("REL", Build.VERSION.CODENAME)) {
            String str2 = Build.MODEL;
            fd.j0.h(str2, "model");
            if (str2.length() > 0) {
                sb2.append("; ");
                sb2.append(str2);
            }
        }
        String str3 = Build.ID;
        fd.j0.h(str3, FacebookMediationAdapter.KEY_ID);
        if (str3.length() > 0) {
            sb2.append(" Build/");
            sb2.append(str3);
        }
        sb2.append(")");
        String string = sb2.toString();
        fd.j0.h(string, "result.toString()");
        return string;
    }
}
