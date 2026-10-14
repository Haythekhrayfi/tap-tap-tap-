package com.google.android.play.core.internal;

import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ae<StateT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<StateUpdatedListener<StateT>> f12241a = new HashSet();

    public final synchronized void a(StateUpdatedListener<StateT> stateUpdatedListener) {
        this.f12241a.add(stateUpdatedListener);
    }

    public final synchronized void a(StateT statet) {
        Iterator<StateUpdatedListener<StateT>> it = this.f12241a.iterator();
        while (it.hasNext()) {
            it.next().onStateUpdate(statet);
        }
    }

    public final synchronized void b(StateUpdatedListener<StateT> stateUpdatedListener) {
        this.f12241a.remove(stateUpdatedListener);
    }
}
