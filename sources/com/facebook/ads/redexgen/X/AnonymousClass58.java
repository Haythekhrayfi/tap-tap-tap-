package com.facebook.ads.redexgen.X;

import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.58, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass58 {
    public static <T> T A00(T impl, Class<T> clazz) {
        ClassLoader classLoader = impl.getClass().getClassLoader();
        return clazz.cast(Proxy.newProxyInstance(classLoader, new Class[]{clazz}, new AnonymousClass57(impl, classLoader)));
    }
}
