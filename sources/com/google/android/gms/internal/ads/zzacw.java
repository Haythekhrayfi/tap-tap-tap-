package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzacw extends zzaai {
    public zzacw(final zzabj zzabjVar, int i10, long j10, long j11) {
        long j12;
        zzaaf zzaafVar = new zzaaf() { // from class: com.google.android.gms.internal.ads.zzact
            @Override // com.google.android.gms.internal.ads.zzaaf
            public final long zza(long j13) {
                return zzabjVar.zzb(j13);
            }
        };
        zzacv zzacvVar = new zzacv(zzabjVar, i10, null);
        long jZza = zzabjVar.zza();
        long j13 = zzabjVar.zzj;
        int i11 = zzabjVar.zzd;
        if (i11 > 0) {
            j12 = ((((long) i11) + ((long) zzabjVar.zzc)) / 2) + 1;
        } else {
            int i12 = zzabjVar.zza;
            long j14 = 4096;
            if (i12 == zzabjVar.zzb && i12 > 0) {
                j14 = i12;
            }
            j12 = (((j14 * ((long) zzabjVar.zzg)) * ((long) zzabjVar.zzh)) / 8) + 64;
        }
        super(zzaafVar, zzacvVar, jZza, 0L, j13, j10, j11, j12, Math.max(6, zzabjVar.zzc));
    }
}
