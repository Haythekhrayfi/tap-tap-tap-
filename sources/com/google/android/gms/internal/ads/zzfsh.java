package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfsh extends zzfrx implements Set {

    @CheckForNull
    private transient zzfsc zza;

    public static int zzh(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            zzfph.zzf(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzfsg zzj(int i10) {
        return new zzfsg(i10);
    }

    public static zzfsh zzl(Collection collection) {
        Object[] array = collection.toArray();
        return zzs(array.length, array);
    }

    public static zzfsh zzm() {
        return zzfts.zza;
    }

    public static zzfsh zzn(Object obj) {
        return new zzftz(obj);
    }

    public static zzfsh zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzs(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfsh zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzs(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfsh zzs(int i10, Object... objArr) {
        if (i10 == 0) {
            return zzfts.zza;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzftz(obj);
        }
        int iZzh = zzh(i10);
        Object[] objArr2 = new Object[iZzh];
        int i11 = iZzh - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            zzftk.zza(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iZza = zzfru.zza(iHashCode);
            while (true) {
                int i15 = iZza & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzftz(obj4);
        }
        if (zzh(i13) < iZzh / 2) {
            return zzs(i13, objArr);
        }
        if (zzt(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new zzfts(objArr, i12, objArr2, i11, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzt(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfsh) && zzr() && ((zzfsh) obj).zzr() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzfty.zzc(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfty.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public zzfsc zzd() {
        zzfsc zzfscVar = this.zza;
        if (zzfscVar != null) {
            return zzfscVar;
        }
        zzfsc zzfscVarZzi = zzi();
        this.zza = zzfscVarZzi;
        return zzfscVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze */
    public abstract zzfuc iterator();

    public zzfsc zzi() {
        Object[] array = toArray();
        int i10 = zzfsc.zzd;
        return zzfsc.zzi(array, array.length);
    }

    public boolean zzr() {
        return false;
    }
}
