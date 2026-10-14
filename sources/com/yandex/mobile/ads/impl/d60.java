package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class d60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ol f19767a;

    public d60(ol olVar) {
        fd.j0.i(olVar, "creativeAssetsProvider");
        this.f19767a = olVar;
    }

    public final pe1 a(nl nlVar, String str) {
        Object next;
        fd.j0.i(nlVar, "creative");
        Objects.requireNonNull(this.f19767a);
        Iterator it = ol.a(nlVar).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fd.j0.d(((qa) next).b(), str));
        qa qaVar = (qa) next;
        m80 m80VarA = qaVar != null ? qaVar.a() : null;
        if (m80VarA != null) {
            return new pe1(m80VarA.e(), kc.l.d(m80VarA.d()));
        }
        String strB = nlVar.b();
        List<String> list = nlVar.a().get("clickTracking");
        return new pe1(strB, list != null ? kc.t.p(list) : kc.w.f32009c);
    }
}
