package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbk implements zzgwe {
    private final zzfbj zza;

    public zzfbk(zzfbj zzfbjVar) {
        this.zza = zzfbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzgwm.zzb(defaultClock);
        return defaultClock;
    }
}
