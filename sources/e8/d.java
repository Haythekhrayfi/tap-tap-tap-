package e8;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.inscode.autoclicker.R;
import fd.j0;
import i8.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p0.i0;
import p7.c1;
import p7.y0;
import uc.q;
import y6.m1;
import y9.g0;
import y9.l6;
import y9.v;
import y9.x7;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<i8.h> f29079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f29080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f29081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f29082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q<View, Integer, Integer, f8.d> f29083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, l> f29084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f29085g;

    public static final class a extends vc.l implements q<View, Integer, Integer, f8.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f29086c = new a();

        public a() {
            super(3);
        }

        @Override // uc.q
        public f8.d b(View view, Integer num, Integer num2) {
            View view2 = view;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            j0.i(view2, "c");
            return new j(view2, iIntValue, iIntValue2, false, 8, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(ic.a<i8.h> aVar, c1 c1Var, q0 q0Var, y0 y0Var) {
        this(aVar, c1Var, q0Var, y0Var, a.f29086c);
        j0.i(aVar, "div2Builder");
        j0.i(c1Var, "tooltipRestrictor");
        j0.i(q0Var, "divVisibilityActionTracker");
        j0.i(y0Var, "divPreloader");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(ic.a<i8.h> aVar, c1 c1Var, q0 q0Var, y0 y0Var, q<? super View, ? super Integer, ? super Integer, ? extends f8.d> qVar) {
        j0.i(aVar, "div2Builder");
        j0.i(c1Var, "tooltipRestrictor");
        j0.i(q0Var, "divVisibilityActionTracker");
        j0.i(y0Var, "divPreloader");
        j0.i(qVar, "createPopup");
        this.f29079a = aVar;
        this.f29080b = c1Var;
        this.f29081c = q0Var;
        this.f29082d = y0Var;
        this.f29083e = qVar;
        this.f29084f = new LinkedHashMap();
        this.f29085g = new Handler(Looper.getMainLooper());
    }

    public static final void a(final d dVar, final View view, final x7 x7Var, final i8.k kVar) {
        if (dVar.f29080b.c(kVar, view, x7Var)) {
            final y9.k kVar2 = x7Var.f44176c;
            g0 g0VarA = kVar2.a();
            final View viewA = dVar.f29079a.get().a(kVar2, kVar, c8.e.f3631c.a(0L));
            DisplayMetrics displayMetrics = kVar.getResources().getDisplayMetrics();
            final v9.d expressionResolver = kVar.getExpressionResolver();
            q<View, Integer, Integer, f8.d> qVar = dVar.f29083e;
            l6 width = g0VarA.getWidth();
            j0.h(displayMetrics, "displayMetrics");
            final f8.d dVarB = qVar.b(viewA, Integer.valueOf(l8.b.U(width, displayMetrics, expressionResolver, null)), Integer.valueOf(l8.b.U(g0VarA.getHeight(), displayMetrics, expressionResolver, null)));
            dVarB.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: e8.b
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    d dVar2 = this.f29066c;
                    x7 x7Var2 = x7Var;
                    i8.k kVar3 = kVar;
                    View view2 = view;
                    j0.i(dVar2, "this$0");
                    j0.i(x7Var2, "$divTooltip");
                    j0.i(kVar3, "$div2View");
                    j0.i(view2, "$anchor");
                    dVar2.f29084f.remove(x7Var2.f44178e);
                    dVar2.d(kVar3, x7Var2.f44176c);
                    c1.a aVarB = dVar2.f29080b.b();
                    if (aVarB == null) {
                        return;
                    }
                    aVarB.b(view2, x7Var2);
                }
            });
            dVarB.setOutsideTouchable(true);
            dVarB.setTouchInterceptor(new m1(dVarB));
            v9.d expressionResolver2 = kVar.getExpressionResolver();
            j0.i(dVarB, "<this>");
            j0.i(x7Var, "divTooltip");
            j0.i(expressionResolver2, "resolver");
            v vVar = x7Var.f44174a;
            dVarB.setEnterTransition(vVar != null ? e8.a.b(vVar, x7Var.f44180g.b(expressionResolver2), true, expressionResolver2) : e8.a.a(x7Var, expressionResolver2));
            v vVar2 = x7Var.f44175b;
            dVarB.setExitTransition(vVar2 != null ? e8.a.b(vVar2, x7Var.f44180g.b(expressionResolver2), false, expressionResolver2) : e8.a.a(x7Var, expressionResolver2));
            final l lVar = new l(dVarB, kVar2, null, false, 8, null);
            dVar.f29084f.put(x7Var.f44178e, lVar);
            y0.f fVarA = dVar.f29082d.a(kVar2, kVar.getExpressionResolver(), new y0.a() { // from class: e8.c
                @Override // p7.y0.a
                public final void f(boolean z10) {
                    l lVar2 = lVar;
                    View view2 = view;
                    d dVar2 = dVar;
                    i8.k kVar3 = kVar;
                    x7 x7Var2 = x7Var;
                    View view3 = viewA;
                    f8.d dVar3 = dVarB;
                    v9.d dVar4 = expressionResolver;
                    y9.k kVar4 = kVar2;
                    j0.i(lVar2, "$tooltipData");
                    j0.i(view2, "$anchor");
                    j0.i(dVar2, "this$0");
                    j0.i(kVar3, "$div2View");
                    j0.i(x7Var2, "$divTooltip");
                    j0.i(view3, "$tooltipView");
                    j0.i(dVar3, "$popup");
                    j0.i(dVar4, "$resolver");
                    j0.i(kVar4, "$div");
                    if (z10 || lVar2.f29109c || !view2.isAttachedToWindow() || !dVar2.f29080b.c(kVar3, view2, x7Var2)) {
                        return;
                    }
                    if (!x1.q.k(view3) || view3.isLayoutRequested()) {
                        view3.addOnLayoutChangeListener(new f(view3, view2, x7Var2, kVar3, dVar3, dVar2, kVar4));
                    } else {
                        Point pointB = h.b(view3, view2, x7Var2, kVar3.getExpressionResolver());
                        if (h.a(kVar3, view3, pointB)) {
                            dVar3.update(pointB.x, pointB.y, view3.getWidth(), view3.getHeight());
                            dVar2.d(kVar3, kVar4);
                            dVar2.f29081c.d(kVar3, view3, kVar4, (8 & 8) != 0 ? l8.b.A(kVar4.a()) : null);
                            c1.a aVarB = dVar2.f29080b.b();
                            if (aVarB != null) {
                                aVarB.c(view2, x7Var2);
                            }
                        } else {
                            dVar2.c(x7Var2.f44178e, kVar3);
                        }
                    }
                    dVar3.showAtLocation(view2, 0, 0, 0);
                    if (x7Var2.f44177d.b(dVar4).longValue() != 0) {
                        dVar2.f29085g.postDelayed(new g(dVar2, x7Var2, kVar3), x7Var2.f44177d.b(dVar4).longValue());
                    }
                }
            });
            l lVar2 = dVar.f29084f.get(x7Var.f44178e);
            if (lVar2 == null) {
                return;
            }
            lVar2.f29108b = fVarA;
        }
    }

    public final void b(i8.k kVar, View view) {
        Object tag = view.getTag(R.id.div_tooltips_tag);
        List<x7> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (x7 x7Var : list) {
                ArrayList arrayList = new ArrayList();
                l lVar = this.f29084f.get(x7Var.f44178e);
                if (lVar != null) {
                    lVar.f29109c = true;
                    if (lVar.f29107a.isShowing()) {
                        f8.d dVar = lVar.f29107a;
                        j0.i(dVar, "<this>");
                        dVar.setEnterTransition(null);
                        dVar.setExitTransition(null);
                        lVar.f29107a.dismiss();
                    } else {
                        arrayList.add(x7Var.f44178e);
                        d(kVar, x7Var.f44176c);
                    }
                    y0.f fVar = lVar.f29108b;
                    if (fVar != null) {
                        fVar.cancel();
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f29084f.remove((String) it.next());
                }
            }
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it2 = ((i0.a) i0.b((ViewGroup) view)).iterator();
            while (it2.hasNext()) {
                b(kVar, it2.next());
            }
        }
    }

    public void c(String str, i8.k kVar) {
        f8.d dVar;
        j0.i(str, FacebookMediationAdapter.KEY_ID);
        j0.i(kVar, "div2View");
        l lVar = this.f29084f.get(str);
        if (lVar == null || (dVar = lVar.f29107a) == null) {
            return;
        }
        dVar.dismiss();
    }

    public final void d(i8.k kVar, y9.k kVar2) {
        this.f29081c.d(kVar, null, kVar2, (8 & 8) != 0 ? l8.b.A(kVar2.a()) : null);
    }
}
