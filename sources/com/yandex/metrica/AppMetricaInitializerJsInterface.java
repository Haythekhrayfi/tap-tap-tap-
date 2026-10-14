package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import com.yandex.metrica.impl.ob.C2034vg;

/* JADX INFO: loaded from: classes.dex */
public class AppMetricaInitializerJsInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2034vg f13436a;

    public AppMetricaInitializerJsInterface(C2034vg c2034vg) {
        this.f13436a = c2034vg;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f13436a.c(str);
    }
}
