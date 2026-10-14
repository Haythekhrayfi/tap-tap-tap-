package com.google.android.gms.internal.ads;

import android.os.Build;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgcx {
    private static final ThreadLocal zza = new zzgcw();
    private final SecretKey zzb;

    public zzgcx(byte[] bArr, boolean z10) throws GeneralSecurityException {
        if (!zzgdh.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgni.zza(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        int length = bArr2.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        String property = System.getProperty("java.vendor");
        Integer numValueOf = null;
        if (property == "The Android Project" || (property != null && property.equals("The Android Project"))) {
            numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        }
        AlgorithmParameterSpec gCMParameterSpec = (numValueOf == null || numValueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
        ThreadLocal threadLocal = zza;
        ((Cipher) threadLocal.get()).init(2, this.zzb, gCMParameterSpec);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr2, 12, length - 12);
    }
}
