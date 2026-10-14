package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepr implements zzeqx {
    private final String zza;
    private final String zzb;

    public zzepr(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        ((Bundle) obj).putString("request_id", ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgJ)).booleanValue() ? this.zzb : this.zza);
    }
}
