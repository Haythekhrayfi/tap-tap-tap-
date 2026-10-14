package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.IIdentifierCallback;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class y9 implements IIdentifierCallback {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    private static final long f26734g = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    private static final List<String> f26735h = kc.l.c("yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t9 f26736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x9 f26737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f26738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u9 f26739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f26741f;

    public static final class a extends vc.l implements uc.a<jc.w> {
        public a() {
            super(0);
        }

        @Override // uc.a
        public final jc.w invoke() {
            y9.b(y9.this);
            Objects.requireNonNull(y9.this.f26739d);
            y9.a(y9.this, u9.a());
            return jc.w.f31842a;
        }
    }

    public y9(t9 t9Var, x9 x9Var) {
        fd.j0.i(t9Var, "appMetricaBridge");
        fd.j0.i(x9Var, "appMetricaIdentifiersChangedObservable");
        this.f26736a = t9Var;
        this.f26737b = x9Var;
        this.f26738c = new Handler(Looper.getMainLooper());
        this.f26739d = new u9();
        this.f26741f = new Object();
    }

    private final void a() {
        this.f26738c.postDelayed(new sp1(new a(), 1), f26734g);
    }

    private final void a(Context context) {
        boolean z10;
        synchronized (this.f26741f) {
            z10 = true;
            if (this.f26740e) {
                z10 = false;
            } else {
                this.f26740e = true;
            }
        }
        if (z10) {
            x60.b("requestStartupParams", new Object[0]);
            a();
            t9 t9Var = this.f26736a;
            List<String> list = f26735h;
            Objects.requireNonNull(t9Var);
            t9.a(context, this, list);
        }
    }

    public static final void a(y9 y9Var, String str) {
        Objects.requireNonNull(y9Var);
        x60.c(str, new Object[0]);
        y9Var.f26737b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(uc.a aVar) {
        fd.j0.i(aVar, "$tmp0");
        aVar.invoke();
    }

    public static final void b(y9 y9Var) {
        synchronized (y9Var.f26741f) {
            y9Var.f26738c.removeCallbacksAndMessages(null);
            y9Var.f26740e = false;
        }
    }

    public final void a(Context context, u10 u10Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(u10Var, "observer");
        this.f26737b.a(u10Var);
        try {
            a(context);
        } catch (Throwable th) {
            synchronized (this.f26741f) {
                this.f26738c.removeCallbacksAndMessages(null);
                this.f26740e = false;
                x60.a(th, th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.metrica.IIdentifierCallback
    public final void onReceive(Map<String, String> map) {
        x60.d("Params from the AppMetrica were obtained, data: %s", map);
        synchronized (this.f26741f) {
            this.f26738c.removeCallbacksAndMessages(null);
            this.f26740e = false;
        }
        if (map != null) {
            this.f26737b.a(new w9(map.get("yandex_mobile_metrica_get_ad_url"), map.get("yandex_mobile_metrica_device_id"), map.get("yandex_mobile_metrica_uuid")));
            return;
        }
        Objects.requireNonNull(this.f26739d);
        x60.c(u9.c(), new Object[0]);
        this.f26737b.a();
    }

    @Override // com.yandex.metrica.IIdentifierCallback
    public final void onRequestError(IIdentifierCallback.Reason reason) {
        fd.j0.i(reason, "failureReason");
        synchronized (this.f26741f) {
            this.f26738c.removeCallbacksAndMessages(null);
            this.f26740e = false;
        }
        x60.c(this.f26739d.a(reason), new Object[0]);
        this.f26737b.a();
    }
}
