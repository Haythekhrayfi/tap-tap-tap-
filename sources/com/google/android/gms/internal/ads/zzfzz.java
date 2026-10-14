package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfzz extends zzgdu {
    public zzfzz() {
        super(zzgiw.class, new zzfzx(zzfxh.class));
    }

    public static /* bridge */ /* synthetic */ zzgds zzg(int i10, int i11, int i12) {
        zzgiy zzgiyVarZzc = zzgiz.zzc();
        zzgiyVarZzc.zza(i10);
        zzgjb zzgjbVarZzc = zzgjc.zzc();
        zzgjbVarZzc.zza(16);
        zzgiyVarZzc.zzb((zzgjc) zzgjbVarZzc.zzal());
        return new zzgds((zzgiz) zzgiyVarZzc.zzal(), i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final zzgdt zza() {
        return new zzfzy(this, zzgiz.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final zzgkj zzb() {
        return zzgkj.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final /* synthetic */ zzgqw zzc(zzgoe zzgoeVar) throws zzgpy {
        return zzgiw.zze(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final /* bridge */ /* synthetic */ void zze(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgiw zzgiwVar = (zzgiw) zzgqwVar;
        zzgni.zzb(zzgiwVar.zza(), 0);
        zzgni.zza(zzgiwVar.zzg().zzd());
        if (zzgiwVar.zzf().zza() != 12 && zzgiwVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
