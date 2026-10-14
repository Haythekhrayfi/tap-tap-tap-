package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzblz implements Runnable {
    public final /* synthetic */ zzbmk zza;
    public final /* synthetic */ zzblg zzb;
    public final /* synthetic */ ArrayList zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzbml zze;

    public zzblz(zzbml zzbmlVar, zzbmk zzbmkVar, zzblg zzblgVar, ArrayList arrayList, long j10) {
        this.zze = zzbmlVar;
        this.zza = zzbmkVar;
        this.zzb = zzblgVar;
        this.zzc = arrayList;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        synchronized (this.zze.zza) {
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zza.zzg();
                zzfwn zzfwnVar = zzcae.zze;
                final zzblg zzblgVar = this.zzb;
                zzfwnVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbly
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzblgVar.zzc();
                    }
                });
                String strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzd));
                int iZze = this.zza.zze();
                int i10 = this.zze.zzi;
                if (this.zzc.isEmpty()) {
                    str = ". Still waiting for the engine to be loaded";
                } else {
                    str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.zzc.get(0));
                }
                com.google.android.gms.ads.internal.util.zze.zza("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iZze + ". Update status(fullLoadTimeout) is " + i10 + str + " ms. Total latency(fullLoadTimeout) is " + (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting.");
            }
        }
    }
}
