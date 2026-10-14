package com.google.android.gms.internal.ads;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes2.dex */
public enum zzfgz {
    HTML("html"),
    NATIVE(PluginErrorDetails.Platform.NATIVE),
    JAVASCRIPT("javascript");

    private final String zze;

    zzfgz(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
