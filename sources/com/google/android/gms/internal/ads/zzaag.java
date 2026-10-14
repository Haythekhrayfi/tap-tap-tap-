package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaag {
    public static final zzaag zza = new zzaag(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzaag(int i10, long j10, long j11) {
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzaag zzd(long j10, long j11) {
        return new zzaag(-1, j10, j11);
    }

    public static zzaag zze(long j10) {
        return new zzaag(0, -9223372036854775807L, j10);
    }

    public static zzaag zzf(long j10, long j11) {
        return new zzaag(-2, j10, j11);
    }
}
