package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.YandexMetricaPlugins;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1872p3 implements YandexMetricaPlugins {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2009ug f17036a;

    public C1872p3(C2009ug c2009ug) {
        this.f17036a = c2009ug;
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f17036a.a(pluginErrorDetails, str);
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f17036a.a(str, str2, pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f17036a.a(pluginErrorDetails);
    }
}
