package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class fh extends me {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final an f20704n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final mp0 f20705o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f20706p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private eh f20707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f20708r;

    public fh() {
        super(6);
        this.f20704n = new an(1);
        this.f20705o = new mp0();
    }

    @Override // com.yandex.mobile.ads.impl.qv0
    public final int a(yv yvVar) {
        return qv0.a("application/x-camera-motion".equals(yvVar.f27115l) ? 4 : 0);
    }

    @Override // com.yandex.mobile.ads.impl.me, com.yandex.mobile.ads.impl.hr0.b
    public final void a(int i10, Object obj) throws ns {
        if (i10 == 8) {
            this.f20707q = (eh) obj;
        }
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final void a(long j10, long j11) {
        float[] fArr;
        while (!e() && this.f20708r < 100000 + j10) {
            this.f20704n.b();
            if (a(q(), this.f20704n, 0) != -4 || this.f20704n.f()) {
                return;
            }
            an anVar = this.f20704n;
            this.f20708r = anVar.f19006e;
            if (this.f20707q != null && !anVar.e()) {
                this.f20704n.h();
                ByteBuffer byteBuffer = this.f20704n.f19004c;
                int i10 = da1.f19803a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    this.f20705o.a(byteBuffer.limit(), byteBuffer.array());
                    this.f20705o.e(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr2[i11] = Float.intBitsToFloat(this.f20705o.k());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f20707q.a(this.f20708r - this.f20706p, fArr);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void a(long j10, boolean z10) {
        this.f20708r = Long.MIN_VALUE;
        eh ehVar = this.f20707q;
        if (ehVar != null) {
            ehVar.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void a(yv[] yvVarArr, long j10, long j11) {
        this.f20706p = j11;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final boolean a() {
        return e();
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public final boolean d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.pv0, com.yandex.mobile.ads.impl.qv0
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void u() {
        eh ehVar = this.f20707q;
        if (ehVar != null) {
            ehVar.f();
        }
    }
}
