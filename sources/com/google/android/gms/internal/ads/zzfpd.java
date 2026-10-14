package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfpd implements Serializable {
    public static zzfpd zzc() {
        return zzfol.zza;
    }

    public static zzfpd zzd(@CheckForNull Object obj) {
        return obj == null ? zzfol.zza : new zzfpm(obj);
    }

    public abstract zzfpd zza(zzfov zzfovVar);

    public abstract Object zzb(Object obj);
}
