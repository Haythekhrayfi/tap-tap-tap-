package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.b.a.c;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdi implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ zzcdl zzd;

    public zzcdi(zzcdl zzcdlVar, String str, String str2, int i10) {
        this.zzd = zzcdlVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapA = c.a("event", "precacheComplete");
        mapA.put("src", this.zza);
        mapA.put("cachedSrc", this.zzb);
        mapA.put("totalBytes", Integer.toString(this.zzc));
        zzcdl.zze(this.zzd, "onPrecacheEvent", mapA);
    }
}
