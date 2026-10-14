package com.yandex.metrica.impl.ob;

import android.location.Location;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1736jh extends C1662gh {
    private String A;
    private List<String> B;
    private int C;
    private long D;
    private long E;
    private boolean F;
    private long G;
    private List<String> H;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f16424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Location f16425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f16426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f16427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f16428s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f16429t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Boolean f16430u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private e f16431v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final d f16432w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f16433x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f16434y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f16435z;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jh$a */
    public static final class a extends C1587dh.a<X3.a, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f16436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Location f16437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f16438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f16439g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f16440h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f16441i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f16442j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f16443k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f16444l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Map<String, String> f16445m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f16446n;

        public a(X3.a aVar) {
            this(aVar.f15449a, aVar.f15450b, aVar.f15451c, aVar.f15452d, aVar.f15453e, aVar.f15454f, aVar.f15455g, aVar.f15456h, aVar.f15457i, aVar.f15458j, aVar.f15459k, aVar.f15460l, aVar.f15461m, aVar.f15462n);
        }

        public a(String str, String str2, String str3, String str4, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map<String, String> map, Integer num4) {
            super(str, str2, str3);
            this.f16436d = str4;
            Boolean bool5 = Boolean.FALSE;
            this.f16438f = ((Boolean) C2120ym.a(bool, bool5)).booleanValue();
            this.f16437e = location;
            this.f16439g = ((Boolean) C2120ym.a(bool2, bool5)).booleanValue();
            this.f16440h = Math.max(10, ((Integer) C2120ym.a((int) num, 10)).intValue());
            this.f16441i = ((Integer) C2120ym.a((int) num2, 7)).intValue();
            this.f16442j = ((Integer) C2120ym.a((int) num3, 90)).intValue();
            this.f16443k = ((Boolean) C2120ym.a(bool3, bool5)).booleanValue();
            this.f16444l = ((Boolean) C2120ym.a(bool4, Boolean.TRUE)).booleanValue();
            this.f16445m = map;
            this.f16446n = ((Integer) C2120ym.a((int) num4, 1000)).intValue();
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1562ch
        public Object a(Object obj) {
            X3.a aVar = (X3.a) obj;
            String str = aVar.f15449a;
            String str2 = this.f15968a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.f15450b;
            String str4 = this.f15969b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.f15451c;
            String str6 = this.f15970c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.f15452d;
            String str8 = this.f16436d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.f15453e;
            Boolean boolValueOf = Boolean.valueOf(this.f16438f);
            if (bool != null) {
                boolValueOf = bool;
            }
            Location location = aVar.f15454f;
            Location location2 = this.f16437e;
            if (location != null) {
                location2 = location;
            }
            Boolean bool2 = aVar.f15455g;
            Boolean boolValueOf2 = Boolean.valueOf(this.f16439g);
            if (bool2 != null) {
                boolValueOf2 = bool2;
            }
            Integer num = aVar.f15456h;
            Integer numValueOf = Integer.valueOf(this.f16440h);
            if (num != null) {
                numValueOf = num;
            }
            Integer num2 = aVar.f15457i;
            Integer numValueOf2 = Integer.valueOf(this.f16441i);
            if (num2 != null) {
                numValueOf2 = num2;
            }
            Integer num3 = aVar.f15458j;
            Integer numValueOf3 = Integer.valueOf(this.f16442j);
            if (num3 != null) {
                numValueOf3 = num3;
            }
            Boolean bool3 = aVar.f15459k;
            Boolean boolValueOf3 = Boolean.valueOf(this.f16443k);
            if (bool3 != null) {
                boolValueOf3 = bool3;
            }
            Boolean bool4 = aVar.f15460l;
            Boolean boolValueOf4 = Boolean.valueOf(this.f16444l);
            if (bool4 != null) {
                boolValueOf4 = bool4;
            }
            Map<String, String> map = aVar.f15461m;
            Map<String, String> map2 = this.f16445m;
            if (map != null) {
                map2 = map;
            }
            Integer num4 = aVar.f15462n;
            return new a(str2, str4, str6, str8, boolValueOf, location2, boolValueOf2, numValueOf, numValueOf2, numValueOf3, boolValueOf3, boolValueOf4, map2, num4 == null ? Integer.valueOf(this.f16446n) : num4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:123:0x01a3, code lost:
        
            if (r0.getExtras() == null) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x01a5, code lost:
        
            r8 = r0.getExtras().equals(r8.getExtras());
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x01b6, code lost:
        
            if (r8.getExtras() != null) goto L128;
         */
        @Override // com.yandex.metrica.impl.ob.InterfaceC1562ch
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 448
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C1736jh.a.b(java.lang.Object):boolean");
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jh$b */
    public static abstract class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final M2 f16447a;

        public b(M2 m10) {
            this.f16447a = m10;
        }

        @Override // com.yandex.metrica.impl.ob.C1736jh.e
        public boolean a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            return bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jh$c */
    public static class c extends C1662gh.a<C1736jh, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final C1624f4 f16448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final e f16449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C1936ri f16450f;

        public c(C1624f4 c1624f4, e eVar) {
            this(c1624f4, eVar, new C1936ri());
        }

        public c(C1624f4 c1624f4, e eVar, C1936ri c1936ri) {
            super(c1624f4.g(), c1624f4.e().b());
            this.f16448d = c1624f4;
            this.f16449e = eVar;
            this.f16450f = c1936ri;
        }

        @Override // com.yandex.metrica.impl.ob.C1587dh.b
        public C1587dh a() {
            return new C1736jh(this.f16448d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.ob.C1587dh.d
        public C1587dh a(Object obj) {
            C1587dh.c cVar = (C1587dh.c) obj;
            C1736jh c1736jhA = a(cVar);
            C1736jh.a(c1736jhA, ((a) cVar.f15974b).f16436d);
            c1736jhA.a(this.f16448d.w().c());
            c1736jhA.a(this.f16448d.d().a());
            c1736jhA.d(((a) cVar.f15974b).f16438f);
            c1736jhA.a(((a) cVar.f15974b).f16437e);
            c1736jhA.c(((a) cVar.f15974b).f16439g);
            c1736jhA.d(((a) cVar.f15974b).f16440h);
            c1736jhA.c(((a) cVar.f15974b).f16441i);
            c1736jhA.b(((a) cVar.f15974b).f16442j);
            a aVar = (a) cVar.f15974b;
            boolean z10 = aVar.f16443k;
            c1736jhA.a(Boolean.valueOf(aVar.f16444l), this.f16449e);
            c1736jhA.a(((a) cVar.f15974b).f16446n);
            Qi qi = cVar.f15973a;
            a aVar2 = (a) cVar.f15974b;
            c1736jhA.b(qi.z().contains(aVar2.f16436d) ? qi.A() : qi.H());
            c1736jhA.e(qi.f().f17338c);
            if (qi.F() != null) {
                c1736jhA.b(qi.F().f13661a);
                c1736jhA.c(qi.F().f13662b);
            }
            c1736jhA.b(qi.f().f17339d);
            c1736jhA.h(qi.o());
            c1736jhA.a(this.f16450f.a(aVar2.f16445m, qi, P0.i().e()));
            return c1736jhA;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jh$d */
    public interface d {
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jh$e */
    public interface e {
        boolean a(Boolean bool);
    }

    public C1736jh(d dVar) {
        this.f16432w = dVar;
    }

    public static void a(C1736jh c1736jh, String str) {
        c1736jh.f16433x = str;
    }

    public String C() {
        return this.f16433x;
    }

    public int D() {
        return this.C;
    }

    public List<String> E() {
        return this.H;
    }

    public String F() {
        String str = this.A;
        return str == null ? "" : str;
    }

    public boolean G() {
        return this.f16431v.a(this.f16430u);
    }

    public int H() {
        return this.f16428s;
    }

    public Location I() {
        return this.f16425p;
    }

    public int J() {
        return this.f16429t;
    }

    public long K() {
        return this.G;
    }

    public long L() {
        return this.D;
    }

    public long M() {
        return this.E;
    }

    public List<String> N() {
        return this.B;
    }

    public int O() {
        return this.f16427r;
    }

    public boolean P() {
        return this.f16435z;
    }

    public boolean Q() {
        return this.f16426q;
    }

    public boolean R() {
        return this.f16424o;
    }

    public boolean S() {
        return this.f16434y;
    }

    public boolean T() {
        return y() && !U2.b(this.B) && this.F;
    }

    public boolean U() {
        return ((C1624f4) this.f16432w).E();
    }

    public void a(int i10) {
        this.C = i10;
    }

    public void a(long j10) {
        this.G = j10;
    }

    public void a(Location location) {
        this.f16425p = location;
    }

    public void a(Boolean bool, e eVar) {
        this.f16430u = bool;
        this.f16431v = eVar;
    }

    public void a(List<String> list) {
        this.H = list;
    }

    public void a(boolean z10) {
        this.F = z10;
    }

    public void b(int i10) {
        this.f16428s = i10;
    }

    public void b(long j10) {
        this.D = j10;
    }

    public void b(List<String> list) {
        this.B = list;
    }

    public void b(boolean z10) {
        this.f16435z = z10;
    }

    public void c(int i10) {
        this.f16429t = i10;
    }

    public void c(long j10) {
        this.E = j10;
    }

    public void c(boolean z10) {
        this.f16426q = z10;
    }

    public void d(int i10) {
        this.f16427r = i10;
    }

    public void d(boolean z10) {
        this.f16424o = z10;
    }

    public void e(boolean z10) {
        this.f16434y = z10;
    }

    public void h(String str) {
        this.A = str;
    }
}
