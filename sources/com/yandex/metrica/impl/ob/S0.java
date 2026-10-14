package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.IPluginReporter;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface S0 extends W0, IPluginReporter {
    void a(int i10, String str, String str2, Map<String, String> map);

    void a(String str, String str2);

    void b(String str);

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.e
    /* synthetic */ void b(String str, String str2);

    void c(String str);

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.e
    /* synthetic */ void d(String str, String str2);
}
