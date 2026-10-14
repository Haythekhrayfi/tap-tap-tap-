package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfrl extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();

    @CheckForNull
    public transient int[] zza;

    @CheckForNull
    public transient Object[] zzb;

    @CheckForNull
    public transient Object[] zzc;

    @CheckForNull
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;

    @CheckForNull
    private transient Set zzh;

    @CheckForNull
    private transient Set zzi;

    @CheckForNull
    private transient Collection zzj;

    public zzfrl() {
        zzm(3);
    }

    public zzfrl(int i10) {
        zzm(8);
    }

    public static /* synthetic */ Object zzh(zzfrl zzfrlVar) {
        Object obj = zzfrlVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzp() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzq(@CheckForNull Object obj) {
        if (zzo()) {
            return -1;
        }
        int iZzb = zzfru.zzb(obj);
        int iZzp = zzp();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzc = zzfrm.zzc(obj2, iZzb & iZzp);
        if (iZzc != 0) {
            int i10 = ~iZzp;
            int i11 = iZzb & i10;
            do {
                int i12 = iZzc - 1;
                int[] iArr = this.zza;
                Objects.requireNonNull(iArr);
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.zzb;
                    Objects.requireNonNull(objArr);
                    if (zzfpc.zza(obj, objArr[i12])) {
                        return i12;
                    }
                }
                iZzc = i13 & iZzp;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzr(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objZzd = zzfrm.zzd(i11);
        if (i13 != 0) {
            zzfrm.zze(objZzd, i12 & i14, i13 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        for (int i15 = 0; i15 <= i10; i15++) {
            int iZzc = zzfrm.zzc(obj, i15);
            while (iZzc != 0) {
                int i16 = iZzc - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iZzc2 = zzfrm.zzc(objZzd, i19);
                zzfrm.zze(objZzd, i19, iZzc);
                iArr[i16] = ((~i14) & i18) | (iZzc2 & i14);
                iZzc = i17 & i10;
            }
        }
        this.zze = objZzd;
        zzt(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzs(@CheckForNull Object obj) {
        if (zzo()) {
            return zzd;
        }
        int iZzp = zzp();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        int iZzb = zzfrm.zzb(obj, null, iZzp, obj2, iArr, objArr, null);
        if (iZzb == -1) {
            return zzd;
        }
        Object[] objArr2 = this.zzc;
        Objects.requireNonNull(objArr2);
        Object obj3 = objArr2[iZzb];
        zzn(iZzb, iZzp);
        this.zzg--;
        zzl();
        return obj3;
    }

    private final void zzt(int i10) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzo()) {
            return;
        }
        zzl();
        Map mapZzj = zzj();
        if (mapZzj == null) {
            Object[] objArr = this.zzb;
            Objects.requireNonNull(objArr);
            Arrays.fill(objArr, 0, this.zzg, (Object) null);
            Object[] objArr2 = this.zzc;
            Objects.requireNonNull(objArr2);
            Arrays.fill(objArr2, 0, this.zzg, (Object) null);
            Object obj = this.zze;
            Objects.requireNonNull(obj);
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.zza;
            Objects.requireNonNull(iArr);
            Arrays.fill(iArr, 0, this.zzg, 0);
        } else {
            this.zzf = zzfuk.zzb(size(), 3, 1073741823);
            mapZzj.clear();
            this.zze = null;
        }
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map mapZzj = zzj();
        if (mapZzj != null) {
            return mapZzj.containsKey(obj);
        }
        return zzq(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map mapZzj = zzj();
        if (mapZzj != null) {
            return mapZzj.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.zzg; i10++) {
            Object[] objArr = this.zzc;
            Objects.requireNonNull(objArr);
            if (zzfpc.zza(obj, objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzfrf zzfrfVar = new zzfrf(this);
        this.zzi = zzfrfVar;
        return zzfrfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Map mapZzj = zzj();
        if (mapZzj != null) {
            return mapZzj.get(obj);
        }
        int iZzq = zzq(obj);
        if (iZzq == -1) {
            return null;
        }
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr[iZzq];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzfri zzfriVar = new zzfri(this);
        this.zzh = zzfriVar;
        return zzfriVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0077 A[EDGE_INSN: B:15:0x0077->B:37:0x00f2 BREAK  A[LOOP:0: B:18:0x008e->B:44:0x014b]] */
    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (zzo()) {
            zzfph.zzi(zzo(), "Arrays already allocated");
            int i10 = this.zzf;
            int iMax = Math.max(i10 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzfrm.zzd(iMax2);
            zzt(iMax2 - 1);
            this.zza = new int[i10];
            this.zzb = new Object[i10];
            this.zzc = new Object[i10];
        }
        Map mapZzj = zzj();
        if (mapZzj != null) {
            return mapZzj.put(obj, obj2);
        }
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = this.zzc;
        Objects.requireNonNull(objArr2);
        int i11 = this.zzg;
        int i12 = i11 + 1;
        int iZzb = zzfru.zzb(obj);
        int iZzp = zzp();
        int i13 = iZzb & iZzp;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzc = zzfrm.zzc(obj3, i13);
        if (iZzc != 0) {
            int i14 = ~iZzp;
            int i15 = iZzb & i14;
            int i16 = 0;
            while (true) {
                int i17 = iZzc - 1;
                int i18 = iArr[i17];
                int i19 = i18 & i14;
                if (i19 == i15 && zzfpc.zza(obj, objArr[i17])) {
                    Object obj4 = objArr2[i17];
                    objArr2[i17] = obj2;
                    return obj4;
                }
                int i20 = i18 & iZzp;
                i16++;
                if (i20 == 0) {
                    if (i16 < 9) {
                        if (i12 <= iZzp) {
                            iArr[i17] = (i12 & iZzp) | i19;
                            break;
                        }
                        iZzp = zzr(iZzp, zzfrm.zza(iZzp), iZzb, i11);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzp() + 1, 1.0f);
                    int iZze = zze();
                    while (iZze >= 0) {
                        Object[] objArr3 = this.zzb;
                        Objects.requireNonNull(objArr3);
                        Object obj5 = objArr3[iZze];
                        Object[] objArr4 = this.zzc;
                        Objects.requireNonNull(objArr4);
                        linkedHashMap.put(obj5, objArr4[iZze]);
                        iZze = zzf(iZze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzl();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzc = i20;
            }
        } else {
            if (i12 > iZzp) {
                iZzp = zzr(iZzp, zzfrm.zza(iZzp), iZzb, i11);
                break;
            }
            Object obj6 = this.zze;
            Objects.requireNonNull(obj6);
            zzfrm.zze(obj6, i13, i12);
        }
        int[] iArr2 = this.zza;
        Objects.requireNonNull(iArr2);
        int length = iArr2.length;
        if (i12 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.zza;
            Objects.requireNonNull(iArr3);
            this.zza = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.zzb;
            Objects.requireNonNull(objArr5);
            this.zzb = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.zzc;
            Objects.requireNonNull(objArr6);
            this.zzc = Arrays.copyOf(objArr6, iMin);
        }
        int i21 = (~iZzp) & iZzb;
        int[] iArr4 = this.zza;
        Objects.requireNonNull(iArr4);
        iArr4[i11] = i21;
        Object[] objArr7 = this.zzb;
        Objects.requireNonNull(objArr7);
        objArr7[i11] = obj;
        Object[] objArr8 = this.zzc;
        Objects.requireNonNull(objArr8);
        objArr8[i11] = obj2;
        this.zzg = i12;
        zzl();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        Map mapZzj = zzj();
        if (mapZzj != null) {
            return mapZzj.remove(obj);
        }
        Object objZzs = zzs(obj);
        if (objZzs == zzd) {
            return null;
        }
        return objZzs;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzj = zzj();
        return mapZzj != null ? mapZzj.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzfrk zzfrkVar = new zzfrk(this);
        this.zzj = zzfrkVar;
        return zzfrkVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.zzg) {
            return i11;
        }
        return -1;
    }

    @CheckForNull
    public final Map zzj() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzl() {
        this.zzf += 32;
    }

    public final void zzm(int i10) {
        this.zzf = zzfuk.zzb(8, 1, 1073741823);
    }

    public final void zzn(int i10, int i11) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = this.zzc;
        Objects.requireNonNull(objArr2);
        int size = size() - 1;
        if (i10 >= size) {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
            return;
        }
        Object obj2 = objArr[size];
        objArr[i10] = obj2;
        objArr2[i10] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        iArr[i10] = iArr[size];
        iArr[size] = 0;
        int iZzb = zzfru.zzb(obj2) & i11;
        int iZzc = zzfrm.zzc(obj, iZzb);
        int i12 = size + 1;
        if (iZzc == i12) {
            zzfrm.zze(obj, iZzb, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iZzc - 1;
            int i14 = iArr[i13];
            int i15 = i14 & i11;
            if (i15 == i12) {
                iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                return;
            }
            iZzc = i15;
        }
    }

    public final boolean zzo() {
        return this.zze == null;
    }
}
