package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
class zzfqu extends zzfqs implements List {
    public final /* synthetic */ zzfqv zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqu(zzfqv zzfqvVar, Object obj, @CheckForNull List list, zzfqs zzfqsVar) {
        super(zzfqvVar, obj, list, zzfqsVar);
        this.zzf = zzfqvVar;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        zzb();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i10, obj);
        this.zzf.zzb++;
        if (zIsEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i10, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzfqv zzfqvVar = this.zzf;
        zzfqvVar.zzb = (size2 - size) + zzfqvVar.zzb;
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzb();
        return ((List) this.zzb).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzfqt(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zzb();
        return new zzfqt(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        zzb();
        Object objRemove = ((List) this.zzb).remove(i10);
        this.zzf.zzb--;
        zzc();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.zzb).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zzb();
        zzfqv zzfqvVar = this.zzf;
        Object obj = this.zza;
        List listSubList = ((List) this.zzb).subList(i10, i11);
        zzfqs zzfqsVar = this.zzc;
        if (zzfqsVar == null) {
            zzfqsVar = this;
        }
        return zzfqvVar.zzh(obj, listSubList, zzfqsVar);
    }
}
