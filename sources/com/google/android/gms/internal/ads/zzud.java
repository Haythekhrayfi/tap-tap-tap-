package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzud implements zzvf {
    private final zzvf zza;
    private final long zzb;

    public zzud(zzvf zzvfVar, long j10) {
        this.zza = zzvfVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final int zza(zzkj zzkjVar, zzhp zzhpVar, int i10) {
        int iZza = this.zza.zza(zzkjVar, zzhpVar, i10);
        if (iZza != -4) {
            return iZza;
        }
        zzhpVar.zzd = Math.max(0L, zzhpVar.zzd + this.zzb);
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final int zzb(long j10) {
        return this.zza.zzb(j10 - this.zzb);
    }

    public final zzvf zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final boolean zze() {
        return this.zza.zze();
    }
}
