package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgoy {
    public static final zzgoy zza = new zzgoy(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private static volatile zzgoy zzd;
    private final Map zze;

    public zzgoy() {
        this.zze = new HashMap();
    }

    public zzgoy(boolean z10) {
        this.zze = Collections.emptyMap();
    }

    public static zzgoy zza() {
        return zza;
    }

    public static zzgoy zzb() {
        zzgoy zzgoyVar = zzd;
        if (zzgoyVar != null) {
            return zzgoyVar;
        }
        synchronized (zzgoy.class) {
            zzgoy zzgoyVar2 = zzd;
            if (zzgoyVar2 != null) {
                return zzgoyVar2;
            }
            zzgoy zzgoyVarZzb = zzgpg.zzb(zzgoy.class);
            zzd = zzgoyVarZzb;
            return zzgoyVarZzb;
        }
    }

    public final zzgpk zzc(zzgqw zzgqwVar, int i10) {
        return (zzgpk) this.zze.get(new zzgox(zzgqwVar, i10));
    }
}
