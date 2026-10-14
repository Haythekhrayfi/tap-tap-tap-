package com.applovin.exoplayer2.f;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class d extends com.applovin.exoplayer2.c.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f6216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6218h;

    public d() {
        super(2);
        this.f6218h = 32;
    }

    private boolean b(com.applovin.exoplayer2.c.g gVar) {
        ByteBuffer byteBuffer;
        if (!l()) {
            return true;
        }
        if (this.f6217g >= this.f6218h || gVar.b() != b()) {
            return false;
        }
        ByteBuffer byteBuffer2 = gVar.f4752b;
        if (byteBuffer2 != null && (byteBuffer = this.f4752b) != null) {
            if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                return false;
            }
        }
        return true;
    }

    @Override // com.applovin.exoplayer2.c.g, com.applovin.exoplayer2.c.a
    public void a() {
        super.a();
        this.f6217g = 0;
    }

    public boolean a(com.applovin.exoplayer2.c.g gVar) {
        com.applovin.exoplayer2.l.a.a(!gVar.g());
        com.applovin.exoplayer2.l.a.a(!gVar.e());
        com.applovin.exoplayer2.l.a.a(!gVar.c());
        if (!b(gVar)) {
            return false;
        }
        int i10 = this.f6217g;
        this.f6217g = i10 + 1;
        if (i10 == 0) {
            this.f4754d = gVar.f4754d;
            if (gVar.d()) {
                a_(1);
            }
        }
        if (gVar.b()) {
            a_(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = gVar.f4752b;
        if (byteBuffer != null) {
            f(byteBuffer.remaining());
            this.f4752b.put(byteBuffer);
        }
        this.f6216f = gVar.f4754d;
        return true;
    }

    public void g(int i10) {
        com.applovin.exoplayer2.l.a.a(i10 > 0);
        this.f6218h = i10;
    }

    public long i() {
        return this.f4754d;
    }

    public long j() {
        return this.f6216f;
    }

    public int k() {
        return this.f6217g;
    }

    public boolean l() {
        return this.f6217g > 0;
    }
}
