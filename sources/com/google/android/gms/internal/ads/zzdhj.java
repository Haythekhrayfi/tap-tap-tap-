package com.google.android.gms.internal.ads;

import q.h;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdhj {
    public zzbfs zza;
    public zzbfp zzb;
    public zzbgf zzc;
    public zzbgc zzd;
    public zzbla zze;
    public final h zzf = new h();
    public final h zzg = new h();

    public final zzdhj zza(zzbfp zzbfpVar) {
        this.zzb = zzbfpVar;
        return this;
    }

    public final zzdhj zzb(zzbfs zzbfsVar) {
        this.zza = zzbfsVar;
        return this;
    }

    public final zzdhj zzc(String str, zzbfy zzbfyVar, zzbfv zzbfvVar) {
        this.zzf.put(str, zzbfyVar);
        if (zzbfvVar != null) {
            this.zzg.put(str, zzbfvVar);
        }
        return this;
    }

    public final zzdhj zzd(zzbla zzblaVar) {
        this.zze = zzblaVar;
        return this;
    }

    public final zzdhj zze(zzbgc zzbgcVar) {
        this.zzd = zzbgcVar;
        return this;
    }

    public final zzdhj zzf(zzbgf zzbgfVar) {
        this.zzc = zzbgfVar;
        return this;
    }

    public final zzdhl zzg() {
        return new zzdhl(this);
    }
}
