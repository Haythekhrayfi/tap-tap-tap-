package com.google.android.gms.internal.play_billing;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzao {
    public static int zza(byte[] bArr, int i10, zzan zzanVar) throws zzci {
        int iZzj = zzj(bArr, i10, zzanVar);
        int i11 = zzanVar.zza;
        if (i11 < 0) {
            throw zzci.zzd();
        }
        if (i11 > bArr.length - iZzj) {
            throw zzci.zzg();
        }
        if (i11 == 0) {
            zzanVar.zzc = zzba.zzb;
            return iZzj;
        }
        zzanVar.zzc = zzba.zzl(bArr, iZzj, i11);
        return iZzj + i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int zzc(zzdp zzdpVar, byte[] bArr, int i10, int i11, int i12, zzan zzanVar) throws IOException {
        Object objZze = zzdpVar.zze();
        int iZzn = zzn(objZze, zzdpVar, bArr, i10, i11, i12, zzanVar);
        zzdpVar.zzf(objZze);
        zzanVar.zzc = objZze;
        return iZzn;
    }

    public static int zzd(zzdp zzdpVar, byte[] bArr, int i10, int i11, zzan zzanVar) throws IOException {
        Object objZze = zzdpVar.zze();
        int iZzo = zzo(objZze, zzdpVar, bArr, i10, i11, zzanVar);
        zzdpVar.zzf(objZze);
        zzanVar.zzc = objZze;
        return iZzo;
    }

    public static int zze(zzdp zzdpVar, int i10, byte[] bArr, int i11, int i12, zzcf zzcfVar, zzan zzanVar) throws IOException {
        int iZzd = zzd(zzdpVar, bArr, i11, i12, zzanVar);
        while (true) {
            zzcfVar.add(zzanVar.zzc);
            if (iZzd >= i12) {
                break;
            }
            int iZzj = zzj(bArr, iZzd, zzanVar);
            if (i10 != zzanVar.zza) {
                break;
            }
            iZzd = zzd(zzdpVar, bArr, iZzj, i12, zzanVar);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i10, zzcf zzcfVar, zzan zzanVar) throws IOException {
        zzcc zzccVar = (zzcc) zzcfVar;
        int iZzj = zzj(bArr, i10, zzanVar);
        int i11 = zzanVar.zza + iZzj;
        while (iZzj < i11) {
            iZzj = zzj(bArr, iZzj, zzanVar);
            zzccVar.zzf(zzanVar.zza);
        }
        if (iZzj == i11) {
            return iZzj;
        }
        throw zzci.zzg();
    }

    public static int zzg(byte[] bArr, int i10, zzan zzanVar) throws zzci {
        int iZzj = zzj(bArr, i10, zzanVar);
        int i11 = zzanVar.zza;
        if (i11 < 0) {
            throw zzci.zzd();
        }
        if (i11 == 0) {
            zzanVar.zzc = "";
            return iZzj;
        }
        zzanVar.zzc = new String(bArr, iZzj, i11, zzcg.zzb);
        return iZzj + i11;
    }

    public static int zzh(byte[] bArr, int i10, zzan zzanVar) throws zzci {
        int iZzj = zzj(bArr, i10, zzanVar);
        int i11 = zzanVar.zza;
        if (i11 < 0) {
            throw zzci.zzd();
        }
        if (i11 == 0) {
            zzanVar.zzc = "";
            return iZzj;
        }
        int i12 = zzev.zza;
        int length = bArr.length;
        if ((((length - iZzj) - i11) | iZzj | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzj), Integer.valueOf(i11)));
        }
        int i13 = iZzj + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (iZzj < i13) {
            byte b10 = bArr[iZzj];
            if (!zzer.zzd(b10)) {
                break;
            }
            iZzj++;
            cArr[i14] = (char) b10;
            i14++;
        }
        while (iZzj < i13) {
            int i15 = iZzj + 1;
            byte b11 = bArr[iZzj];
            if (zzer.zzd(b11)) {
                int i16 = i14 + 1;
                cArr[i14] = (char) b11;
                iZzj = i15;
                while (true) {
                    i14 = i16;
                    if (iZzj >= i13) {
                        break;
                    }
                    byte b12 = bArr[iZzj];
                    if (!zzer.zzd(b12)) {
                        break;
                    }
                    iZzj++;
                    i16 = i14 + 1;
                    cArr[i14] = (char) b12;
                }
            } else if (b11 < -32) {
                if (i15 >= i13) {
                    throw zzci.zzc();
                }
                zzer.zzc(b11, bArr[i15], cArr, i14);
                iZzj = i15 + 1;
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i13 - 1) {
                    throw zzci.zzc();
                }
                int i17 = i15 + 1;
                zzer.zzb(b11, bArr[i15], bArr[i17], cArr, i14);
                iZzj = i17 + 1;
                i14++;
            } else {
                if (i15 >= i13 - 2) {
                    throw zzci.zzc();
                }
                int i18 = i15 + 1;
                byte b13 = bArr[i15];
                int i19 = i18 + 1;
                zzer.zza(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                i14 += 2;
                iZzj = i19 + 1;
            }
        }
        zzanVar.zzc = new String(cArr, 0, i14);
        return i13;
    }

    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzeh zzehVar, zzan zzanVar) throws zzci {
        if ((i10 >>> 3) == 0) {
            throw zzci.zzb();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzm = zzm(bArr, i11, zzanVar);
            zzehVar.zzj(i10, Long.valueOf(zzanVar.zzb));
            return iZzm;
        }
        if (i13 == 1) {
            zzehVar.zzj(i10, Long.valueOf(zzp(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzj = zzj(bArr, i11, zzanVar);
            int i14 = zzanVar.zza;
            if (i14 < 0) {
                throw zzci.zzd();
            }
            if (i14 > bArr.length - iZzj) {
                throw zzci.zzg();
            }
            zzehVar.zzj(i10, i14 == 0 ? zzba.zzb : zzba.zzl(bArr, iZzj, i14));
            return iZzj + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzci.zzb();
            }
            zzehVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzeh zzehVarZzf = zzeh.zzf();
        int i16 = 0;
        while (i11 < i12) {
            int iZzj2 = zzj(bArr, i11, zzanVar);
            int i17 = zzanVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = iZzj2;
                break;
            }
            int iZzi = zzi(i16, bArr, iZzj2, i12, zzehVarZzf, zzanVar);
            i16 = i17;
            i11 = iZzi;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzci.zze();
        }
        zzehVar.zzj(i10, zzehVarZzf);
        return i11;
    }

    public static int zzj(byte[] bArr, int i10, zzan zzanVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zzanVar);
        }
        zzanVar.zza = b10;
        return i11;
    }

    public static int zzk(int i10, byte[] bArr, int i11, zzan zzanVar) {
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
                                zzanVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzanVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzanVar.zza = i15 | i13;
        return i14;
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzcf zzcfVar, zzan zzanVar) {
        zzcc zzccVar = (zzcc) zzcfVar;
        int iZzj = zzj(bArr, i11, zzanVar);
        while (true) {
            zzccVar.zzf(zzanVar.zza);
            if (iZzj >= i12) {
                break;
            }
            int iZzj2 = zzj(bArr, iZzj, zzanVar);
            if (i10 != zzanVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzanVar);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i10, zzan zzanVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzanVar.zzb = j10;
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
        zzanVar.zzb = j11;
        return i12;
    }

    public static int zzn(Object obj, zzdp zzdpVar, byte[] bArr, int i10, int i11, int i12, zzan zzanVar) throws IOException {
        int iZzc = ((zzdi) zzdpVar).zzc(obj, bArr, i10, i11, i12, zzanVar);
        zzanVar.zzc = obj;
        return iZzc;
    }

    public static int zzo(Object obj, zzdp zzdpVar, byte[] bArr, int i10, int i11, zzan zzanVar) throws IOException {
        int iZzk = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzk = zzk(i12, bArr, iZzk, zzanVar);
            i12 = zzanVar.zza;
        }
        int i13 = iZzk;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzci.zzg();
        }
        int i14 = i12 + i13;
        zzdpVar.zzh(obj, bArr, i13, i14, zzanVar);
        zzanVar.zzc = obj;
        return i14;
    }

    public static long zzp(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
