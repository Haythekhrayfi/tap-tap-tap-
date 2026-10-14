package com.google.android.gms.internal.auth;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzdt {
    public static int zza(byte[] bArr, int i10, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i10, zzdsVar);
        int i11 = zzdsVar.zza;
        if (i11 < 0) {
            throw zzfa.zzc();
        }
        if (i11 > bArr.length - iZzj) {
            throw zzfa.zzf();
        }
        if (i11 == 0) {
            zzdsVar.zzc = zzee.zzb;
            return iZzj;
        }
        zzdsVar.zzc = zzee.zzk(bArr, iZzj, i11);
        return iZzj + i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzc(zzgh zzghVar, byte[] bArr, int i10, int i11, int i12, zzds zzdsVar) throws IOException {
        zzfz zzfzVar = (zzfz) zzghVar;
        Object objZzd = zzfzVar.zzd();
        int iZzb = zzfzVar.zzb(objZzd, bArr, i10, i11, i12, zzdsVar);
        zzfzVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return iZzb;
    }

    public static int zzd(zzgh zzghVar, byte[] bArr, int i10, int i11, zzds zzdsVar) throws IOException {
        int iZzk = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzk = zzk(i12, bArr, iZzk, zzdsVar);
            i12 = zzdsVar.zza;
        }
        int i13 = iZzk;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzfa.zzf();
        }
        Object objZzd = zzghVar.zzd();
        int i14 = i12 + i13;
        zzghVar.zzg(objZzd, bArr, i13, i14, zzdsVar);
        zzghVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return i14;
    }

    public static int zze(zzgh zzghVar, int i10, byte[] bArr, int i11, int i12, zzey zzeyVar, zzds zzdsVar) throws IOException {
        int iZzd = zzd(zzghVar, bArr, i11, i12, zzdsVar);
        while (true) {
            zzeyVar.add(zzdsVar.zzc);
            if (iZzd >= i12) {
                break;
            }
            int iZzj = zzj(bArr, iZzd, zzdsVar);
            if (i10 != zzdsVar.zza) {
                break;
            }
            iZzd = zzd(zzghVar, bArr, iZzj, i12, zzdsVar);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i10, zzey zzeyVar, zzds zzdsVar) throws IOException {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i10, zzdsVar);
        int i11 = zzdsVar.zza + iZzj;
        while (iZzj < i11) {
            iZzj = zzj(bArr, iZzj, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        if (iZzj == i11) {
            return iZzj;
        }
        throw zzfa.zzf();
    }

    public static int zzg(byte[] bArr, int i10, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i10, zzdsVar);
        int i11 = zzdsVar.zza;
        if (i11 < 0) {
            throw zzfa.zzc();
        }
        if (i11 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = new String(bArr, iZzj, i11, zzez.zzb);
        return iZzj + i11;
    }

    public static int zzh(byte[] bArr, int i10, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i10, zzdsVar);
        int i11 = zzdsVar.zza;
        if (i11 < 0) {
            throw zzfa.zzc();
        }
        if (i11 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = zzhm.zzb(bArr, iZzj, i11);
        return iZzj + i11;
    }

    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzgz zzgzVar, zzds zzdsVar) throws zzfa {
        if ((i10 >>> 3) == 0) {
            throw zzfa.zza();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzm = zzm(bArr, i11, zzdsVar);
            zzgzVar.zzf(i10, Long.valueOf(zzdsVar.zzb));
            return iZzm;
        }
        if (i13 == 1) {
            zzgzVar.zzf(i10, Long.valueOf(zzn(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzj = zzj(bArr, i11, zzdsVar);
            int i14 = zzdsVar.zza;
            if (i14 < 0) {
                throw zzfa.zzc();
            }
            if (i14 > bArr.length - iZzj) {
                throw zzfa.zzf();
            }
            zzgzVar.zzf(i10, i14 == 0 ? zzee.zzb : zzee.zzk(bArr, iZzj, i14));
            return iZzj + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzfa.zza();
            }
            zzgzVar.zzf(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzgz zzgzVarZzc = zzgz.zzc();
        int i16 = 0;
        while (i11 < i12) {
            int iZzj2 = zzj(bArr, i11, zzdsVar);
            int i17 = zzdsVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = iZzj2;
                break;
            }
            int iZzi = zzi(i16, bArr, iZzj2, i12, zzgzVarZzc, zzdsVar);
            i16 = i17;
            i11 = iZzi;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzfa.zzd();
        }
        zzgzVar.zzf(i10, zzgzVarZzc);
        return i11;
    }

    public static int zzj(byte[] bArr, int i10, zzds zzdsVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zzdsVar);
        }
        zzdsVar.zza = b10;
        return i11;
    }

    public static int zzk(int i10, byte[] bArr, int i11, zzds zzdsVar) {
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
                                zzdsVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzdsVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzdsVar.zza = i14 | i13;
        return i15;
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i11, zzdsVar);
        while (true) {
            zzevVar.zze(zzdsVar.zza);
            if (iZzj >= i12) {
                break;
            }
            int iZzj2 = zzj(bArr, iZzj, zzdsVar);
            if (i10 != zzdsVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzdsVar);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i10, zzds zzdsVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzdsVar.zzb = j10;
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
        zzdsVar.zzb = j11;
        return i12;
    }

    public static long zzn(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
