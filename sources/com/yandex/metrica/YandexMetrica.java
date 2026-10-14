package com.yandex.metrica;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.ob.C1897q3;
import com.yandex.metrica.impl.ob.C2064wg;
import com.yandex.metrica.plugins.YandexMetricaPlugins;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class YandexMetrica {
    public static void activate(Context context, YandexMetricaConfig yandexMetricaConfig) {
        C2064wg.a().a(context, yandexMetricaConfig);
    }

    public static void activateReporter(Context context, ReporterConfig reporterConfig) {
        C2064wg.a().a(context, reporterConfig);
    }

    public static void enableActivityAutoTracking(Application application) {
        C2064wg.a().a(application);
    }

    public static int getLibraryApiLevel() {
        return 105;
    }

    public static String getLibraryVersion() {
        return "5.0.0";
    }

    public static YandexMetricaPlugins getPluginExtension() {
        return C1897q3.a();
    }

    public static IReporter getReporter(Context context, String str) {
        return C2064wg.a().a(context, str);
    }

    public static void initWebViewReporting(WebView webView) {
        C2064wg.a().a(webView);
    }

    public static void pauseSession(Activity activity) {
        C2064wg.a().a(activity);
    }

    public static void putErrorEnvironmentValue(String str, String str2) {
        C2064wg.a().a(str, str2);
    }

    public static void reportAppOpen(Activity activity) {
        C2064wg.a().b(activity);
    }

    public static void reportAppOpen(Intent intent) {
        C2064wg.a().a(intent);
    }

    public static void reportAppOpen(String str) {
        C2064wg.a().a(str);
    }

    public static void reportECommerce(ECommerceEvent eCommerceEvent) {
        C2064wg.a().a(eCommerceEvent);
    }

    public static void reportError(String str, String str2) {
        C2064wg.a().a(str, str2, null);
    }

    public static void reportError(String str, String str2, Throwable th) {
        C2064wg.a().a(str, str2, th);
    }

    public static void reportError(String str, Throwable th) {
        C2064wg.a().a(str, th);
    }

    public static void reportEvent(String str) {
        C2064wg.a().b(str);
    }

    public static void reportEvent(String str, String str2) {
        C2064wg.a().b(str, str2);
    }

    public static void reportEvent(String str, Map<String, Object> map) {
        C2064wg.a().a(str, map);
    }

    @Deprecated
    public static void reportNativeCrash(String str) {
        C2064wg.a().d(str);
    }

    public static void reportReferralUrl(String str) {
        C2064wg.a().e(str);
    }

    public static void reportRevenue(Revenue revenue) {
        C2064wg.a().a(revenue);
    }

    public static void reportUnhandledException(Throwable th) {
        C2064wg.a().a(th);
    }

    public static void reportUserProfile(UserProfile userProfile) {
        C2064wg.a().a(userProfile);
    }

    public static void requestAppMetricaDeviceID(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        C2064wg.a().a(appMetricaDeviceIDListener);
    }

    public static void requestDeferredDeeplink(DeferredDeeplinkListener deferredDeeplinkListener) {
        C2064wg.a().a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        C2064wg.a().a(deferredDeeplinkParametersListener);
    }

    public static void resumeSession(Activity activity) {
        C2064wg.a().c(activity);
    }

    public static void sendEventsBuffer() {
        C2064wg.a().i();
    }

    public static void setLocation(Location location) {
        C2064wg.a().a(location);
    }

    public static void setLocationTracking(Context context, boolean z10) {
        C2064wg.a().a(context, z10);
    }

    public static void setLocationTracking(boolean z10) {
        C2064wg.a().a(z10);
    }

    public static void setStatisticsSending(Context context, boolean z10) {
        C2064wg.a().b(context, z10);
    }

    public static void setUserProfileID(String str) {
        C2064wg.a().f(str);
    }
}
