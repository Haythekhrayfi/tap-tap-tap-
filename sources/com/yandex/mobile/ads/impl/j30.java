package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.InitializationListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class j30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xe0 f21936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InitializationListener f21937b;

    public j30(xe0 xe0Var, InitializationListener initializationListener) {
        this.f21936a = xe0Var;
        this.f21937b = initializationListener;
    }

    public final void a() {
        xe0 xe0Var = this.f21936a;
        InitializationListener initializationListener = this.f21937b;
        Objects.requireNonNull(initializationListener);
        xe0Var.b(new tn1(initializationListener, 1));
    }
}
