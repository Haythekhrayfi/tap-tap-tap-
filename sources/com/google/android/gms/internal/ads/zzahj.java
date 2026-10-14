package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzahj implements zzahp {
    private final zzabj zza;
    private final zzabi zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzahj(zzabj zzabjVar, zzabi zzabiVar) {
        this.zza = zzabjVar;
        this.zzb = zzabiVar;
    }

    public final void zza(long j10) {
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final long zzd(zzaax zzaaxVar) {
        long j10 = this.zzd;
        if (j10 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j10 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final zzabv zze() {
        zzdy.zzf(this.zzc != -1);
        return new zzabh(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final void zzg(long j10) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfj.zzc(jArr, j10, true, true)];
    }
}
