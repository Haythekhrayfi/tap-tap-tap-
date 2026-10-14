package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfqh implements Iterator {
    public final Iterator zza;

    @CheckForNull
    public Collection zzb;
    public final /* synthetic */ zzfqi zzc;

    public zzfqh(zzfqi zzfqiVar) {
        this.zzc = zzfqiVar;
        this.zza = zzfqiVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzfph.zzi(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        this.zzc.zzb.zzb -= this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
