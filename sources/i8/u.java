package i8;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import l8.a2;
import l8.a4;
import l8.a6;
import l8.b1;
import l8.b2;
import l8.b4;
import l8.b5;
import l8.b6;
import l8.c1;
import l8.c2;
import l8.c4;
import l8.c6;
import l8.d1;
import l8.d4;
import l8.d5;
import l8.e1;
import l8.e3;
import l8.e4;
import l8.e5;
import l8.e6;
import l8.f1;
import l8.f3;
import l8.f5;
import l8.f6;
import l8.g1;
import l8.g2;
import l8.g3;
import l8.g4;
import l8.g5;
import l8.g6;
import l8.h1;
import l8.h2;
import l8.h3;
import l8.h4;
import l8.h5;
import l8.i1;
import l8.i2;
import l8.i3;
import l8.i5;
import l8.i6;
import l8.j1;
import l8.j2;
import l8.j3;
import l8.j4;
import l8.j5;
import l8.k1;
import l8.k2;
import l8.k4;
import l8.k5;
import l8.k6;
import l8.l1;
import l8.l2;
import l8.l4;
import l8.m1;
import l8.m2;
import l8.m5;
import l8.n4;
import l8.n5;
import l8.n6;
import l8.o1;
import l8.o2;
import l8.o3;
import l8.o4;
import l8.o5;
import l8.p1;
import l8.p2;
import l8.p3;
import l8.p4;
import l8.p5;
import l8.q3;
import l8.q4;
import l8.q5;
import l8.r2;
import l8.r3;
import l8.r5;
import l8.s2;
import l8.s5;
import l8.t4;
import l8.u2;
import l8.u4;
import l8.u5;
import l8.v2;
import l8.v4;
import l8.v5;
import l8.w1;
import l8.w4;
import l8.w5;
import l8.x1;
import l8.x2;
import l8.x3;
import l8.x4;
import l8.x5;
import l8.y1;
import l8.y2;
import l8.y3;
import l8.y4;
import l8.y5;
import l8.z2;
import l8.z3;
import l8.z4;
import y9.a3;
import y9.b8;
import y9.c7;
import y9.d2;
import y9.d3;
import y9.d6;
import y9.f4;
import y9.f7;
import y9.h8;
import y9.i8;
import y9.k3;
import y9.l3;
import y9.l6;
import y9.l7;
import y9.m7;
import y9.o7;
import y9.q2;
import y9.q7;
import y9.r4;
import y9.s3;
import y9.s4;
import y9.s6;
import y9.t2;
import y9.t3;
import y9.t5;
import y9.u3;
import y9.u6;
import y9.v1;
import y9.w2;
import y9.x6;
import y9.z5;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f31440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5 f31441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f31442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l4 f31443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g2 f31444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.yandex.div.core.view2.divs.a f31445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f31446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m8.a f31447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o3 f31448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n8.d f31449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j5 f31450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p1 f31451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f31452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p4 f31453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r2 f31454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h4 f31455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g6 f31456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x7.a f31457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i6 f31458s;

    public u(g0 g0Var, m5 m5Var, j1 j1Var, l4 l4Var, g2 g2Var, com.yandex.div.core.view2.divs.a aVar, a2 a2Var, m8.a aVar2, o3 o3Var, n8.d dVar, j5 j5Var, p1 p1Var, p2 p2Var, p4 p4Var, r2 r2Var, h4 h4Var, g6 g6Var, x7.a aVar3, i6 i6Var) {
        fd.j0.i(g0Var, "validator");
        fd.j0.i(m5Var, "textBinder");
        fd.j0.i(j1Var, "containerBinder");
        fd.j0.i(l4Var, "separatorBinder");
        fd.j0.i(g2Var, "imageBinder");
        fd.j0.i(aVar, "gifImageBinder");
        fd.j0.i(a2Var, "gridBinder");
        fd.j0.i(aVar2, "galleryBinder");
        fd.j0.i(o3Var, "pagerBinder");
        fd.j0.i(dVar, "tabsBinder");
        fd.j0.i(j5Var, "stateBinder");
        fd.j0.i(p1Var, "customBinder");
        fd.j0.i(p2Var, "indicatorBinder");
        fd.j0.i(p4Var, "sliderBinder");
        fd.j0.i(r2Var, "inputBinder");
        fd.j0.i(h4Var, "selectBinder");
        fd.j0.i(g6Var, "videoBinder");
        fd.j0.i(aVar3, "extensionController");
        fd.j0.i(i6Var, "pagerIndicatorConnector");
        this.f31440a = g0Var;
        this.f31441b = m5Var;
        this.f31442c = j1Var;
        this.f31443d = l4Var;
        this.f31444e = g2Var;
        this.f31445f = aVar;
        this.f31446g = a2Var;
        this.f31447h = aVar2;
        this.f31448i = o3Var;
        this.f31449j = dVar;
        this.f31450k = j5Var;
        this.f31451l = p1Var;
        this.f31452m = p2Var;
        this.f31453n = p4Var;
        this.f31454o = r2Var;
        this.f31455p = h4Var;
        this.f31456q = g6Var;
        this.f31457r = aVar3;
        this.f31458s = i6Var;
    }

    public void a() {
        i6 i6Var = this.f31458s;
        for (Map.Entry<String, o8.l> entry : i6Var.f32458a.entrySet()) {
            String key = entry.getKey();
            o8.l value = entry.getValue();
            List<o8.k> list = i6Var.f32459b.get(key);
            if (list != null) {
                for (o8.k kVar : list) {
                    ViewPager2 viewPager = value.getViewPager();
                    Objects.requireNonNull(kVar);
                    fd.j0.i(viewPager, "newPager");
                    ViewPager2 viewPager2 = kVar.f33747d;
                    if (viewPager2 != viewPager) {
                        if (viewPager2 != null) {
                            viewPager2.g(kVar.f33749f);
                        }
                        if (viewPager.getAdapter() == null) {
                            throw new IllegalArgumentException("Attached pager adapter is null!".toString());
                        }
                        viewPager.c(kVar.f33749f);
                        kVar.f33747d = viewPager;
                        n9.f fVar = kVar.f33746c;
                        if (fVar != null) {
                            kVar.b(fVar);
                        }
                    }
                }
            }
        }
        i6Var.f32458a.clear();
        i6Var.f32459b.clear();
    }

    public void b(View view, y9.k kVar, k kVar2, c8.e eVar) {
        fd.j0.i(view, "view");
        fd.j0.i(kVar, "div");
        fd.j0.i(kVar2, "divView");
        fd.j0.i(eVar, "path");
        try {
            g0 g0Var = this.f31440a;
            v9.d expressionResolver = kVar2.getExpressionResolver();
            Objects.requireNonNull(g0Var);
            fd.j0.i(expressionResolver, "resolver");
            if (!g0Var.m(kVar, expressionResolver).booleanValue()) {
                y9.g0 g0VarA = kVar.a();
                l8.b.i(view, g0VarA.f(), kVar2.getExpressionResolver());
                return;
            }
            this.f31457r.a(kVar2, view, kVar.a());
            if (kVar instanceof y9.k.q) {
                q(view, ((y9.k.q) kVar).f40990c, kVar2);
            } else if (kVar instanceof y9.k.h) {
                h(view, ((y9.k.h) kVar).f40981c, kVar2);
            } else if (kVar instanceof y9.k.f) {
                f(view, ((y9.k.f) kVar).f40979c, kVar2);
            } else if (kVar instanceof y9.k.m) {
                m(view, ((y9.k.m) kVar).f40986c, kVar2);
            } else if (kVar instanceof y9.k.c) {
                c(view, ((y9.k.c) kVar).f40976c, kVar2, eVar);
            } else if (kVar instanceof y9.k.g) {
                g(view, ((y9.k.g) kVar).f40980c, kVar2, eVar);
            } else if (kVar instanceof y9.k.e) {
                e(view, ((y9.k.e) kVar).f40978c, kVar2, eVar);
            } else if (kVar instanceof y9.k.C0475k) {
                k(view, ((y9.k.C0475k) kVar).f40984c, kVar2, eVar);
            } else if (kVar instanceof y9.k.p) {
                p(view, ((y9.k.p) kVar).f40989c, kVar2, eVar);
            } else if (kVar instanceof y9.k.o) {
                o(view, ((y9.k.o) kVar).f40988c, kVar2, eVar);
            } else if (kVar instanceof y9.k.d) {
                d(view, ((y9.k.d) kVar).f40977c, kVar2);
            } else if (kVar instanceof y9.k.i) {
                i(view, ((y9.k.i) kVar).f40982c, kVar2);
            } else if (kVar instanceof y9.k.n) {
                n(view, ((y9.k.n) kVar).f40987c, kVar2);
            } else if (kVar instanceof y9.k.j) {
                j(view, ((y9.k.j) kVar).f40983c, kVar2);
            } else if (kVar instanceof y9.k.l) {
                l(view, ((y9.k.l) kVar).f40985c, kVar2);
            } else {
                if (!(kVar instanceof y9.k.r)) {
                    throw new jc.g();
                }
                r(view, ((y9.k.r) kVar).f40991c, kVar2);
            }
            if (kVar instanceof y9.k.d) {
                return;
            }
            this.f31457r.b(kVar2, view, kVar.a());
        } catch (u9.f e10) {
            if (!x1.q.a(e10)) {
                throw e10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:175:0x0464  */
    /* JADX WARN: Code duplicated, block: B:217:0x0509  */
    public final void c(View view, y9.w0 w0Var, k kVar, c8.e eVar) {
        y9.w0 div$div_release;
        y9.w0 w0Var2;
        boolean z10;
        boolean z11;
        v9.d dVar;
        q8.d dVar2;
        boolean z12;
        boolean z13;
        ViewGroup viewGroup;
        int i10;
        q8.d dVar3;
        v9.d dVar4;
        j1 j1Var;
        Object next;
        Iterator it;
        int i11;
        Object next2;
        y9.k kVar2;
        boolean zD;
        j1 j1Var2 = this.f31442c;
        ViewGroup viewGroup2 = (ViewGroup) view;
        Objects.requireNonNull(j1Var2);
        fd.j0.i(w0Var, "div");
        boolean z14 = viewGroup2 instanceof o8.u;
        if (z14) {
            div$div_release = ((o8.u) viewGroup2).getDiv$div_release();
        } else if (viewGroup2 instanceof o8.j) {
            div$div_release = ((o8.j) viewGroup2).getDiv$div_release();
        } else {
            div$div_release = viewGroup2 instanceof o8.d ? ((o8.d) viewGroup2).getDiv$div_release() : null;
        }
        q8.d dVarA = j1Var2.f32484f.a(kVar.getDataTag(), kVar.getDivData());
        fd.j0.d(w0Var, div$div_release);
        v9.d expressionResolver = kVar.getExpressionResolver();
        if (div$div_release != null) {
            j1Var2.f32479a.i(viewGroup2, div$div_release, kVar);
        }
        f9.b bVarI = x1.q.i(viewGroup2);
        bVarI.g();
        j1Var2.f32479a.e(viewGroup2, w0Var, div$div_release, kVar);
        l8.b.K(viewGroup2, expressionResolver, w0Var.f43626h);
        l8.b.c(viewGroup2, kVar, w0Var.f43620b, w0Var.f43622d, w0Var.f43641w, w0Var.f43633o, w0Var.f43621c);
        boolean z15 = fd.j0.d(div$div_release == null ? null : y9.w0.class, y9.w0.class) && (div$div_release == null || div$div_release == w0Var || (j8.a.c(div$div_release, w0Var, expressionResolver) && j8.a.a(div$div_release.f43638t, w0Var.f43638t, expressionResolver)));
        if (viewGroup2 instanceof o8.j) {
            o8.j jVar = (o8.j) viewGroup2;
            jVar.d(w0Var.f43643y.f(expressionResolver, new b1(jVar, w0Var, expressionResolver)));
            j1Var2.d(jVar, w0Var, expressionResolver, new c1(jVar));
            y9.w0.k kVar3 = w0Var.C;
            if (kVar3 != null) {
                j1Var2.e(jVar, kVar3, expressionResolver, new k1(jVar));
                l8.b.L(jVar, expressionResolver, kVar3.f43663d, new m1(new l1(jVar), jVar, expressionResolver));
            }
            jVar.setDiv$div_release(w0Var);
        } else if (z14) {
            o8.u uVar = (o8.u) viewGroup2;
            uVar.d(w0Var.f43643y.f(expressionResolver, new d1(uVar, w0Var, expressionResolver)));
            j1Var2.d(uVar, w0Var, expressionResolver, new e1(uVar));
            y9.w0.k kVar4 = w0Var.C;
            if (kVar4 != null) {
                j1Var2.e(uVar, kVar4, expressionResolver, new f1(uVar));
                l8.b.L(uVar, expressionResolver, kVar4.f43663d, new m1(new g1(uVar), uVar, expressionResolver));
            }
            y9.w0.k kVar5 = w0Var.f43640v;
            if (kVar5 != null) {
                j1Var2.e(uVar, kVar5, expressionResolver, new h1(uVar));
                l8.b.L(uVar, expressionResolver, kVar5.f43663d, new m1(new i1(uVar), uVar, expressionResolver));
            }
            uVar.setDiv$div_release(w0Var);
        } else if (viewGroup2 instanceof o8.d) {
            ((o8.d) viewGroup2).setDiv$div_release(w0Var);
        }
        Iterator<View> it2 = ((p0.i0.a) p0.i0.b(viewGroup2)).iterator();
        while (true) {
            p0.j0 j0Var = (p0.j0) it2;
            if (!j0Var.hasNext()) {
                break;
            } else {
                kVar.G((View) j0Var.next());
            }
        }
        if (z15 || div$div_release == null) {
            w0Var2 = div$div_release;
        } else {
            v9.d expressionResolver2 = kVar.getExpressionResolver();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<y9.k> list = div$div_release.f43638t;
            List listH = dd.q.h(p0.i0.b(viewGroup2));
            Iterator<T> it3 = list.iterator();
            Iterator it4 = listH.iterator();
            ArrayList arrayList = new ArrayList(Math.min(kc.m.j(list, 10), kc.m.j(listH, 10)));
            while (it3.hasNext() && it4.hasNext()) {
                linkedHashMap.put((y9.k) it3.next(), (View) it4.next());
                arrayList.add(jc.w.f31842a);
            }
            viewGroup2.removeAllViews();
            ArrayList arrayList2 = new ArrayList();
            Iterator it5 = w0Var.f43638t.iterator();
            int i12 = 0;
            while (it5.hasNext()) {
                Object next3 = it5.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    kc.l.i();
                    throw null;
                }
                y9.k kVar6 = (y9.k) next3;
                Iterator it6 = linkedHashMap.keySet().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        it = it5;
                        i11 = i13;
                        next2 = null;
                        break;
                    }
                    next2 = it6.next();
                    y9.k kVar7 = (y9.k) next2;
                    it = it5;
                    if (f8.b.e(kVar7)) {
                        i11 = i13;
                        zD = fd.j0.d(f8.b.d(kVar6), f8.b.d(kVar7));
                        kVar2 = kVar6;
                    } else {
                        i11 = i13;
                        fd.j0.i(kVar6, "other");
                        fd.j0.i(expressionResolver2, "resolver");
                        if (fd.j0.d(f8.b.d(kVar7), f8.b.d(kVar6))) {
                            y9.g0 g0VarA = kVar7.a();
                            y9.g0 g0VarA2 = kVar6.a();
                            kVar2 = kVar6;
                            if ((g0VarA instanceof d3) && (g0VarA2 instanceof d3)) {
                                zD = fd.j0.d(((d3) g0VarA).f39612w.b(expressionResolver2), ((d3) g0VarA2).f39612w.b(expressionResolver2));
                            } else {
                                List<y9.e0> listB = g0VarA.b();
                                if (listB != null && listB.equals(g0VarA2.b())) {
                                    zD = true;
                                }
                            }
                        } else {
                            kVar2 = kVar6;
                        }
                        zD = false;
                    }
                    if (zD) {
                        break;
                    }
                    it5 = it;
                    kVar6 = kVar2;
                    i13 = i11;
                }
                View view2 = (View) linkedHashMap.remove((y9.k) next2);
                if (view2 != null) {
                    viewGroup2.addView(view2);
                } else {
                    arrayList2.add(Integer.valueOf(i12));
                }
                it5 = it;
                i12 = i11;
            }
            Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                int iIntValue = ((Number) it7.next()).intValue();
                y9.k kVar8 = w0Var.f43638t.get(iIntValue);
                Iterator it8 = linkedHashMap.keySet().iterator();
                do {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                } while (!fd.j0.d(f8.b.d((y9.k) next), f8.b.d(kVar8)));
                View viewN = (View) linkedHashMap.remove((y9.k) next);
                if (viewN == null) {
                    viewN = j1Var2.f32480b.get().n(kVar8, kVar.getExpressionResolver());
                }
                viewGroup2.addView(viewN, iIntValue);
            }
            Iterator it9 = linkedHashMap.values().iterator();
            while (it9.hasNext()) {
                u1.a.u(kVar.getReleaseViewVisitor$div_release(), (View) it9.next());
            }
            w0Var2 = null;
        }
        int size = w0Var.f43638t.size();
        int i14 = 0;
        while (i14 < size) {
            int i15 = i14 + 1;
            if (l8.b.B(w0Var.f43638t.get(i14).a())) {
                View childAt = viewGroup2.getChildAt(i14);
                fd.j0.h(childAt, "view.getChildAt(i)");
                kVar.p(childAt, w0Var.f43638t.get(i14));
            }
            i14 = i15;
        }
        int size2 = w0Var.f43638t.size();
        int i16 = 0;
        int i17 = 0;
        int size3 = 0;
        int i18 = 0;
        while (i16 < size2) {
            int i19 = i16 + 1;
            y9.g0 g0VarA3 = w0Var.f43638t.get(i16).a();
            int i20 = size2;
            int i21 = i16 + size3;
            View childAt2 = viewGroup2.getChildAt(i21);
            String id2 = g0VarA3.getId();
            if (z14) {
                z11 = z14;
                j1Var2.b(l8.b.G(w0Var, expressionResolver) ? g0VarA3.getHeight() : g0VarA3.getWidth(), g0VarA3, expressionResolver, dVarA);
                dVar = expressionResolver;
                dVar2 = dVarA;
            } else {
                z11 = z14;
                if ((w0Var.M instanceof l6.e) && (g0VarA3.getWidth() instanceof l6.d)) {
                    i17++;
                }
                if (w0Var.f43636r instanceof l6.e) {
                    y9.c0 c0Var = w0Var.f43626h;
                    if (c0Var == null) {
                        dVar = expressionResolver;
                        dVar2 = dVarA;
                    } else {
                        dVar = expressionResolver;
                        dVar2 = dVarA;
                        if (((float) c0Var.f39347a.b(expressionResolver).doubleValue()) != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            z13 = false;
                        }
                        if (!z13 && (g0VarA3.getHeight() instanceof l6.d)) {
                            z12 = true;
                        }
                        if (z12) {
                            i18++;
                        }
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (z12) {
                        i18++;
                    }
                } else {
                    dVar = expressionResolver;
                    dVar2 = dVarA;
                }
                z12 = false;
                if (z12) {
                    i18++;
                }
            }
            if (id2 != null) {
                List<View> listA = j1Var2.f32481c.a(kVar, id2);
                List<y9.k> listA2 = j1Var2.f32482d.a(kVar.getDataTag(), id2);
                if (listA == null || listA2 == null) {
                    viewGroup = viewGroup2;
                    i10 = i18;
                    dVar3 = dVar2;
                    dVar4 = dVar;
                    j1Var = j1Var2;
                    u uVar2 = j1Var.f32483e.get();
                    fd.j0.h(childAt2, "childView");
                    uVar2.b(childAt2, w0Var.f43638t.get(i16), kVar, eVar);
                    j1Var.c(w0Var, g0VarA3, childAt2, dVar4, bVarI);
                } else {
                    viewGroup2.removeViewAt(i21);
                    int size4 = listA.size();
                    int i22 = 0;
                    while (i22 < size4) {
                        int i23 = i22 + 1;
                        y9.g0 g0VarA4 = listA2.get(i22).a();
                        View view3 = listA.get(i22);
                        viewGroup2.addView(view3, i21 + i22);
                        v9.d dVar5 = dVar;
                        int i24 = i21;
                        q8.d dVar6 = dVar2;
                        List<View> list2 = listA;
                        ViewGroup viewGroup3 = viewGroup2;
                        int i25 = i18;
                        j1 j1Var3 = j1Var2;
                        j1Var2.c(w0Var, g0VarA4, view3, dVar5, bVarI);
                        if (l8.b.B(g0VarA4)) {
                            kVar.p(view3, listA2.get(i22));
                        }
                        viewGroup2 = viewGroup3;
                        j1Var2 = j1Var3;
                        i21 = i24;
                        i22 = i23;
                        dVar = dVar5;
                        listA = list2;
                        dVar2 = dVar6;
                        i18 = i25;
                    }
                    viewGroup = viewGroup2;
                    i10 = i18;
                    dVar3 = dVar2;
                    dVar4 = dVar;
                    j1Var = j1Var2;
                    size3 += listA.size() - 1;
                }
            } else {
                viewGroup = viewGroup2;
                i10 = i18;
                dVar3 = dVar2;
                dVar4 = dVar;
                j1Var = j1Var2;
                u uVar3 = j1Var.f32483e.get();
                fd.j0.h(childAt2, "childView");
                uVar3.b(childAt2, w0Var.f43638t.get(i16), kVar, eVar);
                j1Var.c(w0Var, g0VarA3, childAt2, dVar4, bVarI);
            }
            viewGroup2 = viewGroup;
            j1Var2 = j1Var;
            i16 = i19;
            z14 = z11;
            expressionResolver = dVar4;
            dVarA = dVar3;
            i18 = i10;
            size2 = i20;
        }
        v9.d dVar7 = expressionResolver;
        q8.d dVar8 = dVarA;
        int i26 = i18;
        l8.b.b0(viewGroup2, w0Var.f43638t, w0Var2 == null ? null : w0Var2.f43638t, kVar);
        boolean z16 = i17 == w0Var.f43638t.size();
        boolean z17 = i17 > 0;
        boolean z18 = i26 == w0Var.f43638t.size();
        boolean z19 = i26 > 0;
        if (!l8.b.H(w0Var, dVar7)) {
            z10 = !(w0Var.f43643y.b(dVar7) == y9.w0.j.VERTICAL) ? !l8.b.G(w0Var, dVar7) ? z16 || z18 : z18 || z17 : z16 || z19;
        }
        if (z10) {
            ListIterator<Throwable> listIterator = dVar8.f34811e.listIterator();
            while (listIterator.hasNext()) {
                if (fd.j0.d(listIterator.next().getMessage(), "Incorrect child size. Container with wrap_content size contains child with match_parent size.")) {
                    return;
                }
            }
            dVar8.b(new Throwable("Incorrect child size. Container with wrap_content size contains child with match_parent size."));
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    public final void d(View view, y9.i1 i1Var, k kVar) {
        boolean z10;
        View viewCreateView;
        p1 p1Var = this.f31451l;
        Objects.requireNonNull(p1Var);
        fd.j0.i(i1Var, "div");
        if (!(view instanceof o8.d)) {
            int i10 = e9.a.f29114a;
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        View viewA = viewGroup.getChildCount() != 0 ? p0.i0.a(viewGroup, 0) : null;
        Object tag = viewA == null ? null : viewA.getTag(R.id.div_custom_tag);
        y9.i1 i1Var2 = tag instanceof y9.i1 ? (y9.i1) tag : null;
        if (fd.j0.d(i1Var2, i1Var)) {
            return;
        }
        if (i1Var2 != null) {
            p1Var.f32730a.i(viewA, i1Var2, kVar);
        }
        p1Var.f32730a.e(view, i1Var, null, kVar);
        p1Var.f32730a.c(view, kVar, null);
        p7.l0 l0Var = p1Var.f32732c;
        if (!(l0Var != null && l0Var.isCustomTypeSupported(i1Var.f40541i))) {
            p1Var.f32731b.a(i1Var, kVar, new o1(viewA, p1Var, viewGroup, i1Var, kVar));
            return;
        }
        p7.l0 l0Var2 = p1Var.f32732c;
        if (viewA == null) {
            z10 = false;
        } else {
            Object tag2 = viewA.getTag(R.id.div_custom_tag);
            y9.i1 i1Var3 = tag2 instanceof y9.i1 ? (y9.i1) tag2 : null;
            if (i1Var3 == null ? false : fd.j0.d(i1Var3.f40541i, i1Var.f40541i)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            viewCreateView = viewA;
        } else {
            viewCreateView = l0Var2.createView(i1Var, kVar);
            viewCreateView.setTag(R.id.div_custom_tag, i1Var);
        }
        l0Var2.bindView(viewCreateView, i1Var, kVar);
        if (!fd.j0.d(viewA, viewCreateView)) {
            p1Var.f32730a.c(viewCreateView, kVar, i1Var.f40546n);
            if (viewGroup.getChildCount() != 0) {
                u1.a.u(kVar.getReleaseViewVisitor$div_release(), p0.i0.a(viewGroup, 0));
                viewGroup.removeViewAt(0);
            }
            viewGroup.addView(viewCreateView, new ViewGroup.LayoutParams(-1, -1));
        }
        p1Var.f32733d.b(kVar, viewCreateView, i1Var);
    }

    public final void e(View view, t2 t2Var, k kVar, c8.e eVar) {
        m8.a aVar = this.f31447h;
        o8.m mVar = (o8.m) view;
        Objects.requireNonNull(aVar);
        fd.j0.i(t2Var, "div");
        t2 div = mVar.getDiv();
        if (fd.j0.d(t2Var, div)) {
            RecyclerView.g adapter = mVar.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryBinder.GalleryAdapter");
            m8.a.C0357a c0357a = (m8.a.C0357a) adapter;
            c0357a.c(aVar.f33271d);
            c0357a.g();
            c0357a.e();
            aVar.a(mVar, t2Var.f42724r, kVar);
            return;
        }
        if (div != null) {
            aVar.f33268a.i(mVar, div, kVar);
        }
        f9.b bVarI = x1.q.i(mVar);
        bVarI.g();
        aVar.f33268a.e(mVar, t2Var, div, kVar);
        v9.d expressionResolver = kVar.getExpressionResolver();
        m8.c cVar = new m8.c(aVar, mVar, t2Var, kVar, expressionResolver);
        bVarI.d(t2Var.f42726t.e(expressionResolver, cVar));
        bVarI.d(t2Var.f42730x.e(expressionResolver, cVar));
        bVarI.d(t2Var.f42723q.e(expressionResolver, cVar));
        bVarI.d(t2Var.f42728v.e(expressionResolver, cVar));
        v9.b<Long> bVar = t2Var.f42713g;
        if (bVar != null) {
            bVarI.d(bVar.e(expressionResolver, cVar));
        }
        mVar.setRecycledViewPool(new n6(kVar.getReleaseViewVisitor$div_release()));
        mVar.setScrollingTouchSlop(1);
        mVar.setClipToPadding(false);
        mVar.setOverScrollMode(2);
        m8.b bVar2 = new m8.b(aVar, kVar);
        List<y9.k> list = t2Var.f42724r;
        u uVar = aVar.f33270c.get();
        fd.j0.h(uVar, "divBinder.get()");
        mVar.setAdapter(new m8.a.C0357a(list, kVar, uVar, aVar.f33269b, bVar2, eVar));
        mVar.setDiv(t2Var);
        aVar.b(mVar, t2Var, kVar, expressionResolver);
    }

    public final void f(View view, w2 w2Var, k kVar) {
        com.yandex.div.core.view2.divs.a aVar = this.f31445f;
        o8.e eVar = (o8.e) view;
        Objects.requireNonNull(aVar);
        fd.j0.i(w2Var, "div");
        w2 div$div_release = eVar.getDiv$div_release();
        if (fd.j0.d(w2Var, div$div_release)) {
            return;
        }
        q8.d dVarA = aVar.f13425d.a(kVar.getDataTag(), kVar.getDivData());
        v9.d expressionResolver = kVar.getExpressionResolver();
        eVar.g();
        eVar.setDiv$div_release(w2Var);
        if (div$div_release != null) {
            aVar.f13422a.i(eVar, div$div_release, kVar);
        }
        aVar.f13422a.e(eVar, w2Var, div$div_release, kVar);
        l8.b.c(eVar, kVar, w2Var.f43694b, w2Var.f43696d, w2Var.f43713u, w2Var.f43707o, w2Var.f43695c);
        l8.b.K(eVar, expressionResolver, w2Var.f43700h);
        eVar.d(w2Var.B.f(expressionResolver, new w1(eVar)));
        v9.b<y9.t> bVar = w2Var.f43704l;
        v9.b<y9.u> bVar2 = w2Var.f43705m;
        eVar.setGravity(l8.b.x(bVar.b(expressionResolver), bVar2.b(expressionResolver)));
        y1 y1Var = new y1(aVar, eVar, expressionResolver, bVar, bVar2);
        eVar.d(bVar.e(expressionResolver, y1Var));
        eVar.d(bVar2.e(expressionResolver, y1Var));
        eVar.d(w2Var.f43710r.f(expressionResolver, new x1(aVar, eVar, kVar, expressionResolver, w2Var, dVarA)));
    }

    public final void g(View view, a3 a3Var, k kVar, c8.e eVar) {
        int i10;
        int i11;
        int size;
        int iB;
        a2 a2Var = this.f31446g;
        o8.f fVar = (o8.f) view;
        Objects.requireNonNull(a2Var);
        fd.j0.i(a3Var, "div");
        a3 div$div_release = fVar.getDiv$div_release();
        fd.j0.d(a3Var, div$div_release);
        v9.d expressionResolver = kVar.getExpressionResolver();
        fVar.g();
        fVar.setDiv$div_release(a3Var);
        fVar.setReleaseViewVisitor$div_release(kVar.getReleaseViewVisitor$div_release());
        if (div$div_release != null) {
            a2Var.f32235a.i(fVar, div$div_release, kVar);
        }
        a2Var.f32235a.e(fVar, a3Var, div$div_release, kVar);
        l8.b.c(fVar, kVar, a3Var.f39026b, a3Var.f39028d, a3Var.f39045u, a3Var.f39039o, a3Var.f39027c);
        fVar.d(a3Var.f39034j.f(expressionResolver, new b2(fVar)));
        v9.b<y9.t> bVar = a3Var.f39036l;
        v9.b<y9.u> bVar2 = a3Var.f39037m;
        fVar.setGravity(l8.b.x(bVar.b(expressionResolver), bVar2.b(expressionResolver)));
        c2 c2Var = new c2(fVar, bVar, expressionResolver, bVar2);
        fVar.d(bVar.e(expressionResolver, c2Var));
        fVar.d(bVar2.e(expressionResolver, c2Var));
        if (div$div_release != null && (size = a3Var.f39044t.size()) <= (iB = kc.l.b(div$div_release.f39044t))) {
            while (true) {
                int i12 = size + 1;
                View childAt = fVar.getChildAt(size);
                fd.j0.h(childAt, "view.getChildAt(i)");
                kVar.G(childAt);
                if (size == iB) {
                    break;
                } else {
                    size = i12;
                }
            }
        }
        int size2 = a3Var.f39044t.size();
        int i13 = 0;
        int size3 = 0;
        while (i13 < size2) {
            int i14 = i13 + 1;
            y9.g0 g0VarA = a3Var.f39044t.get(i13).a();
            int i15 = i13 + size3;
            View childAt2 = fVar.getChildAt(i15);
            String id2 = g0VarA.getId();
            if (id2 != null) {
                List<View> listA = a2Var.f32236b.a(kVar, id2);
                i10 = size2;
                i11 = i14;
                List<y9.k> listA2 = a2Var.f32237c.a(kVar.getDataTag(), id2);
                if (listA != null && listA2 != null) {
                    fVar.removeViewAt(i15);
                    int size4 = listA.size();
                    int i16 = 0;
                    while (i16 < size4) {
                        int i17 = i16 + 1;
                        y9.g0 g0VarA2 = listA2.get(i16).a();
                        int i18 = size4;
                        View view2 = listA.get(i16);
                        fVar.addView(view2, i15 + i16, new m9.d(-2, -2));
                        if (l8.b.B(g0VarA2)) {
                            kVar.p(view2, listA2.get(i16));
                        }
                        a2Var.b(view2, g0VarA, expressionResolver);
                        i16 = i17;
                        size4 = i18;
                    }
                    size3 += listA.size() - 1;
                }
                size2 = i10;
                i13 = i11;
            } else {
                i10 = size2;
                i11 = i14;
            }
            childAt2.setLayoutParams(new m9.d(-2, -2));
            a2Var.f32238d.get().b(childAt2, a3Var.f39044t.get(i13), kVar, eVar);
            a2Var.b(childAt2, g0VarA, expressionResolver);
            if (l8.b.B(g0VarA)) {
                kVar.p(childAt2, a3Var.f39044t.get(i13));
            } else {
                kVar.G(childAt2);
            }
            size2 = i10;
            i13 = i11;
        }
        l8.b.b0(fVar, a3Var.f39044t, div$div_release == null ? null : div$div_release.f39044t, kVar);
    }

    public final void h(View view, d3 d3Var, k kVar) {
        g2 g2Var = this.f31444e;
        o8.g gVar = (o8.g) view;
        Objects.requireNonNull(g2Var);
        fd.j0.i(d3Var, "div");
        d3 div$div_release = gVar.getDiv$div_release();
        if (fd.j0.d(d3Var, div$div_release)) {
            return;
        }
        q8.d dVarA = g2Var.f32391d.a(kVar.getDataTag(), kVar.getDivData());
        v9.d expressionResolver = kVar.getExpressionResolver();
        f9.b bVarI = x1.q.i(gVar);
        gVar.g();
        gVar.setDiv$div_release(d3Var);
        if (div$div_release != null) {
            g2Var.f32388a.i(gVar, div$div_release, kVar);
        }
        g2Var.f32388a.e(gVar, d3Var, div$div_release, kVar);
        l8.b.c(gVar, kVar, d3Var.f39591b, d3Var.f39593d, d3Var.f39613x, d3Var.f39605p, d3Var.f39592c);
        l8.b.K(gVar, expressionResolver, d3Var.f39598i);
        gVar.d(d3Var.E.f(expressionResolver, new h2(gVar)));
        v9.b<y9.t> bVar = d3Var.f39602m;
        v9.b<y9.u> bVar2 = d3Var.f39603n;
        gVar.setGravity(l8.b.x(bVar.b(expressionResolver), bVar2.b(expressionResolver)));
        j2 j2Var = new j2(g2Var, gVar, expressionResolver, bVar, bVar2);
        gVar.d(bVar.e(expressionResolver, j2Var));
        gVar.d(bVar2.e(expressionResolver, j2Var));
        gVar.d(d3Var.f39612w.f(expressionResolver, new i2(g2Var, gVar, kVar, expressionResolver, dVarA, d3Var)));
        v9.b<String> bVar3 = d3Var.C;
        if (bVar3 != null) {
            gVar.d(bVar3.f(expressionResolver, new l2(gVar, g2Var, kVar, expressionResolver, d3Var, dVarA)));
        }
        v9.b<Integer> bVar4 = d3Var.G;
        v9.b<y9.h0> bVar5 = d3Var.H;
        if (bVar4 == null) {
            gVar.setColorFilter((ColorFilter) null);
        } else {
            m2 m2Var = new m2(gVar, g2Var, expressionResolver, bVar4, bVar5);
            gVar.d(bVar4.f(expressionResolver, m2Var));
            gVar.d(bVar5.f(expressionResolver, m2Var));
        }
        List<d2> list = d3Var.f39607r;
        if (list == null) {
            return;
        }
        k2 k2Var = new k2(g2Var, gVar, list, kVar, expressionResolver);
        for (d2 d2Var : list) {
            if (d2Var instanceof d2.a) {
                bVarI.d(((d2.a) d2Var).f39562c.f40530a.e(expressionResolver, k2Var));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0114  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public final void i(View view, k3 k3Var, k kVar) {
        v9.b bVar;
        l6 l6Var;
        l6 l6Var2;
        p2 p2Var = this.f31452m;
        o8.k kVar2 = (o8.k) view;
        Objects.requireNonNull(p2Var);
        fd.j0.i(k3Var, "div");
        String str = k3Var.f41087x;
        if (str != null) {
            i6 i6Var = p2Var.f32735b;
            Objects.requireNonNull(i6Var);
            WeakHashMap<String, List<o8.k>> weakHashMap = i6Var.f32459b;
            List<o8.k> arrayList = weakHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                weakHashMap.put(str, arrayList);
            }
            arrayList.add(kVar2);
        }
        k3 div$div_release = kVar2.getDiv$div_release();
        if (fd.j0.d(k3Var, div$div_release)) {
            return;
        }
        v9.d expressionResolver = kVar.getExpressionResolver();
        kVar2.g();
        kVar2.setDiv$div_release(k3Var);
        if (div$div_release != null) {
            p2Var.f32734a.i(kVar2, div$div_release, kVar);
        }
        p2Var.f32734a.e(kVar2, k3Var, div$div_release, kVar);
        p2Var.a(kVar2, expressionResolver, k3Var);
        o2 o2Var = new o2(p2Var, kVar2, expressionResolver, k3Var);
        kVar2.d(k3Var.f41071h.e(expressionResolver, o2Var));
        kVar2.d(k3Var.f41065b.e(expressionResolver, o2Var));
        kVar2.d(k3Var.f41066c.e(expressionResolver, o2Var));
        kVar2.d(k3Var.f41080q.e(expressionResolver, o2Var));
        kVar2.d(k3Var.f41085v.e(expressionResolver, o2Var));
        l8.b.N(kVar2, expressionResolver, k3Var.A, o2Var);
        t5 t5Var = k3Var.f41067d;
        if (t5Var != null) {
            l8.b.M(kVar2, expressionResolver, t5Var, o2Var);
        }
        t5 t5Var2 = k3Var.f41082s;
        if (t5Var2 != null) {
            l8.b.M(kVar2, expressionResolver, t5Var2, o2Var);
        }
        t5 t5Var3 = k3Var.f41081r;
        if (t5Var3 != null) {
            l8.b.M(kVar2, expressionResolver, t5Var3, o2Var);
        }
        u9.a cVar = k3Var.f41083t;
        if (cVar == null) {
            cVar = new l3.c(new y9.m1(k3Var.B));
        }
        if (!(cVar instanceof l3.c)) {
            if (cVar instanceof l3.d) {
                l3.d dVar = (l3.d) cVar;
                kVar2.d(dVar.f41223c.f39095a.f41216b.e(expressionResolver, o2Var));
                kVar2.d(dVar.f41223c.f39095a.f41215a.e(expressionResolver, o2Var));
                bVar = dVar.f41223c.f39096b;
            }
            Objects.requireNonNull(p2Var.f32734a);
            l6Var = k3Var.L;
            if (l6Var instanceof l6.c) {
                kVar2.d(((y9.l2) l6Var.a()).f41216b.e(expressionResolver, o2Var));
            }
            l6Var2 = k3Var.f41078o;
            if (l6Var2 instanceof l6.c) {
                kVar2.d(((y9.l2) l6Var2.a()).f41216b.e(expressionResolver, o2Var));
            }
        }
        l3.c cVar2 = (l3.c) cVar;
        kVar2.d(cVar2.f41222c.f41419a.f41216b.e(expressionResolver, o2Var));
        bVar = cVar2.f41222c.f41419a.f41215a;
        kVar2.d(bVar.e(expressionResolver, o2Var));
        Objects.requireNonNull(p2Var.f32734a);
        l6Var = k3Var.L;
        if (l6Var instanceof l6.c) {
            kVar2.d(((y9.l2) l6Var.a()).f41216b.e(expressionResolver, o2Var));
        }
        l6Var2 = k3Var.f41078o;
        if (l6Var2 instanceof l6.c) {
            kVar2.d(((y9.l2) l6Var2.a()).f41216b.e(expressionResolver, o2Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v23, types: [T, java.lang.String] */
    public final void j(View view, s3 s3Var, k kVar) {
        v9.b<String> bVar;
        p7.d dVarE;
        vc.a0 a0Var;
        t3 t3Var;
        String strA;
        u3 u3VarA;
        r2 r2Var = this.f31454o;
        o8.h hVar = (o8.h) view;
        Objects.requireNonNull(r2Var);
        fd.j0.i(s3Var, "div");
        s3 div$div_release = hVar.getDiv$div_release();
        if (fd.j0.d(s3Var, div$div_release)) {
            return;
        }
        v9.d expressionResolver = kVar.getExpressionResolver();
        hVar.g();
        hVar.setDiv$div_release(s3Var);
        if (div$div_release != null) {
            r2Var.f32794a.i(hVar, div$div_release, kVar);
        }
        Drawable background = hVar.getBackground();
        r2Var.f32794a.e(hVar, s3Var, div$div_release, kVar);
        hVar.setFocusable(true);
        hVar.setFocusableInTouchMode(true);
        hVar.setTextAlignment(5);
        if (background != null) {
            s3.j jVar = s3Var.f42550z;
            v9.b<Integer> bVar2 = jVar == null ? null : jVar.f42561a;
            if (bVar2 != null) {
                hVar.d(bVar2.f(expressionResolver, new s2(r2Var, hVar, s3Var, kVar, expressionResolver, background)));
            }
        }
        l8.t2 t2Var = new l8.t2(r2Var, hVar, s3Var, expressionResolver);
        hVar.d(s3Var.f42536l.f(expressionResolver, t2Var));
        hVar.d(s3Var.f42545u.e(expressionResolver, t2Var));
        hVar.d(s3Var.f42537m.e(expressionResolver, t2Var));
        l8.l3 l3Var = new l8.l3(hVar, r2Var, s3Var, expressionResolver);
        hVar.d(s3Var.f42535k.f(expressionResolver, l3Var));
        hVar.d(s3Var.f42538n.e(expressionResolver, l3Var));
        hVar.d(s3Var.E.f(expressionResolver, new l8.k3(hVar, s3Var, expressionResolver)));
        y9.n6 n6VarB = s3Var.f42537m.b(expressionResolver);
        v9.b<Long> bVar3 = s3Var.f42546v;
        if (bVar3 == null) {
            r2Var.a(hVar, null, n6VarB);
        } else {
            hVar.d(bVar3.f(expressionResolver, new y2(r2Var, hVar, bVar3, expressionResolver, n6VarB)));
        }
        v9.b<Long> bVar4 = s3Var.f42549y;
        if (bVar4 != null) {
            hVar.d(bVar4.f(expressionResolver, new f3(hVar, bVar4, expressionResolver)));
        }
        v9.b<String> bVar5 = s3Var.f42542r;
        if (bVar5 != null) {
            hVar.d(bVar5.f(expressionResolver, new l8.w2(hVar, bVar5, expressionResolver)));
        }
        hVar.d(s3Var.f42541q.f(expressionResolver, new v2(hVar, s3Var, expressionResolver)));
        v9.b<Integer> bVar6 = s3Var.f42540p;
        if (bVar6 != null) {
            hVar.d(bVar6.f(expressionResolver, new u2(hVar, bVar6, expressionResolver)));
        }
        hVar.d(s3Var.f42544t.f(expressionResolver, new x2(r2Var, hVar)));
        hVar.d(s3Var.C.f(expressionResolver, new g3(hVar, s3Var, expressionResolver)));
        hVar.removeTextChangedListener(hVar.f34070l);
        hVar.f34070l = null;
        vc.a0 a0Var2 = new vc.a0();
        h3 h3Var = new h3(a0Var2, hVar);
        vc.a0 a0Var3 = new vc.a0();
        q8.d dVarA = r2Var.f32797d.a(kVar.getDataTag(), kVar.getDivData());
        e3 e3Var = new e3(s3Var, a0Var3, hVar, hVar.getKeyListener(), expressionResolver, h3Var, new z2(dVarA), dVarA);
        t3 t3Var2 = s3Var.f42548x;
        u3 u3VarA2 = t3Var2 == null ? null : t3Var2.a();
        if (!(u3VarA2 instanceof y9.i2)) {
            if ((u3VarA2 instanceof y9.f1) && (bVar = ((y9.f1) u3VarA2).f39929a) != null && (dVarE = bVar.e(expressionResolver, e3Var)) != null) {
            }
            e3Var.invoke(jc.w.f31842a);
            a0Var = new vc.a0();
            t3Var = s3Var.f42548x;
            if (t3Var != null) {
                u3VarA = t3Var.a();
                if (u3VarA == null) {
                    strA = null;
                } else {
                    strA = u3VarA.a();
                }
                if (strA == null) {
                    return;
                } else {
                    a0Var.f36988c = s3Var.F;
                }
            } else {
                strA = s3Var.F;
            }
            hVar.d(r2Var.f32796c.a(kVar, strA, new i3(a0Var2, hVar, new j3(a0Var, kVar))));
        }
        y9.i2 i2Var = (y9.i2) u3VarA2;
        hVar.d(i2Var.f40568b.e(expressionResolver, e3Var));
        for (y9.i2.b bVar7 : i2Var.f40569c) {
            hVar.d(bVar7.f40576a.e(expressionResolver, e3Var));
            v9.b<String> bVar8 = bVar7.f40578c;
            if (bVar8 != null) {
                hVar.d(bVar8.e(expressionResolver, e3Var));
            }
            hVar.d(bVar7.f40577b.e(expressionResolver, e3Var));
        }
        dVarE = i2Var.f40567a.e(expressionResolver, e3Var);
        hVar.d(dVarE);
        e3Var.invoke(jc.w.f31842a);
        a0Var = new vc.a0();
        t3Var = s3Var.f42548x;
        if (t3Var != null) {
            u3VarA = t3Var.a();
            if (u3VarA == null) {
                strA = null;
            } else {
                strA = u3VarA.a();
            }
            if (strA == null) {
                return;
            } else {
                a0Var.f36988c = s3Var.F;
            }
        } else {
            strA = s3Var.F;
        }
        hVar.d(r2Var.f32796c.a(kVar, strA, new i3(a0Var2, hVar, new j3(a0Var, kVar))));
    }

    public final void k(View view, r4 r4Var, k kVar, c8.e eVar) {
        int iIntValue;
        o3 o3Var = this.f31448i;
        o8.l lVar = (o8.l) view;
        Objects.requireNonNull(o3Var);
        fd.j0.i(r4Var, "div");
        String str = r4Var.f42304m;
        if (str != null) {
            i6 i6Var = o3Var.f32678f;
            Objects.requireNonNull(i6Var);
            i6Var.f32458a.put(str, lVar);
        }
        v9.d expressionResolver = kVar.getExpressionResolver();
        r4 div$div_release = lVar.getDiv$div_release();
        if (fd.j0.d(r4Var, div$div_release)) {
            RecyclerView.g adapter = lVar.getViewPager().getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.DivPagerBinder.PagerAdapter");
            o3.c cVar = (o3.c) adapter;
            if (cVar.c(o3Var.f32676d)) {
                return;
            }
            cVar.notifyItemRangeChanged(0, cVar.getItemCount());
            return;
        }
        f9.b bVarI = x1.q.i(lVar);
        bVarI.g();
        lVar.setDiv$div_release(r4Var);
        if (div$div_release != null) {
            o3Var.f32673a.i(lVar, div$div_release, kVar);
        }
        o3Var.f32673a.e(lVar, r4Var, div$div_release, kVar);
        SparseArray sparseArray = new SparseArray();
        lVar.setRecycledViewPool(new n6(kVar.getReleaseViewVisitor$div_release()));
        ViewPager2 viewPager = lVar.getViewPager();
        List<y9.k> list = r4Var.f42306o;
        u uVar = o3Var.f32675c.get();
        fd.j0.h(uVar, "divBinder.get()");
        viewPager.setAdapter(new o3.c(list, kVar, uVar, new p3(sparseArray, r4Var, expressionResolver), o3Var.f32674b, eVar, kVar.getReleaseViewVisitor$div_release()));
        l8.s3 s3Var = new l8.s3(o3Var, lVar, r4Var, expressionResolver, sparseArray);
        bVarI.d(r4Var.f42310s.f44033b.e(expressionResolver, s3Var));
        bVarI.d(r4Var.f42310s.f44034c.e(expressionResolver, s3Var));
        bVarI.d(r4Var.f42310s.f44035d.e(expressionResolver, s3Var));
        bVarI.d(r4Var.f42310s.f44032a.e(expressionResolver, s3Var));
        bVarI.d(r4Var.f42305n.f41216b.e(expressionResolver, s3Var));
        bVarI.d(r4Var.f42305n.f41215a.e(expressionResolver, s3Var));
        s4 s4Var = r4Var.f42307p;
        if (s4Var instanceof s4.c) {
            s4.c cVar2 = (s4.c) s4Var;
            bVarI.d(cVar2.f42566c.f41096a.f41216b.e(expressionResolver, s3Var));
            bVarI.d(cVar2.f42566c.f41096a.f41215a.e(expressionResolver, s3Var));
        } else {
            if (!(s4Var instanceof s4.d)) {
                throw new jc.g();
            }
            bVarI.d(((s4.d) s4Var).f42567c.f41821a.f44089a.e(expressionResolver, s3Var));
            bVarI.d(new l8.t3(lVar.getViewPager(), s3Var));
        }
        bVarI.d(r4Var.f42309r.f(expressionResolver, new q3(lVar, o3Var, r4Var, expressionResolver, sparseArray)));
        k6 k6Var = o3Var.f32681i;
        if (k6Var != null) {
            ViewPager2 viewPager2 = lVar.getViewPager();
            fd.j0.i(viewPager2, "viewPager");
            ViewPager2.g gVar = k6Var.f32539d;
            if (gVar != null) {
                viewPager2.f3011e.f3049a.remove(gVar);
            }
            k6Var.f32539d = null;
        }
        k6 k6Var2 = new k6(kVar, r4Var, o3Var.f32677e);
        ViewPager2 viewPager3 = lVar.getViewPager();
        fd.j0.i(viewPager3, "viewPager");
        k6.a aVar = new k6.a(k6Var2);
        viewPager3.f3011e.f3049a.add(aVar);
        k6Var2.f32539d = aVar;
        o3Var.f32681i = k6Var2;
        if (o3Var.f32680h != null) {
            ViewPager2 viewPager4 = lVar.getViewPager();
            ViewPager2.g gVar2 = o3Var.f32680h;
            fd.j0.f(gVar2);
            viewPager4.f3011e.f3049a.remove(gVar2);
        }
        View childAt = lVar.getViewPager().getChildAt(0);
        Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        o3Var.f32680h = new o3.a(r4Var, kVar, (RecyclerView) childAt);
        ViewPager2 viewPager5 = lVar.getViewPager();
        ViewPager2.g gVar3 = o3Var.f32680h;
        fd.j0.f(gVar3);
        viewPager5.f3011e.f3049a.add(gVar3);
        c8.f currentState = kVar.getCurrentState();
        if (currentState != null) {
            String strValueOf = r4Var.f42304m;
            if (strValueOf == null) {
                strValueOf = String.valueOf(r4Var.hashCode());
            }
            c8.h hVar = (c8.h) currentState.f3635b.get(strValueOf);
            if (o3Var.f32679g != null) {
                ViewPager2 viewPager6 = lVar.getViewPager();
                ViewPager2.g gVar4 = o3Var.f32679g;
                fd.j0.f(gVar4);
                viewPager6.f3011e.f3049a.remove(gVar4);
            }
            o3Var.f32679g = new c8.l(strValueOf, currentState);
            ViewPager2 viewPager7 = lVar.getViewPager();
            ViewPager2.g gVar5 = o3Var.f32679g;
            fd.j0.f(gVar5);
            viewPager7.f3011e.f3049a.add(gVar5);
            Integer numValueOf = hVar != null ? Integer.valueOf(hVar.f3638a) : null;
            if (numValueOf == null) {
                long jLongValue = r4Var.f42299h.b(expressionResolver).longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    iIntValue = (int) jLongValue;
                } else {
                    int i10 = e9.a.f29114a;
                    iIntValue = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else {
                iIntValue = numValueOf.intValue();
            }
            lVar.setCurrentItem$div_release(iIntValue);
        }
        bVarI.d(r4Var.f42311t.f(expressionResolver, new r3(lVar)));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l(View view, z5 z5Var, k kVar) {
        h4 h4Var = this.f31455p;
        o8.n nVar = (o8.n) view;
        Objects.requireNonNull(h4Var);
        fd.j0.i(z5Var, "div");
        z5 div = nVar.getDiv();
        if (fd.j0.d(z5Var, div)) {
            return;
        }
        v9.d expressionResolver = kVar.getExpressionResolver();
        nVar.g();
        q8.d dVarA = h4Var.f32424d.a(kVar.getDataTag(), kVar.getDivData());
        nVar.setDiv(z5Var);
        if (div != null) {
            h4Var.f32421a.i(nVar, div, kVar);
        }
        h4Var.f32421a.e(nVar, z5Var, div, kVar);
        nVar.setTextAlignment(5);
        v9.d expressionResolver2 = kVar.getExpressionResolver();
        l8.b.P(nVar, kVar, j8.h.f31766a, null);
        v9.d expressionResolver3 = kVar.getExpressionResolver();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : z5Var.f44665v) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kc.l.i();
                throw null;
            }
            z5.h hVar = (z5.h) obj;
            v9.b<String> bVar = hVar.f44678a;
            if (bVar == null) {
                bVar = hVar.f44679b;
            }
            arrayList.add(bVar.b(expressionResolver3));
            bVar.e(expressionResolver3, new y3(arrayList, i10, nVar));
            i10 = i11;
        }
        nVar.setItems(arrayList);
        nVar.setOnItemSelectedListener(new x3(nVar, arrayList, z5Var, expressionResolver2));
        h4Var.f32423c.a(kVar, z5Var.G, new g4(z5Var, nVar, dVarA, kVar.getExpressionResolver()));
        z3 z3Var = new z3(z5Var, expressionResolver, nVar);
        nVar.d(z5Var.f44655l.f(expressionResolver, z3Var));
        nVar.d(z5Var.f44662s.e(expressionResolver, z3Var));
        nVar.d(z5Var.f44656m.e(expressionResolver, z3Var));
        e4 e4Var = new e4(nVar, h4Var, z5Var, expressionResolver);
        nVar.d(z5Var.f44654k.f(expressionResolver, e4Var));
        nVar.d(z5Var.f44657n.e(expressionResolver, e4Var));
        nVar.d(z5Var.f44669z.f(expressionResolver, new d4(nVar)));
        v9.b<Long> bVar2 = z5Var.f44663t;
        if (bVar2 == null) {
            l8.b.h(nVar, null, z5Var.f44656m.b(expressionResolver));
        } else {
            c4 c4Var = new c4(bVar2, expressionResolver, z5Var, nVar);
            nVar.d(bVar2.f(expressionResolver, c4Var));
            nVar.d(z5Var.f44656m.e(expressionResolver, c4Var));
        }
        v9.b<String> bVar3 = z5Var.f44660q;
        if (bVar3 != null) {
            nVar.d(bVar3.f(expressionResolver, new b4(nVar)));
        }
        nVar.d(z5Var.f44659p.f(expressionResolver, new a4(nVar)));
    }

    public final void m(View view, d6 d6Var, k kVar) {
        l4 l4Var = this.f31443d;
        o8.o oVar = (o8.o) view;
        Objects.requireNonNull(l4Var);
        fd.j0.i(d6Var, "div");
        d6 div$div_release = oVar.getDiv$div_release();
        if (fd.j0.d(d6Var, div$div_release)) {
            return;
        }
        v9.d expressionResolver = kVar.getExpressionResolver();
        oVar.g();
        oVar.setDiv$div_release(d6Var);
        if (div$div_release != null) {
            l4Var.f32560a.i(oVar, div$div_release, kVar);
        }
        l4Var.f32560a.e(oVar, d6Var, div$div_release, kVar);
        l8.b.c(oVar, kVar, d6Var.f39655b, d6Var.f39657d, d6Var.f39671r, d6Var.f39666m, d6Var.f39656c);
        d6.e eVar = d6Var.f39664k;
        v9.b<Integer> bVar = eVar == null ? null : eVar.f39688a;
        if (bVar == null) {
            oVar.setDividerColor(0);
        } else {
            oVar.d(bVar.f(expressionResolver, new j4(oVar)));
        }
        v9.b<d6.e.d> bVar2 = eVar != null ? eVar.f39689b : null;
        if (bVar2 == null) {
            oVar.setHorizontal(false);
        } else {
            oVar.d(bVar2.f(expressionResolver, new k4(oVar)));
        }
        oVar.setDividerHeightResource(R.dimen.div_separator_delimiter_height);
        oVar.setDividerGravity(17);
    }

    public final void n(View view, s6 s6Var, k kVar) {
        p4 p4Var = this.f31453n;
        o8.p pVar = (o8.p) view;
        Objects.requireNonNull(p4Var);
        fd.j0.i(s6Var, "div");
        s6 div$div_release = pVar.getDiv$div_release();
        p4Var.f32745g = p4Var.f32743e.a(kVar.getDataTag(), kVar.getDivData());
        if (fd.j0.d(s6Var, div$div_release)) {
            return;
        }
        v9.d expressionResolver = kVar.getExpressionResolver();
        pVar.g();
        pVar.setDiv$div_release(s6Var);
        if (div$div_release != null) {
            p4Var.f32739a.i(pVar, div$div_release, kVar);
        }
        p4Var.f32739a.e(pVar, s6Var, div$div_release, kVar);
        pVar.d(s6Var.f42614o.f(expressionResolver, new n4(pVar, p4Var)));
        pVar.d(s6Var.f42613n.f(expressionResolver, new o4(pVar, p4Var)));
        p7.i1<r9.d.b> i1Var = pVar.f35314d;
        i1Var.f34519e = 0;
        jc.w wVar = null;
        if (i1Var.f34518d == 0) {
            i1Var.f34517c.clear();
        } else {
            int size = i1Var.f34517c.size();
            i1Var.f34520f |= size != 0;
            for (int i10 = 0; i10 < size; i10++) {
                i1Var.f34517c.set(i10, null);
            }
        }
        String str = s6Var.f42623x;
        if (str != null) {
            pVar.d(p4Var.f32742d.a(kVar, str, new v4(pVar, p4Var, kVar)));
        }
        l8.b.L(pVar, expressionResolver, s6Var.f42621v, new t4(p4Var, pVar, expressionResolver));
        s6.e eVar = s6Var.f42622w;
        p4Var.b(pVar, expressionResolver, eVar);
        if (eVar != null) {
            pVar.d(eVar.f42641e.e(expressionResolver, new u4(p4Var, pVar, expressionResolver, eVar)));
        }
        String str2 = s6Var.f42620u;
        if (str2 == null) {
            pVar.setThumbSecondaryDrawable(null);
            pVar.p(null, false, true);
        } else {
            pVar.d(p4Var.f32742d.a(kVar, str2, new l8.s4(pVar, p4Var, kVar)));
            v1 v1Var = s6Var.f42618s;
            if (v1Var != null) {
                l8.b.L(pVar, expressionResolver, v1Var, new q4(p4Var, pVar, expressionResolver));
                wVar = jc.w.f31842a;
            }
            if (wVar == null) {
                l8.b.L(pVar, expressionResolver, s6Var.f42621v, new q4(p4Var, pVar, expressionResolver));
            }
            s6.e eVar2 = s6Var.f42619t;
            p4Var.a(pVar, expressionResolver, eVar2);
            if (eVar2 != null) {
                pVar.d(eVar2.f42641e.e(expressionResolver, new l8.r4(p4Var, pVar, expressionResolver, eVar2)));
            }
        }
        l8.b.L(pVar, expressionResolver, s6Var.B, new y4(p4Var, pVar, expressionResolver));
        l8.b.L(pVar, expressionResolver, s6Var.C, new z4(p4Var, pVar, expressionResolver));
        v1 v1Var2 = s6Var.f42624y;
        if (v1Var2 != null) {
            l8.b.L(pVar, expressionResolver, v1Var2, new w4(p4Var, pVar, expressionResolver));
        }
        v1 v1Var3 = s6Var.f42625z;
        if (v1Var3 == null) {
            return;
        }
        l8.b.L(pVar, expressionResolver, v1Var3, new x4(p4Var, pVar, expressionResolver));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0201  */
    /* JADX WARN: Code duplicated, block: B:104:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x021b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0220  */
    /* JADX WARN: Code duplicated, block: B:110:0x0224  */
    /* JADX WARN: Code duplicated, block: B:114:0x0230  */
    /* JADX WARN: Code duplicated, block: B:120:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0294  */
    /* JADX WARN: Code duplicated, block: B:124:0x0299  */
    /* JADX WARN: Code duplicated, block: B:126:0x029d  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:161:0x0363  */
    /* JADX WARN: Code duplicated, block: B:162:0x0365  */
    /* JADX WARN: Code duplicated, block: B:164:0x0377  */
    /* JADX WARN: Code duplicated, block: B:167:0x038a A[LOOP:6: B:165:0x0381->B:167:0x038a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:239:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0398 A[EDGE_INSN: B:248:0x0398->B:168:0x0398 BREAK  A[LOOP:6: B:165:0x0381->B:167:0x038a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0176  */
    /* JADX WARN: Code duplicated, block: B:75:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fe A[ADDED_TO_REGION] */
    public final void o(View view, x6 x6Var, k kVar, c8.e eVar) {
        String strA;
        Object next;
        Object next2;
        x6.f fVar;
        y9.g0 g0Var;
        y9.k kVar2;
        View viewN;
        View view2;
        boolean z10;
        Iterator<View> it;
        p0.j0 j0Var;
        x6.f fVar2;
        y9.g0 g0VarA;
        View viewN2;
        v9.d expressionResolver;
        y9.v vVar;
        y9.v vVar2;
        r1.p pVar;
        r1.p pVarA;
        List<y9.v> listA;
        r1.l lVarA;
        List listA2;
        Iterator it2;
        y9.v vVar3;
        r1.l lVarA2;
        boolean z11;
        boolean z12;
        c0 c0VarC;
        t8.g gVar;
        dd.g<? extends y9.k> gVarD;
        y9.k kVar3;
        dd.g<? extends y9.k> gVarD2;
        y9.k kVar4;
        boolean z13;
        j5 j5Var = this.f31450k;
        o8.r rVar = (o8.r) view;
        Objects.requireNonNull(j5Var);
        fd.j0.i(x6Var, "div");
        x6 divState$div_release = rVar.getDivState$div_release();
        y9.k activeStateDiv$div_release = rVar.getActiveStateDiv$div_release();
        rVar.setDivState$div_release(x6Var);
        if (divState$div_release != null) {
            j5Var.f32506a.i(rVar, divState$div_release, kVar);
        }
        j5Var.f32506a.e(rVar, x6Var, divState$div_release, kVar);
        v9.d expressionResolver2 = kVar.getExpressionResolver();
        String str = kVar.getDivTag().f33995a;
        fd.j0.h(str, "divView.divTag.id");
        e5 e5Var = new e5(j5Var, kVar, eVar);
        String str2 = x6Var.f44138j;
        if (str2 == null && (str2 = x6Var.f44142n) == null) {
            e5Var.invoke();
            str2 = "";
        }
        String str3 = eVar + '/' + str2;
        c8.j jVar = j5Var.f32510e;
        Objects.requireNonNull(jVar);
        fd.j0.i(str3, "path");
        synchronized (jVar.f3639a) {
            Map<String, String> map = jVar.f3639a.get(str);
            strA = map == null ? null : map.get(str3);
        }
        if (strA == null) {
            strA = j5Var.f32509d.a(str, str3);
        }
        Iterator<T> it3 = x6Var.f44147s.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!fd.j0.d(((x6.f) next).f44165d, rVar.getStateId()));
        x6.f fVarC = (x6.f) next;
        if (fVarC == null) {
            fVarC = f8.b.c(x6Var, expressionResolver2);
        }
        Iterator<T> it4 = x6Var.f44147s.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!fd.j0.d(((x6.f) next2).f44165d, strA));
        x6.f fVarC2 = (x6.f) next2;
        if (fVarC2 == null) {
            fVarC2 = f8.b.c(x6Var, expressionResolver2);
        }
        String str4 = fVarC2.f44165d;
        fd.j0.i(str4, "stateId");
        List listJ = kc.t.J(eVar.f3633b);
        ((ArrayList) listJ).add(new jc.h(str2, str4));
        c8.e eVar2 = new c8.e(eVar.f3632a, listJ);
        y9.k kVar5 = fVarC2.f44164c;
        y9.g0 g0VarA2 = kVar5 == null ? null : kVar5.a();
        View childAt = rVar.getChildCount() > 0 ? rVar.getChildAt(0) : null;
        if (fd.j0.d(rVar.getStateId(), fVarC2.f44165d)) {
            fVar = fVarC2;
            g0Var = g0VarA2;
            if (g0Var != null) {
                if (childAt != null) {
                    z10 = j8.a.b(kVar2, kVar5, expressionResolver2);
                    if (z10) {
                        viewN = childAt;
                    } else {
                        viewN = j5Var.f32507b.n(kVar5, expressionResolver2);
                        viewN.setLayoutParams(new m9.d(-1, -2));
                    }
                    if (!z10) {
                        kVar2 = activeStateDiv$div_release;
                        kVar2 = activeStateDiv$div_release;
                        it = ((p0.i0.a) p0.i0.b(rVar)).iterator();
                        while (true) {
                            j0Var = (p0.j0) it;
                            if (j0Var.hasNext()) {
                                break;
                            } else {
                                u1.a.u(kVar.getReleaseViewVisitor$div_release(), (View) j0Var.next());
                            }
                        }
                        rVar.removeAllViews();
                        rVar.addView(viewN);
                    }
                    if (viewN != null) {
                        j5Var.f32508c.get().b(viewN, kVar5, kVar, eVar2);
                    }
                } else {
                    kVar2 = activeStateDiv$div_release;
                }
                kVar2 = activeStateDiv$div_release;
                if (z10) {
                    viewN = childAt;
                } else {
                    viewN = j5Var.f32507b.n(kVar5, expressionResolver2);
                    viewN.setLayoutParams(new m9.d(-1, -2));
                }
                if (!z10) {
                    kVar2 = activeStateDiv$div_release;
                    kVar2 = activeStateDiv$div_release;
                    it = ((p0.i0.a) p0.i0.b(rVar)).iterator();
                    while (true) {
                        j0Var = (p0.j0) it;
                        if (j0Var.hasNext()) {
                            break;
                            break;
                        }
                        u1.a.u(kVar.getReleaseViewVisitor$div_release(), (View) j0Var.next());
                    }
                    rVar.removeAllViews();
                    rVar.addView(viewN);
                }
                if (viewN != null) {
                    j5Var.f32508c.get().b(viewN, kVar5, kVar, eVar2);
                }
            } else {
                kVar2 = activeStateDiv$div_release;
                Iterator<View> it5 = ((p0.i0.a) p0.i0.b(rVar)).iterator();
                while (true) {
                    p0.j0 j0Var2 = (p0.j0) it5;
                    if (!j0Var2.hasNext()) {
                        break;
                    } else {
                        u1.a.u(kVar.getReleaseViewVisitor$div_release(), (View) j0Var2.next());
                    }
                }
                rVar.removeAllViews();
                viewN = null;
            }
            view2 = viewN;
        } else {
            if (kVar5 != null) {
                viewN2 = j5Var.f32507b.n(kVar5, expressionResolver2);
                viewN2.setLayoutParams(new m9.d(-1, -2));
            } else {
                viewN2 = null;
            }
            y9.k kVar6 = fVarC == null ? null : fVarC.f44164c;
            y9.k kVar7 = fVarC2.f44164c;
            v9.d expressionResolver3 = kVar.getExpressionResolver();
            fd.j0.i(expressionResolver3, "resolver");
            b8 b8VarB = x6Var.f44150v.b(expressionResolver3);
            fd.j0.i(b8VarB, "<this>");
            int i10 = j8.c.a.f31727a[b8VarB.ordinal()];
            if (i10 == 2 || i10 == 3) {
                if (kVar6 == null) {
                    z12 = true;
                } else {
                    z11 = true;
                    if (f8.b.a(kVar6)) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (!z11) {
                        if (kVar7 == null && f8.b.a(kVar7) == z12) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            expressionResolver = kVar.getExpressionResolver();
                            vVar = fVarC2.f44162a;
                            if (fVarC == null) {
                                vVar2 = null;
                            } else {
                                vVar2 = fVarC.f44163b;
                            }
                            if (vVar == null) {
                            }
                            pVar = new r1.p();
                            if (vVar != null) {
                                if (vVar.f43392e.b(expressionResolver) != y9.v.e.SET) {
                                    listA2 = kc.k.a(vVar);
                                } else {
                                    listA2 = vVar.f43391d;
                                    if (listA2 == null) {
                                        listA2 = kc.w.f32009c;
                                    }
                                }
                                it2 = listA2.iterator();
                                while (it2.hasNext()) {
                                    vVar3 = (y9.v) it2.next();
                                    lVarA2 = k5.a(vVar3, true, expressionResolver);
                                    if (lVarA2 != null) {
                                        pVar.b(lVarA2.addTarget(viewN2).setDuration(vVar3.f43388a.b(expressionResolver).longValue()).setStartDelay(vVar3.f43393f.b(expressionResolver).longValue()).setInterpolator(f8.b.b(vVar3.f43390c.b(expressionResolver))));
                                        it2 = it2;
                                        fVarC2 = fVarC2;
                                        g0VarA2 = g0VarA2;
                                    }
                                }
                            }
                            fVar = fVarC2;
                            g0Var = g0VarA2;
                            if (vVar2 != null) {
                                if (vVar2.f43392e.b(expressionResolver) != y9.v.e.SET) {
                                    listA = kc.k.a(vVar2);
                                } else {
                                    listA = vVar2.f43391d;
                                    if (listA == null) {
                                        listA = kc.w.f32009c;
                                    }
                                }
                                for (y9.v vVar4 : listA) {
                                    lVarA = k5.a(vVar4, false, expressionResolver);
                                    if (lVarA != null) {
                                        pVar.b(lVarA.addTarget(childAt).setDuration(vVar4.f43388a.b(expressionResolver).longValue()).setStartDelay(vVar4.f43393f.b(expressionResolver).longValue()).setInterpolator(f8.b.b(vVar4.f43390c.b(expressionResolver))));
                                    }
                                }
                            }
                            if (childAt != null) {
                                childAt.clearAnimation();
                            }
                            pVarA = pVar;
                        }
                        pVarA = null;
                        fVar = fVarC2;
                        g0Var = g0VarA2;
                    }
                    c0VarC = ((r7.a.c) kVar.getViewComponent$div_release()).c();
                    gVar = ((r7.a.c) kVar.getViewComponent$div_release()).f35257i.get();
                    if (fd.j0.d(fVarC2, fVarC)) {
                        pVarA = null;
                    } else {
                        if (fVarC == null && (kVar4 = fVarC.f44164c) != null) {
                            gVarD = dd.q.d(u1.a.v(kVar4).b(f5.f32379c), g5.f32405c);
                        } else {
                            gVarD = null;
                        }
                        kVar3 = fVarC2.f44164c;
                        if (kVar3 == null) {
                            gVarD2 = null;
                        } else {
                            gVarD2 = dd.q.d(u1.a.v(kVar3).b(h5.f32425c), i5.f32457c);
                        }
                        pVarA = c0VarC.a(gVarD, gVarD2, expressionResolver3);
                        Objects.requireNonNull(gVar);
                        gVar.f35717b.add(pVarA);
                        if (!gVar.f35718c) {
                            k kVar8 = gVar.f35716a;
                            p0.x.a(kVar8, new t8.f(kVar8, gVar));
                            gVar.f35718c = true;
                        }
                    }
                    fVar = fVarC2;
                    g0Var = g0VarA2;
                }
                z11 = false;
                if (!z11) {
                    if (kVar7 == null) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        expressionResolver = kVar.getExpressionResolver();
                        vVar = fVarC2.f44162a;
                        if (fVarC == null) {
                            vVar2 = null;
                        } else {
                            vVar2 = fVarC.f44163b;
                        }
                        if (vVar == null) {
                        }
                        pVar = new r1.p();
                        if (vVar != null) {
                            if (vVar.f43392e.b(expressionResolver) != y9.v.e.SET) {
                                listA2 = kc.k.a(vVar);
                            } else {
                                listA2 = vVar.f43391d;
                                if (listA2 == null) {
                                    listA2 = kc.w.f32009c;
                                }
                            }
                            it2 = listA2.iterator();
                            while (it2.hasNext()) {
                                vVar3 = (y9.v) it2.next();
                                lVarA2 = k5.a(vVar3, true, expressionResolver);
                                if (lVarA2 != null) {
                                    pVar.b(lVarA2.addTarget(viewN2).setDuration(vVar3.f43388a.b(expressionResolver).longValue()).setStartDelay(vVar3.f43393f.b(expressionResolver).longValue()).setInterpolator(f8.b.b(vVar3.f43390c.b(expressionResolver))));
                                    it2 = it2;
                                    fVarC2 = fVarC2;
                                    g0VarA2 = g0VarA2;
                                }
                            }
                        }
                        fVar = fVarC2;
                        g0Var = g0VarA2;
                        if (vVar2 != null) {
                            if (vVar2.f43392e.b(expressionResolver) != y9.v.e.SET) {
                                listA = kc.k.a(vVar2);
                            } else {
                                listA = vVar2.f43391d;
                                if (listA == null) {
                                    listA = kc.w.f32009c;
                                }
                            }
                            while (r2.hasNext()) {
                                lVarA = k5.a(vVar4, false, expressionResolver);
                                if (lVarA != null) {
                                    pVar.b(lVarA.addTarget(childAt).setDuration(vVar4.f43388a.b(expressionResolver).longValue()).setStartDelay(vVar4.f43393f.b(expressionResolver).longValue()).setInterpolator(f8.b.b(vVar4.f43390c.b(expressionResolver))));
                                }
                            }
                        }
                        if (childAt != null) {
                            childAt.clearAnimation();
                        }
                        pVarA = pVar;
                    }
                    pVarA = null;
                    fVar = fVarC2;
                    g0Var = g0VarA2;
                }
                c0VarC = ((r7.a.c) kVar.getViewComponent$div_release()).c();
                gVar = ((r7.a.c) kVar.getViewComponent$div_release()).f35257i.get();
                if (fd.j0.d(fVarC2, fVarC)) {
                    pVarA = null;
                } else {
                    if (fVarC == null) {
                        gVarD = null;
                    } else {
                        gVarD = dd.q.d(u1.a.v(kVar4).b(f5.f32379c), g5.f32405c);
                    }
                    kVar3 = fVarC2.f44164c;
                    if (kVar3 == null) {
                        gVarD2 = null;
                    } else {
                        gVarD2 = dd.q.d(u1.a.v(kVar3).b(h5.f32425c), i5.f32457c);
                    }
                    pVarA = c0VarC.a(gVarD, gVarD2, expressionResolver3);
                    Objects.requireNonNull(gVar);
                    gVar.f35717b.add(pVarA);
                    if (!gVar.f35718c) {
                        k kVar9 = gVar.f35716a;
                        p0.x.a(kVar9, new t8.f(kVar9, gVar));
                        gVar.f35718c = true;
                    }
                }
                fVar = fVarC2;
                g0Var = g0VarA2;
            } else {
                expressionResolver = kVar.getExpressionResolver();
                vVar = fVarC2.f44162a;
                if (fVarC == null) {
                    vVar2 = null;
                } else {
                    vVar2 = fVarC.f44163b;
                }
                if (vVar == null || vVar2 != null) {
                    pVar = new r1.p();
                    if (vVar != null && viewN2 != null) {
                        if (vVar.f43392e.b(expressionResolver) != y9.v.e.SET) {
                            listA2 = kc.k.a(vVar);
                        } else {
                            listA2 = vVar.f43391d;
                            if (listA2 == null) {
                                listA2 = kc.w.f32009c;
                            }
                        }
                        it2 = listA2.iterator();
                        while (it2.hasNext()) {
                            vVar3 = (y9.v) it2.next();
                            lVarA2 = k5.a(vVar3, true, expressionResolver);
                            if (lVarA2 != null) {
                                pVar.b(lVarA2.addTarget(viewN2).setDuration(vVar3.f43388a.b(expressionResolver).longValue()).setStartDelay(vVar3.f43393f.b(expressionResolver).longValue()).setInterpolator(f8.b.b(vVar3.f43390c.b(expressionResolver))));
                                it2 = it2;
                                fVarC2 = fVarC2;
                                g0VarA2 = g0VarA2;
                            }
                        }
                    }
                    fVar = fVarC2;
                    g0Var = g0VarA2;
                    if (vVar2 != null && childAt != null) {
                        if (vVar2.f43392e.b(expressionResolver) != y9.v.e.SET) {
                            listA = kc.k.a(vVar2);
                        } else {
                            listA = vVar2.f43391d;
                            if (listA == null) {
                                listA = kc.w.f32009c;
                            }
                        }
                        while (r2.hasNext()) {
                            lVarA = k5.a(vVar4, false, expressionResolver);
                            if (lVarA != null) {
                                pVar.b(lVarA.addTarget(childAt).setDuration(vVar4.f43388a.b(expressionResolver).longValue()).setStartDelay(vVar4.f43393f.b(expressionResolver).longValue()).setInterpolator(f8.b.b(vVar4.f43390c.b(expressionResolver))));
                            }
                        }
                    }
                    if (childAt != null) {
                        childAt.clearAnimation();
                    }
                    pVarA = pVar;
                } else {
                    pVarA = null;
                    fVar = fVarC2;
                    g0Var = g0VarA2;
                }
            }
            if (pVarA != null) {
                r1.n.b(rVar);
                r1.n.a(rVar, pVarA);
            }
            Iterator<View> it6 = ((p0.i0.a) p0.i0.b(rVar)).iterator();
            while (true) {
                p0.j0 j0Var3 = (p0.j0) it6;
                if (!j0Var3.hasNext()) {
                    break;
                } else {
                    u1.a.u(kVar.getReleaseViewVisitor$div_release(), (View) j0Var3.next());
                }
            }
            rVar.removeAllViews();
            if (viewN2 != null) {
                rVar.addView(viewN2);
                if (kVar5 != null) {
                    j5Var.f32508c.get().b(viewN2, kVar5, kVar, eVar2);
                }
            }
            if (childAt != null) {
                j8.b divTransitionHandler$div_release = kVar.getDivTransitionHandler$div_release();
                Objects.requireNonNull(divTransitionHandler$div_release);
                divTransitionHandler$div_release.f31719d = false;
                divTransitionHandler$div_release.a(rVar, false);
            }
            view2 = viewN2;
            kVar2 = activeStateDiv$div_release;
        }
        if (childAt != null) {
            childAt.startAnimation(new AnimationSet(false));
            fVar2 = fVar;
            if (!fd.j0.d(divState$div_release, x6Var) || !fd.j0.d(fVar2, fVarC)) {
                kVar.G(childAt);
                if (kVar2 != null) {
                    j5Var.f32515j.d(kVar, null, kVar2, (8 & 8) != 0 ? l8.b.A(kVar2.a()) : null);
                    j5Var.a(childAt, kVar);
                }
            }
        } else {
            fVar2 = fVar;
        }
        if (view2 != null && g0Var != null && (g0Var.n() != null || g0Var.c() != null)) {
            kVar.p(view2, kVar5);
            view2.addOnLayoutChangeListener(new b5(j5Var, kVar, view2, kVar5));
        }
        y9.k activeStateDiv$div_release2 = rVar.getActiveStateDiv$div_release();
        String id2 = (activeStateDiv$div_release2 == null || (g0VarA = activeStateDiv$div_release2.a()) == null) ? null : g0VarA.getId();
        if (id2 != null) {
            List<View> listA3 = j5Var.f32512g.a(kVar, id2);
            View view3 = listA3 == null ? null : (View) kc.t.s(listA3);
            List<y9.k> listA4 = j5Var.f32513h.a(kVar.getDataTag(), id2);
            y9.k kVar10 = listA4 == null ? null : (y9.k) kc.t.s(listA4);
            if (view3 != null && kVar10 != null) {
                Iterator<View> it7 = ((p0.i0.a) p0.i0.b(rVar)).iterator();
                while (true) {
                    p0.j0 j0Var4 = (p0.j0) it7;
                    if (!j0Var4.hasNext()) {
                        break;
                    } else {
                        u1.a.u(kVar.getReleaseViewVisitor$div_release(), (View) j0Var4.next());
                    }
                }
                rVar.removeAllViews();
                rVar.addView(view3);
                if (l8.b.B(kVar10.a())) {
                    kVar.p(view3, kVar10);
                }
                j5Var.f32508c.get().b(view3, kVar10, kVar, eVar2);
            }
        }
        List<y9.q> list = fVar2.f44166e;
        if (list != null) {
            rVar.setSwipeOutCallback(new d5(kVar, list, j5Var, rVar));
        } else {
            rVar.setSwipeOutCallback(null);
        }
        rVar.setActiveStateDiv$div_release(kVar5);
        rVar.setPath(eVar2);
    }

    public final void p(View view, f7 f7Var, k kVar, c8.e eVar) {
        int i10;
        Long l10;
        n8.c divTabsAdapter;
        f7 f7Var2;
        n8.d dVar = this.f31449j;
        t9.t tVar = (t9.t) view;
        Objects.requireNonNull(dVar);
        fd.j0.i(f7Var, "div");
        f7 div = tVar.getDiv();
        v9.d expressionResolver = kVar.getExpressionResolver();
        tVar.setDiv(f7Var);
        int i11 = 0;
        if (div != null) {
            dVar.f33640a.i(tVar, div, kVar);
            if (fd.j0.d(div, f7Var) && (divTabsAdapter = tVar.getDivTabsAdapter()) != null) {
                fd.j0.i(expressionResolver, "resolver");
                s7.g gVar = divTabsAdapter.f33636v;
                o7.a dataTag = divTabsAdapter.f33631q.getDataTag();
                Objects.requireNonNull(gVar);
                fd.j0.i(dataTag, "tag");
                s7.l orDefault = gVar.f35477a.getOrDefault(dataTag, null);
                if (orDefault == null) {
                    f7Var2 = null;
                } else {
                    f7Var2 = (f7) new s7.f(orDefault).a(new y9.k.p(f7Var), expressionResolver).get(0).a();
                    DisplayMetrics displayMetrics = divTabsAdapter.f33631q.getResources().getDisplayMetrics();
                    List<f7.e> list = f7Var2.f40008o;
                    ArrayList arrayList = new ArrayList(kc.m.j(list, 10));
                    for (f7.e eVar2 : list) {
                        fd.j0.h(displayMetrics, "displayMetrics");
                        arrayList.add(new n8.a(eVar2, displayMetrics, expressionResolver));
                    }
                    divTabsAdapter.e(new n8.b(arrayList, i11), divTabsAdapter.f35730d.getCurrentItem());
                }
                if (f7Var2 != null) {
                    tVar.setDiv(f7Var2);
                    return;
                }
            }
        }
        tVar.g();
        f9.b bVarI = x1.q.i(tVar);
        dVar.f33640a.e(tVar, f7Var, div, kVar);
        n8.m mVar = new n8.m(tVar, f7Var, expressionResolver);
        mVar.invoke(null);
        f7Var.f40019z.f44033b.e(expressionResolver, mVar);
        f7Var.f40019z.f44034c.e(expressionResolver, mVar);
        f7Var.f40019z.f44035d.e(expressionResolver, mVar);
        f7Var.f40019z.f44032a.e(expressionResolver, mVar);
        t9.q<?> titleLayout = tVar.getTitleLayout();
        n8.o oVar = new n8.o(f7Var, expressionResolver, titleLayout);
        oVar.invoke(null);
        f9.b bVarI2 = x1.q.i(titleLayout);
        v9.b<Long> bVar = f7Var.f40018y.f40054p;
        if (bVar != null) {
            bVarI2.d(bVar.e(expressionResolver, oVar));
        }
        bVarI2.d(f7Var.f40018y.f40046h.e(expressionResolver, oVar));
        bVarI2.d(f7Var.f40018y.f40055q.f44035d.e(expressionResolver, oVar));
        bVarI2.d(f7Var.f40018y.f40055q.f44032a.e(expressionResolver, oVar));
        bVarI2.d(f7Var.f40019z.f44035d.e(expressionResolver, oVar));
        bVarI2.d(f7Var.f40019z.f44032a.e(expressionResolver, oVar));
        f7.f fVar = f7Var.f40018y;
        dVar.a(tVar.getTitleLayout(), expressionResolver, fVar);
        f9.b bVarI3 = x1.q.i(tVar);
        n8.d.c(fVar.f40041c, bVarI3, expressionResolver, dVar, tVar, fVar);
        n8.d.c(fVar.f40039a, bVarI3, expressionResolver, dVar, tVar, fVar);
        n8.d.c(fVar.f40051m, bVarI3, expressionResolver, dVar, tVar, fVar);
        n8.d.c(fVar.f40049k, bVarI3, expressionResolver, dVar, tVar, fVar);
        v9.b<Long> bVar2 = fVar.f40044f;
        if (bVar2 != null) {
            n8.d.c(bVar2, bVarI3, expressionResolver, dVar, tVar, fVar);
        }
        y9.b1 b1Var = fVar.f40045g;
        n8.d.c(b1Var == null ? null : b1Var.f39126c, bVarI3, expressionResolver, dVar, tVar, fVar);
        y9.b1 b1Var2 = fVar.f40045g;
        n8.d.c(b1Var2 == null ? null : b1Var2.f39127d, bVarI3, expressionResolver, dVar, tVar, fVar);
        y9.b1 b1Var3 = fVar.f40045g;
        n8.d.c(b1Var3 == null ? null : b1Var3.f39125b, bVarI3, expressionResolver, dVar, tVar, fVar);
        y9.b1 b1Var4 = fVar.f40045g;
        n8.d.c(b1Var4 == null ? null : b1Var4.f39124a, bVarI3, expressionResolver, dVar, tVar, fVar);
        n8.d.c(fVar.f40052n, bVarI3, expressionResolver, dVar, tVar, fVar);
        n8.d.c(fVar.f40043e, bVarI3, expressionResolver, dVar, tVar, fVar);
        n8.d.c(fVar.f40042d, bVarI3, expressionResolver, dVar, tVar, fVar);
        tVar.getPagerLayout().setClipToPadding(false);
        y9.x1 x1Var = f7Var.f40016w;
        n8.i iVar = new n8.i(tVar, f7Var, expressionResolver);
        bVarI.d(x1Var.f44033b.e(expressionResolver, iVar));
        bVarI.d(x1Var.f44034c.e(expressionResolver, iVar));
        bVarI.d(x1Var.f44035d.e(expressionResolver, iVar));
        bVarI.d(x1Var.f44032a.e(expressionResolver, iVar));
        n8.c cVar = null;
        iVar.invoke(null);
        bVarI.d(f7Var.f40015v.f(expressionResolver, new n8.j(tVar)));
        bVarI.d(f7Var.f40005l.f(expressionResolver, new n8.k(tVar)));
        tVar.getTitleLayout().setOnScrollChangedListener(new com.applovin.exoplayer2.a.e(dVar, kVar));
        List<f7.e> list2 = f7Var.f40008o;
        ArrayList arrayList2 = new ArrayList(kc.m.j(list2, 10));
        for (f7.e eVar3 : list2) {
            DisplayMetrics displayMetrics2 = tVar.getResources().getDisplayMetrics();
            fd.j0.h(displayMetrics2, "view.resources.displayMetrics");
            arrayList2.add(new n8.a(eVar3, displayMetrics2, expressionResolver));
        }
        n8.c divTabsAdapter2 = tVar.getDivTabsAdapter();
        if (divTabsAdapter2 != null && divTabsAdapter2.f33630p == f7Var.f40002i.b(expressionResolver).booleanValue()) {
            cVar = divTabsAdapter2;
        }
        char c10 = 1;
        if (cVar != null) {
            cVar.f33635u = eVar;
            n8.v vVar = cVar.f33634t;
            Objects.requireNonNull(vVar);
            vVar.f33707f = f7Var;
            if (fd.j0.d(div, f7Var)) {
                cVar.d();
            } else {
                cVar.b(new n8.b(arrayList2, c10), expressionResolver, bVarI);
            }
        } else {
            long jLongValue = f7Var.f40014u.b(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                int i12 = e9.a.f29114a;
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            n8.d.b(dVar, kVar, f7Var, expressionResolver, tVar, this, eVar, arrayList2, i10);
        }
        List<f7.e> list3 = f7Var.f40008o;
        n8.e eVar4 = new n8.e(tVar);
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            l6 height = ((f7.e) it.next()).f40026a.a().getHeight();
            if (height instanceof l6.c) {
                l6.c cVar2 = (l6.c) height;
                bVarI.d(cVar2.f41239c.f41215a.e(expressionResolver, eVar4));
                bVarI.d(cVar2.f41239c.f41216b.e(expressionResolver, eVar4));
            }
        }
        n8.h hVar = new n8.h(dVar, tVar);
        bVarI.d(f7Var.f40002i.e(expressionResolver, new n8.f(tVar, f7Var, expressionResolver, dVar, kVar, this, eVar, arrayList2)));
        bVarI.d(f7Var.f40014u.e(expressionResolver, hVar));
        char c11 = (fd.j0.d(kVar.getPrevDataTag(), o7.a.f33994b) || fd.j0.d(kVar.getDataTag(), kVar.getPrevDataTag())) ? c10 : (char) 0;
        long jLongValue2 = f7Var.f40014u.b(expressionResolver).longValue();
        if (((c11 == 0 || (l10 = dVar.f33649j) == null || l10.longValue() != jLongValue2) ? (char) 0 : (char) 1) == 0) {
            hVar.invoke(Long.valueOf(jLongValue2));
        }
        bVarI.d(f7Var.f40017x.f(expressionResolver, new n8.g(tVar, dVar, f7Var)));
        bVarI.d(f7Var.f40011r.f(expressionResolver, new n8.l(tVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(View view, l7 l7Var, k kVar) {
        u6 u6Var;
        c7 c7Var;
        v9.b<Long> bVar;
        c7 c7Var2;
        v9.b<Integer> bVar2;
        v9.b<Long> bVar3;
        v9.b<Long> bVar4;
        m5 m5Var = this.f31441b;
        o8.i iVar = (o8.i) view;
        Objects.requireNonNull(m5Var);
        fd.j0.i(l7Var, "div");
        l7 div$div_release = iVar.getDiv$div_release();
        if (fd.j0.d(l7Var, div$div_release)) {
            return;
        }
        v9.d expressionResolver = kVar.getExpressionResolver();
        iVar.g();
        iVar.setDiv$div_release(l7Var);
        if (div$div_release != null) {
            m5Var.f32591a.i(iVar, div$div_release, kVar);
        }
        m5Var.f32591a.e(iVar, l7Var, div$div_release, kVar);
        l8.b.c(iVar, kVar, l7Var.f41270b, l7Var.f41272d, l7Var.A, l7Var.f41281m, l7Var.f41271c);
        iVar.setTypeface(m5Var.f32592b.a(l7Var.f41286r.b(expressionResolver), l7Var.f41289u.b(expressionResolver)));
        c6 c6Var = new c6(m5Var, iVar, l7Var, expressionResolver);
        iVar.d(l7Var.f41286r.e(expressionResolver, c6Var));
        iVar.d(l7Var.f41289u.e(expressionResolver, c6Var));
        v9.b<y9.t> bVar5 = l7Var.L;
        v9.b<y9.u> bVar6 = l7Var.M;
        m5Var.h(iVar, bVar5.b(expressionResolver), bVar6.b(expressionResolver));
        w5 w5Var = new w5(m5Var, iVar, bVar5, expressionResolver, bVar6);
        iVar.d(bVar5.e(expressionResolver, w5Var));
        iVar.d(bVar6.e(expressionResolver, w5Var));
        m5Var.d(iVar, expressionResolver, l7Var);
        r5 r5Var = new r5(m5Var, iVar, expressionResolver, l7Var);
        iVar.d(l7Var.f41287s.e(expressionResolver, r5Var));
        iVar.d(l7Var.f41293y.e(expressionResolver, r5Var));
        v9.b<Long> bVar7 = l7Var.f41294z;
        if (bVar7 == null) {
            l8.b.h(iVar, null, l7Var.f41288t.b(expressionResolver));
        } else {
            iVar.d(bVar7.f(expressionResolver, new s5(iVar, l7Var, expressionResolver)));
        }
        vc.y yVar = new vc.y();
        yVar.f37006c = l7Var.N.b(expressionResolver).intValue();
        vc.a0 a0Var = new vc.a0();
        v9.b<Integer> bVar8 = l7Var.f41285q;
        a0Var.f36988c = bVar8 == null ? 0 : bVar8.b(expressionResolver);
        l8.z5 z5Var = new l8.z5(iVar, a0Var, yVar);
        z5Var.invoke();
        l7Var.N.e(expressionResolver, new x5(yVar, z5Var));
        v9.b<Integer> bVar9 = l7Var.f41285q;
        if (bVar9 != null) {
            bVar9.e(expressionResolver, new y5(a0Var, z5Var));
        }
        iVar.d(l7Var.V.f(expressionResolver, new n5(m5Var, iVar)));
        iVar.d(l7Var.J.f(expressionResolver, new o5(m5Var, iVar)));
        v9.b<Long> bVar10 = l7Var.C;
        v9.b<Long> bVar11 = l7Var.D;
        m5Var.f(iVar, expressionResolver, bVar10, bVar11);
        l8.t5 t5Var = new l8.t5(m5Var, iVar, expressionResolver, bVar10, bVar11);
        l7 div$div_release2 = iVar.getDiv$div_release();
        p7.d dVarE = (div$div_release2 == null || (bVar4 = div$div_release2.C) == null) ? null : bVar4.e(expressionResolver, t5Var);
        if (dVarE == null) {
            int i10 = p7.d.C1;
            dVarE = p7.c.f34476c;
        }
        iVar.d(dVarE);
        l7 div$div_release3 = iVar.getDiv$div_release();
        p7.d dVarE2 = (div$div_release3 == null || (bVar3 = div$div_release3.D) == null) ? null : bVar3.e(expressionResolver, t5Var);
        if (dVarE2 == null) {
            int i11 = p7.d.C1;
            dVarE2 = p7.c.f34476c;
        }
        iVar.d(dVarE2);
        if (l7Var.F == null && l7Var.f41292x == null) {
            iVar.setText(l7Var.K.b(expressionResolver));
            m5Var.e(iVar, expressionResolver, l7Var);
            iVar.d(l7Var.K.e(expressionResolver, new b6(m5Var, iVar, expressionResolver, l7Var)));
        } else {
            m5Var.g(iVar, kVar, expressionResolver, l7Var);
            m5Var.e(iVar, expressionResolver, l7Var);
            iVar.d(l7Var.K.e(expressionResolver, new u5(m5Var, iVar, kVar, expressionResolver, l7Var)));
            v5 v5Var = new v5(m5Var, iVar, kVar, expressionResolver, l7Var);
            List<l7.n> list = l7Var.F;
            if (list != null) {
                for (l7.n nVar : list) {
                    iVar.d(nVar.f41352j.e(expressionResolver, v5Var));
                    iVar.d(nVar.f41346d.e(expressionResolver, v5Var));
                    v9.b<Long> bVar12 = nVar.f41347e;
                    p7.d dVarE3 = bVar12 == null ? null : bVar12.e(expressionResolver, v5Var);
                    if (dVarE3 == null) {
                        int i12 = p7.d.C1;
                        dVarE3 = p7.c.f34476c;
                    }
                    iVar.d(dVarE3);
                    iVar.d(nVar.f41348f.e(expressionResolver, v5Var));
                    v9.b<q2> bVar13 = nVar.f41349g;
                    p7.d dVarE4 = bVar13 == null ? null : bVar13.e(expressionResolver, v5Var);
                    if (dVarE4 == null) {
                        int i13 = p7.d.C1;
                        dVarE4 = p7.c.f34476c;
                    }
                    iVar.d(dVarE4);
                    v9.b<Double> bVar14 = nVar.f41350h;
                    p7.d dVarE5 = bVar14 == null ? null : bVar14.e(expressionResolver, v5Var);
                    if (dVarE5 == null) {
                        int i14 = p7.d.C1;
                        dVarE5 = p7.c.f34476c;
                    }
                    iVar.d(dVarE5);
                    v9.b<Long> bVar15 = nVar.f41351i;
                    p7.d dVarE6 = bVar15 == null ? null : bVar15.e(expressionResolver, v5Var);
                    if (dVarE6 == null) {
                        int i15 = p7.d.C1;
                        dVarE6 = p7.c.f34476c;
                    }
                    iVar.d(dVarE6);
                    v9.b<f4> bVar16 = nVar.f41353k;
                    p7.d dVarE7 = bVar16 == null ? null : bVar16.e(expressionResolver, v5Var);
                    if (dVarE7 == null) {
                        int i16 = p7.d.C1;
                        dVarE7 = p7.c.f34476c;
                    }
                    iVar.d(dVarE7);
                    v9.b<Integer> bVar17 = nVar.f41354l;
                    p7.d dVarE8 = bVar17 == null ? null : bVar17.e(expressionResolver, v5Var);
                    if (dVarE8 == null) {
                        int i17 = p7.d.C1;
                        dVarE8 = p7.c.f34476c;
                    }
                    iVar.d(dVarE8);
                    v9.b<Long> bVar18 = nVar.f41355m;
                    p7.d dVarE9 = bVar18 == null ? null : bVar18.e(expressionResolver, v5Var);
                    if (dVarE9 == null) {
                        int i18 = p7.d.C1;
                        dVarE9 = p7.c.f34476c;
                    }
                    iVar.d(dVarE9);
                    v9.b<f4> bVar19 = nVar.f41356n;
                    p7.d dVarE10 = bVar19 == null ? null : bVar19.e(expressionResolver, v5Var);
                    if (dVarE10 == null) {
                        int i19 = p7.d.C1;
                        dVarE10 = p7.c.f34476c;
                    }
                    iVar.d(dVarE10);
                }
            }
            List<l7.m> list2 = l7Var.f41292x;
            if (list2 != null) {
                for (l7.m mVar : list2) {
                    iVar.d(mVar.f41324b.e(expressionResolver, v5Var));
                    iVar.d(mVar.f41327e.e(expressionResolver, v5Var));
                    v9.b<Integer> bVar20 = mVar.f41325c;
                    p7.d dVarE11 = bVar20 == null ? null : bVar20.e(expressionResolver, v5Var);
                    if (dVarE11 == null) {
                        int i20 = p7.d.C1;
                        dVarE11 = p7.c.f34476c;
                    }
                    iVar.d(dVarE11);
                    iVar.d(mVar.f41328f.f41216b.e(expressionResolver, v5Var));
                    iVar.d(mVar.f41328f.f41215a.e(expressionResolver, v5Var));
                }
            }
        }
        m5Var.c(iVar, kVar, expressionResolver, l7Var);
        l7.l lVar = l7Var.f41282n;
        if (lVar != null) {
            q5 q5Var = new q5(m5Var, iVar, kVar, expressionResolver, l7Var);
            iVar.d(lVar.f41314d.e(expressionResolver, q5Var));
            List<l7.n> list3 = lVar.f41313c;
            if (list3 != null) {
                for (l7.n nVar2 : list3) {
                    iVar.d(nVar2.f41352j.e(expressionResolver, q5Var));
                    iVar.d(nVar2.f41346d.e(expressionResolver, q5Var));
                    v9.b<Long> bVar21 = nVar2.f41347e;
                    p7.d dVarE12 = bVar21 == null ? null : bVar21.e(expressionResolver, q5Var);
                    if (dVarE12 == null) {
                        int i21 = p7.d.C1;
                        dVarE12 = p7.c.f34476c;
                    }
                    iVar.d(dVarE12);
                    iVar.d(nVar2.f41348f.e(expressionResolver, q5Var));
                    v9.b<q2> bVar22 = nVar2.f41349g;
                    p7.d dVarE13 = bVar22 == null ? null : bVar22.e(expressionResolver, q5Var);
                    if (dVarE13 == null) {
                        int i22 = p7.d.C1;
                        dVarE13 = p7.c.f34476c;
                    }
                    iVar.d(dVarE13);
                    v9.b<Double> bVar23 = nVar2.f41350h;
                    p7.d dVarE14 = bVar23 == null ? null : bVar23.e(expressionResolver, q5Var);
                    if (dVarE14 == null) {
                        int i23 = p7.d.C1;
                        dVarE14 = p7.c.f34476c;
                    }
                    iVar.d(dVarE14);
                    v9.b<Long> bVar24 = nVar2.f41351i;
                    p7.d dVarE15 = bVar24 == null ? null : bVar24.e(expressionResolver, q5Var);
                    if (dVarE15 == null) {
                        int i24 = p7.d.C1;
                        dVarE15 = p7.c.f34476c;
                    }
                    iVar.d(dVarE15);
                    v9.b<f4> bVar25 = nVar2.f41353k;
                    p7.d dVarE16 = bVar25 == null ? null : bVar25.e(expressionResolver, q5Var);
                    if (dVarE16 == null) {
                        int i25 = p7.d.C1;
                        dVarE16 = p7.c.f34476c;
                    }
                    iVar.d(dVarE16);
                    v9.b<Integer> bVar26 = nVar2.f41354l;
                    p7.d dVarE17 = bVar26 == null ? null : bVar26.e(expressionResolver, q5Var);
                    if (dVarE17 == null) {
                        int i26 = p7.d.C1;
                        dVarE17 = p7.c.f34476c;
                    }
                    iVar.d(dVarE17);
                    v9.b<Long> bVar27 = nVar2.f41355m;
                    p7.d dVarE18 = bVar27 == null ? null : bVar27.e(expressionResolver, q5Var);
                    if (dVarE18 == null) {
                        int i27 = p7.d.C1;
                        dVarE18 = p7.c.f34476c;
                    }
                    iVar.d(dVarE18);
                    v9.b<f4> bVar28 = nVar2.f41356n;
                    p7.d dVarE19 = bVar28 == null ? null : bVar28.e(expressionResolver, q5Var);
                    if (dVarE19 == null) {
                        int i28 = p7.d.C1;
                        dVarE19 = p7.c.f34476c;
                    }
                    iVar.d(dVarE19);
                    o7 o7Var = nVar2.f41344b;
                    if (o7Var == null) {
                        u6Var = null;
                    } else {
                        if (!(o7Var instanceof o7.c)) {
                            throw new jc.g();
                        }
                        u6Var = ((o7.c) o7Var).f41844c;
                    }
                    if (u6Var instanceof u6) {
                        iVar.d(u6Var.f43113a.e(expressionResolver, q5Var));
                    }
                    q7 q7Var = nVar2.f41345c;
                    p7.d dVarE20 = (q7Var == null || (c7Var2 = q7Var.f42189b) == null || (bVar2 = c7Var2.f39543a) == null) ? null : bVar2.e(expressionResolver, q5Var);
                    if (dVarE20 == null) {
                        int i29 = p7.d.C1;
                        dVarE20 = p7.c.f34476c;
                    }
                    iVar.d(dVarE20);
                    q7 q7Var2 = nVar2.f41345c;
                    p7.d dVarE21 = (q7Var2 == null || (c7Var = q7Var2.f42189b) == null || (bVar = c7Var.f39545c) == null) ? null : bVar.e(expressionResolver, q5Var);
                    if (dVarE21 == null) {
                        int i30 = p7.d.C1;
                        dVarE21 = p7.c.f34476c;
                    }
                    iVar.d(dVarE21);
                }
            }
            List<l7.m> list4 = lVar.f41312b;
            if (list4 != null) {
                for (l7.m mVar2 : list4) {
                    iVar.d(mVar2.f41324b.e(expressionResolver, q5Var));
                    iVar.d(mVar2.f41327e.e(expressionResolver, q5Var));
                    v9.b<Integer> bVar29 = mVar2.f41325c;
                    p7.d dVarE22 = bVar29 == null ? null : bVar29.e(expressionResolver, q5Var);
                    if (dVarE22 == null) {
                        int i31 = p7.d.C1;
                        dVarE22 = p7.c.f34476c;
                    }
                    iVar.d(dVarE22);
                    iVar.d(mVar2.f41328f.f41216b.e(expressionResolver, q5Var));
                    iVar.d(mVar2.f41328f.f41215a.e(expressionResolver, q5Var));
                }
            }
        }
        v9.b<Boolean> bVar30 = l7Var.f41276h;
        iVar.setAutoEllipsize(bVar30 == null ? false : bVar30.b(expressionResolver).booleanValue());
        m7 m7Var = l7Var.O;
        m5Var.i(iVar, expressionResolver, m7Var);
        if (m7Var != null) {
            a6 a6Var = new a6(m5Var, iVar, expressionResolver, m7Var);
            Object objA = m7Var.a();
            if (objA instanceof y9.g4) {
                iVar.d(((y9.g4) objA).f40163a.e(expressionResolver, a6Var));
            } else if (objA instanceof y9.h5) {
                y9.h5 h5Var = (y9.h5) objA;
                l8.b.I(h5Var.f40285a, expressionResolver, iVar, a6Var);
                l8.b.I(h5Var.f40286b, expressionResolver, iVar, a6Var);
                l8.b.J(h5Var.f40288d, expressionResolver, iVar, a6Var);
            }
        }
        iVar.d(l7Var.H.f(expressionResolver, new p5(m5Var, iVar)));
        iVar.setFocusable(iVar.isFocusable() || l7Var.f41285q != null);
    }

    public final void r(View view, h8 h8Var, k kVar) {
        g6 g6Var = this.f31456q;
        o8.s sVar = (o8.s) view;
        Objects.requireNonNull(g6Var);
        fd.j0.i(h8Var, "div");
        h8 div$div_release = sVar.getDiv$div_release();
        if (fd.j0.d(h8Var, div$div_release)) {
            return;
        }
        v9.d expressionResolver = kVar.getExpressionResolver();
        sVar.g();
        sVar.setDiv$div_release(h8Var);
        if (div$div_release != null) {
            g6Var.f32406a.i(sVar, div$div_release, kVar);
        }
        sVar.removeAllViews();
        a8.d dVar = ((r7.a.b) kVar.getDiv2Component$div_release()).f35197a.f34543k;
        Objects.requireNonNull(dVar, "Cannot return null from a non-@Nullable @Provides method");
        fd.j0.i(expressionResolver, "resolver");
        List<i8> list = h8Var.G;
        ArrayList arrayList = new ArrayList(kc.m.j(list, 10));
        for (i8 i8Var : list) {
            Uri uriB = i8Var.f40640d.b(expressionResolver);
            String strB = i8Var.f40638b.b(expressionResolver);
            i8.c cVar = i8Var.f40639c;
            a8.i iVar = cVar == null ? null : new a8.i((int) cVar.f40647b.b(expressionResolver).longValue(), (int) cVar.f40646a.b(expressionResolver).longValue());
            v9.b<Long> bVar = i8Var.f40637a;
            arrayList.add(new a8.j(uriB, strB, iVar, bVar == null ? null : bVar.b(expressionResolver)));
            g6Var = g6Var;
        }
        g6 g6Var2 = g6Var;
        a8.a aVarA = dVar.a(arrayList, new a8.e(h8Var.f40503e.b(expressionResolver).booleanValue(), h8Var.f40517s.b(expressionResolver).booleanValue(), h8Var.f40521w.b(expressionResolver).booleanValue(), h8Var.f40520v));
        a8.d dVar2 = ((r7.a.b) kVar.getDiv2Component$div_release()).f35197a.f34543k;
        Objects.requireNonNull(dVar2, "Cannot return null from a non-@Nullable @Provides method");
        Context context = sVar.getContext();
        fd.j0.h(context, "view.context");
        a8.f fVarB = dVar2.b(context);
        sVar.addView(fVarB);
        Objects.requireNonNull(fVarB);
        fd.j0.i(aVarA, "player");
        g6Var2.f32406a.e(sVar, h8Var, div$div_release, kVar);
        aVarA.b(new e6(h8Var, kVar, g6Var2));
        String str = h8Var.f40509k;
        if (str == null) {
            return;
        }
        sVar.d(g6Var2.f32407b.a(kVar, str, new f6(aVarA)));
    }
}
