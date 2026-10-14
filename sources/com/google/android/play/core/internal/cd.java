package com.google.android.play.core.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
final class cd extends WeakReference<Throwable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12286a;

    public cd(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f12286a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == cd.class) {
            if (this == obj) {
                return true;
            }
            cd cdVar = (cd) obj;
            if (this.f12286a == cdVar.f12286a && get() == cdVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12286a;
    }
}
