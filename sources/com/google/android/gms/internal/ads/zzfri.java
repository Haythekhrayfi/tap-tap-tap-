package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfri extends AbstractSet {
    public final /* synthetic */ zzfrl zza;

    public zzfri(zzfrl zzfrlVar) {
        this.zza = zzfrlVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfrl zzfrlVar = this.zza;
        Map mapZzj = zzfrlVar.zzj();
        return mapZzj != null ? mapZzj.keySet().iterator() : new zzfrc(zzfrlVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Map mapZzj = this.zza.zzj();
        if (mapZzj != null) {
            return mapZzj.keySet().remove(obj);
        }
        return this.zza.zzs(obj) != zzfrl.zzd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
