package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1502a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K0 f15735a;

    public C1502a7(K0 k10) {
        this.f15735a = k10;
    }

    public final C1876p7 a(PluginErrorDetails pluginErrorDetails) {
        return C1901q7.a(pluginErrorDetails.getExceptionClass(), pluginErrorDetails.getMessage(), pluginErrorDetails.getStacktrace(), pluginErrorDetails.getPlatform(), pluginErrorDetails.getVirtualMachineVersion(), pluginErrorDetails.getPluginEnvironment(), this.f15735a.a(), this.f15735a.b());
    }
}
