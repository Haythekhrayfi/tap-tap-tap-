package com.applovin.exoplayer2.c;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class g extends com.applovin.exoplayer2.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f4751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f4752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f4755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f4756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4757g;

    public static final class a extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4759b;

        public a(int i10, int i11) {
            super(j1.e.a("Buffer too small (", i10, " < ", i11, ")"));
            this.f4758a = i10;
            this.f4759b = i11;
        }
    }

    public g(int i10) {
        this(i10, 0);
    }

    public g(int i10, int i11) {
        this.f4751a = new c();
        this.f4756f = i10;
        this.f4757g = i11;
    }

    public static g f() {
        return new g(0);
    }

    private ByteBuffer g(int i10) {
        int i11 = this.f4756f;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f4752b;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @Override // com.applovin.exoplayer2.c.a
    public void a() {
        super.a();
        ByteBuffer byteBuffer = this.f4752b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f4755e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f4753c = false;
    }

    public void e(int i10) {
        ByteBuffer byteBuffer = this.f4755e;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f4755e = ByteBuffer.allocate(i10);
        } else {
            this.f4755e.clear();
        }
    }

    public void f(int i10) {
        int i11 = i10 + this.f4757g;
        ByteBuffer byteBuffer = this.f4752b;
        if (byteBuffer == null) {
            this.f4752b = g(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f4752b = byteBuffer;
            return;
        }
        ByteBuffer byteBufferG = g(i12);
        byteBufferG.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferG.put(byteBuffer);
        }
        this.f4752b = byteBufferG;
    }

    public final boolean g() {
        return d(1073741824);
    }

    public final void h() {
        ByteBuffer byteBuffer = this.f4752b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f4755e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
