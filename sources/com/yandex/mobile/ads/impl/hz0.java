package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
final class hz0 implements xe1, eh {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SurfaceTexture f21532k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f21535n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f21523b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f21524c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final lt0 f21525d = new lt0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dw f21526e = new dw();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u61<Long> f21527f = new u61<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u61<jt0> f21528g = new u61<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f21529h = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f21530i = new float[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile int f21533l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21534m = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        this.f21523b.set(true);
    }

    public final SurfaceTexture a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        ay.a();
        this.f21525d.a();
        ay.a();
        this.f21531j = ay.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f21531j);
        this.f21532k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.yandex.mobile.ads.impl.go1
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f21120c.a(surfaceTexture2);
            }
        });
        return this.f21532k;
    }

    public final void a(int i10) {
        this.f21533l = i10;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code duplicated, block: B:45:0x011b  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.xe1
    public final void a(long j10, long j11, yv yvVar, MediaFormat mediaFormat) {
        int i10;
        int i11;
        float radians;
        float radians2;
        float f10;
        float f11;
        int i12;
        float[] fArr;
        float[] fArr2;
        int i13;
        int i14;
        int i15;
        float f12;
        int i16;
        float f13;
        int i17;
        int i18;
        int i19;
        float f14;
        float f15;
        int i20;
        int i21;
        int i22;
        int i23;
        this.f21527f.a(Long.valueOf(j10), j11);
        byte[] bArr = yvVar.f27125v;
        int i24 = yvVar.f27126w;
        byte[] bArr2 = this.f21535n;
        int i25 = this.f21534m;
        this.f21535n = bArr;
        if (i24 == -1) {
            i24 = this.f21533l;
        }
        this.f21534m = i24;
        if (i25 == i24 && Arrays.equals(bArr2, this.f21535n)) {
            return;
        }
        byte[] bArr3 = this.f21535n;
        jt0 jt0VarA = bArr3 != null ? kt0.a(this.f21534m, bArr3) : null;
        if (jt0VarA != null) {
            jt0.a aVar = jt0VarA.f22143a;
            jt0.a aVar2 = jt0VarA.f22144b;
            if (!(aVar.b() == 1 && aVar.a().f22148a == 0 && aVar2.b() == 1 && aVar2.a().f22148a == 0)) {
                i10 = this.f21534m;
                radians = (float) Math.toRadians(180.0f);
                radians2 = (float) Math.toRadians(360.0f);
                f10 = radians / 36;
                f11 = radians2 / 72;
                i12 = 73;
                fArr = new float[15984];
                fArr2 = new float[10656];
                i13 = 0;
                i14 = 0;
                i15 = 0;
                for (i11 = 36; i13 < i11; i11 = 36) {
                    float f16 = radians / 2.0f;
                    f12 = (i13 * f10) - f16;
                    i16 = i13 + 1;
                    f13 = (i16 * f10) - f16;
                    i17 = 0;
                    while (true) {
                        i18 = i16;
                        if (i17 < i12) {
                            i19 = 0;
                            while (i19 < 2) {
                                if (i19 == 0) {
                                    f15 = f12;
                                    f14 = f15;
                                } else {
                                    f14 = f12;
                                    f15 = f13;
                                }
                                float f17 = i17 * f11;
                                float f18 = f13;
                                int i26 = i14 + 1;
                                float f19 = f11;
                                double d10 = 50.0f;
                                i20 = i19;
                                double d11 = (f17 + 3.1415927f) - (radians2 / 2.0f);
                                i21 = i17;
                                double d12 = f15;
                                float f20 = radians;
                                fArr[i14] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                                int i27 = i26 + 1;
                                int i28 = i10;
                                int i29 = i13;
                                fArr[i26] = (float) (Math.sin(d12) * d10);
                                int i30 = i27 + 1;
                                fArr[i27] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                                int i31 = i15 + 1;
                                fArr2[i15] = f17 / radians2;
                                int i32 = i31 + 1;
                                fArr2[i31] = ((i29 + i20) * f10) / f20;
                                if (i21 == 0 || i20 != 0) {
                                    i22 = i21;
                                    i23 = i20;
                                    if (i22 == 72 || i23 != 1) {
                                    }
                                    i15 = i32;
                                    i14 = i30;
                                    i19 = i23 + 1;
                                    i17 = i22;
                                    i10 = i28;
                                    f12 = f14;
                                    f11 = f19;
                                    f13 = f18;
                                    i13 = i29;
                                    radians = f20;
                                } else {
                                    i23 = i20;
                                    i22 = i21;
                                }
                                System.arraycopy(fArr, i30 - 3, fArr, i30, 3);
                                i30 += 3;
                                System.arraycopy(fArr2, i32 - 2, fArr2, i32, 2);
                                i32 += 2;
                                i15 = i32;
                                i14 = i30;
                                i19 = i23 + 1;
                                i17 = i22;
                                i10 = i28;
                                f12 = f14;
                                f11 = f19;
                                f13 = f18;
                                i13 = i29;
                                radians = f20;
                            }
                            i17++;
                            i16 = i18;
                            i13 = i13;
                            radians = radians;
                            i12 = 73;
                        }
                    }
                    i13 = i18;
                }
                jt0.a aVar3 = new jt0.a(new jt0.b(0, fArr, fArr2, 1));
                jt0VarA = new jt0(aVar3, aVar3, i10);
            }
        } else {
            i10 = this.f21534m;
            radians = (float) Math.toRadians(180.0f);
            radians2 = (float) Math.toRadians(360.0f);
            f10 = radians / 36;
            f11 = radians2 / 72;
            i12 = 73;
            fArr = new float[15984];
            fArr2 = new float[10656];
            i13 = 0;
            i14 = 0;
            i15 = 0;
            while (i13 < i11) {
                float f110 = radians / 2.0f;
                f12 = (i13 * f10) - f110;
                i16 = i13 + 1;
                f13 = (i16 * f10) - f110;
                i17 = 0;
                while (true) {
                    i18 = i16;
                    if (i17 < i12) {
                        i19 = 0;
                        while (i19 < 2) {
                            if (i19 == 0) {
                                f15 = f12;
                                f14 = f15;
                            } else {
                                f14 = f12;
                                f15 = f13;
                            }
                            float f111 = i17 * f11;
                            float f112 = f13;
                            int i210 = i14 + 1;
                            float f113 = f11;
                            double d13 = 50.0f;
                            i20 = i19;
                            double d14 = (f111 + 3.1415927f) - (radians2 / 2.0f);
                            i21 = i17;
                            double d15 = f15;
                            float f21 = radians;
                            fArr[i14] = -((float) (Math.cos(d15) * Math.sin(d14) * d13));
                            int i211 = i210 + 1;
                            int i212 = i10;
                            int i213 = i13;
                            fArr[i210] = (float) (Math.sin(d15) * d13);
                            int i33 = i211 + 1;
                            fArr[i211] = (float) (Math.cos(d15) * Math.cos(d14) * d13);
                            int i34 = i15 + 1;
                            fArr2[i15] = f111 / radians2;
                            int i35 = i34 + 1;
                            fArr2[i34] = ((i213 + i20) * f10) / f21;
                            if (i21 == 0) {
                                i22 = i21;
                                i23 = i20;
                                if (i22 == 72) {
                                }
                            } else {
                                i22 = i21;
                                i23 = i20;
                                if (i22 == 72) {
                                }
                            }
                            i15 = i35;
                            i14 = i33;
                            i19 = i23 + 1;
                            i17 = i22;
                            i10 = i212;
                            f12 = f14;
                            f11 = f113;
                            f13 = f112;
                            i13 = i213;
                            radians = f21;
                        }
                        i17++;
                        i16 = i18;
                        i13 = i13;
                        radians = radians;
                        i12 = 73;
                    }
                }
                i13 = i18;
            }
            jt0.a aVar4 = new jt0.a(new jt0.b(0, fArr, fArr2, 1));
            jt0VarA = new jt0(aVar4, aVar4, i10);
        }
        this.f21528g.a(jt0VarA, j11);
    }

    @Override // com.yandex.mobile.ads.impl.eh
    public final void a(long j10, float[] fArr) {
        this.f21526e.b(j10, fArr);
    }

    public final void a(float[] fArr) {
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        ay.a();
        if (this.f21523b.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f21532k;
            Objects.requireNonNull(surfaceTexture);
            surfaceTexture.updateTexImage();
            ay.a();
            if (this.f21524c.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f21529h, 0);
            }
            long timestamp = this.f21532k.getTimestamp();
            Long lA = this.f21527f.a(timestamp);
            if (lA != null) {
                this.f21526e.a(lA.longValue(), this.f21529h);
            }
            jt0 jt0VarB = this.f21528g.b(timestamp);
            if (jt0VarB != null) {
                this.f21525d.a(jt0VarB);
            }
        }
        Matrix.multiplyMM(this.f21530i, 0, fArr, 0, this.f21529h, 0);
        this.f21525d.a(this.f21531j, this.f21530i);
    }

    @Override // com.yandex.mobile.ads.impl.eh
    public final void f() {
        this.f21527f.a();
        this.f21526e.a();
        this.f21524c.set(true);
    }
}
