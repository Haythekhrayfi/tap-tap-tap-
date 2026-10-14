package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzkz implements zzkq {
    public final zztj zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzkz(zztq zztqVar, boolean z10) {
        this.zza = new zztj(zztqVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzkq
    public final zzcw zza() {
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzkq
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i10) {
        this.zzd = i10;
        this.zze = false;
        this.zzc.clear();
    }
}
