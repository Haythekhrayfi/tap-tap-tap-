package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzdle implements zzbee {
    public final /* synthetic */ String zza = "_videoMediaView";
    public final /* synthetic */ zzdlf zzb;

    public zzdle(zzdlf zzdlfVar, String str) {
        this.zzb = zzdlfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public final void zzc() {
        zzdlf zzdlfVar = this.zzb;
        if (zzdlfVar.zzd != null) {
            zzdlfVar.zzd.zzE(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public final void zzd(MotionEvent motionEvent) {
    }
}
