package l8;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import y9.c8;
import y9.n8;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends vc.l implements uc.l<n8, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.g0 f32782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f32784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i8.k f32785g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(View view, y9.g0 g0Var, v9.d dVar, v vVar, i8.k kVar) {
        super(1);
        this.f32781c = view;
        this.f32782d = g0Var;
        this.f32783e = dVar;
        this.f32784f = vVar;
        this.f32785g = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    @Override // uc.l
    public jc.w invoke(n8 n8Var) {
        int i10;
        boolean z10;
        r1.l lVar;
        r1.l lVarB;
        n8 n8Var2 = n8Var;
        fd.j0.i(n8Var2, "visibility");
        if (n8Var2 != n8.GONE) {
            b.o(this.f32781c, this.f32782d, this.f32783e);
        }
        v vVar = this.f32784f;
        View view = this.f32781c;
        y9.g0 g0Var = this.f32782d;
        i8.k kVar = this.f32785g;
        v9.d dVar = this.f32783e;
        Objects.requireNonNull(vVar);
        j8.b divTransitionHandler$div_release = kVar.getDivTransitionHandler$div_release();
        int i11 = v.a.f32896a[n8Var2.ordinal()];
        if (i11 == 1) {
            i10 = 0;
        } else if (i11 == 2) {
            i10 = 4;
        } else {
            if (i11 != 3) {
                throw new jc.g();
            }
            i10 = 8;
        }
        if (n8Var2 != n8.VISIBLE) {
            view.clearAnimation();
        }
        int visibility = view.getVisibility();
        List<c8> listI = g0Var.i();
        if (listI == null) {
            z10 = false;
        } else {
            fd.j0.i(listI, "<this>");
            if (listI.contains(c8.VISIBILITY_CHANGE)) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (z10) {
            lVar = null;
        } else {
            Objects.requireNonNull(divTransitionHandler$div_release);
            fd.j0.i(view, "target");
            j8.b.a.C0322a c0322a = (j8.b.a.C0322a) kc.t.y(divTransitionHandler$div_release.b(divTransitionHandler$div_release.f31717b, view));
            if (c0322a == null && (c0322a = (j8.b.a.C0322a) kc.t.y(divTransitionHandler$div_release.b(divTransitionHandler$div_release.f31718c, view))) == null) {
                c0322a = null;
            }
            if (c0322a != null) {
                visibility = c0322a.f31720a;
            }
            i8.c0 c0VarC = ((r7.a.c) kVar.getViewComponent$div_release()).c();
            if ((visibility == 4 || visibility == 8) && i10 == 0) {
                y9.a0 a0VarP = g0Var.p();
                Objects.requireNonNull(c0VarC);
                fd.j0.i(dVar, "resolver");
                if (a0VarP == null) {
                    lVar = null;
                } else {
                    lVarB = c0VarC.b(a0VarP, 1, dVar);
                    lVar = lVarB;
                }
            } else {
                if ((i10 == 4 || i10 == 8) && visibility == 0) {
                    y9.a0 a0VarS = g0Var.s();
                    Objects.requireNonNull(c0VarC);
                    fd.j0.i(dVar, "resolver");
                    if (a0VarS != null) {
                        lVarB = c0VarC.b(a0VarS, 2, dVar);
                        lVar = lVarB;
                    }
                } else if (c0322a != null) {
                    r1.n.b(kVar);
                }
                lVar = null;
            }
            if (lVar != null) {
                lVar.addTarget(view);
            }
        }
        if (lVar != null) {
            j8.b.a.C0322a c0322a2 = new j8.b.a.C0322a(i10);
            Objects.requireNonNull(divTransitionHandler$div_release);
            fd.j0.i(lVar, "transition");
            fd.j0.i(view, "view");
            fd.j0.i(c0322a2, "changeType");
            divTransitionHandler$div_release.f31717b.add(new j8.b.C0323b(lVar, view, kc.l.f(c0322a2), new ArrayList()));
            if (!divTransitionHandler$div_release.f31719d) {
                divTransitionHandler$div_release.f31719d = true;
                divTransitionHandler$div_release.f31716a.post(new androidx.activity.c(divTransitionHandler$div_release));
            }
        } else {
            view.setVisibility(i10);
        }
        kVar.D();
        return jc.w.f31842a;
    }
}
