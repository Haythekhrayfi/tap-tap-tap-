package com.applovin.exoplayer2.m.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f7719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f7720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f7721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f7722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Display f7723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f7724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7725g;

    public interface a {
        void a(float[] fArr, float f10);
    }

    private void a(float[] fArr) {
        if (!this.f7725g) {
            c.a(this.f7721c, fArr);
            this.f7725g = true;
        }
        float[] fArr2 = this.f7720b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f7720b, 0, this.f7721c, 0);
    }

    private void a(float[] fArr, float f10) {
        for (a aVar : this.f7724f) {
            aVar.a(fArr, f10);
        }
    }

    private void a(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 130;
            int i12 = 129;
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
                i11 = 129;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i12 = 1;
            }
            float[] fArr2 = this.f7720b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f7720b, i11, i12, fArr);
        }
    }

    private float b(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f7720b);
        SensorManager.getOrientation(this.f7720b, this.f7722d);
        return this.f7722d[2];
    }

    private static void c(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f7719a, sensorEvent.values);
        a(this.f7719a, this.f7723e.getRotation());
        float fB = b(this.f7719a);
        c(this.f7719a);
        a(this.f7719a);
        a(this.f7719a, fB);
    }
}
