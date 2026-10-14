package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxh {
    public final int zza;
    public final zzll[] zzb;
    public final zzxa[] zzc;
    public final zzdh zzd;
    public final Object zze;

    public zzxh(zzll[] zzllVarArr, zzxa[] zzxaVarArr, zzdh zzdhVar, Object obj) {
        this.zzb = zzllVarArr;
        this.zzc = (zzxa[]) zzxaVarArr.clone();
        this.zzd = zzdhVar;
        this.zze = obj;
        this.zza = zzllVarArr.length;
    }

    public final boolean zza(zzxh zzxhVar, int i10) {
        return zzxhVar != null && zzfj.zzC(this.zzb[i10], zzxhVar.zzb[i10]) && zzfj.zzC(this.zzc[i10], zzxhVar.zzc[i10]);
    }

    public final boolean zzb(int i10) {
        return this.zzb[i10] != null;
    }
}
