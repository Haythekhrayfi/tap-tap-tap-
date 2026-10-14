package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class r9 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f24636f = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f24637g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q9 f24638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u9 f24639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f24640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<nc, Object> f24641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24642e;

    public final class a implements q9.a {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.q9.a
        public final void a(String str) {
            r9.this.a(str);
        }

        @Override // com.yandex.mobile.ads.impl.q9.a
        public final void b(String str) {
            r9.a(r9.this, str);
        }
    }

    public static final class b extends vc.l implements uc.a<jc.w> {
        public b() {
            super(0);
        }

        @Override // uc.a
        public final jc.w invoke() {
            Objects.requireNonNull(r9.this.f24639b);
            r9.a(r9.this, u9.a());
            return jc.w.f31842a;
        }
    }

    public r9(q9 q9Var, u9 u9Var, Handler handler) {
        fd.j0.i(q9Var, "appMetricaAutograbLoader");
        fd.j0.i(u9Var, "appMetricaErrorProvider");
        fd.j0.i(handler, "stopStartupParamsRequestHandler");
        this.f24638a = q9Var;
        this.f24639b = u9Var;
        this.f24640c = handler;
        this.f24641d = new WeakHashMap<>();
    }

    private final void a() {
        this.f24640c.postDelayed(new sp1(new b(), 0), f24636f);
    }

    public static final void a(r9 r9Var, String str) {
        Objects.requireNonNull(r9Var);
        x60.b(str, new Object[0]);
        r9Var.a((String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0029 A[LOOP:0: B:10:0x0023->B:12:0x0029, LOOP_END] */
    public final void a(String str) {
        Iterator it;
        Object obj = f24637g;
        synchronized (obj) {
            HashSet hashSet = new HashSet(this.f24641d.keySet());
            this.f24641d.clear();
            synchronized (obj) {
                this.f24640c.removeCallbacksAndMessages(null);
                this.f24642e = false;
            }
            it = hashSet.iterator();
            while (it.hasNext()) {
                ((nc) it.next()).a(str);
            }
        }
        it = hashSet.iterator();
        while (it.hasNext()) {
            ((nc) it.next()).a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(uc.a aVar) {
        fd.j0.i(aVar, "$tmp0");
        aVar.invoke();
    }

    public final void a(nc ncVar) {
        fd.j0.i(ncVar, "autograbRequestListener");
        synchronized (f24637g) {
            this.f24641d.remove(ncVar);
        }
    }

    public final void b(nc ncVar) {
        boolean z10;
        fd.j0.i(ncVar, "autograbRequestListener");
        Object obj = f24637g;
        synchronized (obj) {
            this.f24641d.put(ncVar, null);
        }
        try {
            synchronized (obj) {
                z10 = true;
                if (this.f24642e) {
                    z10 = false;
                } else {
                    this.f24642e = true;
                }
            }
            if (z10) {
                a();
                this.f24638a.a(new a());
            }
        } catch (Throwable th) {
            x60.a(th, th.getMessage(), new Object[0]);
            Objects.requireNonNull(this.f24639b);
            x60.b(u9.b(), new Object[0]);
            a((String) null);
        }
    }
}
