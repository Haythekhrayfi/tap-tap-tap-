package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgaq extends zzgdu {
    public zzgaq() {
        super(zzgjf.class, new zzgao(zzfxh.class));
    }

    public static /* bridge */ /* synthetic */ zzgds zzg(int i10, int i11) {
        zzgjh zzgjhVarZzc = zzgji.zzc();
        zzgjhVarZzc.zza(i10);
        return new zzgds((zzgji) zzgjhVarZzc.zzal(), i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final zzgdt zza() {
        return new zzgap(this, zzgji.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final zzgkj zzb() {
        return zzgkj.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final /* synthetic */ zzgqw zzc(zzgoe zzgoeVar) throws zzgpy {
        return zzgjf.zze(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final /* bridge */ /* synthetic */ void zze(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgjf zzgjfVar = (zzgjf) zzgqwVar;
        zzgni.zzb(zzgjfVar.zza(), 0);
        zzgni.zza(zzgjfVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final int zzf() {
        return 2;
    }
}
