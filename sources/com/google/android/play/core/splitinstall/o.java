package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference<n> f12446a = new AtomicReference<>(null);

    public static n a() {
        return f12446a.get();
    }

    public static void a(n nVar) {
        f12446a.compareAndSet(null, nVar);
    }
}
