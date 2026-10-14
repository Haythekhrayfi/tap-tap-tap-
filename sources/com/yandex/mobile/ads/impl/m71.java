package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class m71 implements wf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wf.a<m71> f22935c = yn1.f26958r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h71 f22936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.p<Integer> f22937b;

    public m71(h71 h71Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= h71Var.f21329a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f22936a = h71Var;
        this.f22937b = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m71 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        Objects.requireNonNull(bundle2);
        h71 h71Var = (h71) h71.f21328f.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        Objects.requireNonNull(intArray);
        return new m71(h71Var, h70.a(intArray));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m71.class != obj.getClass()) {
            return false;
        }
        m71 m71Var = (m71) obj;
        return this.f22936a.equals(m71Var.f22936a) && this.f22937b.equals(m71Var.f22937b);
    }

    public final int hashCode() {
        return (this.f22937b.hashCode() * 31) + this.f22936a.hashCode();
    }
}
