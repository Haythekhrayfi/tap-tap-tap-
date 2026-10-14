package com.applovin.exoplayer2.j;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.b.z;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.a.w;
import com.applovin.exoplayer2.common.base.MoreObjects;
import com.applovin.exoplayer2.l.ai;
import java.util.Collection;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class i implements com.applovin.exoplayer2.g {
    public static final com.applovin.exoplayer2.g.a<i> N;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i f7268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final i f7269p;
    public final boolean A;
    public final s<String> B;
    public final s<String> C;
    public final int D;
    public final int E;
    public final int F;
    public final s<String> G;
    public final s<String> H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final w<Integer> M;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7270q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7273t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f7274u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f7275v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f7276w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f7277x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f7278y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f7279z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f7283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f7284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f7285f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f7286g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f7287h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f7288i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f7289j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f7290k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private s<String> f7291l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private s<String> f7292m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f7293n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f7294o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f7295p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private s<String> f7296q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private s<String> f7297r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f7298s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f7299t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f7300u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f7301v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private w<Integer> f7302w;

        @Deprecated
        public a() {
            this.f7280a = Integer.MAX_VALUE;
            this.f7281b = Integer.MAX_VALUE;
            this.f7282c = Integer.MAX_VALUE;
            this.f7283d = Integer.MAX_VALUE;
            this.f7288i = Integer.MAX_VALUE;
            this.f7289j = Integer.MAX_VALUE;
            this.f7290k = true;
            this.f7291l = s.g();
            this.f7292m = s.g();
            this.f7293n = 0;
            this.f7294o = Integer.MAX_VALUE;
            this.f7295p = Integer.MAX_VALUE;
            this.f7296q = s.g();
            this.f7297r = s.g();
            this.f7298s = 0;
            this.f7299t = false;
            this.f7300u = false;
            this.f7301v = false;
            this.f7302w = w.g();
        }

        public a(Context context) {
            this();
            b(context);
            b(context, true);
        }

        public a(Bundle bundle) {
            String strA = i.a(6);
            i iVar = i.f7268o;
            this.f7280a = bundle.getInt(strA, iVar.f7270q);
            this.f7281b = bundle.getInt(i.a(7), iVar.f7271r);
            this.f7282c = bundle.getInt(i.a(8), iVar.f7272s);
            this.f7283d = bundle.getInt(i.a(9), iVar.f7273t);
            this.f7284e = bundle.getInt(i.a(10), iVar.f7274u);
            this.f7285f = bundle.getInt(i.a(11), iVar.f7275v);
            this.f7286g = bundle.getInt(i.a(12), iVar.f7276w);
            this.f7287h = bundle.getInt(i.a(13), iVar.f7277x);
            this.f7288i = bundle.getInt(i.a(14), iVar.f7278y);
            this.f7289j = bundle.getInt(i.a(15), iVar.f7279z);
            this.f7290k = bundle.getBoolean(i.a(16), iVar.A);
            this.f7291l = s.a((Object[]) MoreObjects.firstNonNull(bundle.getStringArray(i.a(17)), new String[0]));
            this.f7292m = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(i.a(1)), new String[0]));
            this.f7293n = bundle.getInt(i.a(2), iVar.D);
            this.f7294o = bundle.getInt(i.a(18), iVar.E);
            this.f7295p = bundle.getInt(i.a(19), iVar.F);
            this.f7296q = s.a((Object[]) MoreObjects.firstNonNull(bundle.getStringArray(i.a(20)), new String[0]));
            this.f7297r = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(i.a(3)), new String[0]));
            this.f7298s = bundle.getInt(i.a(4), iVar.I);
            this.f7299t = bundle.getBoolean(i.a(5), iVar.J);
            this.f7300u = bundle.getBoolean(i.a(21), iVar.K);
            this.f7301v = bundle.getBoolean(i.a(22), iVar.L);
            this.f7302w = w.a((Collection) com.applovin.exoplayer2.common.b.c.a((int[]) MoreObjects.firstNonNull(bundle.getIntArray(i.a(23)), new int[0])));
        }

        private static s<String> a(String[] strArr) {
            s.a aVarI = s.i();
            for (String str : (String[]) com.applovin.exoplayer2.l.a.b(strArr)) {
                aVarI.a(ai.b((String) com.applovin.exoplayer2.l.a.b(str)));
            }
            return aVarI.a();
        }

        private void a(Context context) {
            CaptioningManager captioningManager;
            if ((ai.f7595a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f7298s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f7297r = s.a(ai.a(locale));
                }
            }
        }

        public a b(int i10, int i11, boolean z10) {
            this.f7288i = i10;
            this.f7289j = i11;
            this.f7290k = z10;
            return this;
        }

        public a b(Context context) {
            if (ai.f7595a >= 19) {
                a(context);
            }
            return this;
        }

        public a b(Context context, boolean z10) {
            Point pointD = ai.d(context);
            return b(pointD.x, pointD.y, z10);
        }

        public i b() {
            return new i(this);
        }
    }

    static {
        i iVarB = new a().b();
        f7268o = iVarB;
        f7269p = iVarB;
        N = z.f4661q;
    }

    public i(a aVar) {
        this.f7270q = aVar.f7280a;
        this.f7271r = aVar.f7281b;
        this.f7272s = aVar.f7282c;
        this.f7273t = aVar.f7283d;
        this.f7274u = aVar.f7284e;
        this.f7275v = aVar.f7285f;
        this.f7276w = aVar.f7286g;
        this.f7277x = aVar.f7287h;
        this.f7278y = aVar.f7288i;
        this.f7279z = aVar.f7289j;
        this.A = aVar.f7290k;
        this.B = aVar.f7291l;
        this.C = aVar.f7292m;
        this.D = aVar.f7293n;
        this.E = aVar.f7294o;
        this.F = aVar.f7295p;
        this.G = aVar.f7296q;
        this.H = aVar.f7297r;
        this.I = aVar.f7298s;
        this.J = aVar.f7299t;
        this.K = aVar.f7300u;
        this.L = aVar.f7301v;
        this.M = aVar.f7302w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i a(Bundle bundle) {
        return new a(bundle).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f7270q == iVar.f7270q && this.f7271r == iVar.f7271r && this.f7272s == iVar.f7272s && this.f7273t == iVar.f7273t && this.f7274u == iVar.f7274u && this.f7275v == iVar.f7275v && this.f7276w == iVar.f7276w && this.f7277x == iVar.f7277x && this.A == iVar.A && this.f7278y == iVar.f7278y && this.f7279z == iVar.f7279z && this.B.equals(iVar.B) && this.C.equals(iVar.C) && this.D == iVar.D && this.E == iVar.E && this.F == iVar.F && this.G.equals(iVar.G) && this.H.equals(iVar.H) && this.I == iVar.I && this.J == iVar.J && this.K == iVar.K && this.L == iVar.L && this.M.equals(iVar.M);
    }

    public int hashCode() {
        return this.M.hashCode() + ((((((((((this.H.hashCode() + ((this.G.hashCode() + ((((((((this.C.hashCode() + ((this.B.hashCode() + ((((((((((((((((((((((this.f7270q + 31) * 31) + this.f7271r) * 31) + this.f7272s) * 31) + this.f7273t) * 31) + this.f7274u) * 31) + this.f7275v) * 31) + this.f7276w) * 31) + this.f7277x) * 31) + (this.A ? 1 : 0)) * 31) + this.f7278y) * 31) + this.f7279z) * 31)) * 31)) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31)) * 31)) * 31) + this.I) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31);
    }
}
