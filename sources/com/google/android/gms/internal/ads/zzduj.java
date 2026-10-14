package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzduj implements zzgwe {
    private final zzgwr zza;

    public zzduj(zzgwr zzgwrVar) {
        this.zza = zzgwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.zza.zzb()).getApplicationInfo();
        zzgwm.zzb(applicationInfo);
        return applicationInfo;
    }
}
