package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzbzr;

/* JADX INFO: loaded from: classes.dex */
final class zzbh implements zzalo {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzbl zzb;

    public zzbh(zzbo zzboVar, String str, zzbl zzblVar) {
        this.zza = str;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalo
    public final void zza(zzalt zzaltVar) {
        zzbzr.zzj("Failed to load URL: " + this.zza + "\n" + zzaltVar.toString());
        this.zzb.zza((Object) null);
    }
}
