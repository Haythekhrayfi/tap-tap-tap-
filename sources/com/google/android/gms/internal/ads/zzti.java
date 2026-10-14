package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzti extends zzcw {
    private final zzbp zzc;

    public zzti(zzbp zzbpVar) {
        this.zzc = zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zza(Object obj) {
        return obj == zzth.zzd ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final zzct zzd(int i10, zzct zzctVar, boolean z10) {
        zzctVar.zzl(z10 ? 0 : null, z10 ? zzth.zzd : null, 0, -9223372036854775807L, 0L, zzd.zza, true);
        return zzctVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final zzcv zze(int i10, zzcv zzcvVar, long j10) {
        zzcvVar.zza(zzcv.zza, this.zzc, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzcvVar.zzl = true;
        return zzcvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final Object zzf(int i10) {
        return zzth.zzd;
    }
}
