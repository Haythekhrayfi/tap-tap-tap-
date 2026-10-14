package com.applovin.exoplayer2.f;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.fragment.app.d0;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f6240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f6247k;

    public i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f6237a = (String) com.applovin.exoplayer2.l.a.b(str);
        this.f6238b = str2;
        this.f6239c = str3;
        this.f6240d = codecCapabilities;
        this.f6244h = z10;
        this.f6245i = z11;
        this.f6246j = z12;
        this.f6241e = z13;
        this.f6242f = z14;
        this.f6243g = z15;
        this.f6247k = com.applovin.exoplayer2.l.u.b(str2);
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((ai.f7595a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        if ("audio/ac3".equals(str2)) {
            i11 = 6;
        } else {
            i11 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        com.applovin.exoplayer2.l.q.c("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(ai.a(i10, widthAlignment) * widthAlignment, ai.a(i11, heightAlignment) * heightAlignment);
    }

    public static i a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new i(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !a(codecCapabilities) || c(str)) ? false : true, codecCapabilities != null && c(codecCapabilities), z14 || (codecCapabilities != null && e(codecCapabilities)));
    }

    private void a(String str) {
        StringBuilder sbA = androidx.activity.result.c.a("NoSupport [", str, "] [");
        sbA.append(this.f6237a);
        sbA.append(", ");
        sbA.append(this.f6238b);
        sbA.append("] [");
        sbA.append(ai.f7599e);
        sbA.append("]");
        com.applovin.exoplayer2.l.q.a("MediaCodecInfo", sbA.toString());
    }

    private static boolean a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ai.f7595a >= 19 && b(codecCapabilities);
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointA = a(videoCapabilities, i10, i11);
        int i12 = pointA.x;
        int i13 = pointA.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private void b(String str) {
        StringBuilder sbA = androidx.activity.result.c.a("AssumedSupport [", str, "] [");
        sbA.append(this.f6237a);
        sbA.append(", ");
        sbA.append(this.f6238b);
        sbA.append("] [");
        sbA.append(ai.f7599e);
        sbA.append("]");
        com.applovin.exoplayer2.l.q.a("MediaCodecInfo", sbA.toString());
    }

    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ai.f7595a >= 21 && d(codecCapabilities);
    }

    private static boolean c(String str) {
        if (ai.f7595a <= 22) {
            String str2 = ai.f7598d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean d(String str) {
        return ai.f7598d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ai.f7595a >= 21 && f(codecCapabilities);
    }

    private static boolean e(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static final boolean f(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(ai.f7596b)) ? false : true;
    }

    private static MediaCodecInfo.CodecProfileLevel[] g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i10 = 1024;
        } else if (iIntValue >= 120000000) {
            i10 = 512;
        } else if (iIntValue >= 60000000) {
            i10 = 256;
        } else if (iIntValue >= 30000000) {
            i10 = 128;
        } else if (iIntValue >= 18000000) {
            i10 = 64;
        } else if (iIntValue >= 12000000) {
            i10 = 32;
        } else if (iIntValue >= 7200000) {
            i10 = 16;
        } else if (iIntValue >= 3600000) {
            i10 = 8;
        } else if (iIntValue >= 1800000) {
            i10 = 4;
        } else {
            i10 = iIntValue >= 800000 ? 2 : 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public Point a(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6240d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return a(videoCapabilities, i10, i11);
    }

    public com.applovin.exoplayer2.c.h a(v vVar, v vVar2) {
        int i10 = !ai.a((Object) vVar.f8198l, (Object) vVar2.f8198l) ? 8 : 0;
        if (this.f6247k) {
            if (vVar.f8206t != vVar2.f8206t) {
                i10 |= 1024;
            }
            if (!this.f6241e && (vVar.f8203q != vVar2.f8203q || vVar.f8204r != vVar2.f8204r)) {
                i10 |= 512;
            }
            if (!ai.a(vVar.f8210x, vVar2.f8210x)) {
                i10 |= 2048;
            }
            if (d(this.f6237a) && !vVar.a(vVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new com.applovin.exoplayer2.c.h(this.f6237a, vVar, vVar2, vVar.a(vVar2) ? 3 : 2, 0);
            }
        } else {
            if (vVar.f8211y != vVar2.f8211y) {
                i10 |= 4096;
            }
            if (vVar.f8212z != vVar2.f8212z) {
                i10 |= 8192;
            }
            if (vVar.A != vVar2.A) {
                i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f6238b)) {
                Pair<Integer, Integer> pairA = l.a(vVar);
                Pair<Integer, Integer> pairA2 = l.a(vVar2);
                if (pairA != null && pairA2 != null) {
                    int iIntValue = ((Integer) pairA.first).intValue();
                    int iIntValue2 = ((Integer) pairA2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new com.applovin.exoplayer2.c.h(this.f6237a, vVar, vVar2, 3, 0);
                    }
                }
            }
            if (!vVar.a(vVar2)) {
                i10 |= 32;
            }
            if (e(this.f6238b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new com.applovin.exoplayer2.c.h(this.f6237a, vVar, vVar2, 1, 0);
            }
        }
        return new com.applovin.exoplayer2.c.h(this.f6237a, vVar, vVar2, 0, i10);
    }

    public boolean a(int i10) {
        String strA;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6240d;
        if (codecCapabilities == null) {
            strA = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                strA = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(i10)) {
                    return true;
                }
                strA = android.support.v4.media.a.a("sampleRate.support, ", i10);
            }
        }
        a(strA);
        return false;
    }

    public boolean a(int i10, int i11, double d10) {
        String string;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6240d;
        if (codecCapabilities == null) {
            string = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                string = "sizeAndRate.vCaps";
            } else {
                if (a(videoCapabilities, i10, i11, d10)) {
                    return true;
                }
                if (i10 < i11 && f(this.f6237a) && a(videoCapabilities, i11, i10, d10)) {
                    StringBuilder sbA = androidx.recyclerview.widget.o.a("sizeAndRate.rotated, ", i10, "x", i11, "x");
                    sbA.append(d10);
                    b(sbA.toString());
                    return true;
                }
                StringBuilder sbA2 = androidx.recyclerview.widget.o.a("sizeAndRate.support, ", i10, "x", i11, "x");
                sbA2.append(d10);
                string = sbA2.toString();
            }
        }
        a(string);
        return false;
    }

    public boolean a(v vVar) throws l.b {
        int i10;
        if (!b(vVar)) {
            return false;
        }
        if (!this.f6247k) {
            if (ai.f7595a >= 21) {
                int i11 = vVar.f8212z;
                if (i11 != -1 && !a(i11)) {
                    return false;
                }
                int i12 = vVar.f8211y;
                if (i12 != -1 && !b(i12)) {
                    return false;
                }
            }
            return true;
        }
        int i13 = vVar.f8203q;
        if (i13 <= 0 || (i10 = vVar.f8204r) <= 0) {
            return true;
        }
        if (ai.f7595a >= 21) {
            return a(i13, i10, vVar.f8205s);
        }
        boolean z10 = i13 * i10 <= l.b();
        if (!z10) {
            StringBuilder sbA = defpackage.a.a("legacyFrameSize, ");
            sbA.append(vVar.f8203q);
            sbA.append("x");
            sbA.append(vVar.f8204r);
            a(sbA.toString());
        }
        return z10;
    }

    public MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6240d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean b() {
        if (ai.f7595a >= 29 && "video/x-vnd.on2.vp9".equals(this.f6238b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b(int i10) {
        String strA;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f6240d;
        if (codecCapabilities == null) {
            strA = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                strA = "channelCount.aCaps";
            } else {
                if (a(this.f6237a, this.f6238b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
                    return true;
                }
                strA = android.support.v4.media.a.a("channelCount.support, ", i10);
            }
        }
        a(strA);
        return false;
    }

    public boolean b(v vVar) {
        String strD;
        StringBuilder sb2;
        String str;
        String str2 = vVar.f8195i;
        if (str2 == null || this.f6238b == null || (strD = com.applovin.exoplayer2.l.u.d(str2)) == null) {
            return true;
        }
        if (this.f6238b.equals(strD)) {
            Pair<Integer, Integer> pairA = l.a(vVar);
            if (pairA == null) {
                return true;
            }
            int iIntValue = ((Integer) pairA.first).intValue();
            int iIntValue2 = ((Integer) pairA.second).intValue();
            if (!this.f6247k && iIntValue != 42) {
                return true;
            }
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrA = a();
            if (ai.f7595a <= 23 && "video/x-vnd.on2.vp9".equals(this.f6238b) && codecProfileLevelArrA.length == 0) {
                codecProfileLevelArrA = g(this.f6240d);
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrA) {
                if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                    return true;
                }
            }
            sb2 = new StringBuilder();
            str = "codec.profileLevel, ";
        } else {
            sb2 = new StringBuilder();
            str = "codec.mime ";
        }
        sb2.append(str);
        a(d0.a(sb2, vVar.f8195i, ", ", strD));
        return false;
    }

    public boolean c(v vVar) {
        if (this.f6247k) {
            return this.f6241e;
        }
        Pair<Integer, Integer> pairA = l.a(vVar);
        return pairA != null && ((Integer) pairA.first).intValue() == 42;
    }

    public String toString() {
        return this.f6237a;
    }
}
