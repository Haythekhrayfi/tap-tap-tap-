package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
public final class ue0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25602b;

    public ue0(int i10, String str) {
        this(i10, str, 0);
    }

    private ue0(int i10, String str, int i11) {
        this.f25601a = str;
        this.f25602b = i10;
    }

    private byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, PublicKey publicKey) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            try {
                byteArrayOutputStream2.write(bArr2);
                byteArrayOutputStream2.write(bArr3);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                byteArrayOutputStream2.close();
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                p8 p8Var = new p8("AES/CBC/PKCS5Padding", bArr2, bArr3);
                cipher.init(1, publicKey);
                byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
                try {
                    byteArrayOutputStream.write(ByteBuffer.allocate(4).putInt(this.f25602b).array());
                    byteArrayOutputStream.write(cipher.doFinal(byteArray));
                    byteArrayOutputStream.write(p8Var.a(bArr));
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e10) {
                        x60.c("MixedEncryptor", e10);
                    }
                    return byteArray2;
                } catch (Throwable th) {
                    th = th;
                    try {
                        x60.c("MixedEncryptor", th);
                        if (byteArrayOutputStream != null) {
                            try {
                            } catch (IOException e11) {
                                x60.c("MixedEncryptor", e11);
                            }
                        }
                        return null;
                    } finally {
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e12) {
                                x60.c("MixedEncryptor", e12);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    @SuppressLint({"TrulyRandom"})
    public final byte[] a(byte[] bArr) {
        try {
            byte[] bArrDecode = Base64.decode(this.f25601a, 0);
            if (bArrDecode != null) {
                SecureRandom secureRandom = new SecureRandom();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                secureRandom.nextBytes(bArr2);
                return a(bArr, bArr3, bArr2, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode)));
            }
        } catch (NoSuchAlgorithmException e10) {
            x60.c("MixedEncryptor", e10);
        } catch (InvalidKeySpecException e11) {
            x60.c("MixedEncryptor", e11);
        }
        return null;
    }
}
