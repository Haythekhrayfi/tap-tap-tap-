package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgx {
    private final zzbzx zza;
    private final Context zzb;
    private final WeakReference zzc;

    public /* synthetic */ zzcgx(zzcgv zzcgvVar, zzcgw zzcgwVar) {
        this.zza = zzcgvVar.zza;
        this.zzb = zzcgvVar.zzb;
        this.zzc = zzcgvVar.zzc;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final zzaqs zzb() {
        return new zzaqs(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }

    public final zzbdy zzc() {
        return new zzbdy(this.zzb);
    }

    public final zzbzx zzd() {
        return this.zza;
    }

    public final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    public final WeakReference zzf() {
        return this.zzc;
    }
}
