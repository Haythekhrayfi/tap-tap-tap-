package com.yandex.metrica.plugins;

/* JADX INFO: loaded from: classes.dex */
public interface YandexMetricaPlugins {
    void reportError(PluginErrorDetails pluginErrorDetails, String str);

    void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails);

    void reportUnhandledException(PluginErrorDetails pluginErrorDetails);
}
