package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.mediation.base.a;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class hd0<T extends com.yandex.mobile.ads.mediation.base.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f21362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce0 f21363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sd0 f21364c;

    public hd0(T t10, ce0 ce0Var, sd0 sd0Var) {
        this.f21362a = t10;
        this.f21363b = ce0Var;
        this.f21364c = sd0Var;
    }

    public final T a() {
        return this.f21362a;
    }

    public final Map<String, Object> a(Context context) {
        return this.f21364c.a(context);
    }

    public final ce0 b() {
        return this.f21363b;
    }

    public final Map<String, String> c() {
        sd0 sd0Var = this.f21364c;
        ce0 ce0Var = this.f21363b;
        Objects.requireNonNull(sd0Var);
        return ce0Var.g();
    }
}
