package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzfqv extends zzfqy implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfqv(Map map) {
        zzfph.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzfqv zzfqvVar, Object obj) {
        Object objRemove;
        try {
            objRemove = zzfqvVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfqvVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final Collection zzf() {
        return new zzfqx(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final Iterator zzg() {
        return new zzfqf(this);
    }

    public final List zzh(Object obj, List list, @CheckForNull zzfqs zzfqsVar) {
        return list instanceof RandomAccess ? new zzfqo(this, obj, list, zzfqsVar) : new zzfqu(this, obj, list, zzfqsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfqm(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new zzfqp(this, (SortedMap) map) : new zzfqi(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfqn(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new zzfqq(this, (SortedMap) map) : new zzfql(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfqy, com.google.android.gms.internal.ads.zzfsy
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, collectionZza);
        return true;
    }
}
