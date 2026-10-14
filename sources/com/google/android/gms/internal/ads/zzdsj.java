package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsj implements SensorEventListener {

    @Nullable
    private final SensorManager zza;

    @Nullable
    private final Sensor zzb;
    private float zzc = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    private Float zzd = Float.valueOf(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    private long zze = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
    private int zzf = 0;
    private boolean zzg = false;
    private boolean zzh = false;

    @Nullable
    private zzdsi zzi = null;
    private boolean zzj = false;

    public zzdsj(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziD)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            if (this.zze + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziF)).intValue()) < jCurrentTimeMillis) {
                this.zzf = 0;
                this.zze = jCurrentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            Float fValueOf = Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f10 = this.zzc;
            zzbbe zzbbeVar = zzbbm.zziE;
            if (fFloatValue > ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).floatValue() + f10) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                this.zzc = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            }
            if (this.zzg && this.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.zze = jCurrentTimeMillis;
                int i10 = this.zzf + 1;
                this.zzf = i10;
                this.zzg = false;
                this.zzh = false;
                zzdsi zzdsiVar = this.zzi;
                if (zzdsiVar != null) {
                    if (i10 == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziG)).intValue()) {
                        zzdsx zzdsxVar = (zzdsx) zzdsiVar;
                        zzdsxVar.zzh(new zzdsv(zzdsxVar), zzdsw.GESTURE);
                    }
                }
            }
        }
    }

    public final void zza() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.zzj = false;
                com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziD)).booleanValue()) {
                if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzj = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                }
                if (this.zza == null || this.zzb == null) {
                    zzbzr.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void zzc(zzdsi zzdsiVar) {
        this.zzi = zzdsiVar;
    }
}
