package com.applovin.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class ba implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ba f4673a = new ba() { // from class: com.applovin.exoplayer2.ba.1
        @Override // com.applovin.exoplayer2.ba
        public a a(int i10, a aVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.exoplayer2.ba
        public c a(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.exoplayer2.ba
        public Object a(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.exoplayer2.ba
        public int b() {
            return 0;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c() {
            return 0;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c(Object obj) {
            return -1;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g.a<ba> f4674b = com.applovin.exoplayer2.a.p.f3995k;

    public static final class a implements g {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final g.a<a> f4675g = k0.f7560k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f4676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f4677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f4679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f4680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f4681f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.applovin.exoplayer2.h.a.a f4682h = com.applovin.exoplayer2.h.a.a.f6468a;

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            int i10 = bundle.getInt(g(0), 0);
            long j10 = bundle.getLong(g(1), -9223372036854775807L);
            long j11 = bundle.getLong(g(2), 0L);
            boolean z10 = bundle.getBoolean(g(3));
            Bundle bundle2 = bundle.getBundle(g(4));
            com.applovin.exoplayer2.h.a.a aVar = bundle2 != null ? (com.applovin.exoplayer2.h.a.a) com.applovin.exoplayer2.h.a.a.f6469g.fromBundle(bundle2) : com.applovin.exoplayer2.h.a.a.f6468a;
            a aVar2 = new a();
            aVar2.a(null, null, i10, j10, j11, aVar, z10);
            return aVar2;
        }

        private static String g(int i10) {
            return Integer.toString(i10, 36);
        }

        public int a(int i10, int i11) {
            return this.f4682h.a(i10).a(i11);
        }

        public int a(long j10) {
            return this.f4682h.a(j10, this.f4679d);
        }

        public long a() {
            return this.f4679d;
        }

        public long a(int i10) {
            return this.f4682h.a(i10).f6478a;
        }

        public a a(Object obj, Object obj2, int i10, long j10, long j11) {
            return a(obj, obj2, i10, j10, j11, com.applovin.exoplayer2.h.a.a.f6468a, false);
        }

        public a a(Object obj, Object obj2, int i10, long j10, long j11, com.applovin.exoplayer2.h.a.a aVar, boolean z10) {
            this.f4676a = obj;
            this.f4677b = obj2;
            this.f4678c = i10;
            this.f4679d = j10;
            this.f4680e = j11;
            this.f4682h = aVar;
            this.f4681f = z10;
            return this;
        }

        public int b(int i10) {
            return this.f4682h.a(i10).a();
        }

        public int b(long j10) {
            return this.f4682h.b(j10, this.f4679d);
        }

        public long b() {
            return h.a(this.f4680e);
        }

        public long b(int i10, int i11) {
            com.applovin.exoplayer2.h.a.a.C0093a c0093aA = this.f4682h.a(i10);
            if (c0093aA.f6479b != -1) {
                return c0093aA.f6482e[i11];
            }
            return -9223372036854775807L;
        }

        public long c() {
            return this.f4680e;
        }

        public boolean c(int i10) {
            return !this.f4682h.a(i10).c();
        }

        public int d() {
            return this.f4682h.f6472c;
        }

        public int d(int i10) {
            return this.f4682h.a(i10).f6479b;
        }

        public int e() {
            return this.f4682h.f6475f;
        }

        public boolean e(int i10) {
            return this.f4682h.a(i10).f6484g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !a.class.equals(obj.getClass())) {
                return false;
            }
            a aVar = (a) obj;
            return com.applovin.exoplayer2.l.ai.a(this.f4676a, aVar.f4676a) && com.applovin.exoplayer2.l.ai.a(this.f4677b, aVar.f4677b) && this.f4678c == aVar.f4678c && this.f4679d == aVar.f4679d && this.f4680e == aVar.f4680e && this.f4681f == aVar.f4681f && com.applovin.exoplayer2.l.ai.a(this.f4682h, aVar.f4682h);
        }

        public long f() {
            return this.f4682h.f6473d;
        }

        public long f(int i10) {
            return this.f4682h.a(i10).f6483f;
        }

        public int hashCode() {
            Object obj = this.f4676a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f4677b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f4678c) * 31;
            long j10 = this.f4679d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f4680e;
            return this.f4682h.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f4681f ? 1 : 0)) * 31);
        }
    }

    public static final class b extends ba {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.applovin.exoplayer2.common.a.s<c> f4683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.applovin.exoplayer2.common.a.s<a> f4684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f4685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f4686f;

        public b(com.applovin.exoplayer2.common.a.s<c> sVar, com.applovin.exoplayer2.common.a.s<a> sVar2, int[] iArr) {
            com.applovin.exoplayer2.l.a.a(sVar.size() == iArr.length);
            this.f4683c = sVar;
            this.f4684d = sVar2;
            this.f4685e = iArr;
            this.f4686f = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f4686f[iArr[i10]] = i10;
            }
        }

        @Override // com.applovin.exoplayer2.ba
        public int a(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != a(z10)) {
                return z10 ? this.f4685e[this.f4686f[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return b(z10);
            }
            return -1;
        }

        @Override // com.applovin.exoplayer2.ba
        public int a(boolean z10) {
            if (d()) {
                return -1;
            }
            return z10 ? this.f4685e[b() - 1] : b() - 1;
        }

        @Override // com.applovin.exoplayer2.ba
        public a a(int i10, a aVar, boolean z10) {
            a aVar2 = this.f4684d.get(i10);
            aVar.a(aVar2.f4676a, aVar2.f4677b, aVar2.f4678c, aVar2.f4679d, aVar2.f4680e, aVar2.f4682h, aVar2.f4681f);
            return aVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public c a(int i10, c cVar, long j10) {
            c cVar2 = this.f4683c.get(i10);
            cVar.a(cVar2.f4691b, cVar2.f4693d, cVar2.f4694e, cVar2.f4695f, cVar2.f4696g, cVar2.f4697h, cVar2.f4698i, cVar2.f4699j, cVar2.f4701l, cVar2.f4703n, cVar2.f4704o, cVar2.f4705p, cVar2.f4706q, cVar2.f4707r);
            cVar.f4702m = cVar2.f4702m;
            return cVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public Object a(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.applovin.exoplayer2.ba
        public int b() {
            return this.f4683c.size();
        }

        @Override // com.applovin.exoplayer2.ba
        public int b(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != b(z10)) {
                return z10 ? this.f4685e[this.f4686f[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return a(z10);
            }
            return -1;
        }

        @Override // com.applovin.exoplayer2.ba
        public int b(boolean z10) {
            if (d()) {
                return -1;
            }
            if (z10) {
                return this.f4685e[0];
            }
            return 0;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c() {
            return this.f4684d.size();
        }

        @Override // com.applovin.exoplayer2.ba
        public int c(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class c implements g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public Object f4692c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f4694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f4695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f4696g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f4697h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f4698i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f4699j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        public boolean f4700k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ab.e f4701l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f4702m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f4703n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f4704o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f4705p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f4706q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f4707r;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f4687a = new Object();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final Object f4689t = new Object();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final ab f4690u = new ab.b().a("com.applovin.exoplayer2.Timeline").a(Uri.EMPTY).a();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final g.a<c> f4688s = com.applovin.exoplayer2.a.p.f3996l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f4691b = f4687a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ab f4693d = f4690u;

        /* JADX INFO: Access modifiers changed from: private */
        public static c a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(a(1));
            ab abVar = bundle2 != null ? (ab) ab.f4046g.fromBundle(bundle2) : null;
            long j10 = bundle.getLong(a(2), -9223372036854775807L);
            long j11 = bundle.getLong(a(3), -9223372036854775807L);
            long j12 = bundle.getLong(a(4), -9223372036854775807L);
            boolean z10 = bundle.getBoolean(a(5), false);
            boolean z11 = bundle.getBoolean(a(6), false);
            Bundle bundle3 = bundle.getBundle(a(7));
            ab.e eVar = bundle3 != null ? (ab.e) ab.e.f4093g.fromBundle(bundle3) : null;
            boolean z12 = bundle.getBoolean(a(8), false);
            long j13 = bundle.getLong(a(9), 0L);
            long j14 = bundle.getLong(a(10), -9223372036854775807L);
            int i10 = bundle.getInt(a(11), 0);
            int i11 = bundle.getInt(a(12), 0);
            long j15 = bundle.getLong(a(13), 0L);
            c cVar = new c();
            cVar.a(f4689t, abVar, null, j10, j11, j12, z10, z11, eVar, j13, j14, i10, i11, j15);
            cVar.f4702m = z12;
            return cVar;
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }

        public long a() {
            return h.a(this.f4703n);
        }

        public c a(Object obj, ab abVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, ab.e eVar, long j13, long j14, int i10, int i11, long j15) {
            ab.f fVar;
            this.f4691b = obj;
            this.f4693d = abVar != null ? abVar : f4690u;
            this.f4692c = (abVar == null || (fVar = abVar.f4048c) == null) ? null : fVar.f4111h;
            this.f4694e = obj2;
            this.f4695f = j10;
            this.f4696g = j11;
            this.f4697h = j12;
            this.f4698i = z10;
            this.f4699j = z11;
            this.f4700k = eVar != null;
            this.f4701l = eVar;
            this.f4703n = j13;
            this.f4704o = j14;
            this.f4705p = i10;
            this.f4706q = i11;
            this.f4707r = j15;
            this.f4702m = false;
            return this;
        }

        public long b() {
            return this.f4703n;
        }

        public long c() {
            return h.a(this.f4704o);
        }

        public long d() {
            return com.applovin.exoplayer2.l.ai.c(this.f4697h);
        }

        public boolean e() {
            com.applovin.exoplayer2.l.a.b(this.f4700k == (this.f4701l != null));
            return this.f4701l != null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return com.applovin.exoplayer2.l.ai.a(this.f4691b, cVar.f4691b) && com.applovin.exoplayer2.l.ai.a(this.f4693d, cVar.f4693d) && com.applovin.exoplayer2.l.ai.a(this.f4694e, cVar.f4694e) && com.applovin.exoplayer2.l.ai.a(this.f4701l, cVar.f4701l) && this.f4695f == cVar.f4695f && this.f4696g == cVar.f4696g && this.f4697h == cVar.f4697h && this.f4698i == cVar.f4698i && this.f4699j == cVar.f4699j && this.f4702m == cVar.f4702m && this.f4703n == cVar.f4703n && this.f4704o == cVar.f4704o && this.f4705p == cVar.f4705p && this.f4706q == cVar.f4706q && this.f4707r == cVar.f4707r;
        }

        public int hashCode() {
            int iHashCode = (this.f4693d.hashCode() + ((this.f4691b.hashCode() + 217) * 31)) * 31;
            Object obj = this.f4694e;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            ab.e eVar = this.f4701l;
            int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            long j10 = this.f4695f;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f4696g;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f4697h;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f4698i ? 1 : 0)) * 31) + (this.f4699j ? 1 : 0)) * 31) + (this.f4702m ? 1 : 0)) * 31;
            long j13 = this.f4703n;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f4704o;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f4705p) * 31) + this.f4706q) * 31;
            long j15 = this.f4707r;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ba a(Bundle bundle) {
        com.applovin.exoplayer2.common.a.s sVarA = a(c.f4688s, com.applovin.exoplayer2.l.b.a(bundle, b(0)));
        com.applovin.exoplayer2.common.a.s sVarA2 = a(a.f4675g, com.applovin.exoplayer2.l.b.a(bundle, b(1)));
        int[] intArray = bundle.getIntArray(b(2));
        if (intArray == null) {
            intArray = c(sVarA.size());
        }
        return new b(sVarA, sVarA2, intArray);
    }

    private static <T extends g> com.applovin.exoplayer2.common.a.s<T> a(g.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return com.applovin.exoplayer2.common.a.s.g();
        }
        com.applovin.exoplayer2.common.a.s.a aVar2 = new com.applovin.exoplayer2.common.a.s.a();
        com.applovin.exoplayer2.common.a.s<Bundle> sVarA = f.a(iBinder);
        for (int i10 = 0; i10 < sVarA.size(); i10++) {
            aVar2.a(aVar.fromBundle(sVarA.get(i10)));
        }
        return aVar2.a();
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    private static int[] c(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public int a(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? b(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final int a(int i10, a aVar, c cVar, int i11, boolean z10) {
        int i12 = a(i10, aVar).f4678c;
        if (a(i12, cVar).f4706q != i10) {
            return i10 + 1;
        }
        int iA = a(i12, i11, z10);
        if (iA == -1) {
            return -1;
        }
        return a(iA, cVar).f4705p;
    }

    public int a(boolean z10) {
        if (d()) {
            return -1;
        }
        return b() - 1;
    }

    public final Pair<Object, Long> a(c cVar, a aVar, int i10, long j10) {
        return (Pair) com.applovin.exoplayer2.l.a.b(a(cVar, aVar, i10, j10, 0L));
    }

    public final Pair<Object, Long> a(c cVar, a aVar, int i10, long j10, long j11) {
        com.applovin.exoplayer2.l.a.a(i10, 0, b());
        a(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.b();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f4705p;
        a(i11, aVar);
        while (i11 < cVar.f4706q && aVar.f4680e != j10) {
            int i12 = i11 + 1;
            if (a(i12, aVar).f4680e > j10) {
                break;
            }
            i11 = i12;
        }
        a(i11, aVar, true);
        long jMin = j10 - aVar.f4680e;
        long j12 = aVar.f4679d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(com.applovin.exoplayer2.l.a.b(aVar.f4677b), Long.valueOf(Math.max(0L, jMin)));
    }

    public final a a(int i10, a aVar) {
        return a(i10, aVar, false);
    }

    public abstract a a(int i10, a aVar, boolean z10);

    public a a(Object obj, a aVar) {
        return a(c(obj), aVar, true);
    }

    public final c a(int i10, c cVar) {
        return a(i10, cVar, 0L);
    }

    public abstract c a(int i10, c cVar, long j10);

    public abstract Object a(int i10);

    public abstract int b();

    public int b(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == b(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == b(z10) ? a(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public int b(boolean z10) {
        return d() ? -1 : 0;
    }

    public final boolean b(int i10, a aVar, c cVar, int i11, boolean z10) {
        return a(i10, aVar, cVar, i11, z10) == -1;
    }

    public abstract int c();

    public abstract int c(Object obj);

    public final boolean d() {
        return b() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        if (baVar.b() != b() || baVar.c() != c()) {
            return false;
        }
        c cVar = new c();
        a aVar = new a();
        c cVar2 = new c();
        a aVar2 = new a();
        for (int i10 = 0; i10 < b(); i10++) {
            if (!a(i10, cVar).equals(baVar.a(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < c(); i11++) {
            if (!a(i11, aVar, true).equals(baVar.a(i11, aVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10;
        c cVar = new c();
        a aVar = new a();
        int iB = b() + 217;
        int i11 = 0;
        while (true) {
            i10 = iB * 31;
            if (i11 >= b()) {
                break;
            }
            iB = i10 + a(i11, cVar).hashCode();
            i11++;
        }
        int iC = c() + i10;
        for (int i12 = 0; i12 < c(); i12++) {
            iC = (iC * 31) + a(i12, aVar, true).hashCode();
        }
        return iC;
    }
}
