package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgcc {
    public static final /* synthetic */ int zza = 0;
    private static final zzgnk zzb;
    private static final zzgeo zzc;
    private static final zzgek zzd;
    private static final zzgdr zze;
    private static final zzgdn zzf;

    static {
        zzgnk zzgnkVarZza = zzgfm.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzgnkVarZza;
        zzc = zzgeo.zzb(new zzgem() { // from class: com.google.android.gms.internal.ads.zzgby
            @Override // com.google.android.gms.internal.ads.zzgem
            public final zzgfd zza(zzfyf zzfyfVar) throws GeneralSecurityException {
                zzglq zzglqVar;
                int i10 = zzgcc.zza;
                zzgko zzgkoVarZza = zzgkp.zza();
                zzgkoVarZza.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                zzgkoVarZza.zzc(zzgju.zzc().zzau());
                zzgbw zzgbwVarZza = ((zzgbx) zzfyfVar).zza();
                if (zzgbw.zza.equals(zzgbwVarZza)) {
                    zzglqVar = zzglq.TINK;
                } else if (zzgbw.zzb.equals(zzgbwVarZza)) {
                    zzglqVar = zzglq.CRUNCHY;
                } else {
                    if (!zzgbw.zzc.equals(zzgbwVarZza)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgbwVarZza.toString()));
                    }
                    zzglqVar = zzglq.RAW;
                }
                zzgkoVarZza.zza(zzglqVar);
                return zzgfb.zza((zzgkp) zzgkoVarZza.zzal());
            }
        }, zzgbx.class, zzgfb.class);
        zzd = zzgek.zzb(new zzgei() { // from class: com.google.android.gms.internal.ads.zzgbz
            @Override // com.google.android.gms.internal.ads.zzgei
            public final zzfyf zza(zzgfd zzgfdVar) {
                return zzgcc.zzb((zzgfb) zzgfdVar);
            }
        }, zzgnkVarZza, zzgfb.class);
        zze = zzgdr.zza(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzgca
        }, zzgbs.class, zzgfa.class);
        zzf = zzgdn.zzb(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzgcb
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final zzfxn zza(zzgfd zzgfdVar, zzfyq zzfyqVar) {
                return zzgcc.zza((zzgfa) zzgfdVar, zzfyqVar);
            }
        }, zzgnkVarZza, zzgfa.class);
    }

    public static /* synthetic */ zzgbs zza(zzgfa zzgfaVar, zzfyq zzfyqVar) throws GeneralSecurityException {
        if (!zzgfaVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            zzgjr zzgjrVarZze = zzgjr.zze(zzgfaVar.zze(), zzgoy.zza());
            if (zzgjrVarZze.zza() == 0) {
                return zzgbs.zza(zzd(zzgfaVar.zzc()), zzgnl.zzb(zzgjrVarZze.zzf().zzA(), zzfyqVar), zzgfaVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgpy unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzgbx zzb(zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgfbVar.zzb().zzh().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters: ".concat(String.valueOf(zzgfbVar.zzb().zzh())));
        }
        try {
            zzgju.zzd(zzgfbVar.zzb().zzg(), zzgoy.zza());
            return zzgbx.zzb(zzd(zzgfbVar.zzb().zzf()));
        } catch (zzgpy e10) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
        }
    }

    public static void zzc(zzgeg zzgegVar) throws GeneralSecurityException {
        zzgegVar.zzh(zzc);
        zzgegVar.zzg(zzd);
        zzgegVar.zzf(zze);
        zzgegVar.zze(zzf);
    }

    private static zzgbw zzd(zzglq zzglqVar) throws GeneralSecurityException {
        zzglq zzglqVar2 = zzglq.UNKNOWN_PREFIX;
        int iOrdinal = zzglqVar.ordinal();
        if (iOrdinal == 1) {
            return zzgbw.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgbw.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(android.support.v4.media.a.a("Unable to parse OutputPrefixType: ", zzglqVar.zza()));
            }
        }
        return zzgbw.zzb;
    }
}
