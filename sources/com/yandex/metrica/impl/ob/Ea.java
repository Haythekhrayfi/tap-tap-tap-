package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Ea implements Object<Ri, C1760kg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1953sa f13874a = new C1953sa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C2003ua f13875b = new C2003ua();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Da f13876c = new Da();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2083xa f13877d = new C2083xa();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2133za f13878e = new C2133za();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C1754ka f13879f = new C1754ka();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2028va f13880g = new C2028va();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Ga f13881h = new Ga();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Ba f13882i = new Ba();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C1879pa f13883j = new C1879pa();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Ka f13884k = new Ka();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Ja f13885l = new Ja();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Z9 f13886m = new Z9();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Ha f13887n = new Ha();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C1555ca f13888o = new C1555ca();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C1680ha f13889p = new C1680ha();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Y9 f13890q = new Y9();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C1705ia f13891r = new C1705ia();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C1729ja f13892s = new C1729ja();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C1630fa f13893t = new C1630fa();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Fa f13894u = new Fa();

    public Object a(Object obj) {
        C1760kg c1760kg = (C1760kg) obj;
        Ri.b bVarA = new Ri.b(this.f13879f.a(c1760kg.f16591l)).l(c1760kg.f16581b).c(c1760kg.A).d(c1760kg.C).e(c1760kg.B).f(c1760kg.f16596q).g(c1760kg.f16584e).i(Arrays.asList(c1760kg.f16583d)).e(Arrays.asList(c1760kg.f16586g)).b(Arrays.asList(c1760kg.f16588i)).c(Arrays.asList(c1760kg.f16587h)).j(c1760kg.f16585f).k(c1760kg.D).a(c1760kg.E).a(Arrays.asList(c1760kg.f16601v)).g(Arrays.asList(c1760kg.f16589j)).i(c1760kg.f16597r).h(c1760kg.f16598s).c(c1760kg.f16599t).c(c1760kg.f16582c).a(c1760kg.f16603x);
        C1760kg.n[] nVarArr = c1760kg.f16595p;
        ArrayList arrayList = new ArrayList(nVarArr.length);
        int i10 = 0;
        for (C1760kg.n nVar : nVarArr) {
            arrayList.add(this.f13878e.a(nVar));
        }
        Ri.b bVarA2 = bVarA.j(arrayList).b(c1760kg.F).a(c1760kg.G).b(c1760kg.f16600u).b(c1760kg.H).a(new Ci(c1760kg.K, c1760kg.L)).f(Arrays.asList(c1760kg.T)).a(this.f13893t.a(c1760kg.f16590k));
        if (c1760kg.f16592m != null) {
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                C1760kg.k[] kVarArr = c1760kg.f16592m;
                if (i10 >= kVarArr.length) {
                    break;
                }
                arrayList2.add(this.f13874a.a(kVarArr[i10]));
                i10++;
            }
            bVarA2.d(arrayList2);
        }
        C1760kg.y yVar = c1760kg.f16593n;
        if (yVar != null) {
            bVarA2.a(this.f13875b.a(yVar));
        }
        C1760kg.p pVar = c1760kg.f16594o;
        if (pVar != null) {
            bVarA2.a(this.f13876c.a(pVar));
        }
        C1760kg.m mVar = c1760kg.I;
        if (mVar != null) {
            Objects.requireNonNull(this.f13877d);
            bVarA2.a(new Ai(mVar.f16693b, mVar.f16694c));
        }
        C1760kg.l[] lVarArr = c1760kg.f16604y;
        if (lVarArr != null) {
            bVarA2.h(this.f13880g.a(lVarArr));
        }
        C1760kg.o oVar = c1760kg.f16605z;
        if (oVar != null) {
            bVarA2.a(this.f13882i.a(oVar));
        }
        C1760kg.r rVar = c1760kg.f16602w;
        if (rVar != null) {
            bVarA2.a(this.f13881h.a(rVar));
        }
        C1760kg.j jVar = c1760kg.J;
        if (jVar != null) {
            bVarA2.a(this.f13883j.a(jVar));
        }
        C1760kg.v vVar = c1760kg.M;
        if (vVar != null) {
            bVarA2.a(this.f13884k.a(vVar));
        }
        C1760kg.u uVar = c1760kg.O;
        if (uVar != null) {
            bVarA2.b(this.f13885l.a(uVar));
        }
        C1760kg.u uVar2 = c1760kg.P;
        if (uVar2 != null) {
            bVarA2.c(this.f13885l.a(uVar2));
        }
        C1760kg.u uVar3 = c1760kg.N;
        if (uVar3 != null) {
            bVarA2.a(this.f13885l.a(uVar3));
        }
        C1760kg.b bVar = c1760kg.U;
        if (bVar != null) {
            bVarA2.a(this.f13886m.a(bVar));
        }
        C1760kg.s sVar = c1760kg.Q;
        if (sVar != null) {
            bVarA2.a(this.f13887n.a(sVar));
        }
        C1760kg.c cVar = c1760kg.R;
        if (cVar != null) {
            bVarA2.a(this.f13888o.a(cVar));
        }
        C1760kg.f fVar = c1760kg.S;
        if (fVar != null) {
            bVarA2.a(this.f13889p.a(fVar));
        }
        C1760kg.a aVar = c1760kg.V;
        if (aVar != null) {
            bVarA2.a(this.f13890q.a(aVar));
        }
        C1760kg.h hVar = c1760kg.W;
        if (hVar != null) {
            bVarA2.a(this.f13892s.a(hVar));
        }
        C1760kg.g gVar = c1760kg.X;
        if (gVar != null) {
            bVarA2.a(this.f13891r.a(gVar));
        }
        C1760kg.q qVar = c1760kg.Y;
        if (qVar != null) {
            bVarA2.a(this.f13894u.a(qVar));
        }
        return bVarA2.a();
    }

    public Object b(Object obj) {
        Ri ri = (Ri) obj;
        C1760kg c1760kg = new C1760kg();
        c1760kg.F = ri.I;
        c1760kg.G = ri.J;
        c1760kg.f16592m = new C1760kg.k[ri.f14947t.size()];
        Iterator<Wc> it = ri.f14947t.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            c1760kg.f16592m[i11] = this.f13874a.b(it.next());
            i11++;
        }
        String str = ri.f14928a;
        if (str != null) {
            c1760kg.f16581b = str;
        }
        String str2 = ri.f14929b;
        if (str2 != null) {
            c1760kg.A = str2;
        }
        String str3 = ri.f14930c;
        if (str3 != null) {
            c1760kg.C = str3;
        }
        String str4 = ri.f14931d;
        if (str4 != null) {
            c1760kg.B = str4;
        }
        List<String> list = ri.f14938k;
        if (list != null) {
            c1760kg.f16587h = (String[]) list.toArray(new String[list.size()]);
        }
        List<String> list2 = ri.f14939l;
        if (list2 != null) {
            c1760kg.f16588i = (String[]) list2.toArray(new String[list2.size()]);
        }
        List<String> list3 = ri.f14932e;
        if (list3 != null) {
            c1760kg.f16583d = (String[]) list3.toArray(new String[list3.size()]);
        }
        List<String> list4 = ri.f14937j;
        if (list4 != null) {
            c1760kg.f16586g = (String[]) list4.toArray(new String[list4.size()]);
        }
        List<String> list5 = ri.f14940m;
        if (list5 != null) {
            c1760kg.f16601v = (String[]) list5.toArray(new String[list5.size()]);
        }
        List<String> list6 = ri.f14941n;
        if (list6 != null) {
            c1760kg.f16589j = (String[]) list6.toArray(new String[list6.size()]);
        }
        Map<String, List<String>> map = ri.f14942o;
        if (map != null) {
            c1760kg.f16590k = this.f13893t.a((Map<String, ? extends List<String>>) map);
        }
        Ed ed2 = ri.f14948u;
        if (ed2 != null) {
            c1760kg.f16593n = this.f13875b.b(ed2);
        }
        Ei ei = ri.f14949v;
        if (ei != null) {
            c1760kg.f16594o = this.f13876c.b(ei);
        }
        Ai ai = ri.C;
        if (ai != null) {
            Objects.requireNonNull(this.f13877d);
            C1760kg.m mVar = new C1760kg.m();
            mVar.f16693b = ai.f13661a;
            mVar.f16694c = ai.f13662b;
            c1760kg.I = mVar;
        }
        String str5 = ri.f14943p;
        if (str5 != null) {
            c1760kg.f16596q = str5;
        }
        String str6 = ri.f14933f;
        if (str6 != null) {
            c1760kg.f16584e = str6;
        }
        String str7 = ri.f14934g;
        if (str7 != null) {
            c1760kg.f16585f = str7;
        }
        String str8 = ri.f14935h;
        if (str8 != null) {
            c1760kg.D = str8;
        }
        String str9 = ri.f14936i;
        if (str9 != null) {
            c1760kg.E = str9;
        }
        c1760kg.f16591l = this.f13879f.b(ri.f14946s);
        String str10 = ri.f14944q;
        if (str10 != null) {
            c1760kg.f16597r = str10;
        }
        String str11 = ri.f14945r;
        if (str11 != null) {
            c1760kg.f16598s = str11;
        }
        c1760kg.f16599t = ri.f14952y;
        c1760kg.f16582c = ri.f14950w;
        c1760kg.f16603x = ri.f14951x;
        Ci ci = ri.G;
        c1760kg.K = ci.f13775a;
        c1760kg.L = ci.f13776b;
        List<Bi> list7 = ri.f14953z;
        if (list7 != null) {
            C1760kg.n[] nVarArr = new C1760kg.n[list7.size()];
            Iterator<Bi> it2 = list7.iterator();
            while (it2.hasNext()) {
                nVarArr[i10] = this.f13878e.b(it2.next());
                i10++;
            }
            c1760kg.f16595p = nVarArr;
        }
        String str12 = ri.A;
        if (str12 != null) {
            c1760kg.f16600u = str12;
        }
        List<String> list8 = ri.S;
        c1760kg.T = (String[]) list8.toArray(new String[list8.size()]);
        List<C1709ie> list9 = ri.D;
        if (list9 != null) {
            c1760kg.f16604y = this.f13880g.b(list9);
        }
        Di di = ri.E;
        if (di != null) {
            c1760kg.f16605z = this.f13882i.b(di);
        }
        Ui ui = ri.B;
        if (ui != null) {
            Objects.requireNonNull(this.f13881h);
            C1760kg.r rVar = new C1760kg.r();
            rVar.f16720b = ui.f15192a;
            c1760kg.f16602w = rVar;
        }
        c1760kg.H = ri.K;
        C2141zi c2141zi = ri.F;
        if (c2141zi != null) {
            Objects.requireNonNull(this.f13883j);
            C1760kg.j jVar = new C1760kg.j();
            jVar.f16656b = c2141zi.f18038a;
            c1760kg.J = jVar;
        }
        C1542bm c1542bm = ri.L;
        if (c1542bm != null) {
            c1760kg.M = this.f13884k.b(c1542bm);
        }
        Kl kl = ri.M;
        if (kl != null) {
            c1760kg.O = this.f13885l.b(kl);
        }
        Kl kl2 = ri.N;
        if (kl2 != null) {
            c1760kg.P = this.f13885l.b(kl2);
        }
        Kl kl3 = ri.O;
        if (kl3 != null) {
            c1760kg.N = this.f13885l.b(kl3);
        }
        C1868p c1868p = ri.P;
        if (c1868p != null) {
            Objects.requireNonNull(this.f13886m);
            C1760kg.b bVar = new C1760kg.b();
            bVar.f16611b = c1868p.f17026a;
            bVar.f16612c = c1868p.f17027b;
            c1760kg.U = bVar;
        }
        Vi vi = ri.H;
        if (vi != null) {
            c1760kg.Q = this.f13887n.b(vi);
        }
        C1887pi c1887pi = ri.Q;
        if (c1887pi != null) {
            c1760kg.R = this.f13888o.b(c1887pi);
        }
        c1760kg.S = this.f13889p.b(ri.R);
        C1862oi c1862oi = ri.T;
        if (c1862oi != null) {
            c1760kg.V = this.f13890q.b(c1862oi);
        }
        G0 g10 = ri.U;
        if (g10 != null) {
            Objects.requireNonNull(this.f13891r);
            C1760kg.g gVar = new C1760kg.g();
            gVar.f16625b = g10.a();
            c1760kg.X = gVar;
        }
        C2011ui c2011ui = ri.V;
        if (c2011ui != null) {
            c1760kg.W = this.f13892s.b(c2011ui);
        }
        Fa fa2 = this.f13894u;
        Ti ti = ri.W;
        Objects.requireNonNull(fa2);
        C1760kg.q qVar = new C1760kg.q();
        qVar.f16719b = ti.a();
        c1760kg.Y = qVar;
        return c1760kg;
    }
}
