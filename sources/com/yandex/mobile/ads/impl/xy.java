package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class xy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zy f26660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o1 f26661b;

    public final class a implements az {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g1 f26662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ xy f26663b;

        public a(xy xyVar, g1 g1Var) {
            fd.j0.i(g1Var, "adBlockerDetectorListener");
            this.f26663b = xyVar;
            this.f26662a = g1Var;
        }

        @Override // com.yandex.mobile.ads.impl.az
        public final void a(Boolean bool) {
            this.f26663b.f26661b.a(bool);
            this.f26662a.a();
        }
    }

    public /* synthetic */ xy(Context context) {
        this(context, new zy(), new o1(context));
    }

    public xy(Context context, zy zyVar, o1 o1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(zyVar, "hostAccessAdBlockerDetector");
        fd.j0.i(o1Var, "adBlockerStateStorageManager");
        this.f26660a = zyVar;
        this.f26661b = o1Var;
    }

    public final void a(g1 g1Var) {
        fd.j0.i(g1Var, "adBlockerDetectorListener");
        this.f26660a.a(new a(this, g1Var));
    }
}
