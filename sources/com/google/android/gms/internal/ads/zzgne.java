package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgne implements zzfye {
    private final zzghv zza;
    private final int zzb;

    public zzgne(zzghv zzghvVar, int i10) throws GeneralSecurityException {
        this.zza = zzghvVar;
        this.zzb = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzghvVar.zza(new byte[0], i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(this.zza.zza(bArr2, this.zzb), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
