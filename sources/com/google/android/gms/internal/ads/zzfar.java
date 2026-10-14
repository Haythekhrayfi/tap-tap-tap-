package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfar {
    private final zzezn zza;
    private final zzezq zzb;
    private final zzeba zzc;
    private final zzfgr zzd;
    private final zzffy zze;

    public zzfar(zzeba zzebaVar, zzfgr zzfgrVar, zzezn zzeznVar, zzezq zzezqVar, zzffy zzffyVar) {
        this.zza = zzeznVar;
        this.zzb = zzezqVar;
        this.zzc = zzebaVar;
        this.zzd = zzfgrVar;
        this.zze = zzffyVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i10) {
        if (!this.zza.zzaj) {
            this.zzd.zzc(str, this.zze);
        } else {
            this.zzc.zzd(new zzebc(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzb.zzb, str, i10));
        }
    }

    public final void zzc(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), i10);
        }
    }
}
