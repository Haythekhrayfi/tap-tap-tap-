package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzadj extends zzabk {
    private final long zza;

    public zzadj(zzaax zzaaxVar, long j10) {
        super(zzaaxVar);
        zzdy.zzd(zzaaxVar.zzf() >= j10);
        this.zza = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzabk, com.google.android.gms.internal.ads.zzaax
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabk, com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabk, com.google.android.gms.internal.ads.zzaax
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
