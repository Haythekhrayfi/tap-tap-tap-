package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhl {
    private static final zzfhl zza = new zzfhl();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfhl() {
    }

    public static zzfhl zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfha zzfhaVar) {
        this.zzb.add(zzfhaVar);
    }

    public final void zze(zzfha zzfhaVar) {
        boolean zZzg = zzg();
        this.zzb.remove(zzfhaVar);
        this.zzc.remove(zzfhaVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfhr.zzb().zzf();
    }

    public final void zzf(zzfha zzfhaVar) {
        boolean zZzg = zzg();
        this.zzc.add(zzfhaVar);
        if (zZzg) {
            return;
        }
        zzfhr.zzb().zze();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
