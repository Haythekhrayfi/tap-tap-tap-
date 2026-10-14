package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzckg implements zzexs {
    private final zzciq zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    public /* synthetic */ zzckg(zzciq zzciqVar, zzckf zzckfVar) {
        this.zza = zzciqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexs
    public final /* synthetic */ zzexs zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Objects.requireNonNull(zzqVar);
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexs
    public final /* synthetic */ zzexs zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexs
    public final /* synthetic */ zzexs zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexs
    public final zzext zzd() {
        zzgwm.zzc(this.zzb, Context.class);
        zzgwm.zzc(this.zzc, String.class);
        zzgwm.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzcki(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
