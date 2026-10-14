package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfto extends zzfsh {
    private final transient zzfsf zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzfto(zzfsf zzfsfVar, Object[] objArr, int i10, int i11) {
        this.zza = zzfsfVar;
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh, com.google.android.gms.internal.ads.zzfrx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final int zza(Object[] objArr, int i10) {
        return zzd().zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfsh, com.google.android.gms.internal.ads.zzfrx
    /* JADX INFO: renamed from: zze */
    public final zzfuc iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final zzfsc zzi() {
        return new zzftn(this);
    }
}
