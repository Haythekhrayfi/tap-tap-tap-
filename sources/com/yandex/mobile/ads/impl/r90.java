package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class r90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s90 f24645a = new s90();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n61 f24646b = new n61();

    public final void a() {
        this.f24645a.a();
    }

    public final void a(Runnable runnable) {
        fd.j0.i(runnable, "runnable");
        Objects.requireNonNull(this.f24646b);
        if (n61.a()) {
            runnable.run();
        } else {
            this.f24645a.a(runnable);
        }
    }
}
