package com.yandex.mobile.ads.impl;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes3.dex */
public enum z5 {
    f27218b("html"),
    f27219c(PluginErrorDetails.Platform.NATIVE),
    f27220d("javascript");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27222a;

    z5(String str) {
        this.f27222a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f27222a;
    }
}
