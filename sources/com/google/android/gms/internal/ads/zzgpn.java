package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.b.h0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import n1.c;

/* JADX INFO: loaded from: classes2.dex */
final class zzgpn extends zzgno implements RandomAccess, zzgpr, zzgrd {
    private static final zzgpn zza = new zzgpn(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    public zzgpn() {
        this(new int[10], 0, true);
    }

    private zzgpn(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.zzb = iArr;
        this.zzc = i10;
    }

    public static zzgpn zzf() {
        return zza;
    }

    private final String zzi(int i10) {
        return c.a("Index:", i10, ", Size:", this.zzc);
    }

    private final void zzj(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        zzbH();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i10));
        }
        int[] iArr = this.zzb;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[h0.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.zzb, i10, iArr2, i10 + 1, this.zzc - i10);
            this.zzb = iArr2;
        }
        this.zzb[i10] = iIntValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbH();
        byte[] bArr = zzgpw.zzd;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzgpn)) {
            return super.addAll(collection);
        }
        zzgpn zzgpnVar = (zzgpn) collection;
        int i10 = zzgpnVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.zzb;
        if (i12 > iArr.length) {
            this.zzb = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(zzgpnVar.zzb, 0, this.zzb, this.zzc, zzgpnVar.zzc);
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
        if (!(obj instanceof zzgpn)) {
            return super.equals(obj);
        }
        zzgpn zzgpnVar = (zzgpn) obj;
        if (this.zzc != zzgpnVar.zzc) {
            return false;
        }
        int[] iArr = zzgpnVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzj(i10);
        return Integer.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + this.zzb[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbH();
        zzj(i10);
        int[] iArr = this.zzb;
        int i11 = iArr[i10];
        int i12 = this.zzc;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zzbH();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzb;
        System.arraycopy(iArr, i11, iArr, i10, this.zzc - i11);
        this.zzc -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zzbH();
        zzj(i10);
        int[] iArr = this.zzb;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final int zze(int i10) {
        zzj(i10);
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgpv
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgpr zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzgpn(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final void zzh(int i10) {
        zzbH();
        int i11 = this.zzc;
        int[] iArr = this.zzb;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[h0.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i12 = this.zzc;
        this.zzc = i12 + 1;
        iArr3[i12] = i10;
    }
}
