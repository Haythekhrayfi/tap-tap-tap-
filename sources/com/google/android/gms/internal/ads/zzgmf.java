package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgmf implements zzfxh {
    private final zzgcx zza;

    public zzgmf(byte[] bArr) throws GeneralSecurityException {
        if (!zzgdh.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = new zzgcx(bArr, true);
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zza.zza(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
