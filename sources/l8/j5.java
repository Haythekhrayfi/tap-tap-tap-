package l8;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f32506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i8.j0 f32507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<i8.u> f32508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x9.a f32509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c8.j f32510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f32511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s7.j f32512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s7.g f32513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p7.h f32514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i8.q0 f32515j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q8.e f32516k;

    public j5(v vVar, i8.j0 j0Var, ic.a<i8.u> aVar, x9.a aVar2, c8.j jVar, j jVar2, s7.j jVar3, s7.g gVar, p7.h hVar, i8.q0 q0Var, q8.e eVar) {
        fd.j0.i(vVar, "baseBinder");
        fd.j0.i(j0Var, "viewCreator");
        fd.j0.i(aVar, "viewBinder");
        fd.j0.i(aVar2, "divStateCache");
        fd.j0.i(jVar, "temporaryStateCache");
        fd.j0.i(jVar2, "divActionBinder");
        fd.j0.i(jVar3, "divPatchManager");
        fd.j0.i(gVar, "divPatchCache");
        fd.j0.i(hVar, "div2Logger");
        fd.j0.i(q0Var, "divVisibilityActionTracker");
        fd.j0.i(eVar, "errorCollectors");
        this.f32506a = vVar;
        this.f32507b = j0Var;
        this.f32508c = aVar;
        this.f32509d = aVar2;
        this.f32510e = jVar;
        this.f32511f = jVar2;
        this.f32512g = jVar3;
        this.f32513h = gVar;
        this.f32514i = hVar;
        this.f32515j = q0Var;
        this.f32516k = eVar;
    }

    public final void a(View view, i8.k kVar) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        Iterator<View> it = ((p0.i0.a) p0.i0.b((ViewGroup) view)).iterator();
        while (true) {
            p0.j0 j0Var = (p0.j0) it;
            if (!j0Var.hasNext()) {
                return;
            }
            View view2 = (View) j0Var.next();
            y9.k kVarG = kVar.G(view2);
            if (kVarG != null) {
                this.f32515j.d(kVar, null, kVarG, (8 & 8) != 0 ? b.A(kVarG.a()) : null);
            }
            a(view2, kVar);
        }
    }
}
