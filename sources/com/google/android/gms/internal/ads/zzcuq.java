package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcuq {
    private final Context zza;
    private final zzfai zzb;
    private final Bundle zzc;
    private final zzfaa zzd;
    private final zzcui zze;
    private final zzech zzf;

    public /* synthetic */ zzcuq(zzcuo zzcuoVar, zzcup zzcupVar) {
        this.zza = zzcuoVar.zza;
        this.zzb = zzcuoVar.zzb;
        this.zzc = zzcuoVar.zzc;
        this.zzd = zzcuoVar.zzd;
        this.zze = zzcuoVar.zze;
        this.zzf = zzcuoVar.zzf;
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    public final Bundle zzb() {
        return this.zzc;
    }

    public final zzcui zzc() {
        return this.zze;
    }

    public final zzcuo zzd() {
        zzcuo zzcuoVar = new zzcuo();
        zzcuoVar.zze(this.zza);
        zzcuoVar.zzi(this.zzb);
        zzcuoVar.zzf(this.zzc);
        zzcuoVar.zzg(this.zze);
        zzcuoVar.zzd(this.zzf);
        return zzcuoVar;
    }

    public final zzech zze(String str) {
        zzech zzechVar = this.zzf;
        return zzechVar != null ? zzechVar : new zzech(str);
    }

    public final zzfaa zzf() {
        return this.zzd;
    }

    public final zzfai zzg() {
        return this.zzb;
    }
}
