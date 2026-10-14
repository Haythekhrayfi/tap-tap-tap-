package com.applovin.exoplayer2.m.a;

import android.opengl.Matrix;
import com.applovin.exoplayer2.l.af;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final af<float[]> f7717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7718b;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float fSqrt = (float) Math.sqrt((fArr2[8] * fArr2[8]) + (fArr2[10] * fArr2[10]));
        fArr[0] = fArr2[10] / fSqrt;
        fArr[2] = fArr2[8] / fSqrt;
        fArr[8] = (-fArr2[8]) / fSqrt;
        fArr[10] = fArr2[10] / fSqrt;
    }

    public void a() {
        this.f7717a.a();
        this.f7718b = false;
    }

    public void a(long j10, float[] fArr) {
        this.f7717a.a(j10, fArr);
    }
}
