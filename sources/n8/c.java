package n8;

import android.view.View;
import android.view.ViewGroup;
import i8.j0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends t9.c<a, ViewGroup, y9.q> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f33630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i8.k f33631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j0 f33632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i8.u f33633s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v f33634t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c8.e f33635u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s7.g f33636v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map<ViewGroup, x> f33637w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w f33638x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l9.g gVar, View view, t9.c.i iVar, t9.j jVar, boolean z10, i8.k kVar, t9.p pVar, j0 j0Var, i8.u uVar, v vVar, c8.e eVar, s7.g gVar2) {
        super(gVar, view, iVar, jVar, pVar, vVar, vVar);
        fd.j0.i(gVar, "viewPool");
        fd.j0.i(view, "view");
        fd.j0.i(iVar, "tabbedCardConfig");
        fd.j0.i(jVar, "heightCalculatorFactory");
        fd.j0.i(kVar, "div2View");
        fd.j0.i(pVar, "textStyleProvider");
        fd.j0.i(j0Var, "viewCreator");
        fd.j0.i(uVar, "divBinder");
        fd.j0.i(vVar, "divTabsEventManager");
        fd.j0.i(eVar, "path");
        fd.j0.i(gVar2, "divPatchCache");
        this.f33630p = z10;
        this.f33631q = kVar;
        this.f33632r = j0Var;
        this.f33633s = uVar;
        this.f33634t = vVar;
        this.f33635u = eVar;
        this.f33636v = gVar2;
        this.f33637w = new LinkedHashMap();
        t9.l lVar = this.f35730d;
        fd.j0.h(lVar, "mPager");
        this.f33638x = new w(lVar);
    }

    @Override // t9.c
    public ViewGroup a(ViewGroup viewGroup, t9.c.g.a aVar, int i10) {
        a aVar2 = (a) aVar;
        fd.j0.i(viewGroup, "tabView");
        fd.j0.i(aVar2, "tab");
        i8.k kVar = this.f33631q;
        fd.j0.i(viewGroup, "<this>");
        fd.j0.i(kVar, "divView");
        Iterator<View> it = ((i0.a) i0.b(viewGroup)).iterator();
        while (true) {
            p0.j0 j0Var = (p0.j0) it;
            if (!j0Var.hasNext()) {
                viewGroup.removeAllViews();
                y9.k kVar2 = aVar2.f33625a.f40026a;
                View viewN = this.f33632r.n(kVar2, this.f33631q.getExpressionResolver());
                viewN.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.f33633s.b(viewN, kVar2, this.f33631q, this.f33635u);
                this.f33637w.put(viewGroup, new x(i10, kVar2, viewN));
                viewGroup.addView(viewN);
                return viewGroup;
            }
            u1.a.u(kVar.getReleaseViewVisitor$div_release(), (View) j0Var.next());
        }
    }

    @Override // t9.c
    public void c(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        fd.j0.i(viewGroup2, "tabView");
        this.f33637w.remove(viewGroup2);
        i8.k kVar = this.f33631q;
        fd.j0.i(viewGroup2, "<this>");
        fd.j0.i(kVar, "divView");
        Iterator<View> it = ((i0.a) i0.b(viewGroup2)).iterator();
        while (true) {
            p0.j0 j0Var = (p0.j0) it;
            if (!j0Var.hasNext()) {
                viewGroup2.removeAllViews();
                return;
            } else {
                u1.a.u(kVar.getReleaseViewVisitor$div_release(), (View) j0Var.next());
            }
        }
    }

    public final void d() {
        for (Map.Entry<ViewGroup, x> entry : this.f33637w.entrySet()) {
            ViewGroup key = entry.getKey();
            x value = entry.getValue();
            this.f33633s.b(value.f33711b, value.f33710a, this.f33631q, this.f33635u);
            key.requestLayout();
        }
    }

    public final void e(t9.c.g<a> gVar, int i10) {
        b(gVar, this.f33631q.getExpressionResolver(), x1.q.i(this.f33631q));
        this.f33637w.clear();
        t9.l lVar = this.f35730d;
        lVar.f2958x = false;
        lVar.z(i10, true, false, 0);
    }
}
