package com.yandex.mobile.ads.exo.drm;

import android.net.Uri;
import com.yandex.mobile.ads.embedded.guava.collect.p0;
import com.yandex.mobile.ads.impl.ao;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.h70;
import com.yandex.mobile.ads.impl.xq;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d implements xq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f18490a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bc0.d f18491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f18492c;

    private static c a(bc0.d dVar) {
        ao.a aVarB = new ao.a().b();
        Uri uri = dVar.f19199b;
        o oVar = new o(uri == null ? null : uri.toString(), dVar.f19203f, aVarB);
        p0<Map.Entry<String, String>> it = dVar.f19200c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            oVar.a(next.getKey(), next.getValue());
        }
        c cVarA = new c.a().a(dVar.f19198a, n.f18507e).a(dVar.f19201d).b(dVar.f19202e).a(h70.a(dVar.f19204g)).a(oVar);
        cVarA.a(dVar.a());
        return cVarA;
    }

    @Override // com.yandex.mobile.ads.impl.xq
    public final g a(bc0 bc0Var) {
        c cVar;
        Objects.requireNonNull(bc0Var.f19172b);
        bc0.d dVar = bc0Var.f19172b.f19222c;
        if (dVar == null || da1.f19803a < 18) {
            return g.f18499a;
        }
        synchronized (this.f18490a) {
            if (!da1.a(dVar, this.f18491b)) {
                this.f18491b = dVar;
                this.f18492c = a(dVar);
            }
            cVar = this.f18492c;
            Objects.requireNonNull(cVar);
        }
        return cVar;
    }
}
