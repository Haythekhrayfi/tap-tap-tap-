package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.83, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass83 implements SensorEventListener {
    public AnonymousClass83() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] unused = AnonymousClass84.A0A = sensorEvent.values;
        AnonymousClass84.A07();
    }
}
