package fd;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class j0 implements u3.f {
    public j0(int i10) {
    }

    public static boolean c(Float f10, Float f11) {
        if (f10 == null) {
            if (f11 == null) {
                return true;
            }
        } else if (f11 != null && f10.floatValue() == f11.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(i.f.a(str, " must not be null"));
        o(illegalStateException, j0.class.getName());
        throw illegalStateException;
    }

    public static void f(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        o(nullPointerException, j0.class.getName());
        throw nullPointerException;
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        o(nullPointerException, j0.class.getName());
        throw nullPointerException;
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(i.f.a(str, " must not be null"));
        o(nullPointerException, j0.class.getName());
        throw nullPointerException;
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(l(str));
        o(nullPointerException, j0.class.getName());
        throw nullPointerException;
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(l(str));
        o(illegalArgumentException, j0.class.getName());
        throw illegalArgumentException;
    }

    public static int k(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static String l(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        StringBuilder sbA = q2.a.a("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbA.append(str);
        return sbA.toString();
    }

    public static final String m(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String n(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static <T extends Throwable> T o(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    public static String p(String str, Object obj) {
        return str + obj;
    }

    public static void q() {
        jc.d dVar = new jc.d();
        o(dVar, j0.class.getName());
        throw dVar;
    }

    public static void r(String str) {
        jc.v vVar = new jc.v(androidx.activity.j.a("lateinit property ", str, " has not been initialized"));
        o(vVar, j0.class.getName());
        throw vVar;
    }

    public static final String s(mc.d<?> dVar) {
        Object objF;
        if (dVar instanceof kd.f) {
            return dVar.toString();
        }
        try {
            jc.i.a aVar = jc.i.f31813c;
            objF = dVar + '@' + n(dVar);
        } catch (Throwable th) {
            jc.i.a aVar2 = jc.i.f31813c;
            objF = h9.d.f(th);
        }
        if (jc.i.a(objF) != null) {
            objF = dVar.getClass().getName() + '@' + n(dVar);
        }
        return (String) objF;
    }

    @Override // u3.f
    public void a(u3.g gVar) {
        gVar.onStart();
    }

    @Override // u3.f
    public void b(u3.g gVar) {
    }
}
