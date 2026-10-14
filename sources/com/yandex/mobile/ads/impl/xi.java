package com.yandex.mobile.ads.impl;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f26523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f26524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f26525c;

    public static final class a {
        public static xi a() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new xi(method3, method2, method);
        }
    }

    public xi(Method method, Method method2, Method method3) {
        this.f26523a = method;
        this.f26524b = method2;
        this.f26525c = method3;
    }

    public final Object a() {
        Method method = this.f26523a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = this.f26524b;
                fd.j0.f(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f26525c;
            fd.j0.f(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
