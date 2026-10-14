package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.video.models.ad.JavaScriptResource;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public final class uo0 {
    public static rb1 a(lb1 lb1Var) throws nb1, IllegalArgumentException {
        JavaScriptResource javaScriptResourceB = lb1Var.b();
        if (javaScriptResourceB == null || !javaScriptResourceB.c().equals("omid")) {
            throw new nb1(lb1Var, 2);
        }
        try {
            URL url = new URL(javaScriptResourceB.d());
            String strD = lb1Var.d();
            String strC = lb1Var.c();
            return TextUtils.isEmpty(strC) ? rb1.a(url) : rb1.a(strD, url, strC);
        } catch (MalformedURLException unused) {
            throw new nb1(lb1Var, 3);
        }
    }
}
