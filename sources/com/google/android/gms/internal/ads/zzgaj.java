package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgaj {
    public static final /* synthetic */ int zza = 0;
    private static final zzgnk zzb;
    private static final zzgeo zzc;
    private static final zzgek zzd;
    private static final zzgdr zze;
    private static final zzgdn zzf;

    static {
        zzgnk zzgnkVarZza = zzgfm.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzgnkVarZza;
        zzc = zzgeo.zzb(new zzgem() { // from class: com.google.android.gms.internal.ads.zzgaf
            @Override // com.google.android.gms.internal.ads.zzgem
            public final zzgfd zza(zzfyf zzfyfVar) throws GeneralSecurityException {
                zzglq zzglqVar;
                zzgae zzgaeVar = (zzgae) zzfyfVar;
                int i10 = zzgaj.zza;
                zzgko zzgkoVarZza = zzgkp.zza();
                zzgkoVarZza.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
                zzgiy zzgiyVarZzc = zzgiz.zzc();
                zzgjb zzgjbVarZzc = zzgjc.zzc();
                zzgjbVarZzc.zza(zzgaeVar.zza());
                zzgiyVarZzc.zzb((zzgjc) zzgjbVarZzc.zzal());
                zzgiyVarZzc.zza(zzgaeVar.zzb());
                zzgkoVarZza.zzc(((zzgiz) zzgiyVarZzc.zzal()).zzau());
                zzgac zzgacVarZzc = zzgaeVar.zzc();
                if (zzgac.zza.equals(zzgacVarZzc)) {
                    zzglqVar = zzglq.TINK;
                } else if (zzgac.zzb.equals(zzgacVarZzc)) {
                    zzglqVar = zzglq.CRUNCHY;
                } else {
                    if (!zzgac.zzc.equals(zzgacVarZzc)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgacVarZzc)));
                    }
                    zzglqVar = zzglq.RAW;
                }
                zzgkoVarZza.zza(zzglqVar);
                return zzgfb.zza((zzgkp) zzgkoVarZza.zzal());
            }
        }, zzgae.class, zzgfb.class);
        zzd = zzgek.zzb(new zzgei() { // from class: com.google.android.gms.internal.ads.zzgag
            @Override // com.google.android.gms.internal.ads.zzgei
            public final zzfyf zza(zzgfd zzgfdVar) {
                return zzgaj.zzb((zzgfb) zzgfdVar);
            }
        }, zzgnkVarZza, zzgfb.class);
        zze = zzgdr.zza(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzgah
        }, zzfzw.class, zzgfa.class);
        zzf = zzgdn.zzb(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzgai
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final zzfxn zza(zzgfd zzgfdVar, zzfyq zzfyqVar) {
                return zzgaj.zza((zzgfa) zzgfdVar, zzfyqVar);
            }
        }, zzgnkVarZza, zzgfa.class);
    }

    public static /* synthetic */ zzfzw zza(zzgfa zzgfaVar, zzfyq zzfyqVar) throws GeneralSecurityException {
        if (!zzgfaVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            zzgiw zzgiwVarZze = zzgiw.zze(zzgfaVar.zze(), zzgoy.zza());
            if (zzgiwVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgab zzgabVar = new zzgab(null);
            zzgabVar.zzb(zzgiwVarZze.zzg().zzd());
            zzgabVar.zza(zzgiwVarZze.zzf().zza());
            zzgabVar.zzc(16);
            zzgabVar.zzd(zzd(zzgfaVar.zzc()));
            zzgae zzgaeVarZze = zzgabVar.zze();
            zzfzu zzfzuVar = new zzfzu(null);
            zzfzuVar.zzc(zzgaeVarZze);
            zzfzuVar.zzb(zzgnl.zzb(zzgiwVarZze.zzg().zzA(), zzfyqVar));
            zzfzuVar.zza(zzgfaVar.zzf());
            return zzfzuVar.zzd();
        } catch (zzgpy unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzgae zzb(zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgfbVar.zzb().zzh().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters: ".concat(String.valueOf(zzgfbVar.zzb().zzh())));
        }
        try {
            zzgiz zzgizVarZze = zzgiz.zze(zzgfbVar.zzb().zzg(), zzgoy.zza());
            zzgab zzgabVar = new zzgab(null);
            zzgabVar.zzb(zzgizVarZze.zza());
            zzgabVar.zza(zzgizVarZze.zzf().zza());
            zzgabVar.zzc(16);
            zzgabVar.zzd(zzd(zzgfbVar.zzb().zzf()));
            return zzgabVar.zze();
        } catch (zzgpy e10) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
        }
    }

    public static void zzc(zzgeg zzgegVar) throws GeneralSecurityException {
        zzgegVar.zzh(zzc);
        zzgegVar.zzg(zzd);
        zzgegVar.zzf(zze);
        zzgegVar.zze(zzf);
    }

    private static zzgac zzd(zzglq zzglqVar) throws GeneralSecurityException {
        zzglq zzglqVar2 = zzglq.UNKNOWN_PREFIX;
        int iOrdinal = zzglqVar.ordinal();
        if (iOrdinal == 1) {
            return zzgac.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgac.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(android.support.v4.media.a.a("Unable to parse OutputPrefixType: ", zzglqVar.zza()));
            }
        }
        return zzgac.zzb;
    }
}
