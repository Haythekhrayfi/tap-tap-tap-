package q1;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f34768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f34769b;

    @SuppressLint({"NewApi"})
    public static boolean a() {
        try {
            if (f34769b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f34769b == null) {
                f34768a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f34769b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f34769b.invoke(null, Long.valueOf(f34768a))).booleanValue();
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
                return false;
            }
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
