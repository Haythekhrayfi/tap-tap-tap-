package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzftx extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return zzfty.zzd(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
