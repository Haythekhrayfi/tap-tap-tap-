package q8;

import android.view.ViewGroup;
import fd.j0;
import i8.x0;
import java.util.List;
import java.util.Objects;
import jc.w;
import uc.p;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f34838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f34840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewGroup f34841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f34842e;

    public static final class a extends vc.l implements uc.l<i8.f, w> {
        public a() {
            super(1);
        }

        @Override // uc.l
        public w invoke(i8.f fVar) {
            i8.f fVar2 = fVar;
            j0.i(fVar2, "it");
            h hVar = n.this.f34840c;
            Objects.requireNonNull(hVar);
            j0.i(fVar2, "binding");
            p7.d dVar = hVar.f34819e;
            if (dVar != null) {
                dVar.close();
            }
            d dVarA = hVar.f34815a.a(fVar2.f31332a, fVar2.f31333b);
            p<List<? extends Throwable>, List<? extends Throwable>, w> pVar = hVar.f34820f;
            j0.i(pVar, "observer");
            dVarA.f34807a.add(pVar);
            pVar.invoke(dVarA.f34810d, dVarA.f34811e);
            hVar.f34819e = new c(dVarA, pVar);
            return w.f31842a;
        }
    }

    public n(e eVar, boolean z10, x0 x0Var) {
        j0.i(eVar, "errorCollectors");
        j0.i(x0Var, "bindingProvider");
        this.f34838a = x0Var;
        this.f34839b = z10;
        this.f34840c = new h(eVar);
        b();
    }

    public final void a(ViewGroup viewGroup) {
        this.f34841d = viewGroup;
        if (this.f34839b) {
            j jVar = this.f34842e;
            if (jVar != null) {
                jVar.close();
            }
            this.f34842e = new j(viewGroup, this.f34840c);
        }
    }

    public final void b() {
        if (!this.f34839b) {
            j jVar = this.f34842e;
            if (jVar != null) {
                jVar.close();
            }
            this.f34842e = null;
            return;
        }
        x0 x0Var = this.f34838a;
        a aVar = new a();
        Objects.requireNonNull(x0Var);
        j0.i(aVar, "observer");
        aVar.invoke(x0Var.f31491a);
        x0Var.f31492b.add(aVar);
        ViewGroup viewGroup = this.f34841d;
        if (viewGroup == null) {
            return;
        }
        a(viewGroup);
    }
}
