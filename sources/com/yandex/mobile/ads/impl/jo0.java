package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mo0 f22110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f22111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f22112c;

    public jo0(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f22110a = mo0.f23119g.a(context);
        this.f22111b = new Object();
        this.f22112c = new ArrayList();
    }

    public final void a() {
        List listH;
        synchronized (this.f22111b) {
            listH = kc.t.H(this.f22112c);
            this.f22112c.clear();
        }
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            this.f22110a.a((ho0) it.next());
        }
    }

    public final void a(ho0 ho0Var) {
        fd.j0.i(ho0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f22111b) {
            this.f22112c.add(ho0Var);
            this.f22110a.b(ho0Var);
        }
    }
}
