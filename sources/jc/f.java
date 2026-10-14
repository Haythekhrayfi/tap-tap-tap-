package jc;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31810a;

        static {
            int[] iArr = new int[kotlin.a.values().length];
            try {
                iArr[kotlin.a.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.a.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.a.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31810a = iArr;
        }
    }

    public static final <T> e<T> a(kotlin.a aVar, uc.a<? extends T> aVar2) {
        j0.i(aVar, "mode");
        j0.i(aVar2, "initializer");
        int i10 = a.f31810a[aVar.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            vc.g gVar = null;
            return new k(aVar2, gVar, i11, gVar);
        }
        if (i10 == 2) {
            return new j(aVar2);
        }
        if (i10 == 3) {
            return new x(aVar2);
        }
        throw new g();
    }

    public static final <T> e<T> b(uc.a<? extends T> aVar) {
        j0.i(aVar, "initializer");
        vc.g gVar = null;
        return new k(aVar, gVar, 2, gVar);
    }
}
