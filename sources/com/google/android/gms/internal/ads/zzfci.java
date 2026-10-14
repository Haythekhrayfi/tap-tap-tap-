package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfci {
    private final HashMap zza = new HashMap();

    public final zzfch zza(zzfby zzfbyVar, Context context, zzfbq zzfbqVar, zzfco zzfcoVar) {
        zzfch zzfchVar = (zzfch) this.zza.get(zzfbyVar);
        if (zzfchVar != null) {
            return zzfchVar;
        }
        zzfbv zzfbvVar = new zzfbv(zzfcb.zza(zzfbyVar, context));
        zzfch zzfchVar2 = new zzfch(zzfbvVar, new zzfcq(zzfbvVar, zzfbqVar, zzfcoVar));
        this.zza.put(zzfbyVar, zzfchVar2);
        return zzfchVar2;
    }
}
