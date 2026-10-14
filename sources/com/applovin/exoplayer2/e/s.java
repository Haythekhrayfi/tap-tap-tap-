package com.applovin.exoplayer2.e;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f6129a = new com.applovin.exoplayer2.l.y(10);

    public com.applovin.exoplayer2.g.a a(i iVar, com.applovin.exoplayer2.g.e.g.a aVar) throws IOException {
        com.applovin.exoplayer2.g.a aVarA = null;
        int i10 = 0;
        while (true) {
            try {
                iVar.d(this.f6129a.d(), 0, 10);
                this.f6129a.d(0);
                if (this.f6129a.m() != 4801587) {
                    break;
                }
                this.f6129a.e(3);
                int iV = this.f6129a.v();
                int i11 = iV + 10;
                if (aVarA == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f6129a.d(), 0, bArr, 0, 10);
                    iVar.d(bArr, 10, iV);
                    aVarA = new com.applovin.exoplayer2.g.e.g(aVar).a(bArr, i11);
                } else {
                    iVar.c(iV);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        iVar.a();
        iVar.c(i10);
        return aVarA;
    }
}
