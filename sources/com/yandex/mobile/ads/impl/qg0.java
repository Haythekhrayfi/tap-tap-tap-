package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* JADX INFO: loaded from: classes3.dex */
public final class qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r90 f24489a = new r90();

    public interface a {
        void a();
    }

    public static final class b implements kg0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final rg0 f24490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f24491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final wa0 f24492c;

        public b(rg0 rg0Var, a aVar, wa0 wa0Var) {
            fd.j0.i(rg0Var, "mraidWebViewPool");
            fd.j0.i(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            fd.j0.i(wa0Var, "media");
            this.f24490a = rg0Var;
            this.f24491b = aVar;
            this.f24492c = wa0Var;
        }

        @Override // com.yandex.mobile.ads.impl.kg0.a
        public final void a() {
            this.f24490a.b(this.f24492c);
            this.f24491b.a();
        }

        @Override // com.yandex.mobile.ads.impl.kg0.a
        public final void b() {
            this.f24491b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, wa0 wa0Var, a aVar) {
        kg0 kg0Var;
        fd.j0.i(context, "$context");
        fd.j0.i(wa0Var, "$media");
        fd.j0.i(aVar, "$listener");
        rg0 rg0VarA = rg0.f24709c.a(context);
        String strB = wa0Var.b();
        if (rg0VarA.b() || rg0VarA.a(wa0Var) || strB == null) {
            aVar.a();
            return;
        }
        b bVar = new b(rg0VarA, aVar, wa0Var);
        try {
            kg0Var = new kg0(context);
        } catch (Throwable unused) {
            aVar.a();
            kg0Var = null;
        }
        if (kg0Var != null) {
            kg0Var.setPreloadListener(bVar);
            rg0VarA.a(kg0Var, wa0Var);
            kg0Var.b(strB);
        }
    }

    public final void a(Context context, wa0 wa0Var, a aVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(wa0Var, "media");
        fd.j0.i(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f24489a.a(new ap1(context, wa0Var, aVar));
    }
}
