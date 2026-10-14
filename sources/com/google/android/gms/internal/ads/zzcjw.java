package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjw implements zzdri {
    private final zzciq zza;
    private Context zzb;
    private zzbjg zzc;

    public /* synthetic */ zzcjw(zzciq zzciqVar, zzcjv zzcjvVar) {
        this.zza = zzciqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdri
    public final /* synthetic */ zzdri zza(zzbjg zzbjgVar) {
        Objects.requireNonNull(zzbjgVar);
        this.zzc = zzbjgVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdri
    public final /* synthetic */ zzdri zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdri
    public final zzdrj zzc() {
        zzgwm.zzc(this.zzb, Context.class);
        zzgwm.zzc(this.zzc, zzbjg.class);
        return new zzcjy(this.zza, this.zzb, this.zzc, null);
    }
}
