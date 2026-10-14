package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzbw {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzbw(zzbw zzbwVar) {
        this.zza = zzbwVar.zza;
        this.zzb = zzbwVar.zzb;
        this.zzc = zzbwVar.zzc;
        this.zzd = zzbwVar.zzd;
        this.zze = zzbwVar.zze;
    }

    public zzbw(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    private zzbw(Object obj, int i10, int i11, long j10, int i12) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = i12;
    }

    public zzbw(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public zzbw(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbw)) {
            return false;
        }
        zzbw zzbwVar = (zzbw) obj;
        return this.zza.equals(zzbwVar.zza) && this.zzb == zzbwVar.zzb && this.zzc == zzbwVar.zzc && this.zzd == zzbwVar.zzd && this.zze == zzbwVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzbw zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzbw(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }
}
