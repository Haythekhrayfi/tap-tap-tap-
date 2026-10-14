package com.google.android.gms.internal.ads;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenh implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzenh(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemy(((zzemt) this.zza).zzb(), AbstractComponentTracker.LINGERING_TIMEOUT, (Clock) this.zzb.zzb());
    }
}
