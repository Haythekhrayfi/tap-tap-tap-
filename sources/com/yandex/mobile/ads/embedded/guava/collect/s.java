package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.gs0;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class s extends b<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f18389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0 f18390d;

    public s(Iterator it, gs0 gs0Var) {
        this.f18389c = it;
        this.f18390d = gs0Var;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.b
    @CheckForNull
    public final Object a() {
        while (this.f18389c.hasNext()) {
            Object next = this.f18389c.next();
            if (this.f18390d.apply(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
