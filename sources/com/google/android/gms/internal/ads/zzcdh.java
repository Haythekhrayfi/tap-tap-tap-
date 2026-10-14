package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.b.a.c;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdh implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ long zzf;
    public final /* synthetic */ boolean zzg;
    public final /* synthetic */ int zzh;
    public final /* synthetic */ int zzi;
    public final /* synthetic */ zzcdl zzj;

    public zzcdh(zzcdl zzcdlVar, String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        this.zzj = zzcdlVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = z10;
        this.zzh = i12;
        this.zzi = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapA = c.a("event", "precacheProgress");
        mapA.put("src", this.zza);
        mapA.put("cachedSrc", this.zzb);
        mapA.put("bytesLoaded", Integer.toString(this.zzc));
        mapA.put("totalBytes", Integer.toString(this.zzd));
        mapA.put("bufferedDuration", Long.toString(this.zze));
        mapA.put("totalDuration", Long.toString(this.zzf));
        mapA.put("cacheReady", true != this.zzg ? "0" : "1");
        mapA.put("playerCount", Integer.toString(this.zzh));
        mapA.put("playerPreparedCount", Integer.toString(this.zzi));
        zzcdl.zze(this.zzj, "onPrecacheEvent", mapA);
    }
}
