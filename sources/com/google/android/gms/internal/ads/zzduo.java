package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes2.dex */
public final class zzduo implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzduo(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.packageManager((Context) this.zza.zzb()).getPackageInfo(((zzduj) this.zzb).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
