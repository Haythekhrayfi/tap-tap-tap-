package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgsh {
    private static final zzgsh zza = new zzgsh(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgsh() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgsh(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzgsh zzc() {
        return zza;
    }

    public static zzgsh zze(zzgsh zzgshVar, zzgsh zzgshVar2) {
        int i10 = zzgshVar.zzb + zzgshVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgshVar.zzc, i10);
        System.arraycopy(zzgshVar2.zzc, 0, iArrCopyOf, zzgshVar.zzb, zzgshVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgshVar.zzd, i10);
        System.arraycopy(zzgshVar2.zzd, 0, objArrCopyOf, zzgshVar.zzb, zzgshVar2.zzb);
        return new zzgsh(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzgsh zzf() {
        return new zzgsh(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgsh)) {
            return false;
        }
        zzgsh zzgshVar = (zzgsh) obj;
        int i10 = this.zzb;
        if (i10 == zzgshVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgshVar.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzgshVar.zzd;
            int i12 = this.zzb;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 * 31) + i12;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return (i14 * 31) + iHashCode;
    }

    public final int zza() {
        int iZzB;
        int iZzA;
        int iZzA2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.zzd[i12]).longValue();
                    iZzA2 = zzgot.zzA(i14 << 3) + 8;
                } else if (i15 == 2) {
                    zzgoe zzgoeVar = (zzgoe) this.zzd[i12];
                    int i16 = zzgot.zzf;
                    int iZzd = zzgoeVar.zzd();
                    iZzA2 = zzgot.zzA(i14 << 3) + zzgot.zzA(iZzd) + iZzd;
                } else if (i15 == 3) {
                    int i17 = i14 << 3;
                    int i18 = zzgot.zzf;
                    iZzB = ((zzgsh) this.zzd[i12]).zza();
                    int iZzA3 = zzgot.zzA(i17);
                    iZzA = iZzA3 + iZzA3;
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(zzgpy.zza());
                    }
                    ((Integer) this.zzd[i12]).intValue();
                    iZzA2 = zzgot.zzA(i14 << 3) + 4;
                }
                i11 += iZzA2;
            } else {
                int i19 = i14 << 3;
                iZzB = zzgot.zzB(((Long) this.zzd[i12]).longValue());
                iZzA = zzgot.zzA(i19);
            }
            iZzA2 = iZzA + iZzB;
            i11 += iZzA2;
        }
        this.zze = i11;
        return i11;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzA = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzgoe zzgoeVar = (zzgoe) this.zzd[i11];
            int i13 = zzgot.zzf;
            int iZzd = zzgoeVar.zzd();
            int iZzA2 = zzgot.zzA(iZzd) + iZzd;
            int iZzA3 = zzgot.zzA(16);
            int iZzA4 = zzgot.zzA(i12);
            int iZzA5 = zzgot.zzA(8);
            iZzA += zzgot.zzA(24) + iZzA2 + iZzA3 + iZzA4 + iZzA5 + iZzA5;
        }
        this.zze = iZzA;
        return iZzA;
    }

    public final zzgsh zzd(zzgsh zzgshVar) {
        if (zzgshVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzgshVar.zzb;
        zzl(i10);
        System.arraycopy(zzgshVar.zzc, 0, this.zzc, this.zzb, zzgshVar.zzb);
        System.arraycopy(zzgshVar.zzd, 0, this.zzd, this.zzb, zzgshVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzgqy.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzj(int i10, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzgou zzgouVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzgouVar.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzgouVar.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzgouVar.zzd(i13, (zzgoe) obj);
                } else if (i12 == 3) {
                    zzgouVar.zzE(i13);
                    ((zzgsh) obj).zzk(zzgouVar);
                    zzgouVar.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(zzgpy.zza());
                    }
                    zzgouVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
