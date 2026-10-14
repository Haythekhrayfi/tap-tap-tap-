package com.google.android.gms.internal.ads;

import android.app.Activity;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzeaq extends zzebm {
    private Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzl zzb;
    private com.google.android.gms.ads.internal.util.zzbr zzc;
    private String zzd;
    private String zze;

    @Override // com.google.android.gms.internal.ads.zzebm
    public final zzebm zza(Activity activity) {
        Objects.requireNonNull(activity, "Null activity");
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final zzebm zzb(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzb = zzlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final zzebm zzc(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final zzebm zzd(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final zzebm zze(com.google.android.gms.ads.internal.util.zzbr zzbrVar) {
        this.zzc = zzbrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final zzebn zzf() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzeas(activity, this.zzb, this.zzc, this.zzd, this.zze, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
