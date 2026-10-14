package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghc {

    @Deprecated
    public static final zzglt zza;

    @Deprecated
    public static final zzglt zzb;

    @Deprecated
    public static final zzglt zzc;

    static {
        new zzggq();
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
        zzghh.zze();
        zzggi.zzd();
        zzggq.zzh(true);
        if (zzgdi.zzb()) {
            return;
        }
        zzgfu.zzm(true);
    }
}
