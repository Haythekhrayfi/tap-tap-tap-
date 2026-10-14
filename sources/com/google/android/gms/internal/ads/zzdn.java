package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdn {
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;
    public static final zzdn zza = new zzdn(0, 0, 0, 1.0f);
    private static final String zzg = Integer.toString(0, 36);
    private static final String zzh = Integer.toString(1, 36);
    private static final String zzi = Integer.toString(2, 36);
    private static final String zzj = Integer.toString(3, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzdm
    };

    public zzdn(int i10, int i11, int i12, float f10) {
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdn) {
            zzdn zzdnVar = (zzdn) obj;
            if (this.zzc == zzdnVar.zzc && this.zzd == zzdnVar.zzd && this.zze == zzdnVar.zze && this.zzf == zzdnVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zzc + 217) * 31) + this.zzd) * 31) + this.zze) * 31) + Float.floatToRawIntBits(this.zzf);
    }
}
