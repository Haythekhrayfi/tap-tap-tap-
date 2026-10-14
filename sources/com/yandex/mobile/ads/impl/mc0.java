package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class mc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xc0 f23021a = new xc0();

    public static final class a extends vc.l implements uc.l<qh0, Set<vc0>> {
        public a() {
            super(1);
        }

        @Override // uc.l
        public final Set<vc0> invoke(qh0 qh0Var) {
            Objects.requireNonNull(mc0.this.f23021a);
            HashSet hashSetA = xc0.a(qh0Var);
            fd.j0.h(hashSetA, "mediaValuesProvider.getMediaValues(nativeAd)");
            return hashSetA;
        }
    }

    public static final class b extends vc.l implements uc.l<vc0, wa0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f23023a = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public final wa0 invoke(vc0 vc0Var) {
            return vc0Var.b();
        }
    }

    public final Set<wa0> a(wh0 wh0Var) {
        fd.j0.i(wh0Var, "nativeAdBlock");
        List<qh0> listD = wh0Var.c().d();
        fd.j0.h(listD, "nativeAdBlock.nativeAdResponse.nativeAds");
        dd.g gVarF = dd.q.f(new dd.e(kc.t.n(listD), new a(), dd.o.f28952c), b.f23023a);
        dd.n nVar = dd.n.f28951c;
        fd.j0.i(nVar, "predicate");
        dd.d dVar = new dd.d(gVarF, false, nVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        dd.q.g(dVar, linkedHashSet);
        return kc.h0.b(linkedHashSet);
    }
}
