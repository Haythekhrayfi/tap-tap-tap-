package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgge {
    public static final /* synthetic */ int zza = 0;
    private static final zzgnk zzb;
    private static final zzgeo zzc;
    private static final zzgek zzd;
    private static final zzgdr zze;
    private static final zzgdn zzf;

    static {
        zzgnk zzgnkVarZza = zzgfm.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzgnkVarZza;
        zzc = zzgeo.zzb(new zzgem() { // from class: com.google.android.gms.internal.ads.zzgga
            @Override // com.google.android.gms.internal.ads.zzgem
            public final zzgfd zza(zzfyf zzfyfVar) throws GeneralSecurityException {
                zzglq zzglqVar;
                zzgfz zzgfzVar = (zzgfz) zzfyfVar;
                int i10 = zzgge.zza;
                zzgko zzgkoVarZza = zzgkp.zza();
                zzgkoVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
                zzgia zzgiaVarZzc = zzgib.zzc();
                zzgid zzgidVarZzc = zzgie.zzc();
                zzgidVarZzc.zza(zzgfzVar.zza());
                zzgiaVarZzc.zzb((zzgie) zzgidVarZzc.zzal());
                zzgiaVarZzc.zza(zzgfzVar.zzb());
                zzgkoVarZza.zzc(((zzgib) zzgiaVarZzc.zzal()).zzau());
                zzgfx zzgfxVarZzd = zzgfzVar.zzd();
                if (zzgfx.zza.equals(zzgfxVarZzd)) {
                    zzglqVar = zzglq.TINK;
                } else if (zzgfx.zzb.equals(zzgfxVarZzd)) {
                    zzglqVar = zzglq.CRUNCHY;
                } else if (zzgfx.zzd.equals(zzgfxVarZzd)) {
                    zzglqVar = zzglq.RAW;
                } else {
                    if (!zzgfx.zzc.equals(zzgfxVarZzd)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgfxVarZzd)));
                    }
                    zzglqVar = zzglq.LEGACY;
                }
                zzgkoVarZza.zza(zzglqVar);
                return zzgfb.zza((zzgkp) zzgkoVarZza.zzal());
            }
        }, zzgfz.class, zzgfb.class);
        zzd = zzgek.zzb(new zzgei() { // from class: com.google.android.gms.internal.ads.zzggb
            @Override // com.google.android.gms.internal.ads.zzgei
            public final zzfyf zza(zzgfd zzgfdVar) {
                return zzgge.zzb((zzgfb) zzgfdVar);
            }
        }, zzgnkVarZza, zzgfb.class);
        zze = zzgdr.zza(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzggc
        }, zzgfq.class, zzgfa.class);
        zzf = zzgdn.zzb(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzggd
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final zzfxn zza(zzgfd zzgfdVar, zzfyq zzfyqVar) {
                return zzgge.zza((zzgfa) zzgfdVar, zzfyqVar);
            }
        }, zzgnkVarZza, zzgfa.class);
    }

    public static /* synthetic */ zzgfq zza(zzgfa zzgfaVar, zzfyq zzfyqVar) throws GeneralSecurityException {
        if (!zzgfaVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            zzghy zzghyVarZze = zzghy.zze(zzgfaVar.zze(), zzgoy.zza());
            if (zzghyVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgfw zzgfwVar = new zzgfw(null);
            zzgfwVar.zza(zzghyVarZze.zzg().zzd());
            zzgfwVar.zzb(zzghyVarZze.zzf().zza());
            zzgfwVar.zzc(zzd(zzgfaVar.zzc()));
            zzgfz zzgfzVarZzd = zzgfwVar.zzd();
            zzgfo zzgfoVar = new zzgfo(null);
            zzgfoVar.zzc(zzgfzVarZzd);
            zzgfoVar.zza(zzgnl.zzb(zzghyVarZze.zzg().zzA(), zzfyqVar));
            zzgfoVar.zzb(zzgfaVar.zzf());
            return zzgfoVar.zzd();
        } catch (zzgpy | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzgfz zzb(zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgfbVar.zzb().zzh().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters: ".concat(String.valueOf(zzgfbVar.zzb().zzh())));
        }
        try {
            zzgib zzgibVarZze = zzgib.zze(zzgfbVar.zzb().zzg(), zzgoy.zza());
            zzgfw zzgfwVar = new zzgfw(null);
            zzgfwVar.zza(zzgibVarZze.zza());
            zzgfwVar.zzb(zzgibVarZze.zzf().zza());
            zzgfwVar.zzc(zzd(zzgfbVar.zzb().zzf()));
            return zzgfwVar.zzd();
        } catch (zzgpy e10) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
        }
    }

    public static void zzc(zzgeg zzgegVar) throws GeneralSecurityException {
        zzgegVar.zzh(zzc);
        zzgegVar.zzg(zzd);
        zzgegVar.zzf(zze);
        zzgegVar.zze(zzf);
    }

    private static zzgfx zzd(zzglq zzglqVar) throws GeneralSecurityException {
        zzglq zzglqVar2 = zzglq.UNKNOWN_PREFIX;
        int iOrdinal = zzglqVar.ordinal();
        if (iOrdinal == 1) {
            return zzgfx.zza;
        }
        if (iOrdinal == 2) {
            return zzgfx.zzc;
        }
        if (iOrdinal == 3) {
            return zzgfx.zzd;
        }
        if (iOrdinal == 4) {
            return zzgfx.zzb;
        }
        throw new GeneralSecurityException(android.support.v4.media.a.a("Unable to parse OutputPrefixType: ", zzglqVar.zza()));
    }
}
