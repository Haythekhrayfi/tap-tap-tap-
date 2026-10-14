package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzciy implements zzeun {
    private final zzciq zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzciy(zzciq zzciqVar, zzcix zzcixVar) {
        this.zza = zzciqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ zzeun zza(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ zzeun zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzeuo zzc() {
        zzgwm.zzc(this.zzb, Context.class);
        zzgwm.zzc(this.zzc, String.class);
        return new zzcja(this.zza, this.zzb, this.zzc, null);
    }
}
