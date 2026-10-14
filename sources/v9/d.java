package v9;

import fd.j0;
import h9.k;
import h9.m;
import java.util.List;
import jc.w;
import u9.f;
import uc.l;

/* JADX INFO: loaded from: classes2.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f36763a = new a();

    public static final class a implements d {
        @Override // v9.d
        public <R, T> T b(String str, String str2, x8.a aVar, l<? super R, ? extends T> lVar, m<T> mVar, k<T> kVar, u9.e eVar) {
            j0.i(str, "expressionKey");
            j0.i(str2, "rawExpression");
            j0.i(mVar, "validator");
            j0.i(kVar, "fieldType");
            j0.i(eVar, "logger");
            return null;
        }

        @Override // v9.d
        public p7.d c(String str, List<String> list, uc.a<w> aVar) {
            j0.i(str, "rawExpression");
            int i10 = p7.d.C1;
            return p7.c.f34476c;
        }
    }

    default void a(f fVar) {
        j0.i(fVar, "e");
    }

    <R, T> T b(String str, String str2, x8.a aVar, l<? super R, ? extends T> lVar, m<T> mVar, k<T> kVar, u9.e eVar);

    p7.d c(String str, List<String> list, uc.a<w> aVar);
}
