package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.StackTraceItem;
import java.util.Collection;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2139zg implements IPluginReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uo<PluginErrorDetails> f18024a = new ro(new qo("Error details"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uo<String> f18025b = new ro(new po("Error identifier"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uo<Collection<StackTraceItem>> f18026c = new oo("Stacktrace");

    public boolean a(PluginErrorDetails pluginErrorDetails, String str) {
        this.f18024a.a(pluginErrorDetails);
        return this.f18026c.a(pluginErrorDetails.getStacktrace()).b();
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f18024a.a(pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f18025b.a(str);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f18024a.a(pluginErrorDetails);
    }
}
