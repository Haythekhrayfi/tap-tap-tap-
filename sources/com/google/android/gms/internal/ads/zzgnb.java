package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgnb implements zzghv {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgnb(byte[] bArr) throws GeneralSecurityException {
        zzgni.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher cipherZzb = zzb();
        cipherZzb.init(1, secretKeySpec);
        byte[] bArrZza = zzghi.zza(cipherZzb.doFinal(new byte[16]));
        this.zzb = bArrZza;
        this.zzc = zzghi.zza(bArrZza);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzgdh.zza(1)) {
            return (Cipher) zzgmq.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] bArrZzc;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherZzb = zzb();
        cipherZzb.init(1, this.zza);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
        if (iMax * 16 == length) {
            bArrZzc = zzgmg.zzd(bArr, (iMax - 1) * 16, this.zzb, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            bArrZzc = zzgmg.zzc(bArrCopyOf, this.zzc);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i11 = 0; i11 < iMax - 1; i11++) {
            bArrDoFinal = cipherZzb.doFinal(zzgmg.zzd(bArrDoFinal, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(cipherZzb.doFinal(zzgmg.zzc(bArrZzc, bArrDoFinal)), i10);
    }
}
