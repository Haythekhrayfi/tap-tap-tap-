package com.yandex.metrica;

import com.yandex.metrica.impl.ob.U2;
import com.yandex.metrica.impl.ob.ro;
import com.yandex.metrica.impl.ob.uo;
import com.yandex.metrica.impl.ob.vo;

/* JADX INFO: loaded from: classes.dex */
public class ReporterConfig {
    public final String apiKey;
    public final Boolean logs;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final Boolean statisticsSending;
    public final String userProfileID;

    public static class Builder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final uo<String> f13466g = new ro(new vo());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f13468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f13469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f13470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f13471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f13472f;

        public Builder(String str) {
            ((ro) f13466g).a(str);
            this.f13467a = str;
        }

        public ReporterConfig build() {
            return new ReporterConfig(this);
        }

        public Builder withLogs() {
            this.f13469c = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i10) {
            this.f13471e = Integer.valueOf(i10);
            return this;
        }

        public Builder withSessionTimeout(int i10) {
            this.f13468b = Integer.valueOf(i10);
            return this;
        }

        public Builder withStatisticsSending(boolean z10) {
            this.f13470d = Boolean.valueOf(z10);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f13472f = str;
            return this;
        }
    }

    public ReporterConfig(Builder builder) {
        this.apiKey = builder.f13467a;
        this.sessionTimeout = builder.f13468b;
        this.logs = builder.f13469c;
        this.statisticsSending = builder.f13470d;
        this.maxReportsInDatabaseCount = builder.f13471e;
        this.userProfileID = builder.f13472f;
    }

    public ReporterConfig(ReporterConfig reporterConfig) {
        this.apiKey = reporterConfig.apiKey;
        this.sessionTimeout = reporterConfig.sessionTimeout;
        this.logs = reporterConfig.logs;
        this.statisticsSending = reporterConfig.statisticsSending;
        this.maxReportsInDatabaseCount = reporterConfig.maxReportsInDatabaseCount;
        this.userProfileID = reporterConfig.userProfileID;
    }

    public static Builder createBuilderFromConfig(ReporterConfig reporterConfig) {
        Builder builderNewConfigBuilder = newConfigBuilder(reporterConfig.apiKey);
        if (U2.a(reporterConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(reporterConfig.sessionTimeout.intValue());
        }
        if (U2.a(reporterConfig.logs) && reporterConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (U2.a(reporterConfig.statisticsSending)) {
            builderNewConfigBuilder.withStatisticsSending(reporterConfig.statisticsSending.booleanValue());
        }
        if (U2.a(reporterConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(reporterConfig.maxReportsInDatabaseCount.intValue());
        }
        if (U2.a((Object) reporterConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(reporterConfig.userProfileID);
        }
        return builderNewConfigBuilder;
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str);
    }
}
