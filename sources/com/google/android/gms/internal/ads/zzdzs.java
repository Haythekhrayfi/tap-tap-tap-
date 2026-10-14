package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
final class zzdzs implements zzfvy {
    public final /* synthetic */ zzfdo zza;

    public zzdzs(zzdzt zzdztVar, zzfdo zzfdoVar) {
        this.zza = zzfdoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        zzbzr.zzg("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            zzbzr.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
