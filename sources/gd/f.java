package gd;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import jc.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    private static volatile Choreographer choreographer;

    static {
        Object objF;
        boolean z10 = false;
        boolean z11 = false;
        try {
            i.a aVar = i.f31813c;
            objF = new d(a(Looper.getMainLooper(), true), z11 ? 1 : 0, 2, z10 ? 1 : 0);
        } catch (Throwable th) {
            i.a aVar2 = i.f31813c;
            objF = h9.d.f(th);
        }
        i.a aVar3 = i.f31813c;
    }

    public static final Handler a(Looper looper, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
