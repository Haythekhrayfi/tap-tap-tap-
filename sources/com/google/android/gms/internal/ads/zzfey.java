package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class zzfey implements zzfev {
    private final zzfev zza;
    private final Queue zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzij)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfey(zzfev zzfevVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfevVar;
        long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzii)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfex
            @Override // java.lang.Runnable
            public final void run() {
                zzfey.zzc(this.zza);
            }
        }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void zzc(zzfey zzfeyVar) {
        while (!zzfeyVar.zzb.isEmpty()) {
            zzfeyVar.zza.zzb((zzfeu) zzfeyVar.zzb.remove());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfev
    public final String zza(zzfeu zzfeuVar) {
        return this.zza.zza(zzfeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfev
    public final void zzb(zzfeu zzfeuVar) {
        if (this.zzb.size() < this.zzc) {
            this.zzb.offer(zzfeuVar);
            return;
        }
        if (this.zzd.getAndSet(true)) {
            return;
        }
        Queue queue = this.zzb;
        zzfeu zzfeuVarZzb = zzfeu.zzb("dropped_event");
        Map mapZzj = zzfeuVar.zzj();
        if (mapZzj.containsKey("action")) {
            zzfeuVarZzb.zza("dropped_action", (String) mapZzj.get("action"));
        }
        queue.offer(zzfeuVarZzb);
    }
}
