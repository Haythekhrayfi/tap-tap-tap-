package com.applovin.exoplayer2.i.a;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.i.j;
import com.applovin.exoplayer2.i.k;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.applovin.exoplayer2.i.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f6809a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f6810b = new x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6811c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f6813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0098b[] f6814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0098b f6815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f6816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f6817i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f6818j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6819k;

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f6820c = new Comparator() { // from class: com.applovin.exoplayer2.i.a.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.a.a((b.a) obj, (b.a) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.i.a f6821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6822b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            com.applovin.exoplayer2.i.a.C0095a c0095aB = new com.applovin.exoplayer2.i.a.C0095a().a(charSequence).a(alignment).a(f10, i10).a(i11).a(f11).b(i12).b(f12);
            if (z10) {
                c0095aB.c(i13);
            }
            this.f6821a = c0095aB.e();
            this.f6822b = i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar2.f6822b, aVar.f6822b);
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.i.a.b$b, reason: collision with other inner class name */
    public static final class C0098b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f6823a = a(2, 2, 2, 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f6824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f6825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int[] f6826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int[] f6827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int[] f6828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final boolean[] f6829g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int[] f6830h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int[] f6831i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int[] f6832j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int[] f6833k;
        private int A;
        private int B;
        private int C;
        private int D;
        private int E;
        private int F;
        private int G;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final List<SpannableString> f6834l = new ArrayList();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final SpannableStringBuilder f6835m = new SpannableStringBuilder();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f6836n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f6837o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f6838p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f6839q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f6840r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f6841s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f6842t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f6843u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f6844v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f6845w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f6846x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f6847y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f6848z;

        static {
            int iA = a(0, 0, 0, 0);
            f6824b = iA;
            int iA2 = a(0, 0, 0, 3);
            f6825c = iA2;
            f6826d = new int[]{0, 0, 0, 0, 0, 2, 0};
            f6827e = new int[]{0, 0, 0, 0, 0, 0, 2};
            f6828f = new int[]{3, 3, 3, 3, 3, 3, 1};
            f6829g = new boolean[]{false, false, false, true, true, true, false};
            f6830h = new int[]{iA, iA2, iA, iA, iA2, iA, iA};
            f6831i = new int[]{0, 1, 2, 3, 4, 3, 4};
            f6832j = new int[]{0, 0, 0, 0, 0, 3, 3};
            f6833k = new int[]{iA, iA, iA, iA, iA, iA2, iA2};
        }

        public C0098b() {
            b();
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0021  */
        public static int a(int i10, int i11, int i12, int i13) {
            int i14;
            com.applovin.exoplayer2.l.a.a(i10, 0, 4);
            com.applovin.exoplayer2.l.a.a(i11, 0, 4);
            com.applovin.exoplayer2.l.a.a(i12, 0, 4);
            com.applovin.exoplayer2.l.a.a(i13, 0, 4);
            if (i13 == 0 || i13 == 1) {
                i14 = 255;
            } else if (i13 == 2) {
                i14 = 127;
            } else if (i13 != 3) {
                i14 = 255;
            } else {
                i14 = 0;
            }
            return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
        }

        public static int b(int i10, int i11, int i12) {
            return a(i10, i11, i12, 0);
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f6835m.append(c10);
                return;
            }
            this.f6834l.add(g());
            this.f6835m.clear();
            if (this.A != -1) {
                this.A = 0;
            }
            if (this.B != -1) {
                this.B = 0;
            }
            if (this.C != -1) {
                this.C = 0;
            }
            if (this.E != -1) {
                this.E = 0;
            }
            while (true) {
                if ((!this.f6844v || this.f6834l.size() < this.f6843u) && this.f6834l.size() < 15) {
                    return;
                } else {
                    this.f6834l.remove(0);
                }
            }
        }

        public void a(int i10, int i11) {
            if (this.G != i10) {
                a('\n');
            }
            this.G = i10;
        }

        public void a(int i10, int i11, int i12) {
            if (this.C != -1 && this.D != i10) {
                this.f6835m.setSpan(new ForegroundColorSpan(this.D), this.C, this.f6835m.length(), 33);
            }
            if (i10 != f6823a) {
                this.C = this.f6835m.length();
                this.D = i10;
            }
            if (this.E != -1 && this.F != i11) {
                this.f6835m.setSpan(new BackgroundColorSpan(this.F), this.E, this.f6835m.length(), 33);
            }
            if (i11 != f6824b) {
                this.E = this.f6835m.length();
                this.F = i11;
            }
        }

        public void a(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.A != -1) {
                if (!z10) {
                    this.f6835m.setSpan(new StyleSpan(2), this.A, this.f6835m.length(), 33);
                    this.A = -1;
                }
            } else if (z10) {
                this.A = this.f6835m.length();
            }
            if (this.B == -1) {
                if (z11) {
                    this.B = this.f6835m.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f6835m.setSpan(new UnderlineSpan(), this.B, this.f6835m.length(), 33);
                this.B = -1;
            }
        }

        public void a(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f6848z = i10;
            this.f6845w = i15;
        }

        public void a(boolean z10) {
            this.f6837o = z10;
        }

        public void a(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f6836n = true;
            this.f6837o = z10;
            this.f6844v = z11;
            this.f6838p = i10;
            this.f6839q = z13;
            this.f6840r = i11;
            this.f6841s = i12;
            this.f6842t = i15;
            int i18 = i13 + 1;
            if (this.f6843u != i18) {
                this.f6843u = i18;
                while (true) {
                    if ((!z11 || this.f6834l.size() < this.f6843u) && this.f6834l.size() < 15) {
                        break;
                    } else {
                        this.f6834l.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f6846x != i16) {
                this.f6846x = i16;
                int i19 = i16 - 1;
                a(f6830h[i19], f6825c, f6829g[i19], 0, f6827e[i19], f6828f[i19], f6826d[i19]);
            }
            if (i17 == 0 || this.f6847y == i17) {
                return;
            }
            this.f6847y = i17;
            int i20 = i17 - 1;
            a(0, 1, 1, false, false, f6832j[i20], f6831i[i20]);
            a(f6823a, f6833k[i20], f6824b);
        }

        public boolean a() {
            return !d() || (this.f6834l.isEmpty() && this.f6835m.length() == 0);
        }

        public void b() {
            c();
            this.f6836n = false;
            this.f6837o = false;
            this.f6838p = 4;
            this.f6839q = false;
            this.f6840r = 0;
            this.f6841s = 0;
            this.f6842t = 0;
            this.f6843u = 15;
            this.f6844v = true;
            this.f6845w = 0;
            this.f6846x = 0;
            this.f6847y = 0;
            int i10 = f6824b;
            this.f6848z = i10;
            this.D = f6823a;
            this.F = i10;
        }

        public void c() {
            this.f6834l.clear();
            this.f6835m.clear();
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.E = -1;
            this.G = 0;
        }

        public boolean d() {
            return this.f6836n;
        }

        public boolean e() {
            return this.f6837o;
        }

        public void f() {
            int length = this.f6835m.length();
            if (length > 0) {
                this.f6835m.delete(length - 1, length);
            }
        }

        public SpannableString g() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f6835m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.A, length, 33);
                }
                if (this.B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.B, length, 33);
                }
                if (this.C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.D), this.C, length, 33);
                }
                if (this.E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.F), this.E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public a h() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            if (a()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < this.f6834l.size(); i10++) {
                spannableStringBuilder.append((CharSequence) this.f6834l.get(i10));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) g());
            int i11 = this.f6845w;
            if (i11 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    StringBuilder sbA = defpackage.a.a("Unexpected justification value: ");
                    sbA.append(this.f6845w);
                    throw new IllegalArgumentException(sbA.toString());
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f6839q) {
                f10 = this.f6841s / 99.0f;
                f11 = this.f6840r / 99.0f;
            } else {
                f10 = this.f6841s / 209.0f;
                f11 = this.f6840r / 74.0f;
            }
            float f12 = (f10 * 0.9f) + 0.05f;
            float f13 = (f11 * 0.9f) + 0.05f;
            int i12 = this.f6842t;
            return new a(spannableStringBuilder, alignment2, f13, 0, i12 / 3 == 0 ? 0 : i12 / 3 == 1 ? 1 : 2, f12, i12 % 3 == 0 ? 0 : i12 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f6848z != f6824b, this.f6848z, this.f6838p);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f6851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6852d = 0;

        public c(int i10, int i11) {
            this.f6849a = i10;
            this.f6850b = i11;
            this.f6851c = new byte[(i11 * 2) - 1];
        }
    }

    public b(int i10, List<byte[]> list) {
        this.f6813e = i10 == -1 ? 1 : i10;
        this.f6812d = list != null && com.applovin.exoplayer2.l.e.a(list);
        this.f6814f = new C0098b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f6814f[i11] = new C0098b();
        }
        this.f6815g = this.f6814f[0];
    }

    private void a(int i10) {
        x xVar;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f6816h = q();
            }
            int i11 = 8;
            if (i10 == 8) {
                this.f6815g.f();
                return;
            }
            switch (i10) {
                case 12:
                    r();
                    break;
                case 13:
                    this.f6815g.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        q.c("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        xVar = this.f6810b;
                    } else if (i10 < 24 || i10 > 31) {
                        q.c("Cea708Decoder", "Invalid C0 command: " + i10);
                    } else {
                        q.c("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        xVar = this.f6810b;
                        i11 = 16;
                    }
                    xVar.b(i11);
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b(int i10) {
        C0098b c0098b;
        x xVar;
        int i11 = 16;
        int i12 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i13 = i10 - 128;
                if (this.f6819k != i13) {
                    this.f6819k = i13;
                    c0098b = this.f6814f[i13];
                    this.f6815g = c0098b;
                }
                break;
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                while (i12 <= 8) {
                    if (this.f6810b.e()) {
                        this.f6814f[8 - i12].c();
                    }
                    i12++;
                }
                break;
            case 137:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f6810b.e()) {
                        this.f6814f[8 - i14].a(true);
                    }
                }
                break;
            case 138:
                while (i12 <= 8) {
                    if (this.f6810b.e()) {
                        this.f6814f[8 - i12].a(false);
                    }
                    i12++;
                }
                break;
            case 139:
                for (int i15 = 1; i15 <= 8; i15++) {
                    if (this.f6810b.e()) {
                        C0098b c0098b2 = this.f6814f[8 - i15];
                        c0098b2.a(!c0098b2.e());
                    }
                }
                break;
            case 140:
                while (i12 <= 8) {
                    if (this.f6810b.e()) {
                        this.f6814f[8 - i12].b();
                    }
                    i12++;
                }
                break;
            case 141:
                this.f6810b.b(8);
                break;
            case 142:
                break;
            case 143:
                r();
                break;
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
                if (this.f6815g.d()) {
                    m();
                }
                xVar = this.f6810b;
                xVar.b(i11);
                break;
            case 145:
                if (this.f6815g.d()) {
                    n();
                } else {
                    xVar = this.f6810b;
                    i11 = 24;
                    xVar.b(i11);
                }
                break;
            case 146:
                if (this.f6815g.d()) {
                    o();
                }
                xVar = this.f6810b;
                xVar.b(i11);
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                q.c("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f6815g.d()) {
                    p();
                } else {
                    xVar = this.f6810b;
                    i11 = 32;
                    xVar.b(i11);
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
                int i16 = i10 - 152;
                i(i16);
                if (this.f6819k != i16) {
                    this.f6819k = i16;
                    c0098b = this.f6814f[i16];
                    this.f6815g = c0098b;
                }
                break;
        }
    }

    private void c(int i10) {
        x xVar;
        int i11;
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            xVar = this.f6810b;
            i11 = 8;
        } else if (i10 <= 23) {
            xVar = this.f6810b;
            i11 = 16;
        } else {
            if (i10 > 31) {
                return;
            }
            xVar = this.f6810b;
            i11 = 24;
        }
        xVar.b(i11);
    }

    private void d(int i10) {
        x xVar;
        int i11;
        if (i10 <= 135) {
            xVar = this.f6810b;
            i11 = 32;
        } else {
            if (i10 > 143) {
                if (i10 <= 159) {
                    this.f6810b.b(2);
                    this.f6810b.b(this.f6810b.c(6) * 8);
                    return;
                }
                return;
            }
            xVar = this.f6810b;
            i11 = 40;
        }
        xVar.b(i11);
    }

    private void e(int i10) {
        if (i10 == 127) {
            this.f6815g.a((char) 9835);
        } else {
            this.f6815g.a((char) (i10 & 255));
        }
    }

    private void f(int i10) {
        this.f6815g.a((char) (i10 & 255));
    }

    private void g(int i10) {
        C0098b c0098b;
        char c10 = ' ';
        if (i10 == 32) {
            c0098b = this.f6815g;
        } else if (i10 == 33) {
            c0098b = this.f6815g;
            c10 = 160;
        } else if (i10 == 37) {
            c0098b = this.f6815g;
            c10 = 8230;
        } else if (i10 == 42) {
            c0098b = this.f6815g;
            c10 = 352;
        } else if (i10 == 44) {
            c0098b = this.f6815g;
            c10 = 338;
        } else if (i10 == 63) {
            c0098b = this.f6815g;
            c10 = 376;
        } else if (i10 == 57) {
            c0098b = this.f6815g;
            c10 = 8482;
        } else if (i10 == 58) {
            c0098b = this.f6815g;
            c10 = 353;
        } else if (i10 == 60) {
            c0098b = this.f6815g;
            c10 = 339;
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    c0098b = this.f6815g;
                    c10 = 9608;
                    break;
                case 49:
                    c0098b = this.f6815g;
                    c10 = 8216;
                    break;
                case 50:
                    c0098b = this.f6815g;
                    c10 = 8217;
                    break;
                case 51:
                    c0098b = this.f6815g;
                    c10 = 8220;
                    break;
                case 52:
                    c0098b = this.f6815g;
                    c10 = 8221;
                    break;
                case 53:
                    c0098b = this.f6815g;
                    c10 = 8226;
                    break;
                default:
                    switch (i10) {
                        case 118:
                            c0098b = this.f6815g;
                            c10 = 8539;
                            break;
                        case 119:
                            c0098b = this.f6815g;
                            c10 = 8540;
                            break;
                        case 120:
                            c0098b = this.f6815g;
                            c10 = 8541;
                            break;
                        case 121:
                            c0098b = this.f6815g;
                            c10 = 8542;
                            break;
                        case 122:
                            c0098b = this.f6815g;
                            c10 = 9474;
                            break;
                        case 123:
                            c0098b = this.f6815g;
                            c10 = 9488;
                            break;
                        case 124:
                            c0098b = this.f6815g;
                            c10 = 9492;
                            break;
                        case 125:
                            c0098b = this.f6815g;
                            c10 = 9472;
                            break;
                        case 126:
                            c0098b = this.f6815g;
                            c10 = 9496;
                            break;
                        case 127:
                            c0098b = this.f6815g;
                            c10 = 9484;
                            break;
                        default:
                            q.c("Cea708Decoder", "Invalid G2 character: " + i10);
                            return;
                    }
                    break;
            }
        } else {
            c0098b = this.f6815g;
            c10 = 8480;
        }
        c0098b.a(c10);
    }

    private void h(int i10) {
        C0098b c0098b;
        char c10;
        if (i10 == 160) {
            c0098b = this.f6815g;
            c10 = 13252;
        } else {
            q.c("Cea708Decoder", "Invalid G3 character: " + i10);
            c0098b = this.f6815g;
            c10 = '_';
        }
        c0098b.a(c10);
    }

    private void i() {
        if (this.f6818j == null) {
            return;
        }
        l();
        this.f6818j = null;
    }

    private void i(int i10) {
        C0098b c0098b = this.f6814f[i10];
        this.f6810b.b(2);
        boolean zE = this.f6810b.e();
        boolean zE2 = this.f6810b.e();
        boolean zE3 = this.f6810b.e();
        int iC = this.f6810b.c(3);
        boolean zE4 = this.f6810b.e();
        int iC2 = this.f6810b.c(7);
        int iC3 = this.f6810b.c(8);
        int iC4 = this.f6810b.c(4);
        int iC5 = this.f6810b.c(4);
        this.f6810b.b(2);
        int iC6 = this.f6810b.c(6);
        this.f6810b.b(2);
        c0098b.a(zE, zE2, zE3, iC, zE4, iC2, iC3, iC5, iC6, iC4, this.f6810b.c(3), this.f6810b.c(3));
    }

    private void l() {
        StringBuilder sb2;
        String str;
        c cVar = this.f6818j;
        if (cVar.f6852d != (cVar.f6850b * 2) - 1) {
            StringBuilder sbA = defpackage.a.a("DtvCcPacket ended prematurely; size is ");
            sbA.append((this.f6818j.f6850b * 2) - 1);
            sbA.append(", but current index is ");
            sbA.append(this.f6818j.f6852d);
            sbA.append(" (sequence number ");
            sbA.append(this.f6818j.f6849a);
            sbA.append(");");
            q.a("Cea708Decoder", sbA.toString());
        }
        x xVar = this.f6810b;
        c cVar2 = this.f6818j;
        xVar.a(cVar2.f6851c, cVar2.f6852d);
        int iC = this.f6810b.c(3);
        int iC2 = this.f6810b.c(5);
        if (iC == 7) {
            this.f6810b.b(2);
            iC = this.f6810b.c(6);
            if (iC < 7) {
                q.c("Cea708Decoder", "Invalid extended service number: " + iC);
            }
        }
        if (iC2 == 0) {
            if (iC != 0) {
                q.c("Cea708Decoder", "serviceNumber is non-zero (" + iC + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (iC != this.f6813e) {
            return;
        }
        boolean z10 = false;
        while (this.f6810b.a() > 0) {
            int iC3 = this.f6810b.c(8);
            if (iC3 == 16) {
                iC3 = this.f6810b.c(8);
                if (iC3 <= 31) {
                    c(iC3);
                } else {
                    if (iC3 <= 127) {
                        g(iC3);
                    } else if (iC3 <= 159) {
                        d(iC3);
                    } else if (iC3 <= 255) {
                        h(iC3);
                    } else {
                        sb2 = new StringBuilder();
                        str = "Invalid extended command: ";
                        sb2.append(str);
                        sb2.append(iC3);
                        q.c("Cea708Decoder", sb2.toString());
                    }
                    z10 = true;
                }
            } else if (iC3 <= 31) {
                a(iC3);
            } else {
                if (iC3 <= 127) {
                    e(iC3);
                } else if (iC3 <= 159) {
                    b(iC3);
                } else if (iC3 <= 255) {
                    f(iC3);
                } else {
                    sb2 = new StringBuilder();
                    str = "Invalid base command: ";
                    sb2.append(str);
                    sb2.append(iC3);
                    q.c("Cea708Decoder", sb2.toString());
                }
                z10 = true;
            }
        }
        if (z10) {
            this.f6816h = q();
        }
    }

    private void m() {
        this.f6815g.a(this.f6810b.c(4), this.f6810b.c(2), this.f6810b.c(2), this.f6810b.e(), this.f6810b.e(), this.f6810b.c(3), this.f6810b.c(3));
    }

    private void n() {
        int iA = C0098b.a(this.f6810b.c(2), this.f6810b.c(2), this.f6810b.c(2), this.f6810b.c(2));
        int iA2 = C0098b.a(this.f6810b.c(2), this.f6810b.c(2), this.f6810b.c(2), this.f6810b.c(2));
        this.f6810b.b(2);
        this.f6815g.a(iA, iA2, C0098b.b(this.f6810b.c(2), this.f6810b.c(2), this.f6810b.c(2)));
    }

    private void o() {
        this.f6810b.b(4);
        int iC = this.f6810b.c(4);
        this.f6810b.b(2);
        this.f6815g.a(iC, this.f6810b.c(6));
    }

    private void p() {
        int iA = C0098b.a(this.f6810b.c(2), this.f6810b.c(2), this.f6810b.c(2), this.f6810b.c(2));
        int iC = this.f6810b.c(2);
        int iB = C0098b.b(this.f6810b.c(2), this.f6810b.c(2), this.f6810b.c(2));
        if (this.f6810b.e()) {
            iC |= 4;
        }
        boolean zE = this.f6810b.e();
        int iC2 = this.f6810b.c(2);
        int iC3 = this.f6810b.c(2);
        int iC4 = this.f6810b.c(2);
        this.f6810b.b(8);
        this.f6815g.a(iA, iB, zE, iC, iC2, iC3, iC4);
    }

    private List<com.applovin.exoplayer2.i.a> q() {
        a aVarH;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f6814f[i10].a() && this.f6814f[i10].e() && (aVarH = this.f6814f[i10].h()) != null) {
                arrayList.add(aVarH);
            }
        }
        Collections.sort(arrayList, a.f6820c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f6821a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void r() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f6814f[i10].b();
        }
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.i.g
    public /* bridge */ /* synthetic */ void a(long j10) {
        super.a(j10);
    }

    @Override // com.applovin.exoplayer2.i.a.c
    public void a(j jVar) {
        ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(jVar.f4752b);
        this.f6809a.a(byteBuffer.array(), byteBuffer.limit());
        while (this.f6809a.a() >= 3) {
            int iH = this.f6809a.h() & 7;
            int i10 = iH & 3;
            boolean z10 = (iH & 4) == 4;
            byte bH = (byte) this.f6809a.h();
            byte bH2 = (byte) this.f6809a.h();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        i();
                        int i11 = (bH & 192) >> 6;
                        int i12 = this.f6811c;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            r();
                            StringBuilder sbA = defpackage.a.a("Sequence number discontinuity. previous=");
                            sbA.append(this.f6811c);
                            sbA.append(" current=");
                            sbA.append(i11);
                            q.c("Cea708Decoder", sbA.toString());
                        }
                        this.f6811c = i11;
                        int i13 = bH & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c cVar = new c(i11, i13);
                        this.f6818j = cVar;
                        byte[] bArr = cVar.f6851c;
                        int i14 = cVar.f6852d;
                        cVar.f6852d = i14 + 1;
                        bArr[i14] = bH2;
                    } else {
                        com.applovin.exoplayer2.l.a.a(i10 == 2);
                        c cVar2 = this.f6818j;
                        if (cVar2 == null) {
                            q.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f6851c;
                            int i15 = cVar2.f6852d;
                            int i16 = i15 + 1;
                            cVar2.f6852d = i16;
                            bArr2[i15] = bH;
                            cVar2.f6852d = i16 + 1;
                            bArr2[i16] = bH2;
                        }
                    }
                    c cVar3 = this.f6818j;
                    if (cVar3.f6852d == (cVar3.f6850b * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void a(j jVar) throws h {
        super.a(jVar);
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    public void c() {
        super.c();
        this.f6816h = null;
        this.f6817i = null;
        this.f6819k = 0;
        this.f6815g = this.f6814f[0];
        r();
        this.f6818j = null;
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ k b() throws h {
        return super.b();
    }

    @Override // com.applovin.exoplayer2.i.a.c
    public boolean f() {
        return this.f6816h != this.f6817i;
    }

    @Override // com.applovin.exoplayer2.i.a.c
    public com.applovin.exoplayer2.i.f g() {
        List<com.applovin.exoplayer2.i.a> list = this.f6816h;
        this.f6817i = list;
        return new d((List) com.applovin.exoplayer2.l.a.b(list));
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ j a() throws h {
        return super.a();
    }
}
