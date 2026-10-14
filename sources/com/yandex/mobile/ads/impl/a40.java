package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a40 implements l40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b40 f18784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w3 f18785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m40 f18786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final xc1 f18787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k40 f18788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final xh1 f18789f;

    public a40(Context context, b40 b40Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(b40Var, "itemFinishedListener");
        this.f18784a = b40Var;
        w3 w3Var = new w3();
        this.f18785b = w3Var;
        m40 m40Var = new m40(context, w3Var, this);
        this.f18786c = m40Var;
        xc1 xc1Var = new xc1(context, w3Var);
        this.f18787d = xc1Var;
        this.f18788e = new k40(context, xc1Var, m40Var);
        this.f18789f = new xh1();
    }

    @Override // com.yandex.mobile.ads.impl.l40
    public final void a() {
        this.f18784a.a(this);
    }

    public final void a(InstreamAdLoadListener instreamAdLoadListener) {
        this.f18786c.a(instreamAdLoadListener);
    }

    public final void a(InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        fd.j0.i(instreamAdRequestConfiguration, "configuration");
        xh1 xh1Var = this.f18789f;
        String categoryId = instreamAdRequestConfiguration.getCategoryId();
        String pageId = instreamAdRequestConfiguration.getPageId();
        Map<String, String> parameters = instreamAdRequestConfiguration.getParameters();
        Objects.requireNonNull(xh1Var);
        wh1 wh1VarA = xh1.a(categoryId, pageId, parameters);
        fd.j0.h(wh1VarA, "vmapRequestConfigCreator…tion.parameters\n        )");
        this.f18786c.a(wh1VarA);
        this.f18785b.b(v3.f25800c);
        this.f18787d.a(wh1VarA, this.f18788e);
    }
}
