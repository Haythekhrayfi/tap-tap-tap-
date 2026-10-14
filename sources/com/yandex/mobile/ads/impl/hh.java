package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ch.qos.logback.core.net.SyslogConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class hh extends ih {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final mp0 f21394g = new mp0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final lp0 f21395h = new lp0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21396i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f21397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b[] f21398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f21399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<am> f21400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<am> f21401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f21402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f21403p;

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f21404c = fo1.f20763d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final am f21405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21406b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i10, float f11, int i11, boolean z10, int i12, int i13) {
            am.a aVarD = new am.a().a(spannableStringBuilder).b(alignment).a(0, f10).a(i10).b(f11).b(i11).d(-3.4028235E38f);
            if (z10) {
                aVarD.d(i12);
            }
            this.f21405a = aVarD.a();
            this.f21406b = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar2.f21406b, aVar.f21406b);
        }
    }

    public static final class b {
        private static final int[] A;
        private static final boolean[] B;
        private static final int[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f21407w = a(2, 2, 2, 0);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f21408x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int[] f21409y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int[] f21410z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList f21411a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f21412b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f21413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f21414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f21415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f21416f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f21417g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f21418h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f21419i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f21420j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f21421k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f21422l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f21423m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f21424n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f21425o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f21426p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f21427q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f21428r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f21429s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f21430t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f21431u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f21432v;

        static {
            int iA = a(0, 0, 0, 0);
            f21408x = iA;
            int iA2 = a(0, 0, 0, 3);
            f21409y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f21410z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{iA, iA2, iA, iA, iA2, iA, iA};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{iA, iA, iA, iA, iA, iA2, iA2};
        }

        public b() {
            h();
        }

        public static int a(int i10, int i11, int i12, int i13) {
            int i14;
            pa.a(i10, 4);
            pa.a(i11, 4);
            pa.a(i12, 4);
            pa.a(i13, 4);
            if (i13 != 2) {
                i14 = i13 != 3 ? 255 : 0;
            } else {
                i14 = 127;
            }
            return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 <= 1 ? 0 : 255);
        }

        public final void a() {
            int length = this.f21412b.length();
            if (length > 0) {
                this.f21412b.delete(length - 1, length);
            }
        }

        public final void a(char c10) {
            if (c10 != '\n') {
                this.f21412b.append(c10);
                return;
            }
            this.f21411a.add(c());
            this.f21412b.clear();
            if (this.f21426p != -1) {
                this.f21426p = 0;
            }
            if (this.f21427q != -1) {
                this.f21427q = 0;
            }
            if (this.f21428r != -1) {
                this.f21428r = 0;
            }
            if (this.f21430t != -1) {
                this.f21430t = 0;
            }
            while (true) {
                if ((!this.f21421k || this.f21411a.size() < this.f21420j) && this.f21411a.size() < 15) {
                    return;
                } else {
                    this.f21411a.remove(0);
                }
            }
        }

        public final void a(int i10) {
            if (this.f21432v != i10) {
                a('\n');
            }
            this.f21432v = i10;
        }

        public final void a(int i10, int i11) {
            if (this.f21428r != -1 && this.f21429s != i10) {
                this.f21412b.setSpan(new ForegroundColorSpan(this.f21429s), this.f21428r, this.f21412b.length(), 33);
            }
            if (i10 != f21407w) {
                this.f21428r = this.f21412b.length();
                this.f21429s = i10;
            }
            if (this.f21430t != -1 && this.f21431u != i11) {
                this.f21412b.setSpan(new BackgroundColorSpan(this.f21431u), this.f21430t, this.f21412b.length(), 33);
            }
            if (i11 != f21408x) {
                this.f21430t = this.f21412b.length();
                this.f21431u = i11;
            }
        }

        public final void a(boolean z10) {
            this.f21414d = z10;
        }

        public final void a(boolean z10, boolean z11) {
            if (this.f21426p != -1) {
                if (!z10) {
                    this.f21412b.setSpan(new StyleSpan(2), this.f21426p, this.f21412b.length(), 33);
                    this.f21426p = -1;
                }
            } else if (z10) {
                this.f21426p = this.f21412b.length();
            }
            if (this.f21427q == -1) {
                if (z11) {
                    this.f21427q = this.f21412b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f21412b.setSpan(new UnderlineSpan(), this.f21427q, this.f21412b.length(), 33);
                this.f21427q = -1;
            }
        }

        public final void a(boolean z10, boolean z11, int i10, boolean z12, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f21413c = true;
            this.f21414d = z10;
            this.f21421k = z11;
            this.f21415e = i10;
            this.f21416f = z12;
            this.f21417g = i11;
            this.f21418h = i12;
            this.f21419i = i14;
            int i17 = i13 + 1;
            if (this.f21420j != i17) {
                this.f21420j = i17;
                while (true) {
                    if ((!z11 || this.f21411a.size() < this.f21420j) && this.f21411a.size() < 15) {
                        break;
                    } else {
                        this.f21411a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f21423m != i15) {
                this.f21423m = i15;
                int i18 = i15 - 1;
                int i19 = C[i18];
                boolean z13 = B[i18];
                int i20 = f21410z[i18];
                int i21 = A[i18];
                int i22 = f21409y[i18];
                this.f21425o = i19;
                this.f21422l = i22;
            }
            if (i16 == 0 || this.f21424n == i16) {
                return;
            }
            this.f21424n = i16;
            int i23 = i16 - 1;
            int i24 = E[i23];
            int i25 = D[i23];
            a(false, false);
            a(f21407w, F[i23]);
        }

        public final a b() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            if (f()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < this.f21411a.size(); i10++) {
                spannableStringBuilder.append((CharSequence) this.f21411a.get(i10));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) c());
            int i11 = this.f21422l;
            if (i11 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    StringBuilder sbA = v60.a("Unexpected justification value: ");
                    sbA.append(this.f21422l);
                    throw new IllegalArgumentException(sbA.toString());
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f21416f) {
                f10 = this.f21418h / 99.0f;
                f11 = this.f21417g / 99.0f;
            } else {
                f10 = this.f21418h / 209.0f;
                f11 = this.f21417g / 74.0f;
            }
            float f12 = (f10 * 0.9f) + 0.05f;
            float f13 = (f11 * 0.9f) + 0.05f;
            int i12 = this.f21419i;
            int i13 = i12 / 3;
            int i14 = i12 % 3;
            return new a(spannableStringBuilder, alignment2, f13, i13 == 0 ? 0 : i13 == 1 ? 1 : 2, f12, i14 == 0 ? 0 : i14 == 1 ? 1 : 2, this.f21425o != f21408x, this.f21425o, this.f21415e);
        }

        public final void b(int i10, int i11) {
            this.f21425o = i10;
            this.f21422l = i11;
        }

        public final SpannableString c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21412b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f21426p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f21426p, length, 33);
                }
                if (this.f21427q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f21427q, length, 33);
                }
                if (this.f21428r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f21429s), this.f21428r, length, 33);
                }
                if (this.f21430t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f21431u), this.f21430t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.f21411a.clear();
            this.f21412b.clear();
            this.f21426p = -1;
            this.f21427q = -1;
            this.f21428r = -1;
            this.f21430t = -1;
            this.f21432v = 0;
        }

        public final boolean e() {
            return this.f21413c;
        }

        public final boolean f() {
            return !this.f21413c || (this.f21411a.isEmpty() && this.f21412b.length() == 0);
        }

        public final boolean g() {
            return this.f21414d;
        }

        public final void h() {
            d();
            this.f21413c = false;
            this.f21414d = false;
            this.f21415e = 4;
            this.f21416f = false;
            this.f21417g = 0;
            this.f21418h = 0;
            this.f21419i = 0;
            this.f21420j = 15;
            this.f21421k = true;
            this.f21422l = 0;
            this.f21423m = 0;
            this.f21424n = 0;
            int i10 = f21408x;
            this.f21425o = i10;
            this.f21429s = f21407w;
            this.f21431u = i10;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f21435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21436d = 0;

        public c(int i10, int i11) {
            this.f21433a = i10;
            this.f21434b = i11;
            this.f21435c = new byte[(i11 * 2) - 1];
        }
    }

    public hh(int i10, List<byte[]> list) {
        this.f21397j = i10 == -1 ? 1 : i10;
        if (list != null) {
            mj.a(list);
        }
        this.f21398k = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f21398k[i11] = new b();
        }
        this.f21399l = this.f21398k[0];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:185:0x04a8 A[PHI: r4
  0x04a8: PHI (r4v3 int) = (r4v1 int), (r4v4 int) binds: [B:128:0x03c3, B:184:0x04a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:202:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x02b4  */
    private void i() {
        boolean z10;
        lp0 lp0Var;
        b bVar;
        char c10;
        boolean z11;
        c cVar = this.f21402o;
        if (cVar == null) {
            return;
        }
        if (cVar.f21436d != (cVar.f21434b * 2) - 1) {
            StringBuilder sbA = v60.a("DtvCcPacket ended prematurely; size is ");
            sbA.append((this.f21402o.f21434b * 2) - 1);
            sbA.append(", but current index is ");
            sbA.append(this.f21402o.f21436d);
            sbA.append(" (sequence number ");
            sbA.append(this.f21402o.f21433a);
            sbA.append(");");
            p90.a("Cea708Decoder", sbA.toString());
        }
        lp0 lp0Var2 = this.f21395h;
        c cVar2 = this.f21402o;
        lp0Var2.a(cVar2.f21436d, cVar2.f21435c);
        boolean z12 = false;
        while (this.f21395h.b() > 0) {
            int iB = this.f21395h.b(3);
            int iB2 = this.f21395h.b(5);
            if (iB == 7) {
                this.f21395h.d(2);
                iB = this.f21395h.b(6);
                if (iB < 7) {
                    o80.a("Invalid extended service number: ", iB, "Cea708Decoder");
                }
            }
            if (iB2 == 0) {
                if (iB != 0) {
                    p90.d("Cea708Decoder", "serviceNumber is non-zero (" + iB + ") when blockSize is 0");
                }
                if (z12) {
                    this.f21400m = j();
                }
                this.f21402o = null;
            }
            if (iB != this.f21397j) {
                this.f21395h.e(iB2);
            } else {
                int iE = (iB2 * 8) + this.f21395h.e();
                while (this.f21395h.e() < iE) {
                    int iB3 = this.f21395h.b(8);
                    int i10 = 16;
                    if (iB3 == 16) {
                        z10 = true;
                        int iB4 = this.f21395h.b(8);
                        if (iB4 > 31) {
                            i10 = 32;
                            if (iB4 <= 127) {
                                if (iB4 == 32) {
                                    this.f21399l.a(' ');
                                } else if (iB4 == 33) {
                                    this.f21399l.a((char) 160);
                                } else if (iB4 == 37) {
                                    bVar = this.f21399l;
                                    c10 = 8230;
                                } else if (iB4 == 42) {
                                    bVar = this.f21399l;
                                    c10 = 352;
                                } else if (iB4 == 44) {
                                    bVar = this.f21399l;
                                    c10 = 338;
                                } else if (iB4 == 63) {
                                    bVar = this.f21399l;
                                    c10 = 376;
                                } else if (iB4 == 57) {
                                    bVar = this.f21399l;
                                    c10 = 8482;
                                } else if (iB4 == 58) {
                                    bVar = this.f21399l;
                                    c10 = 353;
                                } else if (iB4 == 60) {
                                    bVar = this.f21399l;
                                    c10 = 339;
                                } else if (iB4 != 61) {
                                    switch (iB4) {
                                        case 48:
                                            bVar = this.f21399l;
                                            c10 = 9608;
                                            break;
                                        case 49:
                                            bVar = this.f21399l;
                                            c10 = 8216;
                                            break;
                                        case 50:
                                            bVar = this.f21399l;
                                            c10 = 8217;
                                            break;
                                        case 51:
                                            bVar = this.f21399l;
                                            c10 = 8220;
                                            break;
                                        case 52:
                                            bVar = this.f21399l;
                                            c10 = 8221;
                                            break;
                                        case 53:
                                            bVar = this.f21399l;
                                            c10 = 8226;
                                            break;
                                        default:
                                            switch (iB4) {
                                                case 118:
                                                    bVar = this.f21399l;
                                                    c10 = 8539;
                                                    break;
                                                case 119:
                                                    bVar = this.f21399l;
                                                    c10 = 8540;
                                                    break;
                                                case 120:
                                                    bVar = this.f21399l;
                                                    c10 = 8541;
                                                    break;
                                                case 121:
                                                    bVar = this.f21399l;
                                                    c10 = 8542;
                                                    break;
                                                case 122:
                                                    bVar = this.f21399l;
                                                    c10 = 9474;
                                                    break;
                                                case 123:
                                                    bVar = this.f21399l;
                                                    c10 = 9488;
                                                    break;
                                                case 124:
                                                    bVar = this.f21399l;
                                                    c10 = 9492;
                                                    break;
                                                case 125:
                                                    bVar = this.f21399l;
                                                    c10 = 9472;
                                                    break;
                                                case 126:
                                                    bVar = this.f21399l;
                                                    c10 = 9496;
                                                    break;
                                                case 127:
                                                    bVar = this.f21399l;
                                                    c10 = 9484;
                                                    break;
                                                default:
                                                    o80.a("Invalid G2 character: ", iB4, "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    bVar = this.f21399l;
                                    c10 = 8480;
                                }
                                z12 = z10;
                            } else if (iB4 <= 159) {
                                if (iB4 <= 135) {
                                    lp0Var = this.f21395h;
                                } else if (iB4 <= 143) {
                                    lp0Var = this.f21395h;
                                    i10 = 40;
                                } else if (iB4 <= 159) {
                                    this.f21395h.d(2);
                                    this.f21395h.d(this.f21395h.b(6) * 8);
                                }
                                lp0Var.d(i10);
                            } else if (iB4 > 255) {
                                o80.a("Invalid extended command: ", iB4, "Cea708Decoder");
                            } else if (iB4 == 160) {
                                bVar = this.f21399l;
                                c10 = 13252;
                            } else {
                                o80.a("Invalid G3 character: ", iB4, "Cea708Decoder");
                                bVar = this.f21399l;
                                c10 = '_';
                            }
                            bVar.a(c10);
                            z12 = z10;
                        } else if (iB4 > 7) {
                            if (iB4 <= 15) {
                                this.f21395h.d(8);
                            } else if (iB4 <= 23) {
                                lp0Var = this.f21395h;
                                lp0Var.d(i10);
                            } else if (iB4 <= 31) {
                                this.f21395h.d(24);
                            }
                        }
                    } else if (iB3 <= 31) {
                        if (iB3 != 0) {
                            if (iB3 == 3) {
                                this.f21400m = j();
                            } else if (iB3 != 8) {
                                switch (iB3) {
                                    case 12:
                                        for (int i11 = 0; i11 < 8; i11++) {
                                            this.f21398k[i11].h();
                                        }
                                        break;
                                    case 13:
                                        this.f21399l.a('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (iB3 >= 17 && iB3 <= 23) {
                                            o80.a("Currently unsupported COMMAND_EXT1 Command: ", iB3, "Cea708Decoder");
                                            this.f21395h.d(8);
                                        } else if (iB3 < 24 || iB3 > 31) {
                                            o80.a("Invalid C0 command: ", iB3, "Cea708Decoder");
                                        } else {
                                            o80.a("Currently unsupported COMMAND_P16 Command: ", iB3, "Cea708Decoder");
                                            this.f21395h.d(16);
                                        }
                                        break;
                                }
                            } else {
                                this.f21399l.a();
                            }
                        }
                        z10 = true;
                    } else {
                        if (iB3 <= 127) {
                            this.f21399l.a(iB3 == 127 ? (char) 9835 : (char) (iB3 & 255));
                        } else {
                            if (iB3 <= 159) {
                                switch (iB3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z11 = true;
                                        int i12 = iB3 - 128;
                                        if (this.f21403p != i12) {
                                            this.f21403p = i12;
                                            this.f21399l = this.f21398k[i12];
                                        }
                                        break;
                                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                        z11 = true;
                                        for (int i13 = 1; i13 <= 8; i13++) {
                                            if (this.f21395h.f()) {
                                                this.f21398k[8 - i13].d();
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i14 = 1; i14 <= 8; i14++) {
                                            if (this.f21395h.f()) {
                                                this.f21398k[8 - i14].a(true);
                                            }
                                        }
                                        break;
                                    case 138:
                                        for (int i15 = 1; i15 <= 8; i15++) {
                                            if (this.f21395h.f()) {
                                                this.f21398k[8 - i15].a(false);
                                            }
                                        }
                                        break;
                                    case 139:
                                        for (int i16 = 1; i16 <= 8; i16++) {
                                            if (this.f21395h.f()) {
                                                b bVar2 = this.f21398k[8 - i16];
                                                bVar2.a(!bVar2.g());
                                            }
                                        }
                                        break;
                                    case 140:
                                        for (int i17 = 1; i17 <= 8; i17++) {
                                            if (this.f21395h.f()) {
                                                this.f21398k[8 - i17].h();
                                            }
                                        }
                                        break;
                                    case 141:
                                        this.f21395h.d(8);
                                        break;
                                    case 142:
                                        break;
                                    case 143:
                                        for (int i18 = 0; i18 < 8; i18++) {
                                            this.f21398k[i18].h();
                                        }
                                        break;
                                    case SyslogConstants.LOG_LOCAL2 /* 144 */:
                                        if (this.f21399l.e()) {
                                            this.f21395h.b(4);
                                            this.f21395h.b(2);
                                            this.f21395h.b(2);
                                            boolean zF = this.f21395h.f();
                                            boolean zF2 = this.f21395h.f();
                                            this.f21395h.b(3);
                                            this.f21395h.b(3);
                                            this.f21399l.a(zF, zF2);
                                        } else {
                                            this.f21395h.d(16);
                                        }
                                        break;
                                    case 145:
                                        if (this.f21399l.e()) {
                                            int iA = b.a(this.f21395h.b(2), this.f21395h.b(2), this.f21395h.b(2), this.f21395h.b(2));
                                            int iA2 = b.a(this.f21395h.b(2), this.f21395h.b(2), this.f21395h.b(2), this.f21395h.b(2));
                                            this.f21395h.d(2);
                                            b.a(this.f21395h.b(2), this.f21395h.b(2), this.f21395h.b(2), 0);
                                            this.f21399l.a(iA, iA2);
                                        } else {
                                            this.f21395h.d(24);
                                        }
                                        break;
                                    case 146:
                                        if (this.f21399l.e()) {
                                            this.f21395h.d(4);
                                            int iB5 = this.f21395h.b(4);
                                            this.f21395h.d(2);
                                            this.f21395h.b(6);
                                            this.f21399l.a(iB5);
                                        } else {
                                            this.f21395h.d(16);
                                        }
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        z11 = true;
                                        o80.a("Invalid C1 command: ", iB3, "Cea708Decoder");
                                        break;
                                    case 151:
                                        if (this.f21399l.e()) {
                                            int iA3 = b.a(this.f21395h.b(2), this.f21395h.b(2), this.f21395h.b(2), this.f21395h.b(2));
                                            this.f21395h.b(2);
                                            b.a(this.f21395h.b(2), this.f21395h.b(2), this.f21395h.b(2), 0);
                                            this.f21395h.f();
                                            this.f21395h.f();
                                            this.f21395h.b(2);
                                            this.f21395h.b(2);
                                            int iB6 = this.f21395h.b(2);
                                            this.f21395h.d(8);
                                            this.f21399l.b(iA3, iB6);
                                        } else {
                                            this.f21395h.d(32);
                                        }
                                        break;
                                    case SyslogConstants.LOG_LOCAL3 /* 152 */:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i19 = iB3 - 152;
                                        b bVar3 = this.f21398k[i19];
                                        this.f21395h.d(2);
                                        boolean zF3 = this.f21395h.f();
                                        boolean zF4 = this.f21395h.f();
                                        this.f21395h.f();
                                        int iB7 = this.f21395h.b(3);
                                        boolean zF5 = this.f21395h.f();
                                        int iB8 = this.f21395h.b(7);
                                        int iB9 = this.f21395h.b(8);
                                        int iB10 = this.f21395h.b(4);
                                        int iB11 = this.f21395h.b(4);
                                        this.f21395h.d(2);
                                        this.f21395h.b(6);
                                        this.f21395h.d(2);
                                        bVar3.a(zF3, zF4, iB7, zF5, iB8, iB9, iB11, iB10, this.f21395h.b(3), this.f21395h.b(3));
                                        if (this.f21403p != i19) {
                                            this.f21403p = i19;
                                            this.f21399l = this.f21398k[i19];
                                        }
                                        break;
                                }
                                z12 = z10;
                            } else {
                                z11 = true;
                                if (iB3 <= 255) {
                                    this.f21399l.a((char) (iB3 & 255));
                                } else {
                                    o80.a("Invalid base command: ", iB3, "Cea708Decoder");
                                    z10 = true;
                                }
                            }
                            z10 = z11;
                            z12 = z10;
                        }
                        z10 = true;
                        z12 = z10;
                    }
                }
            }
        }
        if (z12) {
            this.f21400m = j();
        }
        this.f21402o = null;
    }

    private List<am> j() {
        a aVarB;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f21398k[i10].f() && this.f21398k[i10].g() && (aVarB = this.f21398k[i10].b()) != null) {
                arrayList.add(aVarB);
            }
        }
        Collections.sort(arrayList, a.f21404c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f21405a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.ih
    public final void b(l51 l51Var) {
        ByteBuffer byteBuffer = l51Var.f19004c;
        Objects.requireNonNull(byteBuffer);
        this.f21394g.a(byteBuffer.limit(), byteBuffer.array());
        while (this.f21394g.a() >= 3) {
            int iT = this.f21394g.t() & 7;
            int i10 = iT & 3;
            Object[] objArr = (iT & 4) == 4;
            byte bT = (byte) this.f21394g.t();
            byte bT2 = (byte) this.f21394g.t();
            if (i10 == 2 || i10 == 3) {
                if (objArr != false) {
                    if (i10 == 3) {
                        i();
                        int i11 = (bT & 192) >> 6;
                        int i12 = this.f21396i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            for (int i13 = 0; i13 < 8; i13++) {
                                this.f21398k[i13].h();
                            }
                            StringBuilder sbA = v60.a("Sequence number discontinuity. previous=");
                            sbA.append(this.f21396i);
                            sbA.append(" current=");
                            sbA.append(i11);
                            p90.d("Cea708Decoder", sbA.toString());
                        }
                        this.f21396i = i11;
                        int i14 = bT & 63;
                        if (i14 == 0) {
                            i14 = 64;
                        }
                        c cVar = new c(i11, i14);
                        this.f21402o = cVar;
                        byte[] bArr = cVar.f21435c;
                        int i15 = cVar.f21436d;
                        cVar.f21436d = i15 + 1;
                        bArr[i15] = bT2;
                    } else {
                        pa.a(i10 == 2);
                        c cVar2 = this.f21402o;
                        if (cVar2 == null) {
                            p90.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f21435c;
                            int i16 = cVar2.f21436d;
                            int i17 = i16 + 1;
                            bArr2[i16] = bT;
                            cVar2.f21436d = i17 + 1;
                            bArr2[i17] = bT2;
                        }
                    }
                    c cVar3 = this.f21402o;
                    if (cVar3.f21436d == (cVar3.f21434b * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ih
    public final h51 c() {
        List<am> list = this.f21400m;
        this.f21401n = list;
        Objects.requireNonNull(list);
        return new jh(list);
    }

    @Override // com.yandex.mobile.ads.impl.ih, com.yandex.mobile.ads.impl.xm
    public final void flush() {
        super.flush();
        this.f21400m = null;
        this.f21401n = null;
        this.f21403p = 0;
        this.f21399l = this.f21398k[0];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f21398k[i10].h();
        }
        this.f21402o = null;
    }

    @Override // com.yandex.mobile.ads.impl.ih
    public final boolean h() {
        return this.f21400m != this.f21401n;
    }

    @Override // com.yandex.mobile.ads.impl.xm
    public final /* bridge */ /* synthetic */ void release() {
    }
}
