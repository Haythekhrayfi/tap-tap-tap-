package com.applovin.exoplayer2;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v implements g {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    private int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f8195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.applovin.exoplayer2.g.a f8196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f8197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f8198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<byte[]> f8200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.applovin.exoplayer2.d.e f8201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f8202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f8203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f8205s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8206t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f8207u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f8208v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f8209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.applovin.exoplayer2.m.b f8210x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f8211y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f8212z;
    private static final v G = new a().a();
    public static final g.a<v> F = k0.f7562m;

    public static final class a {
        private int A;
        private int B;
        private int C;
        private int D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f8213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f8215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f8217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f8218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f8219g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f8220h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private com.applovin.exoplayer2.g.a f8221i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f8222j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f8223k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f8224l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<byte[]> f8225m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private com.applovin.exoplayer2.d.e f8226n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f8227o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f8228p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f8229q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f8230r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f8231s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private float f8232t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private byte[] f8233u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f8234v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private com.applovin.exoplayer2.m.b f8235w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f8236x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f8237y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f8238z;

        public a() {
            this.f8218f = -1;
            this.f8219g = -1;
            this.f8224l = -1;
            this.f8227o = RecyclerView.FOREVER_NS;
            this.f8228p = -1;
            this.f8229q = -1;
            this.f8230r = -1.0f;
            this.f8232t = 1.0f;
            this.f8234v = -1;
            this.f8236x = -1;
            this.f8237y = -1;
            this.f8238z = -1;
            this.C = -1;
            this.D = 0;
        }

        private a(v vVar) {
            this.f8213a = vVar.f8187a;
            this.f8214b = vVar.f8188b;
            this.f8215c = vVar.f8189c;
            this.f8216d = vVar.f8190d;
            this.f8217e = vVar.f8191e;
            this.f8218f = vVar.f8192f;
            this.f8219g = vVar.f8193g;
            this.f8220h = vVar.f8195i;
            this.f8221i = vVar.f8196j;
            this.f8222j = vVar.f8197k;
            this.f8223k = vVar.f8198l;
            this.f8224l = vVar.f8199m;
            this.f8225m = vVar.f8200n;
            this.f8226n = vVar.f8201o;
            this.f8227o = vVar.f8202p;
            this.f8228p = vVar.f8203q;
            this.f8229q = vVar.f8204r;
            this.f8230r = vVar.f8205s;
            this.f8231s = vVar.f8206t;
            this.f8232t = vVar.f8207u;
            this.f8233u = vVar.f8208v;
            this.f8234v = vVar.f8209w;
            this.f8235w = vVar.f8210x;
            this.f8236x = vVar.f8211y;
            this.f8237y = vVar.f8212z;
            this.f8238z = vVar.A;
            this.A = vVar.B;
            this.B = vVar.C;
            this.C = vVar.D;
            this.D = vVar.E;
        }

        public a a(float f10) {
            this.f8230r = f10;
            return this;
        }

        public a a(int i10) {
            this.f8213a = Integer.toString(i10);
            return this;
        }

        public a a(long j10) {
            this.f8227o = j10;
            return this;
        }

        public a a(com.applovin.exoplayer2.d.e eVar) {
            this.f8226n = eVar;
            return this;
        }

        public a a(com.applovin.exoplayer2.g.a aVar) {
            this.f8221i = aVar;
            return this;
        }

        public a a(com.applovin.exoplayer2.m.b bVar) {
            this.f8235w = bVar;
            return this;
        }

        public a a(String str) {
            this.f8213a = str;
            return this;
        }

        public a a(List<byte[]> list) {
            this.f8225m = list;
            return this;
        }

        public a a(byte[] bArr) {
            this.f8233u = bArr;
            return this;
        }

        public v a() {
            return new v(this);
        }

        public a b(float f10) {
            this.f8232t = f10;
            return this;
        }

        public a b(int i10) {
            this.f8216d = i10;
            return this;
        }

        public a b(String str) {
            this.f8214b = str;
            return this;
        }

        public a c(int i10) {
            this.f8217e = i10;
            return this;
        }

        public a c(String str) {
            this.f8215c = str;
            return this;
        }

        public a d(int i10) {
            this.f8218f = i10;
            return this;
        }

        public a d(String str) {
            this.f8220h = str;
            return this;
        }

        public a e(int i10) {
            this.f8219g = i10;
            return this;
        }

        public a e(String str) {
            this.f8222j = str;
            return this;
        }

        public a f(int i10) {
            this.f8224l = i10;
            return this;
        }

        public a f(String str) {
            this.f8223k = str;
            return this;
        }

        public a g(int i10) {
            this.f8228p = i10;
            return this;
        }

        public a h(int i10) {
            this.f8229q = i10;
            return this;
        }

        public a i(int i10) {
            this.f8231s = i10;
            return this;
        }

        public a j(int i10) {
            this.f8234v = i10;
            return this;
        }

        public a k(int i10) {
            this.f8236x = i10;
            return this;
        }

        public a l(int i10) {
            this.f8237y = i10;
            return this;
        }

        public a m(int i10) {
            this.f8238z = i10;
            return this;
        }

        public a n(int i10) {
            this.A = i10;
            return this;
        }

        public a o(int i10) {
            this.B = i10;
            return this;
        }

        public a p(int i10) {
            this.C = i10;
            return this;
        }

        public a q(int i10) {
            this.D = i10;
            return this;
        }
    }

    private v(a aVar) {
        this.f8187a = aVar.f8213a;
        this.f8188b = aVar.f8214b;
        this.f8189c = com.applovin.exoplayer2.l.ai.b(aVar.f8215c);
        this.f8190d = aVar.f8216d;
        this.f8191e = aVar.f8217e;
        int i10 = aVar.f8218f;
        this.f8192f = i10;
        int i11 = aVar.f8219g;
        this.f8193g = i11;
        this.f8194h = i11 != -1 ? i11 : i10;
        this.f8195i = aVar.f8220h;
        this.f8196j = aVar.f8221i;
        this.f8197k = aVar.f8222j;
        this.f8198l = aVar.f8223k;
        this.f8199m = aVar.f8224l;
        this.f8200n = aVar.f8225m == null ? Collections.emptyList() : aVar.f8225m;
        com.applovin.exoplayer2.d.e eVar = aVar.f8226n;
        this.f8201o = eVar;
        this.f8202p = aVar.f8227o;
        this.f8203q = aVar.f8228p;
        this.f8204r = aVar.f8229q;
        this.f8205s = aVar.f8230r;
        this.f8206t = aVar.f8231s == -1 ? 0 : aVar.f8231s;
        this.f8207u = aVar.f8232t == -1.0f ? 1.0f : aVar.f8232t;
        this.f8208v = aVar.f8233u;
        this.f8209w = aVar.f8234v;
        this.f8210x = aVar.f8235w;
        this.f8211y = aVar.f8236x;
        this.f8212z = aVar.f8237y;
        this.A = aVar.f8238z;
        this.B = aVar.A == -1 ? 0 : aVar.A;
        this.C = aVar.B != -1 ? aVar.B : 0;
        this.D = aVar.C;
        this.E = (aVar.D != 0 || eVar == null) ? aVar.D : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v a(Bundle bundle) {
        a aVar = new a();
        com.applovin.exoplayer2.l.c.a(bundle);
        int i10 = 0;
        String string = bundle.getString(b(0));
        v vVar = G;
        aVar.a((String) a(string, vVar.f8187a)).b((String) a(bundle.getString(b(1)), vVar.f8188b)).c((String) a(bundle.getString(b(2)), vVar.f8189c)).b(bundle.getInt(b(3), vVar.f8190d)).c(bundle.getInt(b(4), vVar.f8191e)).d(bundle.getInt(b(5), vVar.f8192f)).e(bundle.getInt(b(6), vVar.f8193g)).d((String) a(bundle.getString(b(7)), vVar.f8195i)).a((com.applovin.exoplayer2.g.a) a((com.applovin.exoplayer2.g.a) bundle.getParcelable(b(8)), vVar.f8196j)).e((String) a(bundle.getString(b(9)), vVar.f8197k)).f((String) a(bundle.getString(b(10)), vVar.f8198l)).f(bundle.getInt(b(11), vVar.f8199m));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(c(i10));
            if (byteArray == null) {
                a aVarA = aVar.a(arrayList).a((com.applovin.exoplayer2.d.e) bundle.getParcelable(b(13)));
                String strB = b(14);
                v vVar2 = G;
                aVarA.a(bundle.getLong(strB, vVar2.f8202p)).g(bundle.getInt(b(15), vVar2.f8203q)).h(bundle.getInt(b(16), vVar2.f8204r)).a(bundle.getFloat(b(17), vVar2.f8205s)).i(bundle.getInt(b(18), vVar2.f8206t)).b(bundle.getFloat(b(19), vVar2.f8207u)).a(bundle.getByteArray(b(20))).j(bundle.getInt(b(21), vVar2.f8209w)).a((com.applovin.exoplayer2.m.b) com.applovin.exoplayer2.l.c.a(com.applovin.exoplayer2.m.b.f7760e, bundle.getBundle(b(22)))).k(bundle.getInt(b(23), vVar2.f8211y)).l(bundle.getInt(b(24), vVar2.f8212z)).m(bundle.getInt(b(25), vVar2.A)).n(bundle.getInt(b(26), vVar2.B)).o(bundle.getInt(b(27), vVar2.C)).p(bundle.getInt(b(28), vVar2.D)).q(bundle.getInt(b(29), vVar2.E));
                return aVar.a();
            }
            arrayList.add(byteArray);
            i10++;
        }
    }

    private static <T> T a(T t10, T t11) {
        return t10 != null ? t10 : t11;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    private static String c(int i10) {
        return b(12) + "_" + Integer.toString(i10, 36);
    }

    public a a() {
        return new a();
    }

    public v a(int i10) {
        return a().q(i10).a();
    }

    public boolean a(v vVar) {
        if (this.f8200n.size() != vVar.f8200n.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f8200n.size(); i10++) {
            if (!Arrays.equals(this.f8200n.get(i10), vVar.f8200n.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int b() {
        int i10;
        int i11 = this.f8203q;
        if (i11 == -1 || (i10 = this.f8204r) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        int i11 = this.H;
        if (i11 == 0 || (i10 = vVar.H) == 0 || i11 == i10) {
            return this.f8190d == vVar.f8190d && this.f8191e == vVar.f8191e && this.f8192f == vVar.f8192f && this.f8193g == vVar.f8193g && this.f8199m == vVar.f8199m && this.f8202p == vVar.f8202p && this.f8203q == vVar.f8203q && this.f8204r == vVar.f8204r && this.f8206t == vVar.f8206t && this.f8209w == vVar.f8209w && this.f8211y == vVar.f8211y && this.f8212z == vVar.f8212z && this.A == vVar.A && this.B == vVar.B && this.C == vVar.C && this.D == vVar.D && this.E == vVar.E && Float.compare(this.f8205s, vVar.f8205s) == 0 && Float.compare(this.f8207u, vVar.f8207u) == 0 && com.applovin.exoplayer2.l.ai.a((Object) this.f8187a, (Object) vVar.f8187a) && com.applovin.exoplayer2.l.ai.a((Object) this.f8188b, (Object) vVar.f8188b) && com.applovin.exoplayer2.l.ai.a((Object) this.f8195i, (Object) vVar.f8195i) && com.applovin.exoplayer2.l.ai.a((Object) this.f8197k, (Object) vVar.f8197k) && com.applovin.exoplayer2.l.ai.a((Object) this.f8198l, (Object) vVar.f8198l) && com.applovin.exoplayer2.l.ai.a((Object) this.f8189c, (Object) vVar.f8189c) && Arrays.equals(this.f8208v, vVar.f8208v) && com.applovin.exoplayer2.l.ai.a(this.f8196j, vVar.f8196j) && com.applovin.exoplayer2.l.ai.a(this.f8210x, vVar.f8210x) && com.applovin.exoplayer2.l.ai.a(this.f8201o, vVar.f8201o) && a(vVar);
        }
        return false;
    }

    public int hashCode() {
        if (this.H == 0) {
            String str = this.f8187a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f8188b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f8189c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f8190d) * 31) + this.f8191e) * 31) + this.f8192f) * 31) + this.f8193g) * 31;
            String str4 = this.f8195i;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            com.applovin.exoplayer2.g.a aVar = this.f8196j;
            int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.f8197k;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f8198l;
            this.H = ((((((((((((((((Float.floatToIntBits(this.f8207u) + ((((Float.floatToIntBits(this.f8205s) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f8199m) * 31) + ((int) this.f8202p)) * 31) + this.f8203q) * 31) + this.f8204r) * 31)) * 31) + this.f8206t) * 31)) * 31) + this.f8209w) * 31) + this.f8211y) * 31) + this.f8212z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E;
        }
        return this.H;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Format(");
        sbA.append(this.f8187a);
        sbA.append(", ");
        sbA.append(this.f8188b);
        sbA.append(", ");
        sbA.append(this.f8197k);
        sbA.append(", ");
        sbA.append(this.f8198l);
        sbA.append(", ");
        sbA.append(this.f8195i);
        sbA.append(", ");
        sbA.append(this.f8194h);
        sbA.append(", ");
        sbA.append(this.f8189c);
        sbA.append(", [");
        sbA.append(this.f8203q);
        sbA.append(", ");
        sbA.append(this.f8204r);
        sbA.append(", ");
        sbA.append(this.f8205s);
        sbA.append("], [");
        sbA.append(this.f8211y);
        sbA.append(", ");
        return android.support.v4.media.b.a(sbA, this.f8212z, "])");
    }
}
