package p7;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface l0 {
    void bindView(View view, y9.i1 i1Var, i8.k kVar);

    View createView(y9.i1 i1Var, i8.k kVar);

    boolean isCustomTypeSupported(String str);

    default y0.d preload(y9.i1 i1Var, y0.a aVar) {
        fd.j0.i(i1Var, "div");
        fd.j0.i(aVar, "callBack");
        Objects.requireNonNull(y0.d.f34613a);
        return z0.f34622b;
    }

    void release(View view, y9.i1 i1Var);
}
