package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ji0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kb f22059a = new kb();

    public final ArrayList a(qh0 qh0Var) {
        HashSet hashSet = new HashSet();
        List<qa<?>> listB = qh0Var.b();
        Objects.requireNonNull(this.f22059a);
        for (j20 j20Var : kb.a(listB)) {
            if (!TextUtils.isEmpty(j20Var.b())) {
                hashSet.add(j20Var.b());
            }
        }
        return new ArrayList(hashSet);
    }
}
