package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.b.h0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import n1.c;

/* JADX INFO: loaded from: classes2.dex */
final class zzgov extends zzgno implements RandomAccess, zzgrd {
    private static final zzgov zza = new zzgov(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    public zzgov() {
        this(new double[10], 0, true);
    }

    private zzgov(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.zzb = dArr;
        this.zzc = i10;
    }

    private final String zzf(int i10) {
        return c.a("Index:", i10, ", Size:", this.zzc);
    }

    private final void zzg(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        zzbH();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
        double[] dArr = this.zzb;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[h0.a(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.zzb, i10, dArr2, i10 + 1, this.zzc - i10);
            this.zzb = dArr2;
        }
        this.zzb[i10] = dDoubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbH();
        byte[] bArr = zzgpw.zzd;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzgov)) {
            return super.addAll(collection);
        }
        zzgov zzgovVar = (zzgov) collection;
        int i10 = zzgovVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.zzb;
        if (i12 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(zzgovVar.zzb, 0, this.zzb, this.zzc, zzgovVar.zzc);
        this.zzc = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgov)) {
            return super.equals(obj);
        }
        zzgov zzgovVar = (zzgov) obj;
        if (this.zzc != zzgovVar.zzc) {
            return false;
        }
        double[] dArr = zzgovVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (Double.doubleToLongBits(this.zzb[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzg(i10);
        return Double.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zzb[i11]);
            byte[] bArr = zzgpw.zzd;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbH();
        zzg(i10);
        double[] dArr = this.zzb;
        double d10 = dArr[i10];
        int i11 = this.zzc;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zzbH();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i11, dArr, i10, this.zzc - i11);
        this.zzc -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zzbH();
        zzg(i10);
        double[] dArr = this.zzb;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgpv
    public final /* bridge */ /* synthetic */ zzgpv zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzgov(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d10) {
        zzbH();
        int i10 = this.zzc;
        double[] dArr = this.zzb;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[h0.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        dArr3[i11] = d10;
    }
}
