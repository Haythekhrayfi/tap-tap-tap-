package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1549c4 f15017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pi f15018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Qi.b f15019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile K2 f15020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Gi f15021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Om f15022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Q f15023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1936ri f15024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final F3 f15025i;

    public class a implements uc.a<Q> {
        public a() {
        }

        @Override // uc.a
        public Q invoke() {
            return Si.this.f15023g;
        }
    }

    public Si(Context context, C1549c4 c1549c4, Pi pi, Qi.b bVar, Qi qi, C2015um c2015um, Gi gi, Om om, Q q10, C1936ri c1936ri, Ej ej, F3 f10) {
        this.f15017a = c1549c4;
        this.f15018b = pi;
        this.f15019c = bVar;
        this.f15021e = gi;
        this.f15022f = om;
        this.f15023g = q10;
        this.f15024h = c1936ri;
        this.f15025i = f10;
        a(c2015um, ej, qi);
    }

    private Si(Context context, C1549c4 c1549c4, C1761kh.b bVar, Pi pi, Qi.b bVar2, Qi qi, C2015um c2015um, Om om, Q q10, C1936ri c1936ri, F3 f10) {
        this(context, c1549c4, pi, bVar2, qi, c2015um, new Gi(new C1761kh.c(context, c1549c4.b()), qi, bVar), om, q10, c1936ri, Fj.a(context).a(context, new Jj(bVar2)), f10);
    }

    private Si(Context context, C1549c4 c1549c4, C1761kh.b bVar, Pi pi, Qi.b bVar2, C2015um c2015um, Om om, Q q10, C1936ri c1936ri, F3 f10) {
        this(context, c1549c4, bVar, pi, bVar2, bVar2.a(), c2015um, om, q10, c1936ri, f10);
    }

    public Si(Context context, String str, C1761kh.b bVar, Pi pi) {
        this(context, new Y3(str), bVar, pi, new Qi.b(context), new C2015um(context), new Nm(), P0.i().e(), new C1936ri(), F3.a());
    }

    private void a(Qi qi) {
        ArrayList arrayList;
        Pi pi = this.f15018b;
        String strB = this.f15017a.b();
        Fi.a aVar = (Fi.a) pi;
        synchronized (Fi.this.f14010b) {
            Fi.this.f14011c = qi;
            Collection collectionA = Fi.this.f14009a.a(strB);
            arrayList = collectionA == null ? new ArrayList() : new ArrayList(collectionA);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Li) it.next()).a(qi);
        }
    }

    private void a(C2015um c2015um, Ej ej, Qi qi) {
        Qi.a aVarA = qi.a();
        if (!Oi.a(qi.V())) {
            aVarA = aVarA.l(ej.a().f16160a);
        }
        String strA = c2015um.a();
        if (!Oi.a(qi.i())) {
            aVarA = aVarA.c(strA).e("");
        }
        if (!Oi.a(qi.j())) {
            aVarA = aVarA.d(strA);
        }
        Qi qiA = aVarA.a();
        b(qiA);
        a(qiA);
    }

    private synchronized void b(Qi qi) {
        this.f15021e.a(qi);
        this.f15019c.a(qi);
        P0.i().a(qi);
        this.f15025i.a((H3) new K3(this.f15017a.b(), qi));
    }

    public Qi a(C2042vj c2042vj, C1761kh c1761kh, Long l10) {
        String strC = C2120ym.c(c1761kh.D());
        Map<String, String> mapB = c1761kh.C().b();
        String strN = c2042vj.n();
        String strO = this.f15021e.d().o();
        if (!C2120ym.d(C2120ym.a(strN))) {
            strN = C2120ym.d(C2120ym.a(strO)) ? strO : null;
        }
        String strI = this.f15021e.d().i();
        if (TextUtils.isEmpty(strI)) {
            strI = c2042vj.i();
        }
        Qi qiD = this.f15021e.d();
        Qi.a aVarI = new Qi.a(new Ri.b(c2042vj.e())).c(strI).e(c2042vj.h()).c(this.f15022f.b()).d(qiD.j()).l(qiD.V()).g(c2042vj.o()).c(c2042vj.F()).b(c1761kh.K()).i(c2042vj.x()).e(c2042vj.r()).j(c2042vj.w()).k(c2042vj.C()).a(c2042vj.d()).a(c2042vj.j()).g(c2042vj.t()).a(c2042vj.g()).f(strN).i(strC);
        Objects.requireNonNull(this.f15024h);
        Map<String, String> mapA = C2120ym.a(strN);
        Qi.a aVarA = aVarI.c(U2.b(mapB) ? U2.b(mapA) : mapA.equals(mapB)).h(C2120ym.c(mapB)).a(c2042vj.D()).d(c2042vj.q()).a(c2042vj.N()).j(c2042vj.y()).b(c2042vj.f()).a(c2042vj.v()).h(c2042vj.u()).a(c2042vj.B()).a(c2042vj.G()).a(true);
        Long lValueOf = Long.valueOf((System.currentTimeMillis() / 1000) * 1000);
        if (l10 != null) {
            lValueOf = l10;
        }
        return aVarA.b(lValueOf.longValue()).a(this.f15021e.b().a(l10.longValue())).b(false).a(c2042vj.p()).a(c2042vj.A()).a(c2042vj.K()).b(c2042vj.J()).c(c2042vj.L()).a(c2042vj.I()).a(c2042vj.H()).a(c2042vj.c()).a(c2042vj.k()).f(c2042vj.s()).a(c2042vj.b()).a(c2042vj.a()).a(c2042vj.l()).a(c2042vj.m()).a(c2042vj.E()).a();
    }

    public C1549c4 a() {
        return this.f15017a;
    }

    public void a(Hi hi) {
        ArrayList arrayList;
        synchronized (this) {
            this.f15020d = null;
        }
        Pi pi = this.f15018b;
        String strB = this.f15017a.b();
        Qi qiD = this.f15021e.d();
        Fi.a aVar = (Fi.a) pi;
        synchronized (Fi.this.f14010b) {
            Collection collectionA = Fi.this.f14009a.a(strB);
            arrayList = collectionA == null ? new ArrayList() : new ArrayList(collectionA);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Li) it.next()).a(hi, qiD);
        }
    }

    public synchronized void a(C1761kh.b bVar) {
        this.f15021e.a(bVar);
        C1761kh c1761khB = this.f15021e.b();
        if (c1761khB.L()) {
            boolean z10 = false;
            List<String> listH = c1761khB.H();
            boolean z11 = true;
            Qi.a aVarB = null;
            if (U2.b(listH) && !U2.b(c1761khB.K())) {
                aVarB = this.f15021e.d().a().b((List<String>) null);
                z10 = true;
            }
            if (U2.b(listH) || U2.a(listH, c1761khB.K())) {
                z11 = z10;
            } else {
                aVarB = this.f15021e.d().a().b(listH);
            }
            if (z11) {
                Qi qiA = aVarB.a();
                b(qiA);
                a(qiA);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    public void a(C2042vj c2042vj, C1761kh c1761kh, Map<String, List<String>> map) {
        Long lValueOf;
        Qi qiA;
        synchronized (this) {
            if (U2.b(map)) {
                lValueOf = null;
            } else {
                List<String> list = map.get("Date");
                if (U2.b(list)) {
                    lValueOf = null;
                } else {
                    try {
                        lValueOf = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse(list.get(0)).getTime());
                    } catch (Throwable unused) {
                        lValueOf = null;
                    }
                }
            }
            if (lValueOf == null) {
                lValueOf = 0L;
            }
            Lm.c().a(lValueOf.longValue(), c2042vj.M());
            qiA = a(c2042vj, c1761kh, lValueOf);
            synchronized (this) {
                this.f15020d = null;
            }
            a(qiA);
        }
        b(qiA);
        a(qiA);
    }

    public synchronized boolean a(List<String> list, Map<String, String> map) {
        return !Oi.a(this.f15021e.d(), list, map, new a());
    }

    public synchronized K2 b() {
        if (!d()) {
            return null;
        }
        if (this.f15020d == null) {
            this.f15020d = new K2(this, this.f15021e.b());
        }
        return this.f15020d;
    }

    public Qi c() {
        return this.f15021e.d();
    }

    public synchronized boolean d() {
        boolean zB;
        Qi qiD = this.f15021e.d();
        zB = Oi.b(qiD);
        if (!zB && !((zB = !Oi.a(qiD))) && !this.f15024h.a(this.f15021e.b().D(), qiD, this.f15023g)) {
            zB = true;
        }
        return zB;
    }
}
