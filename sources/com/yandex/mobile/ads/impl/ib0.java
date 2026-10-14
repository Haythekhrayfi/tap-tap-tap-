package com.yandex.mobile.ads.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
public final class ib0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final jb0 f21666i = ot0.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f21670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21674h;

    public ib0(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        this.f21667a = (String) pa.a(str);
        this.f21668b = str2;
        this.f21669c = str3;
        this.f21670d = codecCapabilities;
        this.f21673g = z10;
        this.f21671e = z11;
        this.f21672f = z12;
        this.f21674h = te0.d(str2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    public static ib0 a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16;
        if (codecCapabilities == null) {
            z14 = false;
        } else {
            int i10 = da1.f19803a;
            if (i10 >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
                if (i10 <= 22) {
                    jb0 jb0Var = f21666i;
                    String strD = jb0Var.d();
                    String str4 = da1.f19806d;
                    if ((strD.equals(str4) || jb0Var.c().equals(str4)) && (jb0Var.e().equals(str) || jb0Var.f().equals(str))) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                } else {
                    z16 = false;
                }
                if (z16) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else {
                z14 = false;
            }
        }
        if (codecCapabilities != null && da1.f19803a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        if (z13) {
            z15 = true;
        } else {
            if (codecCapabilities != null) {
                if (da1.f19803a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")) {
                    z15 = true;
                }
            }
            z15 = false;
        }
        return new ib0(str, str2, str3, codecCapabilities, z10, z14, z15);
    }

    private void a(String str) {
        StringBuilder sbA = androidx.activity.result.c.a("NoSupport [", str, "] [");
        sbA.append(this.f21667a);
        sbA.append(", ");
        sbA.append(this.f21668b);
        sbA.append("] [");
        sbA.append(da1.f19807e);
        sbA.append("]");
        p90.a("MediaCodecInfo", sbA.toString());
    }

    public final Point a(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21670d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(da1.a(i10, widthAlignment) * widthAlignment, da1.a(i11, heightAlignment) * heightAlignment);
    }

    public final cn a(yv yvVar, yv yvVar2) {
        boolean z10 = false;
        int i10 = !da1.a(yvVar.f27115l, yvVar2.f27115l) ? 8 : 0;
        if (this.f21674h) {
            if (yvVar.f27123t != yvVar2.f27123t) {
                i10 |= 1024;
            }
            if (!this.f21671e && (yvVar.f27120q != yvVar2.f27120q || yvVar.f27121r != yvVar2.f27121r)) {
                i10 |= 512;
            }
            if (!da1.a(yvVar.f27127x, yvVar2.f27127x)) {
                i10 |= 2048;
            }
            String str = this.f21667a;
            String str2 = da1.f19806d;
            jb0 jb0Var = f21666i;
            if (str2.startsWith(jb0Var.i()) && jb0Var.g().equals(str)) {
                z10 = true;
            }
            if (z10 && !yvVar.a(yvVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new cn(this.f21667a, yvVar, yvVar2, yvVar.a(yvVar2) ? 3 : 2, 0);
            }
        } else {
            if (yvVar.f27128y != yvVar2.f27128y) {
                i10 |= 4096;
            }
            if (yvVar.f27129z != yvVar2.f27129z) {
                i10 |= 8192;
            }
            if (yvVar.A != yvVar2.A) {
                i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f21668b)) {
                Pair<Integer, Integer> pairB = nb0.b(yvVar);
                Pair<Integer, Integer> pairB2 = nb0.b(yvVar2);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new cn(this.f21667a, yvVar, yvVar2, 3, 0);
                    }
                }
            }
            if (!yvVar.a(yvVar2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.f21668b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new cn(this.f21667a, yvVar, yvVar2, 1, 0);
            }
        }
        return new cn(this.f21667a, yvVar, yvVar2, 0, i10);
    }

    public final boolean a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (da1.f19803a >= 29 && "video/x-vnd.on2.vp9".equals(this.f21668b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21670d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(int i10, int i11, double d10) {
        String string;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21670d;
        if (codecCapabilities == null) {
            string = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                Point point = new Point(da1.a(i10, widthAlignment) * widthAlignment, da1.a(i11, heightAlignment) * heightAlignment);
                int i12 = point.x;
                int i13 = point.y;
                if (!((d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10)))) {
                    if (i10 < i11) {
                        String str = this.f21667a;
                        jb0 jb0Var = f21666i;
                        if ((jb0Var.h().equals(str) && jb0Var.b().equals(da1.f19804b)) ? false : true) {
                            int widthAlignment2 = videoCapabilities.getWidthAlignment();
                            int heightAlignment2 = videoCapabilities.getHeightAlignment();
                            Point point2 = new Point(da1.a(i11, widthAlignment2) * widthAlignment2, da1.a(i10, heightAlignment2) * heightAlignment2);
                            int i14 = point2.x;
                            int i15 = point2.y;
                            if ((d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i14, i15) : videoCapabilities.areSizeAndRateSupported(i14, i15, Math.floor(d10))) {
                                StringBuilder sbA = androidx.recyclerview.widget.o.a("sizeAndRate.rotated, ", i10, "x", i11, "x");
                                sbA.append(d10);
                                StringBuilder sbA2 = androidx.activity.result.c.a("AssumedSupport [", sbA.toString(), "] [");
                                sbA2.append(this.f21667a);
                                sbA2.append(", ");
                                sbA2.append(this.f21668b);
                                sbA2.append("] [");
                                sbA2.append(da1.f19807e);
                                sbA2.append("]");
                                p90.a("MediaCodecInfo", sbA2.toString());
                            }
                        }
                    }
                    StringBuilder sbA3 = androidx.recyclerview.widget.o.a("sizeAndRate.support, ", i10, "x", i11, "x");
                    sbA3.append(d10);
                    string = sbA3.toString();
                }
                return true;
            }
            string = "sizeAndRate.vCaps";
        }
        a(string);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01da  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:174:0x0256  */
    /* JADX WARN: Code duplicated, block: B:175:0x0258  */
    /* JADX WARN: Code duplicated, block: B:178:0x0261  */
    /* JADX WARN: Code duplicated, block: B:181:0x0291  */
    /* JADX WARN: Code duplicated, block: B:182:0x0299  */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0132  */
    /* JADX WARN: Code duplicated, block: B:95:0x0135 A[EDGE_INSN: B:95:0x0135->B:98:0x0157 BREAK  A[LOOP:0: B:80:0x0102->B:96:0x0137]] */
    public final boolean a(yv yvVar) throws nb0.b {
        boolean z10;
        int i10;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        String str;
        String str2;
        int maxInputChannelCount;
        boolean z11;
        String strA;
        boolean z12;
        String strA2;
        int i11;
        Pair<Integer, Integer> pairB;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        boolean z13;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z14 = true;
        if (!(this.f21668b.equals(yvVar.f27115l) || this.f21668b.equals(nb0.a(yvVar)))) {
            return false;
        }
        int i12 = 16;
        if (yvVar.f27112i != null && (pairB = nb0.b(yvVar)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            int iIntValue2 = ((Integer) pairB.second).intValue();
            int i13 = 8;
            if ("video/dolby-vision".equals(yvVar.f27115l)) {
                if ("video/avc".equals(this.f21668b)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(this.f21668b)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (!this.f21674h && iIntValue != 42) {
                z10 = true;
                break;
            }
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f21670d;
            if (codecCapabilities2 == null || (codecProfileLevelArr = codecCapabilities2.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            if (da1.f19803a <= 23 && "video/x-vnd.on2.vp9".equals(this.f21668b) && codecProfileLevelArr.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f21670d;
                int iIntValue3 = (codecCapabilities3 == null || (videoCapabilities = codecCapabilities3.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                if (iIntValue3 >= 180000000) {
                    i13 = 1024;
                } else if (iIntValue3 >= 120000000) {
                    i13 = 512;
                } else if (iIntValue3 >= 60000000) {
                    i13 = 256;
                } else if (iIntValue3 >= 30000000) {
                    i13 = 128;
                } else if (iIntValue3 >= 18000000) {
                    i13 = 64;
                } else if (iIntValue3 >= 12000000) {
                    i13 = 32;
                } else if (iIntValue3 >= 7200000) {
                    i13 = 16;
                } else if (iIntValue3 < 3600000) {
                    if (iIntValue3 >= 1800000) {
                        i13 = 4;
                    } else {
                        i13 = iIntValue3 >= 800000 ? 2 : 1;
                    }
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i13;
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            int length = codecProfileLevelArr.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    StringBuilder sbA = v60.a("codec.profileLevel, ");
                    sbA.append(yvVar.f27112i);
                    sbA.append(", ");
                    sbA.append(this.f21669c);
                    a(sbA.toString());
                    z10 = false;
                    break;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = codecProfileLevelArr[i14];
                if (codecProfileLevel2.profile == iIntValue && codecProfileLevel2.level >= iIntValue2) {
                    if ("video/hevc".equals(this.f21668b) && 2 == iIntValue) {
                        jb0 jb0Var = f21666i;
                        String strJ = jb0Var.j();
                        String str3 = da1.f19804b;
                        if (strJ.equals(str3) || jb0Var.a().equals(str3)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        z10 = true;
                        break;
                    }
                }
                i14++;
            }
        } else {
            z10 = true;
            break;
        }
        if (!z10) {
            return false;
        }
        if (this.f21674h) {
            int i15 = yvVar.f27120q;
            if (i15 > 0 && (i11 = yvVar.f27121r) > 0) {
                if (da1.f19803a >= 21) {
                    return a(i15, i11, yvVar.f27122s);
                }
                z14 = i15 * i11 <= nb0.a();
                if (!z14) {
                    StringBuilder sbA2 = v60.a("legacyFrameSize, ");
                    sbA2.append(yvVar.f27120q);
                    sbA2.append("x");
                    sbA2.append(yvVar.f27121r);
                    a(sbA2.toString());
                }
            }
            return z14;
        }
        int i16 = da1.f19803a;
        if (i16 < 21) {
            return true;
        }
        int i17 = yvVar.f27129z;
        if (i17 == -1) {
            i10 = yvVar.f27128y;
            if (i10 == -1) {
                return true;
            }
            codecCapabilities = this.f21670d;
            if (codecCapabilities == null) {
                strA = "channelCount.caps";
            } else {
                audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    strA = "channelCount.aCaps";
                } else {
                    str = this.f21667a;
                    str2 = this.f21668b;
                    maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i16 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            i12 = 6;
                        } else if (!"audio/eac3".equals(str2)) {
                            i12 = 30;
                        }
                        p90.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i12 + "]");
                        maxInputChannelCount = i12;
                    }
                    if (maxInputChannelCount < i10) {
                        strA = u60.a("channelCount.support, ", i10);
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        return true;
                    }
                }
            }
            a(strA);
            z11 = false;
            if (z11) {
                return true;
            }
        } else {
            MediaCodecInfo.CodecCapabilities codecCapabilities4 = this.f21670d;
            if (codecCapabilities4 == null) {
                strA2 = "sampleRate.caps";
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities4.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    strA2 = "sampleRate.aCaps";
                } else {
                    if (audioCapabilities2.isSampleRateSupported(i17)) {
                        z12 = true;
                    } else {
                        strA2 = u60.a("sampleRate.support, ", i17);
                    }
                    if (z12) {
                        i10 = yvVar.f27128y;
                        if (i10 == -1) {
                            return true;
                        }
                        codecCapabilities = this.f21670d;
                        if (codecCapabilities == null) {
                            strA = "channelCount.caps";
                        } else {
                            audioCapabilities = codecCapabilities.getAudioCapabilities();
                            if (audioCapabilities == null) {
                                strA = "channelCount.aCaps";
                            } else {
                                str = this.f21667a;
                                str2 = this.f21668b;
                                maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                                if (maxInputChannelCount <= 1) {
                                    if ("audio/ac3".equals(str2)) {
                                        i12 = 6;
                                    } else if (!"audio/eac3".equals(str2)) {
                                        i12 = 30;
                                    }
                                    p90.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i12 + "]");
                                    maxInputChannelCount = i12;
                                }
                                if (maxInputChannelCount < i10) {
                                    strA = u60.a("channelCount.support, ", i10);
                                } else {
                                    z11 = true;
                                }
                                if (z11) {
                                    return true;
                                }
                            }
                        }
                        a(strA);
                        z11 = false;
                        if (z11) {
                            return true;
                        }
                    }
                }
            }
            a(strA2);
            z12 = false;
            if (z12) {
                i10 = yvVar.f27128y;
                if (i10 == -1) {
                    return true;
                }
                codecCapabilities = this.f21670d;
                if (codecCapabilities == null) {
                    strA = "channelCount.caps";
                } else {
                    audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        strA = "channelCount.aCaps";
                    } else {
                        str = this.f21667a;
                        str2 = this.f21668b;
                        maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1) {
                            if ("audio/ac3".equals(str2)) {
                                i12 = 6;
                            } else if (!"audio/eac3".equals(str2)) {
                                i12 = 30;
                            }
                            p90.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i12 + "]");
                            maxInputChannelCount = i12;
                        }
                        if (maxInputChannelCount < i10) {
                            strA = u60.a("channelCount.support, ", i10);
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            return true;
                        }
                    }
                }
                a(strA);
                z11 = false;
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(yv yvVar) {
        if (this.f21674h) {
            return this.f21671e;
        }
        Pair<Integer, Integer> pairB = nb0.b(yvVar);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final String toString() {
        return this.f21667a;
    }
}
