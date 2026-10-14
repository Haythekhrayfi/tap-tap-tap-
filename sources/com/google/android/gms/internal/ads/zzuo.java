package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzuo implements zzvf {
    public final /* synthetic */ zzur zza;
    private final int zzb;

    public zzuo(zzur zzurVar, int i10) {
        this.zza = zzurVar;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final int zza(zzkj zzkjVar, zzhp zzhpVar, int i10) {
        return this.zza.zzg(this.zzb, zzkjVar, zzhpVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final int zzb(long j10) {
        return this.zza.zzi(this.zzb, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzd() throws IOException {
        this.zza.zzH(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final boolean zze() {
        return this.zza.zzO(this.zzb);
    }
}
