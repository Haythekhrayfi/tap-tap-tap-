package p7;

import y9.l1;

/* JADX INFO: loaded from: classes2.dex */
public interface o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f34580a = new a();

    public static final class a implements o0 {
        @Override // p7.o0
        public void a(i8.k kVar, l1 l1Var) {
            fd.j0.i(kVar, "divView");
            fd.j0.i(l1Var, "data");
        }

        @Override // p7.o0
        public void b(i8.k kVar, l1 l1Var) {
            fd.j0.i(l1Var, "data");
        }
    }

    void a(i8.k kVar, l1 l1Var);

    void b(i8.k kVar, l1 l1Var);
}
