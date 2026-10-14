package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzdfu implements zzbij {
    private final WeakReference zza;

    public /* synthetic */ zzdfu(zzdfx zzdfxVar, zzdft zzdftVar) {
        this.zza = new WeakReference(zzdfxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final void zza(Object obj, Map map) {
        zzdfx zzdfxVar = (zzdfx) this.zza.get();
        if (zzdfxVar == null) {
            return;
        }
        zzdfxVar.zzh.onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjs)).booleanValue()) {
            zzdfxVar.zzi.zzr();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdfxVar.zzi.zzs();
        }
    }
}
