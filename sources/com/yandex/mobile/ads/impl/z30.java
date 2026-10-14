package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class z30 implements b40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t90 f27204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<a40> f27205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r90 f27206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InstreamAdLoadListener f27207e;

    public z30(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f27203a = context;
        t90 t90Var = new t90(context);
        this.f27204b = t90Var;
        this.f27205c = new CopyOnWriteArrayList<>();
        this.f27206d = new r90();
        t90Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(z30 z30Var, InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        fd.j0.i(z30Var, "this$0");
        fd.j0.i(instreamAdRequestConfiguration, "$configuration");
        a40 a40Var = new a40(z30Var.f27203a, z30Var);
        z30Var.f27205c.add(a40Var);
        a40Var.a(z30Var.f27207e);
        a40Var.a(instreamAdRequestConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final void a(a40 a40Var) {
        fd.j0.i(a40Var, "nativeAdLoadingItem");
        this.f27204b.a();
        this.f27205c.remove(a40Var);
    }

    public final void a(InstreamAdLoadListener instreamAdLoadListener) {
        this.f27204b.a();
        this.f27207e = instreamAdLoadListener;
        Iterator<T> it = this.f27205c.iterator();
        while (it.hasNext()) {
            ((a40) it.next()).a(instreamAdLoadListener);
        }
    }

    public final void a(InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        fd.j0.i(instreamAdRequestConfiguration, "configuration");
        this.f27204b.a();
        this.f27206d.a(new do1(this, instreamAdRequestConfiguration));
    }
}
