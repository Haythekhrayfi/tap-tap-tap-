package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgcz {
    public int[] zza;
    private final int zzb;

    public zzgcz(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgcv.zzd(bArr);
        this.zzb = i10;
    }

    public abstract int zza();

    public abstract int[] zzb(int[] iArr, int i10);

    public final ByteBuffer zzc(byte[] bArr, int i10) {
        int[] iArrZzb = zzb(zzgcv.zzd(bArr), i10);
        int[] iArr = (int[]) iArrZzb.clone();
        zzgcv.zzc(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            iArrZzb[i11] = iArrZzb[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzb, 0, 16);
        return byteBufferOrder;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zza()) {
            throw new GeneralSecurityException(android.support.v4.media.a.a("The nonce length (in bytes) must be ", zza()));
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining / 64;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i11 >= i12) {
                return byteBufferAllocate.array();
            }
            ByteBuffer byteBufferZzc = zzc(bArr, this.zzb + i11);
            if (i11 == i12 - 1) {
                zzgmg.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, iRemaining % 64);
            } else {
                zzgmg.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, 64);
            }
            i11++;
        }
    }
}
