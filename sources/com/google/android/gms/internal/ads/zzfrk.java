package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzfrk extends AbstractCollection {
    public final /* synthetic */ zzfrl zza;

    public zzfrk(zzfrl zzfrlVar) {
        this.zza = zzfrlVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfrl zzfrlVar = this.zza;
        Map mapZzj = zzfrlVar.zzj();
        return mapZzj != null ? mapZzj.values().iterator() : new zzfre(zzfrlVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
