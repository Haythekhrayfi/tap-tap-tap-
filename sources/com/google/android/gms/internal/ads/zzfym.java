package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfym {
    private final ConcurrentMap zza;
    private final List zzb;
    private final zzfyi zzc;
    private final Class zzd;
    private final zzghn zze;

    public /* synthetic */ zzfym(ConcurrentMap concurrentMap, List list, zzfyi zzfyiVar, zzghn zzghnVar, Class cls, zzfyl zzfylVar) {
        this.zza = concurrentMap;
        this.zzb = list;
        this.zzc = zzfyiVar;
        this.zzd = cls;
        this.zze = zzghnVar;
    }

    @Nullable
    public final zzfyi zza() {
        return this.zzc;
    }

    public final zzghn zzb() {
        return this.zze;
    }

    public final Class zzc() {
        return this.zzd;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzfyk(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean zzf() {
        return !this.zze.zza().isEmpty();
    }
}
