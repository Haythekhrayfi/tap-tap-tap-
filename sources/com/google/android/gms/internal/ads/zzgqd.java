package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgqd extends zzgno implements RandomAccess, zzgqe {

    @Deprecated
    public static final zzgqe zza;
    private static final zzgqd zzb;
    private final List zzc;

    static {
        zzgqd zzgqdVar = new zzgqd(false);
        zzb = zzgqdVar;
        zza = zzgqdVar;
    }

    public zzgqd() {
        this(10);
    }

    public zzgqd(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        super(true);
        this.zzc = arrayList;
    }

    private zzgqd(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzgqd(boolean z10) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof zzgoe ? ((zzgoe) obj).zzx(zzgpw.zzb) : zzgpw.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zzbH();
        this.zzc.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        zzbH();
        if (collection instanceof zzgqe) {
            collection = ((zzgqe) collection).zzh();
        }
        boolean zAddAll = this.zzc.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbH();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbH();
        Object objRemove = this.zzc.remove(i10);
        ((AbstractList) this).modCount++;
        return zzj(objRemove);
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zzbH();
        return zzj(this.zzc.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgpv
    public final /* bridge */ /* synthetic */ zzgpv zzd(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.zzc);
        return new zzgqd(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final zzgqe zze() {
        return zzc() ? new zzgsl(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final Object zzf(int i10) {
        return this.zzc.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgoe) {
            zzgoe zzgoeVar = (zzgoe) obj;
            String strZzx = zzgoeVar.zzx(zzgpw.zzb);
            if (zzgoeVar.zzp()) {
                this.zzc.set(i10, strZzx);
            }
            return strZzx;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = zzgpw.zzd(bArr);
        if (zzgsv.zzi(bArr)) {
            this.zzc.set(i10, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void zzi(zzgoe zzgoeVar) {
        zzbH();
        this.zzc.add(zzgoeVar);
        ((AbstractList) this).modCount++;
    }
}
