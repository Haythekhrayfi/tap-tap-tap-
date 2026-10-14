package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbcc {
    private final Map zza = new HashMap();
    private final zzbce zzb;

    public zzbcc(zzbce zzbceVar) {
        this.zzb = zzbceVar;
    }

    public final zzbce zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbcb zzbcbVar) {
        this.zza.put(str, zzbcbVar);
    }

    public final void zzc(String str, String str2, long j10) {
        zzbce zzbceVar = this.zzb;
        zzbcb zzbcbVar = (zzbcb) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbcbVar != null) {
            zzbceVar.zze(zzbcbVar, j10, strArr);
        }
        this.zza.put(str, new zzbcb(j10, null, null));
    }
}
