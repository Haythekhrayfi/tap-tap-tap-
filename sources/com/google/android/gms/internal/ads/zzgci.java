package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgci extends zzgdt {
    public final /* synthetic */ zzgcj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgci(zzgcj zzgcjVar, Class cls) {
        super(cls);
        this.zza = zzgcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ zzgqw zza(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzglk zzglkVarZzc = zzgll.zzc();
        zzglkVarZzc.zza((zzglo) zzgqwVar);
        zzglkVarZzc.zzb(0);
        return (zzgll) zzglkVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* synthetic */ zzgqw zzb(zzgoe zzgoeVar) throws zzgpy {
        return zzglo.zze(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdt
    public final /* bridge */ /* synthetic */ void zzd(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzglo zzgloVar = (zzglo) zzgqwVar;
        if (zzgloVar.zzf().isEmpty() || !zzgloVar.zzg()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
