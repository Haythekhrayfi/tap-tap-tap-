package com.yandex.metrica.identifiers.impl;

import fd.j0;
import java.util.Map;
import kc.f0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f13601a;

    public h(Map map) {
        j0.i(map, "providers");
        this.f13601a = map;
    }

    public h(Map map, int i10) {
        this((i10 & 1) != 0 ? f0.e(new jc.h("google", new k()), new jc.h("huawei", new r()), new jc.h("yandex", new o())) : null);
    }
}
