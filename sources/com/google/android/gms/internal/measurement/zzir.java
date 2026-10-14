package com.google.android.gms.internal.measurement;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzir {
    public static int zza(byte[] bArr, int i10, zziq zziqVar) throws zzko {
        int iZzj = zzj(bArr, i10, zziqVar);
        int i11 = zziqVar.zza;
        if (i11 < 0) {
            throw zzko.zzd();
        }
        if (i11 > bArr.length - iZzj) {
            throw zzko.zzf();
        }
        if (i11 == 0) {
            zziqVar.zzc = zzjd.zzb;
            return iZzj;
        }
        zziqVar.zzc = zzjd.zzl(bArr, iZzj, i11);
        return iZzj + i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzc(zzlw zzlwVar, byte[] bArr, int i10, int i11, int i12, zziq zziqVar) throws IOException {
        zzlo zzloVar = (zzlo) zzlwVar;
        Object objZze = zzloVar.zze();
        int iZzc = zzloVar.zzc(objZze, bArr, i10, i11, i12, zziqVar);
        zzloVar.zzf(objZze);
        zziqVar.zzc = objZze;
        return iZzc;
    }

    public static int zzd(zzlw zzlwVar, byte[] bArr, int i10, int i11, zziq zziqVar) throws IOException {
        int iZzk = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzk = zzk(i12, bArr, iZzk, zziqVar);
            i12 = zziqVar.zza;
        }
        int i13 = iZzk;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzko.zzf();
        }
        Object objZze = zzlwVar.zze();
        int i14 = i12 + i13;
        zzlwVar.zzh(objZze, bArr, i13, i14, zziqVar);
        zzlwVar.zzf(objZze);
        zziqVar.zzc = objZze;
        return i14;
    }

    public static int zze(zzlw zzlwVar, int i10, byte[] bArr, int i11, int i12, zzkl zzklVar, zziq zziqVar) throws IOException {
        int iZzd = zzd(zzlwVar, bArr, i11, i12, zziqVar);
        while (true) {
            zzklVar.add(zziqVar.zzc);
            if (iZzd >= i12) {
                break;
            }
            int iZzj = zzj(bArr, iZzd, zziqVar);
            if (i10 != zziqVar.zza) {
                break;
            }
            iZzd = zzd(zzlwVar, bArr, iZzj, i12, zziqVar);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i10, zzkl zzklVar, zziq zziqVar) throws IOException {
        zzkf zzkfVar = (zzkf) zzklVar;
        int iZzj = zzj(bArr, i10, zziqVar);
        int i11 = zziqVar.zza + iZzj;
        while (iZzj < i11) {
            iZzj = zzj(bArr, iZzj, zziqVar);
            zzkfVar.zzh(zziqVar.zza);
        }
        if (iZzj == i11) {
            return iZzj;
        }
        throw zzko.zzf();
    }

    public static int zzg(byte[] bArr, int i10, zziq zziqVar) throws zzko {
        int iZzj = zzj(bArr, i10, zziqVar);
        int i11 = zziqVar.zza;
        if (i11 < 0) {
            throw zzko.zzd();
        }
        if (i11 == 0) {
            zziqVar.zzc = "";
            return iZzj;
        }
        zziqVar.zzc = new String(bArr, iZzj, i11, zzkm.zzb);
        return iZzj + i11;
    }

    public static int zzh(byte[] bArr, int i10, zziq zziqVar) throws zzko {
        int iZzj = zzj(bArr, i10, zziqVar);
        int i11 = zziqVar.zza;
        if (i11 < 0) {
            throw zzko.zzd();
        }
        if (i11 == 0) {
            zziqVar.zzc = "";
            return iZzj;
        }
        zziqVar.zzc = zznc.zzd(bArr, iZzj, i11);
        return iZzj + i11;
    }

    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzmo zzmoVar, zziq zziqVar) throws zzko {
        if ((i10 >>> 3) == 0) {
            throw zzko.zzb();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzm = zzm(bArr, i11, zziqVar);
            zzmoVar.zzh(i10, Long.valueOf(zziqVar.zzb));
            return iZzm;
        }
        if (i13 == 1) {
            zzmoVar.zzh(i10, Long.valueOf(zzn(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzj = zzj(bArr, i11, zziqVar);
            int i14 = zziqVar.zza;
            if (i14 < 0) {
                throw zzko.zzd();
            }
            if (i14 > bArr.length - iZzj) {
                throw zzko.zzf();
            }
            zzmoVar.zzh(i10, i14 == 0 ? zzjd.zzb : zzjd.zzl(bArr, iZzj, i14));
            return iZzj + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzko.zzb();
            }
            zzmoVar.zzh(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzmo zzmoVarZze = zzmo.zze();
        int i16 = 0;
        while (i11 < i12) {
            int iZzj2 = zzj(bArr, i11, zziqVar);
            int i17 = zziqVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = iZzj2;
                break;
            }
            int iZzi = zzi(i16, bArr, iZzj2, i12, zzmoVarZze, zziqVar);
            i16 = i17;
            i11 = iZzi;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzko.zze();
        }
        zzmoVar.zzh(i10, zzmoVarZze);
        return i11;
    }

    public static int zzj(byte[] bArr, int i10, zziq zziqVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zziqVar);
        }
        zziqVar.zza = b10;
        return i11;
    }

    public static int zzk(int i10, byte[] bArr, int i11, zziq zziqVar) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i16 = i14 | ((b10 & Ascii.DEL) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Ascii.DEL) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Ascii.DEL) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << Ascii.FS;
                    } else {
                        int i18 = i16 | ((b13 & Ascii.DEL) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                zziqVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zziqVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zziqVar.zza = i14 | i13;
        return i15;
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzkl zzklVar, zziq zziqVar) {
        zzkf zzkfVar = (zzkf) zzklVar;
        int iZzj = zzj(bArr, i11, zziqVar);
        while (true) {
            zzkfVar.zzh(zziqVar.zza);
            if (iZzj >= i12) {
                break;
            }
            int iZzj2 = zzj(bArr, iZzj, zziqVar);
            if (i10 != zziqVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zziqVar);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i10, zziq zziqVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zziqVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & Ascii.DEL)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & Ascii.DEL)) << i13;
            b10 = b11;
            i12 = i14;
        }
        zziqVar.zzb = j11;
        return i12;
    }

    public static long zzn(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
