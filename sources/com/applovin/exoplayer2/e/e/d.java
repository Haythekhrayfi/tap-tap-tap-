package com.applovin.exoplayer2.e.e;

import android.util.Pair;
import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.applovin.exoplayer2.b.z;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.r;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.snackbar.BaseTransientBottomBar;
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
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f5343a = z.f4652h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f5344b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f5345c = ai.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f5346d = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final UUID f5347e = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<String, Integer> f5348f;
    private b A;
    private boolean B;
    private int C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private long H;
    private r I;
    private r J;
    private boolean K;
    private boolean L;
    private int M;
    private long N;
    private long O;
    private int P;
    private int Q;
    private int[] R;
    private int S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private int X;
    private int Y;
    private int Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private boolean f5349aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f5350ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private boolean f5351ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private int f5352ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private byte f5353ae;
    private boolean af;
    private j ag;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.exoplayer2.e.e.c f5354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f5355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray<b> f5356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f5357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final y f5358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final y f5359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final y f5360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final y f5361n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final y f5362o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final y f5363p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final y f5364q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final y f5365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final y f5366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final y f5367t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ByteBuffer f5368u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f5369v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f5370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f5371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f5372y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f5373z;

    public final class a implements com.applovin.exoplayer2.e.e.b {
        private a() {
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public int a(int i10) {
            return d.this.a(i10);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i10, double d10) throws com.applovin.exoplayer2.ai {
            d.this.a(i10, d10);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i10, int i11, i iVar) throws IOException {
            d.this.a(i10, i11, iVar);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i10, long j10) throws com.applovin.exoplayer2.ai {
            d.this.a(i10, j10);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i10, long j10, long j11) throws com.applovin.exoplayer2.ai {
            d.this.a(i10, j10, j11);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i10, String str) throws com.applovin.exoplayer2.ai {
            d.this.a(i10, str);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public boolean b(int i10) {
            return d.this.b(i10);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void c(int i10) throws com.applovin.exoplayer2.ai {
            d.this.c(i10);
        }
    }

    public static final class b {
        public int A;
        public int B;
        public float C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public byte[] M;
        public int N;
        public int O;
        public int P;
        public long Q;
        public long R;
        public c S;
        public boolean T;
        public boolean U;
        public x V;
        public int W;
        private int X;
        private String Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f5376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5380f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f5381g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte[] f5382h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public x.a f5383i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f5384j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public com.applovin.exoplayer2.d.e f5385k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f5386l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f5387m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f5388n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f5389o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f5390p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f5391q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f5392r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f5393s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f5394t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public byte[] f5395u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f5396v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f5397w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f5398x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f5399y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f5400z;

        private b() {
            this.f5386l = -1;
            this.f5387m = -1;
            this.f5388n = -1;
            this.f5389o = -1;
            this.f5390p = 0;
            this.f5391q = -1;
            this.f5392r = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f5393s = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f5394t = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f5395u = null;
            this.f5396v = -1;
            this.f5397w = false;
            this.f5398x = -1;
            this.f5399y = -1;
            this.f5400z = -1;
            this.A = 1000;
            this.B = 200;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.N = 1;
            this.O = -1;
            this.P = 8000;
            this.Q = 0L;
            this.R = 0L;
            this.U = true;
            this.Y = "eng";
        }

        private static Pair<String, List<byte[]>> a(y yVar) throws com.applovin.exoplayer2.ai {
            try {
                yVar.e(16);
                long jP = yVar.p();
                if (jP == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jP == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jP != 826496599) {
                    q.c("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArrD = yVar.d();
                for (int iC = yVar.c() + 20; iC < bArrD.length - 4; iC++) {
                    if (bArrD[iC] == 0 && bArrD[iC + 1] == 0 && bArrD[iC + 2] == 1 && bArrD[iC + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrD, iC, bArrD.length)));
                    }
                }
                throw com.applovin.exoplayer2.ai.b("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.exoplayer2.ai.b("Error parsing FourCC private data", null);
            }
        }

        private static List<byte[]> a(byte[] bArr) throws com.applovin.exoplayer2.ai {
            try {
                if (bArr[0] != 2) {
                    throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
                }
                int i10 = 0;
                int i11 = 1;
                while ((bArr[i11] & 255) == 255) {
                    i10 += 255;
                    i11++;
                }
                int i12 = i11 + 1;
                int i13 = i10 + (bArr[i11] & 255);
                int i14 = 0;
                while ((bArr[i12] & 255) == 255) {
                    i14 += 255;
                    i12++;
                }
                int i15 = i12 + 1;
                int i16 = i14 + (bArr[i12] & 255);
                if (bArr[i15] != 1) {
                    throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i13];
                System.arraycopy(bArr, i15, bArr2, 0, i13);
                int i17 = i15 + i13;
                if (bArr[i17] != 3) {
                    throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
                }
                int i18 = i17 + i16;
                if (bArr[i18] != 5) {
                    throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i18];
                System.arraycopy(bArr, i18, bArr3, 0, bArr.length - i18);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
            }
        }

        private byte[] a(String str) throws com.applovin.exoplayer2.ai {
            byte[] bArr = this.f5384j;
            if (bArr != null) {
                return bArr;
            }
            throw com.applovin.exoplayer2.ai.b("Missing CodecPrivate for codec " + str, null);
        }

        private static boolean b(y yVar) throws com.applovin.exoplayer2.ai {
            try {
                int iJ = yVar.j();
                if (iJ == 1) {
                    return true;
                }
                if (iJ != 65534) {
                    return false;
                }
                yVar.d(24);
                return yVar.s() == d.f5347e.getMostSignificantBits() && yVar.s() == d.f5347e.getLeastSignificantBits();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.exoplayer2.ai.b("Error parsing MS/ACM codec private", null);
            }
        }

        private byte[] c() {
            if (this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.C * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.K + 0.5f));
            byteBufferOrder.putShort((short) (this.L + 0.5f));
            byteBufferOrder.putShort((short) this.A);
            byteBufferOrder.putShort((short) this.B);
            return bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            com.applovin.exoplayer2.l.a.b(this.V);
        }

        public void a() {
            c cVar = this.S;
            if (cVar != null) {
                cVar.a(this);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:133:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:184:0x038c A[PHI: r5
  0x038c: PHI (r5v5 int) = (r5v1 int), (r5v0 int), (r5v3 int), (r5v4 int), (r5v6 int) binds: [B:181:0x0370, B:155:0x028a, B:152:0x0279, B:150:0x0274, B:146:0x0265] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:198:0x03b3  */
        /* JADX WARN: Code duplicated, block: B:203:0x03ca  */
        /* JADX WARN: Code duplicated, block: B:204:0x03cc  */
        /* JADX WARN: Code duplicated, block: B:207:0x03d9  */
        /* JADX WARN: Code duplicated, block: B:208:0x03eb  */
        /* JADX WARN: Code duplicated, block: B:210:0x03f1  */
        /* JADX WARN: Code duplicated, block: B:212:0x03f5  */
        /* JADX WARN: Code duplicated, block: B:214:0x03fa  */
        /* JADX WARN: Code duplicated, block: B:217:0x0402  */
        /* JADX WARN: Code duplicated, block: B:219:0x0407  */
        /* JADX WARN: Code duplicated, block: B:222:0x040e  */
        /* JADX WARN: Code duplicated, block: B:227:0x041f  */
        /* JADX WARN: Code duplicated, block: B:228:0x042f  */
        /* JADX WARN: Code duplicated, block: B:231:0x0434  */
        /* JADX WARN: Code duplicated, block: B:236:0x0454  */
        /* JADX WARN: Code duplicated, block: B:242:0x046d  */
        /* JADX WARN: Code duplicated, block: B:243:0x046f  */
        /* JADX WARN: Code duplicated, block: B:245:0x0479  */
        /* JADX WARN: Code duplicated, block: B:246:0x047c  */
        /* JADX WARN: Code duplicated, block: B:248:0x0486  */
        /* JADX WARN: Code duplicated, block: B:254:0x049e  */
        /* JADX WARN: Code duplicated, block: B:256:0x04c5  */
        /* JADX WARN: Code duplicated, block: B:258:0x04cb  */
        /* JADX WARN: Code duplicated, block: B:271:0x04f0  */
        public void a(j jVar, int i10) throws com.applovin.exoplayer2.ai {
            byte b10;
            List<byte[]> listSingletonList;
            String str;
            String string;
            StringBuilder sb2;
            String str2;
            int i11;
            String str3;
            String str4;
            List<byte[]> list;
            String str5;
            int i12;
            String str6;
            List<byte[]> list2;
            byte[] bArr;
            int i13;
            v.a aVar;
            int iIntValue;
            float f10;
            int i14;
            com.applovin.exoplayer2.m.b bVar;
            int i15;
            int i16;
            int i17;
            com.applovin.exoplayer2.m.c cVarA;
            List<byte[]> listA;
            String str7 = this.f5376b;
            Objects.requireNonNull(str7);
            int iC = 4;
            int i18 = 3;
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
                case "S_TEXT/UTF8":
                    b10 = Ascii.ESC;
                    break;
                case "V_MPEG2":
                    b10 = Ascii.FS;
                    break;
                case "A_EAC3":
                    b10 = Ascii.GS;
                    break;
                case "A_FLAC":
                    b10 = Ascii.RS;
                    break;
                case "A_OPUS":
                    b10 = Ascii.US;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            String str8 = "audio/raw";
            String str9 = "audio/x-unknown";
            switch (b10) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr2 = this.f5384j;
                    listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                    str = "video/mp4v-es";
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str10 = str6;
                    list = listSingletonList;
                    str5 = str10;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null && (cVarA = com.applovin.exoplayer2.m.c.a(new y(bArr))) != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i19 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i20 = i19 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue && (i15 = this.f5389o) != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null && d.f5348f.containsKey(this.f5375a)) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0 && Float.compare(this.f5392r, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0 && Float.compare(this.f5393s, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0 || Float.compare(this.f5393s, 180.0f) == 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else if (Float.compare(this.f5393s, -90.0f) == 0) {
                                iIntValue = 270;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null && !d.f5348f.containsKey(this.f5375a)) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i20).a(list).d(str5).a(this.f5385k).a();
                    x xVarA = jVar.a(this.f5377c, i18);
                    this.V = xVarA;
                    xVarA.a(vVarA);
                    return;
                case 2:
                    if (b(new y(a(this.f5376b)))) {
                        iC = ai.c(this.O);
                        if (iC == 0) {
                            sb2 = new StringBuilder();
                            str2 = "Unsupported PCM bit depth: ";
                            sb2.append(str2);
                            sb2.append(this.O);
                            sb2.append(". Setting mimeType to ");
                            sb2.append("audio/x-unknown");
                            string = sb2.toString();
                        } else {
                            listSingletonList = null;
                            str6 = null;
                        }
                        String str11 = str6;
                        list = listSingletonList;
                        str5 = str11;
                        i12 = -1;
                        str3 = str8;
                        bArr = this.M;
                        if (bArr != null) {
                            str5 = cVarA.f7768c;
                            str3 = "video/dolby-vision";
                        }
                        int i110 = (this.U ? 1 : 0) | 0;
                        if (this.T) {
                            i13 = 2;
                        } else {
                            i13 = 0;
                        }
                        int i21 = i110 | i13;
                        aVar = new v.a();
                        if (u.a(str3)) {
                            aVar.k(this.N).l(this.P).m(iC);
                            i18 = 1;
                        } else if (u.b(str3)) {
                            if (this.f5390p == 0) {
                                i16 = this.f5388n;
                                iIntValue = -1;
                                if (i16 == -1) {
                                    i16 = this.f5386l;
                                }
                                this.f5388n = i16;
                                i17 = this.f5389o;
                                if (i17 == -1) {
                                    i17 = this.f5387m;
                                }
                                this.f5389o = i17;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i14 = this.f5388n;
                            if (i14 != iIntValue) {
                                f10 = (this.f5387m * i14) / (this.f5386l * i15);
                            }
                            if (this.f5397w) {
                                bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                            } else {
                                bVar = null;
                            }
                            if (this.f5375a != null) {
                                iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                            }
                            if (this.f5391q == 0) {
                                if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                            i18 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                        }
                        if (this.f5375a != null) {
                            aVar.b(this.f5375a);
                        }
                        v vVarA2 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i21).a(list).d(str5).a(this.f5385k).a();
                        x xVarA2 = jVar.a(this.f5377c, i18);
                        this.V = xVarA2;
                        xVarA2.a(vVarA2);
                        return;
                    }
                    string = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
                    q.c("MatroskaExtractor", string);
                    listSingletonList = null;
                    str = str9;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str12 = str6;
                    list = listSingletonList;
                    str5 = str12;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i111 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i22 = i111 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA3 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i22).a(list).d(str5).a(this.f5385k).a();
                    x xVarA3 = jVar.a(this.f5377c, i18);
                    this.V = xVarA3;
                    xVarA3.a(vVarA3);
                    return;
                case 3:
                    this.S = new c();
                    str9 = "audio/true-hd";
                    listSingletonList = null;
                    str = str9;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str13 = str6;
                    list = listSingletonList;
                    str5 = str13;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i112 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i23 = i112 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA4 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i23).a(list).d(str5).a(this.f5385k).a();
                    x xVarA4 = jVar.a(this.f5377c, i18);
                    this.V = xVarA4;
                    xVarA4.a(vVarA4);
                    return;
                case 4:
                    i11 = 8192;
                    str3 = "audio/vorbis";
                    listA = a(a(this.f5376b));
                    i12 = i11;
                    str5 = null;
                    iC = -1;
                    list = listA;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i113 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i24 = i113 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA5 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i24).a(list).d(str5).a(this.f5385k).a();
                    x xVarA5 = jVar.a(this.f5377c, i18);
                    this.V = xVarA5;
                    xVarA5.a(vVarA5);
                    return;
                case 5:
                    str4 = "audio/mpeg-L2";
                    str3 = str4;
                    list = null;
                    str5 = null;
                    iC = -1;
                    i12 = 4096;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i114 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i25 = i114 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA6 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i25).a(list).d(str5).a(this.f5385k).a();
                    x xVarA6 = jVar.a(this.f5377c, i18);
                    this.V = xVarA6;
                    xVarA6.a(vVarA6);
                    return;
                case 6:
                    str4 = "audio/mpeg";
                    str3 = str4;
                    list = null;
                    str5 = null;
                    iC = -1;
                    i12 = 4096;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i115 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i26 = i115 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA7 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i26).a(list).d(str5).a(this.f5385k).a();
                    x xVarA7 = jVar.a(this.f5377c, i18);
                    this.V = xVarA7;
                    xVarA7.a(vVarA7);
                    return;
                case 7:
                    Pair<String, List<byte[]>> pairA = a(new y(a(this.f5376b)));
                    str = (String) pairA.first;
                    listSingletonList = (List) pairA.second;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str14 = str6;
                    list = listSingletonList;
                    str5 = str14;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i116 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i27 = i116 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA8 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i27).a(list).d(str5).a(this.f5385k).a();
                    x xVarA8 = jVar.a(this.f5377c, i18);
                    this.V = xVarA8;
                    xVarA8.a(vVarA8);
                    return;
                case 8:
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(a(this.f5376b), 0, bArr3, 0, 4);
                    listSingletonList = s.a(bArr3);
                    str = "application/dvbsubs";
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str15 = str6;
                    list = listSingletonList;
                    str5 = str15;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i117 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i28 = i117 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA9 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i28).a(list).d(str5).a(this.f5385k).a();
                    x xVarA9 = jVar.a(this.f5377c, i18);
                    this.V = xVarA9;
                    xVarA9.a(vVarA9);
                    return;
                case 10:
                    com.applovin.exoplayer2.m.a aVarA = com.applovin.exoplayer2.m.a.a(new y(a(this.f5376b)));
                    List<byte[]> list3 = aVarA.f7706a;
                    this.W = aVarA.f7707b;
                    str5 = aVarA.f7711f;
                    str3 = "video/avc";
                    list2 = list3;
                    iC = -1;
                    i12 = -1;
                    list = list2;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i118 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i29 = i118 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA10 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i29).a(list).d(str5).a(this.f5385k).a();
                    x xVarA10 = jVar.a(this.f5377c, i18);
                    this.V = xVarA10;
                    xVarA10.a(vVarA10);
                    return;
                case 11:
                    listSingletonList = s.a(a(this.f5376b));
                    str = "application/vobsub";
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str16 = str6;
                    list = listSingletonList;
                    str5 = str16;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i119 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i210 = i119 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA11 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i210).a(list).d(str5).a(this.f5385k).a();
                    x xVarA11 = jVar.a(this.f5377c, i18);
                    this.V = xVarA11;
                    xVarA11.a(vVarA11);
                    return;
                case 12:
                    str9 = "audio/vnd.dts.hd";
                    listSingletonList = null;
                    str = str9;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str17 = str6;
                    list = listSingletonList;
                    str5 = str17;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i1110 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i211 = i1110 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA12 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i211).a(list).d(str5).a(this.f5385k).a();
                    x xVarA12 = jVar.a(this.f5377c, i18);
                    this.V = xVarA12;
                    xVarA12.a(vVarA12);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(a(this.f5376b));
                    com.applovin.exoplayer2.b.a.C0073a c0073aA = com.applovin.exoplayer2.b.a.a(this.f5384j);
                    this.P = c0073aA.f4382a;
                    this.N = c0073aA.f4383b;
                    str6 = c0073aA.f4384c;
                    str8 = "audio/mp4a-latm";
                    iC = -1;
                    String str18 = str6;
                    list = listSingletonList;
                    str5 = str18;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i1111 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i212 = i1111 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA13 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i212).a(list).d(str5).a(this.f5385k).a();
                    x xVarA13 = jVar.a(this.f5377c, i18);
                    this.V = xVarA13;
                    xVarA13.a(vVarA13);
                    return;
                case 14:
                    str9 = "audio/ac3";
                    listSingletonList = null;
                    str = str9;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str19 = str6;
                    list = listSingletonList;
                    str5 = str19;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i1112 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i213 = i1112 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA14 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i213).a(list).d(str5).a(this.f5385k).a();
                    x xVarA14 = jVar.a(this.f5377c, i18);
                    this.V = xVarA14;
                    xVarA14.a(vVarA14);
                    return;
                case 15:
                case 21:
                    str9 = "audio/vnd.dts";
                    listSingletonList = null;
                    str = str9;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str110 = str6;
                    list = listSingletonList;
                    str5 = str110;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i1113 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i214 = i1113 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA15 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i214).a(list).d(str5).a(this.f5385k).a();
                    x xVarA15 = jVar.a(this.f5377c, i18);
                    this.V = xVarA15;
                    xVarA15.a(vVarA15);
                    return;
                case 16:
                    str9 = "video/av01";
                    listSingletonList = null;
                    str = str9;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str111 = str6;
                    list = listSingletonList;
                    str5 = str111;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i1114 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i215 = i1114 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA16 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i215).a(list).d(str5).a(this.f5385k).a();
                    x xVarA16 = jVar.a(this.f5377c, i18);
                    this.V = xVarA16;
                    xVarA16.a(vVarA16);
                    return;
                case 17:
                    str9 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = str9;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str112 = str6;
                    list = listSingletonList;
                    str5 = str112;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i1115 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i216 = i1115 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA17 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i216).a(list).d(str5).a(this.f5385k).a();
                    x xVarA17 = jVar.a(this.f5377c, i18);
                    this.V = xVarA17;
                    xVarA17.a(vVarA17);
                    return;
                case 18:
                    str9 = "video/x-vnd.on2.vp9";
                    listSingletonList = null;
                    str = str9;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str113 = str6;
                    list = listSingletonList;
                    str5 = str113;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i1116 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i217 = i1116 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA18 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i217).a(list).d(str5).a(this.f5385k).a();
                    x xVarA18 = jVar.a(this.f5377c, i18);
                    this.V = xVarA18;
                    xVarA18.a(vVarA18);
                    return;
                case 19:
                    str9 = "application/pgs";
                    listSingletonList = null;
                    str = str9;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str114 = str6;
                    list = listSingletonList;
                    str5 = str114;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i1117 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i218 = i1117 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA19 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i218).a(list).d(str5).a(this.f5385k).a();
                    x xVarA19 = jVar.a(this.f5377c, i18);
                    this.V = xVarA19;
                    xVarA19.a(vVarA19);
                    return;
                case 20:
                    str9 = "video/x-unknown";
                    listSingletonList = null;
                    str = str9;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str115 = str6;
                    list = listSingletonList;
                    str5 = str115;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i1118 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i219 = i1118 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA110 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i219).a(list).d(str5).a(this.f5385k).a();
                    x xVarA110 = jVar.a(this.f5377c, i18);
                    this.V = xVarA110;
                    xVarA110.a(vVarA110);
                    return;
                case 22:
                    if (this.O == 32) {
                        listSingletonList = null;
                        str6 = null;
                    } else {
                        sb2 = new StringBuilder();
                        str2 = "Unsupported floating point PCM bit depth: ";
                        sb2.append(str2);
                        sb2.append(this.O);
                        sb2.append(". Setting mimeType to ");
                        sb2.append("audio/x-unknown");
                        string = sb2.toString();
                        q.c("MatroskaExtractor", string);
                        listSingletonList = null;
                        str = str9;
                        str8 = str;
                        str6 = null;
                        iC = -1;
                    }
                    String str116 = str6;
                    list = listSingletonList;
                    str5 = str116;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i1119 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i2110 = i1119 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA111 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i2110).a(list).d(str5).a(this.f5385k).a();
                    x xVarA111 = jVar.a(this.f5377c, i18);
                    this.V = xVarA111;
                    xVarA111.a(vVarA111);
                    return;
                case 23:
                    int i30 = this.O;
                    if (i30 == 8) {
                        iC = 3;
                    } else {
                        if (i30 != 16) {
                            sb2 = new StringBuilder();
                            str2 = "Unsupported big endian PCM bit depth: ";
                            sb2.append(str2);
                            sb2.append(this.O);
                            sb2.append(". Setting mimeType to ");
                            sb2.append("audio/x-unknown");
                            string = sb2.toString();
                            q.c("MatroskaExtractor", string);
                            listSingletonList = null;
                            str = str9;
                            str8 = str;
                            str6 = null;
                            iC = -1;
                            String str117 = str6;
                            list = listSingletonList;
                            str5 = str117;
                            i12 = -1;
                            str3 = str8;
                            bArr = this.M;
                            if (bArr != null) {
                                str5 = cVarA.f7768c;
                                str3 = "video/dolby-vision";
                            }
                            int i11110 = (this.U ? 1 : 0) | 0;
                            if (this.T) {
                                i13 = 2;
                            } else {
                                i13 = 0;
                            }
                            int i2111 = i11110 | i13;
                            aVar = new v.a();
                            if (u.a(str3)) {
                                aVar.k(this.N).l(this.P).m(iC);
                                i18 = 1;
                            } else if (u.b(str3)) {
                                if (this.f5390p == 0) {
                                    i16 = this.f5388n;
                                    iIntValue = -1;
                                    if (i16 == -1) {
                                        i16 = this.f5386l;
                                    }
                                    this.f5388n = i16;
                                    i17 = this.f5389o;
                                    if (i17 == -1) {
                                        i17 = this.f5387m;
                                    }
                                    this.f5389o = i17;
                                } else {
                                    iIntValue = -1;
                                }
                                f10 = -1.0f;
                                i14 = this.f5388n;
                                if (i14 != iIntValue) {
                                    f10 = (this.f5387m * i14) / (this.f5386l * i15);
                                }
                                if (this.f5397w) {
                                    bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                                } else {
                                    bVar = null;
                                }
                                if (this.f5375a != null) {
                                    iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                                }
                                if (this.f5391q == 0) {
                                    if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                        iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                    } else {
                                        iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                    }
                                }
                                aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                                i18 = 2;
                            } else if (!"application/x-subrip".equals(str3)) {
                                throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                            }
                            if (this.f5375a != null) {
                                aVar.b(this.f5375a);
                            }
                            v vVarA112 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i2111).a(list).d(str5).a(this.f5385k).a();
                            x xVarA112 = jVar.a(this.f5377c, i18);
                            this.V = xVarA112;
                            xVarA112.a(vVarA112);
                            return;
                        }
                        iC = 268435456;
                    }
                    listSingletonList = null;
                    str6 = null;
                    String str118 = str6;
                    list = listSingletonList;
                    str5 = str118;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i11111 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i2112 = i11111 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA113 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i2112).a(list).d(str5).a(this.f5385k).a();
                    x xVarA113 = jVar.a(this.f5377c, i18);
                    this.V = xVarA113;
                    xVarA113.a(vVarA113);
                    return;
                case 24:
                    iC = ai.c(this.O);
                    if (iC == 0) {
                        sb2 = new StringBuilder();
                        str2 = "Unsupported little endian PCM bit depth: ";
                        sb2.append(str2);
                        sb2.append(this.O);
                        sb2.append(". Setting mimeType to ");
                        sb2.append("audio/x-unknown");
                        string = sb2.toString();
                        q.c("MatroskaExtractor", string);
                        listSingletonList = null;
                        str = str9;
                        str8 = str;
                        str6 = null;
                        iC = -1;
                    } else {
                        listSingletonList = null;
                        str6 = null;
                    }
                    String str119 = str6;
                    list = listSingletonList;
                    str5 = str119;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i11112 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i2113 = i11112 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA114 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i2113).a(list).d(str5).a(this.f5385k).a();
                    x xVarA114 = jVar.a(this.f5377c, i18);
                    this.V = xVarA114;
                    xVarA114.a(vVarA114);
                    return;
                case 25:
                    listSingletonList = s.a(d.f5345c, a(this.f5376b));
                    str = "text/x-ssa";
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str1110 = str6;
                    list = listSingletonList;
                    str5 = str1110;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i11113 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i2114 = i11113 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA115 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i2114).a(list).d(str5).a(this.f5385k).a();
                    x xVarA115 = jVar.a(this.f5377c, i18);
                    this.V = xVarA115;
                    xVarA115.a(vVarA115);
                    return;
                case 26:
                    com.applovin.exoplayer2.m.f fVarA = com.applovin.exoplayer2.m.f.a(new y(a(this.f5376b)));
                    List<byte[]> list4 = fVarA.f7793a;
                    this.W = fVarA.f7794b;
                    str5 = fVarA.f7795c;
                    str3 = "video/hevc";
                    list2 = list4;
                    iC = -1;
                    i12 = -1;
                    list = list2;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i11114 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i2115 = i11114 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA116 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i2115).a(list).d(str5).a(this.f5385k).a();
                    x xVarA116 = jVar.a(this.f5377c, i18);
                    this.V = xVarA116;
                    xVarA116.a(vVarA116);
                    return;
                case 27:
                    str9 = "application/x-subrip";
                    listSingletonList = null;
                    str = str9;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str1111 = str6;
                    list = listSingletonList;
                    str5 = str1111;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i11115 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i2116 = i11115 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA117 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i2116).a(list).d(str5).a(this.f5385k).a();
                    x xVarA117 = jVar.a(this.f5377c, i18);
                    this.V = xVarA117;
                    xVarA117.a(vVarA117);
                    return;
                case 28:
                    str9 = "video/mpeg2";
                    listSingletonList = null;
                    str = str9;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str1112 = str6;
                    list = listSingletonList;
                    str5 = str1112;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i11116 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i2117 = i11116 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA118 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i2117).a(list).d(str5).a(this.f5385k).a();
                    x xVarA118 = jVar.a(this.f5377c, i18);
                    this.V = xVarA118;
                    xVarA118.a(vVarA118);
                    return;
                case 29:
                    str9 = "audio/eac3";
                    listSingletonList = null;
                    str = str9;
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str1113 = str6;
                    list = listSingletonList;
                    str5 = str1113;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i11117 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i2118 = i11117 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA119 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i2118).a(list).d(str5).a(this.f5385k).a();
                    x xVarA119 = jVar.a(this.f5377c, i18);
                    this.V = xVarA119;
                    xVarA119.a(vVarA119);
                    return;
                case 30:
                    listSingletonList = Collections.singletonList(a(this.f5376b));
                    str = "audio/flac";
                    str8 = str;
                    str6 = null;
                    iC = -1;
                    String str1114 = str6;
                    list = listSingletonList;
                    str5 = str1114;
                    i12 = -1;
                    str3 = str8;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i11118 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i2119 = i11118 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA1110 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i2119).a(list).d(str5).a(this.f5385k).a();
                    x xVarA1110 = jVar.a(this.f5377c, i18);
                    this.V = xVarA1110;
                    xVarA1110.a(vVarA1110);
                    return;
                case 31:
                    i11 = 5760;
                    ArrayList arrayList = new ArrayList(3);
                    arrayList.add(a(this.f5376b));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    arrayList.add(byteBufferAllocate.order(byteOrder).putLong(this.Q).array());
                    arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.R).array());
                    str3 = "audio/opus";
                    listA = arrayList;
                    i12 = i11;
                    str5 = null;
                    iC = -1;
                    list = listA;
                    bArr = this.M;
                    if (bArr != null) {
                        str5 = cVarA.f7768c;
                        str3 = "video/dolby-vision";
                    }
                    int i11119 = (this.U ? 1 : 0) | 0;
                    if (this.T) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i21110 = i11119 | i13;
                    aVar = new v.a();
                    if (u.a(str3)) {
                        aVar.k(this.N).l(this.P).m(iC);
                        i18 = 1;
                    } else if (u.b(str3)) {
                        if (this.f5390p == 0) {
                            i16 = this.f5388n;
                            iIntValue = -1;
                            if (i16 == -1) {
                                i16 = this.f5386l;
                            }
                            this.f5388n = i16;
                            i17 = this.f5389o;
                            if (i17 == -1) {
                                i17 = this.f5387m;
                            }
                            this.f5389o = i17;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i14 = this.f5388n;
                        if (i14 != iIntValue) {
                            f10 = (this.f5387m * i14) / (this.f5386l * i15);
                        }
                        if (this.f5397w) {
                            bVar = new com.applovin.exoplayer2.m.b(this.f5398x, this.f5400z, this.f5399y, c());
                        } else {
                            bVar = null;
                        }
                        if (this.f5375a != null) {
                            iIntValue = ((Integer) d.f5348f.get(this.f5375a)).intValue();
                        }
                        if (this.f5391q == 0) {
                            if (Float.compare(this.f5394t, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f5393s, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f5393s, -180.0f) != 0) {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            } else {
                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            }
                        }
                        aVar.g(this.f5386l).h(this.f5387m).b(f10).i(iIntValue).a(this.f5395u).j(this.f5396v).a(bVar);
                        i18 = 2;
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", null);
                    }
                    if (this.f5375a != null) {
                        aVar.b(this.f5375a);
                    }
                    v vVarA1111 = aVar.a(i10).f(str3).f(i12).c(this.Y).b(i21110).a(list).d(str5).a(this.f5385k).a();
                    x xVarA1111 = jVar.a(this.f5377c, i18);
                    this.V = xVarA1111;
                    xVarA1111.a(vVarA1111);
                    return;
                default:
                    throw com.applovin.exoplayer2.ai.b("Unrecognized codec identifier.", null);
            }
        }

        public void b() {
            c cVar = this.S;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f5401a = new byte[10];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f5403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f5404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f5405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f5406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f5407g;

        public void a() {
            this.f5402b = false;
            this.f5403c = 0;
        }

        public void a(b bVar) {
            if (this.f5403c > 0) {
                bVar.V.a(this.f5404d, this.f5405e, this.f5406f, this.f5407g, bVar.f5383i);
                this.f5403c = 0;
            }
        }

        public void a(b bVar, long j10, int i10, int i11, int i12) {
            if (this.f5402b) {
                int i13 = this.f5403c;
                int i14 = i13 + 1;
                this.f5403c = i14;
                if (i13 == 0) {
                    this.f5404d = j10;
                    this.f5405e = i10;
                    this.f5406f = 0;
                }
                this.f5406f += i11;
                this.f5407g = i12;
                if (i14 >= 16) {
                    a(bVar);
                }
            }
        }

        public void a(i iVar) throws IOException {
            if (this.f5402b) {
                return;
            }
            iVar.d(this.f5401a, 0, 10);
            iVar.a();
            if (com.applovin.exoplayer2.b.b.b(this.f5401a) == 0) {
                return;
            }
            this.f5402b = true;
        }
    }

    static {
        HashMap map = new HashMap();
        g.a(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090", BaseTransientBottomBar.ANIMATION_FADE_DURATION, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f5348f = Collections.unmodifiableMap(map);
    }

    public d() {
        this(0);
    }

    public d(int i10) {
        this(new com.applovin.exoplayer2.e.e.a(), i10);
    }

    public d(com.applovin.exoplayer2.e.e.c cVar, int i10) {
        this.f5370w = -1L;
        this.f5371x = -9223372036854775807L;
        this.f5372y = -9223372036854775807L;
        this.f5373z = -9223372036854775807L;
        this.F = -1L;
        this.G = -1L;
        this.H = -9223372036854775807L;
        this.f5354g = cVar;
        cVar.a(new a());
        this.f5357j = (i10 & 1) == 0;
        this.f5355h = new f();
        this.f5356i = new SparseArray<>();
        this.f5360m = new y(4);
        this.f5361n = new y(ByteBuffer.allocate(4).putInt(-1).array());
        this.f5362o = new y(4);
        this.f5358k = new y(com.applovin.exoplayer2.l.v.f7660a);
        this.f5359l = new y(4);
        this.f5363p = new y();
        this.f5364q = new y();
        this.f5365r = new y(8);
        this.f5366s = new y();
        this.f5367t = new y();
        this.R = new int[1];
    }

    private int a(i iVar, b bVar, int i10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(bVar.f5376b)) {
            a(iVar, f5344b, i10);
        } else {
            if (!"S_TEXT/ASS".equals(bVar.f5376b)) {
                x xVar = bVar.V;
                if (!this.f5349aa) {
                    if (bVar.f5381g) {
                        this.U &= -1073741825;
                        if (!this.f5350ab) {
                            iVar.b(this.f5360m.d(), 0, 1);
                            this.X++;
                            if ((this.f5360m.d()[0] & 128) == 128) {
                                throw com.applovin.exoplayer2.ai.b("Extension bit is set in signal byte", null);
                            }
                            this.f5353ae = this.f5360m.d()[0];
                            this.f5350ab = true;
                        }
                        byte b10 = this.f5353ae;
                        if ((b10 & 1) == 1) {
                            boolean z10 = (b10 & 2) == 2;
                            this.U |= 1073741824;
                            if (!this.af) {
                                iVar.b(this.f5365r.d(), 0, 8);
                                this.X += 8;
                                this.af = true;
                                this.f5360m.d()[0] = (byte) ((z10 ? 128 : 0) | 8);
                                this.f5360m.d(0);
                                xVar.a(this.f5360m, 1, 1);
                                this.Y++;
                                this.f5365r.d(0);
                                xVar.a(this.f5365r, 8, 1);
                                this.Y += 8;
                            }
                            if (z10) {
                                if (!this.f5351ac) {
                                    iVar.b(this.f5360m.d(), 0, 1);
                                    this.X++;
                                    this.f5360m.d(0);
                                    this.f5352ad = this.f5360m.h();
                                    this.f5351ac = true;
                                }
                                int i12 = this.f5352ad * 4;
                                this.f5360m.a(i12);
                                iVar.b(this.f5360m.d(), 0, i12);
                                this.X += i12;
                                short s10 = (short) ((this.f5352ad / 2) + 1);
                                int i13 = (s10 * 6) + 2;
                                ByteBuffer byteBuffer = this.f5368u;
                                if (byteBuffer == null || byteBuffer.capacity() < i13) {
                                    this.f5368u = ByteBuffer.allocate(i13);
                                }
                                this.f5368u.position(0);
                                this.f5368u.putShort(s10);
                                int i14 = 0;
                                int i15 = 0;
                                while (true) {
                                    i11 = this.f5352ad;
                                    if (i14 >= i11) {
                                        break;
                                    }
                                    int iW = this.f5360m.w();
                                    if (i14 % 2 == 0) {
                                        this.f5368u.putShort((short) (iW - i15));
                                    } else {
                                        this.f5368u.putInt(iW - i15);
                                    }
                                    i14++;
                                    i15 = iW;
                                }
                                int i16 = (i10 - this.X) - i15;
                                int i17 = i11 % 2;
                                ByteBuffer byteBuffer2 = this.f5368u;
                                if (i17 == 1) {
                                    byteBuffer2.putInt(i16);
                                } else {
                                    byteBuffer2.putShort((short) i16);
                                    this.f5368u.putInt(0);
                                }
                                this.f5366s.a(this.f5368u.array(), i13);
                                xVar.a(this.f5366s, i13, 1);
                                this.Y += i13;
                            }
                        }
                    } else {
                        byte[] bArr = bVar.f5382h;
                        if (bArr != null) {
                            this.f5363p.a(bArr, bArr.length);
                        }
                    }
                    if (bVar.f5380f > 0) {
                        this.U |= 268435456;
                        this.f5367t.a(0);
                        this.f5360m.a(4);
                        this.f5360m.d()[0] = (byte) ((i10 >> 24) & 255);
                        this.f5360m.d()[1] = (byte) ((i10 >> 16) & 255);
                        this.f5360m.d()[2] = (byte) ((i10 >> 8) & 255);
                        this.f5360m.d()[3] = (byte) (i10 & 255);
                        xVar.a(this.f5360m, 4, 2);
                        this.Y += 4;
                    }
                    this.f5349aa = true;
                }
                int iB = this.f5363p.b() + i10;
                if (!"V_MPEG4/ISO/AVC".equals(bVar.f5376b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f5376b)) {
                    if (bVar.S != null) {
                        com.applovin.exoplayer2.l.a.b(this.f5363p.b() == 0);
                        bVar.S.a(iVar);
                    }
                    while (true) {
                        int i18 = this.X;
                        if (i18 >= iB) {
                            break;
                        }
                        int iA = a(iVar, xVar, iB - i18);
                        this.X += iA;
                        this.Y += iA;
                    }
                } else {
                    byte[] bArrD = this.f5359l.d();
                    bArrD[0] = 0;
                    bArrD[1] = 0;
                    bArrD[2] = 0;
                    int i19 = bVar.W;
                    int i20 = 4 - i19;
                    while (this.X < iB) {
                        int i21 = this.Z;
                        if (i21 == 0) {
                            a(iVar, bArrD, i20, i19);
                            this.X += i19;
                            this.f5359l.d(0);
                            this.Z = this.f5359l.w();
                            this.f5358k.d(0);
                            xVar.a(this.f5358k, 4);
                            this.Y += 4;
                        } else {
                            int iA2 = a(iVar, xVar, i21);
                            this.X += iA2;
                            this.Y += iA2;
                            this.Z -= iA2;
                        }
                    }
                }
                if ("A_VORBIS".equals(bVar.f5376b)) {
                    this.f5361n.d(0);
                    xVar.a(this.f5361n, 4);
                    this.Y += 4;
                }
                return e();
            }
            a(iVar, f5346d, i10);
        }
        return e();
    }

    private int a(i iVar, x xVar, int i10) throws IOException {
        int iA = this.f5363p.a();
        if (iA <= 0) {
            return xVar.a((com.applovin.exoplayer2.k.g) iVar, i10, false);
        }
        int iMin = Math.min(i10, iA);
        xVar.a(this.f5363p, iMin);
        return iMin;
    }

    private long a(long j10) throws com.applovin.exoplayer2.ai {
        long j11 = this.f5371x;
        if (j11 != -9223372036854775807L) {
            return ai.d(j10, j11, 1000L);
        }
        throw com.applovin.exoplayer2.ai.b("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private com.applovin.exoplayer2.e.v a(r rVar, r rVar2) {
        int i10;
        if (this.f5370w == -1 || this.f5373z == -9223372036854775807L || rVar == null || rVar.a() == 0 || rVar2 == null || rVar2.a() != rVar.a()) {
            return new com.applovin.exoplayer2.e.v.b(this.f5373z);
        }
        int iA = rVar.a();
        int[] iArrCopyOf = new int[iA];
        long[] jArrCopyOf = new long[iA];
        long[] jArrCopyOf2 = new long[iA];
        long[] jArrCopyOf3 = new long[iA];
        int i11 = 0;
        for (int i12 = 0; i12 < iA; i12++) {
            jArrCopyOf3[i12] = rVar.a(i12);
            jArrCopyOf[i12] = rVar2.a(i12) + this.f5370w;
        }
        while (true) {
            i10 = iA - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
            jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
            i11 = i13;
        }
        iArrCopyOf[i10] = (int) ((this.f5370w + this.f5369v) - jArrCopyOf[i10]);
        jArrCopyOf2[i10] = this.f5373z - jArrCopyOf3[i10];
        long j10 = jArrCopyOf2[i10];
        if (j10 <= 0) {
            q.c("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i10);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i10);
        }
        return new com.applovin.exoplayer2.e.c(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private void a(b bVar, long j10, int i10, int i11, int i12) {
        String str;
        c cVar = bVar.S;
        if (cVar != null) {
            cVar.a(bVar, j10, i10, i11, i12);
        } else {
            if ("S_TEXT/UTF8".equals(bVar.f5376b) || "S_TEXT/ASS".equals(bVar.f5376b)) {
                if (this.Q > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j11 = this.O;
                    if (j11 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        a(bVar.f5376b, j11, this.f5364q.d());
                        for (int iC = this.f5364q.c(); iC < this.f5364q.b(); iC++) {
                            if (this.f5364q.d()[iC] == 0) {
                                this.f5364q.c(iC);
                                break;
                            }
                        }
                        x xVar = bVar.V;
                        y yVar = this.f5364q;
                        xVar.a(yVar, yVar.b());
                        i11 += this.f5364q.b();
                    }
                }
                q.c("MatroskaExtractor", str);
            }
            if ((268435456 & i10) != 0) {
                if (this.Q > 1) {
                    i10 &= -268435457;
                } else {
                    int iB = this.f5367t.b();
                    bVar.V.a(this.f5367t, iB, 2);
                    i11 += iB;
                }
            }
            bVar.V.a(j10, i10, i11, i12, bVar.f5383i);
        }
        this.L = true;
    }

    private void a(i iVar, int i10) throws IOException {
        if (this.f5360m.b() >= i10) {
            return;
        }
        if (this.f5360m.e() < i10) {
            y yVar = this.f5360m;
            yVar.b(Math.max(yVar.e() * 2, i10));
        }
        iVar.b(this.f5360m.d(), this.f5360m.b(), i10 - this.f5360m.b());
        this.f5360m.c(i10);
    }

    private void a(i iVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.f5364q.e() < length) {
            this.f5364q.a(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f5364q.d(), 0, bArr.length);
        }
        iVar.b(this.f5364q.d(), bArr.length, i10);
        this.f5364q.d(0);
        this.f5364q.c(length);
    }

    private void a(i iVar, byte[] bArr, int i10, int i11) throws IOException {
        int iMin = Math.min(i11, this.f5363p.a());
        iVar.b(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f5363p.a(bArr, i10, iMin);
        }
    }

    private static void a(String str, long j10, byte[] bArr) {
        byte[] bArrA;
        int i10;
        Objects.requireNonNull(str);
        if (str.equals("S_TEXT/ASS")) {
            bArrA = a(j10, "%01d:%02d:%02d:%02d", AbstractComponentTracker.LINGERING_TIMEOUT);
            i10 = 21;
        } else {
            if (!str.equals("S_TEXT/UTF8")) {
                throw new IllegalArgumentException();
            }
            bArrA = a(j10, "%02d:%02d:%02d,%03d", 1000L);
            i10 = 19;
        }
        System.arraycopy(bArrA, 0, bArr, i10, bArrA.length);
    }

    private boolean a(com.applovin.exoplayer2.e.u uVar, long j10) {
        if (this.E) {
            this.G = j10;
            uVar.f6134a = this.F;
            this.E = false;
            return true;
        }
        if (this.B) {
            long j11 = this.G;
            if (j11 != -1) {
                uVar.f6134a = j11;
                this.G = -1L;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean a(String str) {
        Objects.requireNonNull(str);
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    b10 = 0;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    b10 = 1;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    b10 = 2;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    b10 = 3;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    b10 = 4;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    b10 = 5;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    b10 = 6;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    b10 = 7;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    b10 = 8;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    b10 = 9;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    b10 = 10;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    b10 = 11;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    b10 = 12;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    b10 = 13;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    b10 = 14;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    b10 = 15;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    b10 = 16;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    b10 = 17;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    b10 = 18;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    b10 = 19;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    b10 = 20;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    b10 = 21;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    b10 = 22;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    b10 = 23;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    b10 = Ascii.CAN;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    b10 = Ascii.EM;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    b10 = Ascii.SUB;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    b10 = Ascii.ESC;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    b10 = Ascii.FS;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    b10 = Ascii.GS;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    b10 = Ascii.RS;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    b10 = Ascii.US;
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
                return true;
            default:
                return false;
        }
    }

    private static byte[] a(long j10, String str, long j11) {
        com.applovin.exoplayer2.l.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) (i10 * DateTimeConstants.SECONDS_PER_HOUR)) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) (i11 * 60)) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return ai.c(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    private static int[] a(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private void d(int i10) throws com.applovin.exoplayer2.ai {
        if (this.A != null) {
            return;
        }
        throw com.applovin.exoplayer2.ai.b("Element " + i10 + " must be in a TrackEntry", null);
    }

    private int e() {
        int i10 = this.Y;
        f();
        return i10;
    }

    private void e(int i10) throws com.applovin.exoplayer2.ai {
        if (this.I == null || this.J == null) {
            throw com.applovin.exoplayer2.ai.b("Element " + i10 + " must be in a Cues", null);
        }
    }

    private b f(int i10) throws com.applovin.exoplayer2.ai {
        d(i10);
        return this.A;
    }

    private void f() {
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f5349aa = false;
        this.f5350ab = false;
        this.f5351ac = false;
        this.f5352ad = 0;
        this.f5353ae = (byte) 0;
        this.af = false;
        this.f5363p.a(0);
    }

    private void g() {
        com.applovin.exoplayer2.l.a.a(this.ag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h[] h() {
        return new h[]{new d()};
    }

    public int a(int i10) {
        switch (i10) {
            case 131:
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
            case 155:
            case 159:
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION /* 225 */:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public final int a(i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        this.L = false;
        boolean zA = true;
        while (zA && !this.L) {
            zA = this.f5354g.a(iVar);
            if (zA && a(uVar, iVar.c())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f5356i.size(); i10++) {
            b bVarValueAt = this.f5356i.valueAt(i10);
            bVarValueAt.d();
            bVarValueAt.a();
        }
        return -1;
    }

    public void a(int i10, double d10) throws com.applovin.exoplayer2.ai {
        if (i10 == 181) {
            f(i10).P = (int) d10;
        }
        if (i10 == 17545) {
            this.f5372y = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                f(i10).C = (float) d10;
                break;
            case 21970:
                f(i10).D = (float) d10;
                break;
            case 21971:
                f(i10).E = (float) d10;
                break;
            case 21972:
                f(i10).F = (float) d10;
                break;
            case 21973:
                f(i10).G = (float) d10;
                break;
            case 21974:
                f(i10).H = (float) d10;
                break;
            case 21975:
                f(i10).I = (float) d10;
                break;
            case 21976:
                f(i10).J = (float) d10;
                break;
            case 21977:
                f(i10).K = (float) d10;
                break;
            case 21978:
                f(i10).L = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        f(i10).f5392r = (float) d10;
                        break;
                    case 30324:
                        f(i10).f5393s = (float) d10;
                        break;
                    case 30325:
                        f(i10).f5394t = (float) d10;
                        break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:98:0x0292  */
    public void a(int i10, int i11, i iVar) throws IOException {
        b bVar;
        int i12;
        b bVar2;
        long j10;
        long j11;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16 = 0;
        int i17 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.M != 2) {
                    return;
                }
                a(this.f5356i.get(this.S), this.V, iVar, i11);
                return;
            }
            if (i10 == 16877) {
                a(f(i10), iVar, i11);
                return;
            }
            if (i10 == 16981) {
                d(i10);
                byte[] bArr = new byte[i11];
                this.A.f5382h = bArr;
                iVar.b(bArr, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr2 = new byte[i11];
                iVar.b(bArr2, 0, i11);
                f(i10).f5383i = new x.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.f5362o.d(), (byte) 0);
                iVar.b(this.f5362o.d(), 4 - i11, i11);
                this.f5362o.d(0);
                this.C = (int) this.f5362o.o();
                return;
            }
            if (i10 == 25506) {
                d(i10);
                byte[] bArr3 = new byte[i11];
                this.A.f5384j = bArr3;
                iVar.b(bArr3, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw com.applovin.exoplayer2.ai.b("Unexpected id: " + i10, null);
            }
            d(i10);
            byte[] bArr4 = new byte[i11];
            this.A.f5395u = bArr4;
            iVar.b(bArr4, 0, i11);
            return;
        }
        if (this.M == 0) {
            this.S = (int) this.f5355h.a(iVar, false, true, 8);
            this.T = this.f5355h.b();
            this.O = -9223372036854775807L;
            this.M = 1;
            this.f5360m.a(0);
        }
        b bVar3 = this.f5356i.get(this.S);
        if (bVar3 == null) {
            iVar.b(i11 - this.T);
            this.M = 0;
            return;
        }
        bVar3.d();
        if (this.M == 1) {
            a(iVar, 3);
            int i18 = (this.f5360m.d()[2] & 6) >> 1;
            byte b10 = 255;
            if (i18 == 0) {
                this.Q = 1;
                int[] iArrA = a(this.R, 1);
                this.R = iArrA;
                iArrA[0] = (i11 - this.T) - 3;
            } else {
                int i19 = 4;
                a(iVar, 4);
                int i20 = (this.f5360m.d()[3] & 255) + 1;
                this.Q = i20;
                int[] iArrA2 = a(this.R, i20);
                this.R = iArrA2;
                if (i18 == 2) {
                    int i21 = (i11 - this.T) - 4;
                    int i22 = this.Q;
                    Arrays.fill(iArrA2, 0, i22, i21 / i22);
                } else {
                    if (i18 == 1) {
                        int i23 = 0;
                        int i24 = 0;
                        while (true) {
                            i13 = this.Q;
                            if (i23 >= i13 - 1) {
                                break;
                            }
                            this.R[i23] = 0;
                            do {
                                i19++;
                                a(iVar, i19);
                                i14 = this.f5360m.d()[i19 - 1] & 255;
                                iArr = this.R;
                                iArr[i23] = iArr[i23] + i14;
                            } while (i14 == 255);
                            i24 += iArr[i23];
                            i23++;
                        }
                        this.R[i13 - 1] = ((i11 - this.T) - i19) - i24;
                    } else {
                        if (i18 != 3) {
                            throw com.applovin.exoplayer2.ai.b("Unexpected lacing value: " + i18, null);
                        }
                        int i25 = 0;
                        int i26 = 0;
                        while (true) {
                            int i27 = this.Q;
                            if (i25 >= i27 - 1) {
                                bVar2 = bVar3;
                                this.R[i27 - 1] = ((i11 - this.T) - i19) - i26;
                                break;
                            }
                            this.R[i25] = i16;
                            i19++;
                            a(iVar, i19);
                            int i28 = i19 - 1;
                            if (this.f5360m.d()[i28] == 0) {
                                throw com.applovin.exoplayer2.ai.b("No valid varint length mask found", null);
                            }
                            int i29 = i16;
                            while (true) {
                                if (i29 >= 8) {
                                    j10 = 0;
                                    break;
                                }
                                int i30 = i17 << (7 - i29);
                                if ((this.f5360m.d()[i28] & i30) != 0) {
                                    int i31 = i19 + i29;
                                    a(iVar, i31);
                                    long j12 = (~i30) & this.f5360m.d()[i28] & b10;
                                    int i32 = i28 + 1;
                                    while (true) {
                                        j11 = j12;
                                        if (i32 >= i31) {
                                            break;
                                        }
                                        j12 = (j11 << 8) | ((long) (this.f5360m.d()[i32] & b10));
                                        i32++;
                                        i31 = i31;
                                        b10 = 255;
                                    }
                                    int i33 = i31;
                                    if (i25 > 0) {
                                        j11 -= (1 << ((i29 * 7) + 6)) - 1;
                                    }
                                    j10 = j11;
                                    i19 = i33;
                                    break;
                                }
                                i29++;
                                i17 = 1;
                                b10 = 255;
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                throw com.applovin.exoplayer2.ai.b("EBML lacing sample size out of range.", null);
                            }
                            int i34 = (int) j10;
                            int[] iArr2 = this.R;
                            if (i25 != 0) {
                                i34 += iArr2[i25 - 1];
                            }
                            iArr2[i25] = i34;
                            i26 += iArr2[i25];
                            i25++;
                            bVar3 = bVar3;
                            i16 = 0;
                            i17 = 1;
                            b10 = 255;
                        }
                    }
                    this.N = this.H + a((this.f5360m.d()[0] << 8) | (this.f5360m.d()[1] & 255));
                    bVar = bVar2;
                    if (bVar.f5378d != 2 || (i10 == 163 && (this.f5360m.d()[2] & 128) == 128)) {
                        i15 = 1;
                    } else {
                        i15 = 0;
                    }
                    this.U = i15;
                    this.M = 2;
                    this.P = 0;
                    i12 = 163;
                }
            }
            bVar2 = bVar3;
            this.N = this.H + a((this.f5360m.d()[0] << 8) | (this.f5360m.d()[1] & 255));
            bVar = bVar2;
            if (bVar.f5378d != 2) {
                i15 = 1;
            } else {
                i15 = 1;
            }
            this.U = i15;
            this.M = 2;
            this.P = 0;
            i12 = 163;
        } else {
            bVar = bVar3;
            i12 = 163;
        }
        if (i10 == i12) {
            while (true) {
                int i35 = this.P;
                if (i35 >= this.Q) {
                    this.M = 0;
                    return;
                }
                a(bVar, ((long) ((this.P * bVar.f5379e) / 1000)) + this.N, this.U, a(iVar, bVar, this.R[i35]), 0);
                this.P++;
            }
        } else {
            while (true) {
                int i36 = this.P;
                if (i36 >= this.Q) {
                    return;
                }
                int[] iArr3 = this.R;
                iArr3[i36] = a(iVar, bVar, iArr3[i36]);
                this.P++;
            }
        }
    }

    public void a(int i10, long j10) throws com.applovin.exoplayer2.ai {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw com.applovin.exoplayer2.ai.b("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw com.applovin.exoplayer2.ai.b("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                f(i10).f5378d = (int) j10;
                return;
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                f(i10).U = j10 == 1;
                return;
            case 155:
                this.O = a(j10);
                return;
            case 159:
                f(i10).N = (int) j10;
                return;
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                f(i10).f5386l = (int) j10;
                return;
            case 179:
                e(i10);
                this.I.a(a(j10));
                return;
            case 186:
                f(i10).f5387m = (int) j10;
                return;
            case 215:
                f(i10).f5377c = (int) j10;
                return;
            case 231:
                this.H = a(j10);
                return;
            case 238:
                this.V = (int) j10;
                return;
            case 241:
                if (this.K) {
                    return;
                }
                e(i10);
                this.J.a(j10);
                this.K = true;
                return;
            case 251:
                this.W = true;
                return;
            case 16871:
                f(i10).X = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw com.applovin.exoplayer2.ai.b("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.D = j10 + this.f5370w;
                return;
            case 21432:
                int i11 = (int) j10;
                d(i10);
                if (i11 == 0) {
                    this.A.f5396v = 0;
                    return;
                }
                if (i11 == 1) {
                    this.A.f5396v = 2;
                    return;
                } else if (i11 == 3) {
                    this.A.f5396v = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.A.f5396v = 3;
                    return;
                }
            case 21680:
                f(i10).f5388n = (int) j10;
                return;
            case 21682:
                f(i10).f5390p = (int) j10;
                return;
            case 21690:
                f(i10).f5389o = (int) j10;
                return;
            case 21930:
                f(i10).T = j10 == 1;
                return;
            case 21998:
                f(i10).f5380f = (int) j10;
                return;
            case 22186:
                f(i10).Q = j10;
                return;
            case 22203:
                f(i10).R = j10;
                return;
            case 25188:
                f(i10).O = (int) j10;
                return;
            case 30321:
                d(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.A.f5391q = 0;
                    return;
                }
                if (i12 == 1) {
                    this.A.f5391q = 1;
                    return;
                } else if (i12 == 2) {
                    this.A.f5391q = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.A.f5391q = 3;
                    return;
                }
            case 2352003:
                f(i10).f5379e = (int) j10;
                return;
            case 2807729:
                this.f5371x = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        d(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.A.f5400z = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.A.f5400z = 1;
                            return;
                        }
                    case 21946:
                        d(i10);
                        int iB = com.applovin.exoplayer2.m.b.b((int) j10);
                        if (iB != -1) {
                            this.A.f5399y = iB;
                            return;
                        }
                        return;
                    case 21947:
                        d(i10);
                        this.A.f5397w = true;
                        int iA = com.applovin.exoplayer2.m.b.a((int) j10);
                        if (iA != -1) {
                            this.A.f5398x = iA;
                            return;
                        }
                        return;
                    case 21948:
                        f(i10).A = (int) j10;
                        return;
                    case 21949:
                        f(i10).B = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public void a(int i10, long j10, long j11) throws com.applovin.exoplayer2.ai {
        g();
        if (i10 == 160) {
            this.W = false;
            return;
        }
        if (i10 == 174) {
            this.A = new b();
            return;
        }
        if (i10 == 187) {
            this.K = false;
            return;
        }
        if (i10 == 19899) {
            this.C = -1;
            this.D = -1L;
            return;
        }
        if (i10 == 20533) {
            f(i10).f5381g = true;
            return;
        }
        if (i10 == 21968) {
            f(i10).f5397w = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f5370w;
            if (j12 != -1 && j12 != j10) {
                throw com.applovin.exoplayer2.ai.b("Multiple Segment elements not supported", null);
            }
            this.f5370w = j10;
            this.f5369v = j11;
            return;
        }
        if (i10 == 475249515) {
            this.I = new r();
            this.J = new r();
        } else if (i10 == 524531317 && !this.B) {
            if (this.f5357j && this.F != -1) {
                this.E = true;
            } else {
                this.ag.a(new com.applovin.exoplayer2.e.v.b(this.f5373z));
                this.B = true;
            }
        }
    }

    public void a(int i10, String str) throws com.applovin.exoplayer2.ai {
        if (i10 == 134) {
            f(i10).f5376b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                f(i10).f5375a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                f(i10).Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw com.applovin.exoplayer2.ai.b("DocType " + str + " not supported", null);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        this.H = -9223372036854775807L;
        this.M = 0;
        this.f5354g.a();
        this.f5355h.a();
        f();
        for (int i10 = 0; i10 < this.f5356i.size(); i10++) {
            this.f5356i.valueAt(i10).b();
        }
    }

    public void a(b bVar, int i10, i iVar, int i11) throws IOException {
        if (i10 != 4 || !"V_VP9".equals(bVar.f5376b)) {
            iVar.b(i11);
        } else {
            this.f5367t.a(i11);
            iVar.b(this.f5367t.d(), 0, i11);
        }
    }

    public void a(b bVar, i iVar, int i10) throws IOException {
        if (bVar.X != 1685485123 && bVar.X != 1685480259) {
            iVar.b(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        bVar.M = bArr;
        iVar.b(bArr, 0, i10);
    }

    @Override // com.applovin.exoplayer2.e.h
    public final void a(j jVar) {
        this.ag = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public final boolean a(i iVar) throws IOException {
        return new e().a(iVar);
    }

    public boolean b(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    @Override // com.applovin.exoplayer2.e.h
    public final void c() {
    }

    public void c(int i10) throws com.applovin.exoplayer2.ai {
        g();
        if (i10 == 160) {
            if (this.M != 2) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.Q; i12++) {
                i11 += this.R[i12];
            }
            b bVar = this.f5356i.get(this.S);
            bVar.d();
            for (int i13 = 0; i13 < this.Q; i13++) {
                long j10 = ((long) ((bVar.f5379e * i13) / 1000)) + this.N;
                int i14 = this.U;
                if (i13 == 0 && !this.W) {
                    i14 |= 1;
                }
                int i15 = this.R[i13];
                i11 -= i15;
                a(bVar, j10, i14, i15, i11);
            }
            this.M = 0;
            return;
        }
        if (i10 == 174) {
            b bVar2 = (b) com.applovin.exoplayer2.l.a.a(this.A);
            String str = bVar2.f5376b;
            if (str == null) {
                throw com.applovin.exoplayer2.ai.b("CodecId is missing in TrackEntry element", null);
            }
            if (a(str)) {
                bVar2.a(this.ag, bVar2.f5377c);
                this.f5356i.put(bVar2.f5377c, bVar2);
            }
            this.A = null;
            return;
        }
        if (i10 == 19899) {
            int i16 = this.C;
            if (i16 != -1) {
                long j11 = this.D;
                if (j11 != -1) {
                    if (i16 == 475249515) {
                        this.F = j11;
                        return;
                    }
                    return;
                }
            }
            throw com.applovin.exoplayer2.ai.b("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            d(i10);
            b bVar3 = this.A;
            if (bVar3.f5381g) {
                if (bVar3.f5383i == null) {
                    throw com.applovin.exoplayer2.ai.b("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                bVar3.f5385k = new com.applovin.exoplayer2.d.e(new com.applovin.exoplayer2.d.e.a(com.applovin.exoplayer2.h.f6457a, "video/webm", this.A.f5383i.f6143b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            d(i10);
            b bVar4 = this.A;
            if (bVar4.f5381g && bVar4.f5382h != null) {
                throw com.applovin.exoplayer2.ai.b("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f5371x == -9223372036854775807L) {
                this.f5371x = 1000000L;
            }
            long j12 = this.f5372y;
            if (j12 != -9223372036854775807L) {
                this.f5373z = a(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f5356i.size() == 0) {
                throw com.applovin.exoplayer2.ai.b("No valid tracks were found", null);
            }
            this.ag.a();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.B) {
                this.ag.a(a(this.I, this.J));
                this.B = true;
            }
            this.I = null;
            this.J = null;
        }
    }
}
