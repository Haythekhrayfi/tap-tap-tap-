package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.location.Location;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Kj extends Mj implements U0 {
    @Override // com.yandex.metrica.impl.ob.S0
    public void a(int i10, String str, String str2, Map<String, String> map) {
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(Activity activity) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void a(Location location) {
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(Ol ol, boolean z10) {
        ol.onError("Device user is in locked state");
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(X2 x10) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.impl.ob.InterfaceC1521b1
    public void a(C1602e7 c1602e7) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.impl.ob.InterfaceC1521b1
    public void a(C1876p7 c1876p7) {
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(C2097y.c cVar) {
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(String str) {
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void a(String str, String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.impl.ob.W0
    public void a(String str, JSONObject jSONObject) {
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(String str, boolean z10) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1741jm
    public void a(JSONObject jSONObject) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void a(boolean z10) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.impl.ob.W0
    public void b() {
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void b(Activity activity) {
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void b(String str) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.impl.ob.W0, com.yandex.metrica.e
    public void b(String str, String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1741jm
    public void b(JSONObject jSONObject) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void b(boolean z10) {
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void c(String str) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void c(String str, String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.impl.ob.W0, com.yandex.metrica.e
    public void d(String str, String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void pauseSession() {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void reportEvent(String str) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void reportEvent(String str, Map map) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) {
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void resumeSession() {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z10) {
    }

    @Override // com.yandex.metrica.impl.ob.Mj, com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
    }
}
