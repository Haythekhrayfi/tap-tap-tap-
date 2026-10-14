package i8;

import android.view.View;
import com.inscode.autoclicker.R;
import y9.i1;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends o8.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f31436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f31437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.d f31438c;

    public t(r rVar, k kVar, v9.d dVar) {
        fd.j0.i(rVar, "divAccessibilityBinder");
        fd.j0.i(kVar, "divView");
        fd.j0.i(dVar, "resolver");
        this.f31436a = rVar;
        this.f31437b = kVar;
        this.f31438c = dVar;
    }

    @Override // o8.t
    public void a(View view) {
        Object tag = view.getTag(R.id.div_custom_tag);
        i1 i1Var = tag instanceof i1 ? (i1) tag : null;
        if (i1Var != null) {
            r(view, i1Var);
        }
    }

    @Override // o8.t
    public void b(o8.d dVar) {
        r(dVar, dVar.getDiv$div_release());
    }

    @Override // o8.t
    public void c(o8.e eVar) {
        r(eVar, eVar.getDiv$div_release());
    }

    @Override // o8.t
    public void d(o8.f fVar) {
        r(fVar, fVar.getDiv$div_release());
    }

    @Override // o8.t
    public void e(o8.g gVar) {
        r(gVar, gVar.getDiv$div_release());
    }

    @Override // o8.t
    public void f(o8.i iVar) {
        r(iVar, iVar.getDiv$div_release());
    }

    @Override // o8.t
    public void g(o8.j jVar) {
        r(jVar, jVar.getDiv$div_release());
    }

    @Override // o8.t
    public void h(o8.k kVar) {
        r(kVar, kVar.getDiv$div_release());
    }

    @Override // o8.t
    public void i(o8.l lVar) {
        r(lVar, lVar.getDiv$div_release());
    }

    @Override // o8.t
    public void j(o8.m mVar) {
        r(mVar, mVar.getDiv());
    }

    @Override // o8.t
    public void k(o8.n nVar) {
        r(nVar, nVar.getDiv());
    }

    @Override // o8.t
    public void l(o8.o oVar) {
        r(oVar, oVar.getDiv$div_release());
    }

    @Override // o8.t
    public void m(o8.p pVar) {
        r(pVar, pVar.getDiv$div_release());
    }

    @Override // o8.t
    public void n(o8.r rVar) {
        r(rVar, rVar.getDivState$div_release());
    }

    @Override // o8.t
    public void o(o8.s sVar) {
        r(sVar, sVar.getDiv$div_release());
    }

    @Override // o8.t
    public void p(o8.u uVar) {
        r(uVar, uVar.getDiv$div_release());
    }

    @Override // o8.t
    public void q(t9.t tVar) {
        r(tVar, tVar.getDiv());
    }

    public final void r(View view, y9.g0 g0Var) {
        if (g0Var == null) {
            return;
        }
        this.f31436a.b(view, this.f31437b, g0Var.d().f41710c.b(this.f31438c));
    }
}
