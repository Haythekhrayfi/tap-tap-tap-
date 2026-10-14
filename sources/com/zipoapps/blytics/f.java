package com.zipoapps.blytics;

import android.app.Application;
import android.content.pm.PackageManager;
import androidx.activity.i;
import ch.qos.logback.core.CoreConstants;
import fd.g0;
import fd.j0;
import fd.z;
import java.util.Objects;
import jc.w;
import oc.h;
import uc.p;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.blytics.SessionManager$onSessionStartEvent$1$1", f = "SessionManager.kt", l = {61}, m = "invokeSuspend")
public final class f extends h implements p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SessionManager.SessionData f28228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SessionManager.SessionData sessionData, mc.d<? super f> dVar) {
        super(2, dVar);
        this.f28228d = sessionData;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new f(this.f28228d, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        return new f(this.f28228d, dVar).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        String str;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f28227c;
        if (i10 == 0) {
            h9.d.t(obj);
            this.f28227c = 1;
            if (z.m(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        com.zipoapps.premiumhelper.a aVar2 = ma.h.f33410y.a().f33419h;
        String sessionId = this.f28228d.getSessionId();
        long timestamp = this.f28228d.getTimestamp();
        Objects.requireNonNull(aVar2);
        j0.i(sessionId, "sessionId");
        jc.h[] hVarArr = new jc.h[4];
        hVarArr[0] = new jc.h("session_id", sessionId);
        hVarArr[1] = new jc.h("timestamp", Long.valueOf(timestamp));
        hVarArr[2] = new jc.h("application_id", aVar2.f28253a.getPackageName());
        Application application = aVar2.f28253a;
        j0.i(application, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
            j0.h(str, "{\n            context.pa… 0).versionName\n        }");
        } catch (PackageManager.NameNotFoundException e10) {
            xe.a.f37601c.c(e10);
            str = "";
        }
        hVarArr[3] = new jc.h("application_version", str);
        aVar2.u(aVar2.b("toto_session_start", false, i.a(hVarArr)));
        return w.f31842a;
    }
}
