package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.util.FileUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"InlinedApi"})
public final class nb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ob0 f23314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f23315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<a, List<ib0>> f23316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f23317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f23318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f23319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f23320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f23321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f23322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f23323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f23324k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f23326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f23327c;

        public a(String str, boolean z10, boolean z11) {
            this.f23325a = str;
            this.f23326b = z10;
            this.f23327c = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.f23325a, aVar.f23325a) && this.f23326b == aVar.f23326b && this.f23327c == aVar.f23327c;
        }

        public final int hashCode() {
            return ((z11.a(this.f23325a, 31, 31) + (this.f23326b ? 1231 : 1237)) * 31) + (this.f23327c ? 1231 : 1237);
        }
    }

    public static class b extends Exception {
        private b(Exception exc) {
            super("Failed to query underlying media codecs", exc);
        }

        public /* synthetic */ b(Exception exc, int i10) {
            this(exc);
        }
    }

    public interface c {
        int a();

        MediaCodecInfo a(int i10);

        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();
    }

    public static final class d implements c {
        private d() {
        }

        public /* synthetic */ d(int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.nb0.c
        public final int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.yandex.mobile.ads.impl.nb0.c
        public final MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // com.yandex.mobile.ads.impl.nb0.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.nb0.c
        public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.yandex.mobile.ads.impl.nb0.c
        public final boolean b() {
            return false;
        }
    }

    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f23329b;

        public e(boolean z10, boolean z11) {
            this.f23328a = (z10 || z11) ? 1 : 0;
        }

        @Override // com.yandex.mobile.ads.impl.nb0.c
        public final int a() {
            if (this.f23329b == null) {
                this.f23329b = new MediaCodecList(this.f23328a).getCodecInfos();
            }
            return this.f23329b.length;
        }

        @Override // com.yandex.mobile.ads.impl.nb0.c
        public final MediaCodecInfo a(int i10) {
            if (this.f23329b == null) {
                this.f23329b = new MediaCodecList(this.f23328a).getCodecInfos();
            }
            return this.f23329b[i10];
        }

        @Override // com.yandex.mobile.ads.impl.nb0.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.yandex.mobile.ads.impl.nb0.c
        public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.yandex.mobile.ads.impl.nb0.c
        public final boolean b() {
            return true;
        }
    }

    public interface f<T> {
        int a(T t10);
    }

    static {
        ob0 ob0VarG = ot0.g();
        f23314a = ob0VarG;
        f23315b = Pattern.compile("^\\D?(\\d+)$");
        f23316c = new HashMap<>();
        f23317d = ob0VarG.d();
        f23318e = ob0VarG.e();
        f23319f = ob0VarG.P0();
        f23320g = ob0VarG.H();
        f23321h = ob0VarG.I();
        f23322i = ob0VarG.c();
        f23323j = ob0VarG.Z();
        f23324k = -1;
    }

    public static int a() throws b {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f23324k == -1) {
            int iMax = 0;
            List<ib0> listA = a("video/avc", false, false);
            ib0 ib0Var = listA.isEmpty() ? null : listA.get(0);
            if (ib0Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = ib0Var.f21670d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = codecProfileLevelArr[iMax].level;
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
                    iMax++;
                }
                iMax = Math.max(iMax2, da1.f19803a >= 21 ? 345600 : 172800);
            }
            f23324k = iMax;
        }
        return f23324k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(ib0 ib0Var) {
        String str = ib0Var.f21667a;
        ob0 ob0Var = f23314a;
        if (str.startsWith(ob0Var.l0()) || str.startsWith("c2.android")) {
            return 1;
        }
        return (da1.f19803a >= 26 || !str.equals(ob0Var.e0())) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(yv yvVar, ib0 ib0Var) {
        try {
            return ib0Var.a(yvVar) ? 1 : 0;
        } catch (b unused) {
            return -1;
        }
    }

    private static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            ob0 ob0Var = f23314a;
            if (ob0Var.b0().equals(str)) {
                return ob0Var.L0();
            }
            if (ob0Var.f0().equals(str) || ob0Var.u0().equals(str)) {
                return ob0Var.K0();
            }
            return null;
        }
        if (str2.equals("audio/alac") && f23314a.o0().equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && f23314a.p0().equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && f23314a.n0().equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static String a(yv yvVar) {
        Pair<Integer, Integer> pairB;
        if ("audio/eac3-joc".equals(yvVar.f27115l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(yvVar.f27115l) || (pairB = b(yvVar)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static ArrayList a(com.yandex.mobile.ads.embedded.guava.collect.p pVar, yv yvVar) {
        ArrayList arrayList = new ArrayList(pVar);
        a(arrayList, new ho1(yvVar));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:73:0x0140 A[Catch: Exception -> 0x018c, TRY_ENTER, TryCatch #2 {Exception -> 0x018c, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0024, B:76:0x015f, B:13:0x0037, B:16:0x0042, B:70:0x0138, B:73:0x0140, B:75:0x0146, B:77:0x0167, B:78:0x018a), top: B:87:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0167 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static ArrayList<ib0> a(a aVar, c cVar) throws b {
        String strA;
        String str;
        String str2;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        try {
            ArrayList<ib0> arrayList = new ArrayList<>();
            String str3 = aVar.f23325a;
            boolean zB = cVar.b();
            int i12 = 0;
            for (int iA = cVar.a(); i12 < iA; iA = i11) {
                MediaCodecInfo mediaCodecInfoA = cVar.a(i12);
                int i13 = da1.f19803a;
                if (i13 >= 29 && mediaCodecInfoA.isAlias()) {
                    i10 = i12;
                    z10 = zB;
                    i11 = iA;
                } else {
                    String name = mediaCodecInfoA.getName();
                    if (a(mediaCodecInfoA, name, zB, str3) && (strA = a(mediaCodecInfoA, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(strA);
                            boolean zA = cVar.a("tunneled-playback", strA, capabilitiesForType);
                            boolean zA2 = cVar.a("tunneled-playback", capabilitiesForType);
                            boolean z12 = aVar.f23327c;
                            if ((z12 || !zA2) && (!z12 || zA)) {
                                boolean zA3 = cVar.a("secure-playback", strA, capabilitiesForType);
                                boolean zA4 = cVar.a("secure-playback", capabilitiesForType);
                                boolean z13 = aVar.f23326b;
                                if ((z13 || !zA4) && (!z13 || zA3)) {
                                    if (i13 >= 29) {
                                        zIsHardwareAccelerated = mediaCodecInfoA.isHardwareAccelerated();
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                        zIsHardwareAccelerated = !a(mediaCodecInfoA, str3);
                                    }
                                    boolean zA5 = a(mediaCodecInfoA, str3);
                                    if (i13 >= 29) {
                                        zIsVendor = mediaCodecInfoA.isVendor();
                                    } else {
                                        String strB = na.b(mediaCodecInfoA.getName());
                                        zIsVendor = (strB.startsWith(f23314a.x0()) || strB.startsWith("c2.android.") || strB.startsWith("c2.google.")) ? false : z11;
                                    }
                                    if (zB && aVar.f23326b == zA3) {
                                        str = strA;
                                        str2 = name;
                                        i10 = i12;
                                        z10 = zB;
                                        i11 = iA;
                                        arrayList.add(ib0.a(name, str3, strA, capabilitiesForType, zIsHardwareAccelerated, zA5, zIsVendor, false));
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
                                            if (aVar.f23326b) {
                                                str = strA;
                                                i10 = i12;
                                                z10 = zB;
                                                i11 = iA;
                                                if (!z10 && zA3) {
                                                    try {
                                                        str2 = name;
                                                        arrayList.add(ib0.a(name + ".secure", str3, str, capabilitiesForType, zIsHardwareAccelerated, zA5, zIsVendor, true));
                                                        return arrayList;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        str2 = name;
                                                        if (da1.f19803a <= 23) {
                                                        }
                                                        p90.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                        throw e;
                                                    }
                                                }
                                            } else {
                                                str = strA;
                                                str2 = name;
                                                i10 = i12;
                                                z10 = zB;
                                                i11 = iA;
                                                try {
                                                    arrayList.add(ib0.a(name, str3, strA, capabilitiesForType, zIsHardwareAccelerated, zA5, zIsVendor, false));
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    if (da1.f19803a <= 23) {
                                                    }
                                                    p90.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            str = strA;
                                            i10 = i12;
                                            z10 = zB;
                                            i11 = iA;
                                            str2 = name;
                                            if (da1.f19803a <= 23 || arrayList.isEmpty()) {
                                                p90.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                            p90.b("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                            i12 = i10 + 1;
                                            zB = z10;
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
                        } catch (Exception e13) {
                            e = e13;
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
                zB = z10;
            }
            return arrayList;
        } catch (Exception e14) {
            throw new b(e14, 0);
        }
    }

    public static synchronized List<ib0> a(String str, boolean z10, boolean z11) throws b {
        a aVar = new a(str, z10, z11);
        HashMap<a, List<ib0>> map = f23316c;
        List<ib0> list = map.get(aVar);
        if (list != null) {
            return list;
        }
        int i10 = da1.f19803a;
        int i11 = 0;
        ArrayList<ib0> arrayListA = a(aVar, i10 >= 21 ? new e(z10, z11) : new d(i11));
        if (z10 && arrayListA.isEmpty() && 21 <= i10 && i10 <= 23) {
            arrayListA = a(aVar, new d(i11));
            if (!arrayListA.isEmpty()) {
                p90.d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListA.get(0).f21667a);
            }
        }
        a(str, arrayListA);
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) arrayListA);
        map.put(aVar, pVarA);
        return pVarA;
    }

    private static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (da1.f19803a < 26) {
                String str2 = da1.f19804b;
                ob0 ob0Var = f23314a;
                if (str2.equals(ob0Var.B0()) && arrayList.size() == 1 && ((ib0) arrayList.get(0)).f21667a.equals(ob0Var.e0())) {
                    arrayList.add(ib0.a(ob0Var.m0(), "audio/raw", "audio/raw", null, false, true, false, false));
                }
            }
            a(arrayList, yn1.f26945e);
        }
        int i10 = da1.f19803a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str3 = ((ib0) arrayList.get(0)).f21667a;
            ob0 ob0Var2 = f23314a;
            if (ob0Var2.i0().equals(str3) || ob0Var2.g0().equals(str3) || ob0Var2.k0().equals(str3)) {
                a(arrayList, dp1.f19945d);
            }
        }
        if (i10 >= 32 || arrayList.size() <= 1) {
            return;
        }
        if (f23314a.t0().equals(((ib0) arrayList.get(0)).f21667a)) {
            arrayList.add((ib0) arrayList.remove(0));
        }
    }

    private static void a(ArrayList arrayList, final f fVar) {
        Collections.sort(arrayList, new Comparator() { // from class: com.yandex.mobile.ads.impl.ep1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return nb0.a(fVar, obj, obj2);
            }
        });
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str) {
        if (da1.f19803a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (te0.b(str)) {
            return true;
        }
        String strB = na.b(mediaCodecInfo.getName());
        if (strB.startsWith("arc.")) {
            return false;
        }
        ob0 ob0Var = f23314a;
        if (strB.startsWith(ob0Var.x0()) || strB.startsWith(ob0Var.w0())) {
            return true;
        }
        if ((strB.startsWith(ob0Var.z0()) && strB.contains(".sw.")) || strB.equals(ob0Var.y0()) || strB.startsWith("c2.android.") || strB.startsWith("c2.google.")) {
            return true;
        }
        return (strB.startsWith(ob0Var.v0()) || strB.startsWith("c2.")) ? false : true;
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = da1.f19803a;
        if (i10 < 21) {
            ob0 ob0Var = f23314a;
            if (ob0Var.n().equals(str) || ob0Var.p().equals(str) || ob0Var.q().equals(str) || ob0Var.o().equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str)) {
                return false;
            }
        }
        if (i10 < 18) {
            ob0 ob0Var2 = f23314a;
            if (ob0Var2.c0().equals(str)) {
                String strB = ob0Var2.b();
                String str3 = da1.f19804b;
                if (strB.equals(str3) || (ob0Var2.Q0().equals(da1.f19805c) && str3.startsWith(ob0Var2.G()))) {
                    return false;
                }
            }
        }
        if (i10 == 16) {
            ob0 ob0Var3 = f23314a;
            if (ob0Var3.r0().equals(str)) {
                String strR = ob0Var3.r();
                String str4 = da1.f19804b;
                if (strR.equals(str4) || ob0Var3.A0().equals(str4) || ob0Var3.M0().equals(str4) || ob0Var3.O0().equals(str4) || ob0Var3.N0().equals(str4) || str4.startsWith(ob0Var3.s()) || ob0Var3.j().equals(str4) || ob0Var3.k().equals(str4) || ob0Var3.l().equals(str4) || ob0Var3.m().equals(str4) || ob0Var3.T().equals(str4) || ob0Var3.F0().equals(str4)) {
                    return false;
                }
            }
        }
        if (i10 == 16) {
            ob0 ob0Var4 = f23314a;
            if (ob0Var4.q0().equals(str)) {
                String strF = ob0Var4.f();
                String str5 = da1.f19804b;
                if (strF.equals(str5) || ob0Var4.g().equals(str5) || ob0Var4.h().equals(str5) || ob0Var4.i().equals(str5)) {
                    return false;
                }
            }
        }
        if (i10 < 24) {
            ob0 ob0Var5 = f23314a;
            if ((ob0Var5.h0().equals(str) || ob0Var5.a0().equals(str)) && ob0Var5.G0().equals(da1.f19805c)) {
                String str6 = da1.f19804b;
                if (str6.startsWith(ob0Var5.S0()) || str6.startsWith(ob0Var5.T0()) || str6.startsWith(ob0Var5.R0()) || ob0Var5.D0().equals(str6) || ob0Var5.Y().equals(str6) || ob0Var5.a().equals(str6) || ob0Var5.C0().equals(str6) || ob0Var5.E0().equals(str6)) {
                    return false;
                }
            }
        }
        if (i10 <= 19) {
            ob0 ob0Var6 = f23314a;
            if (ob0Var6.j0().equals(str) && ob0Var6.G0().equals(da1.f19805c)) {
                String str7 = da1.f19804b;
                if (str7.startsWith("d2") || str7.startsWith(ob0Var6.I0()) || str7.startsWith(ob0Var6.J()) || str7.startsWith(ob0Var6.H0()) || str7.startsWith(ob0Var6.J0())) {
                    return false;
                }
            }
        }
        if (i10 <= 19) {
            String str8 = da1.f19804b;
            ob0 ob0Var7 = f23314a;
            if (str8.startsWith(ob0Var7.J()) && ob0Var7.s0().equals(str)) {
                return false;
            }
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && f23314a.d0().equals(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(ib0 ib0Var) {
        return ib0Var.f21667a.startsWith(f23314a.l0()) ? 1 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:134:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:313:0x0402 A[Catch: NumberFormatException -> 0x03a1, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x03a1, blocks: (B:283:0x03a9, B:285:0x03bb, B:297:0x03d9, B:313:0x0402), top: B:489:0x03a9 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x041a  */
    /* JADX WARN: Code duplicated, block: B:415:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:454:0x066c  */
    /* JADX WARN: Code duplicated, block: B:455:0x0672  */
    /* JADX WARN: Code duplicated, block: B:456:0x0675  */
    /* JADX WARN: Code duplicated, block: B:457:0x0678  */
    /* JADX WARN: Code duplicated, block: B:458:0x067b  */
    /* JADX WARN: Code duplicated, block: B:459:0x067e  */
    /* JADX WARN: Code duplicated, block: B:460:0x0681  */
    /* JADX WARN: Code duplicated, block: B:461:0x0683  */
    /* JADX WARN: Code duplicated, block: B:462:0x0686  */
    /* JADX WARN: Code duplicated, block: B:463:0x068a  */
    /* JADX WARN: Code duplicated, block: B:464:0x068d  */
    /* JADX WARN: Code duplicated, block: B:465:0x0690  */
    /* JADX WARN: Code duplicated, block: B:466:0x0692  */
    /* JADX WARN: Code duplicated, block: B:467:0x0695  */
    /* JADX WARN: Code duplicated, block: B:468:0x0697  */
    /* JADX WARN: Code duplicated, block: B:469:0x069a  */
    /* JADX WARN: Code duplicated, block: B:470:0x069c  */
    /* JADX WARN: Code duplicated, block: B:471:0x069e  */
    /* JADX WARN: Code duplicated, block: B:472:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:473:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:474:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:475:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:476:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:479:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:480:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x0115  */
    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    public static Pair<Integer, Integer> b(yv yvVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        Integer numValueOf;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Integer num;
        Integer numValueOf2;
        String str2;
        byte b10;
        byte b11;
        int i21;
        String str3 = yvVar.f27112i;
        if (str3 == null) {
            return null;
        }
        String[] strArrSplit = str3.split("\\.");
        int i22 = 2;
        int i23 = 1;
        if ("video/dolby-vision".equals(yvVar.f27115l)) {
            String strGroup = yvVar.f27112i;
            if (strArrSplit.length < 3) {
                str2 = "Ignoring malformed Dolby Vision codec string: ";
            } else {
                Matcher matcher = f23315b.matcher(strArrSplit[1]);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
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
                        str2 = "Unknown Dolby Vision profile string: ";
                    } else {
                        strGroup = strArrSplit[2];
                        if (strGroup != null) {
                            switch (strGroup.hashCode()) {
                                case 1537:
                                    if (!strGroup.equals("01")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 0;
                                    }
                                    break;
                                case 1538:
                                    if (!strGroup.equals("02")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 1;
                                    }
                                    break;
                                case 1539:
                                    if (!strGroup.equals("03")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 2;
                                    }
                                    break;
                                case 1540:
                                    if (!strGroup.equals("04")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 3;
                                    }
                                    break;
                                case 1541:
                                    if (!strGroup.equals("05")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 4;
                                    }
                                    break;
                                case 1542:
                                    if (!strGroup.equals("06")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 5;
                                    }
                                    break;
                                case 1543:
                                    if (!strGroup.equals("07")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 6;
                                    }
                                    break;
                                case 1544:
                                    if (!strGroup.equals("08")) {
                                        b10 = -1;
                                    } else {
                                        b11 = 7;
                                        b10 = b11;
                                    }
                                    break;
                                case 1545:
                                    if (!strGroup.equals("09")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 8;
                                    }
                                    break;
                                case 1567:
                                    if (!strGroup.equals("10")) {
                                        b10 = -1;
                                    } else {
                                        b11 = 9;
                                        b10 = b11;
                                    }
                                    break;
                                case 1568:
                                    if (!strGroup.equals("11")) {
                                        b10 = -1;
                                    } else {
                                        b11 = 10;
                                        b10 = b11;
                                    }
                                    break;
                                case 1569:
                                    if (!strGroup.equals("12")) {
                                        b10 = -1;
                                    } else {
                                        b11 = 11;
                                        b10 = b11;
                                    }
                                    break;
                                case 1570:
                                    if (!strGroup.equals("13")) {
                                        b10 = -1;
                                    } else {
                                        b11 = 12;
                                        b10 = b11;
                                    }
                                    break;
                                default:
                                    b10 = -1;
                                    break;
                            }
                            switch (b10) {
                                case 0:
                                    numValueOf2 = 1;
                                    break;
                                case 1:
                                    numValueOf2 = 2;
                                    break;
                                case 2:
                                    numValueOf2 = 4;
                                    break;
                                case 3:
                                    numValueOf2 = 8;
                                    break;
                                case 4:
                                    numValueOf2 = 16;
                                    break;
                                case 5:
                                    numValueOf2 = 32;
                                    break;
                                case 6:
                                    numValueOf2 = 64;
                                    break;
                                case 7:
                                    numValueOf2 = 128;
                                    break;
                                case 8:
                                    numValueOf2 = 256;
                                    break;
                                case 9:
                                    numValueOf2 = 512;
                                    break;
                                case 10:
                                    i21 = 1024;
                                    numValueOf2 = Integer.valueOf(i21);
                                    break;
                                case 11:
                                    i21 = 2048;
                                    numValueOf2 = Integer.valueOf(i21);
                                    break;
                                case 12:
                                    numValueOf2 = 4096;
                                    break;
                                default:
                                    numValueOf2 = null;
                                    break;
                            }
                        } else {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            return new Pair<>(num, numValueOf2);
                        }
                        str2 = "Unknown Dolby Vision level string: ";
                    }
                } else {
                    str2 = "Ignoring malformed Dolby Vision codec string: ";
                }
            }
            li1.a(str2, strGroup, "MediaCodecUtil");
            return null;
        }
        if (f23317d.equals(strArrSplit[0]) || f23318e.equals(strArrSplit[0])) {
            String str4 = yvVar.f27112i;
            if (strArrSplit.length < 2) {
                li1.a("Ignoring malformed AVC codec string: ", str4, "MediaCodecUtil");
            } else {
                try {
                    if (strArrSplit[1].length() == 6) {
                        i10 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i11 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else if (strArrSplit.length >= 3) {
                        i10 = Integer.parseInt(strArrSplit[1]);
                        i11 = Integer.parseInt(strArrSplit[2]);
                    } else {
                        p90.d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str4);
                    }
                    if (i10 != 66) {
                        if (i10 != 77) {
                            if (i10 == 88) {
                                i22 = 4;
                            } else if (i10 == 100) {
                                i12 = -1;
                                i22 = 8;
                            } else if (i10 == 110) {
                                i22 = 16;
                            } else if (i10 == 122) {
                                i22 = 32;
                            } else if (i10 != 244) {
                                i12 = -1;
                                i22 = -1;
                            } else {
                                i22 = 64;
                            }
                        }
                        if (i22 == i12) {
                            o80.a("Unknown AVC profile: ", i10, "MediaCodecUtil");
                        } else {
                            switch (i11) {
                                case 10:
                                    i13 = 1;
                                    break;
                                case 11:
                                    i13 = 4;
                                    break;
                                case 12:
                                    i13 = 8;
                                    break;
                                case 13:
                                    i13 = 16;
                                    break;
                                default:
                                    switch (i11) {
                                        case 20:
                                            i13 = 32;
                                            break;
                                        case 21:
                                            i13 = 64;
                                            break;
                                        case 22:
                                            i13 = 128;
                                            break;
                                        default:
                                            switch (i11) {
                                                case 30:
                                                    i13 = 256;
                                                    break;
                                                case 31:
                                                    i13 = 512;
                                                    break;
                                                case 32:
                                                    i13 = 1024;
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 40:
                                                            i13 = 2048;
                                                            break;
                                                        case 41:
                                                            i13 = 4096;
                                                            break;
                                                        case 42:
                                                            i13 = 8192;
                                                            break;
                                                        default:
                                                            switch (i11) {
                                                                case 50:
                                                                    i13 = Http2.INITIAL_MAX_FRAME_SIZE;
                                                                    break;
                                                                case 51:
                                                                    i13 = FileUtil.BUF_SIZE;
                                                                    break;
                                                                case 52:
                                                                    i13 = 65536;
                                                                    break;
                                                                default:
                                                                    i13 = -1;
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
                            if (i13 == -1) {
                                return new Pair<>(Integer.valueOf(i22), Integer.valueOf(i13));
                            }
                            o80.a("Unknown AVC level: ", i11, "MediaCodecUtil");
                        }
                    } else {
                        i22 = 1;
                    }
                    i12 = -1;
                    if (i22 == i12) {
                        o80.a("Unknown AVC profile: ", i10, "MediaCodecUtil");
                    } else {
                        switch (i11) {
                            case 10:
                                i13 = 1;
                                break;
                            case 11:
                                i13 = 4;
                                break;
                            case 12:
                                i13 = 8;
                                break;
                            case 13:
                                i13 = 16;
                                break;
                            default:
                                switch (i11) {
                                    case 20:
                                        i13 = 32;
                                        break;
                                    case 21:
                                        i13 = 64;
                                        break;
                                    case 22:
                                        i13 = 128;
                                        break;
                                    default:
                                        switch (i11) {
                                            case 30:
                                                i13 = 256;
                                                break;
                                            case 31:
                                                i13 = 512;
                                                break;
                                            case 32:
                                                i13 = 1024;
                                                break;
                                            default:
                                                switch (i11) {
                                                    case 40:
                                                        i13 = 2048;
                                                        break;
                                                    case 41:
                                                        i13 = 4096;
                                                        break;
                                                    case 42:
                                                        i13 = 8192;
                                                        break;
                                                    default:
                                                        switch (i11) {
                                                            case 50:
                                                                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
                                                                break;
                                                            case 51:
                                                                i13 = FileUtil.BUF_SIZE;
                                                                break;
                                                            case 52:
                                                                i13 = 65536;
                                                                break;
                                                            default:
                                                                i13 = -1;
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
                        if (i13 == -1) {
                            return new Pair<>(Integer.valueOf(i22), Integer.valueOf(i13));
                        }
                        o80.a("Unknown AVC level: ", i11, "MediaCodecUtil");
                    }
                } catch (NumberFormatException unused) {
                    li1.a("Ignoring malformed AVC codec string: ", str4, "MediaCodecUtil");
                }
            }
            return null;
        }
        if (f23319f.equals(strArrSplit[0])) {
            String str5 = yvVar.f27112i;
            if (strArrSplit.length < 3) {
                li1.a("Ignoring malformed VP9 codec string: ", str5, "MediaCodecUtil");
            } else {
                try {
                    int i24 = Integer.parseInt(strArrSplit[1]);
                    int i25 = Integer.parseInt(strArrSplit[2]);
                    if (i24 == 0) {
                        i19 = 1;
                    } else if (i24 == 1) {
                        i19 = 2;
                    } else if (i24 != 2) {
                        i19 = i24 != 3 ? -1 : 8;
                    } else {
                        i19 = 4;
                    }
                    if (i19 == -1) {
                        o80.a("Unknown VP9 profile: ", i24, "MediaCodecUtil");
                    } else {
                        if (i25 == 10) {
                            i20 = -1;
                        } else {
                            if (i25 == 11) {
                                i23 = 2;
                            } else if (i25 == 20) {
                                i23 = 4;
                            } else if (i25 == 21) {
                                i23 = 8;
                            } else if (i25 == 30) {
                                i23 = 16;
                            } else if (i25 == 31) {
                                i23 = 32;
                            } else if (i25 == 40) {
                                i23 = 64;
                            } else if (i25 == 41) {
                                i23 = 128;
                            } else if (i25 == 50) {
                                i23 = 256;
                            } else if (i25 != 51) {
                                switch (i25) {
                                    case 60:
                                        i20 = -1;
                                        i23 = 2048;
                                        break;
                                    case 61:
                                        i23 = 4096;
                                        break;
                                    case 62:
                                        i20 = -1;
                                        i23 = 8192;
                                        break;
                                    default:
                                        i20 = -1;
                                        i23 = -1;
                                        break;
                                }
                            } else {
                                i20 = -1;
                                i23 = 512;
                            }
                            i20 = -1;
                        }
                        if (i23 != i20) {
                            return new Pair<>(Integer.valueOf(i19), Integer.valueOf(i23));
                        }
                        o80.a("Unknown VP9 level: ", i25, "MediaCodecUtil");
                    }
                } catch (NumberFormatException unused2) {
                    li1.a("Ignoring malformed VP9 codec string: ", str5, "MediaCodecUtil");
                }
            }
            return null;
        }
        if (f23320g.equals(strArrSplit[0]) || f23321h.equals(strArrSplit[0])) {
            String strGroup2 = yvVar.f27112i;
            if (strArrSplit.length < 4) {
                str = "Ignoring malformed HEVC codec string: ";
                li1.a(str, strGroup2, "MediaCodecUtil");
            } else {
                Matcher matcher2 = f23315b.matcher(strArrSplit[1]);
                if (matcher2.matches()) {
                    strGroup2 = matcher2.group(1);
                    if ("1".equals(strGroup2)) {
                        i14 = 1;
                    } else if ("2".equals(strGroup2)) {
                        i14 = 2;
                    } else {
                        str = "Unknown HEVC profile string: ";
                    }
                    String str6 = strArrSplit[3];
                    if (str6 == null) {
                        numValueOf = null;
                    } else {
                        ob0 ob0Var = f23314a;
                        if (ob0Var.S().equals(str6)) {
                            numValueOf = 1;
                        } else if (ob0Var.U().equals(str6)) {
                            numValueOf = 4;
                        } else if (ob0Var.V().equals(str6)) {
                            numValueOf = 16;
                        } else if (ob0Var.W().equals(str6)) {
                            numValueOf = 64;
                        } else if (ob0Var.X().equals(str6)) {
                            numValueOf = 256;
                        } else if (ob0Var.K().equals(str6)) {
                            numValueOf = 1024;
                        } else if (ob0Var.L().equals(str6)) {
                            numValueOf = 4096;
                        } else {
                            if (ob0Var.M().equals(str6)) {
                                i22 = Http2.INITIAL_MAX_FRAME_SIZE;
                            } else if (ob0Var.N().equals(str6)) {
                                i22 = 65536;
                            } else if (ob0Var.O().equals(str6)) {
                                i22 = 262144;
                            } else if (ob0Var.P().equals(str6)) {
                                i22 = 1048576;
                            } else if (ob0Var.Q().equals(str6)) {
                                i22 = 4194304;
                            } else if (ob0Var.R().equals(str6)) {
                                i22 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                            } else if (!ob0Var.B().equals(str6)) {
                                if (ob0Var.C().equals(str6)) {
                                    numValueOf = 8;
                                } else if (ob0Var.D().equals(str6)) {
                                    numValueOf = 32;
                                } else if (ob0Var.E().equals(str6)) {
                                    numValueOf = 128;
                                } else if (ob0Var.F().equals(str6)) {
                                    numValueOf = 512;
                                } else if (ob0Var.t().equals(str6)) {
                                    numValueOf = 2048;
                                } else if (ob0Var.u().equals(str6)) {
                                    numValueOf = 8192;
                                } else if (ob0Var.v().equals(str6)) {
                                    i22 = FileUtil.BUF_SIZE;
                                } else if (ob0Var.w().equals(str6)) {
                                    i22 = 131072;
                                } else if (ob0Var.x().equals(str6)) {
                                    i22 = 524288;
                                } else if (ob0Var.y().equals(str6)) {
                                    i22 = 2097152;
                                } else if (ob0Var.z().equals(str6)) {
                                    i22 = 8388608;
                                } else if (ob0Var.A().equals(str6)) {
                                    i22 = 33554432;
                                } else {
                                    numValueOf = null;
                                }
                            }
                            numValueOf = Integer.valueOf(i22);
                        }
                    }
                    if (numValueOf != null) {
                        return new Pair<>(Integer.valueOf(i14), numValueOf);
                    }
                    li1.a("Unknown HEVC level string: ", str6, "MediaCodecUtil");
                } else {
                    str = "Ignoring malformed HEVC codec string: ";
                }
                li1.a(str, strGroup2, "MediaCodecUtil");
            }
            return null;
        }
        if (!f23322i.equals(strArrSplit[0])) {
            if (!f23323j.equals(strArrSplit[0])) {
                return null;
            }
            String str7 = yvVar.f27112i;
            if (strArrSplit.length != 3) {
                li1.a("Ignoring malformed MP4A codec string: ", str7, "MediaCodecUtil");
            } else {
                try {
                    if ("audio/mp4a-latm".equals(te0.a(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i26 = Integer.parseInt(strArrSplit[2]);
                        if (i26 == 17) {
                            i15 = 17;
                        } else if (i26 == 20) {
                            i15 = 20;
                        } else if (i26 == 23) {
                            i15 = 23;
                        } else if (i26 == 29) {
                            i15 = 29;
                        } else if (i26 == 39) {
                            i15 = 39;
                        } else if (i26 != 42) {
                            switch (i26) {
                                case 1:
                                    i15 = 1;
                                    break;
                                case 2:
                                    i15 = 2;
                                    break;
                                case 3:
                                    i16 = -1;
                                    i15 = 3;
                                    break;
                                case 4:
                                    i15 = 4;
                                    break;
                                case 5:
                                    i16 = -1;
                                    i15 = 5;
                                    break;
                                case 6:
                                    i16 = -1;
                                    i15 = 6;
                                    break;
                                default:
                                    i16 = -1;
                                    i15 = -1;
                                    break;
                            }
                            if (i15 != i16) {
                                return new Pair<>(Integer.valueOf(i15), 0);
                            }
                        } else {
                            i15 = 42;
                        }
                        i16 = -1;
                        if (i15 != i16) {
                            return new Pair<>(Integer.valueOf(i15), 0);
                        }
                    }
                } catch (NumberFormatException unused3) {
                    li1.a("Ignoring malformed MP4A codec string: ", str7, "MediaCodecUtil");
                }
            }
            return null;
        }
        String str8 = yvVar.f27112i;
        nj njVar = yvVar.f27127x;
        if (strArrSplit.length < 4) {
            li1.a("Ignoring malformed AV1 codec string: ", str8, "MediaCodecUtil");
        } else {
            try {
                int i27 = Integer.parseInt(strArrSplit[1]);
                int i28 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                int i29 = Integer.parseInt(strArrSplit[3]);
                if (i27 != 0) {
                    o80.a("Unknown AV1 profile: ", i27, "MediaCodecUtil");
                } else if (i29 == 8 || i29 == 10) {
                    int i30 = i29 == 8 ? 1 : (njVar == null || !(njVar.f23399d != null || (i17 = njVar.f23398c) == 7 || i17 == 6)) ? 2 : 4096;
                    switch (i28) {
                        case 0:
                            i18 = 1;
                            break;
                        case 1:
                            i18 = 2;
                            break;
                        case 2:
                            i18 = 4;
                            break;
                        case 3:
                            i18 = 8;
                            break;
                        case 4:
                            i18 = 16;
                            break;
                        case 5:
                            i18 = 32;
                            break;
                        case 6:
                            i18 = 64;
                            break;
                        case 7:
                            i18 = 128;
                            break;
                        case 8:
                            i18 = 256;
                            break;
                        case 9:
                            i18 = 512;
                            break;
                        case 10:
                            i18 = 1024;
                            break;
                        case 11:
                            i18 = 2048;
                            break;
                        case 12:
                            i18 = 4096;
                            break;
                        case 13:
                            i18 = 8192;
                            break;
                        case 14:
                            i18 = Http2.INITIAL_MAX_FRAME_SIZE;
                            break;
                        case 15:
                            i18 = FileUtil.BUF_SIZE;
                            break;
                        case 16:
                            i18 = 65536;
                            break;
                        case 17:
                            i18 = 131072;
                            break;
                        case 18:
                            i18 = 262144;
                            break;
                        case 19:
                            i18 = 524288;
                            break;
                        case 20:
                            i18 = 1048576;
                            break;
                        case 21:
                            i18 = 2097152;
                            break;
                        case 22:
                            i18 = 4194304;
                            break;
                        case 23:
                            i18 = 8388608;
                            break;
                        default:
                            i18 = -1;
                            break;
                    }
                    if (i18 != -1) {
                        return new Pair<>(Integer.valueOf(i30), Integer.valueOf(i18));
                    }
                    o80.a("Unknown AV1 level: ", i28, "MediaCodecUtil");
                } else {
                    o80.a("Unknown AV1 bit depth: ", i29, "MediaCodecUtil");
                }
            } catch (NumberFormatException unused4) {
                li1.a("Ignoring malformed AV1 codec string: ", str8, "MediaCodecUtil");
            }
        }
        return null;
    }
}
