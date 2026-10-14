package com.google.android.gms.internal.ads;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes2.dex */
public enum zzfhe {
    NATIVE(PluginErrorDetails.Platform.NATIVE),
    JAVASCRIPT("javascript"),
    NONE("none");

    private final String zze;

    zzfhe(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
