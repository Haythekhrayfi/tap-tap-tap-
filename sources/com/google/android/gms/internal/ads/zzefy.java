package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefy {
    private zzefr zza;

    public zzefy() {
    }

    private zzefy(zzefr zzefrVar) {
        this.zza = zzefrVar;
    }

    public static zzefy zzb(zzefr zzefrVar) {
        return new zzefy(zzefrVar);
    }

    public final zzefr zza(Clock clock, zzefs zzefsVar, zzech zzechVar, zzfgr zzfgrVar) {
        zzefr zzefrVar = this.zza;
        return zzefrVar != null ? zzefrVar : new zzefr(clock, zzefsVar, zzechVar, zzfgrVar);
    }
}
