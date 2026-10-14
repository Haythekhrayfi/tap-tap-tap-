package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f12442a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference<f> f12443b = new AtomicReference<>(null);

    private l() {
        super("INSTANCE", 0);
    }

    @Override // com.google.android.play.core.splitinstall.e
    public final f a() {
        return f12443b.get();
    }

    public final void a(f fVar) {
        f12443b.set(fVar);
    }
}
