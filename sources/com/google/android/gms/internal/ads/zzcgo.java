package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgo {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgo(int i10, int i11, int i12) {
        this.zzc = i10;
        this.zzb = i11;
        this.zza = i12;
    }

    public static zzcgo zza() {
        return new zzcgo(0, 0, 0);
    }

    public static zzcgo zzb(int i10, int i11) {
        return new zzcgo(1, i10, i11);
    }

    public static zzcgo zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        if (zzqVar.zzd) {
            return new zzcgo(3, 0, 0);
        }
        if (zzqVar.zzi) {
            return new zzcgo(2, 0, 0);
        }
        return zzqVar.zzh ? zza() : zzb(zzqVar.zzf, zzqVar.zzc);
    }

    public static zzcgo zzd() {
        return new zzcgo(5, 0, 0);
    }

    public static zzcgo zze() {
        return new zzcgo(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
