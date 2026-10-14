package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfys {

    @Deprecated
    public static final zzglt zza;

    @Deprecated
    public static final zzglt zzb;

    @Deprecated
    public static final zzglt zzc;

    static {
        new zzfze();
        new zzgaq();
        new zzgbh();
        new zzfzz();
        new zzgcf();
        new zzgcj();
        new zzgbv();
        new zzgcn();
        zzglt zzgltVarZzc = zzglt.zzc();
        zza = zzgltVarZzc;
        zzb = zzgltVarZzc;
        zzc = zzgltVarZzc;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfyx.zze();
        zzghc.zza();
        zzfyp.zze(new zzfze(), true);
        int i10 = zzfzp.zza;
        zzfzp.zzc(zzgeg.zzc());
        zzfyp.zze(new zzgaq(), true);
        int i11 = zzgba.zza;
        zzgba.zzc(zzgeg.zzc());
        if (zzgdi.zzb()) {
            return;
        }
        zzfyp.zze(new zzfzz(), true);
        int i12 = zzgaj.zza;
        zzgaj.zzc(zzgeg.zzc());
        zzgbh.zzg(true);
        zzfyp.zze(new zzgbv(), true);
        int i13 = zzgcc.zza;
        zzgcc.zzc(zzgeg.zzc());
        zzfyp.zze(new zzgcf(), true);
        zzfyp.zze(new zzgcj(), true);
        zzfyp.zze(new zzgcn(), true);
        int i14 = zzgcu.zza;
        zzgcu.zzc(zzgeg.zzc());
    }
}
