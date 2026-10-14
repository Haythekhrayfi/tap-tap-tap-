package l8;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f32235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.j f32236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7.g f32237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<i8.u> f32238d;

    public static final class a extends vc.l implements uc.l<Object, jc.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f32240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v9.d f32241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ y9.g0 f32242f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, v9.d dVar, y9.g0 g0Var) {
            super(1);
            this.f32240d = view;
            this.f32241e = dVar;
            this.f32242f = g0Var;
        }

        @Override // uc.l
        public jc.w invoke(Object obj) {
            fd.j0.i(obj, "$noName_0");
            a2.this.a(this.f32240d, this.f32241e, this.f32242f);
            return jc.w.f31842a;
        }
    }

    public a2(v vVar, s7.j jVar, s7.g gVar, ic.a<i8.u> aVar) {
        fd.j0.i(vVar, "baseBinder");
        fd.j0.i(jVar, "divPatchManager");
        fd.j0.i(gVar, "divPatchCache");
        fd.j0.i(aVar, "divBinder");
        this.f32235a = vVar;
        this.f32236b = jVar;
        this.f32237c = gVar;
        this.f32238d = aVar;
    }

    public final void a(View view, v9.d dVar, y9.g0 g0Var) {
        Long lB;
        int i10;
        Long lB2;
        v9.b<Long> bVarE = g0Var.e();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        m9.d dVar2 = layoutParams instanceof m9.d ? (m9.d) layoutParams : null;
        int i11 = Integer.MAX_VALUE;
        int i12 = 1;
        if (dVar2 != null) {
            if (bVarE == null || (lB2 = bVarE.b(dVar)) == null) {
                i10 = 1;
            } else {
                long jLongValue = lB2.longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    i10 = (int) jLongValue;
                } else {
                    int i13 = e9.a.f29114a;
                    i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            if (dVar2.f33328e != i10) {
                dVar2.f33328e = i10;
                view.requestLayout();
            }
        }
        v9.b<Long> bVarG = g0Var.g();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        m9.d dVar3 = layoutParams2 instanceof m9.d ? (m9.d) layoutParams2 : null;
        if (dVar3 == null) {
            return;
        }
        if (bVarG != null && (lB = bVarG.b(dVar)) != null) {
            long jLongValue2 = lB.longValue();
            long j11 = jLongValue2 >> 31;
            if (j11 == 0 || j11 == -1) {
                i11 = (int) jLongValue2;
            } else {
                int i14 = e9.a.f29114a;
                if (jLongValue2 <= 0) {
                    i11 = Integer.MIN_VALUE;
                }
            }
            i12 = i11;
        }
        if (dVar3.f33329f != i12) {
            dVar3.f33329f = i12;
            view.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view, y9.g0 g0Var, v9.d dVar) {
        this.f32235a.d(view, g0Var, null, dVar);
        a(view, dVar, g0Var);
        if (view instanceof f9.b) {
            a aVar = new a(view, dVar, g0Var);
            f9.b bVar = (f9.b) view;
            v9.b<Long> bVarE = g0Var.e();
            p7.d dVarE = bVarE == null ? null : bVarE.e(dVar, aVar);
            if (dVarE == null) {
                int i10 = p7.d.C1;
                dVarE = p7.c.f34476c;
            }
            bVar.d(dVarE);
            v9.b<Long> bVarG = g0Var.g();
            p7.d dVarE2 = bVarG != null ? bVarG.e(dVar, aVar) : null;
            if (dVarE2 == null) {
                int i11 = p7.d.C1;
                dVarE2 = p7.c.f34476c;
            }
            bVar.d(dVarE2);
        }
    }
}
