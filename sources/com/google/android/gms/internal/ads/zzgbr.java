package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgbr {
    public static final /* synthetic */ int zza = 0;
    private static final zzgnk zzb;
    private static final zzgeo zzc;
    private static final zzgek zzd;
    private static final zzgdr zze;
    private static final zzgdn zzf;

    static {
        zzgnk zzgnkVarZza = zzgfm.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzgnkVarZza;
        zzc = zzgeo.zzb(new zzgem() { // from class: com.google.android.gms.internal.ads.zzgbn
            @Override // com.google.android.gms.internal.ads.zzgem
            public final zzgfd zza(zzfyf zzfyfVar) throws GeneralSecurityException {
                zzglq zzglqVar;
                zzgbm zzgbmVar = (zzgbm) zzfyfVar;
                int i10 = zzgbr.zza;
                zzgko zzgkoVarZza = zzgkp.zza();
                zzgkoVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                zzgjn zzgjnVarZzc = zzgjo.zzc();
                zzgjnVarZzc.zza(zzgbmVar.zza());
                zzgkoVarZza.zzc(((zzgjo) zzgjnVarZzc.zzal()).zzau());
                zzgbk zzgbkVarZzb = zzgbmVar.zzb();
                if (zzgbk.zza.equals(zzgbkVarZzb)) {
                    zzglqVar = zzglq.TINK;
                } else if (zzgbk.zzb.equals(zzgbkVarZzb)) {
                    zzglqVar = zzglq.CRUNCHY;
                } else {
                    if (!zzgbk.zzc.equals(zzgbkVarZzb)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgbkVarZzb)));
                    }
                    zzglqVar = zzglq.RAW;
                }
                zzgkoVarZza.zza(zzglqVar);
                return zzgfb.zza((zzgkp) zzgkoVarZza.zzal());
            }
        }, zzgbm.class, zzgfb.class);
        zzd = zzgek.zzb(new zzgei() { // from class: com.google.android.gms.internal.ads.zzgbo
            @Override // com.google.android.gms.internal.ads.zzgei
            public final zzfyf zza(zzgfd zzgfdVar) {
                return zzgbr.zzb((zzgfb) zzgfdVar);
            }
        }, zzgnkVarZza, zzgfb.class);
        zze = zzgdr.zza(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzgbp
        }, zzgbe.class, zzgfa.class);
        zzf = zzgdn.zzb(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzgbq
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final zzfxn zza(zzgfd zzgfdVar, zzfyq zzfyqVar) {
                return zzgbr.zza((zzgfa) zzgfdVar, zzfyqVar);
            }
        }, zzgnkVarZza, zzgfa.class);
    }

    public static /* synthetic */ zzgbe zza(zzgfa zzgfaVar, zzfyq zzfyqVar) throws GeneralSecurityException {
        if (!zzgfaVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
        try {
            zzgjl zzgjlVarZze = zzgjl.zze(zzgfaVar.zze(), zzgoy.zza());
            if (zzgjlVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgbj zzgbjVar = new zzgbj(null);
            zzgbjVar.zza(zzgjlVarZze.zzf().zzd());
            zzgbjVar.zzb(zzd(zzgfaVar.zzc()));
            zzgbm zzgbmVarZzc = zzgbjVar.zzc();
            zzgbc zzgbcVar = new zzgbc(null);
            zzgbcVar.zzc(zzgbmVarZzc);
            zzgbcVar.zzb(zzgnl.zzb(zzgjlVarZze.zzf().zzA(), zzfyqVar));
            zzgbcVar.zza(zzgfaVar.zzf());
            return zzgbcVar.zzd();
        } catch (zzgpy unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzgbm zzb(zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgfbVar.zzb().zzh().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters: ".concat(String.valueOf(zzgfbVar.zzb().zzh())));
        }
        try {
            zzgjo zzgjoVarZze = zzgjo.zze(zzgfbVar.zzb().zzg(), zzgoy.zza());
            zzgbj zzgbjVar = new zzgbj(null);
            zzgbjVar.zza(zzgjoVarZze.zza());
            zzgbjVar.zzb(zzd(zzgfbVar.zzb().zzf()));
            return zzgbjVar.zzc();
        } catch (zzgpy e10) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
        }
    }

    public static void zzc(zzgeg zzgegVar) throws GeneralSecurityException {
        zzgegVar.zzh(zzc);
        zzgegVar.zzg(zzd);
        zzgegVar.zzf(zze);
        zzgegVar.zze(zzf);
    }

    private static zzgbk zzd(zzglq zzglqVar) throws GeneralSecurityException {
        zzglq zzglqVar2 = zzglq.UNKNOWN_PREFIX;
        int iOrdinal = zzglqVar.ordinal();
        if (iOrdinal == 1) {
            return zzgbk.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgbk.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(android.support.v4.media.a.a("Unable to parse OutputPrefixType: ", zzglqVar.zza()));
            }
        }
        return zzgbk.zzb;
    }
}
