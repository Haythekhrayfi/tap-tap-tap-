package qc;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class a extends pc.a {

    /* JADX INFO: renamed from: qc.a$a, reason: collision with other inner class name */
    public static final class C0394a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Integer f34873a;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null) {
                if (num.intValue() > 0) {
                    num2 = num;
                }
            }
            f34873a = num2;
        }
    }

    @Override // pc.a
    public void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Integer num = C0394a.f34873a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
