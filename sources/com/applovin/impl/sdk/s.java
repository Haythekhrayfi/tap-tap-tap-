package com.applovin.impl.sdk;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import ch.qos.logback.classic.spi.CallerData;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f11145c = (int) TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f11146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f11147b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<a, Long> f11148d = Collections.synchronizedMap(new HashMap());

    public enum a {
        ANR("anr"),
        BLACK_VIEW("black_view"),
        CRASH(AppMeasurement.CRASH_ORIGIN),
        JAVA_8_EXCEPTION("java_8_exception"),
        TASK_EXCEPTION("task_exception"),
        CAUGHT_EXCEPTION("caught_exception"),
        WEB_VIEW_ERROR("web_view_error"),
        INTEGRATION_ERROR("integration_error");


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f11161i;

        a(String str) {
            this.f11161i = str;
        }

        public String a() {
            return this.f11161i;
        }
    }

    public s(o oVar) {
        this.f11146a = oVar;
        this.f11147b = oVar.F();
    }

    private Map<String, String> a(String str, Map<String, String> map) {
        HashMap mapA = com.applovin.impl.mediation.b.a.c.a("type", str);
        mapA.put("platform", this.f11146a.M() != null ? this.f11146a.L().v() : this.f11146a.K().f());
        mapA.put("applovin_random_token", this.f11146a.s());
        mapA.put("compass_random_token", this.f11146a.r());
        mapA.put("model", Build.MODEL);
        mapA.put("brand", Build.MANUFACTURER);
        mapA.put("brand_name", Build.BRAND);
        mapA.put("hardware", Build.HARDWARE);
        mapA.put("revision", Build.DEVICE);
        mapA.put("os", Build.VERSION.RELEASE);
        mapA.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        mapA.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        mapA.put("aei", String.valueOf(this.f11146a.a(com.applovin.impl.sdk.c.b.aw)));
        mapA.put("mei", String.valueOf(this.f11146a.a(com.applovin.impl.sdk.c.b.ax)));
        a(mapA);
        b(mapA);
        if (map != null) {
            mapA.putAll(map);
        }
        return mapA;
    }

    private void a(Map<String, String> map) {
        String packageName;
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = o.au().getPackageManager();
            packageName = o.au().getPackageName();
            try {
                packageInfo = packageManager.getPackageInfo(packageName, 0);
            } catch (Throwable unused) {
                packageInfo = null;
            }
        } catch (Throwable unused2) {
            packageName = "";
        }
        map.put("package_name", packageName);
        map.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        map.put("app_version_code", String.valueOf(packageInfo != null ? packageInfo.versionCode : 0));
    }

    private boolean a(a aVar, long j10) {
        return System.currentTimeMillis() - (this.f11148d.containsKey(aVar) ? this.f11148d.get(aVar).longValue() : -1L) < j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a aVar, Map<String, String> map) {
        if (y.a()) {
            y yVar = this.f11147b;
            StringBuilder sbA = defpackage.a.a("Reporting ");
            sbA.append(aVar.a());
            sbA.append(" error...");
            yVar.b("ErrorReporter", sbA.toString());
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) c(aVar, map).openConnection();
            int i10 = f11145c;
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setRequestMethod("POST");
            int responseCode = httpURLConnection.getResponseCode();
            if (y.a()) {
                this.f11147b.b("ErrorReporter", aVar.a() + " reported with code " + responseCode);
            }
            this.f11148d.put(aVar, Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            if (y.a()) {
                y yVar2 = this.f11147b;
                StringBuilder sbA2 = defpackage.a.a("Failed to report ");
                sbA2.append(aVar.a());
                yVar2.a("ErrorReporter", sbA2.toString(), th);
            }
        }
    }

    private void b(Map<String, String> map) {
        String creativeId;
        Object objC = this.f11146a.V().c();
        if (objC instanceof com.applovin.impl.sdk.ad.e) {
            map.put("fs_ad_network", "AppLovin");
            creativeId = Long.toString(((com.applovin.impl.sdk.ad.e) objC).getAdIdNumber());
        } else if (objC instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) objC;
            map.put("fs_ad_network", aVar.getNetworkName());
            creativeId = aVar.getCreativeId();
        } else {
            creativeId = "None";
            map.put("fs_ad_network", "None");
        }
        map.put("fs_ad_creative_id", creativeId);
    }

    private URL c(a aVar, Map<String, String> map) throws MalformedURLException, UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder("https://ms.applovin.com/1.0/sdk/error");
        sb2.append(CallerData.NA);
        Iterator<Map.Entry<String, String>> it = a(aVar.a(), map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String strEncode = URLEncoder.encode(next.getKey(), "UTF-8");
            String strEncode2 = URLEncoder.encode(next.getValue(), "UTF-8");
            sb2.append(strEncode);
            sb2.append("=");
            sb2.append(strEncode2);
            if (it.hasNext()) {
                sb2.append("&");
            }
        }
        return new URL(sb2.toString());
    }

    public void a(a aVar) {
        a(aVar, (Map<String, String>) null);
    }

    public void a(a aVar, Map<String, String> map) {
        a(aVar, map, 0L);
    }

    public void a(final a aVar, final Map<String, String> map, long j10) {
        if (a(aVar, j10)) {
            return;
        }
        if (com.applovin.impl.sdk.utils.w.b()) {
            new Thread(new Runnable() { // from class: com.applovin.impl.sdk.s.1
                @Override // java.lang.Runnable
                public void run() {
                    s.this.b(aVar, map);
                }
            }).start();
        } else {
            b(aVar, map);
        }
    }

    public void a(String str, String str2, Throwable th) {
        HashMap map = new HashMap(3);
        map.put("source", str);
        map.put("details", StringUtils.emptyIfNull(str2));
        map.put("top_main_method", th.toString());
        a(a.CAUGHT_EXCEPTION, map);
    }

    public void a(String str, Throwable th) {
        a(str, (String) null, th);
    }
}
