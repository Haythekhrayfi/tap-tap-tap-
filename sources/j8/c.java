package j8;

import fd.j0;
import y9.b8;
import y9.l1;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31727a;

        static {
            int[] iArr = new int[b8.values().length];
            iArr[b8.DATA_CHANGE.ordinal()] = 1;
            iArr[b8.ANY_CHANGE.ordinal()] = 2;
            iArr[b8.STATE_CHANGE.ordinal()] = 3;
            f31727a = iArr;
        }
    }

    public static final boolean a(l1 l1Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        return b(l1Var.f41200d.b(dVar));
    }

    public static final boolean b(b8 b8Var) {
        j0.i(b8Var, "<this>");
        int i10 = a.f31727a[b8Var.ordinal()];
        return i10 == 1 || i10 == 2;
    }
}
