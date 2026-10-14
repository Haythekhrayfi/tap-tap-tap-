package com.yandex.metrica.impl.ob;

import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class Mj implements W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lj f14519a = new Lj();

    public void a(C1602e7 c1602e7) {
    }

    public void a(C1876p7 c1876p7) {
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void a(String str, JSONObject jSONObject) {
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void b() {
    }

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.e
    public void b(String str, String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.e
    public void d(String str, String str2) {
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this.f14519a;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) {
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z10) {
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
    }
}
