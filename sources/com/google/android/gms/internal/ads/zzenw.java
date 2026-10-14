package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenw implements zzeqx {
    public final String zza;
    public final boolean zzb;

    public zzenw(String str, boolean z10) {
        this.zza = str;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", "1");
        }
    }
}
