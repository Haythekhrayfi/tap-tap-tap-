package com.yandex.metrica;

import android.location.Location;
import com.yandex.metrica.impl.ob.C2019v1;
import com.yandex.metrica.impl.ob.U2;
import com.yandex.metrica.impl.ob.ro;
import com.yandex.metrica.impl.ob.uo;
import com.yandex.metrica.impl.ob.vo;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class YandexMetricaConfig {
    public final String apiKey;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final Boolean statisticsSending;
    public final String userProfileID;

    public static class Builder {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final uo<String> f13483r = new ro(new vo());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f13486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f13487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Boolean f13488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Location f13489f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Boolean f13490g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Boolean f13491h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PreloadInfo f13492i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Boolean f13493j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Boolean f13494k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Integer f13495l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public LinkedHashMap<String, String> f13496m = new LinkedHashMap<>();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f13497n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f13498o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f13499p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f13500q;

        public Builder(String str) {
            ((ro) f13483r).a(str);
            this.f13484a = str;
        }

        public YandexMetricaConfig build() {
            return new YandexMetricaConfig(this);
        }

        public Builder handleFirstActivationAsUpdate(boolean z10) {
            this.f13493j = Boolean.valueOf(z10);
            return this;
        }

        public Builder withAppOpenTrackingEnabled(boolean z10) {
            this.f13500q = Boolean.valueOf(z10);
            return this;
        }

        public Builder withAppVersion(String str) {
            this.f13485b = str;
            return this;
        }

        public Builder withCrashReporting(boolean z10) {
            this.f13487d = Boolean.valueOf(z10);
            return this;
        }

        public Builder withErrorEnvironmentValue(String str, String str2) {
            this.f13496m.put(str, str2);
            return this;
        }

        public Builder withLocation(Location location) {
            this.f13489f = location;
            return this;
        }

        public Builder withLocationTracking(boolean z10) {
            this.f13490g = Boolean.valueOf(z10);
            return this;
        }

        public Builder withLogs() {
            this.f13491h = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i10) {
            this.f13495l = Integer.valueOf(i10);
            return this;
        }

        public Builder withNativeCrashReporting(boolean z10) {
            this.f13488e = Boolean.valueOf(z10);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f13492i = preloadInfo;
            return this;
        }

        public Builder withRevenueAutoTrackingEnabled(boolean z10) {
            this.f13498o = Boolean.valueOf(z10);
            return this;
        }

        public Builder withSessionTimeout(int i10) {
            this.f13486c = Integer.valueOf(i10);
            return this;
        }

        public Builder withSessionsAutoTrackingEnabled(boolean z10) {
            this.f13499p = Boolean.valueOf(z10);
            return this;
        }

        public Builder withStatisticsSending(boolean z10) {
            this.f13494k = Boolean.valueOf(z10);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f13497n = str;
            return this;
        }
    }

    public YandexMetricaConfig(Builder builder) {
        this.apiKey = builder.f13484a;
        this.appVersion = builder.f13485b;
        this.sessionTimeout = builder.f13486c;
        this.crashReporting = builder.f13487d;
        this.nativeCrashReporting = builder.f13488e;
        this.location = builder.f13489f;
        this.locationTracking = builder.f13490g;
        this.logs = builder.f13491h;
        this.preloadInfo = builder.f13492i;
        this.firstActivationAsUpdate = builder.f13493j;
        this.statisticsSending = builder.f13494k;
        this.maxReportsInDatabaseCount = builder.f13495l;
        this.errorEnvironment = Collections.unmodifiableMap(builder.f13496m);
        this.userProfileID = builder.f13497n;
        this.revenueAutoTrackingEnabled = builder.f13498o;
        this.sessionsAutoTrackingEnabled = builder.f13499p;
        this.appOpenTrackingEnabled = builder.f13500q;
    }

    public YandexMetricaConfig(YandexMetricaConfig yandexMetricaConfig) {
        this.apiKey = yandexMetricaConfig.apiKey;
        this.appVersion = yandexMetricaConfig.appVersion;
        this.sessionTimeout = yandexMetricaConfig.sessionTimeout;
        this.crashReporting = yandexMetricaConfig.crashReporting;
        this.nativeCrashReporting = yandexMetricaConfig.nativeCrashReporting;
        this.location = yandexMetricaConfig.location;
        this.locationTracking = yandexMetricaConfig.locationTracking;
        this.logs = yandexMetricaConfig.logs;
        this.preloadInfo = yandexMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = yandexMetricaConfig.firstActivationAsUpdate;
        this.statisticsSending = yandexMetricaConfig.statisticsSending;
        this.maxReportsInDatabaseCount = yandexMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = yandexMetricaConfig.errorEnvironment;
        this.userProfileID = yandexMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = yandexMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = yandexMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = yandexMetricaConfig.appOpenTrackingEnabled;
    }

    public static Builder createBuilderFromConfig(YandexMetricaConfig yandexMetricaConfig) {
        Builder builderNewConfigBuilder = newConfigBuilder(yandexMetricaConfig.apiKey);
        if (U2.a((Object) yandexMetricaConfig.appVersion)) {
            builderNewConfigBuilder.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (U2.a(yandexMetricaConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (U2.a(yandexMetricaConfig.crashReporting)) {
            builderNewConfigBuilder.withCrashReporting(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.nativeCrashReporting)) {
            builderNewConfigBuilder.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.location)) {
            builderNewConfigBuilder.withLocation(yandexMetricaConfig.location);
        }
        if (U2.a(yandexMetricaConfig.locationTracking)) {
            builderNewConfigBuilder.withLocationTracking(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (U2.a(yandexMetricaConfig.preloadInfo)) {
            builderNewConfigBuilder.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (U2.a(yandexMetricaConfig.firstActivationAsUpdate)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.statisticsSending)) {
            builderNewConfigBuilder.withStatisticsSending(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (U2.a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry<String, String> entry : yandexMetricaConfig.errorEnvironment.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
            }
        }
        if (U2.a((Object) yandexMetricaConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(yandexMetricaConfig.userProfileID);
        }
        if (U2.a(yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            builderNewConfigBuilder.withRevenueAutoTrackingEnabled(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (U2.a(yandexMetricaConfig.appOpenTrackingEnabled)) {
            builderNewConfigBuilder.withAppOpenTrackingEnabled(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        return builderNewConfigBuilder;
    }

    public static YandexMetricaConfig fromJson(String str) {
        return new C2019v1().a(str);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str);
    }

    public String toJson() {
        return new C2019v1().a(this);
    }
}
