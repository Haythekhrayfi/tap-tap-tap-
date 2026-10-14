package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbco {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0);
    private final Context zzc;
    private final ScheduledExecutorService zzd;
    private final zzffy zze;
    private final zzbcq zzf;

    public zzbco(Context context, ScheduledExecutorService scheduledExecutorService, zzbcq zzbcqVar, zzffy zzffyVar) {
        this.zzc = context;
        this.zzd = scheduledExecutorService;
        this.zzf = zzbcqVar;
        this.zze = zzffyVar;
    }

    public final zzfwm zza() {
        return (zzfvt) zzfwc.zzn(zzfvt.zzv(zzfwc.zzh(null)), ((Long) zzbde.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd);
    }

    public final void zzb(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.zzb.getEventTime()) {
                return;
            }
            this.zzb = MotionEvent.obtain(motionEvent);
        }
    }
}
