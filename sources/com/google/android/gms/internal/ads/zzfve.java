package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfve extends zzfvd {
    public final AtomicReferenceFieldUpdater zza;
    public final AtomicIntegerFieldUpdater zzb;

    public zzfve(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final int zza(zzfvh zzfvhVar) {
        return this.zzb.decrementAndGet(zzfvhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final void zzb(zzfvh zzfvhVar, @CheckForNull Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.zza;
        while (!atomicReferenceFieldUpdater.compareAndSet(zzfvhVar, null, set2) && atomicReferenceFieldUpdater.get(zzfvhVar) == null) {
        }
    }
}
