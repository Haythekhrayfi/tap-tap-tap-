package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghj implements zzggf {
    private final zzgfq zza;

    public zzghj(zzgfq zzgfqVar) throws GeneralSecurityException {
        if (!zzgdh.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.zza = zzgfqVar;
    }
}
