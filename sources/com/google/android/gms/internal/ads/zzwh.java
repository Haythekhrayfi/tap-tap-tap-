package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzwh implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzwh(zzam zzamVar, int i10) {
        this.zza = 1 == (zzamVar.zze & 1);
        this.zzb = zzwy.zzn(i10, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzwh zzwhVar) {
        return zzfrr.zzj().zzd(this.zzb, zzwhVar.zzb).zzd(this.zza, zzwhVar.zza).zza();
    }
}
