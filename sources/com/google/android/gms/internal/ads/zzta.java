package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzta {
    private final zzabd zza;
    private final Map zzb = new HashMap();
    private final Set zzc = new HashSet();
    private final Map zzd = new HashMap();
    private zzgd zze;

    public zzta(zzabd zzabdVar) {
        this.zza = zzabdVar;
    }

    public final void zza(zzgd zzgdVar) {
        if (zzgdVar != this.zze) {
            this.zze = zzgdVar;
            this.zzb.clear();
            this.zzd.clear();
        }
    }
}
