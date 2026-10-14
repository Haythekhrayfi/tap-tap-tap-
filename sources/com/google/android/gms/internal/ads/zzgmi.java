package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgmi implements zzfxh {
    private final zzgna zza;
    private final zzfye zzb;
    private final int zzc;

    public zzgmi(zzgna zzgnaVar, zzfye zzfyeVar, int i10) {
        this.zza = zzgnaVar;
        this.zzb = zzfyeVar;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.zzc;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, length - i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length - this.zzc, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.zzb.zza(bArrCopyOfRange2, zzgmg.zzb(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.zza.zza(bArrCopyOfRange);
    }
}
