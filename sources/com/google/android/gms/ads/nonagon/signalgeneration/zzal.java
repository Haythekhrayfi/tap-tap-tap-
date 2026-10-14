package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzfwn;
import com.google.android.gms.internal.ads.zzgwe;
import com.google.android.gms.internal.ads.zzgwm;
import com.google.android.gms.internal.ads.zzgwr;

/* JADX INFO: loaded from: classes.dex */
public final class zzal implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzal(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzak zzb() {
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzak(zzfwnVar, ((zzdux) this.zzb).zzb());
    }
}
