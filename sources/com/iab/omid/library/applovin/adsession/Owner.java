package com.iab.omid.library.applovin.adsession;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes2.dex */
public enum Owner {
    NATIVE(PluginErrorDetails.Platform.NATIVE),
    JAVASCRIPT("javascript"),
    NONE("none");

    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.owner;
    }
}
