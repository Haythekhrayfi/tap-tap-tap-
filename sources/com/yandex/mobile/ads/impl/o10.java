package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class o10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mp0 f23670a = new mp0(10);

    public final Metadata a(xn xnVar, n10.a aVar) throws IOException {
        Metadata metadataA = null;
        int i10 = 0;
        while (true) {
            try {
                xnVar.b(this.f23670a.c(), 0, 10, false);
                this.f23670a.e(0);
                if (this.f23670a.w() != 4801587) {
                    break;
                }
                this.f23670a.f(3);
                int iS = this.f23670a.s();
                int i11 = iS + 10;
                if (metadataA == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f23670a.c(), 0, bArr, 0, 10);
                    xnVar.b(bArr, 10, iS, false);
                    metadataA = new n10(aVar).a(i11, bArr);
                } else {
                    xnVar.a(false, iS);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        xnVar.c();
        xnVar.a(false, i10);
        return metadataA;
    }
}
