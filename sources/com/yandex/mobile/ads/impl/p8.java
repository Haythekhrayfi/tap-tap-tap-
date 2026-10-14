package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class p8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f24004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f24005c;

    public p8(String str, byte[] bArr, byte[] bArr2) {
        this.f24003a = str;
        this.f24004b = bArr;
        this.f24005c = bArr2;
    }

    @SuppressLint({"TrulyRandom"})
    public final byte[] a(byte[] bArr) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f24004b, "AES");
        Cipher cipher = Cipher.getInstance(this.f24003a);
        cipher.init(1, secretKeySpec, new IvParameterSpec(this.f24005c));
        return cipher.doFinal(bArr);
    }
}
