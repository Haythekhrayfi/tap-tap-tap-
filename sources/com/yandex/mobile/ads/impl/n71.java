package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class n71 implements wf {
    public static final n71 A = new n71(new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f23254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f23255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.p<String> f23256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f23257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.p<String> f23258n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f23259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f23260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f23261q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.p<String> f23262r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.p<String> f23263s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f23264t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f23265u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f23266v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f23267w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f23268x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.q<h71, m71> f23269y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.r<Integer> f23270z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f23276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f23277g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f23278h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f23279i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f23280j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f23281k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.p<String> f23282l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f23283m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.p<String> f23284n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f23285o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f23286p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f23287q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.p<String> f23288r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.p<String> f23289s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f23290t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f23291u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f23292v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f23293w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private boolean f23294x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private HashMap<h71, m71> f23295y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private HashSet<Integer> f23296z;

        @Deprecated
        public a() {
            this.f23271a = Integer.MAX_VALUE;
            this.f23272b = Integer.MAX_VALUE;
            this.f23273c = Integer.MAX_VALUE;
            this.f23274d = Integer.MAX_VALUE;
            this.f23279i = Integer.MAX_VALUE;
            this.f23280j = Integer.MAX_VALUE;
            this.f23281k = true;
            this.f23282l = com.yandex.mobile.ads.embedded.guava.collect.p.i();
            this.f23283m = 0;
            this.f23284n = com.yandex.mobile.ads.embedded.guava.collect.p.i();
            this.f23285o = 0;
            this.f23286p = Integer.MAX_VALUE;
            this.f23287q = Integer.MAX_VALUE;
            this.f23288r = com.yandex.mobile.ads.embedded.guava.collect.p.i();
            this.f23289s = com.yandex.mobile.ads.embedded.guava.collect.p.i();
            this.f23290t = 0;
            this.f23291u = 0;
            this.f23292v = false;
            this.f23293w = false;
            this.f23294x = false;
            this.f23295y = new HashMap<>();
            this.f23296z = new HashSet<>();
        }

        public a(Context context) {
            this();
            a(context);
            b(context);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v35, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v44, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v59, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v65, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r0v91, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r7v1, types: [int[], java.io.Serializable] */
        public a(Bundle bundle) {
            String strA = n71.a(6);
            n71 n71Var = n71.A;
            this.f23271a = bundle.getInt(strA, n71Var.f23245a);
            this.f23272b = bundle.getInt(n71.a(7), n71Var.f23246b);
            this.f23273c = bundle.getInt(n71.a(8), n71Var.f23247c);
            this.f23274d = bundle.getInt(n71.a(9), n71Var.f23248d);
            this.f23275e = bundle.getInt(n71.a(10), n71Var.f23249e);
            this.f23276f = bundle.getInt(n71.a(11), n71Var.f23250f);
            this.f23277g = bundle.getInt(n71.a(12), n71Var.f23251g);
            this.f23278h = bundle.getInt(n71.a(13), n71Var.f23252h);
            this.f23279i = bundle.getInt(n71.a(14), n71Var.f23253i);
            this.f23280j = bundle.getInt(n71.a(15), n71Var.f23254j);
            this.f23281k = bundle.getBoolean(n71.a(16), n71Var.f23255k);
            this.f23282l = com.yandex.mobile.ads.embedded.guava.collect.p.b((String[]) kf0.a(bundle.getStringArray(n71.a(17)), new String[0]));
            this.f23283m = bundle.getInt(n71.a(25), n71Var.f23257m);
            this.f23284n = a((String[]) kf0.a(bundle.getStringArray(n71.a(1)), new String[0]));
            this.f23285o = bundle.getInt(n71.a(2), n71Var.f23259o);
            this.f23286p = bundle.getInt(n71.a(18), n71Var.f23260p);
            this.f23287q = bundle.getInt(n71.a(19), n71Var.f23261q);
            this.f23288r = com.yandex.mobile.ads.embedded.guava.collect.p.b((String[]) kf0.a(bundle.getStringArray(n71.a(20)), new String[0]));
            this.f23289s = a((String[]) kf0.a(bundle.getStringArray(n71.a(3)), new String[0]));
            this.f23290t = bundle.getInt(n71.a(4), n71Var.f23264t);
            this.f23291u = bundle.getInt(n71.a(26), n71Var.f23265u);
            this.f23292v = bundle.getBoolean(n71.a(5), n71Var.f23266v);
            this.f23293w = bundle.getBoolean(n71.a(21), n71Var.f23267w);
            this.f23294x = bundle.getBoolean(n71.a(22), n71Var.f23268x);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(n71.a(23));
            com.yandex.mobile.ads.embedded.guava.collect.p pVarI = parcelableArrayList == null ? com.yandex.mobile.ads.embedded.guava.collect.p.i() : xf.a(m71.f22935c, parcelableArrayList);
            this.f23295y = new HashMap<>();
            for (int i10 = 0; i10 < pVarI.size(); i10++) {
                m71 m71Var = (m71) pVarI.get(i10);
                this.f23295y.put(m71Var.f22936a, m71Var);
            }
            int[] iArr = (int[]) kf0.a(bundle.getIntArray(n71.a(24)), new int[0]);
            this.f23296z = new HashSet<>();
            for (int i11 : iArr) {
                this.f23296z.add(Integer.valueOf(i11));
            }
        }

        private static com.yandex.mobile.ads.embedded.guava.collect.p<String> a(String[] strArr) {
            int i10 = com.yandex.mobile.ads.embedded.guava.collect.p.f18374c;
            com.yandex.mobile.ads.embedded.guava.collect.p.a aVar = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
            for (String str : strArr) {
                Objects.requireNonNull(str);
                aVar.b(da1.d(str));
            }
            return aVar.a();
        }

        public a a(int i10, int i11) {
            this.f23279i = i10;
            this.f23280j = i11;
            this.f23281k = true;
            return this;
        }

        public void a(Context context) {
            CaptioningManager captioningManager;
            int i10 = da1.f19803a;
            if (i10 >= 19) {
                if ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                    this.f23290t = 1088;
                    Locale locale = captioningManager.getLocale();
                    if (locale != null) {
                        this.f23289s = com.yandex.mobile.ads.embedded.guava.collect.p.a(da1.a(locale));
                    }
                }
            }
        }

        public void b(Context context) {
            Point pointC = da1.c(context);
            a(pointC.x, pointC.y);
        }
    }

    static {
        dp1 dp1Var = dp1.f19962u;
    }

    public n71(a aVar) {
        this.f23245a = aVar.f23271a;
        this.f23246b = aVar.f23272b;
        this.f23247c = aVar.f23273c;
        this.f23248d = aVar.f23274d;
        this.f23249e = aVar.f23275e;
        this.f23250f = aVar.f23276f;
        this.f23251g = aVar.f23277g;
        this.f23252h = aVar.f23278h;
        this.f23253i = aVar.f23279i;
        this.f23254j = aVar.f23280j;
        this.f23255k = aVar.f23281k;
        this.f23256l = aVar.f23282l;
        this.f23257m = aVar.f23283m;
        this.f23258n = aVar.f23284n;
        this.f23259o = aVar.f23285o;
        this.f23260p = aVar.f23286p;
        this.f23261q = aVar.f23287q;
        this.f23262r = aVar.f23288r;
        this.f23263s = aVar.f23289s;
        this.f23264t = aVar.f23290t;
        this.f23265u = aVar.f23291u;
        this.f23266v = aVar.f23292v;
        this.f23267w = aVar.f23293w;
        this.f23268x = aVar.f23294x;
        this.f23269y = com.yandex.mobile.ads.embedded.guava.collect.q.a(aVar.f23295y);
        this.f23270z = com.yandex.mobile.ads.embedded.guava.collect.r.a(aVar.f23296z);
    }

    public static n71 a(Bundle bundle) {
        return new n71(new a(bundle));
    }

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
        n71 n71Var = (n71) obj;
        return this.f23245a == n71Var.f23245a && this.f23246b == n71Var.f23246b && this.f23247c == n71Var.f23247c && this.f23248d == n71Var.f23248d && this.f23249e == n71Var.f23249e && this.f23250f == n71Var.f23250f && this.f23251g == n71Var.f23251g && this.f23252h == n71Var.f23252h && this.f23255k == n71Var.f23255k && this.f23253i == n71Var.f23253i && this.f23254j == n71Var.f23254j && this.f23256l.equals(n71Var.f23256l) && this.f23257m == n71Var.f23257m && this.f23258n.equals(n71Var.f23258n) && this.f23259o == n71Var.f23259o && this.f23260p == n71Var.f23260p && this.f23261q == n71Var.f23261q && this.f23262r.equals(n71Var.f23262r) && this.f23263s.equals(n71Var.f23263s) && this.f23264t == n71Var.f23264t && this.f23265u == n71Var.f23265u && this.f23266v == n71Var.f23266v && this.f23267w == n71Var.f23267w && this.f23268x == n71Var.f23268x && this.f23269y.equals(n71Var.f23269y) && this.f23270z.equals(n71Var.f23270z);
    }

    public int hashCode() {
        return this.f23270z.hashCode() + ((this.f23269y.hashCode() + ((((((((((((this.f23263s.hashCode() + ((this.f23262r.hashCode() + ((((((((this.f23258n.hashCode() + ((((this.f23256l.hashCode() + ((((((((((((((((((((((this.f23245a + 31) * 31) + this.f23246b) * 31) + this.f23247c) * 31) + this.f23248d) * 31) + this.f23249e) * 31) + this.f23250f) * 31) + this.f23251g) * 31) + this.f23252h) * 31) + (this.f23255k ? 1 : 0)) * 31) + this.f23253i) * 31) + this.f23254j) * 31)) * 31) + this.f23257m) * 31)) * 31) + this.f23259o) * 31) + this.f23260p) * 31) + this.f23261q) * 31)) * 31)) * 31) + this.f23264t) * 31) + this.f23265u) * 31) + (this.f23266v ? 1 : 0)) * 31) + (this.f23267w ? 1 : 0)) * 31) + (this.f23268x ? 1 : 0)) * 31)) * 31);
    }
}
