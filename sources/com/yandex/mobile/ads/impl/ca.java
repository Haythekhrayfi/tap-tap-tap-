package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.YandexMetrica;

/* JADX INFO: loaded from: classes3.dex */
public final class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kw0 f19430a;

    public ca(kw0 kw0Var) {
        fd.j0.i(kw0Var, "reporterPolicyConfigurator");
        this.f19430a = kw0Var;
    }

    public final IReporter a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        String str = u6.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
        try {
            ReporterConfig reporterConfigBuild = ReporterConfig.newConfigBuilder(str).withStatisticsSending(this.f19430a.b(context)).build();
            fd.j0.h(reporterConfigBuild, "newConfigBuilder(apiKey)…\n                .build()");
            YandexMetrica.activateReporter(context, reporterConfigBuild);
            return YandexMetrica.getReporter(context, str);
        } catch (Throwable th) {
            x60.a(th, th.toString(), new Object[0]);
            return null;
        }
    }
}
