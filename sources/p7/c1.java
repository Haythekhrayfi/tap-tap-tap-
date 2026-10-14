package p7;

import android.view.View;
import y9.x7;

/* JADX INFO: loaded from: classes2.dex */
public interface c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34478a = 0;

    public interface a {
        @Deprecated
        default void a() {
        }

        default void b(View view, x7 x7Var) {
            d();
        }

        default void c(View view, x7 x7Var) {
            a();
        }

        @Deprecated
        default void d() {
        }
    }

    @Deprecated
    boolean a(View view, x7 x7Var);

    default a b() {
        return null;
    }

    default boolean c(i8.k kVar, View view, x7 x7Var) {
        return a(view, x7Var);
    }
}
