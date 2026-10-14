package com.google.android.play.core.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class cf extends cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce f12289a = new ce();

    @Override // com.google.android.play.core.internal.cc
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        this.f12289a.a(th).add(th2);
    }
}
