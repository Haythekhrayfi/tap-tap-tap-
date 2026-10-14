package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.b.a.c;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdg implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ long zzf;
    public final /* synthetic */ long zzg;
    public final /* synthetic */ boolean zzh;
    public final /* synthetic */ int zzi;
    public final /* synthetic */ int zzj;
    public final /* synthetic */ zzcdl zzk;

    public zzcdg(zzcdl zzcdlVar, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z10, int i10, int i11) {
        this.zzk = zzcdlVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzh = z10;
        this.zzi = i10;
        this.zzj = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapA = c.a("event", "precacheProgress");
        mapA.put("src", this.zza);
        mapA.put("cachedSrc", this.zzb);
        mapA.put("bufferedDuration", Long.toString(this.zzc));
        mapA.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbJ)).booleanValue()) {
            mapA.put("qoeLoadedBytes", Long.toString(this.zze));
            mapA.put("qoeCachedBytes", Long.toString(this.zzf));
            mapA.put("totalBytes", Long.toString(this.zzg));
            mapA.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
        }
        mapA.put("cacheReady", true != this.zzh ? "0" : "1");
        mapA.put("playerCount", Integer.toString(this.zzi));
        mapA.put("playerPreparedCount", Integer.toString(this.zzj));
        zzcdl.zze(this.zzk, "onPrecacheEvent", mapA);
    }
}
