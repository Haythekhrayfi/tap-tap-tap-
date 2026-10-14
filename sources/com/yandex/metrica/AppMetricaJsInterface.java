package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import com.yandex.metrica.impl.ob.C2034vg;

/* JADX INFO: loaded from: classes.dex */
public class AppMetricaJsInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2034vg f13437a;

    public AppMetricaJsInterface(C2034vg c2034vg) {
        this.f13437a = c2034vg;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f13437a.c(str, str2);
    }
}
