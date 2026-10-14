package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzbsm extends zzbsh {
    public final /* synthetic */ UpdateClickUrlCallback zza;

    public zzbsm(zzbsq zzbsqVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zzf(List list) {
        this.zza.onSuccess((Uri) list.get(0));
    }
}
