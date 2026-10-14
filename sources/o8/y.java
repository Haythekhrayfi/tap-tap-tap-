package o8;

import android.view.View;
import com.inscode.autoclicker.R;
import fd.j0;
import i8.u0;
import java.util.Iterator;
import p7.l0;
import y9.g0;
import y9.i1;

/* JADX INFO: loaded from: classes2.dex */
public class y extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8.k f34146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f34147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x7.a f34148c;

    public y(i8.k kVar, l0 l0Var, x7.a aVar) {
        j0.i(kVar, "divView");
        j0.i(aVar, "divExtensionController");
        this.f34146a = kVar;
        this.f34147b = l0Var;
        this.f34148c = aVar;
    }

    @Override // o8.t
    public void a(View view) {
        Object tag = view.getTag(R.id.div_custom_tag);
        i1 i1Var = tag instanceof i1 ? (i1) tag : null;
        if (i1Var != null) {
            r(view, i1Var);
            l0 l0Var = this.f34147b;
            if (l0Var == null) {
                return;
            }
            l0Var.release(view, i1Var);
        }
    }

    @Override // o8.t
    public void b(d dVar) {
        r(dVar, dVar.getDiv$div_release());
    }

    @Override // o8.t
    public void c(e eVar) {
        r(eVar, eVar.getDiv$div_release());
    }

    @Override // o8.t
    public void d(f fVar) {
        r(fVar, fVar.getDiv$div_release());
    }

    @Override // o8.t
    public void e(g gVar) {
        r(gVar, gVar.getDiv$div_release());
    }

    @Override // o8.t
    public void f(i iVar) {
        r(iVar, iVar.getDiv$div_release());
    }

    @Override // o8.t
    public void g(j jVar) {
        r(jVar, jVar.getDiv$div_release());
    }

    @Override // o8.t
    public void h(k kVar) {
        r(kVar, kVar.getDiv$div_release());
    }

    @Override // o8.t
    public void i(l lVar) {
        r(lVar, lVar.getDiv$div_release());
    }

    @Override // o8.t
    public void j(m mVar) {
        r(mVar, mVar.getDiv());
    }

    @Override // o8.t
    public void k(n nVar) {
        r(nVar, nVar.getDiv());
    }

    @Override // o8.t
    public void l(o oVar) {
        r(oVar, oVar.getDiv$div_release());
    }

    @Override // o8.t
    public void m(p pVar) {
        r(pVar, pVar.getDiv$div_release());
    }

    @Override // o8.t
    public void n(r rVar) {
        r(rVar, rVar.getDivState$div_release());
    }

    @Override // o8.t
    public void o(s sVar) {
        r(sVar, sVar.getDiv$div_release());
    }

    @Override // o8.t
    public void p(u uVar) {
        r(uVar, uVar.getDiv$div_release());
    }

    @Override // o8.t
    public void q(t9.t tVar) {
        r(tVar, tVar.getDiv());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(View view, g0 g0Var) {
        if (g0Var != null) {
            this.f34148c.d(this.f34146a, view, g0Var);
        }
        if (view instanceof u0) {
            ((u0) view).release();
        }
        Object tag = view.getTag(R.id.div_releasable_list);
        q.i iVar = tag instanceof q.i ? (q.i) tag : null;
        f8.f fVar = iVar != null ? new f8.f(iVar) : null;
        if (fVar == null) {
            return;
        }
        Iterator it = fVar.iterator();
        while (true) {
            f8.g gVar = (f8.g) it;
            if (!gVar.hasNext()) {
                return;
            } else {
                ((u0) gVar.next()).release();
            }
        }
    }
}
