package x7;

import android.view.View;
import fd.j0;
import i8.k;
import v9.d;
import y9.g0;

/* JADX INFO: loaded from: classes2.dex */
public interface c {
    default void beforeBindView(k kVar, View view, g0 g0Var) {
        j0.i(kVar, "divView");
        j0.i(view, "view");
        j0.i(g0Var, "div");
    }

    void bindView(k kVar, View view, g0 g0Var);

    boolean matches(g0 g0Var);

    default void preprocess(g0 g0Var, d dVar) {
        j0.i(g0Var, "div");
        j0.i(dVar, "expressionResolver");
    }

    void unbindView(k kVar, View view, g0 g0Var);
}
