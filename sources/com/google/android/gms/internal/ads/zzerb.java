package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzerb {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzffy zzd;
    private final zzdqa zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzerb(Context context, Executor executor, Set set, zzffy zzffyVar, zzdqa zzdqaVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzffyVar;
        this.zze = zzdqaVar;
    }

    public final zzfwm zza(final Object obj) {
        zzffn zzffnVarZza = zzffm.zza(this.zza, 8);
        zzffnVarZza.zzh();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        zzbbe zzbbeVar = zzbbm.zzkf;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        for (final zzeqy zzeqyVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzeqyVar.zza()))) {
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                zzfwm zzfwmVarZzb = zzeqyVar.zzb();
                zzfwmVarZzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb(jElapsedRealtime, zzeqyVar);
                    }
                }, zzcae.zzf);
                arrayList.add(zzfwmVarZzb);
            }
        }
        zzfwm zzfwmVarZza = zzfwc.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzera
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = arrayList;
                Object obj2 = obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzeqx zzeqxVar = (zzeqx) ((zzfwm) it.next()).get();
                    if (zzeqxVar != null) {
                        zzeqxVar.zzh(obj2);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfgb.zza()) {
            zzffx.zza(zzfwmVarZza, this.zzd, zzffnVarZza);
        }
        return zzfwmVarZza;
    }

    public final void zzb(long j10, zzeqy zzeqyVar) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j10;
        if (((Boolean) zzbdi.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfpw.zzc(zzeqyVar.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbT)).booleanValue()) {
            zzdpz zzdpzVarZza = this.zze.zza();
            zzdpzVarZza.zzb("action", "lat_ms");
            zzdpzVarZza.zzb("lat_grp", "sig_lat_grp");
            zzdpzVarZza.zzb("lat_id", String.valueOf(zzeqyVar.zza()));
            zzdpzVarZza.zzb("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbU)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zzdpzVarZza.zzb("seq_num", com.google.android.gms.ads.internal.zzt.zzo().zzg().zzc());
                synchronized (this) {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        zzdpzVarZza.zzb((zzeqyVar.zza() <= 39 || zzeqyVar.zza() >= 52) ? "lat_clsg" : "lat_gmssg", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzf));
                    }
                }
            }
            zzdpzVarZza.zzh();
        }
    }
}
