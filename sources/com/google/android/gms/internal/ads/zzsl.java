package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import ch.qos.logback.core.util.FileUtil;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"InlinedApi"})
public final class zzsl {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzsf {
        int i10;
        int iMax = zzd;
        if (iMax == -1) {
            zzrs zzrsVarZzc = zzc("video/avc", false, false);
            if (zzrsVarZzc != null) {
                int iMax2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzrsVarZzc.zzh()) {
                    int i11 = codecProfileLevel.level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                                i10 = 5652480;
                                break;
                            case FileUtil.BUF_SIZE /* 32768 */:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                }
                iMax = Math.max(iMax2, zzfj.zza >= 21 ? 345600 : 172800);
            } else {
                iMax = 0;
            }
            zzd = iMax;
        }
        return iMax;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:142:0x022c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0293 A[Catch: NumberFormatException -> 0x02a2, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x02a2, blocks: (B:150:0x023e, B:152:0x0250, B:163:0x026c, B:178:0x0293), top: B:500:0x023e }] */
    /* JADX WARN: Code duplicated, block: B:241:0x0395  */
    /* JADX WARN: Code duplicated, block: B:336:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:366:0x055c  */
    /* JADX WARN: Code duplicated, block: B:425:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:426:0x0602  */
    /* JADX WARN: Code duplicated, block: B:463:0x068d  */
    /* JADX WARN: Code duplicated, block: B:464:0x0695  */
    /* JADX WARN: Code duplicated, block: B:465:0x0698  */
    /* JADX WARN: Code duplicated, block: B:466:0x069b  */
    /* JADX WARN: Code duplicated, block: B:467:0x069e  */
    /* JADX WARN: Code duplicated, block: B:468:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:469:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:470:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:471:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:472:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:473:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:474:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:475:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:476:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:477:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:478:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:479:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:480:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:481:0x06be  */
    /* JADX WARN: Code duplicated, block: B:482:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:483:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:484:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:487:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:488:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v66 int, still in use, count: 1, list:
  (r1v66 int) from 0x0110: SWITCH (r1v66 int)
 case 1567: goto B:109:0x01b6
 case 1568: goto B:105:0x01a7
 case 1569: goto B:102:0x019c
 case 1570: goto B:99:0x018f
 default: goto B:112:0x01c3 A[RegionRef:SW:70]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pair zzb(zzam zzamVar) {
        byte b10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String strA;
        int i15;
        int i16;
        String strA2;
        String strValueOf;
        String str;
        int i17;
        Integer numValueOf;
        int i18;
        int i19;
        StringBuilder sb2;
        int i20;
        String string;
        int i21;
        int i22;
        String strValueOf2;
        String str2;
        Integer num;
        Integer numValueOf2;
        int i23;
        String str3 = zzamVar.zzj;
        if (str3 == null) {
            return null;
        }
        String[] strArrSplit = str3.split("\\.");
        int i24 = 512;
        int i25 = 4;
        int i26 = 2;
        if ("video/dolby-vision".equals(zzamVar.zzm)) {
            String str4 = zzamVar.zzj;
            if (strArrSplit.length < 3) {
                strValueOf2 = String.valueOf(str4);
                str2 = "Ignoring malformed Dolby Vision codec string: ";
            } else {
                Matcher matcher = zzb.matcher(strArrSplit[1]);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    if (strGroup != null) {
                        switch (strGroup) {
                            case "00":
                                num = 1;
                                break;
                            case "01":
                                num = 2;
                                break;
                            case "02":
                                num = 4;
                                break;
                            case "03":
                                num = 8;
                                break;
                            case "04":
                                num = 16;
                                break;
                            case "05":
                                num = 32;
                                break;
                            case "06":
                                num = 64;
                                break;
                            case "07":
                                num = 128;
                                break;
                            case "08":
                                num = 256;
                                break;
                            case "09":
                                num = 512;
                                break;
                            default:
                                num = null;
                                break;
                        }
                    } else {
                        num = null;
                    }
                    if (num == null) {
                        strValueOf2 = String.valueOf(strGroup);
                        str2 = "Unknown Dolby Vision profile string: ";
                    } else {
                        String str5 = strArrSplit[2];
                        if (str5 != null) {
                            switch (str5) {
                                case "01":
                                    numValueOf2 = 1;
                                    break;
                                case "02":
                                    numValueOf2 = 2;
                                    break;
                                case "03":
                                    numValueOf2 = 4;
                                    break;
                                case "04":
                                    numValueOf2 = 8;
                                    break;
                                case "05":
                                    numValueOf2 = 16;
                                    break;
                                case "06":
                                    numValueOf2 = 32;
                                    break;
                                case "07":
                                    numValueOf2 = 64;
                                    break;
                                case "08":
                                    numValueOf2 = 128;
                                    break;
                                case "09":
                                    numValueOf2 = 256;
                                    break;
                                default:
                                    switch (str5) {
                                        case 1567:
                                            if (!str5.equals("10")) {
                                                numValueOf2 = null;
                                            } else {
                                                numValueOf2 = 512;
                                            }
                                            break;
                                        case 1568:
                                            if (!str5.equals("11")) {
                                                numValueOf2 = null;
                                            } else {
                                                i23 = 1024;
                                                numValueOf2 = Integer.valueOf(i23);
                                            }
                                            break;
                                        case 1569:
                                            if (!str5.equals("12")) {
                                                numValueOf2 = null;
                                            } else {
                                                i23 = 2048;
                                                numValueOf2 = Integer.valueOf(i23);
                                            }
                                            break;
                                        case 1570:
                                            if (!str5.equals("13")) {
                                                numValueOf2 = null;
                                            } else {
                                                numValueOf2 = 4096;
                                            }
                                            break;
                                        default:
                                            numValueOf2 = null;
                                            break;
                                    }
                            }
                        } else {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            return new Pair(num, numValueOf2);
                        }
                        strValueOf2 = String.valueOf(str5);
                        str2 = "Unknown Dolby Vision level string: ";
                    }
                } else {
                    strValueOf2 = String.valueOf(str4);
                    str2 = "Ignoring malformed Dolby Vision codec string: ";
                }
            }
            zzer.zzf("MediaCodecUtil", str2.concat(strValueOf2));
            return null;
        }
        switch (strArrSplit[0]) {
            case "av01":
                b10 = 5;
                break;
            case "avc1":
                b10 = 0;
                break;
            case "avc2":
                b10 = 1;
                break;
            case "hev1":
                b10 = 3;
                break;
            case "hvc1":
                b10 = 4;
                break;
            case "mp4a":
                b10 = 6;
                break;
            case "vp09":
                b10 = 2;
                break;
            default:
                b10 = -1;
                break;
        }
        byte b11 = 20;
        switch (b10) {
            case 0:
            case 1:
                String str6 = zzamVar.zzj;
                int length = strArrSplit.length;
                if (length < 2) {
                    strA = "Ignoring malformed AVC codec string: ".concat(String.valueOf(str6));
                    zzer.zzf("MediaCodecUtil", strA);
                } else {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i11 = 16;
                            i12 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i10 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else if (length >= 3) {
                            int i27 = Integer.parseInt(strArrSplit[1]);
                            i10 = Integer.parseInt(strArrSplit[2]);
                            i11 = 16;
                            i12 = i27;
                        } else {
                            zzer.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str6);
                        }
                        if (i12 != 66) {
                            if (i12 != 77) {
                                if (i12 == 88) {
                                    i26 = 4;
                                } else if (i12 == 100) {
                                    i26 = 8;
                                } else if (i12 == 110) {
                                    i26 = i11;
                                } else if (i12 == 122) {
                                    i26 = 32;
                                } else if (i12 != 244) {
                                    i13 = -1;
                                    i14 = -1;
                                } else {
                                    i26 = 64;
                                }
                            }
                            if (i14 == i13) {
                                strA = android.support.v4.media.a.a("Unknown AVC profile: ", i12);
                            } else {
                                switch (i10) {
                                    case 10:
                                        i24 = 1;
                                        break;
                                    case 11:
                                        i24 = 4;
                                        break;
                                    case 12:
                                        i24 = 8;
                                        break;
                                    case 13:
                                        i24 = i11;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 20:
                                                i24 = 32;
                                                break;
                                            case 21:
                                                i24 = 64;
                                                break;
                                            case 22:
                                                i24 = 128;
                                                break;
                                            default:
                                                switch (i10) {
                                                    case 30:
                                                        i24 = 256;
                                                        break;
                                                    case 31:
                                                        break;
                                                    case 32:
                                                        i24 = 1024;
                                                        break;
                                                    default:
                                                        switch (i10) {
                                                            case 40:
                                                                i24 = 2048;
                                                                break;
                                                            case 41:
                                                                i24 = 4096;
                                                                break;
                                                            case 42:
                                                                i24 = 8192;
                                                                break;
                                                            default:
                                                                switch (i10) {
                                                                    case 50:
                                                                        i24 = Http2.INITIAL_MAX_FRAME_SIZE;
                                                                        break;
                                                                    case 51:
                                                                        i24 = FileUtil.BUF_SIZE;
                                                                        break;
                                                                    case 52:
                                                                        i24 = 65536;
                                                                        break;
                                                                    default:
                                                                        i24 = -1;
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                if (i24 == -1) {
                                    return new Pair(Integer.valueOf(i14), Integer.valueOf(i24));
                                }
                                strA = android.support.v4.media.a.a("Unknown AVC level: ", i10);
                            }
                            zzer.zzf("MediaCodecUtil", strA);
                        } else {
                            i26 = 1;
                        }
                        i13 = -1;
                        i14 = i26;
                        if (i14 == i13) {
                            strA = android.support.v4.media.a.a("Unknown AVC profile: ", i12);
                        } else {
                            switch (i10) {
                                case 10:
                                    i24 = 1;
                                    break;
                                case 11:
                                    i24 = 4;
                                    break;
                                case 12:
                                    i24 = 8;
                                    break;
                                case 13:
                                    i24 = i11;
                                    break;
                                default:
                                    switch (i10) {
                                        case 20:
                                            i24 = 32;
                                            break;
                                        case 21:
                                            i24 = 64;
                                            break;
                                        case 22:
                                            i24 = 128;
                                            break;
                                        default:
                                            switch (i10) {
                                                case 30:
                                                    i24 = 256;
                                                    break;
                                                case 31:
                                                    break;
                                                case 32:
                                                    i24 = 1024;
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 40:
                                                            i24 = 2048;
                                                            break;
                                                        case 41:
                                                            i24 = 4096;
                                                            break;
                                                        case 42:
                                                            i24 = 8192;
                                                            break;
                                                        default:
                                                            switch (i10) {
                                                                case 50:
                                                                    i24 = Http2.INITIAL_MAX_FRAME_SIZE;
                                                                    break;
                                                                case 51:
                                                                    i24 = FileUtil.BUF_SIZE;
                                                                    break;
                                                                case 52:
                                                                    i24 = 65536;
                                                                    break;
                                                                default:
                                                                    i24 = -1;
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            if (i24 == -1) {
                                return new Pair(Integer.valueOf(i14), Integer.valueOf(i24));
                            }
                            strA = android.support.v4.media.a.a("Unknown AVC level: ", i10);
                        }
                    } catch (NumberFormatException unused) {
                        strA = "Ignoring malformed AVC codec string: ".concat(String.valueOf(str6));
                    }
                    zzer.zzf("MediaCodecUtil", strA);
                }
                return null;
            case 2:
                String str7 = zzamVar.zzj;
                if (strArrSplit.length < 3) {
                    strA2 = "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str7));
                } else {
                    try {
                        int i28 = Integer.parseInt(strArrSplit[1]);
                        int i29 = Integer.parseInt(strArrSplit[2]);
                        if (i28 == 0) {
                            i15 = 1;
                        } else if (i28 == 1) {
                            i15 = 2;
                        } else if (i28 != 2) {
                            i15 = i28 != 3 ? -1 : 8;
                        } else {
                            i15 = 4;
                        }
                        if (i15 == -1) {
                            strA2 = android.support.v4.media.a.a("Unknown VP9 profile: ", i28);
                        } else {
                            if (i29 == 10) {
                                i24 = 1;
                            } else if (i29 == 11) {
                                i24 = 2;
                            } else if (i29 == 20) {
                                i24 = 4;
                            } else if (i29 != 21) {
                                if (i29 != 30) {
                                    if (i29 != 31) {
                                        if (i29 != 40) {
                                            if (i29 != 41) {
                                                if (i29 != 50) {
                                                    if (i29 != 51) {
                                                        switch (i29) {
                                                            case 60:
                                                                i16 = -1;
                                                                i24 = 2048;
                                                                break;
                                                            case 61:
                                                                i24 = 4096;
                                                                break;
                                                            case 62:
                                                                i24 = 8192;
                                                                break;
                                                            default:
                                                                i16 = -1;
                                                                i24 = -1;
                                                                break;
                                                        }
                                                    }
                                                } else {
                                                    i24 = 256;
                                                }
                                            } else {
                                                i24 = 128;
                                            }
                                        } else {
                                            i24 = 64;
                                        }
                                    } else {
                                        i24 = 32;
                                    }
                                } else {
                                    i16 = -1;
                                    i24 = 16;
                                }
                                if (i24 == i16) {
                                    return new Pair(Integer.valueOf(i15), Integer.valueOf(i24));
                                }
                                strA2 = android.support.v4.media.a.a("Unknown VP9 level: ", i29);
                            } else {
                                i24 = 8;
                            }
                            i16 = -1;
                            if (i24 == i16) {
                                return new Pair(Integer.valueOf(i15), Integer.valueOf(i24));
                            }
                            strA2 = android.support.v4.media.a.a("Unknown VP9 level: ", i29);
                        }
                    } catch (NumberFormatException unused2) {
                        strA2 = "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str7));
                    }
                }
                zzer.zzf("MediaCodecUtil", strA2);
                return null;
            case 3:
            case 4:
                String str8 = zzamVar.zzj;
                zzs zzsVar = zzamVar.zzy;
                if (strArrSplit.length < 4) {
                    strValueOf = String.valueOf(str8);
                    str = "Ignoring malformed HEVC codec string: ";
                } else {
                    Matcher matcher2 = zzb.matcher(strArrSplit[1]);
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        if ("1".equals(strGroup2)) {
                            i17 = 1;
                        } else if ("2".equals(strGroup2)) {
                            i17 = (zzsVar == null || zzsVar.zzf != 6) ? 2 : 4096;
                        } else {
                            strValueOf = String.valueOf(strGroup2);
                            str = "Unknown HEVC profile string: ";
                        }
                        String str9 = strArrSplit[3];
                        if (str9 != null) {
                            switch (str9.hashCode()) {
                                case 70821:
                                    if (!str9.equals("H30")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 13;
                                    }
                                    break;
                                case 70914:
                                    if (!str9.equals("H60")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 14;
                                    }
                                    break;
                                case 70917:
                                    if (!str9.equals("H63")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 15;
                                    }
                                    break;
                                case 71007:
                                    if (!str9.equals("H90")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 16;
                                    }
                                    break;
                                case 71010:
                                    if (!str9.equals("H93")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 17;
                                    }
                                    break;
                                case 74665:
                                    if (!str9.equals("L30")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 0;
                                    }
                                    break;
                                case 74758:
                                    if (!str9.equals("L60")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 1;
                                    }
                                    break;
                                case 74761:
                                    if (!str9.equals("L63")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 2;
                                    }
                                    break;
                                case 74851:
                                    if (!str9.equals("L90")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 3;
                                    }
                                    break;
                                case 74854:
                                    if (!str9.equals("L93")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 4;
                                    }
                                    break;
                                case 2193639:
                                    if (!str9.equals("H120")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 18;
                                    }
                                    break;
                                case 2193642:
                                    if (!str9.equals("H123")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 19;
                                    }
                                    break;
                                case 2193732:
                                    if (!str9.equals("H150")) {
                                        b11 = -1;
                                    }
                                    break;
                                case 2193735:
                                    if (!str9.equals("H153")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 21;
                                    }
                                    break;
                                case 2193738:
                                    if (!str9.equals("H156")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 22;
                                    }
                                    break;
                                case 2193825:
                                    if (!str9.equals("H180")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 23;
                                    }
                                    break;
                                case 2193828:
                                    if (!str9.equals("H183")) {
                                        b11 = -1;
                                    } else {
                                        b11 = Ascii.CAN;
                                    }
                                    break;
                                case 2193831:
                                    if (!str9.equals("H186")) {
                                        b11 = -1;
                                    } else {
                                        b11 = Ascii.EM;
                                    }
                                    break;
                                case 2312803:
                                    if (!str9.equals("L120")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 5;
                                    }
                                    break;
                                case 2312806:
                                    if (!str9.equals("L123")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 6;
                                    }
                                    break;
                                case 2312896:
                                    if (!str9.equals("L150")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 7;
                                    }
                                    break;
                                case 2312899:
                                    if (!str9.equals("L153")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 8;
                                    }
                                    break;
                                case 2312902:
                                    if (!str9.equals("L156")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 9;
                                    }
                                    break;
                                case 2312989:
                                    if (!str9.equals("L180")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 10;
                                    }
                                    break;
                                case 2312992:
                                    if (!str9.equals("L183")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 11;
                                    }
                                    break;
                                case 2312995:
                                    if (!str9.equals("L186")) {
                                        b11 = -1;
                                    } else {
                                        b11 = 12;
                                    }
                                    break;
                                default:
                                    b11 = -1;
                                    break;
                            }
                            switch (b11) {
                                case 0:
                                    numValueOf = 1;
                                    break;
                                case 1:
                                    numValueOf = 4;
                                    break;
                                case 2:
                                    i18 = 16;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 3:
                                    i18 = 64;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 4:
                                    i18 = 256;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 5:
                                    i18 = 1024;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 6:
                                    numValueOf = 4096;
                                    break;
                                case 7:
                                    i18 = Http2.INITIAL_MAX_FRAME_SIZE;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 8:
                                    i18 = 65536;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 9:
                                    i18 = 262144;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 10:
                                    i18 = 1048576;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 11:
                                    i18 = 4194304;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 12:
                                    i18 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 13:
                                    numValueOf = 2;
                                    break;
                                case 14:
                                    numValueOf = 8;
                                    break;
                                case 15:
                                    numValueOf = 32;
                                    break;
                                case 16:
                                    numValueOf = 128;
                                    break;
                                case 17:
                                    numValueOf = 512;
                                    break;
                                case 18:
                                    i18 = 2048;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 19:
                                    numValueOf = 8192;
                                    break;
                                case 20:
                                    i18 = FileUtil.BUF_SIZE;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 21:
                                    i18 = 131072;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 22:
                                    i18 = 524288;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 23:
                                    i18 = 2097152;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 24:
                                    i18 = 8388608;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                case 25:
                                    i18 = 33554432;
                                    numValueOf = Integer.valueOf(i18);
                                    break;
                                default:
                                    numValueOf = null;
                                    break;
                            }
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            return new Pair(Integer.valueOf(i17), numValueOf);
                        }
                        strValueOf = String.valueOf(str9);
                        str = "Unknown HEVC level string: ";
                    } else {
                        strValueOf = String.valueOf(str8);
                        str = "Ignoring malformed HEVC codec string: ";
                    }
                }
                zzer.zzf("MediaCodecUtil", str.concat(strValueOf));
                return null;
            case 5:
                String str10 = zzamVar.zzj;
                zzs zzsVar2 = zzamVar.zzy;
                if (strArrSplit.length < 4) {
                    string = "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str10));
                } else {
                    try {
                        int i30 = Integer.parseInt(strArrSplit[1]);
                        int i31 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i32 = Integer.parseInt(strArrSplit[3]);
                        if (i30 != 0) {
                            sb2 = new StringBuilder();
                            sb2.append("Unknown AV1 profile: ");
                            sb2.append(i30);
                        } else {
                            if (i32 == 8) {
                                i19 = 1;
                            } else if (i32 != 10) {
                                sb2 = new StringBuilder();
                                sb2.append("Unknown AV1 bit depth: ");
                                sb2.append(i32);
                            } else {
                                i19 = (zzsVar2 == null || !(zzsVar2.zzg != null || (i20 = zzsVar2.zzf) == 7 || i20 == 6)) ? 2 : 4096;
                            }
                            switch (i31) {
                                case 0:
                                    i24 = 1;
                                    break;
                                case 1:
                                    i24 = 2;
                                    break;
                                case 2:
                                    i24 = 4;
                                    break;
                                case 3:
                                    i24 = 8;
                                    break;
                                case 4:
                                    i24 = 16;
                                    break;
                                case 5:
                                    i24 = 32;
                                    break;
                                case 6:
                                    i24 = 64;
                                    break;
                                case 7:
                                    i24 = 128;
                                    break;
                                case 8:
                                    i24 = 256;
                                    break;
                                case 9:
                                    break;
                                case 10:
                                    i24 = 1024;
                                    break;
                                case 11:
                                    i24 = 2048;
                                    break;
                                case 12:
                                    i24 = 4096;
                                    break;
                                case 13:
                                    i24 = 8192;
                                    break;
                                case 14:
                                    i24 = Http2.INITIAL_MAX_FRAME_SIZE;
                                    break;
                                case 15:
                                    i24 = FileUtil.BUF_SIZE;
                                    break;
                                case 16:
                                    i24 = 65536;
                                    break;
                                case 17:
                                    i24 = 131072;
                                    break;
                                case 18:
                                    i24 = 262144;
                                    break;
                                case 19:
                                    i24 = 524288;
                                    break;
                                case 20:
                                    i24 = 1048576;
                                    break;
                                case 21:
                                    i24 = 2097152;
                                    break;
                                case 22:
                                    i24 = 4194304;
                                    break;
                                case 23:
                                    i24 = 8388608;
                                    break;
                                default:
                                    i24 = -1;
                                    break;
                            }
                            if (i24 != -1) {
                                return new Pair(Integer.valueOf(i19), Integer.valueOf(i24));
                            }
                            sb2 = new StringBuilder();
                            sb2.append("Unknown AV1 level: ");
                            sb2.append(i31);
                        }
                        string = sb2.toString();
                    } catch (NumberFormatException unused3) {
                        string = "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str10));
                    }
                }
                zzer.zzf("MediaCodecUtil", string);
                return null;
            case 6:
                String str11 = zzamVar.zzj;
                if (strArrSplit.length != 3) {
                    zzer.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str11)));
                } else {
                    try {
                        if ("audio/mp4a-latm".equals(zzcc.zzd(Integer.parseInt(strArrSplit[1], 16)))) {
                            int i33 = Integer.parseInt(strArrSplit[2]);
                            if (i33 == 17) {
                                i25 = 17;
                            } else if (i33 == 20) {
                                i25 = 20;
                            } else if (i33 == 23) {
                                i25 = 23;
                            } else if (i33 == 29) {
                                i25 = 29;
                            } else if (i33 == 39) {
                                i25 = 39;
                            } else if (i33 != 42) {
                                switch (i33) {
                                    case 1:
                                        i25 = 1;
                                        break;
                                    case 2:
                                        i25 = 2;
                                        break;
                                    case 3:
                                        i21 = -1;
                                        i22 = 3;
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        i21 = -1;
                                        i22 = 5;
                                        break;
                                    case 6:
                                        i21 = -1;
                                        i22 = 6;
                                        break;
                                    default:
                                        i21 = -1;
                                        i22 = -1;
                                        break;
                                }
                                if (i22 != i21) {
                                    return new Pair(Integer.valueOf(i22), 0);
                                }
                            } else {
                                i25 = 42;
                            }
                            i21 = -1;
                            i22 = i25;
                            if (i22 != i21) {
                                return new Pair(Integer.valueOf(i22), 0);
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        zzer.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str11)));
                    }
                }
                return null;
            default:
                return null;
        }
    }

    public static zzrs zzc(String str, boolean z10, boolean z11) throws zzsf {
        List listZzg = zzg(str, false, false);
        if (listZzg.isEmpty()) {
            return null;
        }
        return (zzrs) listZzg.get(0);
    }

    public static zzrs zzd() throws zzsf {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzam zzamVar) {
        Pair pairZzb;
        if ("audio/eac3-joc".equals(zzamVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzamVar.zzm) || (pairZzb = zzb(zzamVar)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairZzb.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List zzf(zzry zzryVar, zzam zzamVar, boolean z10, boolean z11) throws zzsf {
        String strZze = zze(zzamVar);
        return strZze == null ? zzfsc.zzl() : zzg(strZze, z10, z11);
    }

    public static synchronized List zzg(String str, boolean z10, boolean z11) throws zzsf {
        zzsd zzsdVar = new zzsd(str, z10, z11);
        HashMap map = zzc;
        List list = (List) map.get(zzsdVar);
        if (list != null) {
            return list;
        }
        int i10 = zzfj.zza;
        ArrayList arrayListZzj = zzj(zzsdVar, i10 >= 21 ? new zzsj(z10, z11) : new zzsi(null));
        if (z10 && arrayListZzj.isEmpty() && i10 >= 21 && i10 <= 23) {
            arrayListZzj = zzj(zzsdVar, new zzsi(null));
            if (!arrayListZzj.isEmpty()) {
                zzer.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzrs) arrayListZzj.get(0)).zza);
            }
        }
        if ("audio/raw".equals(str)) {
            if (i10 < 26 && zzfj.zzb.equals("R9") && arrayListZzj.size() == 1 && ((zzrs) arrayListZzj.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListZzj.add(zzrs.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            zzk(arrayListZzj, new zzsk() { // from class: com.google.android.gms.internal.ads.zzsb
                @Override // com.google.android.gms.internal.ads.zzsk
                public final int zza(Object obj) {
                    int i11 = zzsl.zza;
                    String str2 = ((zzrs) obj).zza;
                    if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                        return 1;
                    }
                    return (zzfj.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                }
            });
        }
        if (i10 < 21 && arrayListZzj.size() > 1) {
            String str2 = ((zzrs) arrayListZzj.get(0)).zza;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                zzk(arrayListZzj, new zzsk() { // from class: com.google.android.gms.internal.ads.zzsc
                    @Override // com.google.android.gms.internal.ads.zzsk
                    public final int zza(Object obj) {
                        int i11 = zzsl.zza;
                        return ((zzrs) obj).zza.startsWith("OMX.google") ? 1 : 0;
                    }
                });
            }
        }
        if (i10 < 32 && arrayListZzj.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzrs) arrayListZzj.get(0)).zza)) {
            arrayListZzj.add((zzrs) arrayListZzj.remove(0));
        }
        zzfsc zzfscVarZzj = zzfsc.zzj(arrayListZzj);
        map.put(zzsdVar, zzfscVarZzj);
        return zzfscVarZzj;
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzh(zzry zzryVar, zzam zzamVar, boolean z10, boolean z11) throws zzsf {
        List listZzg = zzg(zzamVar.zzm, z10, z11);
        List listZzf = zzf(zzryVar, zzamVar, z10, z11);
        zzfrz zzfrzVar = new zzfrz();
        zzfrzVar.zzh(listZzg);
        zzfrzVar.zzh(listZzf);
        return zzfrzVar.zzi();
    }

    public static List zzi(List list, final zzam zzamVar) {
        ArrayList arrayList = new ArrayList(list);
        zzk(arrayList, new zzsk() { // from class: com.google.android.gms.internal.ads.zzrz
            @Override // com.google.android.gms.internal.ads.zzsk
            public final int zza(Object obj) {
                zzam zzamVar2 = zzamVar;
                int i10 = zzsl.zza;
                return ((zzrs) obj).zzd(zzamVar2) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018f A[Catch: Exception -> 0x0304, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0197 A[Catch: Exception -> 0x0304, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01a2 A[Catch: Exception -> 0x0304, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01aa A[Catch: Exception -> 0x0304, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01b5 A[EDGE_INSN: B:113:0x01b5->B:114:0x01b6 BREAK  A[LOOP:1: B:82:0x0148->B:86:0x0153]] */
    /* JADX WARN: Code duplicated, block: B:117:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:119:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cf A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x01df  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ea A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x01f1 A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:133:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:136:0x0204 A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0209 A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0219 A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x022c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0230 A[Catch: Exception -> 0x02a3, TRY_LEAVE, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0234 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x023a  */
    /* JADX WARN: Code duplicated, block: B:157:0x026a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0276 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x02b5 A[Catch: Exception -> 0x0304, TRY_ENTER, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x02d5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x02f9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d A[Catch: Exception -> 0x0304, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x012d  */
    /* JADX WARN: Code duplicated, block: B:83:0x014a A[Catch: Exception -> 0x0304, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0153 A[Catch: Exception -> 0x0304, LOOP:1: B:82:0x0148->B:86:0x0153, LOOP_END, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x015e A[Catch: Exception -> 0x0304, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0166 A[EDGE_INSN: B:91:0x0166->B:114:0x01b6 BREAK  A[LOOP:1: B:82:0x0148->B:86:0x0153]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0169 A[Catch: Exception -> 0x0304, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0171 A[Catch: Exception -> 0x0304, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x017c A[Catch: Exception -> 0x0304, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0184 A[Catch: Exception -> 0x0304, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    private static ArrayList zzj(zzsd zzsdVar, zzsg zzsgVar) throws zzsf {
        String[] supportedTypes;
        int length;
        int i10;
        String str;
        String str2;
        String str3;
        int i11;
        int i12;
        String str4;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zZzd;
        boolean zZzc;
        boolean zZzd2;
        boolean zZzc2;
        int i13;
        boolean zIsHardwareAccelerated;
        boolean zZzl;
        String strZza;
        boolean zIsVendor;
        zzsd zzsdVar2 = zzsdVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = zzsdVar2.zza;
            int iZza = zzsgVar.zza();
            boolean zZze = zzsgVar.zze();
            int i14 = 0;
            while (i14 < iZza) {
                MediaCodecInfo mediaCodecInfoZzb = zzsgVar.zzb(i14);
                int i15 = zzfj.zza;
                if (i15 < 29 || !mediaCodecInfoZzb.isAlias()) {
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || ((!zZze && name.endsWith(".secure")) || (i15 < 21 && ("CIPAACDecoder".equals(name) || "CIPMP3Decoder".equals(name) || "CIPVorbisDecoder".equals(name) || "CIPAMRNBDecoder".equals(name) || "AACDecoder".equals(name) || "MP3Decoder".equals(name))))) {
                        i11 = i14;
                        i12 = iZza;
                        str4 = str5;
                    } else if (i15 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(zzfj.zzc))) {
                        String str6 = zzfj.zzb;
                        if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                            i11 = i14;
                            i12 = iZza;
                            str4 = str5;
                        } else if (i15 > 19) {
                            if (i15 > 19) {
                                supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                length = supportedTypes.length;
                                i10 = 0;
                                while (true) {
                                    if (i10 >= length) {
                                        if (!str5.equals("video/dolby-vision")) {
                                            if (!str5.equals("audio/alac")) {
                                                if (!str5.equals("audio/flac")) {
                                                    if (!str5.equals("audio/ac3")) {
                                                        str = null;
                                                        break;
                                                    }
                                                    str = null;
                                                    break;
                                                }
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/flac")) {
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                            if ("OMX.RTK.video.decoder".equals(name)) {
                                            }
                                            str = "video/dv_hevc";
                                            break;
                                        }
                                        str = "video/hevcdv";
                                        break;
                                    }
                                    str = supportedTypes[i10];
                                    if (str.equalsIgnoreCase(str5)) {
                                        break;
                                        break;
                                    }
                                    i10++;
                                }
                                if (str != null) {
                                    capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                    zZzd = zzsgVar.zzd("tunneled-playback", str, capabilitiesForType);
                                    zZzc = zzsgVar.zzc("tunneled-playback", str, capabilitiesForType);
                                    if (zzsdVar2.zzc) {
                                        if (zZzd) {
                                            zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                            zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                            if (zzsdVar2.zzb) {
                                                if (zZzd2) {
                                                    zZzd2 = true;
                                                    i13 = zzfj.zza;
                                                    if (i13 >= 29) {
                                                        zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                    } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                        zIsHardwareAccelerated = false;
                                                    } else {
                                                        zIsHardwareAccelerated = true;
                                                    }
                                                    zZzl = zzl(mediaCodecInfoZzb, str5);
                                                    if (i13 >= 29) {
                                                        zIsVendor = mediaCodecInfoZzb.isVendor();
                                                    } else {
                                                        strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                        if (strZza.startsWith("omx.google.")) {
                                                            zIsVendor = false;
                                                        } else {
                                                            zIsVendor = false;
                                                        }
                                                    }
                                                    if (!zZze) {
                                                        if (!zZze) {
                                                            str2 = str;
                                                            i11 = i14;
                                                            i12 = iZza;
                                                            str4 = str5;
                                                            if (!zZze) {
                                                                continue;
                                                            }
                                                        } else if (zzsdVar2.zzb) {
                                                            str2 = str;
                                                            i11 = i14;
                                                            i12 = iZza;
                                                            str4 = str5;
                                                            if (!zZze) {
                                                                continue;
                                                            }
                                                        } else {
                                                            str2 = str;
                                                            i11 = i14;
                                                            i12 = iZza;
                                                            str4 = str5;
                                                            arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                        }
                                                    } else if (!zZze) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    } else if (zzsdVar2.zzb) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                    } else {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            } else if (!zZzc2) {
                                                i13 = zzfj.zza;
                                                if (i13 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zZzl = zzl(mediaCodecInfoZzb, str5);
                                                if (i13 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (!zZze) {
                                                    if (!zZze) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    } else if (zzsdVar2.zzb) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                    } else {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    }
                                                } else if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        }
                                    } else if (!zZzc) {
                                        zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzsdVar2.zzb) {
                                            if (!zZzc2) {
                                                i13 = zzfj.zza;
                                                if (i13 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zZzl = zzl(mediaCodecInfoZzb, str5);
                                                if (i13 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (!zZze) {
                                                    if (!zZze) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    } else if (zzsdVar2.zzb) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                    } else {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    }
                                                } else if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (zZzd2) {
                                            zZzd2 = true;
                                            i13 = zzfj.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZze) {
                                                if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            } else if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    i11 = i14;
                                    i12 = iZza;
                                    str4 = str5;
                                } else {
                                    i11 = i14;
                                    i12 = iZza;
                                    str4 = str5;
                                }
                            } else {
                                supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                length = supportedTypes.length;
                                i10 = 0;
                                while (true) {
                                    if (i10 >= length) {
                                        if (!str5.equals("video/dolby-vision")) {
                                            if (!str5.equals("audio/alac")) {
                                                if (!str5.equals("audio/flac")) {
                                                    if (!str5.equals("audio/ac3")) {
                                                        str = null;
                                                        break;
                                                    }
                                                    str = null;
                                                    break;
                                                }
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/flac")) {
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                            if ("OMX.RTK.video.decoder".equals(name)) {
                                            }
                                            str = "video/dv_hevc";
                                            break;
                                        }
                                        str = "video/hevcdv";
                                        break;
                                    }
                                    str = supportedTypes[i10];
                                    if (str.equalsIgnoreCase(str5)) {
                                        break;
                                        break;
                                    }
                                    i10++;
                                }
                                if (str != null) {
                                    capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                    zZzd = zzsgVar.zzd("tunneled-playback", str, capabilitiesForType);
                                    zZzc = zzsgVar.zzc("tunneled-playback", str, capabilitiesForType);
                                    if (zzsdVar2.zzc) {
                                        if (!zZzc) {
                                            zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                            zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                            if (zzsdVar2.zzb) {
                                                if (!zZzc2) {
                                                    i13 = zzfj.zza;
                                                    if (i13 >= 29) {
                                                        zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                    } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                        zIsHardwareAccelerated = true;
                                                    } else {
                                                        zIsHardwareAccelerated = false;
                                                    }
                                                    zZzl = zzl(mediaCodecInfoZzb, str5);
                                                    if (i13 >= 29) {
                                                        zIsVendor = mediaCodecInfoZzb.isVendor();
                                                    } else {
                                                        strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                        if (strZza.startsWith("omx.google.")) {
                                                            zIsVendor = false;
                                                        } else {
                                                            zIsVendor = false;
                                                        }
                                                    }
                                                    if (!zZze) {
                                                        if (!zZze) {
                                                            str2 = str;
                                                            i11 = i14;
                                                            i12 = iZza;
                                                            str4 = str5;
                                                            if (!zZze) {
                                                                continue;
                                                            }
                                                        } else if (zzsdVar2.zzb) {
                                                            str2 = str;
                                                            i11 = i14;
                                                            i12 = iZza;
                                                            str4 = str5;
                                                            arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                        } else {
                                                            str2 = str;
                                                            i11 = i14;
                                                            i12 = iZza;
                                                            str4 = str5;
                                                            if (!zZze) {
                                                                continue;
                                                            }
                                                        }
                                                    } else if (!zZze) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    } else if (zzsdVar2.zzb) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                    } else {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            } else if (zZzd2) {
                                                zZzd2 = true;
                                                i13 = zzfj.zza;
                                                if (i13 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zZzl = zzl(mediaCodecInfoZzb, str5);
                                                if (i13 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (!zZze) {
                                                    if (!zZze) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    } else if (zzsdVar2.zzb) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                    } else {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    }
                                                } else if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        }
                                    } else if (zZzd) {
                                        zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzsdVar2.zzb) {
                                            if (!zZzc2) {
                                                i13 = zzfj.zza;
                                                if (i13 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zZzl = zzl(mediaCodecInfoZzb, str5);
                                                if (i13 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (!zZze) {
                                                    if (!zZze) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    } else if (zzsdVar2.zzb) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                    } else {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    }
                                                } else if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (zZzd2) {
                                            zZzd2 = true;
                                            i13 = zzfj.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZze) {
                                                if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            } else if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    i11 = i14;
                                    i12 = iZza;
                                    str4 = str5;
                                } else {
                                    i11 = i14;
                                    i12 = iZza;
                                    str4 = str5;
                                }
                            }
                        } else if (i15 > 19) {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    if (!str5.equals("video/dolby-vision")) {
                                        if (!str5.equals("audio/alac")) {
                                            if (!str5.equals("audio/flac")) {
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str5.equals("audio/flac")) {
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str5.equals("audio/ac3")) {
                                            str = null;
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i10];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                    break;
                                }
                                i10++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zzsgVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zzsgVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzsdVar2.zzc) {
                                    if (!zZzc) {
                                        zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzsdVar2.zzb) {
                                            if (!zZzc2) {
                                                i13 = zzfj.zza;
                                                if (i13 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zZzl = zzl(mediaCodecInfoZzb, str5);
                                                if (i13 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (!zZze) {
                                                    if (!zZze) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    } else if (zzsdVar2.zzb) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                    } else {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    }
                                                } else if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (zZzd2) {
                                            zZzd2 = true;
                                            i13 = zzfj.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZze) {
                                                if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            } else if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zZzd) {
                                    zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                    if (zzsdVar2.zzb) {
                                        if (!zZzc2) {
                                            i13 = zzfj.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZze) {
                                                if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            } else if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i13 = zzfj.zza;
                                        if (i13 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzl(mediaCodecInfoZzb, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzl = zzl(mediaCodecInfoZzb, str5);
                                        if (i13 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (!zZze) {
                                            if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        } else if (!zZze) {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            if (!zZze) {
                                                continue;
                                            }
                                        } else if (zzsdVar2.zzb) {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                        } else {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            if (!zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i11 = i14;
                                i12 = iZza;
                                str4 = str5;
                            } else {
                                i11 = i14;
                                i12 = iZza;
                                str4 = str5;
                            }
                        } else {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    if (!str5.equals("video/dolby-vision")) {
                                        if (!str5.equals("audio/alac")) {
                                            if (!str5.equals("audio/flac")) {
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str5.equals("audio/flac")) {
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str5.equals("audio/ac3")) {
                                            str = null;
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i10];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                    break;
                                }
                                i10++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zzsgVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zzsgVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzsdVar2.zzc) {
                                    if (!zZzc) {
                                        zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzsdVar2.zzb) {
                                            if (!zZzc2) {
                                                i13 = zzfj.zza;
                                                if (i13 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zZzl = zzl(mediaCodecInfoZzb, str5);
                                                if (i13 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (!zZze) {
                                                    if (!zZze) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    } else if (zzsdVar2.zzb) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                    } else {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    }
                                                } else if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (zZzd2) {
                                            zZzd2 = true;
                                            i13 = zzfj.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZze) {
                                                if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            } else if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zZzd) {
                                    zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                    if (zzsdVar2.zzb) {
                                        if (!zZzc2) {
                                            i13 = zzfj.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZze) {
                                                if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            } else if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i13 = zzfj.zza;
                                        if (i13 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzl(mediaCodecInfoZzb, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzl = zzl(mediaCodecInfoZzb, str5);
                                        if (i13 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (!zZze) {
                                            if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        } else if (!zZze) {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            if (!zZze) {
                                                continue;
                                            }
                                        } else if (zzsdVar2.zzb) {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                        } else {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            if (!zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i11 = i14;
                                i12 = iZza;
                                str4 = str5;
                            } else {
                                i11 = i14;
                                i12 = iZza;
                                str4 = str5;
                            }
                        }
                    } else if (i15 > 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(zzfj.zzc)) {
                        String str7 = zzfj.zzb;
                        if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                            i11 = i14;
                            i12 = iZza;
                            str4 = str5;
                        } else if (i15 > 19) {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    if (!str5.equals("video/dolby-vision")) {
                                        if (!str5.equals("audio/alac")) {
                                            if (!str5.equals("audio/flac")) {
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str5.equals("audio/flac")) {
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str5.equals("audio/ac3")) {
                                            str = null;
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i10];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                    break;
                                }
                                i10++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zzsgVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zzsgVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzsdVar2.zzc) {
                                    if (!zZzc) {
                                        zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzsdVar2.zzb) {
                                            if (!zZzc2) {
                                                i13 = zzfj.zza;
                                                if (i13 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zZzl = zzl(mediaCodecInfoZzb, str5);
                                                if (i13 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (!zZze) {
                                                    if (!zZze) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    } else if (zzsdVar2.zzb) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                    } else {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    }
                                                } else if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (zZzd2) {
                                            zZzd2 = true;
                                            i13 = zzfj.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZze) {
                                                if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            } else if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zZzd) {
                                    zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                    if (zzsdVar2.zzb) {
                                        if (!zZzc2) {
                                            i13 = zzfj.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZze) {
                                                if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            } else if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i13 = zzfj.zza;
                                        if (i13 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzl(mediaCodecInfoZzb, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzl = zzl(mediaCodecInfoZzb, str5);
                                        if (i13 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (!zZze) {
                                            if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        } else if (!zZze) {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            if (!zZze) {
                                                continue;
                                            }
                                        } else if (zzsdVar2.zzb) {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                        } else {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            if (!zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i11 = i14;
                                i12 = iZza;
                                str4 = str5;
                            } else {
                                i11 = i14;
                                i12 = iZza;
                                str4 = str5;
                            }
                        } else {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    if (!str5.equals("video/dolby-vision")) {
                                        if (!str5.equals("audio/alac")) {
                                            if (!str5.equals("audio/flac")) {
                                                if (!str5.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str5.equals("audio/flac")) {
                                            if (!str5.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str5.equals("audio/ac3")) {
                                            str = null;
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i10];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                    break;
                                }
                                i10++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zzsgVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zzsgVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzsdVar2.zzc) {
                                    if (!zZzc) {
                                        zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzsdVar2.zzb) {
                                            if (!zZzc2) {
                                                i13 = zzfj.zza;
                                                if (i13 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zZzl = zzl(mediaCodecInfoZzb, str5);
                                                if (i13 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (!zZze) {
                                                    if (!zZze) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    } else if (zzsdVar2.zzb) {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                    } else {
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    }
                                                } else if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (zZzd2) {
                                            zZzd2 = true;
                                            i13 = zzfj.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZze) {
                                                if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            } else if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zZzd) {
                                    zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                    if (zzsdVar2.zzb) {
                                        if (!zZzc2) {
                                            i13 = zzfj.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZze) {
                                                if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            } else if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i13 = zzfj.zza;
                                        if (i13 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzl(mediaCodecInfoZzb, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzl = zzl(mediaCodecInfoZzb, str5);
                                        if (i13 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (!zZze) {
                                            if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        } else if (!zZze) {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            if (!zZze) {
                                                continue;
                                            }
                                        } else if (zzsdVar2.zzb) {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                        } else {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            if (!zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i11 = i14;
                                i12 = iZza;
                                str4 = str5;
                            } else {
                                i11 = i14;
                                i12 = iZza;
                                str4 = str5;
                            }
                        }
                    } else if ((i15 > 19 && zzfj.zzb.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(name)) || (i15 <= 23 && "audio/eac3-joc".equals(str5) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))) {
                        i11 = i14;
                        i12 = iZza;
                        str4 = str5;
                    } else {
                        supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        length = supportedTypes.length;
                        i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                if (!str5.equals("video/dolby-vision")) {
                                    if (!str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                        str = "audio/x-lg-alac";
                                        break;
                                    }
                                    if (!str5.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                        str = "audio/x-lg-flac";
                                        break;
                                    }
                                    if (!str5.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                        str = "audio/lg-ac3";
                                        break;
                                    }
                                    str = null;
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if ("OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                    break;
                                }
                                str = "video/hevcdv";
                                break;
                            }
                            str = supportedTypes[i10];
                            if (str.equalsIgnoreCase(str5)) {
                                break;
                            }
                            i10++;
                        }
                        if (str != null) {
                            try {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zzsgVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zzsgVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzsdVar2.zzc) {
                                    if (!zZzc) {
                                        zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzsdVar2.zzb) {
                                            if (!zZzc2) {
                                                i13 = zzfj.zza;
                                                if (i13 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zZzl = zzl(mediaCodecInfoZzb, str5);
                                                if (i13 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = true;
                                                    }
                                                }
                                                if (!zZze && zzsdVar2.zzb == zZzd2) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else if (!zZze) {
                                                    try {
                                                        if (zzsdVar2.zzb) {
                                                            str2 = str;
                                                            i11 = i14;
                                                            i12 = iZza;
                                                            str4 = str5;
                                                            try {
                                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                            } catch (Exception e10) {
                                                                e = e10;
                                                                str3 = name;
                                                                if (zzfj.zza <= 23) {
                                                                }
                                                                zzer.zzc("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                                throw e;
                                                            }
                                                        } else {
                                                            str2 = str;
                                                            i11 = i14;
                                                            i12 = iZza;
                                                            str4 = str5;
                                                            if (!zZze && zZzd2) {
                                                                StringBuilder sb2 = new StringBuilder();
                                                                try {
                                                                    sb2.append(name);
                                                                    sb2.append(".secure");
                                                                    str3 = name;
                                                                    try {
                                                                        arrayList.add(zzrs.zzc(sb2.toString(), str4, str2, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, true));
                                                                        return arrayList;
                                                                    } catch (Exception e11) {
                                                                        e = e11;
                                                                        if (zzfj.zza <= 23) {
                                                                        }
                                                                        zzer.zzc("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                                        throw e;
                                                                    }
                                                                } catch (Exception e12) {
                                                                    e = e12;
                                                                    str3 = name;
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        str2 = str;
                                                        i11 = i14;
                                                        i12 = iZza;
                                                        str4 = str5;
                                                        str3 = name;
                                                        if (zzfj.zza <= 23 || arrayList.isEmpty()) {
                                                            zzer.zzc("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                            throw e;
                                                        }
                                                        zzer.zzc("MediaCodecUtil", "Skipping codec " + str3 + " (failed to query capabilities)");
                                                        i14 = i11 + 1;
                                                        zzsdVar2 = zzsdVar;
                                                        iZza = i12;
                                                        str5 = str4;
                                                    }
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (zZzd2) {
                                            zZzd2 = true;
                                            i13 = zzfj.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZze) {
                                                if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            } else if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zZzd) {
                                    zZzd2 = zzsgVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zzsgVar.zzc("secure-playback", str, capabilitiesForType);
                                    if (zzsdVar2.zzb) {
                                        if (!zZzc2) {
                                            i13 = zzfj.zza;
                                            if (i13 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (i13 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZze) {
                                                if (!zZze) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzsdVar2.zzb) {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                } else {
                                                    str2 = str;
                                                    i11 = i14;
                                                    i12 = iZza;
                                                    str4 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            } else if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i13 = zzfj.zza;
                                        if (i13 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzl(mediaCodecInfoZzb, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzl = zzl(mediaCodecInfoZzb, str5);
                                        if (i13 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfon.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (!zZze) {
                                            if (!zZze) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzsdVar2.zzb) {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            } else {
                                                str2 = str;
                                                i11 = i14;
                                                i12 = iZza;
                                                str4 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        } else if (!zZze) {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            if (!zZze) {
                                                continue;
                                            }
                                        } else if (zzsdVar2.zzb) {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            arrayList.add(zzrs.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                        } else {
                                            str2 = str;
                                            i11 = i14;
                                            i12 = iZza;
                                            str4 = str5;
                                            if (!zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i11 = i14;
                                i12 = iZza;
                                str4 = str5;
                            } catch (Exception e14) {
                                e = e14;
                                str2 = str;
                                str3 = name;
                                i11 = i14;
                                i12 = iZza;
                                str4 = str5;
                            }
                        } else {
                            i11 = i14;
                            i12 = iZza;
                            str4 = str5;
                        }
                    }
                } else {
                    i11 = i14;
                    i12 = iZza;
                    str4 = str5;
                }
                i14 = i11 + 1;
                zzsdVar2 = zzsdVar;
                iZza = i12;
                str5 = str4;
            }
            return arrayList;
        } catch (Exception e15) {
            throw new zzsf(e15, null);
        }
    }

    private static void zzk(List list, final zzsk zzskVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzsa
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzsk zzskVar2 = zzskVar;
                int i10 = zzsl.zza;
                return zzskVar2.zza(obj2) - zzskVar2.zza(obj);
            }
        });
    }

    private static boolean zzl(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzfj.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzcc.zzf(str)) {
            return true;
        }
        String strZza = zzfon.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }
}
