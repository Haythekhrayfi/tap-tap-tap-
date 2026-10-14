package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfzr extends zzgdt {
    public final /* synthetic */ zzfzs zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzr(zzfzs zzfzsVar, Class cls) {
        super(cls);
        this.zza = zzfzsVar;
    }

    public static final zzgin zzf(zzgiq zzgiqVar) throws GeneralSecurityException {
        zzgim zzgimVarZzc = zzgin.zzc();
        zzgimVarZzc.zzb(zzgiqVar.zzg());
        byte[] bArrZza = zzgng.zza(zzgiqVar.zza());
        zzgimVarZzc.zza(zzgoe.zzv(bArrZza, 0, bArrZza.length));
        zzgimVarZzc.zzc(0);
        return (zzgin) zzgimVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ zzgqw zza(zzgqw zzgqwVar) throws GeneralSecurityException {
        return zzf((zzgiq) zzgqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* synthetic */ zzgqw zzb(zzgoe zzgoeVar) throws zzgpy {
        return zzgiq.zzf(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzd(zzgiq zzgiqVar) throws GeneralSecurityException {
        zzgni.zza(zzgiqVar.zza());
        zzfzs zzfzsVar = this.zza;
        zzfzs.zzm(zzgiqVar.zzg());
    }
}
