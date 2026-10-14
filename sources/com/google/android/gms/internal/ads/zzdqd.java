package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdqd implements zzfem {
    private final zzdpv zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdqd(zzdpv zzdpvVar, Set set, Clock clock) {
        this.zzb = zzdpvVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdqc zzdqcVar = (zzdqc) it.next();
            this.zzd.put(zzdqcVar.zzc, zzdqcVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfef zzfefVar, boolean z10) {
        zzfef zzfefVar2 = ((zzdqc) this.zzd.get(zzfefVar)).zzb;
        if (this.zza.containsKey(zzfefVar2)) {
            String str = true != z10 ? "f." : "s.";
            this.zzb.zza().put("label.".concat(((zzdqc) this.zzd.get(zzfefVar)).zza), str.concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfefVar2)).longValue()))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final void zzbB(zzfef zzfefVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final void zzbC(zzfef zzfefVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfefVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfefVar)).longValue();
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfefVar)) {
            zze(zzfefVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final void zzc(zzfef zzfefVar, String str) {
        this.zza.put(zzfefVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final void zzd(zzfef zzfefVar, String str) {
        if (this.zza.containsKey(zzfefVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfefVar)).longValue();
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfefVar)) {
            zze(zzfefVar, true);
        }
    }
}
