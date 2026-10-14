package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfrf extends AbstractSet {
    public final /* synthetic */ zzfrl zza;

    public zzfrf(zzfrl zzfrlVar) {
        this.zza = zzfrlVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Map mapZzj = this.zza.zzj();
        if (mapZzj != null) {
            return mapZzj.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzq = this.zza.zzq(entry.getKey());
            if (iZzq != -1) {
                Object[] objArr = this.zza.zzc;
                Objects.requireNonNull(objArr);
                if (zzfpc.zza(objArr[iZzq], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfrl zzfrlVar = this.zza;
        Map mapZzj = zzfrlVar.zzj();
        return mapZzj != null ? mapZzj.entrySet().iterator() : new zzfrd(zzfrlVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Map mapZzj = this.zza.zzj();
        if (mapZzj != null) {
            return mapZzj.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfrl zzfrlVar = this.zza;
        if (zzfrlVar.zzo()) {
            return false;
        }
        int iZzp = zzfrlVar.zzp();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object objZzh = zzfrl.zzh(this.zza);
        zzfrl zzfrlVar2 = this.zza;
        int[] iArr = zzfrlVar2.zza;
        Objects.requireNonNull(iArr);
        Object[] objArr = zzfrlVar2.zzb;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = zzfrlVar2.zzc;
        Objects.requireNonNull(objArr2);
        int iZzb = zzfrm.zzb(key, value, iZzp, objZzh, iArr, objArr, objArr2);
        if (iZzb == -1) {
            return false;
        }
        this.zza.zzn(iZzb, iZzp);
        this.zza.zzg--;
        this.zza.zzl();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
