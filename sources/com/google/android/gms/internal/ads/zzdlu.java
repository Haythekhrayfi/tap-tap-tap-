package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdlu implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzcfl zzb;
    private final Context zzc;
    private final zzdqa zzd;
    private final zzfev zze;
    private final zzeba zzf;
    private final Executor zzg;
    private final zzaqs zzh;
    private final zzbzx zzi;
    private final zzfgr zzj;
    private final zzebl zzk;

    public zzdlu(Context context, Executor executor, zzaqs zzaqsVar, zzbzx zzbzxVar, com.google.android.gms.ads.internal.zza zzaVar, zzcfl zzcflVar, zzeba zzebaVar, zzfgr zzfgrVar, zzdqa zzdqaVar, zzfev zzfevVar, zzebl zzeblVar) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzaqsVar;
        this.zzi = zzbzxVar;
        this.zza = zzaVar;
        this.zzb = zzcflVar;
        this.zzf = zzebaVar;
        this.zzj = zzfgrVar;
        this.zzd = zzdqaVar;
        this.zze = zzfevVar;
        this.zzk = zzeblVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdlx zzdlxVar = new zzdlx(this);
        zzdlxVar.zzh();
        return zzdlxVar;
    }
}
