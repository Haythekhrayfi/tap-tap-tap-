package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzbsn extends zzbsh {
    public final /* synthetic */ List zza;

    public zzbsn(zzbsq zzbsqVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zze(String str) {
        zzbzr.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zzf(List list) {
        zzbzr.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
