package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class lo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oo0 f22745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vw0 f22746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i01 f22747d;

    public final class a implements gx0.b<String>, gx0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ho0 f22749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lo0 f22750c;

        public a(lo0 lo0Var, String str, ho0 ho0Var) {
            fd.j0.i(str, "omSdkControllerUrl");
            fd.j0.i(ho0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f22750c = lo0Var;
            this.f22748a = str;
            this.f22749b = ho0Var;
        }

        @Override // com.yandex.mobile.ads.impl.gx0.a
        public final void a(bi1 bi1Var) {
            fd.j0.i(bi1Var, "error");
            this.f22749b.a();
        }

        @Override // com.yandex.mobile.ads.impl.gx0.b
        public final void a(String str) {
            String str2 = str;
            fd.j0.i(str2, "response");
            this.f22750c.f22745b.a(str2);
            this.f22750c.f22745b.b(this.f22748a);
            this.f22749b.a();
        }
    }

    public lo0(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f22744a = context.getApplicationContext();
        this.f22745b = po0.a(context);
        this.f22746c = vw0.a();
        this.f22747d = i01.b();
    }

    public final void a() {
        vw0 vw0Var = this.f22746c;
        Context context = this.f22744a;
        Objects.requireNonNull(vw0Var);
        vw0.a(context, "om_sdk_js_request_tag");
    }

    public final void a(ho0 ho0Var) {
        fd.j0.i(ho0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        nz0 nz0VarA = this.f22747d.a(this.f22744a);
        String strP = nz0VarA != null ? nz0VarA.p() : null;
        String strB = this.f22745b.b();
        boolean z10 = false;
        if (strP != null) {
            if (strP.length() > 0) {
                z10 = true;
            }
        }
        if (!z10 || fd.j0.d(strP, strB)) {
            ((no0) ho0Var).a();
            return;
        }
        a aVar = new a(this, strP, ho0Var);
        y41 y41Var = new y41(strP, aVar, aVar);
        y41Var.b((Object) "om_sdk_js_request_tag");
        this.f22746c.a(this.f22744a, y41Var);
    }
}
