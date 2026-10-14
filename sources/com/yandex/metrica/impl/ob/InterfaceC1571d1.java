package com.yandex.metrica.impl.ob;

import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1571d1 extends InterfaceC2049w1, ResultReceiverC1819n0.a, Y0 {
    W0 a(com.yandex.metrica.f fVar);

    String a();

    void a(AppMetricaDeviceIDListener appMetricaDeviceIDListener);

    void a(DeferredDeeplinkListener deferredDeeplinkListener);

    void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    void a(IIdentifierCallback iIdentifierCallback, List<String> list);

    void a(YandexMetricaConfig yandexMetricaConfig, com.yandex.metrica.j jVar);

    String c();

    void c(com.yandex.metrica.f fVar);

    C1969t1 d();
}
