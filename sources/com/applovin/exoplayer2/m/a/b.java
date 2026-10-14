package com.applovin.exoplayer2.m.a;

import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.p;
import com.applovin.exoplayer2.v;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.applovin.exoplayer2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.c.g f7712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f7713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f7715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7716e;

    public b() {
        super(6);
        this.f7712a = new com.applovin.exoplayer2.c.g(1);
        this.f7713b = new y();
    }

    private void B() {
        a aVar = this.f7715d;
        if (aVar != null) {
            aVar.a();
        }
    }

    private float[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f7713b.a(byteBuffer.array(), byteBuffer.limit());
        this.f7713b.d(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f7713b.r());
        }
        return fArr;
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean A() {
        return g();
    }

    @Override // com.applovin.exoplayer2.as
    public int a(v vVar) {
        return as.b("application/x-camera-motion".equals(vVar.f8198l) ? 4 : 0);
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.ao.b
    public void a(int i10, Object obj) throws p {
        if (i10 == 8) {
            this.f7715d = (a) obj;
        } else {
            super.a(i10, obj);
        }
    }

    @Override // com.applovin.exoplayer2.ar
    public void a(long j10, long j11) {
        while (!g() && this.f7716e < 100000 + j10) {
            this.f7712a.a();
            if (a(t(), this.f7712a, 0) != -4 || this.f7712a.c()) {
                return;
            }
            com.applovin.exoplayer2.c.g gVar = this.f7712a;
            this.f7716e = gVar.f4754d;
            if (this.f7715d != null && !gVar.b()) {
                this.f7712a.h();
                float[] fArrA = a((ByteBuffer) ai.a(this.f7712a.f4752b));
                if (fArrA != null) {
                    ((a) ai.a(this.f7715d)).a(this.f7716e - this.f7714c, fArrA);
                }
            }
        }
    }

    @Override // com.applovin.exoplayer2.e
    public void a(long j10, boolean z10) {
        this.f7716e = Long.MIN_VALUE;
        B();
    }

    @Override // com.applovin.exoplayer2.e
    public void a(v[] vVarArr, long j10, long j11) {
        this.f7714c = j11;
    }

    @Override // com.applovin.exoplayer2.e
    public void r() {
        B();
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "CameraMotionRenderer";
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean z() {
        return true;
    }
}
