package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgcg implements zzfxh {
    private static final byte[] zza = new byte[0];
    private final zzgkp zzb;
    private final zzfxh zzc;

    public zzgcg(zzgkp zzgkpVar, zzfxh zzfxhVar) {
        this.zzb = zzgkpVar;
        this.zzc = zzfxhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrZza = this.zzc.zza(bArr3, zza);
            String strZzh = this.zzb.zzh();
            int i11 = zzfyp.zza;
            zzgoe zzgoeVar = zzgoe.zzb;
            return ((zzfxh) zzfyp.zzc(strZzh, zzgoe.zzv(bArrZza, 0, bArrZza.length), zzfxh.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }
}
