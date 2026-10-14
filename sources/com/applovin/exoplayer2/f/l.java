package com.applovin.exoplayer2.f;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.util.FileUtil;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f6285a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<a, List<i>> f6286b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6287c = -1;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6290c;

        public a(String str, boolean z10, boolean z11) {
            this.f6288a = str;
            this.f6289b = z10;
            this.f6290c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.f6288a, aVar.f6288a) && this.f6289b == aVar.f6289b && this.f6290c == aVar.f6290c;
        }

        public int hashCode() {
            return ((l1.e.a(this.f6288a, 31, 31) + (this.f6289b ? 1231 : 1237)) * 31) + (this.f6290c ? 1231 : 1237);
        }
    }

    public static class b extends Exception {
        private b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public interface c {
        int a();

        MediaCodecInfo a(int i10);

        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    public static final class d implements c {
        private d() {
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean b() {
            return false;
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }
    }

    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f6292b;

        public e(boolean z10, boolean z11) {
            this.f6291a = (z10 || z11) ? 1 : 0;
        }

        private void c() {
            if (this.f6292b == null) {
                this.f6292b = new MediaCodecList(this.f6291a).getCodecInfos();
            }
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public int a() {
            c();
            return this.f6292b.length;
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public MediaCodecInfo a(int i10) {
            c();
            return this.f6292b[i10];
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean b() {
            return true;
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }
    }

    public interface f<T> {
        int getScore(T t10);
    }

    private static int a(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                return 5652480;
            case FileUtil.BUF_SIZE /* 32768 */:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(i iVar) {
        return iVar.f6237a.startsWith("OMX.google") ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.getScore(obj2) - fVar.getScore(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(v vVar, i iVar) {
        try {
            return iVar.a(vVar) ? 1 : 0;
        } catch (b unused) {
            return -1;
        }
    }

    public static Pair<Integer, Integer> a(v vVar) {
        String str = vVar.f8195i;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(vVar.f8198l)) {
            return a(vVar.f8195i, strArrSplit);
        }
        byte b10 = 0;
        String str2 = strArrSplit[0];
        Objects.requireNonNull(str2);
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals("av01")) {
                    b10 = -1;
                }
                break;
            case 3006243:
                b10 = !str2.equals("avc1") ? (byte) -1 : (byte) 1;
                break;
            case 3006244:
                b10 = !str2.equals("avc2") ? (byte) -1 : (byte) 2;
                break;
            case 3199032:
                b10 = !str2.equals("hev1") ? (byte) -1 : (byte) 3;
                break;
            case 3214780:
                b10 = !str2.equals("hvc1") ? (byte) -1 : (byte) 4;
                break;
            case 3356560:
                b10 = !str2.equals("mp4a") ? (byte) -1 : (byte) 5;
                break;
            case 3624515:
                b10 = !str2.equals("vp09") ? (byte) -1 : (byte) 6;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return a(vVar.f8195i, strArrSplit, vVar.f8210x);
            case 1:
            case 2:
                return c(vVar.f8195i, strArrSplit);
            case 3:
            case 4:
                return b(vVar.f8195i, strArrSplit);
            case 5:
                return e(vVar.f8195i, strArrSplit);
            case 6:
                return d(vVar.f8195i, strArrSplit);
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        StringBuilder sb2;
        String str2;
        if (strArr.length >= 3) {
            Matcher matcher = f6285a.matcher(strArr[1]);
            if (matcher.matches()) {
                str = matcher.group(1);
                Integer numB = b(str);
                if (numB == null) {
                    sb2 = new StringBuilder();
                    str2 = "Unknown Dolby Vision profile string: ";
                } else {
                    str = strArr[2];
                    Integer numC = c(str);
                    if (numC != null) {
                        return new Pair<>(numB, numC);
                    }
                    sb2 = new StringBuilder();
                    str2 = "Unknown Dolby Vision level string: ";
                }
                sb2.append(str2);
            } else {
                sb2 = new StringBuilder();
            }
            sb2.append(str);
            com.applovin.exoplayer2.l.q.c("MediaCodecUtil", sb2.toString());
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed Dolby Vision codec string: ");
        sb2.append(str);
        com.applovin.exoplayer2.l.q.c("MediaCodecUtil", sb2.toString());
        return null;
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr, com.applovin.exoplayer2.m.b bVar) {
        StringBuilder sb2;
        StringBuilder sb3;
        int i10;
        String string;
        if (strArr.length >= 4) {
            int i11 = 1;
            try {
                int i12 = Integer.parseInt(strArr[1]);
                int i13 = Integer.parseInt(strArr[2].substring(0, 2));
                int i14 = Integer.parseInt(strArr[3]);
                if (i12 != 0) {
                    sb3 = new StringBuilder();
                    sb3.append("Unknown AV1 profile: ");
                    sb3.append(i12);
                } else {
                    if (i14 != 8 && i14 != 10) {
                        sb2 = new StringBuilder();
                        sb2.append("Unknown AV1 bit depth: ");
                        sb2.append(i14);
                        string = sb2.toString();
                        com.applovin.exoplayer2.l.q.c("MediaCodecUtil", string);
                        return null;
                    }
                    if (i14 != 8) {
                        i11 = (bVar == null || !(bVar.f7764d != null || (i10 = bVar.f7763c) == 7 || i10 == 6)) ? 2 : 4096;
                    }
                    int iF = f(i13);
                    if (iF != -1) {
                        return new Pair<>(Integer.valueOf(i11), Integer.valueOf(iF));
                    }
                    sb3 = new StringBuilder();
                    sb3.append("Unknown AV1 level: ");
                    sb3.append(i13);
                }
                string = sb3.toString();
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
                sb2.append("Ignoring malformed AV1 codec string: ");
                sb2.append(str);
            }
            com.applovin.exoplayer2.l.q.c("MediaCodecUtil", string);
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed AV1 codec string: ");
        sb2.append(str);
        string = sb2.toString();
        com.applovin.exoplayer2.l.q.c("MediaCodecUtil", string);
        return null;
    }

    public static i a() throws b {
        return a("audio/raw", false, false);
    }

    public static i a(String str, boolean z10, boolean z11) throws b {
        List<i> listB = b(str, z10, z11);
        if (listB.isEmpty()) {
            return null;
        }
        return listB.get(0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Integer a(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b10 = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b10 = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b10 = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b10 = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b10 = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b10 = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b10 = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b10 = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b10 = 8;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    b10 = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b10 = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b10 = 11;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b10 = 12;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b10 = 13;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b10 = 14;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b10 = 15;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b10 = 16;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b10 = 17;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b10 = 18;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b10 = 19;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b10 = 20;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b10 = 21;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b10 = 22;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    b10 = 23;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b10 = Ascii.CAN;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b10 = Ascii.EM;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                i10 = 32;
                break;
            case 3:
                i10 = 128;
                break;
            case 4:
                i10 = 512;
                break;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                i10 = 64;
                break;
            case 9:
                i10 = 256;
                break;
            case 10:
                i10 = 2048;
                break;
            case 11:
                i10 = 8192;
                break;
            case 12:
                i10 = FileUtil.BUF_SIZE;
                break;
            case 13:
                i10 = 131072;
                break;
            case 14:
                i10 = 524288;
                break;
            case 15:
                i10 = 2097152;
                break;
            case 16:
                i10 = 8388608;
                break;
            case 17:
                i10 = 33554432;
                break;
            case 18:
                i10 = 1024;
                break;
            case 19:
                i10 = 4096;
                break;
            case 20:
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
                break;
            case 21:
                i10 = 65536;
                break;
            case 22:
                i10 = 262144;
                break;
            case 23:
                i10 = 1048576;
                break;
            case 24:
                i10 = 4194304;
                break;
            case 25:
                i10 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    private static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101 A[Catch: Exception -> 0x014f, TRY_ENTER, TryCatch #1 {Exception -> 0x014f, blocks: (B:3:0x0008, B:5:0x001b, B:60:0x0120, B:8:0x002d, B:11:0x0038, B:54:0x00f9, B:57:0x0101, B:59:0x0107, B:61:0x012a, B:62:0x014d), top: B:69:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:81:0x012a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static ArrayList<i> a(a aVar, c cVar) throws b {
        String strA;
        String str;
        String str2;
        int i10;
        boolean z10;
        int i11;
        a aVar2 = aVar;
        try {
            ArrayList<i> arrayList = new ArrayList<>();
            String str3 = aVar2.f6288a;
            int iA = cVar.a();
            boolean zB = cVar.b();
            int i12 = 0;
            while (i12 < iA) {
                MediaCodecInfo mediaCodecInfoA = cVar.a(i12);
                if (a(mediaCodecInfoA)) {
                    i10 = i12;
                    z10 = zB;
                    i11 = iA;
                } else {
                    String name = mediaCodecInfoA.getName();
                    if (a(mediaCodecInfoA, name, zB, str3) && (strA = a(mediaCodecInfoA, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(strA);
                            boolean zA = cVar.a("tunneled-playback", strA, capabilitiesForType);
                            boolean zB2 = cVar.b("tunneled-playback", strA, capabilitiesForType);
                            boolean z11 = aVar2.f6290c;
                            if ((z11 || !zB2) && (!z11 || zA)) {
                                boolean zA2 = cVar.a("secure-playback", strA, capabilitiesForType);
                                boolean zB3 = cVar.b("secure-playback", strA, capabilitiesForType);
                                boolean z12 = aVar2.f6289b;
                                if ((z12 || !zB3) && (!z12 || zA2)) {
                                    boolean zC = c(mediaCodecInfoA);
                                    boolean zE = e(mediaCodecInfoA);
                                    boolean zG = g(mediaCodecInfoA);
                                    if (zB && aVar2.f6289b == zA2) {
                                        str = strA;
                                        i10 = i12;
                                        z10 = zB;
                                        i11 = iA;
                                        arrayList.add(i.a(name, str3, strA, capabilitiesForType, zC, zE, zG, false, false));
                                    } else if (zB) {
                                        str = strA;
                                        i10 = i12;
                                        z10 = zB;
                                        i11 = iA;
                                        if (!z10) {
                                            continue;
                                        }
                                    } else {
                                        try {
                                            if (aVar2.f6289b) {
                                                str = strA;
                                                i10 = i12;
                                                z10 = zB;
                                                i11 = iA;
                                                if (!z10 && zA2) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    try {
                                                        sb2.append(name);
                                                        sb2.append(".secure");
                                                        str2 = name;
                                                        try {
                                                            arrayList.add(i.a(sb2.toString(), str3, str, capabilitiesForType, zC, zE, zG, false, true));
                                                            return arrayList;
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            if (ai.f7595a <= 23 || arrayList.isEmpty()) {
                                                                com.applovin.exoplayer2.l.q.d("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                                throw e;
                                                            }
                                                            com.applovin.exoplayer2.l.q.d("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                            i12 = i10 + 1;
                                                            aVar2 = aVar;
                                                            iA = i11;
                                                            zB = z10;
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        str2 = name;
                                                    }
                                                }
                                            } else {
                                                str = strA;
                                                i10 = i12;
                                                z10 = zB;
                                                i11 = iA;
                                                try {
                                                    arrayList.add(i.a(name, str3, strA, capabilitiesForType, zC, zE, zG, false, false));
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    str2 = name;
                                                    if (ai.f7595a <= 23) {
                                                    }
                                                    com.applovin.exoplayer2.l.q.d("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            str = strA;
                                            i10 = i12;
                                            z10 = zB;
                                            i11 = iA;
                                            str2 = name;
                                            if (ai.f7595a <= 23) {
                                            }
                                            com.applovin.exoplayer2.l.q.d("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                } else {
                                    i10 = i12;
                                    z10 = zB;
                                    i11 = iA;
                                }
                            } else {
                                i10 = i12;
                                z10 = zB;
                                i11 = iA;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            str = strA;
                            str2 = name;
                            i10 = i12;
                            z10 = zB;
                            i11 = iA;
                        }
                    } else {
                        i10 = i12;
                        z10 = zB;
                        i11 = iA;
                    }
                }
                i12 = i10 + 1;
                aVar2 = aVar;
                iA = i11;
                zB = z10;
            }
            return arrayList;
        } catch (Exception e15) {
            throw new b(e15);
        }
    }

    public static List<i> a(List<i> list, final v vVar) {
        ArrayList arrayList = new ArrayList(list);
        a(arrayList, new f() { // from class: com.applovin.exoplayer2.f.r
            @Override // com.applovin.exoplayer2.f.l.f
            public final int getScore(Object obj) {
                return l.a(vVar, (i) obj);
            }
        });
        return arrayList;
    }

    private static void a(String str, List<i> list) {
        if ("audio/raw".equals(str)) {
            if (ai.f7595a < 26 && ai.f7596b.equals("R9") && list.size() == 1 && list.get(0).f6237a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(i.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            a(list, new f() { // from class: com.applovin.exoplayer2.f.s
                @Override // com.applovin.exoplayer2.f.l.f
                public final int getScore(Object obj) {
                    return l.b((i) obj);
                }
            });
        }
        int i10 = ai.f7595a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f6237a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                a(list, new f() { // from class: com.applovin.exoplayer2.f.t
                    @Override // com.applovin.exoplayer2.f.l.f
                    public final int getScore(Object obj) {
                        return l.a((i) obj);
                    }
                });
            }
        }
        if (i10 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f6237a)) {
            return;
        }
        list.add(list.remove(0));
    }

    private static <T> void a(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: com.applovin.exoplayer2.f.u
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return l.a(fVar, obj, obj2);
            }
        });
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo) {
        return ai.f7595a >= 29 && b(mediaCodecInfo);
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = ai.f7595a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = ai.f7596b;
            if ("a70".equals(str3) || ("Xiaomi".equals(ai.f7597c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = ai.f7596b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = ai.f7596b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(ai.f7597c))) {
            String str6 = ai.f7596b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(ai.f7597c)) {
            String str7 = ai.f7596b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && ai.f7596b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static int b() throws b {
        if (f6287c == -1) {
            int iMax = 0;
            i iVarA = a("video/avc", false, false);
            if (iVarA != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrA = iVarA.a();
                int length = codecProfileLevelArrA.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(a(codecProfileLevelArrA[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, ai.f7595a >= 21 ? 345600 : 172800);
            }
            f6287c = iMax;
        }
        return f6287c;
    }

    private static int b(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(i iVar) {
        String str = iVar.f6237a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (ai.f7595a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    private static Pair<Integer, Integer> b(String str, String[] strArr) {
        Integer numA;
        StringBuilder sb2;
        String str2;
        if (strArr.length >= 4) {
            int i10 = 1;
            Matcher matcher = f6285a.matcher(strArr[1]);
            if (matcher.matches()) {
                str = matcher.group(1);
                if ("1".equals(str)) {
                    str = strArr[3];
                    numA = a(str);
                    if (numA == null) {
                        return new Pair<>(Integer.valueOf(i10), numA);
                    }
                    sb2 = new StringBuilder();
                    str2 = "Unknown HEVC level string: ";
                } else if ("2".equals(str)) {
                    i10 = 2;
                    str = strArr[3];
                    numA = a(str);
                    if (numA == null) {
                        return new Pair<>(Integer.valueOf(i10), numA);
                    }
                    sb2 = new StringBuilder();
                    str2 = "Unknown HEVC level string: ";
                } else {
                    sb2 = new StringBuilder();
                    str2 = "Unknown HEVC profile string: ";
                }
                sb2.append(str2);
            } else {
                sb2 = new StringBuilder();
            }
            sb2.append(str);
            com.applovin.exoplayer2.l.q.c("MediaCodecUtil", sb2.toString());
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed HEVC codec string: ");
        sb2.append(str);
        com.applovin.exoplayer2.l.q.c("MediaCodecUtil", sb2.toString());
        return null;
    }

    private static Integer b(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                i10 = 16;
                break;
            case "05":
                i10 = 32;
                break;
            case "06":
                i10 = 64;
                break;
            case "07":
                i10 = 128;
                break;
            case "08":
                i10 = 256;
                break;
            case "09":
                i10 = 512;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    public static synchronized List<i> b(String str, boolean z10, boolean z11) throws b {
        a aVar = new a(str, z10, z11);
        HashMap<a, List<i>> map = f6286b;
        List<i> list = map.get(aVar);
        if (list != null) {
            return list;
        }
        int i10 = ai.f7595a;
        ArrayList<i> arrayListA = a(aVar, i10 >= 21 ? new e(z10, z11) : new d());
        if (z10 && arrayListA.isEmpty() && 21 <= i10 && i10 <= 23) {
            arrayListA = a(aVar, new d());
            if (!arrayListA.isEmpty()) {
                com.applovin.exoplayer2.l.q.c("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListA.get(0).f6237a);
            }
        }
        a(str, arrayListA);
        List<i> listUnmodifiableList = Collections.unmodifiableList(arrayListA);
        map.put(aVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    private static boolean b(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static int c(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return Http2.INITIAL_MAX_FRAME_SIZE;
                                            case 51:
                                                return FileUtil.BUF_SIZE;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static Pair<Integer, Integer> c(String str, String[] strArr) {
        StringBuilder sb2;
        int i10;
        int i11;
        String strA;
        if (strArr.length >= 2) {
            try {
                if (strArr[1].length() == 6) {
                    i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                    i10 = Integer.parseInt(strArr[1].substring(4), 16);
                } else {
                    if (strArr.length < 3) {
                        com.applovin.exoplayer2.l.q.c("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                        return null;
                    }
                    int i12 = Integer.parseInt(strArr[1]);
                    i10 = Integer.parseInt(strArr[2]);
                    i11 = i12;
                }
                int iB = b(i11);
                if (iB == -1) {
                    strA = android.support.v4.media.a.a("Unknown AVC profile: ", i11);
                } else {
                    int iC = c(i10);
                    if (iC != -1) {
                        return new Pair<>(Integer.valueOf(iB), Integer.valueOf(iC));
                    }
                    sb2 = new StringBuilder();
                    sb2.append("Unknown AVC level: ");
                    sb2.append(i10);
                    strA = sb2.toString();
                }
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
                sb2.append("Ignoring malformed AVC codec string: ");
                sb2.append(str);
            }
            com.applovin.exoplayer2.l.q.c("MediaCodecUtil", strA);
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed AVC codec string: ");
        sb2.append(str);
        strA = sb2.toString();
        com.applovin.exoplayer2.l.q.c("MediaCodecUtil", strA);
        return null;
    }

    private static Integer c(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                i10 = 16;
                break;
            case "06":
                i10 = 32;
                break;
            case "07":
                i10 = 64;
                break;
            case "08":
                i10 = 128;
                break;
            case "09":
                i10 = 256;
                break;
            case "10":
                i10 = 512;
                break;
            case "11":
                i10 = 1024;
                break;
            case "12":
                i10 = 2048;
                break;
            case "13":
                i10 = 4096;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    private static boolean c(MediaCodecInfo mediaCodecInfo) {
        return ai.f7595a >= 29 ? d(mediaCodecInfo) : !e(mediaCodecInfo);
    }

    private static int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static Pair<Integer, Integer> d(String str, String[] strArr) {
        StringBuilder sb2;
        String strA;
        if (strArr.length >= 3) {
            try {
                int i10 = Integer.parseInt(strArr[1]);
                int i11 = Integer.parseInt(strArr[2]);
                int iD = d(i10);
                if (iD == -1) {
                    strA = android.support.v4.media.a.a("Unknown VP9 profile: ", i10);
                } else {
                    int iE = e(i11);
                    if (iE != -1) {
                        return new Pair<>(Integer.valueOf(iD), Integer.valueOf(iE));
                    }
                    sb2 = new StringBuilder();
                    sb2.append("Unknown VP9 level: ");
                    sb2.append(i11);
                    strA = sb2.toString();
                }
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
                sb2.append("Ignoring malformed VP9 codec string: ");
                sb2.append(str);
            }
            com.applovin.exoplayer2.l.q.c("MediaCodecUtil", strA);
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed VP9 codec string: ");
        sb2.append(str);
        strA = sb2.toString();
        com.applovin.exoplayer2.l.q.c("MediaCodecUtil", strA);
        return null;
    }

    private static boolean d(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static int e(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static Pair<Integer, Integer> e(String str, String[] strArr) {
        int iG;
        if (strArr.length != 3) {
            com.applovin.exoplayer2.l.q.c("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(com.applovin.exoplayer2.l.u.a(Integer.parseInt(strArr[1], 16))) && (iG = g(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iG), 0);
            }
        } catch (NumberFormatException unused) {
            com.applovin.exoplayer2.l.q.c("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    private static boolean e(MediaCodecInfo mediaCodecInfo) {
        if (ai.f7595a >= 29) {
            return f(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static int f(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return Http2.INITIAL_MAX_FRAME_SIZE;
            case 15:
                return FileUtil.BUF_SIZE;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static boolean f(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static int g(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    private static boolean g(MediaCodecInfo mediaCodecInfo) {
        if (ai.f7595a >= 29) {
            return h(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    private static boolean h(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }
}
