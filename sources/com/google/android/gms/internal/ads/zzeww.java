package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
final class zzeww implements zzfov {
    public final /* synthetic */ zzexa zza;

    public zzeww(zzexa zzexaVar) {
        this.zza = zzexaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfov
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbzr.zzh("", (zzdwa) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzexa zzexaVar = this.zza;
        zzexaVar.zzd = new zzewz(null, zzexaVar.zze(), null);
        return this.zza.zzd;
    }
}
