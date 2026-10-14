package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.YandexMetricaPlugins;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1897q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final YandexMetricaPlugins f17163a;

    static {
        Y yG = Y.g();
        fd.j0.h(yG, "ClientServiceLocator.getInstance()");
        InterfaceExecutorC1966sn interfaceExecutorC1966snC = yG.c();
        fd.j0.h(interfaceExecutorC1966snC, "ClientServiceLocator.get…stance().apiProxyExecutor");
        f17163a = new C1872p3(new C2009ug(interfaceExecutorC1966snC));
    }

    public static final YandexMetricaPlugins a() {
        return f17163a;
    }
}
