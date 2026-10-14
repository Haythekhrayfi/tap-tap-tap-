package i8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f31341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f31342b;

    public h(j0 j0Var, u uVar) {
        fd.j0.i(j0Var, "viewCreator");
        fd.j0.i(uVar, "viewBinder");
        this.f31341a = j0Var;
        this.f31342b = uVar;
    }

    public View a(y9.k kVar, k kVar2, c8.e eVar) {
        fd.j0.i(kVar, "data");
        fd.j0.i(kVar2, "divView");
        View viewB = b(kVar, kVar2, eVar);
        try {
            this.f31342b.b(viewB, kVar, kVar2, eVar);
        } catch (u9.f e10) {
            if (!x1.q.a(e10)) {
                throw e10;
            }
        }
        return viewB;
    }

    public View b(y9.k kVar, k kVar2, c8.e eVar) {
        fd.j0.i(kVar, "data");
        View viewN = this.f31341a.n(kVar, kVar2.getExpressionResolver());
        viewN.setLayoutParams(new m9.d(-1, -2));
        return viewN;
    }
}
