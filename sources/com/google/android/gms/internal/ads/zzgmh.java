package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgmh implements zzfxh {
    private final zzgda zza;

    public zzgmh(byte[] bArr) throws GeneralSecurityException {
        this.zza = new zzgda(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.zza.zzb(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }
}
