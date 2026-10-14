package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcde implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final zzcdd zza(zzcca zzccaVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdd zzcddVar = (zzcdd) it.next();
            if (zzcddVar.zza == zzccaVar) {
                return zzcddVar;
            }
        }
        return null;
    }

    public final void zzb(zzcdd zzcddVar) {
        this.zza.add(zzcddVar);
    }

    public final void zzc(zzcdd zzcddVar) {
        this.zza.remove(zzcddVar);
    }

    public final boolean zzd(zzcca zzccaVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdd zzcddVar = (zzcdd) it.next();
            if (zzcddVar.zza == zzccaVar) {
                arrayList.add(zzcddVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcdd) it2.next()).zzb.zzf();
        }
        return true;
    }
}
