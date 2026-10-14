package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaem {
    public static final zzaek zza = new zzaek() { // from class: com.google.android.gms.internal.ads.zzaej
    };

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec A[SYNTHETIC] */
    public static final zzbz zza(byte[] bArr, int i10, zzaek zzaekVar, zzadn zzadnVar) throws Throwable {
        String strA;
        boolean z10;
        zzael zzaelVar;
        int i11;
        int iZze;
        zzaen zzaenVarZzf;
        ArrayList arrayList = new ArrayList();
        zzfa zzfaVar = new zzfa(bArr, i10);
        boolean z11 = false;
        if (zzfaVar.zza() < 10) {
            strA = "Data too short to be an ID3 tag";
        } else {
            int iZzm = zzfaVar.zzm();
            if (iZzm == 4801587) {
                int iZzk = zzfaVar.zzk();
                zzfaVar.zzG(1);
                int iZzk2 = zzfaVar.zzk();
                int iZzj = zzfaVar.zzj();
                if (iZzk != 2) {
                    if (iZzk == 3) {
                        if ((iZzk2 & 64) != 0) {
                            int iZze2 = zzfaVar.zze();
                            zzfaVar.zzG(iZze2);
                            iZzj -= iZze2 + 4;
                        }
                    } else if (iZzk == 4) {
                        if ((iZzk2 & 64) != 0) {
                            int iZzj2 = zzfaVar.zzj();
                            zzfaVar.zzG(iZzj2 - 4);
                            iZzj -= iZzj2;
                        }
                        if ((iZzk2 & 16) != 0) {
                            iZzj -= 10;
                        }
                    } else {
                        strA = android.support.v4.media.a.a("Skipped ID3 tag with unsupported majorVersion=", iZzk);
                    }
                    if (iZzk < 4) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    zzaelVar = new zzael(iZzk, z10, iZzj);
                } else if ((iZzk2 & 64) != 0) {
                    strA = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                } else {
                    if (iZzk < 4 || (iZzk2 & 128) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zzaelVar = new zzael(iZzk, z10, iZzj);
                }
                if (zzaelVar == null) {
                    return null;
                }
                int iZzc = zzfaVar.zzc();
                i11 = zzaelVar.zza == 2 ? 6 : 10;
                iZze = zzaelVar.zzc;
                if (zzaelVar.zzb) {
                    iZze = zze(zzfaVar, zzaelVar.zzc);
                }
                zzfaVar.zzE(iZzc + iZze);
                if (!zzk(zzfaVar, zzaelVar.zza, i11, false)) {
                    if (zzaelVar.zza == 4 || !zzk(zzfaVar, 4, i11, true)) {
                        zzer.zzf("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + zzaelVar.zza);
                        return null;
                    }
                    z11 = true;
                }
                while (zzfaVar.zza() >= i11) {
                    zzaenVarZzf = zzf(zzaelVar.zza, zzfaVar, z11, i11, zzaekVar);
                    if (zzaenVarZzf != null) {
                        arrayList.add(zzaenVarZzf);
                    }
                }
                return new zzbz(arrayList);
            }
            strA = "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(iZzm))));
        }
        zzer.zzf("Id3Decoder", strA);
        zzaelVar = null;
        if (zzaelVar == null) {
            return null;
        }
        int iZzc2 = zzfaVar.zzc();
        if (zzaelVar.zza == 2) {
        }
        iZze = zzaelVar.zzc;
        if (zzaelVar.zzb) {
            iZze = zze(zzfaVar, zzaelVar.zzc);
        }
        zzfaVar.zzE(iZzc2 + iZze);
        if (!zzk(zzfaVar, zzaelVar.zza, i11, false)) {
            if (zzaelVar.zza == 4) {
            }
            zzer.zzf("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + zzaelVar.zza);
            return null;
        }
        while (zzfaVar.zza() >= i11) {
            zzaenVarZzf = zzf(zzaelVar.zza, zzfaVar, z11, i11, zzaekVar);
            if (zzaenVarZzf != null) {
                arrayList.add(zzaenVarZzf);
            }
        }
        return new zzbz(arrayList);
    }

    private static int zzb(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i10, int i11) {
        int iZzd = zzd(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iZzd;
        }
        while (true) {
            int length = bArr.length;
            if (iZzd >= length - 1) {
                return length;
            }
            if ((iZzd - i10) % 2 == 0 && bArr[iZzd + 1] == 0) {
                return iZzd;
            }
            iZzd = zzd(bArr, iZzd + 1);
        }
    }

    private static int zzd(byte[] bArr, int i10) {
        while (true) {
            int length = bArr.length;
            if (i10 >= length) {
                return length;
            }
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
    }

    private static int zze(zzfa zzfaVar, int i10) {
        byte[] bArrZzH = zzfaVar.zzH();
        int iZzc = zzfaVar.zzc();
        int i11 = iZzc;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iZzc + i10) {
                return i10;
            }
            if ((bArrZzH[i11] & 255) == 255 && bArrZzH[i12] == 0) {
                System.arraycopy(bArrZzH, i11 + 2, bArrZzH, i12, (i10 - (i11 - iZzc)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0250  */
    /* JADX WARN: Code duplicated, block: B:132:0x0254  */
    /* JADX WARN: Code duplicated, block: B:136:0x025b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x0279 A[Catch: all -> 0x0511, TryCatch #0 {all -> 0x0511, blocks: (B:224:0x04ec, B:125:0x0211, B:141:0x0267, B:143:0x0279, B:150:0x02ba, B:147:0x029b, B:149:0x02b4, B:162:0x02fc, B:171:0x0343, B:174:0x0378, B:177:0x0389, B:178:0x0391, B:180:0x0397, B:182:0x039e, B:183:0x03a2, B:190:0x03c4, B:194:0x03f1, B:196:0x03fb, B:197:0x042e, B:198:0x043a, B:200:0x0440, B:202:0x0447, B:203:0x044b, B:207:0x0460, B:216:0x048b, B:218:0x04b5, B:219:0x04c4, B:222:0x04db), top: B:236:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0297  */
    /* JADX WARN: Code duplicated, block: B:147:0x029b A[Catch: all -> 0x0511, TryCatch #0 {all -> 0x0511, blocks: (B:224:0x04ec, B:125:0x0211, B:141:0x0267, B:143:0x0279, B:150:0x02ba, B:147:0x029b, B:149:0x02b4, B:162:0x02fc, B:171:0x0343, B:174:0x0378, B:177:0x0389, B:178:0x0391, B:180:0x0397, B:182:0x039e, B:183:0x03a2, B:190:0x03c4, B:194:0x03f1, B:196:0x03fb, B:197:0x042e, B:198:0x043a, B:200:0x0440, B:202:0x0447, B:203:0x044b, B:207:0x0460, B:216:0x048b, B:218:0x04b5, B:219:0x04c4, B:222:0x04db), top: B:236:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:149:0x02b4 A[Catch: all -> 0x0511, TryCatch #0 {all -> 0x0511, blocks: (B:224:0x04ec, B:125:0x0211, B:141:0x0267, B:143:0x0279, B:150:0x02ba, B:147:0x029b, B:149:0x02b4, B:162:0x02fc, B:171:0x0343, B:174:0x0378, B:177:0x0389, B:178:0x0391, B:180:0x0397, B:182:0x039e, B:183:0x03a2, B:190:0x03c4, B:194:0x03f1, B:196:0x03fb, B:197:0x042e, B:198:0x043a, B:200:0x0440, B:202:0x0447, B:203:0x044b, B:207:0x0460, B:216:0x048b, B:218:0x04b5, B:219:0x04c4, B:222:0x04db), top: B:236:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:151:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:165:0x0337 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x0339  */
    /* JADX WARN: Code duplicated, block: B:185:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:208:0x0471  */
    /* JADX WARN: Code duplicated, block: B:210:0x0479  */
    /* JADX WARN: Code duplicated, block: B:212:0x047f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0487  */
    /* JADX WARN: Code duplicated, block: B:220:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:221:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:224:0x04ec A[Catch: all -> 0x0511, TRY_LEAVE, TryCatch #0 {all -> 0x0511, blocks: (B:224:0x04ec, B:125:0x0211, B:141:0x0267, B:143:0x0279, B:150:0x02ba, B:147:0x029b, B:149:0x02b4, B:162:0x02fc, B:171:0x0343, B:174:0x0378, B:177:0x0389, B:178:0x0391, B:180:0x0397, B:182:0x039e, B:183:0x03a2, B:190:0x03c4, B:194:0x03f1, B:196:0x03fb, B:197:0x042e, B:198:0x043a, B:200:0x0440, B:202:0x0447, B:203:0x044b, B:207:0x0460, B:216:0x048b, B:218:0x04b5, B:219:0x04c4, B:222:0x04db), top: B:236:0x00ed }] */
    /* JADX WARN: Instruction removed from duplicated block: B:224:0x04ec, please report this as an issue */
    private static zzaen zzf(int i10, zzfa zzfaVar, boolean z10, int i11, zzaek zzaekVar) throws Throwable {
        int iZzn;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        boolean z13;
        int i14;
        String str;
        int i15;
        int i16;
        int i17;
        boolean z14;
        byte[] bArr;
        int iZzd;
        String strZza;
        int iZzk = zzfaVar.zzk();
        int iZzk2 = zzfaVar.zzk();
        int iZzk3 = zzfaVar.zzk();
        int iZzk4 = i10 >= 3 ? zzfaVar.zzk() : 0;
        if (i10 == 4) {
            iZzn = zzfaVar.zzn();
            if (!z10) {
                iZzn = ((iZzn >> 24) << 21) | (iZzn & 255) | (((iZzn >> 8) & 255) << 7) | (((iZzn >> 16) & 255) << 14);
            }
        } else {
            iZzn = i10 == 3 ? zzfaVar.zzn() : zzfaVar.zzm();
        }
        int iZzo = i10 >= 3 ? zzfaVar.zzo() : 0;
        zzaen zzaeaVar = null;
        if (iZzk != 0 || iZzk2 != 0 || iZzk3 != 0 || iZzk4 != 0 || iZzn != 0 || iZzo != 0) {
            int iZzc = zzfaVar.zzc() + iZzn;
            if (iZzc <= zzfaVar.zzd()) {
                if (zzaekVar != null) {
                    zzfaVar.zzF(iZzc);
                    return null;
                }
                if (i10 == 3) {
                    i12 = (iZzo & 128) != 0 ? 1 : 0;
                    boolean z15 = (iZzo & 64) != 0;
                    z11 = (iZzo & 32) != 0;
                    z12 = z15;
                    z13 = false;
                    i13 = i12;
                } else if (i10 == 4) {
                    boolean z16 = (iZzo & 64) != 0;
                    i13 = (iZzo & 8) != 0 ? 1 : 0;
                    z12 = (iZzo & 4) != 0;
                    z13 = (iZzo & 2) != 0;
                    int i18 = iZzo & 1;
                    z11 = z16;
                    i12 = i18;
                } else {
                    i12 = 0;
                    z11 = false;
                    i13 = 0;
                    z12 = false;
                    z13 = false;
                }
                if (i13 != 0 || z12) {
                    zzer.zzf("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
                    zzfaVar.zzF(iZzc);
                    return null;
                }
                if (z11) {
                    zzfaVar.zzG(1);
                    iZzn--;
                }
                if (i12 != 0) {
                    zzfaVar.zzG(4);
                    iZzn -= 4;
                }
                if (z13) {
                    iZzn = zze(zzfaVar, iZzn);
                }
                try {
                    try {
                        if (iZzk != 84 || iZzk2 != 88 || iZzk3 != 88 || (i10 != 2 && iZzk4 != 88)) {
                            if (iZzk == 84) {
                                String strZzi = zzi(i10, 84, iZzk2, iZzk3, iZzk4);
                                if (iZzn > 0) {
                                    int iZzk5 = zzfaVar.zzk();
                                    int i19 = iZzn - 1;
                                    byte[] bArr2 = new byte[i19];
                                    zzfaVar.zzB(bArr2, 0, i19);
                                    zzaeaVar = new zzaev(strZzi, null, zzg(bArr2, iZzk5, 0));
                                }
                                str = "Id3Decoder";
                                i16 = iZzk4;
                                iZzc = iZzc;
                                if (zzaeaVar == null) {
                                    zzer.zzf(str, "Failed to decode frame: id=" + zzi(i10, iZzk, iZzk2, iZzk3, i16) + ", frameSize=" + iZzn);
                                }
                                zzfaVar.zzF(iZzc);
                                return zzaeaVar;
                            }
                            if (iZzk != 87) {
                                i14 = iZzk;
                            } else if (iZzk2 != 88 || iZzk3 != 88 || (i10 != 2 && iZzk4 != 88)) {
                                i14 = 87;
                            } else if (iZzn > 0) {
                                int iZzk6 = zzfaVar.zzk();
                                int i20 = iZzn - 1;
                                byte[] bArr3 = new byte[i20];
                                zzfaVar.zzB(bArr3, 0, i20);
                                int iZzc2 = zzc(bArr3, 0, iZzk6);
                                String str2 = new String(bArr3, 0, iZzc2, zzj(iZzk6));
                                int iZzb = iZzc2 + zzb(iZzk6);
                                zzaeaVar = new zzaex("WXXX", str2, zzh(bArr3, iZzb, zzd(bArr3, iZzb), zzfot.zzb));
                            }
                            if (i14 != 87) {
                                if (i14 == 80) {
                                    if (iZzk2 == 82 && iZzk3 == 73 && iZzk4 == 86) {
                                        byte[] bArr4 = new byte[iZzn];
                                        zzfaVar.zzB(bArr4, 0, iZzn);
                                        int iZzd2 = zzd(bArr4, 0);
                                        zzaeaVar = new zzaet(new String(bArr4, 0, iZzd2, zzfot.zzb), zzl(bArr4, iZzd2 + 1, iZzn));
                                    } else {
                                        i14 = 80;
                                    }
                                }
                                if (i14 != 71) {
                                    if (i10 == 2) {
                                        if (i14 != 80 && iZzk2 == 73 && iZzk3 == 67) {
                                            int iZzk7 = zzfaVar.zzk();
                                            Charset charsetZzj = zzj(iZzk7);
                                            int i21 = iZzn - 1;
                                            bArr = new byte[i21];
                                            zzfaVar.zzB(bArr, 0, i21);
                                            if (i10 == 2) {
                                                strZza = "image/".concat(String.valueOf(zzfon.zza(new String(bArr, 0, 3, zzfot.zzb))));
                                                if ("image/jpg".equals(strZza)) {
                                                    strZza = "image/jpeg";
                                                }
                                                iZzd = 2;
                                            } else {
                                                iZzd = zzd(bArr, 0);
                                                strZza = zzfon.zza(new String(bArr, 0, iZzd, zzfot.zzb));
                                                if (strZza.indexOf(47) == -1) {
                                                    strZza = "image/".concat(strZza);
                                                }
                                            }
                                            int i22 = bArr[iZzd + 1] & 255;
                                            int i23 = iZzd + 2;
                                            int iZzc3 = zzc(bArr, i23, iZzk7);
                                            str = "Id3Decoder";
                                            iZzk = iZzk;
                                            zzaeaVar = new zzady(strZza, new String(bArr, i23, iZzc3 - i23, charsetZzj), i22, zzl(bArr, iZzc3 + zzb(iZzk7), i21));
                                        } else {
                                            iZzk = iZzk;
                                            str = "Id3Decoder";
                                            if (i14 != 67 && iZzk2 == 79 && iZzk3 == 77 && (iZzk4 == 77 || i10 == 2)) {
                                                if (iZzn < 4) {
                                                    iZzk2 = iZzk2;
                                                    iZzk3 = iZzk3;
                                                    i16 = iZzk4;
                                                    zzaeaVar = null;
                                                } else {
                                                    int iZzk8 = zzfaVar.zzk();
                                                    Charset charsetZzj2 = zzj(iZzk8);
                                                    byte[] bArr5 = new byte[3];
                                                    zzfaVar.zzB(bArr5, 0, 3);
                                                    String str3 = new String(bArr5, 0, 3);
                                                    int i24 = iZzn - 4;
                                                    byte[] bArr6 = new byte[i24];
                                                    zzfaVar.zzB(bArr6, 0, i24);
                                                    int iZzc4 = zzc(bArr6, 0, iZzk8);
                                                    String str4 = new String(bArr6, 0, iZzc4, charsetZzj2);
                                                    int iZzb2 = iZzc4 + zzb(iZzk8);
                                                    zzaeaVar = new zzaeg(str3, str4, zzh(bArr6, iZzb2, zzc(bArr6, iZzb2, iZzk8), charsetZzj2));
                                                }
                                            } else if (i14 != 67 && iZzk2 == 72 && iZzk3 == 65 && iZzk4 == 80) {
                                                int iZzc5 = zzfaVar.zzc();
                                                int iZzd3 = zzd(zzfaVar.zzH(), iZzc5);
                                                String str5 = new String(zzfaVar.zzH(), iZzc5, iZzd3 - iZzc5, zzfot.zzb);
                                                zzfaVar.zzF(iZzd3 + 1);
                                                int iZze = zzfaVar.zze();
                                                int iZze2 = zzfaVar.zze();
                                                long jZzs = zzfaVar.zzs();
                                                if (jZzs == 4294967295L) {
                                                    jZzs = -1;
                                                }
                                                long j10 = jZzs;
                                                long jZzs2 = zzfaVar.zzs();
                                                if (jZzs2 == 4294967295L) {
                                                    jZzs2 = -1;
                                                }
                                                long j11 = jZzs2;
                                                ArrayList arrayList = new ArrayList();
                                                int i25 = iZzc5 + iZzn;
                                                while (zzfaVar.zzc() < i25) {
                                                    zzaen zzaenVarZzf = zzf(i10, zzfaVar, z10, i11, null);
                                                    if (zzaenVarZzf != null) {
                                                        arrayList.add(zzaenVarZzf);
                                                    }
                                                }
                                                zzaeaVar = new zzaec(str5, iZze, iZze2, j10, j11, (zzaen[]) arrayList.toArray(new zzaen[0]));
                                            } else if (i14 != 67 && iZzk2 == 84 && iZzk3 == 79 && iZzk4 == 67) {
                                                int iZzc6 = zzfaVar.zzc();
                                                int iZzd4 = zzd(zzfaVar.zzH(), iZzc6);
                                                String str6 = new String(zzfaVar.zzH(), iZzc6, iZzd4 - iZzc6, zzfot.zzb);
                                                zzfaVar.zzF(iZzd4 + 1);
                                                int iZzk9 = zzfaVar.zzk();
                                                if ((iZzk9 & 2) != 0) {
                                                    i17 = 1;
                                                    z14 = true;
                                                } else {
                                                    i17 = 1;
                                                    z14 = false;
                                                }
                                                int i26 = iZzk9 & i17;
                                                int iZzk10 = zzfaVar.zzk();
                                                String[] strArr = new String[iZzk10];
                                                int i27 = 0;
                                                while (i27 < iZzk10) {
                                                    int iZzc7 = zzfaVar.zzc();
                                                    int iZzd5 = zzd(zzfaVar.zzH(), iZzc7);
                                                    strArr[i27] = new String(zzfaVar.zzH(), iZzc7, iZzd5 - iZzc7, zzfot.zzb);
                                                    zzfaVar.zzF(iZzd5 + 1);
                                                    i27++;
                                                    iZzk10 = iZzk10;
                                                    iZzk4 = iZzk4;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                int i28 = iZzk2;
                                                int i29 = iZzk3;
                                                int i30 = iZzk4;
                                                ArrayList arrayList2 = new ArrayList();
                                                int i31 = iZzc6 + iZzn;
                                                while (zzfaVar.zzc() < i31) {
                                                    zzaen zzaenVarZzf2 = zzf(i10, zzfaVar, z10, i11, null);
                                                    if (zzaenVarZzf2 != null) {
                                                        arrayList2.add(zzaenVarZzf2);
                                                    }
                                                }
                                                zzaeaVar = new zzaee(str6, z14, 1 == i26, strArr, (zzaen[]) arrayList2.toArray(new zzaen[0]));
                                                i16 = i30;
                                                iZzk3 = i29;
                                                iZzk2 = i28;
                                            } else {
                                                i15 = iZzk4;
                                                if (i14 == 77) {
                                                    iZzk2 = iZzk2;
                                                    if (iZzk2 == 76) {
                                                        iZzk3 = iZzk3;
                                                        i16 = i15;
                                                        if (iZzk3 != 76 && i16 == 84) {
                                                            int iZzo2 = zzfaVar.zzo();
                                                            int iZzm = zzfaVar.zzm();
                                                            int iZzm2 = zzfaVar.zzm();
                                                            int iZzk11 = zzfaVar.zzk();
                                                            int iZzk12 = zzfaVar.zzk();
                                                            zzez zzezVar = new zzez();
                                                            zzezVar.zzh(zzfaVar);
                                                            int i32 = ((iZzn - 10) * 8) / (iZzk11 + iZzk12);
                                                            int[] iArr = new int[i32];
                                                            int[] iArr2 = new int[i32];
                                                            for (int i33 = 0; i33 < i32; i33++) {
                                                                int iZzd6 = zzezVar.zzd(iZzk11);
                                                                int iZzd7 = zzezVar.zzd(iZzk12);
                                                                iArr[i33] = iZzd6;
                                                                iArr2[i33] = iZzd7;
                                                            }
                                                            zzaeaVar = new zzaer(iZzo2, iZzm, iZzm2, iArr, iArr2);
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                    }
                                                } else {
                                                    i16 = i15;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                String strZzi2 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                byte[] bArr7 = new byte[iZzn];
                                                zzfaVar.zzB(bArr7, 0, iZzn);
                                                zzaeaVar = new zzaea(strZzi2, bArr7);
                                            }
                                        }
                                        if (zzaeaVar == null) {
                                            zzer.zzf(str, "Failed to decode frame: id=" + zzi(i10, iZzk, iZzk2, iZzk3, i16) + ", frameSize=" + iZzn);
                                        }
                                        zzfaVar.zzF(iZzc);
                                        return zzaeaVar;
                                    }
                                    if (i14 == 65 || iZzk2 != 80 || iZzk3 != 73 || iZzk4 != 67) {
                                        iZzk = iZzk;
                                        str = "Id3Decoder";
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                            }
                                            if (i14 != 67) {
                                                i15 = iZzk4;
                                                if (i14 == 77) {
                                                    iZzk2 = iZzk2;
                                                    if (iZzk2 == 76) {
                                                        iZzk3 = iZzk3;
                                                        i16 = i15;
                                                        if (iZzk3 != 76) {
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                    }
                                                } else {
                                                    i16 = i15;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                String strZzi3 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                byte[] bArr8 = new byte[iZzn];
                                                zzfaVar.zzB(bArr8, 0, iZzn);
                                                zzaeaVar = new zzaea(strZzi3, bArr8);
                                            } else {
                                                i15 = iZzk4;
                                                if (i14 == 77) {
                                                    iZzk2 = iZzk2;
                                                    if (iZzk2 == 76) {
                                                        iZzk3 = iZzk3;
                                                        i16 = i15;
                                                        if (iZzk3 != 76) {
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                    }
                                                } else {
                                                    i16 = i15;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                String strZzi4 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                byte[] bArr9 = new byte[iZzn];
                                                zzfaVar.zzB(bArr9, 0, iZzn);
                                                zzaeaVar = new zzaea(strZzi4, bArr9);
                                            }
                                        } else {
                                            if (i14 != 67) {
                                            }
                                            if (i14 != 67) {
                                                i15 = iZzk4;
                                                if (i14 == 77) {
                                                    iZzk2 = iZzk2;
                                                    if (iZzk2 == 76) {
                                                        iZzk3 = iZzk3;
                                                        i16 = i15;
                                                        if (iZzk3 != 76) {
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                    }
                                                } else {
                                                    i16 = i15;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                String strZzi5 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                byte[] bArr10 = new byte[iZzn];
                                                zzfaVar.zzB(bArr10, 0, iZzn);
                                                zzaeaVar = new zzaea(strZzi5, bArr10);
                                            } else {
                                                i15 = iZzk4;
                                                if (i14 == 77) {
                                                    iZzk2 = iZzk2;
                                                    if (iZzk2 == 76) {
                                                        iZzk3 = iZzk3;
                                                        i16 = i15;
                                                        if (iZzk3 != 76) {
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                    }
                                                } else {
                                                    i16 = i15;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                String strZzi6 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                byte[] bArr11 = new byte[iZzn];
                                                zzfaVar.zzB(bArr11, 0, iZzn);
                                                zzaeaVar = new zzaea(strZzi6, bArr11);
                                            }
                                        }
                                        if (zzaeaVar == null) {
                                            zzer.zzf(str, "Failed to decode frame: id=" + zzi(i10, iZzk, iZzk2, iZzk3, i16) + ", frameSize=" + iZzn);
                                        }
                                        zzfaVar.zzF(iZzc);
                                        return zzaeaVar;
                                    }
                                    int iZzk13 = zzfaVar.zzk();
                                    Charset charsetZzj3 = zzj(iZzk13);
                                    int i210 = iZzn - 1;
                                    bArr = new byte[i210];
                                    zzfaVar.zzB(bArr, 0, i210);
                                    if (i10 == 2) {
                                        strZza = "image/".concat(String.valueOf(zzfon.zza(new String(bArr, 0, 3, zzfot.zzb))));
                                        if ("image/jpg".equals(strZza)) {
                                            strZza = "image/jpeg";
                                        }
                                        iZzd = 2;
                                    } else {
                                        iZzd = zzd(bArr, 0);
                                        strZza = zzfon.zza(new String(bArr, 0, iZzd, zzfot.zzb));
                                        if (strZza.indexOf(47) == -1) {
                                            strZza = "image/".concat(strZza);
                                        }
                                    }
                                    int i211 = bArr[iZzd + 1] & 255;
                                    int i212 = iZzd + 2;
                                    int iZzc8 = zzc(bArr, i212, iZzk13);
                                    str = "Id3Decoder";
                                    iZzk = iZzk;
                                    zzaeaVar = new zzady(strZza, new String(bArr, i212, iZzc8 - i212, charsetZzj3), i211, zzl(bArr, iZzc8 + zzb(iZzk13), i210));
                                } else {
                                    if (iZzk2 != 69 || iZzk3 != 79) {
                                        i14 = 71;
                                        if (i10 == 2) {
                                            if (i14 != 80) {
                                            }
                                            iZzk = iZzk;
                                            str = "Id3Decoder";
                                            if (i14 != 67) {
                                                if (i14 != 67) {
                                                }
                                                if (i14 != 67) {
                                                    i15 = iZzk4;
                                                    if (i14 == 77) {
                                                        iZzk2 = iZzk2;
                                                        if (iZzk2 == 76) {
                                                            iZzk3 = iZzk3;
                                                            i16 = i15;
                                                            if (iZzk3 != 76) {
                                                            }
                                                        } else {
                                                            i16 = i15;
                                                            iZzk3 = iZzk3;
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                        iZzk2 = iZzk2;
                                                    }
                                                    String strZzi7 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                    byte[] bArr12 = new byte[iZzn];
                                                    zzfaVar.zzB(bArr12, 0, iZzn);
                                                    zzaeaVar = new zzaea(strZzi7, bArr12);
                                                } else {
                                                    i15 = iZzk4;
                                                    if (i14 == 77) {
                                                        iZzk2 = iZzk2;
                                                        if (iZzk2 == 76) {
                                                            iZzk3 = iZzk3;
                                                            i16 = i15;
                                                            if (iZzk3 != 76) {
                                                            }
                                                        } else {
                                                            i16 = i15;
                                                            iZzk3 = iZzk3;
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                        iZzk2 = iZzk2;
                                                    }
                                                    String strZzi8 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                    byte[] bArr13 = new byte[iZzn];
                                                    zzfaVar.zzB(bArr13, 0, iZzn);
                                                    zzaeaVar = new zzaea(strZzi8, bArr13);
                                                }
                                            } else {
                                                if (i14 != 67) {
                                                }
                                                if (i14 != 67) {
                                                    i15 = iZzk4;
                                                    if (i14 == 77) {
                                                        iZzk2 = iZzk2;
                                                        if (iZzk2 == 76) {
                                                            iZzk3 = iZzk3;
                                                            i16 = i15;
                                                            if (iZzk3 != 76) {
                                                            }
                                                        } else {
                                                            i16 = i15;
                                                            iZzk3 = iZzk3;
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                        iZzk2 = iZzk2;
                                                    }
                                                    String strZzi9 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                    byte[] bArr14 = new byte[iZzn];
                                                    zzfaVar.zzB(bArr14, 0, iZzn);
                                                    zzaeaVar = new zzaea(strZzi9, bArr14);
                                                } else {
                                                    i15 = iZzk4;
                                                    if (i14 == 77) {
                                                        iZzk2 = iZzk2;
                                                        if (iZzk2 == 76) {
                                                            iZzk3 = iZzk3;
                                                            i16 = i15;
                                                            if (iZzk3 != 76) {
                                                            }
                                                        } else {
                                                            i16 = i15;
                                                            iZzk3 = iZzk3;
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                        iZzk2 = iZzk2;
                                                    }
                                                    String strZzi10 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                    byte[] bArr15 = new byte[iZzn];
                                                    zzfaVar.zzB(bArr15, 0, iZzn);
                                                    zzaeaVar = new zzaea(strZzi10, bArr15);
                                                }
                                            }
                                            if (zzaeaVar == null) {
                                                zzer.zzf(str, "Failed to decode frame: id=" + zzi(i10, iZzk, iZzk2, iZzk3, i16) + ", frameSize=" + iZzn);
                                            }
                                            zzfaVar.zzF(iZzc);
                                            return zzaeaVar;
                                        }
                                        if (i14 == 65) {
                                        }
                                        iZzk = iZzk;
                                        str = "Id3Decoder";
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                            }
                                            if (i14 != 67) {
                                                i15 = iZzk4;
                                                if (i14 == 77) {
                                                    iZzk2 = iZzk2;
                                                    if (iZzk2 == 76) {
                                                        iZzk3 = iZzk3;
                                                        i16 = i15;
                                                        if (iZzk3 != 76) {
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                    }
                                                } else {
                                                    i16 = i15;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                String strZzi11 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                byte[] bArr16 = new byte[iZzn];
                                                zzfaVar.zzB(bArr16, 0, iZzn);
                                                zzaeaVar = new zzaea(strZzi11, bArr16);
                                            } else {
                                                i15 = iZzk4;
                                                if (i14 == 77) {
                                                    iZzk2 = iZzk2;
                                                    if (iZzk2 == 76) {
                                                        iZzk3 = iZzk3;
                                                        i16 = i15;
                                                        if (iZzk3 != 76) {
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                    }
                                                } else {
                                                    i16 = i15;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                String strZzi12 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                byte[] bArr17 = new byte[iZzn];
                                                zzfaVar.zzB(bArr17, 0, iZzn);
                                                zzaeaVar = new zzaea(strZzi12, bArr17);
                                            }
                                        } else {
                                            if (i14 != 67) {
                                            }
                                            if (i14 != 67) {
                                                i15 = iZzk4;
                                                if (i14 == 77) {
                                                    iZzk2 = iZzk2;
                                                    if (iZzk2 == 76) {
                                                        iZzk3 = iZzk3;
                                                        i16 = i15;
                                                        if (iZzk3 != 76) {
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                    }
                                                } else {
                                                    i16 = i15;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                String strZzi13 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                byte[] bArr18 = new byte[iZzn];
                                                zzfaVar.zzB(bArr18, 0, iZzn);
                                                zzaeaVar = new zzaea(strZzi13, bArr18);
                                            } else {
                                                i15 = iZzk4;
                                                if (i14 == 77) {
                                                    iZzk2 = iZzk2;
                                                    if (iZzk2 == 76) {
                                                        iZzk3 = iZzk3;
                                                        i16 = i15;
                                                        if (iZzk3 != 76) {
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                    }
                                                } else {
                                                    i16 = i15;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                String strZzi14 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                byte[] bArr19 = new byte[iZzn];
                                                zzfaVar.zzB(bArr19, 0, iZzn);
                                                zzaeaVar = new zzaea(strZzi14, bArr19);
                                            }
                                        }
                                        if (zzaeaVar == null) {
                                            zzer.zzf(str, "Failed to decode frame: id=" + zzi(i10, iZzk, iZzk2, iZzk3, i16) + ", frameSize=" + iZzn);
                                        }
                                        zzfaVar.zzF(iZzc);
                                        return zzaeaVar;
                                    }
                                    if (iZzk4 != 66 && i10 != 2) {
                                        i14 = 71;
                                        if (i10 == 2) {
                                            if (i14 != 80) {
                                            }
                                            iZzk = iZzk;
                                            str = "Id3Decoder";
                                            if (i14 != 67) {
                                                if (i14 != 67) {
                                                }
                                                if (i14 != 67) {
                                                    i15 = iZzk4;
                                                    if (i14 == 77) {
                                                        iZzk2 = iZzk2;
                                                        if (iZzk2 == 76) {
                                                            iZzk3 = iZzk3;
                                                            i16 = i15;
                                                            if (iZzk3 != 76) {
                                                            }
                                                        } else {
                                                            i16 = i15;
                                                            iZzk3 = iZzk3;
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                        iZzk2 = iZzk2;
                                                    }
                                                    String strZzi15 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                    byte[] bArr110 = new byte[iZzn];
                                                    zzfaVar.zzB(bArr110, 0, iZzn);
                                                    zzaeaVar = new zzaea(strZzi15, bArr110);
                                                } else {
                                                    i15 = iZzk4;
                                                    if (i14 == 77) {
                                                        iZzk2 = iZzk2;
                                                        if (iZzk2 == 76) {
                                                            iZzk3 = iZzk3;
                                                            i16 = i15;
                                                            if (iZzk3 != 76) {
                                                            }
                                                        } else {
                                                            i16 = i15;
                                                            iZzk3 = iZzk3;
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                        iZzk2 = iZzk2;
                                                    }
                                                    String strZzi16 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                    byte[] bArr111 = new byte[iZzn];
                                                    zzfaVar.zzB(bArr111, 0, iZzn);
                                                    zzaeaVar = new zzaea(strZzi16, bArr111);
                                                }
                                            } else {
                                                if (i14 != 67) {
                                                }
                                                if (i14 != 67) {
                                                    i15 = iZzk4;
                                                    if (i14 == 77) {
                                                        iZzk2 = iZzk2;
                                                        if (iZzk2 == 76) {
                                                            iZzk3 = iZzk3;
                                                            i16 = i15;
                                                            if (iZzk3 != 76) {
                                                            }
                                                        } else {
                                                            i16 = i15;
                                                            iZzk3 = iZzk3;
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                        iZzk2 = iZzk2;
                                                    }
                                                    String strZzi17 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                    byte[] bArr112 = new byte[iZzn];
                                                    zzfaVar.zzB(bArr112, 0, iZzn);
                                                    zzaeaVar = new zzaea(strZzi17, bArr112);
                                                } else {
                                                    i15 = iZzk4;
                                                    if (i14 == 77) {
                                                        iZzk2 = iZzk2;
                                                        if (iZzk2 == 76) {
                                                            iZzk3 = iZzk3;
                                                            i16 = i15;
                                                            if (iZzk3 != 76) {
                                                            }
                                                        } else {
                                                            i16 = i15;
                                                            iZzk3 = iZzk3;
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                        iZzk2 = iZzk2;
                                                    }
                                                    String strZzi18 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                    byte[] bArr113 = new byte[iZzn];
                                                    zzfaVar.zzB(bArr113, 0, iZzn);
                                                    zzaeaVar = new zzaea(strZzi18, bArr113);
                                                }
                                            }
                                            if (zzaeaVar == null) {
                                                zzer.zzf(str, "Failed to decode frame: id=" + zzi(i10, iZzk, iZzk2, iZzk3, i16) + ", frameSize=" + iZzn);
                                            }
                                            zzfaVar.zzF(iZzc);
                                            return zzaeaVar;
                                        }
                                        if (i14 == 65) {
                                        }
                                        iZzk = iZzk;
                                        str = "Id3Decoder";
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                            }
                                            if (i14 != 67) {
                                                i15 = iZzk4;
                                                if (i14 == 77) {
                                                    iZzk2 = iZzk2;
                                                    if (iZzk2 == 76) {
                                                        iZzk3 = iZzk3;
                                                        i16 = i15;
                                                        if (iZzk3 != 76) {
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                    }
                                                } else {
                                                    i16 = i15;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                String strZzi19 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                byte[] bArr114 = new byte[iZzn];
                                                zzfaVar.zzB(bArr114, 0, iZzn);
                                                zzaeaVar = new zzaea(strZzi19, bArr114);
                                            } else {
                                                i15 = iZzk4;
                                                if (i14 == 77) {
                                                    iZzk2 = iZzk2;
                                                    if (iZzk2 == 76) {
                                                        iZzk3 = iZzk3;
                                                        i16 = i15;
                                                        if (iZzk3 != 76) {
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                    }
                                                } else {
                                                    i16 = i15;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                String strZzi110 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                byte[] bArr115 = new byte[iZzn];
                                                zzfaVar.zzB(bArr115, 0, iZzn);
                                                zzaeaVar = new zzaea(strZzi110, bArr115);
                                            }
                                        } else {
                                            if (i14 != 67) {
                                            }
                                            if (i14 != 67) {
                                                i15 = iZzk4;
                                                if (i14 == 77) {
                                                    iZzk2 = iZzk2;
                                                    if (iZzk2 == 76) {
                                                        iZzk3 = iZzk3;
                                                        i16 = i15;
                                                        if (iZzk3 != 76) {
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                    }
                                                } else {
                                                    i16 = i15;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                String strZzi111 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                byte[] bArr116 = new byte[iZzn];
                                                zzfaVar.zzB(bArr116, 0, iZzn);
                                                zzaeaVar = new zzaea(strZzi111, bArr116);
                                            } else {
                                                i15 = iZzk4;
                                                if (i14 == 77) {
                                                    iZzk2 = iZzk2;
                                                    if (iZzk2 == 76) {
                                                        iZzk3 = iZzk3;
                                                        i16 = i15;
                                                        if (iZzk3 != 76) {
                                                        }
                                                    } else {
                                                        i16 = i15;
                                                        iZzk3 = iZzk3;
                                                    }
                                                } else {
                                                    i16 = i15;
                                                    iZzk3 = iZzk3;
                                                    iZzk2 = iZzk2;
                                                }
                                                String strZzi112 = zzi(i10, i14, iZzk2, iZzk3, i16);
                                                byte[] bArr117 = new byte[iZzn];
                                                zzfaVar.zzB(bArr117, 0, iZzn);
                                                zzaeaVar = new zzaea(strZzi112, bArr117);
                                            }
                                        }
                                        if (zzaeaVar == null) {
                                            zzer.zzf(str, "Failed to decode frame: id=" + zzi(i10, iZzk, iZzk2, iZzk3, i16) + ", frameSize=" + iZzn);
                                        }
                                        zzfaVar.zzF(iZzc);
                                        return zzaeaVar;
                                    }
                                    int iZzk14 = zzfaVar.zzk();
                                    Charset charsetZzj4 = zzj(iZzk14);
                                    int i34 = iZzn - 1;
                                    byte[] bArr20 = new byte[i34];
                                    zzfaVar.zzB(bArr20, 0, i34);
                                    int iZzd8 = zzd(bArr20, 0);
                                    iZzc = iZzc;
                                    String str7 = new String(bArr20, 0, iZzd8, zzfot.zzb);
                                    int i35 = iZzd8 + 1;
                                    int iZzc9 = zzc(bArr20, i35, iZzk14);
                                    String strZzh = zzh(bArr20, i35, iZzc9, charsetZzj4);
                                    int iZzb3 = iZzc9 + zzb(iZzk14);
                                    int iZzc10 = zzc(bArr20, iZzb3, iZzk14);
                                    iZzk = iZzk;
                                    zzaeaVar = new zzaei(str7, strZzh, zzh(bArr20, iZzb3, iZzc10, charsetZzj4), zzl(bArr20, iZzc10 + zzb(iZzk14), i34));
                                    str = "Id3Decoder";
                                }
                                i16 = iZzk4;
                                if (zzaeaVar == null) {
                                    zzer.zzf(str, "Failed to decode frame: id=" + zzi(i10, iZzk, iZzk2, iZzk3, i16) + ", frameSize=" + iZzn);
                                }
                                zzfaVar.zzF(iZzc);
                                return zzaeaVar;
                            }
                            String strZzi20 = zzi(i10, 87, iZzk2, iZzk3, iZzk4);
                            byte[] bArr21 = new byte[iZzn];
                            zzfaVar.zzB(bArr21, 0, iZzn);
                            zzaeaVar = new zzaex(strZzi20, null, new String(bArr21, 0, zzd(bArr21, 0), zzfot.zzb));
                        } else if (iZzn > 0) {
                            int iZzk15 = zzfaVar.zzk();
                            int i36 = iZzn - 1;
                            byte[] bArr22 = new byte[i36];
                            zzfaVar.zzB(bArr22, 0, i36);
                            int iZzc11 = zzc(bArr22, 0, iZzk15);
                            zzaeaVar = new zzaev("TXXX", new String(bArr22, 0, iZzc11, zzj(iZzk15)), zzg(bArr22, iZzk15, iZzc11 + zzb(iZzk15)));
                        }
                        str = "Id3Decoder";
                        i16 = iZzk4;
                        iZzc = iZzc;
                        if (zzaeaVar == null) {
                            zzer.zzf(str, "Failed to decode frame: id=" + zzi(i10, iZzk, iZzk2, iZzk3, i16) + ", frameSize=" + iZzn);
                        }
                        zzfaVar.zzF(iZzc);
                        return zzaeaVar;
                    } catch (Throwable th) {
                        th = th;
                        iZzc = iZzc;
                        zzfaVar.zzF(iZzc);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zzfaVar.zzF(iZzc);
                    throw th;
                }
            }
            zzer.zzf("Id3Decoder", "Frame size exceeds remaining tag data");
        }
        zzfaVar.zzF(zzfaVar.zzd());
        return null;
    }

    private static zzfsc zzg(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return zzfsc.zzm("");
        }
        zzfrz zzfrzVar = new zzfrz();
        while (true) {
            int iZzc = zzc(bArr, i11, i10);
            if (i11 >= iZzc) {
                break;
            }
            zzfrzVar.zzf(new String(bArr, i11, iZzc - i11, zzj(i10)));
            i11 = zzb(i10) + iZzc;
        }
        zzfsc zzfscVarZzi = zzfrzVar.zzi();
        return zzfscVarZzi.isEmpty() ? zzfsc.zzm("") : zzfscVarZzi;
    }

    private static String zzh(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static String zzi(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static Charset zzj(int i10) {
        if (i10 == 1) {
            return zzfot.zzf;
        }
        if (i10 != 2) {
            return i10 != 3 ? zzfot.zzb : zzfot.zzc;
        }
        return zzfot.zzd;
    }

    private static boolean zzk(zzfa zzfaVar, int i10, int i11, boolean z10) {
        int iZzm;
        long jZzm;
        int iZzo;
        int i12;
        int iZzc = zzfaVar.zzc();
        while (true) {
            try {
                int i13 = 1;
                if (zzfaVar.zza() < i11) {
                    zzfaVar.zzF(iZzc);
                    return true;
                }
                if (i10 >= 3) {
                    iZzm = zzfaVar.zze();
                    jZzm = zzfaVar.zzs();
                    iZzo = zzfaVar.zzo();
                } else {
                    iZzm = zzfaVar.zzm();
                    jZzm = zzfaVar.zzm();
                    iZzo = 0;
                }
                if (iZzm == 0 && jZzm == 0 && iZzo == 0) {
                    zzfaVar.zzF(iZzc);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jZzm) != 0) {
                        zzfaVar.zzF(iZzc);
                        return false;
                    }
                    jZzm = ((jZzm >> 24) << 21) | (((jZzm >> 16) & 255) << 14) | (jZzm & 255) | (((jZzm >> 8) & 255) << 7);
                }
                if (i10 == 4) {
                    i13 = iZzo & 1;
                    i12 = (iZzo & 64) == 0 ? 0 : 1;
                } else if (i10 == 3) {
                    i12 = (iZzo & 32) != 0 ? 1 : 0;
                    if ((iZzo & 128) == 0) {
                        i13 = 0;
                    }
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                if (i13 != 0) {
                    i12 += 4;
                }
                if (jZzm < i12) {
                    zzfaVar.zzF(iZzc);
                    return false;
                }
                if (zzfaVar.zza() < jZzm) {
                    zzfaVar.zzF(iZzc);
                    return false;
                }
                zzfaVar.zzG((int) jZzm);
            } catch (Throwable th) {
                zzfaVar.zzF(iZzc);
                throw th;
            }
        }
    }

    private static byte[] zzl(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? zzfj.zzf : Arrays.copyOfRange(bArr, i10, i11);
    }
}
