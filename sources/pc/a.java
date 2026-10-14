package pc;

import fd.j0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import zc.c;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: pc.a$a, reason: collision with other inner class name */
    public static final class C0386a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Method f34634a;

        /* JADX WARN: Code duplicated, block: B:13:0x003a  */
        static {
            Method method;
            boolean z10;
            Method[] methods = Throwable.class.getMethods();
            j0.h(methods, "throwableMethods");
            int length = methods.length;
            int i10 = 0;
            while (true) {
                method = null;
                if (i10 >= length) {
                    break;
                }
                Method method2 = methods[i10];
                if (j0.d(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    j0.h(parameterTypes, "it.parameterTypes");
                    j0.i(parameterTypes, "<this>");
                    z10 = j0.d(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class);
                }
                if (z10) {
                    method = method2;
                    break;
                }
                i10++;
            }
            f34634a = method;
            int length2 = methods.length;
            for (int i11 = 0; i11 < length2 && !j0.d(methods[i11].getName(), "getSuppressed"); i11++) {
            }
        }
    }

    public void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Method method = C0386a.f34634a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public c b() {
        return new zc.b();
    }
}
