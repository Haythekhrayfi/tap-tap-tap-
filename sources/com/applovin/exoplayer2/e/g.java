package com.applovin.exoplayer2.e;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f5467a = new byte[4096];

    @Override // com.applovin.exoplayer2.e.x
    public int a(com.applovin.exoplayer2.k.g gVar, int i10, boolean z10, int i11) throws IOException {
        int iA = gVar.a(this.f5467a, 0, Math.min(this.f5467a.length, i10));
        if (iA != -1) {
            return iA;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.applovin.exoplayer2.e.x
    public void a(long j10, int i10, int i11, int i12, x.a aVar) {
    }

    @Override // com.applovin.exoplayer2.e.x
    public void a(com.applovin.exoplayer2.l.y yVar, int i10, int i11) {
        yVar.e(i10);
    }

    @Override // com.applovin.exoplayer2.e.x
    public void a(com.applovin.exoplayer2.v vVar) {
    }
}
