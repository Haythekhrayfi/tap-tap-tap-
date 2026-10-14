package com.yandex.mobile.ads.impl;

import android.util.Pair;
import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ma0 implements ut {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final byte[] f22952c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final byte[] f22953d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final byte[] f22954e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final byte[] f22955f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final UUID f22956g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Map<String, Integer> f22957h0;
    private long A;
    private long B;
    private q90 C;
    private q90 D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private byte Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kr f22958a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f22959a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ma1 f22960b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private wt f22961b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<b> f22962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f22963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mp0 f22964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final mp0 f22965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final mp0 f22966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final mp0 f22967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final mp0 f22968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final mp0 f22969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final mp0 f22970k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final mp0 f22971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final mp0 f22972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mp0 f22973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ByteBuffer f22974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f22975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f22976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f22977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f22978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f22979t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b f22980u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f22981v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f22982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f22983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f22984y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f22985z;

    public final class a implements jr {
        private a() {
        }

        public /* synthetic */ a(ma0 ma0Var, int i10) {
            this();
        }

        public final boolean a(int i10) {
            Objects.requireNonNull(ma0.this);
            return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
        }
    }

    public static final class b {
        public byte[] N;
        public k81 T;
        public boolean U;
        public j71 X;
        public int Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f22987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f22988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22992f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f22993g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f22994h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f22995i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public j71.a f22996j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f22997k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public DrmInitData f22998l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f22999m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f23000n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f23001o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f23002p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f23003q = 0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23004r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f23005s = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f23006t = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f23007u = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public byte[] f23008v = null;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f23009w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f23010x = false;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f23011y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f23012z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        private String W = "eng";

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(boolean z10) {
            if ("A_OPUS".equals(this.f22988b)) {
                return z10;
            }
            return this.f22992f > 0;
        }

        @EnsuresNonNull({"codecPrivate"})
        private byte[] a(String str) throws qp0 {
            byte[] bArr = this.f22997k;
            if (bArr != null) {
                return bArr;
            }
            throw qp0.a("Missing CodecPrivate for codec " + str, (Exception) null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:137:0x01d0  */
        /* JADX WARN: Code duplicated, block: B:161:0x0295 A[PHI: r9
  0x0295: PHI (r9v6 int) = (r9v0 int), (r9v4 int), (r9v5 int), (r9v7 int) binds: [B:160:0x0293, B:157:0x0289, B:155:0x0285, B:151:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:257:0x049c  */
        /* JADX WARN: Code duplicated, block: B:259:0x04a4  */
        /* JADX WARN: Code duplicated, block: B:260:0x04bd  */
        /* JADX WARN: Code duplicated, block: B:273:0x04e9  */
        /* JADX WARN: Code duplicated, block: B:278:0x04ff  */
        /* JADX WARN: Code duplicated, block: B:279:0x0501  */
        /* JADX WARN: Code duplicated, block: B:282:0x050e  */
        /* JADX WARN: Code duplicated, block: B:283:0x0520  */
        /* JADX WARN: Code duplicated, block: B:285:0x0526  */
        /* JADX WARN: Code duplicated, block: B:287:0x052a  */
        /* JADX WARN: Code duplicated, block: B:289:0x052f  */
        /* JADX WARN: Code duplicated, block: B:292:0x0537  */
        /* JADX WARN: Code duplicated, block: B:294:0x053c  */
        /* JADX WARN: Code duplicated, block: B:297:0x0543  */
        /* JADX WARN: Code duplicated, block: B:300:0x0551  */
        /* JADX WARN: Code duplicated, block: B:303:0x0556  */
        /* JADX WARN: Code duplicated, block: B:305:0x055c  */
        /* JADX WARN: Code duplicated, block: B:328:0x061d  */
        /* JADX WARN: Code duplicated, block: B:331:0x063a  */
        /* JADX WARN: Code duplicated, block: B:334:0x063f  */
        /* JADX WARN: Code duplicated, block: B:353:0x068b  */
        /* JADX WARN: Code duplicated, block: B:355:0x06b1  */
        /* JADX WARN: Code duplicated, block: B:357:0x06b9  */
        /* JADX WARN: Code duplicated, block: B:372:0x06ed  */
        @EnsuresNonNull({"this.output"})
        @RequiresNonNull({"codecId"})
        public final void a(wt wtVar, int i10) throws qp0 {
            byte b10;
            int i11;
            List<byte[]> listSingletonList;
            boolean z10;
            String str;
            int i12;
            String str2;
            String str3;
            ArrayList arrayList;
            Pair pair;
            List<byte[]> list;
            String str4;
            String str5;
            String str6;
            List<byte[]> list2;
            byte[] bArr;
            int i13;
            yv.a aVar;
            int i14;
            int i15;
            float f10;
            int iIntValue;
            int i16;
            int i17;
            int i18;
            pq pqVarA;
            String str7 = this.f22988b;
            Objects.requireNonNull(str7);
            int iB = 4;
            int i19 = 3;
            int i20 = 0;
            switch (str7) {
                case "V_MPEG4/ISO/AP":
                    b10 = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b10 = 1;
                    break;
                case "A_MS/ACM":
                    b10 = 2;
                    break;
                case "A_TRUEHD":
                    b10 = 3;
                    break;
                case "A_VORBIS":
                    b10 = 4;
                    break;
                case "A_MPEG/L2":
                    b10 = 5;
                    break;
                case "A_MPEG/L3":
                    b10 = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b10 = 7;
                    break;
                case "S_DVBSUB":
                    b10 = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b10 = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b10 = 10;
                    break;
                case "S_VOBSUB":
                    b10 = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b10 = 12;
                    break;
                case "A_AAC":
                    b10 = 13;
                    break;
                case "A_AC3":
                    b10 = 14;
                    break;
                case "A_DTS":
                    b10 = 15;
                    break;
                case "V_AV1":
                    b10 = 16;
                    break;
                case "V_VP8":
                    b10 = 17;
                    break;
                case "V_VP9":
                    b10 = 18;
                    break;
                case "S_HDMV/PGS":
                    b10 = 19;
                    break;
                case "V_THEORA":
                    b10 = 20;
                    break;
                case "A_DTS/EXPRESS":
                    b10 = 21;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b10 = 22;
                    break;
                case "A_PCM/INT/BIG":
                    b10 = 23;
                    break;
                case "A_PCM/INT/LIT":
                    b10 = Ascii.CAN;
                    break;
                case "S_TEXT/ASS":
                    b10 = Ascii.EM;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b10 = Ascii.SUB;
                    break;
                case "S_TEXT/WEBVTT":
                    b10 = Ascii.ESC;
                    break;
                case "S_TEXT/UTF8":
                    b10 = Ascii.FS;
                    break;
                case "V_MPEG2":
                    b10 = Ascii.GS;
                    break;
                case "A_EAC3":
                    b10 = Ascii.RS;
                    break;
                case "A_FLAC":
                    b10 = Ascii.US;
                    break;
                case "A_OPUS":
                    b10 = 32;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            String str8 = "audio/raw";
            nj njVar = null;
            bArr = null;
            bArr = null;
            bArr = null;
            bArr = null;
            bArr = null;
            bArr = null;
            bArr = null;
            bArr = null;
            bArr = null;
            byte[] bArr2 = null;
            String str9 = "video/mp4v-es";
            switch (b10) {
                case 0:
                case 1:
                case 9:
                    i11 = 2;
                    byte[] bArr3 = this.f22997k;
                    listSingletonList = bArr3 == null ? null : Collections.singletonList(bArr3);
                    iB = -1;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null && (pqVarA = pq.a(new mp0(bArr))) != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i21 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i22 = i21 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14 || (i16 = this.f23002p) == i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = (this.f23000n * i15) / (this.f22999m * i16);
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f && this.E != -1.0f && this.F != -1.0f && this.G != -1.0f && this.H != -1.0f && this.I != -1.0f && this.J != -1.0f && this.K != -1.0f && this.L != -1.0f && this.M != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder.put((byte) 0);
                                byteBufferOrder.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder.putShort((short) (this.L + 0.5f));
                                byteBufferOrder.putShort((short) (this.M + 0.5f));
                                byteBufferOrder.putShort((short) this.B);
                                byteBufferOrder.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null && ma0.f22957h0.containsKey(this.f22987a)) {
                            iIntValue = ((Integer) ma0.f22957h0.get(this.f22987a)).intValue();
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0 || Float.compare(this.f23005s, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) != 0 || Float.compare(this.f23006t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) != 0) {
                            i20 = iIntValue;
                        } else if (Float.compare(this.f23007u, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) != 0) {
                            if (Float.compare(this.f23006t, 90.0f) == 0) {
                                i20 = 90;
                            } else if (Float.compare(this.f23006t, -180.0f) == 0 || Float.compare(this.f23006t, 180.0f) == 0) {
                                i20 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else if (Float.compare(this.f23006t, -90.0f) == 0) {
                                i20 = 270;
                            } else {
                                i20 = iIntValue;
                            }
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str) && !"text/x-ssa".equals(str) && !"text/vtt".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null && !ma0.f22957h0.containsKey(this.f22987a)) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA = aVar.h(i10).f(str).i(i12).e(this.W).o(i22).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA;
                    j71VarA.a(yvVarA);
                    return;
                case 2:
                    i11 = 2;
                    mp0 mp0Var = new mp0(a(this.f22988b));
                    try {
                        int iO = mp0Var.o();
                        if (iO != 1) {
                            if (iO == 65534) {
                                mp0Var.e(24);
                                if (mp0Var.p() != ma0.f22956g0.getMostSignificantBits() || mp0Var.p() != ma0.f22956g0.getLeastSignificantBits()) {
                                }
                                if (z10) {
                                    iB = da1.b(this.P);
                                    if (iB == 0) {
                                        StringBuilder sbA = v60.a("Unsupported PCM bit depth: ");
                                        sbA.append(this.P);
                                        sbA.append(". Setting mimeType to ");
                                        sbA.append("audio/x-unknown");
                                        p90.d("MatroskaExtractor", sbA.toString());
                                    }
                                    listSingletonList = null;
                                    str9 = str8;
                                    list = listSingletonList;
                                    str4 = null;
                                    str5 = str9;
                                    str = str5;
                                    list2 = list;
                                    str2 = str4;
                                    i12 = -1;
                                    bArr = this.N;
                                    if (bArr != null) {
                                        str2 = pqVarA.f24225a;
                                        str = "video/dolby-vision";
                                    }
                                    int i23 = (this.V ? 1 : 0) | 0;
                                    if (this.U) {
                                        i13 = i11;
                                    } else {
                                        i13 = 0;
                                    }
                                    int i24 = i23 | i13;
                                    aVar = new yv.a();
                                    if (te0.b(str)) {
                                        aVar.c(this.O).n(this.Q).j(iB);
                                        i19 = 1;
                                    } else if (te0.d(str)) {
                                        if (this.f23003q == 0) {
                                            i17 = this.f23001o;
                                            i14 = -1;
                                            if (i17 == -1) {
                                                i17 = this.f22999m;
                                            }
                                            this.f23001o = i17;
                                            i18 = this.f23002p;
                                            if (i18 == -1) {
                                                i18 = this.f23000n;
                                            }
                                            this.f23002p = i18;
                                        } else {
                                            i14 = -1;
                                        }
                                        i15 = this.f23001o;
                                        if (i15 != i14) {
                                            f10 = -1.0f;
                                        } else {
                                            f10 = -1.0f;
                                        }
                                        if (this.f23010x) {
                                            if (this.D != -1.0f) {
                                                bArr2 = new byte[25];
                                                ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                                byteBufferOrder2.put((byte) 0);
                                                byteBufferOrder2.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                                byteBufferOrder2.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                                byteBufferOrder2.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                                byteBufferOrder2.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                                byteBufferOrder2.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                                byteBufferOrder2.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                                byteBufferOrder2.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                                byteBufferOrder2.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                                byteBufferOrder2.putShort((short) (this.L + 0.5f));
                                                byteBufferOrder2.putShort((short) (this.M + 0.5f));
                                                byteBufferOrder2.putShort((short) this.B);
                                                byteBufferOrder2.putShort((short) this.C);
                                            }
                                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                                        }
                                        if (this.f22987a == null) {
                                            iIntValue = i14;
                                        } else {
                                            iIntValue = i14;
                                        }
                                        if (this.f23004r == 0) {
                                            i20 = iIntValue;
                                        } else {
                                            i20 = iIntValue;
                                        }
                                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                                        i19 = i11;
                                    } else if (!"application/x-subrip".equals(str)) {
                                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                                    }
                                    if (this.f22987a != null) {
                                        aVar.d(this.f22987a);
                                    }
                                    yv yvVarA2 = aVar.h(i10).f(str).i(i12).e(this.W).o(i24).a(list2).a(str2).a(this.f22998l).a();
                                    j71 j71VarA2 = wtVar.a(this.f22989c, i19);
                                    this.X = j71VarA2;
                                    j71VarA2.a(yvVarA2);
                                    return;
                                }
                                li1.a("Non-PCM MS/ACM is unsupported. Setting mimeType to ", "audio/x-unknown", "MatroskaExtractor");
                                str8 = "audio/x-unknown";
                                iB = -1;
                                listSingletonList = null;
                                str9 = str8;
                                list = listSingletonList;
                                str4 = null;
                                str5 = str9;
                                str = str5;
                                list2 = list;
                                str2 = str4;
                                i12 = -1;
                                bArr = this.N;
                                if (bArr != null) {
                                    str2 = pqVarA.f24225a;
                                    str = "video/dolby-vision";
                                }
                                int i25 = (this.V ? 1 : 0) | 0;
                                if (this.U) {
                                    i13 = i11;
                                } else {
                                    i13 = 0;
                                }
                                int i26 = i25 | i13;
                                aVar = new yv.a();
                                if (te0.b(str)) {
                                    aVar.c(this.O).n(this.Q).j(iB);
                                    i19 = 1;
                                } else if (te0.d(str)) {
                                    if (this.f23003q == 0) {
                                        i17 = this.f23001o;
                                        i14 = -1;
                                        if (i17 == -1) {
                                            i17 = this.f22999m;
                                        }
                                        this.f23001o = i17;
                                        i18 = this.f23002p;
                                        if (i18 == -1) {
                                            i18 = this.f23000n;
                                        }
                                        this.f23002p = i18;
                                    } else {
                                        i14 = -1;
                                    }
                                    i15 = this.f23001o;
                                    if (i15 != i14) {
                                        f10 = -1.0f;
                                    } else {
                                        f10 = -1.0f;
                                    }
                                    if (this.f23010x) {
                                        if (this.D != -1.0f) {
                                            bArr2 = new byte[25];
                                            ByteBuffer byteBufferOrder3 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                            byteBufferOrder3.put((byte) 0);
                                            byteBufferOrder3.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                            byteBufferOrder3.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                            byteBufferOrder3.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                            byteBufferOrder3.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                            byteBufferOrder3.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                            byteBufferOrder3.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                            byteBufferOrder3.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                            byteBufferOrder3.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                            byteBufferOrder3.putShort((short) (this.L + 0.5f));
                                            byteBufferOrder3.putShort((short) (this.M + 0.5f));
                                            byteBufferOrder3.putShort((short) this.B);
                                            byteBufferOrder3.putShort((short) this.C);
                                        }
                                        njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                                    }
                                    if (this.f22987a == null) {
                                        iIntValue = i14;
                                    } else {
                                        iIntValue = i14;
                                    }
                                    if (this.f23004r == 0) {
                                        i20 = iIntValue;
                                    } else {
                                        i20 = iIntValue;
                                    }
                                    aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                                    i19 = i11;
                                } else if (!"application/x-subrip".equals(str)) {
                                    throw qp0.a("Unexpected MIME type.", (Exception) null);
                                }
                                if (this.f22987a != null) {
                                    aVar.d(this.f22987a);
                                }
                                yv yvVarA3 = aVar.h(i10).f(str).i(i12).e(this.W).o(i26).a(list2).a(str2).a(this.f22998l).a();
                                j71 j71VarA3 = wtVar.a(this.f22989c, i19);
                                this.X = j71VarA3;
                                j71VarA3.a(yvVarA3);
                                return;
                            }
                            z10 = false;
                            if (z10) {
                                iB = da1.b(this.P);
                                if (iB == 0) {
                                    StringBuilder sbA2 = v60.a("Unsupported PCM bit depth: ");
                                    sbA2.append(this.P);
                                    sbA2.append(". Setting mimeType to ");
                                    sbA2.append("audio/x-unknown");
                                    p90.d("MatroskaExtractor", sbA2.toString());
                                }
                                listSingletonList = null;
                                str9 = str8;
                                list = listSingletonList;
                                str4 = null;
                                str5 = str9;
                                str = str5;
                                list2 = list;
                                str2 = str4;
                                i12 = -1;
                                bArr = this.N;
                                if (bArr != null) {
                                    str2 = pqVarA.f24225a;
                                    str = "video/dolby-vision";
                                }
                                int i27 = (this.V ? 1 : 0) | 0;
                                if (this.U) {
                                    i13 = i11;
                                } else {
                                    i13 = 0;
                                }
                                int i28 = i27 | i13;
                                aVar = new yv.a();
                                if (te0.b(str)) {
                                    aVar.c(this.O).n(this.Q).j(iB);
                                    i19 = 1;
                                } else if (te0.d(str)) {
                                    if (this.f23003q == 0) {
                                        i17 = this.f23001o;
                                        i14 = -1;
                                        if (i17 == -1) {
                                            i17 = this.f22999m;
                                        }
                                        this.f23001o = i17;
                                        i18 = this.f23002p;
                                        if (i18 == -1) {
                                            i18 = this.f23000n;
                                        }
                                        this.f23002p = i18;
                                    } else {
                                        i14 = -1;
                                    }
                                    i15 = this.f23001o;
                                    if (i15 != i14) {
                                        f10 = -1.0f;
                                    } else {
                                        f10 = -1.0f;
                                    }
                                    if (this.f23010x) {
                                        if (this.D != -1.0f) {
                                            bArr2 = new byte[25];
                                            ByteBuffer byteBufferOrder4 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                            byteBufferOrder4.put((byte) 0);
                                            byteBufferOrder4.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                            byteBufferOrder4.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                            byteBufferOrder4.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                            byteBufferOrder4.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                            byteBufferOrder4.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                            byteBufferOrder4.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                            byteBufferOrder4.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                            byteBufferOrder4.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                            byteBufferOrder4.putShort((short) (this.L + 0.5f));
                                            byteBufferOrder4.putShort((short) (this.M + 0.5f));
                                            byteBufferOrder4.putShort((short) this.B);
                                            byteBufferOrder4.putShort((short) this.C);
                                        }
                                        njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                                    }
                                    if (this.f22987a == null) {
                                        iIntValue = i14;
                                    } else {
                                        iIntValue = i14;
                                    }
                                    if (this.f23004r == 0) {
                                        i20 = iIntValue;
                                    } else {
                                        i20 = iIntValue;
                                    }
                                    aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                                    i19 = i11;
                                } else if (!"application/x-subrip".equals(str)) {
                                    throw qp0.a("Unexpected MIME type.", (Exception) null);
                                }
                                if (this.f22987a != null) {
                                    aVar.d(this.f22987a);
                                }
                                yv yvVarA4 = aVar.h(i10).f(str).i(i12).e(this.W).o(i28).a(list2).a(str2).a(this.f22998l).a();
                                j71 j71VarA4 = wtVar.a(this.f22989c, i19);
                                this.X = j71VarA4;
                                j71VarA4.a(yvVarA4);
                                return;
                            }
                            li1.a("Non-PCM MS/ACM is unsupported. Setting mimeType to ", "audio/x-unknown", "MatroskaExtractor");
                            str8 = "audio/x-unknown";
                            iB = -1;
                            listSingletonList = null;
                            str9 = str8;
                            list = listSingletonList;
                            str4 = null;
                            str5 = str9;
                            str = str5;
                            list2 = list;
                            str2 = str4;
                            i12 = -1;
                            bArr = this.N;
                            if (bArr != null) {
                                str2 = pqVarA.f24225a;
                                str = "video/dolby-vision";
                            }
                            int i29 = (this.V ? 1 : 0) | 0;
                            if (this.U) {
                                i13 = i11;
                            } else {
                                i13 = 0;
                            }
                            int i210 = i29 | i13;
                            aVar = new yv.a();
                            if (te0.b(str)) {
                                aVar.c(this.O).n(this.Q).j(iB);
                                i19 = 1;
                            } else if (te0.d(str)) {
                                if (this.f23003q == 0) {
                                    i17 = this.f23001o;
                                    i14 = -1;
                                    if (i17 == -1) {
                                        i17 = this.f22999m;
                                    }
                                    this.f23001o = i17;
                                    i18 = this.f23002p;
                                    if (i18 == -1) {
                                        i18 = this.f23000n;
                                    }
                                    this.f23002p = i18;
                                } else {
                                    i14 = -1;
                                }
                                i15 = this.f23001o;
                                if (i15 != i14) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f23010x) {
                                    if (this.D != -1.0f) {
                                        bArr2 = new byte[25];
                                        ByteBuffer byteBufferOrder5 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder5.put((byte) 0);
                                        byteBufferOrder5.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                        byteBufferOrder5.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                        byteBufferOrder5.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                        byteBufferOrder5.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                        byteBufferOrder5.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                        byteBufferOrder5.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                        byteBufferOrder5.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                        byteBufferOrder5.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                        byteBufferOrder5.putShort((short) (this.L + 0.5f));
                                        byteBufferOrder5.putShort((short) (this.M + 0.5f));
                                        byteBufferOrder5.putShort((short) this.B);
                                        byteBufferOrder5.putShort((short) this.C);
                                    }
                                    njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                                }
                                if (this.f22987a == null) {
                                    iIntValue = i14;
                                } else {
                                    iIntValue = i14;
                                }
                                if (this.f23004r == 0) {
                                    i20 = iIntValue;
                                } else {
                                    i20 = iIntValue;
                                }
                                aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                                i19 = i11;
                            } else if (!"application/x-subrip".equals(str)) {
                                throw qp0.a("Unexpected MIME type.", (Exception) null);
                            }
                            if (this.f22987a != null) {
                                aVar.d(this.f22987a);
                            }
                            yv yvVarA5 = aVar.h(i10).f(str).i(i12).e(this.W).o(i210).a(list2).a(str2).a(this.f22998l).a();
                            j71 j71VarA5 = wtVar.a(this.f22989c, i19);
                            this.X = j71VarA5;
                            j71VarA5.a(yvVarA5);
                            return;
                        }
                        z10 = true;
                        if (z10) {
                            iB = da1.b(this.P);
                            if (iB == 0) {
                                StringBuilder sbA3 = v60.a("Unsupported PCM bit depth: ");
                                sbA3.append(this.P);
                                sbA3.append(". Setting mimeType to ");
                                sbA3.append("audio/x-unknown");
                                p90.d("MatroskaExtractor", sbA3.toString());
                            }
                            listSingletonList = null;
                            str9 = str8;
                            list = listSingletonList;
                            str4 = null;
                            str5 = str9;
                            str = str5;
                            list2 = list;
                            str2 = str4;
                            i12 = -1;
                            bArr = this.N;
                            if (bArr != null) {
                                str2 = pqVarA.f24225a;
                                str = "video/dolby-vision";
                            }
                            int i211 = (this.V ? 1 : 0) | 0;
                            if (this.U) {
                                i13 = i11;
                            } else {
                                i13 = 0;
                            }
                            int i212 = i211 | i13;
                            aVar = new yv.a();
                            if (te0.b(str)) {
                                aVar.c(this.O).n(this.Q).j(iB);
                                i19 = 1;
                            } else if (te0.d(str)) {
                                if (this.f23003q == 0) {
                                    i17 = this.f23001o;
                                    i14 = -1;
                                    if (i17 == -1) {
                                        i17 = this.f22999m;
                                    }
                                    this.f23001o = i17;
                                    i18 = this.f23002p;
                                    if (i18 == -1) {
                                        i18 = this.f23000n;
                                    }
                                    this.f23002p = i18;
                                } else {
                                    i14 = -1;
                                }
                                i15 = this.f23001o;
                                if (i15 != i14) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f23010x) {
                                    if (this.D != -1.0f) {
                                        bArr2 = new byte[25];
                                        ByteBuffer byteBufferOrder6 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder6.put((byte) 0);
                                        byteBufferOrder6.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                        byteBufferOrder6.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                        byteBufferOrder6.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                        byteBufferOrder6.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                        byteBufferOrder6.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                        byteBufferOrder6.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                        byteBufferOrder6.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                        byteBufferOrder6.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                        byteBufferOrder6.putShort((short) (this.L + 0.5f));
                                        byteBufferOrder6.putShort((short) (this.M + 0.5f));
                                        byteBufferOrder6.putShort((short) this.B);
                                        byteBufferOrder6.putShort((short) this.C);
                                    }
                                    njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                                }
                                if (this.f22987a == null) {
                                    iIntValue = i14;
                                } else {
                                    iIntValue = i14;
                                }
                                if (this.f23004r == 0) {
                                    i20 = iIntValue;
                                } else {
                                    i20 = iIntValue;
                                }
                                aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                                i19 = i11;
                            } else if (!"application/x-subrip".equals(str)) {
                                throw qp0.a("Unexpected MIME type.", (Exception) null);
                            }
                            if (this.f22987a != null) {
                                aVar.d(this.f22987a);
                            }
                            yv yvVarA6 = aVar.h(i10).f(str).i(i12).e(this.W).o(i212).a(list2).a(str2).a(this.f22998l).a();
                            j71 j71VarA6 = wtVar.a(this.f22989c, i19);
                            this.X = j71VarA6;
                            j71VarA6.a(yvVarA6);
                            return;
                        }
                        li1.a("Non-PCM MS/ACM is unsupported. Setting mimeType to ", "audio/x-unknown", "MatroskaExtractor");
                        str8 = "audio/x-unknown";
                        iB = -1;
                        listSingletonList = null;
                        str9 = str8;
                        list = listSingletonList;
                        str4 = null;
                        str5 = str9;
                        str = str5;
                        list2 = list;
                        str2 = str4;
                        i12 = -1;
                        bArr = this.N;
                        if (bArr != null) {
                            str2 = pqVarA.f24225a;
                            str = "video/dolby-vision";
                        }
                        int i213 = (this.V ? 1 : 0) | 0;
                        if (this.U) {
                            i13 = i11;
                        } else {
                            i13 = 0;
                        }
                        int i214 = i213 | i13;
                        aVar = new yv.a();
                        if (te0.b(str)) {
                            aVar.c(this.O).n(this.Q).j(iB);
                            i19 = 1;
                        } else if (te0.d(str)) {
                            if (this.f23003q == 0) {
                                i17 = this.f23001o;
                                i14 = -1;
                                if (i17 == -1) {
                                    i17 = this.f22999m;
                                }
                                this.f23001o = i17;
                                i18 = this.f23002p;
                                if (i18 == -1) {
                                    i18 = this.f23000n;
                                }
                                this.f23002p = i18;
                            } else {
                                i14 = -1;
                            }
                            i15 = this.f23001o;
                            if (i15 != i14) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f23010x) {
                                if (this.D != -1.0f) {
                                    bArr2 = new byte[25];
                                    ByteBuffer byteBufferOrder7 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder7.put((byte) 0);
                                    byteBufferOrder7.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                    byteBufferOrder7.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                    byteBufferOrder7.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                    byteBufferOrder7.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                    byteBufferOrder7.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                    byteBufferOrder7.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                    byteBufferOrder7.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                    byteBufferOrder7.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                    byteBufferOrder7.putShort((short) (this.L + 0.5f));
                                    byteBufferOrder7.putShort((short) (this.M + 0.5f));
                                    byteBufferOrder7.putShort((short) this.B);
                                    byteBufferOrder7.putShort((short) this.C);
                                }
                                njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                            }
                            if (this.f22987a == null) {
                                iIntValue = i14;
                            } else {
                                iIntValue = i14;
                            }
                            if (this.f23004r == 0) {
                                i20 = iIntValue;
                            } else {
                                i20 = iIntValue;
                            }
                            aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                            i19 = i11;
                        } else if (!"application/x-subrip".equals(str)) {
                            throw qp0.a("Unexpected MIME type.", (Exception) null);
                        }
                        if (this.f22987a != null) {
                            aVar.d(this.f22987a);
                        }
                        yv yvVarA7 = aVar.h(i10).f(str).i(i12).e(this.W).o(i214).a(list2).a(str2).a(this.f22998l).a();
                        j71 j71VarA7 = wtVar.a(this.f22989c, i19);
                        this.X = j71VarA7;
                        j71VarA7.a(yvVarA7);
                        return;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw qp0.a("Error parsing MS/ACM codec private", (Exception) null);
                    }
                case 3:
                    i11 = 2;
                    this.T = new k81();
                    str8 = "audio/true-hd";
                    iB = -1;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i215 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i216 = i215 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder8 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder8.put((byte) 0);
                                byteBufferOrder8.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) (this.L + 0.5f));
                                byteBufferOrder8.putShort((short) (this.M + 0.5f));
                                byteBufferOrder8.putShort((short) this.B);
                                byteBufferOrder8.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA8 = aVar.h(i10).f(str).i(i12).e(this.W).o(i216).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA8 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA8;
                    j71VarA8.a(yvVarA8);
                    return;
                case 4:
                    byte[] bArrA = a(this.f22988b);
                    try {
                        if (bArrA[0] != 2) {
                            throw qp0.a("Error parsing vorbis codec private", (Exception) null);
                        }
                        int i30 = 1;
                        int i31 = 0;
                        while (true) {
                            int i32 = bArrA[i30] & 255;
                            if (i32 == 255) {
                                i31 += 255;
                                i30++;
                            } else {
                                int i33 = i30 + 1;
                                int i34 = i31 + i32;
                                int i35 = 0;
                                while (true) {
                                    int i36 = bArrA[i33] & 255;
                                    if (i36 != 255) {
                                        int i37 = i33 + 1;
                                        int i38 = i35 + i36;
                                        if (bArrA[i37] != 1) {
                                            throw qp0.a("Error parsing vorbis codec private", (Exception) null);
                                        }
                                        byte[] bArr4 = new byte[i34];
                                        System.arraycopy(bArrA, i37, bArr4, 0, i34);
                                        int i39 = i37 + i34;
                                        if (bArrA[i39] != 3) {
                                            throw qp0.a("Error parsing vorbis codec private", (Exception) null);
                                        }
                                        int i40 = i39 + i38;
                                        if (bArrA[i40] != 5) {
                                            throw qp0.a("Error parsing vorbis codec private", (Exception) null);
                                        }
                                        byte[] bArr5 = new byte[bArrA.length - i40];
                                        System.arraycopy(bArrA, i40, bArr5, 0, bArrA.length - i40);
                                        i11 = 2;
                                        ArrayList arrayList2 = new ArrayList(2);
                                        arrayList2.add(bArr4);
                                        arrayList2.add(bArr5);
                                        str = "audio/vorbis";
                                        i12 = 8192;
                                        str2 = null;
                                        arrayList = arrayList2;
                                        iB = -1;
                                        list2 = arrayList;
                                        bArr = this.N;
                                        if (bArr != null) {
                                            str2 = pqVarA.f24225a;
                                            str = "video/dolby-vision";
                                        }
                                        int i217 = (this.V ? 1 : 0) | 0;
                                        if (this.U) {
                                            i13 = i11;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i218 = i217 | i13;
                                        aVar = new yv.a();
                                        if (te0.b(str)) {
                                            aVar.c(this.O).n(this.Q).j(iB);
                                            i19 = 1;
                                        } else if (te0.d(str)) {
                                            if (this.f23003q == 0) {
                                                i17 = this.f23001o;
                                                i14 = -1;
                                                if (i17 == -1) {
                                                    i17 = this.f22999m;
                                                }
                                                this.f23001o = i17;
                                                i18 = this.f23002p;
                                                if (i18 == -1) {
                                                    i18 = this.f23000n;
                                                }
                                                this.f23002p = i18;
                                            } else {
                                                i14 = -1;
                                            }
                                            i15 = this.f23001o;
                                            if (i15 != i14) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (this.f23010x) {
                                                if (this.D != -1.0f) {
                                                    bArr2 = new byte[25];
                                                    ByteBuffer byteBufferOrder9 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                                    byteBufferOrder9.put((byte) 0);
                                                    byteBufferOrder9.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                                    byteBufferOrder9.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                                    byteBufferOrder9.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                                    byteBufferOrder9.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                                    byteBufferOrder9.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                                    byteBufferOrder9.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                                    byteBufferOrder9.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                                    byteBufferOrder9.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                                    byteBufferOrder9.putShort((short) (this.L + 0.5f));
                                                    byteBufferOrder9.putShort((short) (this.M + 0.5f));
                                                    byteBufferOrder9.putShort((short) this.B);
                                                    byteBufferOrder9.putShort((short) this.C);
                                                }
                                                njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                                            }
                                            if (this.f22987a == null) {
                                                iIntValue = i14;
                                            } else {
                                                iIntValue = i14;
                                            }
                                            if (this.f23004r == 0) {
                                                i20 = iIntValue;
                                            } else {
                                                i20 = iIntValue;
                                            }
                                            aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                                            i19 = i11;
                                        } else if (!"application/x-subrip".equals(str)) {
                                            throw qp0.a("Unexpected MIME type.", (Exception) null);
                                        }
                                        if (this.f22987a != null) {
                                            aVar.d(this.f22987a);
                                        }
                                        yv yvVarA9 = aVar.h(i10).f(str).i(i12).e(this.W).o(i218).a(list2).a(str2).a(this.f22998l).a();
                                        j71 j71VarA9 = wtVar.a(this.f22989c, i19);
                                        this.X = j71VarA9;
                                        j71VarA9.a(yvVarA9);
                                        return;
                                    }
                                    i35 += 255;
                                    i33++;
                                }
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw qp0.a("Error parsing vorbis codec private", (Exception) null);
                    }
                    break;
                case 5:
                    i12 = 4096;
                    str3 = "audio/mpeg-L2";
                    str = str3;
                    str2 = null;
                    arrayList = null;
                    i11 = 2;
                    iB = -1;
                    list2 = arrayList;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i219 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i2110 = i219 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder10 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder10.put((byte) 0);
                                byteBufferOrder10.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) (this.L + 0.5f));
                                byteBufferOrder10.putShort((short) (this.M + 0.5f));
                                byteBufferOrder10.putShort((short) this.B);
                                byteBufferOrder10.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA10 = aVar.h(i10).f(str).i(i12).e(this.W).o(i2110).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA10 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA10;
                    j71VarA10.a(yvVarA10);
                    return;
                case 6:
                    i12 = 4096;
                    str3 = "audio/mpeg";
                    str = str3;
                    str2 = null;
                    arrayList = null;
                    i11 = 2;
                    iB = -1;
                    list2 = arrayList;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i2111 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i2112 = i2111 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder11 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder11.put((byte) 0);
                                byteBufferOrder11.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) (this.L + 0.5f));
                                byteBufferOrder11.putShort((short) (this.M + 0.5f));
                                byteBufferOrder11.putShort((short) this.B);
                                byteBufferOrder11.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA11 = aVar.h(i10).f(str).i(i12).e(this.W).o(i2112).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA11 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA11;
                    j71VarA11.a(yvVarA11);
                    return;
                case 7:
                    mp0 mp0Var2 = new mp0(a(this.f22988b));
                    try {
                        mp0Var2.f(16);
                        long jN = mp0Var2.n();
                        if (jN == 1482049860) {
                            pair = new Pair("video/divx", null);
                        } else if (jN == 859189832) {
                            pair = new Pair("video/3gpp", null);
                        } else if (jN == 826496599) {
                            int iD = mp0Var2.d() + 20;
                            byte[] bArrC = mp0Var2.c();
                            while (true) {
                                if (iD >= bArrC.length - 4) {
                                    throw qp0.a("Failed to find FourCC VC1 initialization data", (Exception) null);
                                }
                                if (bArrC[iD] == 0 && bArrC[iD + 1] == 0 && bArrC[iD + 2] == 1 && bArrC[iD + 3] == 15) {
                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrC, iD, bArrC.length)));
                                } else {
                                    iD++;
                                }
                            }
                        } else {
                            p90.d("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                            pair = new Pair("video/x-unknown", null);
                        }
                        str9 = (String) pair.first;
                        listSingletonList = (List) pair.second;
                        i11 = 2;
                        iB = -1;
                        list = listSingletonList;
                        str4 = null;
                        str5 = str9;
                        str = str5;
                        list2 = list;
                        str2 = str4;
                        i12 = -1;
                        bArr = this.N;
                        if (bArr != null) {
                            str2 = pqVarA.f24225a;
                            str = "video/dolby-vision";
                        }
                        int i2113 = (this.V ? 1 : 0) | 0;
                        if (this.U) {
                            i13 = i11;
                        } else {
                            i13 = 0;
                        }
                        int i2114 = i2113 | i13;
                        aVar = new yv.a();
                        if (te0.b(str)) {
                            aVar.c(this.O).n(this.Q).j(iB);
                            i19 = 1;
                        } else if (te0.d(str)) {
                            if (this.f23003q == 0) {
                                i17 = this.f23001o;
                                i14 = -1;
                                if (i17 == -1) {
                                    i17 = this.f22999m;
                                }
                                this.f23001o = i17;
                                i18 = this.f23002p;
                                if (i18 == -1) {
                                    i18 = this.f23000n;
                                }
                                this.f23002p = i18;
                            } else {
                                i14 = -1;
                            }
                            i15 = this.f23001o;
                            if (i15 != i14) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f23010x) {
                                if (this.D != -1.0f) {
                                    bArr2 = new byte[25];
                                    ByteBuffer byteBufferOrder12 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder12.put((byte) 0);
                                    byteBufferOrder12.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                    byteBufferOrder12.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                    byteBufferOrder12.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                    byteBufferOrder12.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                    byteBufferOrder12.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                    byteBufferOrder12.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                    byteBufferOrder12.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                    byteBufferOrder12.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                    byteBufferOrder12.putShort((short) (this.L + 0.5f));
                                    byteBufferOrder12.putShort((short) (this.M + 0.5f));
                                    byteBufferOrder12.putShort((short) this.B);
                                    byteBufferOrder12.putShort((short) this.C);
                                }
                                njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                            }
                            if (this.f22987a == null) {
                                iIntValue = i14;
                            } else {
                                iIntValue = i14;
                            }
                            if (this.f23004r == 0) {
                                i20 = iIntValue;
                            } else {
                                i20 = iIntValue;
                            }
                            aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                            i19 = i11;
                        } else if (!"application/x-subrip".equals(str)) {
                            throw qp0.a("Unexpected MIME type.", (Exception) null);
                        }
                        if (this.f22987a != null) {
                            aVar.d(this.f22987a);
                        }
                        yv yvVarA12 = aVar.h(i10).f(str).i(i12).e(this.W).o(i2114).a(list2).a(str2).a(this.f22998l).a();
                        j71 j71VarA12 = wtVar.a(this.f22989c, i19);
                        this.X = j71VarA12;
                        j71VarA12.a(yvVarA12);
                        return;
                    } catch (ArrayIndexOutOfBoundsException unused3) {
                        throw qp0.a("Error parsing FourCC private data", (Exception) null);
                    }
                case 8:
                    byte[] bArr6 = new byte[4];
                    System.arraycopy(a(this.f22988b), 0, bArr6, 0, 4);
                    listSingletonList = com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr6);
                    str9 = "application/dvbsubs";
                    i11 = 2;
                    iB = -1;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i2115 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i2116 = i2115 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder13 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder13.put((byte) 0);
                                byteBufferOrder13.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) (this.L + 0.5f));
                                byteBufferOrder13.putShort((short) (this.M + 0.5f));
                                byteBufferOrder13.putShort((short) this.B);
                                byteBufferOrder13.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA13 = aVar.h(i10).f(str).i(i12).e(this.W).o(i2116).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA13 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA13;
                    j71VarA13.a(yvVarA13);
                    return;
                case 10:
                    rc rcVarA = rc.a(new mp0(a(this.f22988b)));
                    list = rcVarA.f24661a;
                    this.Y = rcVarA.f24662b;
                    str4 = rcVarA.f24666f;
                    str5 = "video/avc";
                    i11 = 2;
                    iB = -1;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i2117 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i2118 = i2117 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder14 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder14.put((byte) 0);
                                byteBufferOrder14.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) (this.L + 0.5f));
                                byteBufferOrder14.putShort((short) (this.M + 0.5f));
                                byteBufferOrder14.putShort((short) this.B);
                                byteBufferOrder14.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA14 = aVar.h(i10).f(str).i(i12).e(this.W).o(i2118).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA14 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA14;
                    j71VarA14.a(yvVarA14);
                    return;
                case 11:
                    listSingletonList = com.yandex.mobile.ads.embedded.guava.collect.p.a(a(this.f22988b));
                    str9 = "application/vobsub";
                    i11 = 2;
                    iB = -1;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i2119 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i21110 = i2119 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder15 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder15.put((byte) 0);
                                byteBufferOrder15.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) (this.L + 0.5f));
                                byteBufferOrder15.putShort((short) (this.M + 0.5f));
                                byteBufferOrder15.putShort((short) this.B);
                                byteBufferOrder15.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA15 = aVar.h(i10).f(str).i(i12).e(this.W).o(i21110).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA15 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA15;
                    j71VarA15.a(yvVarA15);
                    return;
                case 12:
                    str8 = "audio/vnd.dts.hd";
                    i11 = 2;
                    iB = -1;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i21111 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i21112 = i21111 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder16 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder16.put((byte) 0);
                                byteBufferOrder16.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) (this.L + 0.5f));
                                byteBufferOrder16.putShort((short) (this.M + 0.5f));
                                byteBufferOrder16.putShort((short) this.B);
                                byteBufferOrder16.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA16 = aVar.h(i10).f(str).i(i12).e(this.W).o(i21112).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA16 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA16;
                    j71VarA16.a(yvVarA16);
                    return;
                case 13:
                    List<byte[]> listSingletonList2 = Collections.singletonList(a(this.f22988b));
                    byte[] bArr7 = this.f22997k;
                    d.a aVarA = d.a(new lp0(bArr7.length, bArr7), false);
                    this.Q = aVarA.f19685a;
                    this.O = aVarA.f19686b;
                    String str10 = aVarA.f19687c;
                    str5 = "audio/mp4a-latm";
                    i11 = 2;
                    iB = -1;
                    list = listSingletonList2;
                    str4 = str10;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i21113 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i21114 = i21113 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder17 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder17.put((byte) 0);
                                byteBufferOrder17.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) (this.L + 0.5f));
                                byteBufferOrder17.putShort((short) (this.M + 0.5f));
                                byteBufferOrder17.putShort((short) this.B);
                                byteBufferOrder17.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA17 = aVar.h(i10).f(str).i(i12).e(this.W).o(i21114).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA17 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA17;
                    j71VarA17.a(yvVarA17);
                    return;
                case 14:
                    str8 = "audio/ac3";
                    i11 = 2;
                    iB = -1;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i21115 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i21116 = i21115 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder18 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder18.put((byte) 0);
                                byteBufferOrder18.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) (this.L + 0.5f));
                                byteBufferOrder18.putShort((short) (this.M + 0.5f));
                                byteBufferOrder18.putShort((short) this.B);
                                byteBufferOrder18.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA18 = aVar.h(i10).f(str).i(i12).e(this.W).o(i21116).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA18 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA18;
                    j71VarA18.a(yvVarA18);
                    return;
                case 15:
                case 21:
                    str8 = "audio/vnd.dts";
                    i11 = 2;
                    iB = -1;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i21117 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i21118 = i21117 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder19 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder19.put((byte) 0);
                                byteBufferOrder19.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) (this.L + 0.5f));
                                byteBufferOrder19.putShort((short) (this.M + 0.5f));
                                byteBufferOrder19.putShort((short) this.B);
                                byteBufferOrder19.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA19 = aVar.h(i10).f(str).i(i12).e(this.W).o(i21118).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA19 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA19;
                    j71VarA19.a(yvVarA19);
                    return;
                case 16:
                    str8 = "video/av01";
                    i11 = 2;
                    iB = -1;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i21119 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i211110 = i21119 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder110 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder110.put((byte) 0);
                                byteBufferOrder110.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) (this.L + 0.5f));
                                byteBufferOrder110.putShort((short) (this.M + 0.5f));
                                byteBufferOrder110.putShort((short) this.B);
                                byteBufferOrder110.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA110 = aVar.h(i10).f(str).i(i12).e(this.W).o(i211110).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA110 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA110;
                    j71VarA110.a(yvVarA110);
                    return;
                case 17:
                    str8 = "video/x-vnd.on2.vp8";
                    i11 = 2;
                    iB = -1;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i211111 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i211112 = i211111 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder111 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder111.put((byte) 0);
                                byteBufferOrder111.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder111.putShort((short) (this.L + 0.5f));
                                byteBufferOrder111.putShort((short) (this.M + 0.5f));
                                byteBufferOrder111.putShort((short) this.B);
                                byteBufferOrder111.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA111 = aVar.h(i10).f(str).i(i12).e(this.W).o(i211112).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA111 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA111;
                    j71VarA111.a(yvVarA111);
                    return;
                case 18:
                    str8 = "video/x-vnd.on2.vp9";
                    i11 = 2;
                    iB = -1;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i211113 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i211114 = i211113 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder112 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder112.put((byte) 0);
                                byteBufferOrder112.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) (this.L + 0.5f));
                                byteBufferOrder112.putShort((short) (this.M + 0.5f));
                                byteBufferOrder112.putShort((short) this.B);
                                byteBufferOrder112.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA112 = aVar.h(i10).f(str).i(i12).e(this.W).o(i211114).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA112 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA112;
                    j71VarA112.a(yvVarA112);
                    return;
                case 19:
                    str8 = "application/pgs";
                    i11 = 2;
                    iB = -1;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i211115 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i211116 = i211115 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder113 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder113.put((byte) 0);
                                byteBufferOrder113.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) (this.L + 0.5f));
                                byteBufferOrder113.putShort((short) (this.M + 0.5f));
                                byteBufferOrder113.putShort((short) this.B);
                                byteBufferOrder113.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA113 = aVar.h(i10).f(str).i(i12).e(this.W).o(i211116).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA113 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA113;
                    j71VarA113.a(yvVarA113);
                    return;
                case 20:
                    str8 = "video/x-unknown";
                    i11 = 2;
                    iB = -1;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i211117 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i211118 = i211117 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder114 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder114.put((byte) 0);
                                byteBufferOrder114.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) (this.L + 0.5f));
                                byteBufferOrder114.putShort((short) (this.M + 0.5f));
                                byteBufferOrder114.putShort((short) this.B);
                                byteBufferOrder114.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA114 = aVar.h(i10).f(str).i(i12).e(this.W).o(i211118).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA114 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA114;
                    j71VarA114.a(yvVarA114);
                    return;
                case 22:
                    if (this.P == 32) {
                        i11 = 2;
                    } else {
                        str6 = "Unsupported floating point PCM bit depth: ";
                        StringBuilder sbA4 = v60.a(str6);
                        sbA4.append(this.P);
                        sbA4.append(". Setting mimeType to ");
                        sbA4.append("audio/x-unknown");
                        p90.d("MatroskaExtractor", sbA4.toString());
                        str8 = "audio/x-unknown";
                        i11 = 2;
                        iB = -1;
                    }
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i211119 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i2111110 = i211119 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder115 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder115.put((byte) 0);
                                byteBufferOrder115.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) (this.L + 0.5f));
                                byteBufferOrder115.putShort((short) (this.M + 0.5f));
                                byteBufferOrder115.putShort((short) this.B);
                                byteBufferOrder115.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA115 = aVar.h(i10).f(str).i(i12).e(this.W).o(i2111110).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA115 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA115;
                    j71VarA115.a(yvVarA115);
                    return;
                case 23:
                    int i41 = this.P;
                    if (i41 == 8) {
                        iB = 3;
                    } else {
                        if (i41 != 16) {
                            str6 = "Unsupported big endian PCM bit depth: ";
                            StringBuilder sbA5 = v60.a(str6);
                            sbA5.append(this.P);
                            sbA5.append(". Setting mimeType to ");
                            sbA5.append("audio/x-unknown");
                            p90.d("MatroskaExtractor", sbA5.toString());
                            str8 = "audio/x-unknown";
                            i11 = 2;
                            iB = -1;
                            listSingletonList = null;
                            str9 = str8;
                            list = listSingletonList;
                            str4 = null;
                            str5 = str9;
                            str = str5;
                            list2 = list;
                            str2 = str4;
                            i12 = -1;
                            bArr = this.N;
                            if (bArr != null) {
                                str2 = pqVarA.f24225a;
                                str = "video/dolby-vision";
                            }
                            int i2111111 = (this.V ? 1 : 0) | 0;
                            if (this.U) {
                                i13 = i11;
                            } else {
                                i13 = 0;
                            }
                            int i2111112 = i2111111 | i13;
                            aVar = new yv.a();
                            if (te0.b(str)) {
                                aVar.c(this.O).n(this.Q).j(iB);
                                i19 = 1;
                            } else if (te0.d(str)) {
                                if (this.f23003q == 0) {
                                    i17 = this.f23001o;
                                    i14 = -1;
                                    if (i17 == -1) {
                                        i17 = this.f22999m;
                                    }
                                    this.f23001o = i17;
                                    i18 = this.f23002p;
                                    if (i18 == -1) {
                                        i18 = this.f23000n;
                                    }
                                    this.f23002p = i18;
                                } else {
                                    i14 = -1;
                                }
                                i15 = this.f23001o;
                                if (i15 != i14) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f23010x) {
                                    if (this.D != -1.0f) {
                                        bArr2 = new byte[25];
                                        ByteBuffer byteBufferOrder116 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder116.put((byte) 0);
                                        byteBufferOrder116.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                        byteBufferOrder116.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                        byteBufferOrder116.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                        byteBufferOrder116.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                        byteBufferOrder116.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                        byteBufferOrder116.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                        byteBufferOrder116.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                        byteBufferOrder116.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                        byteBufferOrder116.putShort((short) (this.L + 0.5f));
                                        byteBufferOrder116.putShort((short) (this.M + 0.5f));
                                        byteBufferOrder116.putShort((short) this.B);
                                        byteBufferOrder116.putShort((short) this.C);
                                    }
                                    njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                                }
                                if (this.f22987a == null) {
                                    iIntValue = i14;
                                } else {
                                    iIntValue = i14;
                                }
                                if (this.f23004r == 0) {
                                    i20 = iIntValue;
                                } else {
                                    i20 = iIntValue;
                                }
                                aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                                i19 = i11;
                            } else if (!"application/x-subrip".equals(str)) {
                                throw qp0.a("Unexpected MIME type.", (Exception) null);
                            }
                            if (this.f22987a != null) {
                                aVar.d(this.f22987a);
                            }
                            yv yvVarA116 = aVar.h(i10).f(str).i(i12).e(this.W).o(i2111112).a(list2).a(str2).a(this.f22998l).a();
                            j71 j71VarA116 = wtVar.a(this.f22989c, i19);
                            this.X = j71VarA116;
                            j71VarA116.a(yvVarA116);
                            return;
                        }
                        iB = 268435456;
                    }
                    i11 = 2;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i2111113 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i2111114 = i2111113 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder117 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder117.put((byte) 0);
                                byteBufferOrder117.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) (this.L + 0.5f));
                                byteBufferOrder117.putShort((short) (this.M + 0.5f));
                                byteBufferOrder117.putShort((short) this.B);
                                byteBufferOrder117.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA117 = aVar.h(i10).f(str).i(i12).e(this.W).o(i2111114).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA117 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA117;
                    j71VarA117.a(yvVarA117);
                    return;
                case 24:
                    iB = da1.b(this.P);
                    if (iB == 0) {
                        str6 = "Unsupported little endian PCM bit depth: ";
                        StringBuilder sbA6 = v60.a(str6);
                        sbA6.append(this.P);
                        sbA6.append(". Setting mimeType to ");
                        sbA6.append("audio/x-unknown");
                        p90.d("MatroskaExtractor", sbA6.toString());
                        str8 = "audio/x-unknown";
                        i11 = 2;
                        iB = -1;
                    } else {
                        i11 = 2;
                    }
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i2111115 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i2111116 = i2111115 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder118 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder118.put((byte) 0);
                                byteBufferOrder118.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) (this.L + 0.5f));
                                byteBufferOrder118.putShort((short) (this.M + 0.5f));
                                byteBufferOrder118.putShort((short) this.B);
                                byteBufferOrder118.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA118 = aVar.h(i10).f(str).i(i12).e(this.W).o(i2111116).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA118 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA118;
                    j71VarA118.a(yvVarA118);
                    return;
                case 25:
                    listSingletonList = com.yandex.mobile.ads.embedded.guava.collect.p.a(ma0.f22953d0, a(this.f22988b));
                    str9 = "text/x-ssa";
                    i11 = 2;
                    iB = -1;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i2111117 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i2111118 = i2111117 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder119 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder119.put((byte) 0);
                                byteBufferOrder119.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) (this.L + 0.5f));
                                byteBufferOrder119.putShort((short) (this.M + 0.5f));
                                byteBufferOrder119.putShort((short) this.B);
                                byteBufferOrder119.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA119 = aVar.h(i10).f(str).i(i12).e(this.W).o(i2111118).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA119 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA119;
                    j71VarA119.a(yvVarA119);
                    return;
                case 26:
                    uy uyVarA = uy.a(new mp0(a(this.f22988b)));
                    list = uyVarA.f25757a;
                    this.Y = uyVarA.f25758b;
                    str4 = uyVarA.f25760d;
                    str5 = "video/hevc";
                    i11 = 2;
                    iB = -1;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i2111119 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i21111110 = i2111119 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder1110 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1110.put((byte) 0);
                                byteBufferOrder1110.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.L + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.M + 0.5f));
                                byteBufferOrder1110.putShort((short) this.B);
                                byteBufferOrder1110.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA1110 = aVar.h(i10).f(str).i(i12).e(this.W).o(i21111110).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA1110 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA1110;
                    j71VarA1110.a(yvVarA1110);
                    return;
                case 27:
                    str8 = "text/vtt";
                    i11 = 2;
                    iB = -1;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i21111111 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i21111112 = i21111111 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder1111 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1111.put((byte) 0);
                                byteBufferOrder1111.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.L + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.M + 0.5f));
                                byteBufferOrder1111.putShort((short) this.B);
                                byteBufferOrder1111.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA1111 = aVar.h(i10).f(str).i(i12).e(this.W).o(i21111112).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA1111 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA1111;
                    j71VarA1111.a(yvVarA1111);
                    return;
                case 28:
                    str8 = "application/x-subrip";
                    i11 = 2;
                    iB = -1;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i21111113 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i21111114 = i21111113 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder1112 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1112.put((byte) 0);
                                byteBufferOrder1112.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.L + 0.5f));
                                byteBufferOrder1112.putShort((short) (this.M + 0.5f));
                                byteBufferOrder1112.putShort((short) this.B);
                                byteBufferOrder1112.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA1112 = aVar.h(i10).f(str).i(i12).e(this.W).o(i21111114).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA1112 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA1112;
                    j71VarA1112.a(yvVarA1112);
                    return;
                case 29:
                    str8 = "video/mpeg2";
                    i11 = 2;
                    iB = -1;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i21111115 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i21111116 = i21111115 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder1113 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1113.put((byte) 0);
                                byteBufferOrder1113.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder1113.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder1113.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder1113.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder1113.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder1113.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder1113.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder1113.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder1113.putShort((short) (this.L + 0.5f));
                                byteBufferOrder1113.putShort((short) (this.M + 0.5f));
                                byteBufferOrder1113.putShort((short) this.B);
                                byteBufferOrder1113.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA1113 = aVar.h(i10).f(str).i(i12).e(this.W).o(i21111116).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA1113 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA1113;
                    j71VarA1113.a(yvVarA1113);
                    return;
                case 30:
                    str8 = "audio/eac3";
                    i11 = 2;
                    iB = -1;
                    listSingletonList = null;
                    str9 = str8;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i21111117 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i21111118 = i21111117 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder1114 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1114.put((byte) 0);
                                byteBufferOrder1114.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder1114.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder1114.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder1114.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder1114.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder1114.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder1114.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder1114.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder1114.putShort((short) (this.L + 0.5f));
                                byteBufferOrder1114.putShort((short) (this.M + 0.5f));
                                byteBufferOrder1114.putShort((short) this.B);
                                byteBufferOrder1114.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA1114 = aVar.h(i10).f(str).i(i12).e(this.W).o(i21111118).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA1114 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA1114;
                    j71VarA1114.a(yvVarA1114);
                    return;
                case 31:
                    listSingletonList = Collections.singletonList(a(this.f22988b));
                    str9 = "audio/flac";
                    i11 = 2;
                    iB = -1;
                    list = listSingletonList;
                    str4 = null;
                    str5 = str9;
                    str = str5;
                    list2 = list;
                    str2 = str4;
                    i12 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i21111119 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i211111110 = i21111119 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder1115 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1115.put((byte) 0);
                                byteBufferOrder1115.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder1115.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder1115.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder1115.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder1115.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder1115.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder1115.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder1115.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder1115.putShort((short) (this.L + 0.5f));
                                byteBufferOrder1115.putShort((short) (this.M + 0.5f));
                                byteBufferOrder1115.putShort((short) this.B);
                                byteBufferOrder1115.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA1115 = aVar.h(i10).f(str).i(i12).e(this.W).o(i211111110).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA1115 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA1115;
                    j71VarA1115.a(yvVarA1115);
                    return;
                case 32:
                    i12 = 5760;
                    ArrayList arrayList3 = new ArrayList(3);
                    arrayList3.add(a(this.f22988b));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(this.R).array());
                    arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.S).array());
                    str = "audio/opus";
                    i11 = 2;
                    iB = -1;
                    list2 = arrayList3;
                    str2 = null;
                    bArr = this.N;
                    if (bArr != null) {
                        str2 = pqVarA.f24225a;
                        str = "video/dolby-vision";
                    }
                    int i211111111 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i13 = i11;
                    } else {
                        i13 = 0;
                    }
                    int i211111112 = i211111111 | i13;
                    aVar = new yv.a();
                    if (te0.b(str)) {
                        aVar.c(this.O).n(this.Q).j(iB);
                        i19 = 1;
                    } else if (te0.d(str)) {
                        if (this.f23003q == 0) {
                            i17 = this.f23001o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f22999m;
                            }
                            this.f23001o = i17;
                            i18 = this.f23002p;
                            if (i18 == -1) {
                                i18 = this.f23000n;
                            }
                            this.f23002p = i18;
                        } else {
                            i14 = -1;
                        }
                        i15 = this.f23001o;
                        if (i15 != i14) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f23010x) {
                            if (this.D != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder1116 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1116.put((byte) 0);
                                byteBufferOrder1116.putShort((short) ((this.D * 50000.0f) + 0.5f));
                                byteBufferOrder1116.putShort((short) ((this.E * 50000.0f) + 0.5f));
                                byteBufferOrder1116.putShort((short) ((this.F * 50000.0f) + 0.5f));
                                byteBufferOrder1116.putShort((short) ((this.G * 50000.0f) + 0.5f));
                                byteBufferOrder1116.putShort((short) ((this.H * 50000.0f) + 0.5f));
                                byteBufferOrder1116.putShort((short) ((this.I * 50000.0f) + 0.5f));
                                byteBufferOrder1116.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                byteBufferOrder1116.putShort((short) ((this.K * 50000.0f) + 0.5f));
                                byteBufferOrder1116.putShort((short) (this.L + 0.5f));
                                byteBufferOrder1116.putShort((short) (this.M + 0.5f));
                                byteBufferOrder1116.putShort((short) this.B);
                                byteBufferOrder1116.putShort((short) this.C);
                            }
                            njVar = new nj(this.f23011y, this.A, this.f23012z, bArr2);
                        }
                        if (this.f22987a == null) {
                            iIntValue = i14;
                        } else {
                            iIntValue = i14;
                        }
                        if (this.f23004r == 0) {
                            i20 = iIntValue;
                        } else {
                            i20 = iIntValue;
                        }
                        aVar.q(this.f22999m).g(this.f23000n).b(f10).m(i20).a(this.f23008v).p(this.f23009w).a(njVar);
                        i19 = i11;
                    } else if (!"application/x-subrip".equals(str)) {
                        throw qp0.a("Unexpected MIME type.", (Exception) null);
                    }
                    if (this.f22987a != null) {
                        aVar.d(this.f22987a);
                    }
                    yv yvVarA1116 = aVar.h(i10).f(str).i(i12).e(this.W).o(i211111112).a(list2).a(str2).a(this.f22998l).a();
                    j71 j71VarA1116 = wtVar.a(this.f22989c, i19);
                    this.X = j71VarA1116;
                    j71VarA1116.a(yvVarA1116);
                    return;
                default:
                    throw qp0.a("Unrecognized codec identifier.", (Exception) null);
            }
        }
    }

    static {
        yn1 yn1Var = yn1.f26959s;
        f22952c0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        f22953d0 = da1.b("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        f22954e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f22955f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f22956g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        la0.a(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090", BaseTransientBottomBar.ANIMATION_FADE_DURATION, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f22957h0 = Collections.unmodifiableMap(map);
    }

    public ma0() {
        this(new vn());
    }

    public ma0(vn vnVar) {
        this.f22976q = -1L;
        this.f22977r = -9223372036854775807L;
        this.f22978s = -9223372036854775807L;
        this.f22979t = -9223372036854775807L;
        this.f22985z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f22958a = vnVar;
        vnVar.a(new a(this, 0));
        this.f22963d = true;
        this.f22960b = new ma1();
        this.f22962c = new SparseArray<>();
        this.f22966g = new mp0(4);
        this.f22967h = new mp0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f22968i = new mp0(4);
        this.f22964e = new mp0(oh0.f23795a);
        this.f22965f = new mp0(4);
        this.f22969j = new mp0();
        this.f22970k = new mp0();
        this.f22971l = new mp0(8);
        this.f22972m = new mp0();
        this.f22973n = new mp0();
        this.L = new int[1];
    }

    @RequiresNonNull({"#2.output"})
    private int a(xn xnVar, b bVar, int i10, boolean z10) throws IOException {
        int iB;
        int iB2;
        int i11;
        if ("S_TEXT/UTF8".equals(bVar.f22988b)) {
            a(xnVar, f22952c0, i10);
        } else if ("S_TEXT/ASS".equals(bVar.f22988b)) {
            a(xnVar, f22954e0, i10);
        } else if ("S_TEXT/WEBVTT".equals(bVar.f22988b)) {
            a(xnVar, f22955f0, i10);
        } else {
            j71 j71Var = bVar.X;
            if (!this.V) {
                if (bVar.f22994h) {
                    this.O &= -1073741825;
                    if (!this.W) {
                        xnVar.a(this.f22966g.c(), 0, 1, false);
                        this.S++;
                        if ((this.f22966g.c()[0] & 128) == 128) {
                            throw qp0.a("Extension bit is set in signal byte", (Exception) null);
                        }
                        this.Z = this.f22966g.c()[0];
                        this.W = true;
                    }
                    byte b10 = this.Z;
                    if ((b10 & 1) == 1) {
                        boolean z11 = (b10 & 2) == 2;
                        this.O |= 1073741824;
                        if (!this.f22959a0) {
                            xnVar.a(this.f22971l.c(), 0, 8, false);
                            this.S += 8;
                            this.f22959a0 = true;
                            this.f22966g.c()[0] = (byte) ((z11 ? 128 : 0) | 8);
                            this.f22966g.e(0);
                            j71Var.b(1, this.f22966g);
                            this.T++;
                            this.f22971l.e(0);
                            j71Var.b(8, this.f22971l);
                            this.T += 8;
                        }
                        if (z11) {
                            if (!this.X) {
                                xnVar.a(this.f22966g.c(), 0, 1, false);
                                this.S++;
                                this.f22966g.e(0);
                                this.Y = this.f22966g.t();
                                this.X = true;
                            }
                            int i12 = this.Y * 4;
                            this.f22966g.c(i12);
                            xnVar.a(this.f22966g.c(), 0, i12, false);
                            this.S += i12;
                            short s10 = (short) ((this.Y / 2) + 1);
                            int i13 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f22974o;
                            if (byteBuffer == null || byteBuffer.capacity() < i13) {
                                this.f22974o = ByteBuffer.allocate(i13);
                            }
                            this.f22974o.position(0);
                            this.f22974o.putShort(s10);
                            int i14 = 0;
                            int i15 = 0;
                            while (true) {
                                i11 = this.Y;
                                if (i14 >= i11) {
                                    break;
                                }
                                int iX = this.f22966g.x();
                                if (i14 % 2 == 0) {
                                    this.f22974o.putShort((short) (iX - i15));
                                } else {
                                    this.f22974o.putInt(iX - i15);
                                }
                                i14++;
                                i15 = iX;
                            }
                            int i16 = (i10 - this.S) - i15;
                            int i17 = i11 % 2;
                            ByteBuffer byteBuffer2 = this.f22974o;
                            if (i17 == 1) {
                                byteBuffer2.putInt(i16);
                            } else {
                                byteBuffer2.putShort((short) i16);
                                this.f22974o.putInt(0);
                            }
                            this.f22972m.a(i13, this.f22974o.array());
                            j71Var.b(i13, this.f22972m);
                            this.T += i13;
                        }
                    }
                } else {
                    byte[] bArr = bVar.f22995i;
                    if (bArr != null) {
                        this.f22969j.a(bArr.length, bArr);
                    }
                }
                if (bVar.a(z10)) {
                    this.O |= 268435456;
                    this.f22973n.c(0);
                    int iE = (this.f22969j.e() + i10) - this.S;
                    this.f22966g.c(4);
                    this.f22966g.c()[0] = (byte) ((iE >> 24) & 255);
                    this.f22966g.c()[1] = (byte) ((iE >> 16) & 255);
                    this.f22966g.c()[2] = (byte) ((iE >> 8) & 255);
                    this.f22966g.c()[3] = (byte) (iE & 255);
                    j71Var.b(4, this.f22966g);
                    this.T += 4;
                }
                this.V = true;
            }
            int iE2 = this.f22969j.e() + i10;
            if (!"V_MPEG4/ISO/AVC".equals(bVar.f22988b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f22988b)) {
                if (bVar.T != null) {
                    pa.b(this.f22969j.e() == 0);
                    bVar.T.a(xnVar);
                }
                while (true) {
                    int i18 = this.S;
                    if (i18 >= iE2) {
                        break;
                    }
                    int i19 = iE2 - i18;
                    int iA = this.f22969j.a();
                    if (iA > 0) {
                        iB2 = Math.min(i19, iA);
                        j71Var.a(iB2, this.f22969j);
                    } else {
                        iB2 = j71Var.b(xnVar, i19, false);
                    }
                    this.S += iB2;
                    this.T += iB2;
                }
            } else {
                byte[] bArrC = this.f22965f.c();
                bArrC[0] = 0;
                bArrC[1] = 0;
                bArrC[2] = 0;
                int i20 = bVar.Y;
                int i21 = 4 - i20;
                while (this.S < iE2) {
                    int i22 = this.U;
                    if (i22 == 0) {
                        int iMin = Math.min(i20, this.f22969j.a());
                        xnVar.a(bArrC, i21 + iMin, i20 - iMin, false);
                        if (iMin > 0) {
                            this.f22969j.a(bArrC, i21, iMin);
                        }
                        this.S += i20;
                        this.f22965f.e(0);
                        this.U = this.f22965f.x();
                        this.f22964e.e(0);
                        j71Var.a(4, this.f22964e);
                        this.T += 4;
                    } else {
                        int iA2 = this.f22969j.a();
                        if (iA2 > 0) {
                            iB = Math.min(i22, iA2);
                            j71Var.a(iB, this.f22969j);
                        } else {
                            iB = j71Var.b(xnVar, i22, false);
                        }
                        this.S += iB;
                        this.T += iB;
                        this.U -= iB;
                    }
                }
            }
            if ("A_VORBIS".equals(bVar.f22988b)) {
                this.f22967h.e(0);
                j71Var.a(4, this.f22967h);
                this.T += 4;
            }
        }
        int i23 = this.T;
        e();
        return i23;
    }

    private long a(long j10) throws qp0 {
        long j11 = this.f22977r;
        if (j11 != -9223372036854775807L) {
            return da1.a(j10, j11, 1000L);
        }
        throw qp0.a("Can't scale timecode prior to timecodeScale being set.", (Exception) null);
    }

    @EnsuresNonNull({"currentTrack"})
    private void a(int i10) throws qp0 {
        if (this.f22980u != null) {
            return;
        }
        throw qp0.a("Element " + i10 + " must be in a TrackEntry", (Exception) null);
    }

    @RequiresNonNull({"#1.output"})
    private void a(b bVar, long j10, int i10, int i11, int i12) {
        byte[] bArrA;
        int i13;
        int iE;
        String str;
        k81 k81Var = bVar.T;
        if (k81Var != null) {
            k81Var.a(bVar.X, j10, i10, i11, i12, bVar.f22996j);
        } else {
            if ("S_TEXT/UTF8".equals(bVar.f22988b) || "S_TEXT/ASS".equals(bVar.f22988b) || "S_TEXT/WEBVTT".equals(bVar.f22988b)) {
                if (this.K > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        String str2 = bVar.f22988b;
                        byte[] bArrC = this.f22970k.c();
                        Objects.requireNonNull(str2);
                        switch (str2) {
                            case "S_TEXT/ASS":
                                bArrA = a("%01d:%02d:%02d:%02d", j11, AbstractComponentTracker.LINGERING_TIMEOUT);
                                i13 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrA = a("%02d:%02d:%02d.%03d", j11, 1000L);
                                i13 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrA = a("%02d:%02d:%02d,%03d", j11, 1000L);
                                i13 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrA, 0, bArrC, i13, bArrA.length);
                        for (int iD = this.f22970k.d(); iD < this.f22970k.e(); iD++) {
                            if (this.f22970k.c()[iD] == 0) {
                                this.f22970k.d(iD);
                                j71 j71Var = bVar.X;
                                mp0 mp0Var = this.f22970k;
                                j71Var.a(mp0Var.e(), mp0Var);
                                iE = this.f22970k.e() + i11;
                            }
                        }
                        j71 j71Var2 = bVar.X;
                        mp0 mp0Var2 = this.f22970k;
                        j71Var2.a(mp0Var2.e(), mp0Var2);
                        iE = this.f22970k.e() + i11;
                    }
                }
                p90.d("MatroskaExtractor", str);
                iE = i11;
            } else {
                iE = i11;
            }
            if ((i10 & 268435456) != 0) {
                if (this.K > 1) {
                    this.f22973n.c(0);
                } else {
                    int iE2 = this.f22973n.e();
                    bVar.X.b(iE2, this.f22973n);
                    iE += iE2;
                }
            }
            bVar.X.a(j10, i10, iE, i12, bVar.f22996j);
        }
        this.F = true;
    }

    private void a(xn xnVar, int i10) throws IOException {
        if (this.f22966g.e() >= i10) {
            return;
        }
        if (this.f22966g.b() < i10) {
            mp0 mp0Var = this.f22966g;
            mp0Var.a(Math.max(mp0Var.b() * 2, i10));
        }
        xnVar.a(this.f22966g.c(), this.f22966g.e(), i10 - this.f22966g.e(), false);
        this.f22966g.d(i10);
    }

    private void a(xn xnVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.f22970k.b() < length) {
            mp0 mp0Var = this.f22970k;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i10);
            Objects.requireNonNull(mp0Var);
            mp0Var.a(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, this.f22970k.c(), 0, bArr.length);
        }
        xnVar.a(this.f22970k.c(), bArr.length, i10, false);
        this.f22970k.e(0);
        this.f22970k.d(length);
    }

    private static byte[] a(String str, long j10, long j11) {
        pa.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((((long) i10) * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((((long) i11) * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return da1.b(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ut[] d() {
        return new ut[]{new ma0()};
    }

    private void e() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f22959a0 = false;
        this.f22969j.c(0);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0005 A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        boolean z10;
        this.F = false;
        boolean zA = true;
        while (zA && !this.F) {
            xn xnVar = (xn) vtVar;
            zA = ((vn) this.f22958a).a(xnVar);
            if (zA) {
                long position = xnVar.getPosition();
                if (this.f22984y) {
                    this.A = position;
                    cs0Var.f19623a = this.f22985z;
                    this.f22984y = false;
                } else {
                    if (this.f22981v) {
                        long j10 = this.A;
                        if (j10 != -1) {
                            cs0Var.f19623a = j10;
                            this.A = -1L;
                        }
                        if (z10) {
                            return 1;
                        }
                    }
                    z10 = false;
                    if (z10) {
                        return 1;
                    }
                }
                z10 = true;
                if (z10) {
                    return 1;
                }
            }
        }
        if (zA) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f22962c.size(); i10++) {
            b bVarValueAt = this.f22962c.valueAt(i10);
            Objects.requireNonNull(bVarValueAt.X);
            k81 k81Var = bVarValueAt.T;
            if (k81Var != null) {
                k81Var.a(bVarValueAt.X, bVarValueAt.f22996j);
            }
        }
        return -1;
    }

    public final void a(int i10, double d10) throws qp0 {
        if (i10 == 181) {
            a(i10);
            this.f22980u.Q = (int) d10;
        }
        if (i10 == 17545) {
            this.f22978s = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                a(i10);
                this.f22980u.D = (float) d10;
                break;
            case 21970:
                a(i10);
                this.f22980u.E = (float) d10;
                break;
            case 21971:
                a(i10);
                this.f22980u.F = (float) d10;
                break;
            case 21972:
                a(i10);
                this.f22980u.G = (float) d10;
                break;
            case 21973:
                a(i10);
                this.f22980u.H = (float) d10;
                break;
            case 21974:
                a(i10);
                this.f22980u.I = (float) d10;
                break;
            case 21975:
                a(i10);
                this.f22980u.J = (float) d10;
                break;
            case 21976:
                a(i10);
                this.f22980u.K = (float) d10;
                break;
            case 21977:
                a(i10);
                this.f22980u.L = (float) d10;
                break;
            case 21978:
                a(i10);
                this.f22980u.M = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        a(i10);
                        this.f22980u.f23005s = (float) d10;
                        break;
                    case 30324:
                        a(i10);
                        this.f22980u.f23006t = (float) d10;
                        break;
                    case 30325:
                        a(i10);
                        this.f22980u.f23007u = (float) d10;
                        break;
                }
                break;
        }
    }

    public final void a(int i10, int i11, xn xnVar) throws IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 4;
        int i17 = 1;
        int i18 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 != 165) {
                if (i10 != 16877) {
                    if (i10 == 16981) {
                        a(i10);
                        byte[] bArr = new byte[i11];
                        this.f22980u.f22995i = bArr;
                        xnVar.a(bArr, 0, i11, false);
                        return;
                    }
                    if (i10 == 18402) {
                        byte[] bArr2 = new byte[i11];
                        xnVar.a(bArr2, 0, i11, false);
                        a(i10);
                        this.f22980u.f22996j = new j71.a(1, 0, 0, bArr2);
                        return;
                    }
                    if (i10 == 21419) {
                        Arrays.fill(this.f22968i.c(), (byte) 0);
                        xnVar.a(this.f22968i.c(), 4 - i11, i11, false);
                        this.f22968i.e(0);
                        this.f22982w = (int) this.f22968i.v();
                        return;
                    }
                    if (i10 == 25506) {
                        a(i10);
                        byte[] bArr3 = new byte[i11];
                        this.f22980u.f22997k = bArr3;
                        xnVar.a(bArr3, 0, i11, false);
                        return;
                    }
                    if (i10 != 30322) {
                        throw qp0.a("Unexpected id: " + i10, (Exception) null);
                    }
                    a(i10);
                    byte[] bArr4 = new byte[i11];
                    this.f22980u.f23008v = bArr4;
                    xnVar.a(bArr4, 0, i11, false);
                    return;
                }
                a(i10);
                b bVar = this.f22980u;
                if (bVar.f22993g == 1685485123 || bVar.f22993g == 1685480259) {
                    byte[] bArr5 = new byte[i11];
                    bVar.N = bArr5;
                    xnVar.a(bArr5, 0, i11, false);
                    return;
                }
            } else {
                if (this.G != 2) {
                    return;
                }
                b bVar2 = this.f22962c.get(this.M);
                if (this.P == 4 && "V_VP9".equals(bVar2.f22988b)) {
                    this.f22973n.c(i11);
                    xnVar.a(this.f22973n.c(), 0, i11, false);
                    return;
                }
            }
            xnVar.a(i11);
            return;
        }
        if (this.G == 0) {
            this.M = (int) this.f22960b.a(xnVar, false, true, 8);
            this.N = this.f22960b.a();
            this.I = -9223372036854775807L;
            this.G = 1;
            this.f22966g.c(0);
        }
        b bVar3 = this.f22962c.get(this.M);
        if (bVar3 == null) {
            xnVar.a(i11 - this.N);
            this.G = 0;
            return;
        }
        Objects.requireNonNull(bVar3.X);
        if (this.G == 1) {
            a(xnVar, 3);
            int i19 = (this.f22966g.c()[2] & 6) >> 1;
            byte b10 = 255;
            if (i19 == 0) {
                this.K = 1;
                int[] iArr = this.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                this.L = iArr;
                iArr[0] = (i11 - this.N) - 3;
            } else {
                a(xnVar, 4);
                int i20 = (this.f22966g.c()[3] & 255) + 1;
                this.K = i20;
                int[] iArr2 = this.L;
                if (iArr2 == null) {
                    iArr2 = new int[i20];
                } else if (iArr2.length < i20) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i20)];
                }
                this.L = iArr2;
                if (i19 == 2) {
                    int i21 = (i11 - this.N) - 4;
                    int i22 = this.K;
                    Arrays.fill(iArr2, 0, i22, i21 / i22);
                } else if (i19 == 1) {
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        i13 = this.K - 1;
                        if (i23 >= i13) {
                            break;
                        }
                        this.L[i23] = 0;
                        do {
                            i16++;
                            a(xnVar, i16);
                            i14 = this.f22966g.c()[i16 - 1] & 255;
                            int[] iArr3 = this.L;
                            i15 = iArr3[i23] + i14;
                            iArr3[i23] = i15;
                        } while (i14 == 255);
                        i24 += i15;
                        i23++;
                    }
                    this.L[i13] = ((i11 - this.N) - i16) - i24;
                } else {
                    if (i19 != 3) {
                        throw qp0.a("Unexpected lacing value: " + i19, (Exception) null);
                    }
                    int i25 = 0;
                    int i26 = 0;
                    while (true) {
                        int i27 = this.K - i17;
                        if (i25 >= i27) {
                            this.L[i27] = ((i11 - this.N) - i16) - i26;
                            break;
                        }
                        this.L[i25] = i18;
                        i16++;
                        a(xnVar, i16);
                        int i28 = i16 - 1;
                        if (this.f22966g.c()[i28] == 0) {
                            throw qp0.a("No valid varint length mask found", (Exception) null);
                        }
                        long j10 = 0;
                        int i29 = i18;
                        while (i29 < 8) {
                            int i30 = i17 << (7 - i29);
                            if ((this.f22966g.c()[i28] & i30) != 0) {
                                i16 += i29;
                                a(xnVar, i16);
                                long j11 = this.f22966g.c()[i28] & b10 & (~i30);
                                int i31 = i28 + 1;
                                while (true) {
                                    j10 = j11;
                                    if (i31 >= i16) {
                                        break;
                                    }
                                    j11 = (j10 << 8) | ((long) (this.f22966g.c()[i31] & b10));
                                    i31++;
                                    b10 = 255;
                                }
                                if (i25 <= 0) {
                                    break;
                                }
                                j10 -= (1 << ((i29 * 7) + 6)) - 1;
                                break;
                            }
                            i29++;
                            i17 = 1;
                            b10 = 255;
                        }
                        long j12 = j10;
                        if (j12 < -2147483648L || j12 > 2147483647L) {
                            throw qp0.a("EBML lacing sample size out of range.", (Exception) null);
                        }
                        int i32 = (int) j12;
                        int[] iArr4 = this.L;
                        if (i25 != 0) {
                            i32 += iArr4[i25 - 1];
                        }
                        iArr4[i25] = i32;
                        i26 += i32;
                        i25++;
                        i17 = 1;
                        i18 = 0;
                        b10 = 255;
                    }
                }
            }
            this.H = this.B + a((this.f22966g.c()[0] << 8) | (this.f22966g.c()[1] & 255));
            this.O = (bVar3.f22990d == 2 || (i10 == 163 && (this.f22966g.c()[2] & 128) == 128)) ? 1 : 0;
            this.G = 2;
            this.J = 0;
            i12 = 163;
        } else {
            i12 = 163;
        }
        if (i10 == i12) {
            while (true) {
                int i33 = this.J;
                if (i33 >= this.K) {
                    this.G = 0;
                    return;
                } else {
                    a(bVar3, ((long) ((this.J * bVar3.f22991e) / 1000)) + this.H, this.O, a(xnVar, bVar3, this.L[i33], false), 0);
                    this.J++;
                }
            }
        } else {
            while (true) {
                int i34 = this.J;
                if (i34 >= this.K) {
                    return;
                }
                int[] iArr5 = this.L;
                iArr5[i34] = a(xnVar, bVar3, iArr5[i34], true);
                this.J++;
            }
        }
    }

    public final void a(int i10, long j10) throws qp0 {
        q90 q90Var;
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw qp0.a("ContentEncodingOrder " + j10 + " not supported", (Exception) null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw qp0.a("ContentEncodingScope " + j10 + " not supported", (Exception) null);
        }
        int i11 = 3;
        int i12 = 2;
        switch (i10) {
            case 131:
                a(i10);
                this.f22980u.f22990d = (int) j10;
                return;
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                a(i10);
                this.f22980u.V = j10 == 1;
                return;
            case 155:
                this.I = a(j10);
                return;
            case 159:
                a(i10);
                this.f22980u.O = (int) j10;
                return;
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                a(i10);
                this.f22980u.f22999m = (int) j10;
                return;
            case 179:
                q90 q90Var2 = this.C;
                if (q90Var2 != null && this.D != null) {
                    q90Var2.a(a(j10));
                    return;
                }
                throw qp0.a("Element " + i10 + " must be in a Cues", (Exception) null);
            case 186:
                a(i10);
                this.f22980u.f23000n = (int) j10;
                return;
            case 215:
                a(i10);
                this.f22980u.f22989c = (int) j10;
                return;
            case 231:
                this.B = a(j10);
                return;
            case 238:
                this.P = (int) j10;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                if (this.C != null && (q90Var = this.D) != null) {
                    q90Var.a(j10);
                    this.E = true;
                    return;
                } else {
                    throw qp0.a("Element " + i10 + " must be in a Cues", (Exception) null);
                }
            case 251:
                this.Q = true;
                return;
            case 16871:
                a(i10);
                this.f22980u.f22993g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw qp0.a("ContentCompAlgo " + j10 + " not supported", (Exception) null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw qp0.a("DocTypeReadVersion " + j10 + " not supported", (Exception) null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw qp0.a("EBMLReadVersion " + j10 + " not supported", (Exception) null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw qp0.a("ContentEncAlgo " + j10 + " not supported", (Exception) null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw qp0.a("AESSettingsCipherMode " + j10 + " not supported", (Exception) null);
            case 21420:
                this.f22983x = j10 + this.f22976q;
                return;
            case 21432:
                int i13 = (int) j10;
                a(i10);
                if (i13 == 0) {
                    this.f22980u.f23009w = 0;
                    return;
                }
                if (i13 == 1) {
                    this.f22980u.f23009w = 2;
                    return;
                } else if (i13 == 3) {
                    this.f22980u.f23009w = 1;
                    return;
                } else {
                    if (i13 != 15) {
                        return;
                    }
                    this.f22980u.f23009w = 3;
                    return;
                }
            case 21680:
                a(i10);
                this.f22980u.f23001o = (int) j10;
                return;
            case 21682:
                a(i10);
                this.f22980u.f23003q = (int) j10;
                return;
            case 21690:
                a(i10);
                this.f22980u.f23002p = (int) j10;
                return;
            case 21930:
                a(i10);
                this.f22980u.U = j10 == 1;
                return;
            case 21998:
                a(i10);
                this.f22980u.f22992f = (int) j10;
                return;
            case 22186:
                a(i10);
                this.f22980u.R = j10;
                return;
            case 22203:
                a(i10);
                this.f22980u.S = j10;
                return;
            case 25188:
                a(i10);
                this.f22980u.P = (int) j10;
                return;
            case 30114:
                this.R = j10;
                return;
            case 30321:
                a(i10);
                int i14 = (int) j10;
                if (i14 == 0) {
                    this.f22980u.f23004r = 0;
                    return;
                }
                if (i14 == 1) {
                    this.f22980u.f23004r = 1;
                    return;
                } else if (i14 == 2) {
                    this.f22980u.f23004r = 2;
                    return;
                } else {
                    if (i14 != 3) {
                        return;
                    }
                    this.f22980u.f23004r = 3;
                    return;
                }
            case 2352003:
                a(i10);
                this.f22980u.f22991e = (int) j10;
                return;
            case 2807729:
                this.f22977r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        a(i10);
                        int i15 = (int) j10;
                        if (i15 == 1) {
                            this.f22980u.A = 2;
                            return;
                        } else {
                            if (i15 != 2) {
                                return;
                            }
                            this.f22980u.A = 1;
                            return;
                        }
                    case 21946:
                        a(i10);
                        int i16 = (int) j10;
                        wf.a<nj> aVar = nj.f23395f;
                        if (i16 != 1) {
                            if (i16 == 16) {
                                i11 = 6;
                            } else if (i16 == 18) {
                                i11 = 7;
                            } else if (i16 != 6 && i16 != 7) {
                                i11 = -1;
                            }
                        }
                        if (i11 != -1) {
                            this.f22980u.f23012z = i11;
                            return;
                        }
                        return;
                    case 21947:
                        a(i10);
                        b bVar = this.f22980u;
                        bVar.f23010x = true;
                        int i17 = (int) j10;
                        wf.a<nj> aVar2 = nj.f23395f;
                        if (i17 == 1) {
                            i12 = 1;
                        } else if (i17 == 9) {
                            i12 = 6;
                        } else if (i17 != 4 && i17 != 5 && i17 != 6 && i17 != 7) {
                            i12 = -1;
                        }
                        if (i12 != -1) {
                            bVar.f23011y = i12;
                            return;
                        }
                        return;
                    case 21948:
                        a(i10);
                        this.f22980u.B = (int) j10;
                        return;
                    case 21949:
                        a(i10);
                        this.f22980u.C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void a(int i10, long j10, long j11) throws qp0 {
        pa.b(this.f22961b0);
        if (i10 == 160) {
            this.Q = false;
            this.R = 0L;
            return;
        }
        if (i10 == 174) {
            this.f22980u = new b();
            return;
        }
        if (i10 == 187) {
            this.E = false;
            return;
        }
        if (i10 == 19899) {
            this.f22982w = -1;
            this.f22983x = -1L;
            return;
        }
        if (i10 == 20533) {
            a(i10);
            this.f22980u.f22994h = true;
            return;
        }
        if (i10 == 21968) {
            a(i10);
            this.f22980u.f23010x = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f22976q;
            if (j12 != -1 && j12 != j10) {
                throw qp0.a("Multiple Segment elements not supported", (Exception) null);
            }
            this.f22976q = j10;
            this.f22975p = j11;
            return;
        }
        if (i10 == 475249515) {
            this.C = new q90(0);
            this.D = new q90(0);
        } else if (i10 == 524531317 && !this.f22981v) {
            if (this.f22963d && this.f22985z != -1) {
                this.f22984y = true;
            } else {
                this.f22961b0.a(new p01.b(this.f22979t, 0L));
                this.f22981v = true;
            }
        }
    }

    public final void a(int i10, String str) throws qp0 {
        if (i10 == 134) {
            a(i10);
            this.f22980u.f22988b = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw qp0.a("DocType " + str + " not supported", (Exception) null);
        }
        if (i10 == 21358) {
            a(i10);
            this.f22980u.f22987a = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            a(i10);
            this.f22980u.W = str;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        ((vn) this.f22958a).a();
        this.f22960b.b();
        e();
        for (int i10 = 0; i10 < this.f22962c.size(); i10++) {
            k81 k81Var = this.f22962c.valueAt(i10).T;
            if (k81Var != null) {
                k81Var.a();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f22961b0 = wtVar;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        return new b31().b((xn) vtVar);
    }

    public final void b(int i10) throws qp0 {
        p01 bVar;
        int i11;
        pa.b(this.f22961b0);
        char c10 = '\b';
        int i12 = 0;
        if (i10 == 160) {
            if (this.G != 2) {
                return;
            }
            b bVar2 = this.f22962c.get(this.M);
            Objects.requireNonNull(bVar2.X);
            if (this.R > 0 && "A_OPUS".equals(bVar2.f22988b)) {
                mp0 mp0Var = this.f22973n;
                byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array();
                Objects.requireNonNull(mp0Var);
                mp0Var.a(bArrArray.length, bArrArray);
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.K; i14++) {
                i13 += this.L[i14];
            }
            int i15 = 0;
            while (i15 < this.K) {
                long j10 = this.H + ((long) ((bVar2.f22991e * i15) / 1000));
                int i16 = this.O;
                if (i15 == 0 && !this.Q) {
                    i16 |= 1;
                }
                int i17 = this.L[i15];
                int i18 = i13 - i17;
                a(bVar2, j10, i16, i17, i18);
                i15++;
                i13 = i18;
            }
            this.G = 0;
            return;
        }
        byte b10 = -1;
        if (i10 != 174) {
            if (i10 == 19899) {
                int i19 = this.f22982w;
                if (i19 != -1) {
                    long j11 = this.f22983x;
                    if (j11 != -1) {
                        if (i19 == 475249515) {
                            this.f22985z = j11;
                            return;
                        }
                        return;
                    }
                }
                throw qp0.a("Mandatory element SeekID or SeekPosition not found", (Exception) null);
            }
            if (i10 == 25152) {
                a(i10);
                b bVar3 = this.f22980u;
                if (bVar3.f22994h) {
                    j71.a aVar = bVar3.f22996j;
                    if (aVar == null) {
                        throw qp0.a("Encrypted Track found but ContentEncKeyID was not found", (Exception) null);
                    }
                    bVar3.f22998l = new DrmInitData(new DrmInitData.SchemeData(cg.f19498a, null, "video/webm", aVar.f21979b));
                    return;
                }
                return;
            }
            if (i10 == 28032) {
                a(i10);
                b bVar4 = this.f22980u;
                if (bVar4.f22994h && bVar4.f22995i != null) {
                    throw qp0.a("Combining encryption and compression is not supported", (Exception) null);
                }
                return;
            }
            if (i10 == 357149030) {
                if (this.f22977r == -9223372036854775807L) {
                    this.f22977r = 1000000L;
                }
                long j12 = this.f22978s;
                if (j12 != -9223372036854775807L) {
                    this.f22979t = a(j12);
                    return;
                }
                return;
            }
            if (i10 == 374648427) {
                if (this.f22962c.size() == 0) {
                    throw qp0.a("No valid tracks were found", (Exception) null);
                }
                this.f22961b0.a();
                return;
            }
            if (i10 != 475249515) {
                return;
            }
            if (!this.f22981v) {
                wt wtVar = this.f22961b0;
                q90 q90Var = this.C;
                q90 q90Var2 = this.D;
                if (this.f22976q == -1 || this.f22979t == -9223372036854775807L || q90Var == null || q90Var.a() == 0 || q90Var2 == null || q90Var2.a() != q90Var.a()) {
                    bVar = new p01.b(this.f22979t, 0L);
                } else {
                    int iA = q90Var.a();
                    int[] iArrCopyOf = new int[iA];
                    long[] jArrCopyOf = new long[iA];
                    long[] jArrCopyOf2 = new long[iA];
                    long[] jArrCopyOf3 = new long[iA];
                    for (int i20 = 0; i20 < iA; i20++) {
                        jArrCopyOf3[i20] = q90Var.a(i20);
                        jArrCopyOf[i20] = q90Var2.a(i20) + this.f22976q;
                    }
                    while (true) {
                        i11 = iA - 1;
                        if (i12 >= i11) {
                            break;
                        }
                        int i21 = i12 + 1;
                        iArrCopyOf[i12] = (int) (jArrCopyOf[i21] - jArrCopyOf[i12]);
                        jArrCopyOf2[i12] = jArrCopyOf3[i21] - jArrCopyOf3[i12];
                        i12 = i21;
                    }
                    iArrCopyOf[i11] = (int) ((this.f22976q + this.f22975p) - jArrCopyOf[i11]);
                    long j13 = this.f22979t - jArrCopyOf3[i11];
                    jArrCopyOf2[i11] = j13;
                    if (j13 <= 0) {
                        p90.d("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j13);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i11);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i11);
                    }
                    bVar = new rh(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                wtVar.a(bVar);
                this.f22981v = true;
            }
            this.C = null;
            this.D = null;
            return;
        }
        b bVar5 = (b) pa.b(this.f22980u);
        String str = bVar5.f22988b;
        if (str == null) {
            throw qp0.a("CodecId is missing in TrackEntry element", (Exception) null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 0;
                    b10 = c10;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 1;
                    b10 = c10;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 2;
                    b10 = c10;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 3;
                    b10 = c10;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = 4;
                    b10 = c10;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = 5;
                    b10 = c10;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 6;
                    b10 = c10;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = 7;
                    b10 = c10;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    b10 = c10;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = '\t';
                    b10 = c10;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = '\n';
                    b10 = c10;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 11;
                    b10 = c10;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = '\f';
                    b10 = c10;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = '\r';
                    b10 = c10;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 14;
                    b10 = c10;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 15;
                    b10 = c10;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c10 = 16;
                    b10 = c10;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 17;
                    b10 = c10;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 18;
                    b10 = c10;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 19;
                    b10 = c10;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = 20;
                    b10 = c10;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 21;
                    b10 = c10;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 22;
                    b10 = c10;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c10 = 23;
                    b10 = c10;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    b10 = c10;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 25;
                    b10 = c10;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 26;
                    b10 = c10;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 27;
                    b10 = c10;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 28;
                    b10 = c10;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 29;
                    b10 = c10;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 30;
                    b10 = c10;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 31;
                    b10 = c10;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = ' ';
                    b10 = c10;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                i12 = 1;
                break;
        }
        if (i12 != 0) {
            bVar5.a(this.f22961b0, bVar5.f22989c);
            this.f22962c.put(bVar5.f22989c, bVar5);
        }
        this.f22980u = null;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
