package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfze extends zzgdu {
    public zzfze() {
        super(zzgih.class, new zzfzc(zzfxh.class));
    }

    public static /* bridge */ /* synthetic */ zzgds zzg(int i10, int i11, int i12, int i13, int i14, int i15) {
        zzgip zzgipVarZzc = zzgiq.zzc();
        zzgis zzgisVarZzc = zzgit.zzc();
        zzgisVarZzc.zza(16);
        zzgipVarZzc.zzb((zzgit) zzgisVarZzc.zzal());
        zzgipVarZzc.zza(i10);
        zzgiq zzgiqVar = (zzgiq) zzgipVarZzc.zzal();
        zzgkb zzgkbVarZzd = zzgkc.zzd();
        zzgke zzgkeVarZzc = zzgkf.zzc();
        zzgkeVarZzc.zzb(5);
        zzgkeVarZzc.zza(i13);
        zzgkbVarZzd.zzb((zzgkf) zzgkeVarZzc.zzal());
        zzgkbVarZzd.zza(32);
        zzgkc zzgkcVar = (zzgkc) zzgkbVarZzd.zzal();
        zzgij zzgijVarZza = zzgik.zza();
        zzgijVarZza.zza(zzgiqVar);
        zzgijVarZza.zzb(zzgkcVar);
        return new zzgds((zzgik) zzgijVarZza.zzal(), i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final zzgdt zza() {
        return new zzfzd(this, zzgik.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final zzgkj zzb() {
        return zzgkj.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final /* synthetic */ zzgqw zzc(zzgoe zzgoeVar) throws zzgpy {
        return zzgih.zze(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final /* bridge */ /* synthetic */ void zze(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzgih zzgihVar = (zzgih) zzgqwVar;
        zzgni.zzb(zzgihVar.zza(), 0);
        new zzfzs();
        zzfzs.zzh(zzgihVar.zzf());
        new zzggq();
        zzggq.zzm(zzgihVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final int zzf() {
        return 2;
    }
}
