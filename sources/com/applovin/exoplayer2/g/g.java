package com.applovin.exoplayer2.g;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements b {
    @Override // com.applovin.exoplayer2.g.b
    public final a a(d dVar) {
        ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(dVar.f4752b);
        com.applovin.exoplayer2.l.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.b()) {
            return null;
        }
        return a(dVar, byteBuffer);
    }

    public abstract a a(d dVar, ByteBuffer byteBuffer);
}
