package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.os.Bundle;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Pj implements InterfaceC1571d1 {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public W0 a(com.yandex.metrica.f fVar) {
        return new Mj();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public String a() {
        return null;
    }

    @Override // com.yandex.metrica.impl.ob.ResultReceiverC1819n0.a
    public void a(int i10, Bundle bundle) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void a(Location location) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public void a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public void a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        iIdentifierCallback.onRequestError(IIdentifierCallback.Reason.UNKNOWN);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public void a(YandexMetricaConfig yandexMetricaConfig, com.yandex.metrica.j jVar) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void a(boolean z10) {
    }

    @Override // com.yandex.metrica.impl.ob.Y0
    public X0 b() {
        return new Nj();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void b(boolean z10) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public String c() {
        return null;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public void c(com.yandex.metrica.f fVar) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void c(String str, String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1571d1
    public C1969t1 d() {
        return new C1969t1(new Kj());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void setStatisticsSending(boolean z10) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void setUserProfileID(String str) {
    }
}
