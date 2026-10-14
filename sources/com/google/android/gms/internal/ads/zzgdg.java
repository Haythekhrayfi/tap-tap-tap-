package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgdg implements zzfxh {
    private static final ThreadLocal zza = new zzgdf();
    private static final boolean zzb;
    private final SecretKey zzc;

    static {
        boolean z10;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        zzb = z10;
    }

    public zzgdg(byte[] bArr) throws GeneralSecurityException {
        zzgni.zza(bArr.length);
        this.zzc = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (zzb) {
            ivParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        } else {
            if (!zzgnh.zza()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ivParameterSpec = new IvParameterSpec(bArr, 0, 12);
        }
        ThreadLocal threadLocal = zza;
        ((Cipher) threadLocal.get()).init(2, this.zzc, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr, 12, length - 12);
    }
}
