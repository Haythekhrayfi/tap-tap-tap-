package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class qm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mc0 f24537a = new mc0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qg0 f24538b = new qg0();

    public interface a {
    }

    public static final class b implements qg0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f24539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f24540b;

        public b(a aVar, int i10) {
            fd.j0.i(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f24539a = aVar;
            this.f24540b = new AtomicInteger(i10);
        }

        @Override // com.yandex.mobile.ads.impl.qg0.a
        public final void a() {
            if (this.f24540b.decrementAndGet() == 0) {
                ((nk0.b) this.f24539a).d();
            }
        }
    }

    public final void a(Context context, wh0 wh0Var, a aVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(wh0Var, "nativeAdBlock");
        fd.j0.i(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Set<wa0> setA = this.f24537a.a(wh0Var);
        nz0 nz0VarA = i01.b().a(context);
        int iO = nz0VarA != null ? nz0VarA.o() : 0;
        if (!t6.a(context) || iO == 0 || setA.isEmpty()) {
            ((nk0.b) aVar).d();
            return;
        }
        b bVar = new b(aVar, setA.size());
        Iterator<wa0> it = setA.iterator();
        while (it.hasNext()) {
            this.f24538b.a(context, it.next(), bVar);
        }
    }
}
