package com.yandex.mobile.ads.impl;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes3.dex */
public enum ip0 {
    f21787b(PluginErrorDetails.Platform.NATIVE),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("javascript"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("none");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21789a;

    ip0(String str) {
        this.f21789a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f21789a;
    }
}
