package com.yandex.mobile.ads.impl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
final class dp0 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f19938a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f19939b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f19940c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f19941d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Display f19942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f19943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19944g;

    public interface a {
        void a(float[] fArr, float f10);
    }

    public dp0(Display display, a... aVarArr) {
        this.f19942e = display;
        this.f19943f = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f19938a, sensorEvent.values);
        float[] fArr = this.f19938a;
        int rotation = this.f19942e.getRotation();
        if (rotation != 0) {
            int i10 = 130;
            int i11 = 129;
            if (rotation == 1) {
                i10 = 2;
            } else if (rotation == 2) {
                i11 = 130;
                i10 = 129;
            } else {
                if (rotation != 3) {
                    throw new IllegalStateException();
                }
                i11 = 1;
            }
            float[] fArr2 = this.f19939b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f19939b, i10, i11, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f19938a, 1, 131, this.f19939b);
        SensorManager.getOrientation(this.f19939b, this.f19941d);
        float f10 = this.f19941d[2];
        Matrix.rotateM(this.f19938a, 0, 90.0f, 1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        float[] fArr3 = this.f19938a;
        if (!this.f19944g) {
            dw.a(this.f19940c, fArr3);
            this.f19944g = true;
        }
        float[] fArr4 = this.f19939b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f19939b, 0, this.f19940c, 0);
        float[] fArr5 = this.f19938a;
        for (a aVar : this.f19943f) {
            aVar.a(fArr5, f10);
        }
    }
}
