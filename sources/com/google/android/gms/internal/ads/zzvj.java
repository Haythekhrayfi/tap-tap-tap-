package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvj extends zzcw {
    private static final Object zzc = new Object();
    private static final zzbp zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    private final zzbp zzh;
    private final zzbf zzi;

    static {
        zzar zzarVar = new zzar();
        zzarVar.zza("SinglePeriodTimeline");
        zzarVar.zzb(Uri.EMPTY);
        zzd = zzarVar.zzc();
    }

    public zzvj(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, zzbp zzbpVar, zzbf zzbfVar) {
        this.zze = j13;
        this.zzf = j14;
        this.zzg = z10;
        this.zzh = zzbpVar;
        this.zzi = zzbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zza(Object obj) {
        return zzc.equals(obj) ? 0 : -1;
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
        zzdy.zza(i10, 0, 1);
        zzctVar.zzl(null, z10 ? zzc : null, 0, this.zze, 0L, zzd.zza, false);
        return zzctVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final zzcv zze(int i10, zzcv zzcvVar, long j10) {
        zzdy.zza(i10, 0, 1);
        zzcvVar.zza(zzcv.zza, this.zzh, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, this.zzi, 0L, this.zzf, 0, 0, 0L);
        return zzcvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final Object zzf(int i10) {
        zzdy.zza(i10, 0, 1);
        return zzc;
    }
}
