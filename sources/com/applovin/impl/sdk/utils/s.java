package com.applovin.impl.sdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class s implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f11364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SensorManager f11365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Sensor f11366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Sensor f11367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f11368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f11369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f11370h;

    public s(com.applovin.impl.sdk.o oVar) {
        this.f11368f = oVar;
        SensorManager sensorManager = (SensorManager) com.applovin.impl.sdk.o.au().getSystemService("sensor");
        this.f11365c = sensorManager;
        this.f11366d = sensorManager.getDefaultSensor(9);
        this.f11367e = sensorManager.getDefaultSensor(4);
        this.f11363a = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.eH)).intValue();
        this.f11364b = ((Float) oVar.a(com.applovin.impl.sdk.c.b.eG)).floatValue();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a() {
        this.f11365c.unregisterListener(this);
        if (((Boolean) this.f11368f.H().a(com.applovin.impl.sdk.c.b.eE)).booleanValue()) {
            this.f11365c.registerListener(this, this.f11366d, (int) TimeUnit.MILLISECONDS.toMicros(this.f11363a));
        }
        if (((Boolean) this.f11368f.H().a(com.applovin.impl.sdk.c.b.eF)).booleanValue()) {
            this.f11365c.registerListener(this, this.f11367e, (int) TimeUnit.MILLISECONDS.toMicros(this.f11363a));
        }
    }

    public float b() {
        return this.f11370h;
    }

    public float c() {
        float[] fArr = this.f11369g;
        return fArr == null ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : (float) Math.toDegrees(Math.acos(fArr[2] / 9.81f));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f11365c.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f11369g = sensorEvent.values;
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f11370h * this.f11364b;
            this.f11370h = f10;
            this.f11370h = Math.abs(sensorEvent.values[2]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[0]) + f10;
        }
    }
}
