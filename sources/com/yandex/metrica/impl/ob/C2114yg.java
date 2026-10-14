package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.YandexMetricaConfig;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2114yg extends Bg {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final uo<YandexMetricaConfig> f17915i = new ro(new qo("Config"));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final uo<String> f17916j = new ro(new po("Native crash"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final uo<Activity> f17917k = new ro(new qo("Activity"));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final uo<Intent> f17918l = new ro(new qo("Intent"));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final uo<Application> f17919m = new ro(new qo("Application"));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final uo<Context> f17920n = new ro(new qo("Context"));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final uo<Object> f17921o = new ro(new qo("Deeplink listener"));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final uo<AppMetricaDeviceIDListener> f17922p = new ro(new qo("DeviceID listener"));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final uo<ReporterConfig> f17923q = new ro(new qo("Reporter Config"));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final uo<String> f17924r = new ro(new po("Deeplink"));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final uo<String> f17925s = new ro(new po("Referral url"));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final uo<String> f17926t = new ro(new vo());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final uo<String> f17927u = new ro(new qo("Key"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final uo<WebView> f17928v = new ro(new qo("WebView"));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final uo<String> f17929w = new po("value");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final uo<String> f17930x = new po("name");

    public void a(Application application) {
        ((ro) f17919m).a(application);
    }

    public void a(Context context) {
        ((ro) f17920n).a(context);
    }

    public void a(Context context, ReporterConfig reporterConfig) {
        ((ro) f17920n).a(context);
        ((ro) f17923q).a(reporterConfig);
    }

    public void a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        ((ro) f17920n).a(context);
        ((ro) f17915i).a(yandexMetricaConfig);
    }

    public void a(Context context, String str) {
        ((ro) f17920n).a(context);
        ((ro) f17926t).a(str);
    }

    public void a(Intent intent) {
        ((ro) f17918l).a(intent);
    }

    public void a(WebView webView) {
        ((ro) f17928v).a(webView);
    }

    public void a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        ((ro) f17922p).a(appMetricaDeviceIDListener);
    }

    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        ((ro) f17921o).a(deferredDeeplinkListener);
    }

    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        ((ro) f17921o).a(deferredDeeplinkParametersListener);
    }

    public void a(String str) {
        ((ro) f17925s).a(str);
    }

    public void b(Context context) {
        ((ro) f17920n).a(context);
    }

    public void c(Activity activity) {
        ((ro) f17917k).a(activity);
    }

    public void c(String str) {
        ((ro) f17916j).a(str);
    }

    public void d(String str) {
        ((ro) f17927u).a(str);
    }

    public void e(String str) {
        ((ro) f17924r).a(str);
    }

    public boolean f(String str) {
        return ((po) f17930x).a(str).b();
    }

    public boolean g(String str) {
        return ((po) f17929w).a(str).b();
    }
}
