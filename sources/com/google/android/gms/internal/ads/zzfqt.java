package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzfqt extends zzfqr implements ListIterator {
    public final /* synthetic */ zzfqu zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqt(zzfqu zzfquVar) {
        super(zzfquVar);
        this.zzd = zzfquVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqt(zzfqu zzfquVar, int i10) {
        super(zzfquVar, ((List) zzfquVar.zzb).listIterator(i10));
        this.zzd = zzfquVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        this.zzd.zzf.zzb++;
        if (zIsEmpty) {
            this.zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }
}
