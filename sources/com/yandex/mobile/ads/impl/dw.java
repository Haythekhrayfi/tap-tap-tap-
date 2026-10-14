package com.yandex.mobile.ads.impl;

import android.opengl.Matrix;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
final class dw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f19993a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f19994b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u61<float[]> f19995c = new u61<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19996d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10] / fSqrt;
        fArr[0] = f12;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12;
    }

    public final void a() {
        this.f19995c.a();
        this.f19996d = false;
    }

    public final void a(long j10, float[] fArr) {
        float[] fArrB = this.f19995c.b(j10);
        if (fArrB == null) {
            return;
        }
        float[] fArr2 = this.f19994b;
        float f10 = fArrB[0];
        float f11 = -fArrB[1];
        float f12 = -fArrB[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            Matrix.setRotateM(fArr2, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            Matrix.setIdentityM(fArr2, 0);
        }
        if (!this.f19996d) {
            a(this.f19993a, this.f19994b);
            this.f19996d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f19993a, 0, this.f19994b, 0);
    }

    public final void b(long j10, float[] fArr) {
        this.f19995c.a(fArr, j10);
    }
}
