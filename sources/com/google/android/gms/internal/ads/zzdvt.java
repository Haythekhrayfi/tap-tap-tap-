package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class zzdvt implements zzcyb {
    private final Context zza;
    private final zzbxw zzb;

    public zzdvt(Context context, zzbxw zzbxwVar) {
        this.zza = context;
        this.zzb = zzbxwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyb
    public final void zzb(zzezz zzezzVar) {
        if (TextUtils.isEmpty(zzezzVar.zzb.zzb.zzd)) {
            return;
        }
        this.zzb.zzp(this.zza, zzezzVar.zza.zza.zzd);
        this.zzb.zzl(this.zza, zzezzVar.zzb.zzb.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzcyb
    public final void zzbA(zzbue zzbueVar) {
    }
}
