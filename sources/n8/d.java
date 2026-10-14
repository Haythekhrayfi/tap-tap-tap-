package n8;

import android.content.Context;
import android.util.DisplayMetrics;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import i8.i0;
import i8.j0;
import i8.q0;
import java.util.List;
import java.util.Objects;
import p7.d1;
import y9.b1;
import y9.f7;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f33639k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l8.v f33640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f33641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l9.g f33642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t9.p f33643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l8.j f33644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p7.h f33645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q0 f33646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s7.g f33647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f33648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f33649j;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33650a;

        static {
            int[] iArr = new int[f7.f.a.values().length];
            iArr[f7.f.a.SLIDE.ordinal()] = 1;
            iArr[f7.f.a.FADE.ordinal()] = 2;
            iArr[f7.f.a.NONE.ordinal()] = 3;
            f33650a = iArr;
        }
    }

    public static final class c extends vc.l implements uc.l<Object, jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t9.t f33652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v9.d f33653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f7.f f33654f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t9.t tVar, v9.d dVar, f7.f fVar) {
            super(1);
            this.f33652d = tVar;
            this.f33653e = dVar;
            this.f33654f = fVar;
        }

        @Override // uc.l
        public jc.w invoke(Object obj) {
            fd.j0.i(obj, "it");
            d dVar = d.this;
            t9.q<?> titleLayout = this.f33652d.getTitleLayout();
            v9.d dVar2 = this.f33653e;
            f7.f fVar = this.f33654f;
            int i10 = d.f33639k;
            dVar.a(titleLayout, dVar2, fVar);
            return jc.w.f31842a;
        }
    }

    static {
        new a(null);
    }

    public d(l8.v vVar, j0 j0Var, l9.g gVar, t9.p pVar, l8.j jVar, p7.h hVar, q0 q0Var, s7.g gVar2, Context context) {
        fd.j0.i(vVar, "baseBinder");
        fd.j0.i(j0Var, "viewCreator");
        fd.j0.i(gVar, "viewPool");
        fd.j0.i(pVar, "textStyleProvider");
        fd.j0.i(jVar, "actionBinder");
        fd.j0.i(hVar, "div2Logger");
        fd.j0.i(q0Var, "visibilityActionTracker");
        fd.j0.i(gVar2, "divPatchCache");
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f33640a = vVar;
        this.f33641b = j0Var;
        this.f33642c = gVar;
        this.f33643d = pVar;
        this.f33644e = jVar;
        this.f33645f = hVar;
        this.f33646g = q0Var;
        this.f33647h = gVar2;
        this.f33648i = context;
        gVar.a("DIV2.TAB_HEADER_VIEW", new t9.q.c(context), 12);
        gVar.a("DIV2.TAB_ITEM_VIEW", new i0(this), 2);
    }

    public static final void b(d dVar, i8.k kVar, f7 f7Var, v9.d dVar2, t9.t tVar, i8.u uVar, c8.e eVar, List<n8.a> list, int i10) {
        Objects.requireNonNull(dVar);
        v vVar = new v(kVar, dVar.f33644e, dVar.f33645f, dVar.f33646g, tVar, f7Var);
        boolean zBooleanValue = f7Var.f40002i.b(dVar2).booleanValue();
        t9.j jVar = zBooleanValue ? i5.a.f31256l : d1.f34481e;
        int currentItem = tVar.getViewPager().getCurrentItem();
        int currentItem2 = tVar.getViewPager().getCurrentItem();
        if (currentItem2 == currentItem) {
            k9.k kVar2 = k9.k.f31954a;
            n nVar = new n(vVar, currentItem2);
            fd.j0.i(nVar, "runnable");
            k9.k.f31955b.post(new b9.c(nVar, 1));
        }
        n8.c cVar = new n8.c(dVar.f33642c, tVar, new t9.c.i(R.id.base_tabbed_title_container_scroller, R.id.div_tabs_pager_container, R.id.div_tabs_container_helper, true, false, "DIV2.TAB_HEADER_VIEW", "DIV2.TAB_ITEM_VIEW"), jVar, zBooleanValue, kVar, dVar.f33643d, dVar.f33641b, uVar, vVar, eVar, dVar.f33647h);
        cVar.e(new n8.b(list, 2), i10);
        tVar.setDivTabsAdapter(cVar);
    }

    public static final void c(v9.b<?> bVar, f9.b bVar2, v9.d dVar, d dVar2, t9.t tVar, f7.f fVar) {
        p7.d dVarE = bVar == null ? null : bVar.e(dVar, dVar2.new c(tVar, dVar, fVar));
        if (dVarE == null) {
            int i10 = p7.d.C1;
            dVarE = p7.c.f34476c;
        }
        bVar2.d(dVarE);
    }

    public final void a(t9.q<?> qVar, v9.d dVar, f7.f fVar) {
        Integer numB;
        float fFloatValue;
        t9.e.b bVar;
        v9.b<Long> bVar2;
        v9.b<Long> bVar3;
        v9.b<Long> bVar4;
        v9.b<Long> bVar5;
        int iIntValue = fVar.f40041c.b(dVar).intValue();
        int iIntValue2 = fVar.f40039a.b(dVar).intValue();
        int iIntValue3 = fVar.f40051m.b(dVar).intValue();
        v9.b<Integer> bVar6 = fVar.f40049k;
        int iIntValue4 = (bVar6 == null || (numB = bVar6.b(dVar)) == null) ? 0 : numB.intValue();
        Objects.requireNonNull(qVar);
        qVar.setTabTextColors(t9.e.l(iIntValue3, iIntValue));
        qVar.setSelectedTabIndicatorColor(iIntValue2);
        qVar.setTabBackgroundColor(iIntValue4);
        DisplayMetrics displayMetrics = qVar.getResources().getDisplayMetrics();
        fd.j0.h(displayMetrics, "metrics");
        v9.b<Long> bVar7 = fVar.f40044f;
        Float fValueOf = bVar7 == null ? null : Float.valueOf(l8.b.u(bVar7.b(dVar), displayMetrics));
        if (fValueOf == null) {
            fFloatValue = fVar.f40045g == null ? -1.0f : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        } else {
            fFloatValue = fValueOf.floatValue();
        }
        b1 b1Var = fVar.f40045g;
        float fU = (b1Var == null || (bVar5 = b1Var.f39126c) == null) ? fFloatValue : l8.b.u(bVar5.b(dVar), displayMetrics);
        b1 b1Var2 = fVar.f40045g;
        float fU2 = (b1Var2 == null || (bVar4 = b1Var2.f39127d) == null) ? fFloatValue : l8.b.u(bVar4.b(dVar), displayMetrics);
        b1 b1Var3 = fVar.f40045g;
        float fU3 = (b1Var3 == null || (bVar3 = b1Var3.f39124a) == null) ? fFloatValue : l8.b.u(bVar3.b(dVar), displayMetrics);
        b1 b1Var4 = fVar.f40045g;
        if (b1Var4 != null && (bVar2 = b1Var4.f39125b) != null) {
            fFloatValue = l8.b.u(bVar2.b(dVar), displayMetrics);
        }
        qVar.setTabIndicatorCornersRadii(new float[]{fU, fU, fU2, fU2, fFloatValue, fFloatValue, fU3, fU3});
        qVar.setTabItemSpacing(l8.b.u(fVar.f40052n.b(dVar), displayMetrics));
        int i10 = b.f33650a[fVar.f40043e.b(dVar).ordinal()];
        if (i10 == 1) {
            bVar = t9.e.b.SLIDE;
        } else if (i10 == 2) {
            bVar = t9.e.b.FADE;
        } else {
            if (i10 != 3) {
                throw new jc.g();
            }
            bVar = t9.e.b.NONE;
        }
        qVar.setAnimationType(bVar);
        qVar.setAnimationDuration(fVar.f40042d.b(dVar).longValue());
        qVar.setTabTitleStyle(fVar);
    }
}
