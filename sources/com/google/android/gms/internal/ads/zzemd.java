package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemd implements zzeqx {
    public final String zza;
    public final int zzb;

    public zzemd(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        Bundle bundleZza = zzfat.zza(bundle, "pii");
        bundle.putBundle("pii", bundleZza);
        bundleZza.putString("pvid", this.zza);
        bundleZza.putInt("pvid_s", this.zzb);
    }
}
