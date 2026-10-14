package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class t31 implements zb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f25242c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f25243d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private zb.a f25244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zb.a f25245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private zb.a f25246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private zb.a f25247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s31 f25249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ByteBuffer f25250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ShortBuffer f25251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ByteBuffer f25252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f25253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f25254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f25255p;

    public t31() {
        zb.a aVar = zb.a.f27270e;
        this.f25244e = aVar;
        this.f25245f = aVar;
        this.f25246g = aVar;
        this.f25247h = aVar;
        ByteBuffer byteBuffer = zb.f27269a;
        this.f25250k = byteBuffer;
        this.f25251l = byteBuffer.asShortBuffer();
        this.f25252m = byteBuffer;
        this.f25241b = -1;
    }

    public final long a(long j10) {
        if (this.f25254o < 1024) {
            return (long) (((double) this.f25242c) * j10);
        }
        long j11 = this.f25253n;
        s31 s31Var = this.f25249j;
        Objects.requireNonNull(s31Var);
        long jC = j11 - ((long) s31Var.c());
        int i10 = this.f25247h.f27271a;
        int i11 = this.f25246g.f27271a;
        return i10 == i11 ? da1.a(j10, jC, this.f25254o) : da1.a(j10, jC * ((long) i10), this.f25254o * ((long) i11));
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final zb.a a(zb.a aVar) throws zb.b {
        if (aVar.f27273c != 2) {
            throw new zb.b(aVar);
        }
        int i10 = this.f25241b;
        if (i10 == -1) {
            i10 = aVar.f27271a;
        }
        this.f25244e = aVar;
        zb.a aVar2 = new zb.a(i10, aVar.f27272b, 2);
        this.f25245f = aVar2;
        this.f25248i = true;
        return aVar2;
    }

    public final void a(float f10) {
        if (this.f25243d != f10) {
            this.f25243d = f10;
            this.f25248i = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            s31 s31Var = this.f25249j;
            Objects.requireNonNull(s31Var);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f25253n += (long) iRemaining;
            s31Var.b(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final boolean a() {
        s31 s31Var;
        return this.f25255p && ((s31Var = this.f25249j) == null || s31Var.b() == 0);
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final ByteBuffer b() {
        int iB;
        s31 s31Var = this.f25249j;
        if (s31Var != null && (iB = s31Var.b()) > 0) {
            if (this.f25250k.capacity() < iB) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iB).order(ByteOrder.nativeOrder());
                this.f25250k = byteBufferOrder;
                this.f25251l = byteBufferOrder.asShortBuffer();
            } else {
                this.f25250k.clear();
                this.f25251l.clear();
            }
            s31Var.a(this.f25251l);
            this.f25254o += (long) iB;
            this.f25250k.limit(iB);
            this.f25252m = this.f25250k;
        }
        ByteBuffer byteBuffer = this.f25252m;
        this.f25252m = zb.f27269a;
        return byteBuffer;
    }

    public final void b(float f10) {
        if (this.f25242c != f10) {
            this.f25242c = f10;
            this.f25248i = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final void c() {
        s31 s31Var = this.f25249j;
        if (s31Var != null) {
            s31Var.e();
        }
        this.f25255p = true;
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final boolean d() {
        return this.f25245f.f27271a != -1 && (Math.abs(this.f25242c - 1.0f) >= 1.0E-4f || Math.abs(this.f25243d - 1.0f) >= 1.0E-4f || this.f25245f.f27271a != this.f25244e.f27271a);
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final void flush() {
        if (d()) {
            zb.a aVar = this.f25244e;
            this.f25246g = aVar;
            zb.a aVar2 = this.f25245f;
            this.f25247h = aVar2;
            if (this.f25248i) {
                this.f25249j = new s31(aVar.f27271a, aVar.f27272b, this.f25242c, this.f25243d, aVar2.f27271a);
            } else {
                s31 s31Var = this.f25249j;
                if (s31Var != null) {
                    s31Var.a();
                }
            }
        }
        this.f25252m = zb.f27269a;
        this.f25253n = 0L;
        this.f25254o = 0L;
        this.f25255p = false;
    }

    @Override // com.yandex.mobile.ads.impl.zb
    public final void reset() {
        this.f25242c = 1.0f;
        this.f25243d = 1.0f;
        zb.a aVar = zb.a.f27270e;
        this.f25244e = aVar;
        this.f25245f = aVar;
        this.f25246g = aVar;
        this.f25247h = aVar;
        ByteBuffer byteBuffer = zb.f27269a;
        this.f25250k = byteBuffer;
        this.f25251l = byteBuffer.asShortBuffer();
        this.f25252m = byteBuffer;
        this.f25241b = -1;
        this.f25248i = false;
        this.f25249j = null;
        this.f25253n = 0L;
        this.f25254o = 0L;
        this.f25255p = false;
    }
}
