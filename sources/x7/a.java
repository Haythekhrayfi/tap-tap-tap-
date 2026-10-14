package x7;

import android.view.View;
import fd.j0;
import i8.k;
import java.util.List;
import y9.g0;
import y9.z1;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f37517a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends c> list) {
        j0.i(list, "extensionHandlers");
        this.f37517a = list;
    }

    public void a(k kVar, View view, g0 g0Var) {
        j0.i(g0Var, "div");
        if (c(g0Var)) {
            for (c cVar : this.f37517a) {
                if (cVar.matches(g0Var)) {
                    cVar.beforeBindView(kVar, view, g0Var);
                }
            }
        }
    }

    public void b(k kVar, View view, g0 g0Var) {
        j0.i(kVar, "divView");
        j0.i(view, "view");
        j0.i(g0Var, "div");
        if (c(g0Var)) {
            for (c cVar : this.f37517a) {
                if (cVar.matches(g0Var)) {
                    cVar.bindView(kVar, view, g0Var);
                }
            }
        }
    }

    public final boolean c(g0 g0Var) {
        List<z1> listL = g0Var.l();
        return !(listL == null || listL.isEmpty()) && (this.f37517a.isEmpty() ^ true);
    }

    public void d(k kVar, View view, g0 g0Var) {
        j0.i(kVar, "divView");
        j0.i(view, "view");
        if (c(g0Var)) {
            for (c cVar : this.f37517a) {
                if (cVar.matches(g0Var)) {
                    cVar.unbindView(kVar, view, g0Var);
                }
            }
        }
    }
}
