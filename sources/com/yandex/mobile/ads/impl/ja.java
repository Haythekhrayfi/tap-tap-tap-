package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;

/* JADX INFO: loaded from: classes3.dex */
public final class ja extends vw<ha> {
    private final pt0 D;

    public static final class a implements t3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r3<ja> f21998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ja f21999b;

        public a(r3<ja> r3Var, ja jaVar) {
            fd.j0.i(r3Var, "itemsFinishListener");
            fd.j0.i(jaVar, "loadController");
            this.f21998a = r3Var;
            this.f21999b = jaVar;
        }

        @Override // com.yandex.mobile.ads.impl.t3
        public final void a() {
            this.f21998a.a(this.f21999b);
        }
    }

    public /* synthetic */ ja(Context context, r3 r3Var) {
        w3 w3Var = new w3();
        this(context, r3Var, w3Var, new pz(), new ia(context), new pt0(context, w3Var));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(Context context, r3<ja> r3Var, w3 w3Var, pz pzVar, ia iaVar, pt0 pt0Var) {
        super(context, l6.f22633h, pt0Var, w3Var, iaVar, pzVar);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(r3Var, "itemsLoadFinishListener");
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        fd.j0.i(pzVar, "htmlAdResponseReportManager");
        fd.j0.i(iaVar, "adContentControllerFactory");
        fd.j0.i(pt0Var, "proxyAppOpenAdLoadListener");
        this.D = pt0Var;
        pt0Var.a(new a(r3Var, this));
    }

    @Override // com.yandex.mobile.ads.impl.vw
    public final pw<ha> a(qw qwVar) {
        fd.j0.i(qwVar, "controllerFactory");
        pw<ha> pwVarB = qwVar.b(this);
        fd.j0.h(pwVarB, "controllerFactory.createAppOpenAdController(this)");
        return pwVarB;
    }

    public final void a(AppOpenAdLoadListener appOpenAdLoadListener) {
        this.D.a(appOpenAdLoadListener);
    }
}
