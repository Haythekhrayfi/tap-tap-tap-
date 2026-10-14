package com.yandex.mobile.ads.impl;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes3.dex */
public enum l6 {
    f22627b("banner"),
    f22628c("interstitial"),
    f22629d("rewarded"),
    f22630e(PluginErrorDetails.Platform.NATIVE),
    f22631f("vastvideo"),
    f22632g("instream"),
    f22633h("appopenad");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22635a;

    l6(String str) {
        this.f22635a = str;
    }

    public static l6 a(String str) {
        for (l6 l6Var : values()) {
            if (l6Var.f22635a.equals(str)) {
                return l6Var;
            }
        }
        return null;
    }

    public final String a() {
        return this.f22635a;
    }
}
