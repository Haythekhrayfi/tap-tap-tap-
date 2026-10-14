package com.applovin.exoplayer2.i;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends com.applovin.exoplayer2.c.j<j, k, h> implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6943a;

    public d(String str) {
        super(new j[2], new k[2]);
        this.f6943a = str;
        a(1024);
    }

    public abstract f a(byte[] bArr, int i10, boolean z10) throws h;

    @Override // com.applovin.exoplayer2.c.j
    public final h a(j jVar, k kVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(jVar.f4752b);
            kVar.a(jVar.f4754d, a(byteBuffer.array(), byteBuffer.limit(), z10), jVar.f7132f);
            kVar.c(Integer.MIN_VALUE);
            return null;
        } catch (h e10) {
            return e10;
        }
    }

    @Override // com.applovin.exoplayer2.i.g
    public void a(long j10) {
    }

    @Override // com.applovin.exoplayer2.c.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h a(Throwable th) {
        return new h("Unexpected decode error", th);
    }

    @Override // com.applovin.exoplayer2.c.j
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final j g() {
        return new j();
    }

    @Override // com.applovin.exoplayer2.c.j
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final k h() {
        return new e(new d0.a(this));
    }
}
