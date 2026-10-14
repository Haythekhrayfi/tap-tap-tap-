package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdpz {
    public final /* synthetic */ zzdqa zza;
    private final Map zzb = new ConcurrentHashMap();

    public zzdpz(zzdqa zzdqaVar) {
        this.zza = zzdqaVar;
    }

    public static /* bridge */ /* synthetic */ zzdpz zza(zzdpz zzdpzVar) {
        zzdpzVar.zzb.putAll(zzdpzVar.zza.zzc);
        return zzdpzVar;
    }

    public final zzdpz zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdpz zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdpz zzd(zzezn zzeznVar) {
        this.zzb.put("aai", zzeznVar.zzx);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgN)).booleanValue()) {
            zzc("rid", zzeznVar.zzao);
        }
        return this;
    }

    public final zzdpz zze(zzezq zzezqVar) {
        this.zzb.put("gqi", zzezqVar.zzb);
        return this;
    }

    public final String zzf() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzg() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpy
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi();
            }
        });
    }

    public final void zzh() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj();
            }
        });
    }

    public final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        this.zza.zza.zzd(this.zzb);
    }
}
