package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import com.yandex.mobile.ads.common.MobileAds;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u90 f22948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fu f22949b;

    public static final class a extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f22951b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f22951b = context;
        }

        @Override // uc.a
        public final jc.w invoke() {
            ma.this.b(this.f22951b);
            return jc.w.f31842a;
        }
    }

    public ma(s90 s90Var, u90 u90Var) {
        fd.j0.i(s90Var, "mainThreadHandler");
        fd.j0.i(u90Var, "manifestAnalyzer");
        this.f22948a = u90Var;
        this.f22949b = new fu(s90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
        x60.b("SDK initialized", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Context context) {
        if (BuildConfigFieldProvider.isAutotest()) {
            return;
        }
        Objects.requireNonNull(this.f22948a);
        if (u90.b(context)) {
            MobileAds.initialize(context, dp1.f19960s);
        }
    }

    public final void a(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        nz0 nz0VarA = i01.b().a(context);
        if (nz0VarA != null && nz0VarA.w()) {
            this.f22949b.a(new a(context));
        } else {
            b(context);
        }
    }
}
