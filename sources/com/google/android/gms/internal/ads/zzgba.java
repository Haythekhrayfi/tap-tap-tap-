package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgba {
    public static final /* synthetic */ int zza = 0;
    private static final zzgnk zzb;
    private static final zzgeo zzc;
    private static final zzgek zzd;
    private static final zzgdr zze;
    private static final zzgdn zzf;

    static {
        zzgnk zzgnkVarZza = zzgfm.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzgnkVarZza;
        zzc = zzgeo.zzb(new zzgem() { // from class: com.google.android.gms.internal.ads.zzgaw
            @Override // com.google.android.gms.internal.ads.zzgem
            public final zzgfd zza(zzfyf zzfyfVar) throws GeneralSecurityException {
                zzglq zzglqVar;
                zzgav zzgavVar = (zzgav) zzfyfVar;
                int i10 = zzgba.zza;
                zzgko zzgkoVarZza = zzgkp.zza();
                zzgkoVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
                zzgjh zzgjhVarZzc = zzgji.zzc();
                zzgjhVarZzc.zza(zzgavVar.zza());
                zzgkoVarZza.zzc(((zzgji) zzgjhVarZzc.zzal()).zzau());
                zzgat zzgatVarZzb = zzgavVar.zzb();
                if (zzgat.zza.equals(zzgatVarZzb)) {
                    zzglqVar = zzglq.TINK;
                } else if (zzgat.zzb.equals(zzgatVarZzb)) {
                    zzglqVar = zzglq.CRUNCHY;
                } else {
                    if (!zzgat.zzc.equals(zzgatVarZzb)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgatVarZzb)));
                    }
                    zzglqVar = zzglq.RAW;
                }
                zzgkoVarZza.zza(zzglqVar);
                return zzgfb.zza((zzgkp) zzgkoVarZza.zzal());
            }
        }, zzgav.class, zzgfb.class);
        zzd = zzgek.zzb(new zzgei() { // from class: com.google.android.gms.internal.ads.zzgax
            @Override // com.google.android.gms.internal.ads.zzgei
            public final zzfyf zza(zzgfd zzgfdVar) {
                return zzgba.zzb((zzgfb) zzgfdVar);
            }
        }, zzgnkVarZza, zzgfb.class);
        zze = zzgdr.zza(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzgay
        }, zzgan.class, zzgfa.class);
        zzf = zzgdn.zzb(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzgaz
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final zzfxn zza(zzgfd zzgfdVar, zzfyq zzfyqVar) {
                return zzgba.zza((zzgfa) zzgfdVar, zzfyqVar);
            }
        }, zzgnkVarZza, zzgfa.class);
    }

    public static /* synthetic */ zzgan zza(zzgfa zzgfaVar, zzfyq zzfyqVar) throws GeneralSecurityException {
        if (!zzgfaVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            zzgjf zzgjfVarZze = zzgjf.zze(zzgfaVar.zze(), zzgoy.zza());
            if (zzgjfVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgas zzgasVar = new zzgas(null);
            zzgasVar.zzb(zzgjfVarZze.zzf().zzd());
            zzgasVar.zza(12);
            zzgasVar.zzc(16);
            zzgasVar.zzd(zzd(zzgfaVar.zzc()));
            zzgav zzgavVarZze = zzgasVar.zze();
            zzgal zzgalVar = new zzgal(null);
            zzgalVar.zzc(zzgavVarZze);
            zzgalVar.zzb(zzgnl.zzb(zzgjfVarZze.zzf().zzA(), zzfyqVar));
            zzgalVar.zza(zzgfaVar.zzf());
            return zzgalVar.zzd();
        } catch (zzgpy unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzgav zzb(zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgfbVar.zzb().zzh().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters: ".concat(String.valueOf(zzgfbVar.zzb().zzh())));
        }
        try {
            zzgji zzgjiVarZze = zzgji.zze(zzgfbVar.zzb().zzg(), zzgoy.zza());
            zzgas zzgasVar = new zzgas(null);
            zzgasVar.zzb(zzgjiVarZze.zza());
            zzgasVar.zza(12);
            zzgasVar.zzc(16);
            zzgasVar.zzd(zzd(zzgfbVar.zzb().zzf()));
            return zzgasVar.zze();
        } catch (zzgpy e10) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
        }
    }

    public static void zzc(zzgeg zzgegVar) throws GeneralSecurityException {
        zzgegVar.zzh(zzc);
        zzgegVar.zzg(zzd);
        zzgegVar.zzf(zze);
        zzgegVar.zze(zzf);
    }

    private static zzgat zzd(zzglq zzglqVar) throws GeneralSecurityException {
        zzglq zzglqVar2 = zzglq.UNKNOWN_PREFIX;
        int iOrdinal = zzglqVar.ordinal();
        if (iOrdinal == 1) {
            return zzgat.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgat.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(android.support.v4.media.a.a("Unable to parse OutputPrefixType: ", zzglqVar.zza()));
            }
        }
        return zzgat.zzb;
    }
}
