package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1618en {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f16081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f16082c;

    public C1618en(String str, byte[] bArr, byte[] bArr2) {
        this.f16080a = str;
        this.f16081b = bArr;
        this.f16082c = bArr2;
    }

    @SuppressLint({"TrulyRandom"})
    public byte[] a(byte[] bArr) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f16081b, "AES");
        Cipher cipher = Cipher.getInstance(this.f16080a);
        cipher.init(1, secretKeySpec, new IvParameterSpec(this.f16082c));
        return cipher.doFinal(bArr);
    }

    public byte[] a(byte[] bArr, int i10, int i11) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f16081b, "AES");
        Cipher cipher = Cipher.getInstance(this.f16080a);
        cipher.init(2, secretKeySpec, new IvParameterSpec(this.f16082c));
        return cipher.doFinal(bArr, i10, i11);
    }
}
