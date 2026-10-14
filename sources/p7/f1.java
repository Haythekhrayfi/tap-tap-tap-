package p7;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public interface f1 {
    void b(long j10, boolean z10);

    default void c(c8.e eVar, boolean z10) {
        b(eVar.f3632a, z10);
    }

    default void e(String str) {
    }

    default v9.d getExpressionResolver() {
        return v9.d.f36763a;
    }

    View getView();

    default void h(String str) {
    }
}
