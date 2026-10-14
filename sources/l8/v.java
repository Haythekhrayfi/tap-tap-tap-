package l8;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import y9.f7;
import y9.l7;
import y9.n8;
import y9.q8;
import y9.x7;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f32891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.d f32892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x7.a f32893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r1 f32894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i8.r f32895e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32896a;

        static {
            int[] iArr = new int[n8.values().length];
            iArr[n8.VISIBLE.ordinal()] = 1;
            iArr[n8.INVISIBLE.ordinal()] = 2;
            iArr[n8.GONE.ordinal()] = 3;
            f32896a = iArr;
        }
    }

    public v(p pVar, e8.d dVar, x7.a aVar, r1 r1Var, i8.r rVar) {
        fd.j0.i(pVar, "divBackgroundBinder");
        fd.j0.i(dVar, "tooltipController");
        fd.j0.i(aVar, "extensionController");
        fd.j0.i(r1Var, "divFocusBinder");
        fd.j0.i(rVar, "divAccessibilityBinder");
        this.f32891a = pVar;
        this.f32892b = dVar;
        this.f32893c = aVar;
        this.f32894d = r1Var;
        this.f32895e = rVar;
    }

    public final void a(View view, i8.k kVar, y9.k0 k0Var, y9.k0 k0Var2, v9.d dVar) {
        r1 r1Var = this.f32894d;
        Objects.requireNonNull(r1Var);
        fd.j0.i(k0Var, "blurredBorder");
        r1Var.a(view, (k0Var2 == null || b.F(k0Var2) || !view.isFocused()) ? k0Var : k0Var2, dVar);
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        r1.a aVar = onFocusChangeListener instanceof r1.a ? (r1.a) onFocusChangeListener : null;
        if (aVar == null && b.F(k0Var2)) {
            return;
        }
        boolean z10 = true;
        if (aVar != null && aVar.f32791e == null && aVar.f32792f == null && b.F(k0Var2)) {
            z10 = false;
        }
        if (!z10) {
            view.setOnFocusChangeListener(null);
            return;
        }
        r1.a aVar2 = new r1.a(r1Var, kVar, dVar);
        aVar2.f32789c = k0Var2;
        aVar2.f32790d = k0Var;
        if (aVar != null) {
            List<? extends y9.q> list = aVar.f32791e;
            List<? extends y9.q> list2 = aVar.f32792f;
            aVar2.f32791e = list;
            aVar2.f32792f = list2;
        }
        view.setOnFocusChangeListener(aVar2);
    }

    public final void b(View view, i8.k kVar, v9.d dVar, List<? extends y9.q> list, List<? extends y9.q> list2) {
        r1 r1Var = this.f32894d;
        Objects.requireNonNull(r1Var);
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        r1.a aVar = onFocusChangeListener instanceof r1.a ? (r1.a) onFocusChangeListener : null;
        boolean z10 = true;
        if (aVar == null && h9.d.c(list, list2)) {
            return;
        }
        if (aVar != null) {
            z10 = (aVar.f32789c == null && h9.d.c(list, list2)) ? false : true;
        }
        if (!z10) {
            view.setOnFocusChangeListener(null);
            return;
        }
        r1.a aVar2 = new r1.a(r1Var, kVar, dVar);
        if (aVar != null) {
            y9.k0 k0Var = aVar.f32789c;
            y9.k0 k0Var2 = aVar.f32790d;
            aVar2.f32789c = k0Var;
            aVar2.f32790d = k0Var2;
        }
        aVar2.f32791e = list;
        aVar2.f32792f = list2;
        view.setOnFocusChangeListener(aVar2);
    }

    public final void c(View view, i8.k kVar, String str) {
        fd.j0.i(view, "view");
        fd.j0.i(kVar, "divView");
        int iA = ((r7.a.c) kVar.getViewComponent$div_release()).f35250b.get().a(str);
        view.setTag(str);
        view.setId(iA);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:111:0x0207  */
    /* JADX WARN: Code duplicated, block: B:112:0x0209  */
    /* JADX WARN: Code duplicated, block: B:115:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x021f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0221  */
    /* JADX WARN: Code duplicated, block: B:120:0x022a  */
    /* JADX WARN: Code duplicated, block: B:131:0x026b A[PHI: r12
  0x026b: PHI (r12v15 y9.t) = (r12v12 y9.t), (r12v23 y9.t) binds: [B:130:0x0269, B:118:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x026d A[PHI: r12
  0x026d: PHI (r12v20 y9.t) = (r12v12 y9.t), (r12v23 y9.t) binds: [B:130:0x0269, B:118:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:122:0x0249
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void d(android.view.View r10, y9.g0 r11, y9.g0 r12, v9.d r13) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.v.d(android.view.View, y9.g0, y9.g0, v9.d):void");
    }

    /* JADX WARN: Code duplicated, block: B:199:0x027f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0295  */
    /* JADX WARN: Code duplicated, block: B:252:0x0366 A[PHI: r0
  0x0366: PHI (r0v26 y9.k0) = (r0v24 y9.k0), (r0v69 y9.k0) binds: [B:251:0x0364, B:241:0x0326] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:253:0x036a A[PHI: r0 r1
  0x036a: PHI (r0v68 y9.k0) = (r0v24 y9.k0), (r0v69 y9.k0) binds: [B:251:0x0364, B:241:0x0326] A[DONT_GENERATE, DONT_INLINE]
  0x036a: PHI (r1v71 y9.n2) = (r1v39 y9.n2), (r1v73 y9.n2) binds: [B:251:0x0364, B:241:0x0326] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:343:0x04e2 A[PHI: r0
  0x04e2: PHI (r0v45 java.util.List<y9.q>) = (r0v42 java.util.List<y9.q>), (r0v58 java.util.List<y9.q>) binds: [B:342:0x04e0, B:328:0x049b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:344:0x04e6 A[PHI: r0 r1
  0x04e6: PHI (r0v55 java.util.List<y9.q>) = (r0v42 java.util.List<y9.q>), (r0v58 java.util.List<y9.q>) binds: [B:342:0x04e0, B:328:0x049b] A[DONT_GENERATE, DONT_INLINE]
  0x04e6: PHI (r1v56 y9.n2) = (r1v52 y9.n2), (r1v58 y9.n2) binds: [B:342:0x04e0, B:328:0x049b] A[DONT_GENERATE, DONT_INLINE]] */
    public final void e(View view, y9.g0 g0Var, y9.g0 g0Var2, i8.k kVar) {
        jc.w wVar;
        y9.k0 border;
        y9.n2 n2VarR;
        y9.k0 k0Var;
        y9.k0 k0Var2;
        List<y9.q> list;
        y9.n2 n2VarR2;
        List<y9.q> list2;
        List<y9.q> list3;
        p7.d dVarE;
        y9.n2 n2VarR3;
        y9.n2 n2VarR4;
        y9.n2 n2VarR5;
        y9.n2 n2VarR6;
        boolean z10;
        y9.o.e eVar;
        v9.d expressionResolver = kVar.getExpressionResolver();
        f9.b bVarI = x1.q.i(view);
        if (Build.VERSION.SDK_INT >= 26) {
            view.setDefaultFocusHighlightEnabled(false);
        }
        if (!fd.j0.d(g0Var.getId(), g0Var2 == null ? null : g0Var2.getId())) {
            c(view, kVar, g0Var.getId());
        }
        d(view, g0Var, g0Var2, expressionResolver);
        y9.x1 x1VarH = g0Var.h();
        if (view instanceof o8.l) {
            x1VarH = new y9.x1(null, null, null, null, null, 31, null);
        }
        b.n(view, x1VarH, expressionResolver);
        p0 p0Var = new p0(view, x1VarH, expressionResolver);
        bVarI.d(x1VarH.f44033b.e(expressionResolver, p0Var));
        bVarI.d(x1VarH.f44035d.e(expressionResolver, p0Var));
        bVarI.d(x1VarH.f44034c.e(expressionResolver, p0Var));
        bVarI.d(x1VarH.f44032a.e(expressionResolver, p0Var));
        y9.o oVarD = g0Var.d();
        v9.b<String> bVar = oVarD.f41708a;
        String strB = bVar == null ? null : bVar.b(expressionResolver);
        v9.b<String> bVar2 = oVarD.f41709b;
        b.b(view, strB, bVar2 == null ? null : bVar2.b(expressionResolver));
        v9.b<String> bVar3 = oVarD.f41708a;
        p7.d dVarE2 = bVar3 == null ? null : bVar3.e(expressionResolver, new w(view, oVarD, expressionResolver));
        if (dVarE2 == null) {
            int i10 = p7.d.C1;
            dVarE2 = p7.c.f34476c;
        }
        bVarI.d(dVarE2);
        v9.b<String> bVar4 = oVarD.f41709b;
        p7.d dVarE3 = bVar4 == null ? null : bVar4.e(expressionResolver, new x(view, oVarD, expressionResolver));
        if (dVarE3 == null) {
            int i11 = p7.d.C1;
            dVarE3 = p7.c.f34476c;
        }
        bVarI.d(dVarE3);
        v9.b<String> bVar5 = oVarD.f41711d;
        p0.e0.s(view, bVar5 == null ? null : bVar5.b(expressionResolver));
        v9.b<String> bVar6 = oVarD.f41711d;
        p7.d dVarE4 = bVar6 == null ? null : bVar6.e(expressionResolver, new y(view));
        if (dVarE4 == null) {
            int i12 = p7.d.C1;
            dVarE4 = p7.c.f34476c;
        }
        bVarI.d(dVarE4);
        this.f32895e.b(view, kVar, oVarD.f41710c.b(expressionResolver));
        bVarI.d(oVarD.f41710c.e(expressionResolver, new z(new i8.t(this.f32895e, kVar, expressionResolver), view)));
        y9.o.e eVar2 = oVarD.f41712e;
        if (eVar2 == null) {
            wVar = null;
        } else {
            this.f32895e.c(view, eVar2);
            wVar = jc.w.f31842a;
        }
        if (wVar == null) {
            i8.r rVar = this.f32895e;
            Objects.requireNonNull(rVar);
            if (rVar.f31424a) {
                if (g0Var instanceof y9.w0) {
                    y9.w0 w0Var = (y9.w0) g0Var;
                    if (w0Var.f43620b == null) {
                        List<y9.q> list4 = w0Var.f43622d;
                        if (list4 == null || list4.isEmpty()) {
                            List<y9.q> list5 = w0Var.f43641w;
                            if (list5 == null || list5.isEmpty()) {
                                List<y9.q> list6 = w0Var.f43633o;
                                if (list6 == null || list6.isEmpty()) {
                                    z10 = false;
                                }
                            }
                        }
                    }
                    z10 = true;
                } else if (g0Var instanceof y9.d3) {
                    y9.d3 d3Var = (y9.d3) g0Var;
                    if (d3Var.f39591b == null) {
                        List<y9.q> list7 = d3Var.f39593d;
                        if (list7 == null || list7.isEmpty()) {
                            List<y9.q> list8 = d3Var.f39613x;
                            if (list8 == null || list8.isEmpty()) {
                                List<y9.q> list9 = d3Var.f39605p;
                                if (list9 == null || list9.isEmpty()) {
                                    z10 = false;
                                }
                            }
                        }
                    }
                    z10 = true;
                } else if (g0Var instanceof y9.w2) {
                    y9.w2 w2Var = (y9.w2) g0Var;
                    if (w2Var.f43694b == null) {
                        List<y9.q> list10 = w2Var.f43696d;
                        if (list10 == null || list10.isEmpty()) {
                            List<y9.q> list11 = w2Var.f43713u;
                            if (list11 == null || list11.isEmpty()) {
                                List<y9.q> list12 = w2Var.f43707o;
                                if (list12 == null || list12.isEmpty()) {
                                    z10 = false;
                                }
                            }
                        }
                    }
                    z10 = true;
                } else if (g0Var instanceof y9.d6) {
                    y9.d6 d6Var = (y9.d6) g0Var;
                    if (d6Var.f39655b == null) {
                        List<y9.q> list13 = d6Var.f39657d;
                        if (list13 == null || list13.isEmpty()) {
                            List<y9.q> list14 = d6Var.f39671r;
                            if (list14 == null || list14.isEmpty()) {
                                List<y9.q> list15 = d6Var.f39666m;
                                if (list15 == null || list15.isEmpty()) {
                                    z10 = false;
                                }
                            }
                        }
                    }
                    z10 = true;
                } else {
                    if (g0Var instanceof l7) {
                        l7 l7Var = (l7) g0Var;
                        if (l7Var.f41270b == null) {
                            List<y9.q> list16 = l7Var.f41272d;
                            if (list16 == null || list16.isEmpty()) {
                                List<y9.q> list17 = l7Var.A;
                                if (list17 == null || list17.isEmpty()) {
                                    List<y9.q> list18 = l7Var.f41281m;
                                    if (!(list18 == null || list18.isEmpty())) {
                                    }
                                }
                            }
                        }
                        z10 = true;
                    }
                    z10 = false;
                }
                if (z10) {
                    eVar = y9.o.e.BUTTON;
                } else if (g0Var instanceof y9.d3) {
                    eVar = y9.o.e.IMAGE;
                } else if (g0Var instanceof y9.s3) {
                    eVar = y9.o.e.EDIT_TEXT;
                } else if (g0Var instanceof y9.w2) {
                    eVar = y9.o.e.IMAGE;
                } else if (g0Var instanceof l7) {
                    eVar = y9.o.e.TEXT;
                } else {
                    eVar = g0Var instanceof f7 ? y9.o.e.TAB_BAR : y9.o.e.NONE;
                }
                rVar.c(view, eVar);
            }
        }
        bVarI.d(g0Var.q().f(expressionResolver, new b0(view)));
        List<y9.e0> listB = g0Var.b();
        y9.n2 n2VarR7 = g0Var.r();
        h(view, kVar, listB, n2VarR7 == null ? null : n2VarR7.f41638a, expressionResolver, bVarI, null);
        y9.k0[] k0VarArr = new y9.k0[2];
        k0VarArr[0] = g0Var.getBorder();
        y9.n2 n2VarR8 = g0Var.r();
        k0VarArr[1] = n2VarR8 == null ? null : n2VarR8.f41639b;
        List listC = kc.l.c(k0VarArr);
        y9.k0[] k0VarArr2 = new y9.k0[2];
        k0VarArr2[0] = g0Var2 == null ? null : g0Var2.getBorder();
        k0VarArr2[1] = (g0Var2 == null || (n2VarR6 = g0Var2.r()) == null) ? null : n2VarR6.f41639b;
        List listC2 = kc.l.c(k0VarArr2);
        if (listC.size() != listC2.size()) {
            border = g0Var.getBorder();
            n2VarR = g0Var.r();
            if (n2VarR == null) {
                k0Var = border;
                k0Var2 = null;
            } else {
                k0Var = border;
                k0Var2 = n2VarR.f41639b;
            }
            a(view, kVar, k0Var, k0Var2, expressionResolver);
        } else {
            Iterator it = listC.iterator();
            Iterator it2 = listC2.iterator();
            ArrayList arrayList = new ArrayList(Math.min(kc.m.j(listC, 10), kc.m.j(listC2, 10)));
            while (true) {
                if (it.hasNext() && it2.hasNext()) {
                    if (fd.j0.d(it.next(), it2.next())) {
                        arrayList.add(jc.w.f31842a);
                    } else {
                        border = g0Var.getBorder();
                        n2VarR = g0Var.r();
                        if (n2VarR == null) {
                            k0Var = border;
                            k0Var2 = null;
                        } else {
                            k0Var = border;
                            k0Var2 = n2VarR.f41639b;
                        }
                        a(view, kVar, k0Var, k0Var2, expressionResolver);
                    }
                }
            }
        }
        y9.n2 n2VarR9 = g0Var.r();
        if (!fd.j0.d(n2VarR9 == null ? null : n2VarR9.f41640c, (g0Var2 == null || (n2VarR5 = g0Var2.r()) == null) ? null : n2VarR5.f41640c)) {
            y9.n2 n2VarR10 = g0Var.r();
            y9.n2.c cVar = n2VarR10 == null ? null : n2VarR10.f41640c;
            i8.l0 l0Var = ((r7.a.c) kVar.getViewComponent$div_release()).f35250b.get();
            if (cVar != null) {
                v9.b<String> bVar7 = cVar.f41652b;
                if (bVar7 != null) {
                    bVarI.d(bVar7.f(expressionResolver, new k0(view, l0Var)));
                } else {
                    view.setNextFocusForwardId(-1);
                }
                v9.b<String> bVar8 = cVar.f41655e;
                if (bVar8 != null) {
                    bVarI.d(bVar8.f(expressionResolver, new l0(view, l0Var)));
                } else {
                    view.setNextFocusUpId(-1);
                }
                v9.b<String> bVar9 = cVar.f41654d;
                if (bVar9 != null) {
                    bVarI.d(bVar9.f(expressionResolver, new m0(view, l0Var)));
                } else {
                    view.setNextFocusRightId(-1);
                }
                v9.b<String> bVar10 = cVar.f41651a;
                if (bVar10 != null) {
                    bVarI.d(bVar10.f(expressionResolver, new n0(view, l0Var)));
                } else {
                    view.setNextFocusDownId(-1);
                }
                v9.b<String> bVar11 = cVar.f41653c;
                if (bVar11 != null) {
                    bVarI.d(bVar11.f(expressionResolver, new o0(view, l0Var)));
                }
            } else {
                view.setNextFocusForwardId(-1);
                view.setNextFocusUpId(-1);
                view.setNextFocusRightId(-1);
                view.setNextFocusDownId(-1);
            }
            view.setNextFocusLeftId(-1);
        }
        List<x7> listM = g0Var.m();
        if (listM != null) {
            Objects.requireNonNull(this.f32892b);
            view.setTag(R.id.div_tooltips_tag, listM);
        }
        List[] listArr = new List[2];
        y9.n2 n2VarR11 = g0Var.r();
        listArr[0] = n2VarR11 == null ? null : n2VarR11.f41642e;
        y9.n2 n2VarR12 = g0Var.r();
        listArr[1] = n2VarR12 == null ? null : n2VarR12.f41641d;
        List listC3 = kc.l.c(listArr);
        List[] listArr2 = new List[2];
        listArr2[0] = (g0Var2 == null || (n2VarR4 = g0Var2.r()) == null) ? null : n2VarR4.f41642e;
        listArr2[1] = (g0Var2 == null || (n2VarR3 = g0Var2.r()) == null) ? null : n2VarR3.f41641d;
        List listC4 = kc.l.c(listArr2);
        if (listC3.size() != listC4.size()) {
            y9.n2 n2VarR13 = g0Var.r();
            list = n2VarR13 == null ? null : n2VarR13.f41642e;
            n2VarR2 = g0Var.r();
            if (n2VarR2 == null) {
                list2 = list;
                list3 = null;
            } else {
                list2 = list;
                list3 = n2VarR2.f41641d;
            }
            b(view, kVar, expressionResolver, list2, list3);
        } else {
            Iterator it3 = listC3.iterator();
            Iterator it4 = listC4.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(kc.m.j(listC3, 10), kc.m.j(listC4, 10)));
            while (true) {
                if (it3.hasNext() && it4.hasNext()) {
                    if (fd.j0.d(it3.next(), it4.next())) {
                        arrayList2.add(jc.w.f31842a);
                    } else {
                        y9.n2 n2VarR14 = g0Var.r();
                        list = n2VarR14 == null ? null : n2VarR14.f41642e;
                        n2VarR2 = g0Var.r();
                        if (n2VarR2 == null) {
                            list2 = list;
                            list3 = null;
                        } else {
                            list2 = list;
                            list3 = n2VarR2.f41641d;
                        }
                        b(view, kVar, expressionResolver, list2, list3);
                    }
                }
            }
        }
        if (!this.f32895e.f31424a) {
            view.setFocusable(g0Var.r() != null);
        }
        bVarI.d(g0Var.getVisibility().f(expressionResolver, new r0(view, g0Var, expressionResolver, this, kVar)));
        v9.b<Double> bVar12 = g0Var.a().f44793c;
        if (bVar12 == null || (dVarE = bVar12.e(expressionResolver, new q0(view, g0Var, expressionResolver))) == null) {
            return;
        }
        bVarI.d(dVarE);
    }

    public final q8.b f(y9.l6 l6Var) {
        q8 q8Var;
        y9.l6.e eVar = l6Var instanceof y9.l6.e ? (y9.l6.e) l6Var : null;
        if (eVar == null || (q8Var = eVar.f41241c) == null) {
            return null;
        }
        return q8Var.f42193b;
    }

    public final q8.b g(y9.l6 l6Var) {
        q8 q8Var;
        y9.l6.e eVar = l6Var instanceof y9.l6.e ? (y9.l6.e) l6Var : null;
        if (eVar == null || (q8Var = eVar.f41241c) == null) {
            return null;
        }
        return q8Var.f42194c;
    }

    public final void h(View view, i8.k kVar, List<? extends y9.e0> list, List<? extends y9.e0> list2, v9.d dVar, f9.b bVar, Drawable drawable) {
        p pVar = this.f32891a;
        Objects.requireNonNull(pVar);
        fd.j0.i(view, "view");
        fd.j0.i(kVar, "divView");
        fd.j0.i(dVar, "resolver");
        fd.j0.i(bVar, "subscriber");
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        if (list2 == null) {
            s sVar = new s(list, view, drawable, pVar, kVar, dVar, displayMetrics);
            sVar.invoke(jc.w.f31842a);
            pVar.d(list, dVar, bVar, sVar);
        } else {
            t tVar = new t(list, list2, view, drawable, pVar, kVar, dVar, displayMetrics);
            tVar.invoke(jc.w.f31842a);
            pVar.d(list2, dVar, bVar, tVar);
            pVar.d(list, dVar, bVar, tVar);
        }
    }

    public final void i(View view, y9.g0 g0Var, i8.k kVar) {
        fd.j0.i(view, "view");
        this.f32893c.d(kVar, view, g0Var);
    }
}
