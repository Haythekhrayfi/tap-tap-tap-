package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfu extends zzgdu {
    private static final zzges zza = zzges.zzb(new zzgeq() { // from class: com.google.android.gms.internal.ads.zzgfr
        @Override // com.google.android.gms.internal.ads.zzgeq
        public final Object zza(zzfxn zzfxnVar) {
            return new zzghj((zzgfq) zzfxnVar);
        }
    }, zzgfq.class, zzggf.class);

    public zzgfu() {
        super(zzghy.class, new zzgfs(zzfye.class));
    }

    public static void zzm(boolean z10) throws GeneralSecurityException {
        zzfyp.zze(new zzgfu(), true);
        int i10 = zzgge.zza;
        zzgge.zzc(zzgeg.zzc());
        zzgee.zza().zze(zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzgie zzgieVar) throws GeneralSecurityException {
        if (zzgieVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzgieVar.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzo(int i10) throws GeneralSecurityException {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final zzgdt zza() {
        return new zzgft(this, zzgib.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final zzgkj zzb() {
        return zzgkj.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final /* synthetic */ zzgqw zzc(zzgoe zzgoeVar) throws zzgpy {
        return zzghy.zze(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final /* bridge */ /* synthetic */ void zze(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzghy zzghyVar = (zzghy) zzgqwVar;
        zzgni.zzb(zzghyVar.zza(), 0);
        zzo(zzghyVar.zzg().zzd());
        zzn(zzghyVar.zzf());
    }
}
