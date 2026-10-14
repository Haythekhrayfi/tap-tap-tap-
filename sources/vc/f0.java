package vc;

import fd.j0;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f0 {
    public static Collection a(Object obj) {
        if ((obj instanceof wc.a) && !(obj instanceof wc.b)) {
            d(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            j0.o(e10, f0.class.getName());
            throw e10;
        }
    }

    public static List b(Object obj) {
        if ((obj instanceof wc.a) && !(obj instanceof wc.b)) {
            d(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            j0.o(e10, f0.class.getName());
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x00bc  */
    public static Object c(Object obj, int i10) {
        boolean z10;
        int arity;
        if (obj != null) {
            if (obj instanceof jc.b) {
                if (obj instanceof i) {
                    arity = ((i) obj).getArity();
                } else if (obj instanceof uc.a) {
                    arity = 0;
                } else if (obj instanceof uc.l) {
                    arity = 1;
                } else if (obj instanceof uc.p) {
                    arity = 2;
                } else if (obj instanceof uc.q) {
                    arity = 3;
                } else if (obj instanceof uc.r) {
                    arity = 4;
                } else if (obj instanceof uc.s) {
                    arity = 5;
                } else if (obj instanceof uc.t) {
                    arity = 6;
                } else if (obj instanceof uc.u) {
                    arity = 7;
                } else if (obj instanceof uc.v) {
                    arity = 8;
                } else if (obj instanceof uc.w) {
                    arity = 9;
                } else if (obj instanceof uc.b) {
                    arity = 10;
                } else if (obj instanceof uc.c) {
                    arity = 11;
                } else if (obj instanceof uc.d) {
                    arity = 12;
                } else if (obj instanceof uc.e) {
                    arity = 13;
                } else if (obj instanceof uc.f) {
                    arity = 14;
                } else if (obj instanceof uc.g) {
                    arity = 15;
                } else if (obj instanceof uc.h) {
                    arity = 16;
                } else if (obj instanceof uc.i) {
                    arity = 17;
                } else if (obj instanceof uc.j) {
                    arity = 18;
                } else if (obj instanceof uc.k) {
                    arity = 19;
                } else if (obj instanceof uc.m) {
                    arity = 20;
                } else if (obj instanceof uc.n) {
                    arity = 21;
                } else {
                    arity = obj instanceof uc.o ? 22 : -1;
                }
                z10 = arity == i10;
            }
            if (!z10) {
                d(obj, "kotlin.jvm.functions.Function" + i10);
                throw null;
            }
        }
        return obj;
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(androidx.activity.j.a(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        j0.o(classCastException, f0.class.getName());
        throw classCastException;
    }
}
