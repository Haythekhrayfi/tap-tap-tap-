package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfts extends zzfsh {
    public static final zzfts zza;
    private static final Object[] zzd;
    public final transient Object[] zzb;
    public final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzfts(objArr, 0, objArr, 0, 0);
    }

    public zzfts(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.zzb = objArr;
        this.zze = i10;
        this.zzc = objArr2;
        this.zzf = i11;
        this.zzg = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iZzb = zzfru.zzb(obj);
        while (true) {
            int i10 = iZzb & this.zzf;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iZzb = i10 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsh, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh, com.google.android.gms.internal.ads.zzfrx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, i10, this.zzg);
        return i10 + this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final int zzc() {
        return 0;
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

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final Object[] zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final zzfsc zzi() {
        return zzfsc.zzi(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final boolean zzr() {
        return true;
    }
}
