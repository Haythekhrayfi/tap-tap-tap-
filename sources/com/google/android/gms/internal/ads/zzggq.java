package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzggq extends zzgdu {
    private static final zzges zza = zzges.zzb(new zzgeq() { // from class: com.google.android.gms.internal.ads.zzggn
        @Override // com.google.android.gms.internal.ads.zzgeq
        public final Object zza(zzfxn zzfxnVar) {
            return new zzghk((zzggm) zzfxnVar);
        }
    }, zzggm.class, zzggf.class);

    public zzggq() {
        super(zzgjz.class, new zzggo(zzfye.class));
    }

    public static void zzh(boolean z10) throws GeneralSecurityException {
        zzfyp.zze(new zzggq(), true);
        int i10 = zzghb.zza;
        zzghb.zzc(zzgeg.zzc());
        zzgee.zza().zze(zza);
    }

    public static final void zzm(zzgjz zzgjzVar) throws GeneralSecurityException {
        zzgni.zzb(zzgjzVar.zza(), 0);
        if (zzgjzVar.zzh().zzd() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzo(zzgjzVar.zzg());
    }

    public static /* bridge */ /* synthetic */ zzgds zzn(int i10, int i11, int i12, int i13) {
        zzgkb zzgkbVarZzd = zzgkc.zzd();
        zzgke zzgkeVarZzc = zzgkf.zzc();
        zzgkeVarZzc.zzb(i12);
        zzgkeVarZzc.zza(i11);
        zzgkbVarZzd.zzb((zzgkf) zzgkeVarZzc.zzal());
        zzgkbVarZzd.zza(i10);
        return new zzgds((zzgkc) zzgkbVarZzd.zzal(), i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzo(zzgkf zzgkfVar) throws GeneralSecurityException {
        if (zzgkfVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iZzg = zzgkfVar.zzg() - 2;
        if (iZzg == 1) {
            if (zzgkfVar.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iZzg == 2) {
            if (zzgkfVar.zza() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iZzg == 3) {
            if (zzgkfVar.zza() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iZzg == 4) {
            if (zzgkfVar.zza() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iZzg != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (zzgkfVar.zza() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final zzgdt zza() {
        return new zzggp(this, zzgkc.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final zzgkj zzb() {
        return zzgkj.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final /* synthetic */ zzgqw zzc(zzgoe zzgoeVar) throws zzgpy {
        return zzgjz.zzf(zzgoeVar, zzgoy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final /* bridge */ /* synthetic */ void zze(zzgqw zzgqwVar) throws GeneralSecurityException {
        zzm((zzgjz) zzgqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final int zzf() {
        return 2;
    }
}
