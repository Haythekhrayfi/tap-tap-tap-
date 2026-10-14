package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgwa implements zzgwe {
    private final Map zza;

    public zzgwa(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    public final Map zza() {
        return this.zza;
    }
}
