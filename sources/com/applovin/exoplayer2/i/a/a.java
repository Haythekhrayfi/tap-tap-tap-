package com.applovin.exoplayer2.i.a;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.i.j;
import com.applovin.exoplayer2.i.k;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f6772a = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f6773b = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f6774c = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f6775d = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, BaseTransientBottomBar.ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f6776e = {174, SyslogConstants.LOG_LOCAL6, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f6777f = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f6778g = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean[] f6779h = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f6781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f6782k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f6783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f6784m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f6787p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f6788q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f6789r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f6790s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f6791t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f6792u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte f6793v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte f6794w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f6796y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f6797z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final y f6780i = new y();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList<C0096a> f6785n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C0096a f6786o = new C0096a(0, 4);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f6795x = 0;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.i.a.a$a, reason: collision with other inner class name */
    public static final class C0096a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C0097a> f6798a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f6799b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f6800c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f6801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f6803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f6804g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f6805h;

        /* JADX INFO: renamed from: com.applovin.exoplayer2.i.a.a$a$a, reason: collision with other inner class name */
        public static class C0097a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f6806a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f6807b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f6808c;

            public C0097a(int i10, boolean z10, int i11) {
                this.f6806a = i10;
                this.f6807b = z10;
                this.f6808c = i11;
            }
        }

        public C0096a(int i10, int i11) {
            a(i10);
            this.f6805h = i11;
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f6800c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            while (i10 < this.f6798a.size()) {
                C0097a c0097a = this.f6798a.get(i10);
                boolean z11 = c0097a.f6807b;
                int i16 = c0097a.f6806a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.f6774c[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0097a.f6808c;
                i10++;
                if (i17 != (i10 < this.f6798a.size() ? this.f6798a.get(i10).f6808c : length)) {
                    if (i12 != -1 && !z11) {
                        a(spannableStringBuilder, i12, i17);
                        i12 = -1;
                    } else if (i12 == -1 && z11) {
                        i12 = i17;
                    }
                    if (i13 != -1 && !z10) {
                        b(spannableStringBuilder, i13, i17);
                        i13 = -1;
                    } else if (i13 == -1 && z10) {
                        i13 = i17;
                    }
                    if (i15 != i14) {
                        a(spannableStringBuilder, i11, i17, i14);
                        i14 = i15;
                        i11 = i17;
                    }
                }
            }
            if (i12 != -1 && i12 != length) {
                a(spannableStringBuilder, i12, length);
            }
            if (i13 != -1 && i13 != length) {
                b(spannableStringBuilder, i13, length);
            }
            if (i11 != length) {
                a(spannableStringBuilder, i11, length, i14);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void a(char c10) {
            if (this.f6800c.length() < 32) {
                this.f6800c.append(c10);
            }
        }

        public void a(int i10) {
            this.f6804g = i10;
            this.f6798a.clear();
            this.f6799b.clear();
            this.f6800c.setLength(0);
            this.f6801d = 15;
            this.f6802e = 0;
            this.f6803f = 0;
        }

        public void a(int i10, boolean z10) {
            this.f6798a.add(new C0097a(i10, z10, this.f6800c.length()));
        }

        public boolean a() {
            return this.f6798a.isEmpty() && this.f6799b.isEmpty() && this.f6800c.length() == 0;
        }

        public void b() {
            int length = this.f6800c.length();
            if (length > 0) {
                this.f6800c.delete(length - 1, length);
                for (int size = this.f6798a.size() - 1; size >= 0; size--) {
                    C0097a c0097a = this.f6798a.get(size);
                    int i10 = c0097a.f6808c;
                    if (i10 != length) {
                        return;
                    }
                    c0097a.f6808c = i10 - 1;
                }
            }
        }

        public void b(int i10) {
            this.f6804g = i10;
        }

        public void c() {
            this.f6799b.add(d());
            this.f6800c.setLength(0);
            this.f6798a.clear();
            int iMin = Math.min(this.f6805h, this.f6801d);
            while (this.f6799b.size() >= iMin) {
                this.f6799b.remove(0);
            }
        }

        public void c(int i10) {
            this.f6805h = i10;
        }

        public com.applovin.exoplayer2.i.a d(int i10) {
            float f10;
            int i11 = this.f6802e + this.f6803f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f6799b.size(); i13++) {
                spannableStringBuilder.append(ai.a(this.f6799b.get(i13), i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(ai.a(d(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f6804g != 2 || (Math.abs(i14) >= 3 && length >= 0)) ? (this.f6804g != 2 || i14 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f6801d;
            if (i15 > 7) {
                i15 = (i15 - 15) - 2;
            } else if (this.f6804g == 1) {
                i15 -= this.f6805h - 1;
            }
            return new com.applovin.exoplayer2.i.a.C0095a().a(spannableStringBuilder).a(Layout.Alignment.ALIGN_NORMAL).a(i15, 1).a(f10).b(i10).e();
        }
    }

    public a(String str, int i10, long j10) {
        this.f6784m = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f6781j = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f6783l = 0;
            this.f6782k = 0;
        } else if (i10 != 2) {
            if (i10 == 3) {
                this.f6783l = 0;
            } else if (i10 != 4) {
                q.c("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                this.f6783l = 0;
                this.f6782k = 0;
            } else {
                this.f6783l = 1;
            }
            this.f6782k = 1;
        } else {
            this.f6783l = 1;
            this.f6782k = 0;
        }
        a(0);
        m();
        this.f6796y = true;
        this.f6797z = -9223372036854775807L;
    }

    private void a(byte b10, byte b11) {
        int i10 = f6772a[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f6786o.f6801d) {
            if (this.f6789r != 1 && !this.f6786o.a()) {
                C0096a c0096a = new C0096a(this.f6789r, this.f6790s);
                this.f6786o = c0096a;
                this.f6785n.add(c0096a);
            }
            this.f6786o.f6801d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f6786o.a(z10 ? 8 : i11, z11);
        if (z10) {
            this.f6786o.f6802e = f6773b[i11];
        }
    }

    private void a(int i10) {
        int i11 = this.f6789r;
        if (i11 == i10) {
            return;
        }
        this.f6789r = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f6785n.size(); i12++) {
                this.f6785n.get(i12).b(i10);
            }
            return;
        }
        m();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f6787p = Collections.emptyList();
        }
    }

    private boolean a(byte b10) {
        if (h(b10)) {
            this.f6795x = i(b10);
        }
        return this.f6795x == this.f6783l;
    }

    private boolean a(boolean z10, byte b10, byte b11) {
        if (!z10 || !j(b10)) {
            this.f6792u = false;
        } else {
            if (this.f6792u && this.f6793v == b10 && this.f6794w == b11) {
                this.f6792u = false;
                return true;
            }
            this.f6792u = true;
            this.f6793v = b10;
            this.f6794w = b11;
        }
        return false;
    }

    private void b(byte b10) {
        this.f6786o.a(' ');
        this.f6786o.a((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void b(byte r3, byte r4) {
        /*
            r2 = this;
            boolean r0 = k(r3)
            r1 = 0
            if (r0 == 0) goto La
        L7:
            r2.f6796y = r1
            goto L22
        La:
            boolean r3 = l(r3)
            if (r3 == 0) goto L22
            r3 = 32
            if (r4 == r3) goto L1f
            r3 = 47
            if (r4 == r3) goto L1f
            switch(r4) {
                case 37: goto L1f;
                case 38: goto L1f;
                case 39: goto L1f;
                default: goto L1b;
            }
        L1b:
            switch(r4) {
                case 41: goto L1f;
                case 42: goto L7;
                case 43: goto L7;
                default: goto L1e;
            }
        L1e:
            goto L22
        L1f:
            r3 = 1
            r2.f6796y = r3
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.a.a.b(byte, byte):void");
    }

    private void b(int i10) {
        this.f6790s = i10;
        this.f6786o.c(i10);
    }

    private void c(byte b10) {
        if (b10 == 32) {
            a(2);
            return;
        }
        if (b10 == 41) {
            a(3);
            return;
        }
        switch (b10) {
            case 37:
                a(1);
                b(2);
                break;
            case 38:
                a(1);
                b(3);
                break;
            case 39:
                a(1);
                b(4);
                break;
            default:
                int i10 = this.f6789r;
                if (i10 != 0) {
                    if (b10 == 33) {
                        this.f6786o.b();
                    } else {
                        switch (b10) {
                            case 44:
                                this.f6787p = Collections.emptyList();
                                int i11 = this.f6789r;
                                if (i11 != 1 && i11 != 3) {
                                }
                                break;
                            case 45:
                                if (i10 == 1 && !this.f6786o.a()) {
                                    this.f6786o.c();
                                    break;
                                }
                                break;
                            case 47:
                                this.f6787p = l();
                                break;
                        }
                        m();
                    }
                    break;
                }
                break;
        }
    }

    private static boolean c(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static char d(byte b10) {
        return (char) f6775d[(b10 & Ascii.DEL) - 32];
    }

    private static boolean d(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static char e(byte b10) {
        return (char) f6776e[b10 & 15];
    }

    private static char e(byte b10, byte b11) {
        return (b10 & 1) == 0 ? f(b11) : g(b11);
    }

    private static char f(byte b10) {
        return (char) f6777f[b10 & Ascii.US];
    }

    private static boolean f(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static char g(byte b10) {
        return (char) f6778g[b10 & Ascii.US];
    }

    private static boolean g(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean h(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean h(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static int i(byte b10) {
        return (b10 >> 3) & 1;
    }

    private static boolean i(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean j(byte b10) {
        return (b10 & 240) == 16;
    }

    private static boolean k(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private List<com.applovin.exoplayer2.i.a> l() {
        int size = this.f6785n.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            com.applovin.exoplayer2.i.a aVarD = this.f6785n.get(i10).d(Integer.MIN_VALUE);
            arrayList.add(aVarD);
            if (aVarD != null) {
                iMin = Math.min(iMin, aVarD.f6746j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            com.applovin.exoplayer2.i.a aVar = (com.applovin.exoplayer2.i.a) arrayList.get(i11);
            if (aVar != null) {
                if (aVar.f6746j != iMin) {
                    aVar = (com.applovin.exoplayer2.i.a) com.applovin.exoplayer2.l.a.b(this.f6785n.get(i11).d(iMin));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static boolean l(byte b10) {
        return (b10 & 247) == 20;
    }

    private void m() {
        this.f6786o.a(this.f6789r);
        this.f6785n.clear();
        this.f6785n.add(this.f6786o);
    }

    private boolean n() {
        return (this.f6784m == -9223372036854775807L || this.f6797z == -9223372036854775807L || k() - this.f6797z < this.f6784m) ? false : true;
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.i.g
    public /* bridge */ /* synthetic */ void a(long j10) {
        super.a(j10);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    @Override // com.applovin.exoplayer2.i.a.c
    public void a(j jVar) {
        boolean z10;
        C0096a c0096a;
        char cD;
        ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(jVar.f4752b);
        this.f6780i.a(byteBuffer.array(), byteBuffer.limit());
        boolean z11 = false;
        while (true) {
            int iA = this.f6780i.a();
            int i10 = this.f6781j;
            if (iA < i10) {
                break;
            }
            byte bH = i10 == 2 ? (byte) -4 : (byte) this.f6780i.h();
            int iH = this.f6780i.h();
            int iH2 = this.f6780i.h();
            if ((bH & 2) == 0 && (bH & 1) == this.f6782k) {
                byte b10 = (byte) (iH & 127);
                byte b11 = (byte) (iH2 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f6791t;
                    if ((bH & 4) == 4) {
                        boolean[] zArr = f6779h;
                        if (zArr[iH] && zArr[iH2]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f6791t = z10;
                    if (!a(z10, b10, b11)) {
                        if (this.f6791t) {
                            b(b10, b11);
                            if (this.f6796y && a(b10)) {
                                if (h(b10)) {
                                    if (c(b10, b11)) {
                                        c0096a = this.f6786o;
                                        cD = e(b11);
                                    } else if (d(b10, b11)) {
                                        this.f6786o.b();
                                        c0096a = this.f6786o;
                                        cD = e(b10, b11);
                                    } else if (f(b10, b11)) {
                                        b(b11);
                                    } else if (g(b10, b11)) {
                                        a(b10, b11);
                                    } else if (h(b10, b11)) {
                                        this.f6786o.f6803f = b11 - 32;
                                    } else if (i(b10, b11)) {
                                        c(b11);
                                    }
                                    c0096a.a(cD);
                                } else {
                                    this.f6786o.a(d(b10));
                                    if ((b11 & 224) != 0) {
                                        c0096a = this.f6786o;
                                        cD = d(b11);
                                        c0096a.a(cD);
                                    }
                                }
                                z11 = true;
                            }
                        } else if (z12) {
                            m();
                            z11 = true;
                        }
                    }
                }
            }
        }
        if (z11) {
            int i11 = this.f6789r;
            if (i11 == 1 || i11 == 3) {
                this.f6787p = l();
                this.f6797z = k();
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
        this.f6787p = null;
        this.f6788q = null;
        a(0);
        b(4);
        m();
        this.f6791t = false;
        this.f6792u = false;
        this.f6793v = (byte) 0;
        this.f6794w = (byte) 0;
        this.f6795x = 0;
        this.f6796y = true;
        this.f6797z = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    public void d() {
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: e */
    public k b() throws h {
        k kVarJ;
        k kVarB = super.b();
        if (kVarB != null) {
            return kVarB;
        }
        if (!n() || (kVarJ = j()) == null) {
            return null;
        }
        this.f6787p = Collections.emptyList();
        this.f6797z = -9223372036854775807L;
        kVarJ.a(k(), g(), RecyclerView.FOREVER_NS);
        return kVarJ;
    }

    @Override // com.applovin.exoplayer2.i.a.c
    public boolean f() {
        return this.f6787p != this.f6788q;
    }

    @Override // com.applovin.exoplayer2.i.a.c
    public com.applovin.exoplayer2.i.f g() {
        List<com.applovin.exoplayer2.i.a> list = this.f6787p;
        this.f6788q = list;
        return new d((List) com.applovin.exoplayer2.l.a.b(list));
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ j a() throws h {
        return super.a();
    }
}
