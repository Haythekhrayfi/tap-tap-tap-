package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdzk implements zzfem {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfeu zzc;

    public zzdzk(Set set, zzfeu zzfeuVar) {
        this.zzc = zzfeuVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdzj zzdzjVar = (zzdzj) it.next();
            this.zza.put(zzdzjVar.zzb, zzdzjVar.zza);
            this.zzb.put(zzdzjVar.zzc, zzdzjVar.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final void zzbB(zzfef zzfefVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final void zzbC(zzfef zzfefVar, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzfefVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfefVar))), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final void zzc(zzfef zzfefVar, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzfefVar)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzfefVar))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final void zzd(zzfef zzfefVar, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzfefVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfefVar))), "s.");
        }
    }
}
