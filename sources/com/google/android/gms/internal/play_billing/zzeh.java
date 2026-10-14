package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeh {
    private static final zzeh zza = new zzeh(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzeh() {
        this(0, new int[8], new Object[8], true);
    }

    private zzeh(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzeh zzc() {
        return zza;
    }

    public static zzeh zze(zzeh zzehVar, zzeh zzehVar2) {
        int i10 = zzehVar.zzb + zzehVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzehVar.zzc, i10);
        System.arraycopy(zzehVar2.zzc, 0, iArrCopyOf, zzehVar.zzb, zzehVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzehVar.zzd, i10);
        System.arraycopy(zzehVar2.zzd, 0, objArrCopyOf, zzehVar.zzb, zzehVar2.zzb);
        return new zzeh(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzeh zzf() {
        return new zzeh(0, new int[8], new Object[8], true);
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
        if (obj == null || !(obj instanceof zzeh)) {
            return false;
        }
        zzeh zzehVar = (zzeh) obj;
        int i10 = this.zzb;
        if (i10 == zzehVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzehVar.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzehVar.zzd;
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
        int iZzy;
        int iZzx;
        int iZzx2;
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
                    iZzx2 = zzbi.zzx(i14 << 3) + 8;
                } else if (i15 == 2) {
                    zzba zzbaVar = (zzba) this.zzd[i12];
                    int i16 = zzbi.zzb;
                    int iZzd = zzbaVar.zzd();
                    iZzx2 = zzbi.zzx(i14 << 3) + zzbi.zzx(iZzd) + iZzd;
                } else if (i15 == 3) {
                    int i17 = i14 << 3;
                    int i18 = zzbi.zzb;
                    iZzy = ((zzeh) this.zzd[i12]).zza();
                    int iZzx3 = zzbi.zzx(i17);
                    iZzx = iZzx3 + iZzx3;
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(zzci.zza());
                    }
                    ((Integer) this.zzd[i12]).intValue();
                    iZzx2 = zzbi.zzx(i14 << 3) + 4;
                }
                i11 += iZzx2;
            } else {
                int i19 = i14 << 3;
                iZzy = zzbi.zzy(((Long) this.zzd[i12]).longValue());
                iZzx = zzbi.zzx(i19);
            }
            iZzx2 = iZzx + iZzy;
            i11 += iZzx2;
        }
        this.zze = i11;
        return i11;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzx = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzba zzbaVar = (zzba) this.zzd[i11];
            int i13 = zzbi.zzb;
            int iZzd = zzbaVar.zzd();
            int iZzx2 = zzbi.zzx(iZzd) + iZzd;
            int iZzx3 = zzbi.zzx(16);
            int iZzx4 = zzbi.zzx(i12);
            int iZzx5 = zzbi.zzx(8);
            iZzx += zzbi.zzx(24) + iZzx2 + iZzx3 + iZzx4 + iZzx5 + iZzx5;
        }
        this.zze = iZzx;
        return iZzx;
    }

    public final zzeh zzd(zzeh zzehVar) {
        if (zzehVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzehVar.zzb;
        zzl(i10);
        System.arraycopy(zzehVar.zzc, 0, this.zzc, this.zzb, zzehVar.zzb);
        System.arraycopy(zzehVar.zzd, 0, this.zzd, this.zzb, zzehVar.zzb);
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
            zzdh.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
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

    public final void zzk(zzey zzeyVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzeyVar.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzeyVar.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzeyVar.zzd(i13, (zzba) obj);
                } else if (i12 == 3) {
                    zzeyVar.zzE(i13);
                    ((zzeh) obj).zzk(zzeyVar);
                    zzeyVar.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(zzci.zza());
                    }
                    zzeyVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
