package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdcy {
    private final List zza;
    private final zzfgr zzb;
    private boolean zzc;

    public zzdcy(zzezn zzeznVar, zzfgr zzfgrVar) {
        this.zza = zzeznVar.zzq;
        this.zzb = zzfgrVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zzd(this.zza);
        this.zzc = true;
    }
}
