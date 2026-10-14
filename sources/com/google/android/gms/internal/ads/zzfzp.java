package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfzp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgnk zzb;
    private static final zzgeo zzc;
    private static final zzgek zzd;
    private static final zzgdr zze;
    private static final zzgdn zzf;

    static {
        zzgnk zzgnkVarZza = zzgfm.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzgnkVarZza;
        zzc = zzgeo.zzb(new zzgem() { // from class: com.google.android.gms.internal.ads.zzfzl
            @Override // com.google.android.gms.internal.ads.zzgem
            public final zzgfd zza(zzfyf zzfyfVar) throws GeneralSecurityException {
                int i10;
                zzglq zzglqVar;
                zzfzk zzfzkVar = (zzfzk) zzfyfVar;
                int i11 = zzfzp.zza;
                zzgko zzgkoVarZza = zzgkp.zza();
                zzgkoVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                zzgij zzgijVarZza = zzgik.zza();
                zzgip zzgipVarZzc = zzgiq.zzc();
                zzgis zzgisVarZzc = zzgit.zzc();
                zzgisVarZzc.zza(zzfzkVar.zzc());
                zzgipVarZzc.zzb((zzgit) zzgisVarZzc.zzal());
                zzgipVarZzc.zza(zzfzkVar.zza());
                zzgijVarZza.zza((zzgiq) zzgipVarZzc.zzal());
                zzgkb zzgkbVarZzd = zzgkc.zzd();
                zzgke zzgkeVarZzc = zzgkf.zzc();
                zzgkeVarZzc.zza(zzfzkVar.zzd());
                zzfzh zzfzhVarZze = zzfzkVar.zze();
                if (zzfzh.zza.equals(zzfzhVarZze)) {
                    i10 = 3;
                } else if (zzfzh.zzb.equals(zzfzhVarZze)) {
                    i10 = 7;
                } else if (zzfzh.zzc.equals(zzfzhVarZze)) {
                    i10 = 5;
                } else if (zzfzh.zzd.equals(zzfzhVarZze)) {
                    i10 = 4;
                } else {
                    if (!zzfzh.zze.equals(zzfzhVarZze)) {
                        throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzfzhVarZze)));
                    }
                    i10 = 6;
                }
                zzgkeVarZzc.zzb(i10);
                zzgkbVarZzd.zzb((zzgkf) zzgkeVarZzc.zzal());
                zzgkbVarZzd.zza(zzfzkVar.zzb());
                zzgijVarZza.zzb((zzgkc) zzgkbVarZzd.zzal());
                zzgkoVarZza.zzc(((zzgik) zzgijVarZza.zzal()).zzau());
                zzfzi zzfziVarZzf = zzfzkVar.zzf();
                if (zzfzi.zza.equals(zzfziVarZzf)) {
                    zzglqVar = zzglq.TINK;
                } else if (zzfzi.zzb.equals(zzfziVarZzf)) {
                    zzglqVar = zzglq.CRUNCHY;
                } else {
                    if (!zzfzi.zzc.equals(zzfziVarZzf)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzfziVarZzf)));
                    }
                    zzglqVar = zzglq.RAW;
                }
                zzgkoVarZza.zza(zzglqVar);
                return zzgfb.zza((zzgkp) zzgkoVarZza.zzal());
            }
        }, zzfzk.class, zzgfb.class);
        zzd = zzgek.zzb(new zzgei() { // from class: com.google.android.gms.internal.ads.zzfzm
            @Override // com.google.android.gms.internal.ads.zzgei
            public final zzfyf zza(zzgfd zzgfdVar) {
                return zzfzp.zzb((zzgfb) zzgfdVar);
            }
        }, zzgnkVarZza, zzgfb.class);
        zze = zzgdr.zza(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfzn
        }, zzfzb.class, zzgfa.class);
        zzf = zzgdn.zzb(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfzo
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final zzfxn zza(zzgfd zzgfdVar, zzfyq zzfyqVar) {
                return zzfzp.zza((zzgfa) zzgfdVar, zzfyqVar);
            }
        }, zzgnkVarZza, zzgfa.class);
    }

    public static /* synthetic */ zzfzb zza(zzgfa zzgfaVar, zzfyq zzfyqVar) throws GeneralSecurityException {
        if (!zzgfaVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzgih zzgihVarZze = zzgih.zze(zzgfaVar.zze(), zzgoy.zza());
            if (zzgihVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzfzg zzfzgVar = new zzfzg(null);
            zzfzgVar.zza(zzgihVarZze.zzf().zzh().zzd());
            zzfzgVar.zzc(zzgihVarZze.zzg().zzh().zzd());
            zzfzgVar.zzd(zzgihVarZze.zzf().zzg().zza());
            zzfzgVar.zze(zzgihVarZze.zzg().zzg().zza());
            zzfzgVar.zzb(zze(zzgihVarZze.zzg().zzg().zzg()));
            zzfzgVar.zzf(zzd(zzgfaVar.zzc()));
            zzfzk zzfzkVarZzg = zzfzgVar.zzg();
            zzfyz zzfyzVar = new zzfyz(null);
            zzfyzVar.zzd(zzfzkVarZzg);
            zzfyzVar.zza(zzgnl.zzb(zzgihVarZze.zzf().zzh().zzA(), zzfyqVar));
            zzfyzVar.zzb(zzgnl.zzb(zzgihVarZze.zzg().zzh().zzA(), zzfyqVar));
            zzfyzVar.zzc(zzgfaVar.zzf());
            return zzfyzVar.zze();
        } catch (zzgpy unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzfzk zzb(zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgfbVar.zzb().zzh().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgfbVar.zzb().zzh())));
        }
        try {
            zzgik zzgikVarZzd = zzgik.zzd(zzgfbVar.zzb().zzg(), zzgoy.zza());
            zzfzg zzfzgVar = new zzfzg(null);
            zzfzgVar.zza(zzgikVarZzd.zze().zza());
            zzfzgVar.zzc(zzgikVarZzd.zzf().zza());
            zzfzgVar.zzd(zzgikVarZzd.zze().zzg().zza());
            zzfzgVar.zze(zzgikVarZzd.zzf().zzh().zza());
            zzfzgVar.zzb(zze(zzgikVarZzd.zzf().zzh().zzg()));
            zzfzgVar.zzf(zzd(zzgfbVar.zzb().zzf()));
            return zzfzgVar.zzg();
        } catch (zzgpy e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }

    public static void zzc(zzgeg zzgegVar) throws GeneralSecurityException {
        zzgegVar.zzh(zzc);
        zzgegVar.zzg(zzd);
        zzgegVar.zzf(zze);
        zzgegVar.zze(zzf);
    }

    private static zzfzi zzd(zzglq zzglqVar) throws GeneralSecurityException {
        zzglq zzglqVar2 = zzglq.UNKNOWN_PREFIX;
        int iOrdinal = zzglqVar.ordinal();
        if (iOrdinal == 1) {
            return zzfzi.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzfzi.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(android.support.v4.media.a.a("Unable to parse OutputPrefixType: ", zzglqVar.zza()));
            }
        }
        return zzfzi.zzb;
    }

    private static zzfzh zze(int i10) throws GeneralSecurityException {
        zzglq zzglqVar = zzglq.UNKNOWN_PREFIX;
        int i11 = i10 - 2;
        if (i11 == 1) {
            return zzfzh.zza;
        }
        if (i11 == 2) {
            return zzfzh.zzd;
        }
        if (i11 == 3) {
            return zzfzh.zzc;
        }
        if (i11 == 4) {
            return zzfzh.zze;
        }
        if (i11 == 5) {
            return zzfzh.zzb;
        }
        throw new GeneralSecurityException(android.support.v4.media.a.a("Unable to parse HashType: ", zzgjw.zza(i10)));
    }
}
