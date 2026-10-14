package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzckk implements zzezg {
    private final zzciq zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzckk(zzciq zzciqVar, zzckj zzckjVar) {
        this.zza = zzciqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezg
    public final /* synthetic */ zzezg zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezg
    public final /* synthetic */ zzezg zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezg
    public final zzezh zzc() {
        zzgwm.zzc(this.zzb, Context.class);
        return new zzckm(this.zza, this.zzb, this.zzc, null);
    }
}
