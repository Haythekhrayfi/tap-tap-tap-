package com.yandex.mobile.ads.impl;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gh extends ih {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f21035j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<am> f21039n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<am> f21040o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f21041p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f21042q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f21043r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f21044s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private byte f21045t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte f21046u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f21048w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f21049x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int[] f21030y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f21031z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, BaseTransientBottomBar.ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] C = {174, SyslogConstants.LOG_LOCAL6, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final mp0 f21032g = new mp0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList<a> f21037l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f21038m = new a(0, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f21047v = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f21036k = 16000000;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList f21050a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f21051b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f21052c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f21054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f21055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f21056g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f21057h;

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.gh$a$a, reason: collision with other inner class name */
        public static class C0207a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f21058a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f21059b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f21060c;

            public C0207a(int i10, int i11, boolean z10) {
                this.f21058a = i10;
                this.f21059b = z10;
                this.f21060c = i11;
            }
        }

        public a(int i10, int i11) {
            b(i10);
            this.f21057h = i11;
        }

        private SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21052c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f21050a.size()) {
                C0207a c0207a = (C0207a) this.f21050a.get(i14);
                boolean z11 = c0207a.f21059b;
                int i16 = c0207a.f21058a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = gh.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0207a.f21060c;
                i14++;
                if (i17 != (i14 < this.f21050a.size() ? ((C0207a) this.f21050a.get(i14)).f21060c : length)) {
                    if (i10 != -1 && !z11) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        if (i12 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                        }
                        i15 = i17;
                        i12 = i13;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
            }
            if (i11 != -1 && i11 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
            }
            if (i15 != length && i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final am a(int i10) {
            float f10;
            int i11 = this.f21054e + this.f21055f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f21051b.size(); i13++) {
                CharSequence charSequenceSubSequence = (CharSequence) this.f21051b.get(i13);
                int i14 = da1.f19803a;
                if (charSequenceSubSequence.length() > i12) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i12);
                }
                spannableStringBuilder.append(charSequenceSubSequence);
                spannableStringBuilder.append('\n');
            }
            SpannableString spannableStringB = b();
            int i15 = da1.f19803a;
            int length = spannableStringB.length();
            SpannableString spannableStringSubSequence = spannableStringB;
            if (length > i12) {
                spannableStringSubSequence = spannableStringB.subSequence(0, i12);
            }
            spannableStringBuilder.append((CharSequence) spannableStringSubSequence);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i12 - spannableStringBuilder.length();
            int i16 = i11 - length2;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f21056g != 2 || (Math.abs(i16) >= 3 && length2 >= 0)) ? (this.f21056g != 2 || i16 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length2;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i17 = this.f21053d;
            if (i17 > 7) {
                i17 = (i17 - 15) - 2;
            } else if (this.f21056g == 1) {
                i17 -= this.f21057h - 1;
            }
            return new am.a().a(spannableStringBuilder).b(Layout.Alignment.ALIGN_NORMAL).a(1, i17).b(f10).b(i10).a();
        }

        public final void a() {
            int length = this.f21052c.length();
            if (length > 0) {
                this.f21052c.delete(length - 1, length);
                for (int size = this.f21050a.size() - 1; size >= 0; size--) {
                    C0207a c0207a = (C0207a) this.f21050a.get(size);
                    int i10 = c0207a.f21060c;
                    if (i10 != length) {
                        return;
                    }
                    c0207a.f21060c = i10 - 1;
                }
            }
        }

        public final void a(char c10) {
            if (this.f21052c.length() < 32) {
                this.f21052c.append(c10);
            }
        }

        public final void a(boolean z10, int i10) {
            this.f21050a.add(new C0207a(i10, this.f21052c.length(), z10));
        }

        public final void b(int i10) {
            this.f21056g = i10;
            this.f21050a.clear();
            this.f21051b.clear();
            this.f21052c.setLength(0);
            this.f21053d = 15;
            this.f21054e = 0;
            this.f21055f = 0;
        }

        public final void c(int i10) {
            this.f21056g = i10;
        }

        public final boolean c() {
            return this.f21050a.isEmpty() && this.f21051b.isEmpty() && this.f21052c.length() == 0;
        }

        public final void d() {
            this.f21051b.add(b());
            this.f21052c.setLength(0);
            this.f21050a.clear();
            int iMin = Math.min(this.f21057h, this.f21053d);
            while (this.f21051b.size() >= iMin) {
                this.f21051b.remove(0);
            }
        }

        public final void d(int i10) {
            this.f21057h = i10;
        }
    }

    public gh(int i10, String str) {
        this.f21033h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f21035j = 0;
            this.f21034i = 0;
        } else if (i10 != 2) {
            if (i10 == 3) {
                this.f21035j = 0;
            } else if (i10 != 4) {
                p90.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                this.f21035j = 0;
                this.f21034i = 0;
            } else {
                this.f21035j = 1;
            }
            this.f21034i = 1;
        } else {
            this.f21035j = 1;
            this.f21034i = 0;
        }
        a(0);
        k();
        this.f21048w = true;
        this.f21049x = -9223372036854775807L;
    }

    private void a(int i10) {
        int i11 = this.f21041p;
        if (i11 == i10) {
            return;
        }
        this.f21041p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f21037l.size(); i12++) {
                this.f21037l.get(i12).c(i10);
            }
            return;
        }
        k();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f21039n = Collections.emptyList();
        }
    }

    private ArrayList j() {
        int size = this.f21037l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            am amVarA = this.f21037l.get(i10).a(Integer.MIN_VALUE);
            arrayList.add(amVarA);
            if (amVarA != null) {
                iMin = Math.min(iMin, amVarA.f18965i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            am amVarA2 = (am) arrayList.get(i11);
            if (amVarA2 != null) {
                if (amVarA2.f18965i != iMin) {
                    amVarA2 = this.f21037l.get(i11).a(iMin);
                    Objects.requireNonNull(amVarA2);
                }
                arrayList2.add(amVarA2);
            }
        }
        return arrayList2;
    }

    private void k() {
        this.f21038m.b(this.f21041p);
        this.f21037l.clear();
        this.f21037l.add(this.f21038m);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1 A[FALL_THROUGH] */
    @Override // com.yandex.mobile.ads.impl.ih
    public final void b(l51 l51Var) {
        boolean z10;
        boolean z11;
        a aVar;
        int i10;
        ByteBuffer byteBuffer = l51Var.f19004c;
        Objects.requireNonNull(byteBuffer);
        this.f21032g.a(byteBuffer.limit(), byteBuffer.array());
        boolean z12 = false;
        while (true) {
            int iA = this.f21032g.a();
            int i11 = this.f21033h;
            if (iA < i11) {
                if (z12) {
                    int i12 = this.f21041p;
                    if (i12 == 1 || i12 == 3) {
                        this.f21039n = j();
                        this.f21049x = g();
                        return;
                    }
                    return;
                }
                return;
            }
            byte bT = i11 == 2 ? (byte) -4 : (byte) this.f21032g.t();
            int iT = this.f21032g.t();
            int iT2 = this.f21032g.t();
            if ((bT & 2) == 0 && (bT & 1) == this.f21034i) {
                byte b10 = (byte) (iT & 127);
                byte b11 = (byte) (iT2 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z13 = this.f21043r;
                    if ((bT & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[iT] && zArr[iT2]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f21043r = z10;
                    if (z10) {
                        if (!((b10 & 240) == 16)) {
                            this.f21044s = false;
                        } else if (this.f21044s && this.f21045t == b10 && this.f21046u == b11) {
                            this.f21044s = false;
                            z11 = true;
                        } else {
                            this.f21044s = true;
                            this.f21045t = b10;
                            this.f21046u = b11;
                        }
                        z11 = false;
                    } else {
                        this.f21044s = false;
                        z11 = false;
                    }
                    if (!z11) {
                        if (z10) {
                            if (1 <= b10 && b10 <= 15) {
                                this.f21048w = false;
                            } else if ((b10 & 247) == 20) {
                                if (b11 != 32 && b11 != 47) {
                                    switch (b11) {
                                        default:
                                            switch (b11) {
                                                case 42:
                                                case 43:
                                                    this.f21048w = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f21048w = true;
                                            break;
                                    }
                                } else {
                                    this.f21048w = true;
                                }
                            }
                            if (this.f21048w) {
                                int i13 = b10 & 224;
                                if (i13 == 0) {
                                    this.f21047v = (b10 >> 3) & 1;
                                }
                                if (this.f21047v == this.f21035j) {
                                    if (i13 == 0) {
                                        int i14 = b10 & 247;
                                        if (i14 == 17 && (b11 & 240) == 48) {
                                            aVar = this.f21038m;
                                            i10 = C[b11 & 15];
                                        } else {
                                            int i15 = b10 & 246;
                                            if (i15 == 18 && (b11 & 224) == 32) {
                                                this.f21038m.a();
                                                aVar = this.f21038m;
                                                i10 = (b10 & 1) == 0 ? D[b11 & Ascii.US] : E[b11 & Ascii.US];
                                            } else if (i14 == 17 && (b11 & 240) == 32) {
                                                this.f21038m.a(' ');
                                                this.f21038m.a((b11 & 1) == 1, (b11 >> 1) & 7);
                                            } else if ((b10 & 240) == 16 && (b11 & 192) == 64) {
                                                int i16 = f21030y[b10 & 7];
                                                if ((b11 & 32) != 0) {
                                                    i16++;
                                                }
                                                if (i16 != this.f21038m.f21053d) {
                                                    if (this.f21041p != 1 && !this.f21038m.c()) {
                                                        a aVar2 = new a(this.f21041p, this.f21042q);
                                                        this.f21038m = aVar2;
                                                        this.f21037l.add(aVar2);
                                                    }
                                                    this.f21038m.f21053d = i16;
                                                }
                                                boolean z14 = (b11 & 16) == 16;
                                                int i17 = (b11 >> 1) & 7;
                                                this.f21038m.a((b11 & 1) == 1, z14 ? 8 : i17);
                                                if (z14) {
                                                    this.f21038m.f21054e = f21031z[i17];
                                                }
                                            } else if (i14 == 23 && b11 >= 33 && b11 <= 35) {
                                                this.f21038m.f21055f = b11 - 32;
                                            } else if (i15 == 20 && (b11 & 240) == 32) {
                                                if (b11 == 32) {
                                                    a(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            a(1);
                                                            this.f21042q = 2;
                                                            this.f21038m.d(2);
                                                            break;
                                                        case 38:
                                                            a(1);
                                                            this.f21042q = 3;
                                                            this.f21038m.d(3);
                                                            break;
                                                        case 39:
                                                            a(1);
                                                            this.f21042q = 4;
                                                            this.f21038m.d(4);
                                                            break;
                                                        default:
                                                            int i18 = this.f21041p;
                                                            if (i18 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f21039n = Collections.emptyList();
                                                                            int i19 = this.f21041p;
                                                                            if (i19 == 1 || i19 == 3) {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i18 == 1 && !this.f21038m.c()) {
                                                                                this.f21038m.d();
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.f21039n = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f21038m.a();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    a(3);
                                                }
                                            }
                                        }
                                        aVar.a((char) i10);
                                    } else {
                                        a aVar3 = this.f21038m;
                                        int i20 = (b10 & Ascii.DEL) - 32;
                                        int[] iArr = B;
                                        aVar3.a((char) iArr[i20]);
                                        if ((b11 & 224) != 0) {
                                            aVar = this.f21038m;
                                            i10 = iArr[(b11 & Ascii.DEL) - 32];
                                            aVar.a((char) i10);
                                        }
                                    }
                                    z12 = true;
                                }
                            }
                        } else if (z13) {
                            k();
                            z12 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ih
    public final h51 c() {
        List<am> list = this.f21039n;
        this.f21040o = list;
        Objects.requireNonNull(list);
        return new jh(list);
    }

    @Override // com.yandex.mobile.ads.impl.ih, com.yandex.mobile.ads.impl.xm
    /* JADX INFO: renamed from: e */
    public final m51 a() throws j51 {
        m51 m51VarF;
        m51 m51VarA = super.a();
        if (m51VarA != null) {
            return m51VarA;
        }
        if (!((this.f21036k == -9223372036854775807L || this.f21049x == -9223372036854775807L || g() - this.f21049x < this.f21036k) ? false : true) || (m51VarF = f()) == null) {
            return null;
        }
        this.f21039n = Collections.emptyList();
        this.f21049x = -9223372036854775807L;
        m51VarF.a(g(), c(), RecyclerView.FOREVER_NS);
        return m51VarF;
    }

    @Override // com.yandex.mobile.ads.impl.ih, com.yandex.mobile.ads.impl.xm
    public final void flush() {
        super.flush();
        this.f21039n = null;
        this.f21040o = null;
        a(0);
        this.f21042q = 4;
        this.f21038m.d(4);
        k();
        this.f21043r = false;
        this.f21044s = false;
        this.f21045t = (byte) 0;
        this.f21046u = (byte) 0;
        this.f21047v = 0;
        this.f21048w = true;
        this.f21049x = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.ih
    public final boolean h() {
        return this.f21039n != this.f21040o;
    }

    @Override // com.yandex.mobile.ads.impl.xm
    public final void release() {
    }
}
