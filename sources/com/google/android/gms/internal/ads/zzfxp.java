package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfxp implements zzfxo {
    private final zzgdu zza;
    private final Class zzb;

    public zzfxp(zzgdu zzgduVar, Class cls) {
        if (!zzgduVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzgduVar.toString(), cls.getName()));
        }
        this.zza = zzgduVar;
        this.zzb = cls;
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final zzgkk zza(zzgoe zzgoeVar) throws GeneralSecurityException {
        try {
            zzgdt zzgdtVarZza = this.zza.zza();
            zzgqw zzgqwVarZzb = zzgdtVarZza.zzb(zzgoeVar);
            zzgdtVarZza.zzd(zzgqwVarZzb);
            zzgqw zzgqwVarZza = zzgdtVarZza.zza(zzgqwVarZzb);
            zzgkh zzgkhVarZza = zzgkk.zza();
            zzgkhVarZza.zzb(this.zza.zzd());
            zzgkhVarZza.zzc(zzgqwVarZza.zzau());
            zzgkhVarZza.zza(this.zza.zzb());
            return (zzgkk) zzgkhVarZza.zzal();
        } catch (zzgpy e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final Object zzb(zzgoe zzgoeVar) throws GeneralSecurityException {
        try {
            zzgqw zzgqwVarZzc = this.zza.zzc(zzgoeVar);
            if (Void.class.equals(this.zzb)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            this.zza.zze(zzgqwVarZzc);
            return this.zza.zzk(zzgqwVarZzc, this.zzb);
        } catch (zzgpy e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzj().getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final String zzc() {
        return this.zza.zzd();
    }
}
