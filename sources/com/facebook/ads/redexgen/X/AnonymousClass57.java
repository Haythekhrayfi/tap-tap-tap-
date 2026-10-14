package com.facebook.ads.redexgen.X;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.57, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass57<T> implements InvocationHandler {
    public static byte[] A02;
    public static String[] A03 = {"HJBbstbFgkhP2Es2YC6tj0WPrL", "4IOUVAMDExjQBHSpAfoXSYCtPyIaCI88", "z5PEOWpVsYBM96D6", "SPmK69spxohqfCa0SsQ", "2TZuMIK", "01EkjjI8QhZqdiHuXsMGI", "efeA7FnPjHODjVcAjRmk7", "pSZyNCg"};
    public ClassLoader A00;
    public T A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[2].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "7LVLxstLm7VGVuwpoPddR";
            strArr[5] = "O4Ajby3FQpCfAUdim7NmB";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 40);
            i13++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-20, -5, -12};
    }

    static {
        A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.57 != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public AnonymousClass57(T impl, ClassLoader classLoader) {
        this.A01 = impl;
        this.A00 = classLoader;
    }

    public static Object A00(final ClassLoader classLoader, Method method) {
        Class<?> returnType = method.getReturnType();
        Object result = Void.TYPE;
        if (returnType.equals(result)) {
            return null;
        }
        if (returnType.isPrimitive()) {
            Object result2 = Array.newInstance(method.getReturnType(), 1);
            return Array.get(result2, 0);
        }
        if (returnType.equals(String.class)) {
            return A02(0, 0, 23);
        }
        if (!returnType.isInterface()) {
            return null;
        }
        return Proxy.newProxyInstance(classLoader, new Class[]{returnType}, new InvocationHandler() { // from class: com.facebook.ads.redexgen.X.56
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method2, Object[] objArr) {
                return AnonymousClass57.A00(classLoader, method2);
            }
        });
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.57 != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public final T A04() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.57 != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return method.invoke(this.A01, objArr);
        } catch (Throwable t10) {
            if (t10 instanceof InvocationTargetException) {
                Throwable targetException = ((InvocationTargetException) t10).getTargetException();
                if (targetException instanceof C05521x) {
                    throw new IllegalStateException(targetException.getMessage());
                }
            }
            Object objA00 = A00(this.A00, method);
            C1336Xv c1336XvA00 = C7P.A00();
            if (c1336XvA00 != null) {
                c1336XvA00.A07().A9K(A02(0, 3, 99), C06937v.A0O, new C06947w(t10));
                return objA00;
            }
            return objA00;
        }
    }
}
