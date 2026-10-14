package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<Class<?>> f2216a = kc.l.c(Application.class, e0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<Class<?>> f2217b = kc.k.a(e0.class);

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> list) {
        fd.j0.i(list, "signature");
        Object[] constructors = cls.getConstructors();
        fd.j0.h(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            fd.j0.h(parameterTypes, "constructor.parameterTypes");
            List listB = kc.j.B(parameterTypes);
            if (fd.j0.d(list, listB)) {
                return constructor;
            }
            if (list.size() == listB.size() && listB.containsAll(list)) {
                StringBuilder sbA = defpackage.a.a("Class ");
                sbA.append(cls.getSimpleName());
                sbA.append(" must have parameters in the proper order: ");
                sbA.append(list);
                throw new UnsupportedOperationException(sbA.toString());
            }
        }
        return null;
    }

    public static final <T extends l0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
