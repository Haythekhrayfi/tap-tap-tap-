package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* JADX INFO: loaded from: classes3.dex */
public final class cl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jo0 f19544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bl0 f19545b;

    public static final class a implements ho0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f19546a;

        public a(b bVar) {
            fd.j0.i(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f19546a = bVar;
        }

        @Override // com.yandex.mobile.ads.impl.ho0
        public final void a() {
            this.f19546a.a();
        }
    }

    public interface b {
        void a();
    }

    public cl0(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f19544a = new jo0(context);
        this.f19545b = new bl0();
    }

    public final void a() {
        this.f19544a.a();
    }

    public final void a(wh0 wh0Var, b bVar) {
        fd.j0.i(wh0Var, "nativeAdBlock");
        fd.j0.i(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (!this.f19545b.a(wh0Var)) {
            ((rk0) bVar).a();
        } else {
            this.f19544a.a(new a(bVar));
        }
    }
}
