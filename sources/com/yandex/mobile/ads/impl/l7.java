package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class l7 implements n<k7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7 f22637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k6 f22638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jw0 f22639c;

    public l7(s7 s7Var, k6 k6Var, jw0 jw0Var) {
        this.f22637a = s7Var;
        this.f22638b = k6Var;
        this.f22639c = jw0Var;
    }

    @Override // com.yandex.mobile.ads.impl.n
    public final void a(View view, m mVar) {
        k7 k7Var = (k7) mVar;
        Iterator<String> it = k7Var.c().iterator();
        while (it.hasNext()) {
            this.f22638b.a(it.next());
        }
        this.f22637a.a(view, k7Var);
        ((gi) this.f22639c).a(fw0.b.f20882i);
    }
}
