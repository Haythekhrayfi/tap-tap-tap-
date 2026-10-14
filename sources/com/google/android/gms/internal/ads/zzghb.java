package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzghb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgnk zzb;
    private static final zzgeo zzc;
    private static final zzgek zzd;
    private static final zzgdr zze;
    private static final zzgdn zzf;

    static {
        zzgnk zzgnkVarZza = zzgfm.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzgnkVarZza;
        zzc = zzgeo.zzb(new zzgem() { // from class: com.google.android.gms.internal.ads.zzggx
            @Override // com.google.android.gms.internal.ads.zzgem
            public final zzgfd zza(zzfyf zzfyfVar) throws GeneralSecurityException {
                int i10;
                zzglq zzglqVar;
                zzggw zzggwVar = (zzggw) zzfyfVar;
                int i11 = zzghb.zza;
                zzgko zzgkoVarZza = zzgkp.zza();
                zzgkoVarZza.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
                zzgkb zzgkbVarZzd = zzgkc.zzd();
                zzgke zzgkeVarZzc = zzgkf.zzc();
                zzgkeVarZzc.zza(zzggwVar.zza());
                zzggt zzggtVarZzd = zzggwVar.zzd();
                if (zzggt.zza.equals(zzggtVarZzd)) {
                    i10 = 3;
                } else if (zzggt.zzb.equals(zzggtVarZzd)) {
                    i10 = 7;
                } else if (zzggt.zzc.equals(zzggtVarZzd)) {
                    i10 = 5;
                } else if (zzggt.zzd.equals(zzggtVarZzd)) {
                    i10 = 4;
                } else {
                    if (!zzggt.zze.equals(zzggtVarZzd)) {
                        throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzggtVarZzd)));
                    }
                    i10 = 6;
                }
                zzgkeVarZzc.zzb(i10);
                zzgkbVarZzd.zzb((zzgkf) zzgkeVarZzc.zzal());
                zzgkbVarZzd.zza(zzggwVar.zzb());
                zzgkoVarZza.zzc(((zzgkc) zzgkbVarZzd.zzal()).zzau());
                zzggu zzgguVarZze = zzggwVar.zze();
                if (zzggu.zza.equals(zzgguVarZze)) {
                    zzglqVar = zzglq.TINK;
                } else if (zzggu.zzb.equals(zzgguVarZze)) {
                    zzglqVar = zzglq.CRUNCHY;
                } else if (zzggu.zzd.equals(zzgguVarZze)) {
                    zzglqVar = zzglq.RAW;
                } else {
                    if (!zzggu.zzc.equals(zzgguVarZze)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgguVarZze)));
                    }
                    zzglqVar = zzglq.LEGACY;
                }
                zzgkoVarZza.zza(zzglqVar);
                return zzgfb.zza((zzgkp) zzgkoVarZza.zzal());
            }
        }, zzggw.class, zzgfb.class);
        zzd = zzgek.zzb(new zzgei() { // from class: com.google.android.gms.internal.ads.zzggy
            @Override // com.google.android.gms.internal.ads.zzgei
            public final zzfyf zza(zzgfd zzgfdVar) {
                return zzghb.zzb((zzgfb) zzgfdVar);
            }
        }, zzgnkVarZza, zzgfb.class);
        zze = zzgdr.zza(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzggz
        }, zzggm.class, zzgfa.class);
        zzf = zzgdn.zzb(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzgha
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final zzfxn zza(zzgfd zzgfdVar, zzfyq zzfyqVar) {
                return zzghb.zza((zzgfa) zzgfdVar, zzfyqVar);
            }
        }, zzgnkVarZza, zzgfa.class);
    }

    public static /* synthetic */ zzggm zza(zzgfa zzgfaVar, zzfyq zzfyqVar) throws GeneralSecurityException {
        if (!zzgfaVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzgjz zzgjzVarZzf = zzgjz.zzf(zzgfaVar.zze(), zzgoy.zza());
            if (zzgjzVarZzf.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzggs zzggsVar = new zzggs(null);
            zzggsVar.zzb(zzgjzVarZzf.zzh().zzd());
            zzggsVar.zzc(zzgjzVarZzf.zzg().zza());
            zzggsVar.zza(zze(zzgjzVarZzf.zzg().zzg()));
            zzggsVar.zzd(zzd(zzgfaVar.zzc()));
            zzggw zzggwVarZze = zzggsVar.zze();
            zzggk zzggkVar = new zzggk(null);
            zzggkVar.zzc(zzggwVarZze);
            zzggkVar.zzb(zzgnl.zzb(zzgjzVarZzf.zzh().zzA(), zzfyqVar));
            zzggkVar.zza(zzgfaVar.zzf());
            return zzggkVar.zzd();
        } catch (zzgpy | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzggw zzb(zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgfbVar.zzb().zzh().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgfbVar.zzb().zzh())));
        }
        try {
            zzgkc zzgkcVarZzg = zzgkc.zzg(zzgfbVar.zzb().zzg(), zzgoy.zza());
            if (zzgkcVarZzg.zzc() != 0) {
                throw new GeneralSecurityException(android.support.v4.media.a.a("Parsing HmacParameters failed: unknown Version ", zzgkcVarZzg.zzc()));
            }
            zzggs zzggsVar = new zzggs(null);
            zzggsVar.zzb(zzgkcVarZzg.zza());
            zzggsVar.zzc(zzgkcVarZzg.zzh().zza());
            zzggsVar.zza(zze(zzgkcVarZzg.zzh().zzg()));
            zzggsVar.zzd(zzd(zzgfbVar.zzb().zzf()));
            return zzggsVar.zze();
        } catch (zzgpy e10) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
        }
    }

    public static void zzc(zzgeg zzgegVar) throws GeneralSecurityException {
        zzgegVar.zzh(zzc);
        zzgegVar.zzg(zzd);
        zzgegVar.zzf(zze);
        zzgegVar.zze(zzf);
    }

    private static zzggu zzd(zzglq zzglqVar) throws GeneralSecurityException {
        zzglq zzglqVar2 = zzglq.UNKNOWN_PREFIX;
        int iOrdinal = zzglqVar.ordinal();
        if (iOrdinal == 1) {
            return zzggu.zza;
        }
        if (iOrdinal == 2) {
            return zzggu.zzc;
        }
        if (iOrdinal == 3) {
            return zzggu.zzd;
        }
        if (iOrdinal == 4) {
            return zzggu.zzb;
        }
        throw new GeneralSecurityException(android.support.v4.media.a.a("Unable to parse OutputPrefixType: ", zzglqVar.zza()));
    }

    private static zzggt zze(int i10) throws GeneralSecurityException {
        zzglq zzglqVar = zzglq.UNKNOWN_PREFIX;
        int i11 = i10 - 2;
        if (i11 == 1) {
            return zzggt.zza;
        }
        if (i11 == 2) {
            return zzggt.zzd;
        }
        if (i11 == 3) {
            return zzggt.zzc;
        }
        if (i11 == 4) {
            return zzggt.zze;
        }
        if (i11 == 5) {
            return zzggt.zzb;
        }
        throw new GeneralSecurityException(android.support.v4.media.a.a("Unable to parse HashType: ", zzgjw.zza(i10)));
    }
}
