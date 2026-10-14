package com.applovin.impl.sdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class k implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f11225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f11226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sensor f11227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f11228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f11229e;

    public interface a {
        void e();

        void f();
    }

    public k(com.applovin.impl.sdk.o oVar, a aVar) {
        this.f11225a = oVar;
        SensorManager sensorManager = (SensorManager) com.applovin.impl.sdk.o.au().getSystemService("sensor");
        this.f11226b = sensorManager;
        this.f11227c = sensorManager.getDefaultSensor(1);
        this.f11228d = aVar;
    }

    public void a() {
        this.f11226b.unregisterListener(this);
        this.f11226b.registerListener(this, this.f11227c, (int) TimeUnit.MILLISECONDS.toMicros(50L));
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f11226b.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f11226b.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float fMax = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f10 = this.f11229e;
            float f11 = (fMax * 0.5f) + (f10 * 0.5f);
            this.f11229e = f11;
            if (f10 < 0.8f && f11 > 0.8f) {
                this.f11228d.f();
            } else {
                if (f10 <= -0.8f || f11 >= -0.8f) {
                    return;
                }
                this.f11228d.e();
            }
        }
    }
}
