package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1 f20022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f20023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f20024c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Context context) {
        this(context, f1.a.a(context));
        int i10 = f1.f20480h;
    }

    public e1(Context context, f1 f1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(f1Var, "adBlockerDetector");
        this.f20022a = f1Var;
        this.f20023b = new ArrayList();
        this.f20024c = new Object();
    }

    public final void a() {
        List listH;
        synchronized (this.f20024c) {
            listH = kc.t.H(this.f20023b);
            this.f20023b.clear();
        }
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            this.f20022a.a((g1) it.next());
        }
    }

    public final void a(g1 g1Var) {
        fd.j0.i(g1Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f20024c) {
            this.f20023b.add(g1Var);
            this.f20022a.b(g1Var);
        }
    }
}
