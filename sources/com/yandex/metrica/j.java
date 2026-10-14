package com.yandex.metrica;

import com.yandex.metrica.impl.ob.U2;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j extends YandexMetricaConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f18067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f18069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f18070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f18071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f18072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<String, String> f18073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f18074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f18075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f18076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f18077l;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public YandexMetricaConfig.Builder f18078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<String> f18080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f18081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map<String, String> f18082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f18083f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f18084g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f18085h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LinkedHashMap<String, String> f18086i = new LinkedHashMap<>();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Boolean f18087j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Boolean f18088k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Boolean f18089l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public d f18090m;

        public b(String str) {
            this.f18078a = YandexMetricaConfig.newConfigBuilder(str);
        }

        public b a(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f18081d = Integer.valueOf(i10);
            return this;
        }

        public j b() {
            return new j(this, null);
        }
    }

    public j(YandexMetricaConfig yandexMetricaConfig) {
        super(yandexMetricaConfig);
        this.f18066a = null;
        this.f18067b = null;
        this.f18070e = null;
        this.f18071f = null;
        this.f18072g = null;
        this.f18068c = null;
        this.f18073h = null;
        this.f18074i = null;
        this.f18075j = null;
        this.f18069d = null;
        this.f18076k = null;
        this.f18077l = null;
    }

    public j(b bVar, a aVar) {
        super(bVar.f18078a);
        this.f18070e = bVar.f18081d;
        List<String> list = bVar.f18080c;
        this.f18069d = list == null ? null : Collections.unmodifiableList(list);
        this.f18066a = bVar.f18079b;
        Map<String, String> map = bVar.f18082e;
        this.f18067b = map != null ? Collections.unmodifiableMap(map) : null;
        this.f18072g = bVar.f18085h;
        this.f18071f = bVar.f18084g;
        this.f18068c = bVar.f18083f;
        this.f18073h = Collections.unmodifiableMap(bVar.f18086i);
        this.f18074i = bVar.f18087j;
        this.f18075j = bVar.f18088k;
        this.f18076k = bVar.f18089l;
        this.f18077l = bVar.f18090m;
    }

    public static b a(YandexMetricaConfig yandexMetricaConfig) {
        b bVar = new b(yandexMetricaConfig.apiKey);
        if (U2.a((Object) yandexMetricaConfig.appVersion)) {
            bVar.f18078a.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (U2.a(yandexMetricaConfig.sessionTimeout)) {
            bVar.f18078a.withSessionTimeout(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (U2.a(yandexMetricaConfig.crashReporting)) {
            bVar.f18078a.withCrashReporting(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.nativeCrashReporting)) {
            bVar.f18078a.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.location)) {
            bVar.f18078a.withLocation(yandexMetricaConfig.location);
        }
        if (U2.a(yandexMetricaConfig.locationTracking)) {
            bVar.f18078a.withLocationTracking(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            bVar.f18078a.withLogs();
        }
        if (U2.a(yandexMetricaConfig.preloadInfo)) {
            bVar.f18078a.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (U2.a(yandexMetricaConfig.firstActivationAsUpdate)) {
            bVar.f18078a.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.statisticsSending)) {
            bVar.f18078a.withStatisticsSending(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.maxReportsInDatabaseCount)) {
            bVar.f18078a.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (U2.a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry<String, String> entry : yandexMetricaConfig.errorEnvironment.entrySet()) {
                bVar.f18078a.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
            }
        }
        if (U2.a((Object) yandexMetricaConfig.userProfileID)) {
            bVar.f18078a.withUserProfileID(yandexMetricaConfig.userProfileID);
        }
        if (U2.a(yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            bVar.f18078a.withRevenueAutoTrackingEnabled(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            bVar.f18078a.withSessionsAutoTrackingEnabled(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.appOpenTrackingEnabled)) {
            bVar.f18078a.withAppOpenTrackingEnabled(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (yandexMetricaConfig instanceof j) {
            j jVar = (j) yandexMetricaConfig;
            if (U2.a((Object) jVar.f18069d)) {
                bVar.f18080c = jVar.f18069d;
            }
            if (U2.a(jVar.f18077l)) {
                bVar.f18090m = jVar.f18077l;
            }
            U2.a((Object) null);
        }
        return bVar;
    }
}
