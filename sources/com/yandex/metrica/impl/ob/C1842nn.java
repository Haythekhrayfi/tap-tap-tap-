package com.yandex.metrica.impl.ob;

import android.util.Base64;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1842nn implements InterfaceC1767kn {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1767kn
    public C1742jn a(C1744k0 c1744k0) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1767kn
    public byte[] a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }
}
