package l8;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f32673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i8.j0 f32674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<i8.u> f32675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s7.g f32676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f32677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i6 f32678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ViewPager2.g f32679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewPager2.g f32680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k6 f32681i;

    public static final class a extends ViewPager2.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y9.r4 f32682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i8.k f32683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RecyclerView f32684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f32685d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f32686e;

        /* JADX INFO: renamed from: l8.o3$a$a, reason: collision with other inner class name */
        public static final class ViewOnLayoutChangeListenerC0341a implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC0341a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                fd.j0.i(view, "view");
                view.removeOnLayoutChangeListener(this);
                a.this.a();
            }
        }

        public a(y9.r4 r4Var, i8.k kVar, RecyclerView recyclerView) {
            fd.j0.i(r4Var, "divPager");
            fd.j0.i(kVar, "divView");
            fd.j0.i(recyclerView, "recyclerView");
            this.f32682a = r4Var;
            this.f32683b = kVar;
            this.f32684c = recyclerView;
            this.f32685d = -1;
            Objects.requireNonNull(kVar.getConfig());
        }

        public final void a() {
            for (View view : (p0.i0.a) p0.i0.b(this.f32684c)) {
                int childAdapterPosition = this.f32684c.getChildAdapterPosition(view);
                if (childAdapterPosition == -1) {
                    int i10 = e9.a.f29114a;
                    return;
                }
                y9.k kVar = this.f32682a.f42306o.get(childAdapterPosition);
                i8.q0 q0VarD = ((r7.a.b) this.f32683b.getDiv2Component$div_release()).d();
                fd.j0.h(q0VarD, "divView.div2Component.visibilityActionTracker");
                q0VarD.d(this.f32683b, view, kVar, (8 & 8) != 0 ? l8.b.A(kVar.a()) : null);
            }
        }

        public final void b() {
            if (dd.q.b(p0.i0.b(this.f32684c)) > 0) {
                a();
                return;
            }
            RecyclerView recyclerView = this.f32684c;
            if (!x1.q.k(recyclerView) || recyclerView.isLayoutRequested()) {
                recyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0341a());
            } else {
                a();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void onPageScrolled(int i10, float f10, int i11) {
            super.onPageScrolled(i10, f10, i11);
            RecyclerView.o layoutManager = this.f32684c.getLayoutManager();
            int width = (layoutManager == null ? 0 : layoutManager.getWidth()) / 20;
            int i12 = this.f32686e + i11;
            this.f32686e = i12;
            if (i12 > width) {
                this.f32686e = 0;
                b();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void onPageSelected(int i10) {
            super.onPageSelected(i10);
            b();
            int i11 = this.f32685d;
            if (i10 == i11) {
                return;
            }
            if (i11 != -1) {
                this.f32683b.G(this.f32684c);
                ((r7.a.b) this.f32683b.getDiv2Component$div_release()).a().i(this.f32683b, this.f32682a, i10, i10 > this.f32685d ? "next" : "back");
            }
            y9.k kVar = this.f32682a.f42306o.get(i10);
            if (l8.b.B(kVar.a())) {
                this.f32683b.p(this.f32684c, kVar);
            }
            this.f32685d = i10;
        }
    }

    public static final class b extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(context);
            fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            if (getChildCount() == 0 || getChildAt(0).getLayoutParams().height != -1) {
                i11 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            super.onMeasure(i10, i11);
        }
    }

    public static final class c extends w3<d> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final i8.k f32688i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final i8.u f32689j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final uc.p<d, Integer, jc.w> f32690k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final i8.j0 f32691l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final c8.e f32692m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final o8.y f32693n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final List<p7.d> f32694o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends y9.k> list, i8.k kVar, i8.u uVar, uc.p<? super d, ? super Integer, jc.w> pVar, i8.j0 j0Var, c8.e eVar, o8.y yVar) {
            super(list, kVar);
            fd.j0.i(list, "divs");
            fd.j0.i(kVar, "div2View");
            fd.j0.i(uVar, "divBinder");
            fd.j0.i(pVar, "translationBinder");
            fd.j0.i(j0Var, "viewCreator");
            fd.j0.i(eVar, "path");
            fd.j0.i(yVar, "visitor");
            this.f32688i = kVar;
            this.f32689j = uVar;
            this.f32690k = pVar;
            this.f32691l = j0Var;
            this.f32692m = eVar;
            this.f32693n = yVar;
            this.f32694o = new ArrayList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int getItemCount() {
            return this.f32932d.size();
        }

        @Override // f9.b
        public List<p7.d> getSubscriptions() {
            return this.f32694o;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0047  */
        /* JADX WARN: Code duplicated, block: B:15:0x006c A[LOOP:0: B:13:0x0063->B:15:0x006c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:19:0x007a A[EDGE_INSN: B:19:0x007a->B:16:0x007a BREAK  A[LOOP:0: B:13:0x0063->B:15:0x006c], SYNTHETIC] */
        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
            View viewN;
            Iterator<View> it;
            p0.j0 j0Var;
            d dVar = (d) c0Var;
            fd.j0.i(dVar, "holder");
            y9.k kVar = this.f32932d.get(i10);
            i8.k kVar2 = this.f32688i;
            c8.e eVar = this.f32692m;
            fd.j0.i(kVar2, "div2View");
            fd.j0.i(kVar, "div");
            fd.j0.i(eVar, "path");
            v9.d expressionResolver = kVar2.getExpressionResolver();
            if (dVar.f32698d == null) {
                viewN = dVar.f32697c.n(kVar, expressionResolver);
                FrameLayout frameLayout = dVar.f32695a;
                fd.j0.i(frameLayout, "<this>");
                fd.j0.i(kVar2, "divView");
                it = ((p0.i0.a) p0.i0.b(frameLayout)).iterator();
                while (true) {
                    j0Var = (p0.j0) it;
                    if (j0Var.hasNext()) {
                        break;
                    } else {
                        u1.a.u(kVar2.getReleaseViewVisitor$div_release(), (View) j0Var.next());
                    }
                }
                frameLayout.removeAllViews();
                dVar.f32695a.addView(viewN);
            } else {
                if ((dVar.f32695a.getChildCount() != 0) && j8.a.b(dVar.f32698d, kVar, expressionResolver)) {
                    viewN = p0.i0.a(dVar.f32695a, 0);
                } else {
                    viewN = dVar.f32697c.n(kVar, expressionResolver);
                    FrameLayout frameLayout2 = dVar.f32695a;
                    fd.j0.i(frameLayout2, "<this>");
                    fd.j0.i(kVar2, "divView");
                    it = ((p0.i0.a) p0.i0.b(frameLayout2)).iterator();
                    while (true) {
                        j0Var = (p0.j0) it;
                        if (j0Var.hasNext()) {
                            break;
                            break;
                        }
                        u1.a.u(kVar2.getReleaseViewVisitor$div_release(), (View) j0Var.next());
                    }
                    frameLayout2.removeAllViews();
                    dVar.f32695a.addView(viewN);
                }
            }
            dVar.f32698d = kVar;
            dVar.f32696b.b(viewN, kVar, kVar2, eVar);
            this.f32690k.invoke(dVar, Integer.valueOf(i10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
            fd.j0.i(viewGroup, "parent");
            Context context = this.f32688i.getContext();
            fd.j0.h(context, "div2View.context");
            b bVar = new b(context);
            bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new d(bVar, this.f32689j, this.f32691l, this.f32693n);
        }
    }

    public static final class d extends RecyclerView.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FrameLayout f32695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i8.u f32696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i8.j0 f32697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public y9.k f32698d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FrameLayout frameLayout, i8.u uVar, i8.j0 j0Var, o8.y yVar) {
            super(frameLayout);
            fd.j0.i(frameLayout, "frameLayout");
            fd.j0.i(uVar, "divBinder");
            fd.j0.i(j0Var, "viewCreator");
            fd.j0.i(yVar, "visitor");
            this.f32695a = frameLayout;
            this.f32696b = uVar;
            this.f32697c = j0Var;
        }
    }

    public o3(v vVar, i8.j0 j0Var, ic.a<i8.u> aVar, s7.g gVar, j jVar, i6 i6Var) {
        fd.j0.i(vVar, "baseBinder");
        fd.j0.i(j0Var, "viewCreator");
        fd.j0.i(aVar, "divBinder");
        fd.j0.i(gVar, "divPatchCache");
        fd.j0.i(jVar, "divActionBinder");
        fd.j0.i(i6Var, "pagerIndicatorConnector");
        this.f32673a = vVar;
        this.f32674b = j0Var;
        this.f32675c = aVar;
        this.f32676d = gVar;
        this.f32677e = jVar;
        this.f32678f = i6Var;
    }

    public static final void a(o3 o3Var, o8.l lVar, y9.r4 r4Var, v9.d dVar) {
        Objects.requireNonNull(o3Var);
        DisplayMetrics displayMetrics = lVar.getResources().getDisplayMetrics();
        y9.l2 l2Var = r4Var.f42305n;
        fd.j0.h(displayMetrics, "metrics");
        float fA0 = l8.b.a0(l2Var, displayMetrics, dVar);
        float fC = o3Var.c(r4Var, lVar, dVar);
        ViewPager2 viewPager = lVar.getViewPager();
        m9.j jVar = new m9.j(l8.b.v(r4Var.f42310s.f44033b.b(dVar), displayMetrics), l8.b.v(r4Var.f42310s.f44034c.b(dVar), displayMetrics), l8.b.v(r4Var.f42310s.f44035d.b(dVar), displayMetrics), l8.b.v(r4Var.f42310s.f44032a.b(dVar), displayMetrics), fC, fA0, r4Var.f42309r.b(dVar) == y9.r4.f.HORIZONTAL ? 0 : 1);
        int itemDecorationCount = viewPager.getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            viewPager.f3018l.removeItemDecorationAt(i10);
        }
        viewPager.f3018l.addItemDecoration(jVar);
        Integer numD = o3Var.d(r4Var, dVar);
        if ((!(fC == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) || (numD != null && numD.intValue() < 100)) && lVar.getViewPager().getOffscreenPageLimit() != 1) {
            lVar.getViewPager().setOffscreenPageLimit(1);
        }
    }

    public static final void b(o3 o3Var, o8.l lVar, y9.r4 r4Var, v9.d dVar, SparseArray sparseArray) {
        Objects.requireNonNull(o3Var);
        DisplayMetrics displayMetrics = lVar.getResources().getDisplayMetrics();
        y9.r4.f fVarB = r4Var.f42309r.b(dVar);
        Integer numD = o3Var.d(r4Var, dVar);
        y9.l2 l2Var = r4Var.f42305n;
        fd.j0.h(displayMetrics, "metrics");
        float fA0 = l8.b.a0(l2Var, displayMetrics, dVar);
        y9.r4.f fVar = y9.r4.f.HORIZONTAL;
        lVar.getViewPager().setPageTransformer(new n3(o3Var, r4Var, lVar, dVar, numD, fVarB, fA0, l8.b.v((fVarB == fVar ? r4Var.f42310s.f44033b : r4Var.f42310s.f44035d).b(dVar), displayMetrics), l8.b.v((fVarB == fVar ? r4Var.f42310s.f44034c : r4Var.f42310s.f44032a).b(dVar), displayMetrics), sparseArray));
    }

    public final float c(y9.r4 r4Var, o8.l lVar, v9.d dVar) {
        DisplayMetrics displayMetrics = lVar.getResources().getDisplayMetrics();
        y9.s4 s4Var = r4Var.f42307p;
        if (!(s4Var instanceof y9.s4.d)) {
            if (!(s4Var instanceof y9.s4.c)) {
                throw new jc.g();
            }
            y9.l2 l2Var = ((y9.s4.c) s4Var).f42566c.f41096a;
            fd.j0.h(displayMetrics, "metrics");
            return l8.b.a0(l2Var, displayMetrics, dVar);
        }
        y9.r4.f fVarB = r4Var.f42309r.b(dVar);
        y9.r4.f fVar = y9.r4.f.HORIZONTAL;
        ViewPager2 viewPager = lVar.getViewPager();
        int width = fVarB == fVar ? viewPager.getWidth() : viewPager.getHeight();
        int iDoubleValue = (int) ((y9.s4.d) s4Var).f42567c.f41821a.f44089a.b(dVar).doubleValue();
        y9.l2 l2Var2 = r4Var.f42305n;
        fd.j0.h(displayMetrics, "metrics");
        float fA0 = l8.b.a0(l2Var2, displayMetrics, dVar);
        float f10 = (1 - (iDoubleValue / 100.0f)) * width;
        float f11 = 2;
        return (f10 - (fA0 * f11)) / f11;
    }

    public final Integer d(y9.r4 r4Var, v9.d dVar) {
        y9.o4 o4Var;
        y9.x4 x4Var;
        v9.b<Double> bVar;
        Double dB;
        y9.s4 s4Var = r4Var.f42307p;
        y9.s4.d dVar2 = s4Var instanceof y9.s4.d ? (y9.s4.d) s4Var : null;
        if (dVar2 == null || (o4Var = dVar2.f42567c) == null || (x4Var = o4Var.f41821a) == null || (bVar = x4Var.f44089a) == null || (dB = bVar.b(dVar)) == null) {
            return null;
        }
        return Integer.valueOf((int) dB.doubleValue());
    }
}
