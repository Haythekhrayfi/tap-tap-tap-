package com.yandex.mobile.ads.embedded.guava.collect;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class k0 extends b<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator<Object> f18361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f18362d;

    public k0(l0 l0Var) {
        this.f18362d = l0Var;
        this.f18361c = l0Var.f18363a.iterator();
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.b
    @CheckForNull
    public final Object a() {
        while (this.f18361c.hasNext()) {
            Object next = this.f18361c.next();
            if (this.f18362d.f18364b.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
