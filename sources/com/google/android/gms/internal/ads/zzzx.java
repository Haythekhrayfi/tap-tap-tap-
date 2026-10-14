package com.google.android.gms.internal.ads;

import ch.qos.logback.core.net.SyslogConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzx {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, SyslogConstants.LOG_LOCAL4, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b10 = bArr[4];
            return zzf((b10 & 192) >> 6, b10 & 63);
        }
        int i10 = bArr[2] & 7;
        int i11 = ((bArr[3] & 255) | (i10 << 8)) + 1;
        return i11 + i11;
    }

    public static zzam zzc(zzfa zzfaVar, String str, String str2, zzad zzadVar) {
        zzez zzezVar = new zzez();
        zzezVar.zzh(zzfaVar);
        int i10 = zzc[zzezVar.zzd(2)];
        zzezVar.zzl(8);
        int i11 = zze[zzezVar.zzd(3)];
        if (zzezVar.zzd(1) != 0) {
            i11++;
        }
        int i12 = zzf[zzezVar.zzd(5)] * 1000;
        zzezVar.zze();
        zzfaVar.zzF(zzezVar.zzb());
        zzak zzakVar = new zzak();
        zzakVar.zzH(str);
        zzakVar.zzS("audio/ac3");
        zzakVar.zzw(i11);
        zzakVar.zzT(i10);
        zzakVar.zzB(zzadVar);
        zzakVar.zzK(str2);
        zzakVar.zzv(i12);
        zzakVar.zzO(i12);
        return zzakVar.zzY();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static zzam zzd(zzfa zzfaVar, String str, String str2, zzad zzadVar) {
        String str3;
        zzez zzezVar = new zzez();
        zzezVar.zzh(zzfaVar);
        int iZzd = zzezVar.zzd(13) * 1000;
        zzezVar.zzl(3);
        int i10 = zzc[zzezVar.zzd(2)];
        zzezVar.zzl(10);
        int i11 = zze[zzezVar.zzd(3)];
        if (zzezVar.zzd(1) != 0) {
            i11++;
        }
        zzezVar.zzl(3);
        int iZzd2 = zzezVar.zzd(4);
        zzezVar.zzl(1);
        if (iZzd2 > 0) {
            zzezVar.zzm(6);
            if (zzezVar.zzd(1) != 0) {
                i11 += 2;
            }
            zzezVar.zzl(1);
        }
        if (zzezVar.zza() > 7) {
            zzezVar.zzl(7);
            if (zzezVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        zzezVar.zze();
        zzfaVar.zzF(zzezVar.zzb());
        zzak zzakVar = new zzak();
        zzakVar.zzH(str);
        zzakVar.zzS(str3);
        zzakVar.zzw(i11);
        zzakVar.zzT(i10);
        zzakVar.zzB(zzadVar);
        zzakVar.zzK(str2);
        zzakVar.zzO(iZzd);
        return zzakVar.zzY();
    }

    public static zzzw zze(zzez zzezVar) {
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iZzc = zzezVar.zzc();
        zzezVar.zzl(40);
        int iZzd = zzezVar.zzd(5);
        zzezVar.zzj(iZzc);
        int i21 = -1;
        if (iZzd > 10) {
            zzezVar.zzl(16);
            int iZzd2 = zzezVar.zzd(2);
            if (iZzd2 == 0) {
                i21 = 0;
            } else if (iZzd2 == 1) {
                i21 = 1;
            } else if (iZzd2 == 2) {
                i21 = 2;
            }
            zzezVar.zzl(3);
            int iZzd3 = zzezVar.zzd(11) + 1;
            int iZzd4 = zzezVar.zzd(2);
            if (iZzd4 == 3) {
                i17 = zzd[zzezVar.zzd(2)];
                i18 = 6;
                i16 = 3;
            } else {
                int iZzd5 = zzezVar.zzd(2);
                int i22 = zzb[iZzd5];
                i16 = iZzd5;
                i17 = zzc[iZzd4];
                i18 = i22;
            }
            int i23 = iZzd3 + iZzd3;
            int i24 = (i23 * i17) / (i18 * 32);
            int iZzd6 = zzezVar.zzd(3);
            boolean zZzn = zzezVar.zzn();
            i10 = zze[iZzd6] + (zZzn ? 1 : 0);
            zzezVar.zzl(10);
            if (zzezVar.zzn()) {
                zzezVar.zzl(8);
            }
            if (iZzd6 == 0) {
                zzezVar.zzl(5);
                if (zzezVar.zzn()) {
                    zzezVar.zzl(8);
                }
                i19 = 0;
                iZzd6 = 0;
            } else {
                i19 = iZzd6;
            }
            if (i21 == 1) {
                if (zzezVar.zzn()) {
                    zzezVar.zzl(16);
                }
                i20 = 1;
            } else {
                i20 = i21;
            }
            if (zzezVar.zzn()) {
                if (i19 > 2) {
                    zzezVar.zzl(2);
                }
                if ((i19 & 1) != 0 && i19 > 2) {
                    zzezVar.zzl(6);
                }
                if ((i19 & 4) != 0) {
                    zzezVar.zzl(6);
                }
                if (zZzn && zzezVar.zzn()) {
                    zzezVar.zzl(5);
                }
                if (i20 == 0) {
                    if (zzezVar.zzn()) {
                        zzezVar.zzl(6);
                    }
                    if (i19 == 0 && zzezVar.zzn()) {
                        zzezVar.zzl(6);
                    }
                    if (zzezVar.zzn()) {
                        zzezVar.zzl(6);
                    }
                    int iZzd7 = zzezVar.zzd(2);
                    if (iZzd7 == 1) {
                        zzezVar.zzl(5);
                    } else if (iZzd7 == 2) {
                        zzezVar.zzl(12);
                    } else if (iZzd7 == 3) {
                        int iZzd8 = zzezVar.zzd(5);
                        if (zzezVar.zzn()) {
                            zzezVar.zzl(5);
                            if (zzezVar.zzn()) {
                                zzezVar.zzl(4);
                            }
                            if (zzezVar.zzn()) {
                                zzezVar.zzl(4);
                            }
                            if (zzezVar.zzn()) {
                                zzezVar.zzl(4);
                            }
                            if (zzezVar.zzn()) {
                                zzezVar.zzl(4);
                            }
                            if (zzezVar.zzn()) {
                                zzezVar.zzl(4);
                            }
                            if (zzezVar.zzn()) {
                                zzezVar.zzl(4);
                            }
                            if (zzezVar.zzn()) {
                                zzezVar.zzl(4);
                            }
                            if (zzezVar.zzn()) {
                                if (zzezVar.zzn()) {
                                    zzezVar.zzl(4);
                                }
                                if (zzezVar.zzn()) {
                                    zzezVar.zzl(4);
                                }
                            }
                        }
                        if (zzezVar.zzn()) {
                            zzezVar.zzl(5);
                            if (zzezVar.zzn()) {
                                zzezVar.zzl(7);
                                if (zzezVar.zzn()) {
                                    zzezVar.zzl(8);
                                }
                            }
                        }
                        zzezVar.zzl((iZzd8 + 2) * 8);
                        zzezVar.zze();
                    }
                    if (i19 < 2) {
                        if (zzezVar.zzn()) {
                            zzezVar.zzl(14);
                        }
                        if (iZzd6 == 0 && zzezVar.zzn()) {
                            zzezVar.zzl(14);
                        }
                    }
                    if (!zzezVar.zzn()) {
                        i20 = 0;
                    } else if (i16 == 0) {
                        zzezVar.zzl(5);
                        i20 = 0;
                        i16 = 0;
                    } else {
                        for (int i25 = 0; i25 < i18; i25++) {
                            if (zzezVar.zzn()) {
                                zzezVar.zzl(5);
                            }
                        }
                        i20 = 0;
                    }
                }
            }
            if (zzezVar.zzn()) {
                zzezVar.zzl(5);
                if (i19 == 2) {
                    zzezVar.zzl(4);
                    i19 = 2;
                }
                if (i19 >= 6) {
                    zzezVar.zzl(2);
                }
                if (zzezVar.zzn()) {
                    zzezVar.zzl(8);
                }
                if (i19 == 0 && zzezVar.zzn()) {
                    zzezVar.zzl(8);
                }
                if (iZzd4 < 3) {
                    zzezVar.zzk();
                }
            }
            if (i20 == 0 && i16 != 3) {
                zzezVar.zzk();
            }
            if (i20 == 2 && (i16 == 3 || zzezVar.zzn())) {
                zzezVar.zzl(6);
            }
            str = (zzezVar.zzn() && zzezVar.zzd(6) == 1 && zzezVar.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i11 = i21;
            i13 = i23;
            i14 = i17;
            i15 = i18 * 256;
            i12 = i24;
        } else {
            zzezVar.zzl(32);
            int iZzd9 = zzezVar.zzd(2);
            String str2 = iZzd9 == 3 ? null : "audio/ac3";
            int iZzd10 = zzezVar.zzd(6);
            int i26 = zzf[iZzd10 / 2] * 1000;
            int iZzf = zzf(iZzd9, iZzd10);
            zzezVar.zzl(8);
            int iZzd11 = zzezVar.zzd(3);
            if ((iZzd11 & 1) != 0 && iZzd11 != 1) {
                zzezVar.zzl(2);
            }
            if ((iZzd11 & 4) != 0) {
                zzezVar.zzl(2);
            }
            if (iZzd11 == 2) {
                zzezVar.zzl(2);
            }
            int i27 = iZzd9 < 3 ? zzc[iZzd9] : -1;
            i10 = zze[iZzd11] + (zzezVar.zzn() ? 1 : 0);
            str = str2;
            i11 = -1;
            i12 = i26;
            i13 = iZzf;
            i14 = i27;
            i15 = 1536;
        }
        return new zzzw(str, i11, i10, i14, i13, i15, i12, null);
    }

    private static int zzf(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = zzc[i10];
        if (i13 == 44100) {
            int i14 = zzg[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = zzf[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }
}
