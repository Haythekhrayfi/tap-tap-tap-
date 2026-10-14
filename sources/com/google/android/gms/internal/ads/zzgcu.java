package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgcu {
    public static final /* synthetic */ int zza = 0;
    private static final zzgnk zzb;
    private static final zzgeo zzc;
    private static final zzgek zzd;
    private static final zzgdr zze;
    private static final zzgdn zzf;

    static {
        zzgnk zzgnkVarZza = zzgfm.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzgnkVarZza;
        zzc = zzgeo.zzb(new zzgem() { // from class: com.google.android.gms.internal.ads.zzgcq
            @Override // com.google.android.gms.internal.ads.zzgem
            public final zzgfd zza(zzfyf zzfyfVar) throws GeneralSecurityException {
                zzglq zzglqVar;
                int i10 = zzgcu.zza;
                zzgko zzgkoVarZza = zzgkp.zza();
                zzgkoVarZza.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                zzgkoVarZza.zzc(zzglz.zzc().zzau());
                zzgco zzgcoVarZza = ((zzgcp) zzfyfVar).zza();
                if (zzgco.zza.equals(zzgcoVarZza)) {
                    zzglqVar = zzglq.TINK;
                } else if (zzgco.zzb.equals(zzgcoVarZza)) {
                    zzglqVar = zzglq.CRUNCHY;
                } else {
                    if (!zzgco.zzc.equals(zzgcoVarZza)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgcoVarZza.toString()));
                    }
                    zzglqVar = zzglq.RAW;
                }
                zzgkoVarZza.zza(zzglqVar);
                return zzgfb.zza((zzgkp) zzgkoVarZza.zzal());
            }
        }, zzgcp.class, zzgfb.class);
        zzd = zzgek.zzb(new zzgei() { // from class: com.google.android.gms.internal.ads.zzgcr
            @Override // com.google.android.gms.internal.ads.zzgei
            public final zzfyf zza(zzgfd zzgfdVar) {
                return zzgcu.zzb((zzgfb) zzgfdVar);
            }
        }, zzgnkVarZza, zzgfb.class);
        zze = zzgdr.zza(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzgcs
        }, zzgck.class, zzgfa.class);
        zzf = zzgdn.zzb(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzgct
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final zzfxn zza(zzgfd zzgfdVar, zzfyq zzfyqVar) {
                return zzgcu.zza((zzgfa) zzgfdVar, zzfyqVar);
            }
        }, zzgnkVarZza, zzgfa.class);
    }

    public static /* synthetic */ zzgck zza(zzgfa zzgfaVar, zzfyq zzfyqVar) throws GeneralSecurityException {
        if (!zzgfaVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            zzglw zzglwVarZze = zzglw.zze(zzgfaVar.zze(), zzgoy.zza());
            if (zzglwVarZze.zza() == 0) {
                return zzgck.zza(zzd(zzgfaVar.zzc()), zzgnl.zzb(zzglwVarZze.zzf().zzA(), zzfyqVar), zzgfaVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgpy unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzgcp zzb(zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgfbVar.zzb().zzh().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters: ".concat(String.valueOf(zzgfbVar.zzb().zzh())));
        }
        try {
            zzglz.zzd(zzgfbVar.zzb().zzg(), zzgoy.zza());
            return zzgcp.zzb(zzd(zzgfbVar.zzb().zzf()));
        } catch (zzgpy e10) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
        }
    }

    public static void zzc(zzgeg zzgegVar) throws GeneralSecurityException {
        zzgegVar.zzh(zzc);
        zzgegVar.zzg(zzd);
        zzgegVar.zzf(zze);
        zzgegVar.zze(zzf);
    }

    private static zzgco zzd(zzglq zzglqVar) throws GeneralSecurityException {
        zzglq zzglqVar2 = zzglq.UNKNOWN_PREFIX;
        int iOrdinal = zzglqVar.ordinal();
        if (iOrdinal == 1) {
            return zzgco.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgco.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(android.support.v4.media.a.a("Unable to parse OutputPrefixType: ", zzglqVar.zza()));
            }
        }
        return zzgco.zzb;
    }
}
