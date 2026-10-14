package p7;

import android.net.Uri;
import android.view.View;
import y9.o8;
import y9.r4;
import y9.t2;

/* JADX INFO: loaded from: classes2.dex */
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f34513a = new a();

    public class a implements h {
    }

    default void a(i8.k kVar) {
    }

    default void b(i8.k kVar, View view, y9.q qVar) {
    }

    default void c(i8.k kVar, int i10, y9.q qVar) {
    }

    default void d(i8.k kVar, int i10, String str, y9.q qVar) {
        v9.b<Uri> bVar = qVar.f42101f;
        h(kVar, i10, str, bVar != null ? bVar.b(kVar.getExpressionResolver()) : null);
    }

    default void e(i8.k kVar, View view, o8 o8Var) {
    }

    default void f(i8.k kVar, View view, Float f10) {
    }

    default void g(i8.k kVar, y9.q qVar) {
    }

    @Deprecated
    default void h(i8.k kVar, int i10, String str, Uri uri) {
    }

    default void i(i8.k kVar, r4 r4Var, int i10, String str) {
    }

    default void j(i8.k kVar, View view, y9.q qVar) {
    }

    default void k(i8.k kVar, View view, y9.q qVar) {
    }

    default void l(i8.k kVar, t2 t2Var, int i10, int i11, String str) {
    }

    default void m(i8.k kVar, View view, y9.q qVar, String str) {
        t(kVar, view, qVar);
    }

    default void n(i8.k kVar, View view, o8 o8Var, String str) {
        e(kVar, view, o8Var);
    }

    default void o(i8.k kVar, View view, y9.q qVar, Boolean bool) {
    }

    default void p(i8.k kVar, int i10) {
    }

    default void q(i8.k kVar, View view, y9.q qVar, String str) {
        j(kVar, view, qVar);
    }

    default void r(i8.k kVar, View view, y9.q qVar, String str) {
        b(kVar, view, qVar);
    }

    default void s(i8.k kVar) {
    }

    default void t(i8.k kVar, View view, y9.q qVar) {
    }
}
