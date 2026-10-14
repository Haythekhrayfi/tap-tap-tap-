package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class nj0 implements fw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cj0 f23401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ji0 f23402b = new ji0();

    public nj0(cj0 cj0Var) {
        this.f23401a = cj0Var;
    }

    @Override // com.yandex.mobile.ads.impl.fw0.a
    public final Map<String, Object> a() {
        HashMap map = new HashMap();
        cj0 cj0Var = this.f23401a;
        if (cj0Var != null) {
            List<qh0> listD = cj0Var.d();
            ji0 ji0Var = this.f23402b;
            Objects.requireNonNull(ji0Var);
            HashSet hashSet = new HashSet();
            Iterator<qh0> it = listD.iterator();
            while (it.hasNext()) {
                hashSet.addAll(ji0Var.a(it.next()));
            }
            ArrayList arrayList = new ArrayList(hashSet);
            if (!arrayList.isEmpty()) {
                map.put("image_sizes", arrayList);
            }
        }
        return map;
    }
}
