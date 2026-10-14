package com.yandex.mobile.ads.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class iv0 {
    public static Object a(Class cls, String str, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            clsArr[i10] = objArr[i10].getClass();
        }
        return a(null, cls, str, clsArr, objArr);
    }

    public static <T> T a(Class<T> cls, Object... objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            clsArr[i10] = objArr[i10].getClass();
        }
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            boolean zIsAccessible = declaredConstructor.isAccessible();
            if (!zIsAccessible) {
                declaredConstructor.setAccessible(true);
            }
            T tNewInstance = declaredConstructor.newInstance(objArr);
            if (!zIsAccessible) {
                declaredConstructor.setAccessible(false);
            }
            return tNewInstance;
        } catch (Exception unused) {
            x60.c("Can not instantiate instance of %s with constructor arguments: %s", cls.getCanonicalName(), Arrays.toString(objArr));
            return null;
        }
    }

    private static Object a(Object obj, Class<?> cls, String str, Class<?>[] clsArr, Object... objArr) {
        Object objInvoke;
        Method method;
        loop0: while (true) {
            objInvoke = null;
            if (cls == null) {
                method = null;
                break;
            }
            try {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                for (int i10 = 0; i10 < length; i10++) {
                    method = declaredMethods[i10];
                    if (str.equals(method.getName()) && a(method, clsArr)) {
                        break loop0;
                    }
                }
                cls = cls.getSuperclass();
            } catch (Exception unused) {
                x60.f("Method %s(...) isn't found when using reflection", str);
                return objInvoke;
            }
        }
        if (method == null) {
            return null;
        }
        method.setAccessible(true);
        objInvoke = method.invoke(obj, objArr);
        method.setAccessible(false);
        return objInvoke;
    }

    public static Object a(Object obj, String str, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            clsArr[i10] = objArr[i10].getClass();
        }
        return a(obj, obj.getClass(), str, clsArr, objArr);
    }

    private static boolean a(Method method, Class<?>[] clsArr) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != clsArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (!parameterTypes[i10].isAssignableFrom(clsArr[i10])) {
                return false;
            }
        }
        return true;
    }
}
