package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzth extends zztc {
    public static final Object zzd = new Object();
    private final Object zze;
    private final Object zzf;

    private zzth(zzcw zzcwVar, Object obj, Object obj2) {
        super(zzcwVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzth zzq(zzbp zzbpVar) {
        return new zzth(new zzti(zzbpVar), zzcv.zza, zzd);
    }

    public static zzth zzr(zzcw zzcwVar, Object obj, Object obj2) {
        return new zzth(zzcwVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zztc, com.google.android.gms.internal.ads.zzcw
    public final int zza(Object obj) {
        Object obj2;
        zzcw zzcwVar = this.zzc;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return zzcwVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zztc, com.google.android.gms.internal.ads.zzcw
    public final zzct zzd(int i10, zzct zzctVar, boolean z10) {
        this.zzc.zzd(i10, zzctVar, z10);
        if (zzfj.zzC(zzctVar.zzc, this.zzf) && z10) {
            zzctVar.zzc = zzd;
        }
        return zzctVar;
    }

    @Override // com.google.android.gms.internal.ads.zztc, com.google.android.gms.internal.ads.zzcw
    public final zzcv zze(int i10, zzcv zzcvVar, long j10) {
        this.zzc.zze(i10, zzcvVar, j10);
        if (zzfj.zzC(zzcvVar.zzc, this.zze)) {
            zzcvVar.zzc = zzcv.zza;
        }
        return zzcvVar;
    }

    @Override // com.google.android.gms.internal.ads.zztc, com.google.android.gms.internal.ads.zzcw
    public final Object zzf(int i10) {
        Object objZzf = this.zzc.zzf(i10);
        return zzfj.zzC(objZzf, this.zzf) ? zzd : objZzf;
    }

    public final zzth zzp(zzcw zzcwVar) {
        return new zzth(zzcwVar, this.zze, this.zzf);
    }
}
