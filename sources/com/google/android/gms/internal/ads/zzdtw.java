package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdtw implements SensorEventListener {
    private final Context zza;

    @Nullable
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdtv zzf;
    private boolean zzg;

    public zzdtw(Context context) {
        this.zza = context;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziy)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f12 * f12) + (f11 * f11) + (f10 * f10))) < ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziz)).floatValue()) {
                return;
            }
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            if (this.zzd + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziA)).intValue()) > jCurrentTimeMillis) {
                return;
            }
            if (this.zzd + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziB)).intValue()) < jCurrentTimeMillis) {
                this.zze = 0;
            }
            com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
            this.zzd = jCurrentTimeMillis;
            int i10 = this.zze + 1;
            this.zze = i10;
            zzdtv zzdtvVar = this.zzf;
            if (zzdtvVar != null) {
                if (i10 == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziC)).intValue()) {
                    zzdsx zzdsxVar = (zzdsx) zzdtvVar;
                    zzdsxVar.zzh(new zzdsu(zzdsxVar), zzdsw.GESTURE);
                }
            }
        }
    }

    public final void zza() {
        synchronized (this) {
            if (this.zzg) {
                SensorManager sensorManager = this.zzb;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzc);
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziy)).booleanValue()) {
                if (this.zzb == null) {
                    SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                    this.zzb = sensorManager2;
                    if (sensorManager2 == null) {
                        zzbzr.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.zzc = sensorManager2.getDefaultSensor(1);
                }
                if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzd = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziA)).intValue());
                    this.zzg = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    public final void zzc(zzdtv zzdtvVar) {
        this.zzf = zzdtvVar;
    }
}
