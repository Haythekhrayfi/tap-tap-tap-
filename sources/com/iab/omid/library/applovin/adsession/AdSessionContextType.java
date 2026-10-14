package com.iab.omid.library.applovin.adsession;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes2.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE(PluginErrorDetails.Platform.NATIVE),
    JAVASCRIPT("javascript");

    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }
}
