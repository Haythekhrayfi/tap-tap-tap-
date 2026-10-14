package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgnr {
    public static int zza(byte[] bArr, int i10, zzgnq zzgnqVar) throws zzgpy {
        int iZzj = zzj(bArr, i10, zzgnqVar);
        int i11 = zzgnqVar.zza;
        if (i11 < 0) {
            throw zzgpy.zzf();
        }
        if (i11 > bArr.length - iZzj) {
            throw zzgpy.zzj();
        }
        if (i11 == 0) {
            zzgnqVar.zzc = zzgoe.zzb;
            return iZzj;
        }
        zzgnqVar.zzc = zzgoe.zzv(bArr, iZzj, i11);
        return iZzj + i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int zzc(zzgrp zzgrpVar, byte[] bArr, int i10, int i11, int i12, zzgnq zzgnqVar) throws IOException {
        Object objZze = zzgrpVar.zze();
        int iZzn = zzn(objZze, zzgrpVar, bArr, i10, i11, i12, zzgnqVar);
        zzgrpVar.zzf(objZze);
        zzgnqVar.zzc = objZze;
        return iZzn;
    }

    public static int zzd(zzgrp zzgrpVar, byte[] bArr, int i10, int i11, zzgnq zzgnqVar) throws IOException {
        Object objZze = zzgrpVar.zze();
        int iZzo = zzo(objZze, zzgrpVar, bArr, i10, i11, zzgnqVar);
        zzgrpVar.zzf(objZze);
        zzgnqVar.zzc = objZze;
        return iZzo;
    }

    public static int zze(zzgrp zzgrpVar, int i10, byte[] bArr, int i11, int i12, zzgpv zzgpvVar, zzgnq zzgnqVar) throws IOException {
        int iZzd = zzd(zzgrpVar, bArr, i11, i12, zzgnqVar);
        while (true) {
            zzgpvVar.add(zzgnqVar.zzc);
            if (iZzd >= i12) {
                break;
            }
            int iZzj = zzj(bArr, iZzd, zzgnqVar);
            if (i10 != zzgnqVar.zza) {
                break;
            }
            iZzd = zzd(zzgrpVar, bArr, iZzj, i12, zzgnqVar);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i10, zzgpv zzgpvVar, zzgnq zzgnqVar) throws IOException {
        zzgpn zzgpnVar = (zzgpn) zzgpvVar;
        int iZzj = zzj(bArr, i10, zzgnqVar);
        int i11 = zzgnqVar.zza + iZzj;
        while (iZzj < i11) {
            iZzj = zzj(bArr, iZzj, zzgnqVar);
            zzgpnVar.zzh(zzgnqVar.zza);
        }
        if (iZzj == i11) {
            return iZzj;
        }
        throw zzgpy.zzj();
    }

    public static int zzg(byte[] bArr, int i10, zzgnq zzgnqVar) throws zzgpy {
        int iZzj = zzj(bArr, i10, zzgnqVar);
        int i11 = zzgnqVar.zza;
        if (i11 < 0) {
            throw zzgpy.zzf();
        }
        if (i11 == 0) {
            zzgnqVar.zzc = "";
            return iZzj;
        }
        zzgnqVar.zzc = new String(bArr, iZzj, i11, zzgpw.zzb);
        return iZzj + i11;
    }

    public static int zzh(byte[] bArr, int i10, zzgnq zzgnqVar) throws zzgpy {
        int iZzj = zzj(bArr, i10, zzgnqVar);
        int i11 = zzgnqVar.zza;
        if (i11 < 0) {
            throw zzgpy.zzf();
        }
        if (i11 == 0) {
            zzgnqVar.zzc = "";
            return iZzj;
        }
        zzgnqVar.zzc = zzgsv.zzh(bArr, iZzj, i11);
        return iZzj + i11;
    }

    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzgsh zzgshVar, zzgnq zzgnqVar) throws zzgpy {
        if ((i10 >>> 3) == 0) {
            throw zzgpy.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzm = zzm(bArr, i11, zzgnqVar);
            zzgshVar.zzj(i10, Long.valueOf(zzgnqVar.zzb));
            return iZzm;
        }
        if (i13 == 1) {
            zzgshVar.zzj(i10, Long.valueOf(zzp(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzj = zzj(bArr, i11, zzgnqVar);
            int i14 = zzgnqVar.zza;
            if (i14 < 0) {
                throw zzgpy.zzf();
            }
            if (i14 > bArr.length - iZzj) {
                throw zzgpy.zzj();
            }
            zzgshVar.zzj(i10, i14 == 0 ? zzgoe.zzb : zzgoe.zzv(bArr, iZzj, i14));
            return iZzj + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzgpy.zzc();
            }
            zzgshVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzgsh zzgshVarZzf = zzgsh.zzf();
        int i16 = 0;
        while (i11 < i12) {
            int iZzj2 = zzj(bArr, i11, zzgnqVar);
            int i17 = zzgnqVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = iZzj2;
                break;
            }
            int iZzi = zzi(i16, bArr, iZzj2, i12, zzgshVarZzf, zzgnqVar);
            i16 = i17;
            i11 = iZzi;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzgpy.zzg();
        }
        zzgshVar.zzj(i10, zzgshVarZzf);
        return i11;
    }

    public static int zzj(byte[] bArr, int i10, zzgnq zzgnqVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zzgnqVar);
        }
        zzgnqVar.zza = b10;
        return i11;
    }

    public static int zzk(int i10, byte[] bArr, int i11, zzgnq zzgnqVar) {
        int i12;
        int i13;
        byte b10 = bArr[i11];
        int i14 = i11 + 1;
        int i15 = i10 & 127;
        if (b10 < 0) {
            int i16 = i15 | ((b10 & Ascii.DEL) << 7);
            int i17 = i14 + 1;
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i15 = i16 | ((b11 & Ascii.DEL) << 14);
                i14 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i15 | ((b12 & Ascii.DEL) << 21);
                    i17 = i14 + 1;
                    byte b13 = bArr[i14];
                    if (b13 >= 0) {
                        i12 = b13 << Ascii.FS;
                    } else {
                        int i18 = i16 | ((b13 & Ascii.DEL) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                zzgnqVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzgnqVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzgnqVar.zza = i15 | i13;
        return i14;
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzgpv zzgpvVar, zzgnq zzgnqVar) {
        zzgpn zzgpnVar = (zzgpn) zzgpvVar;
        int iZzj = zzj(bArr, i11, zzgnqVar);
        while (true) {
            zzgpnVar.zzh(zzgnqVar.zza);
            if (iZzj >= i12) {
                break;
            }
            int iZzj2 = zzj(bArr, iZzj, zzgnqVar);
            if (i10 != zzgnqVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzgnqVar);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i10, zzgnq zzgnqVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzgnqVar.zzb = j10;
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
            i12 = i14;
            b10 = b11;
        }
        zzgnqVar.zzb = j11;
        return i12;
    }

    public static int zzn(Object obj, zzgrp zzgrpVar, byte[] bArr, int i10, int i11, int i12, zzgnq zzgnqVar) throws IOException {
        int iZzc = ((zzgqz) zzgrpVar).zzc(obj, bArr, i10, i11, i12, zzgnqVar);
        zzgnqVar.zzc = obj;
        return iZzc;
    }

    public static int zzo(Object obj, zzgrp zzgrpVar, byte[] bArr, int i10, int i11, zzgnq zzgnqVar) throws IOException {
        int iZzk = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzk = zzk(i12, bArr, iZzk, zzgnqVar);
            i12 = zzgnqVar.zza;
        }
        int i13 = iZzk;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzgpy.zzj();
        }
        int i14 = i12 + i13;
        zzgrpVar.zzi(obj, bArr, i13, i14, zzgnqVar);
        zzgnqVar.zzc = obj;
        return i14;
    }

    public static long zzp(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
