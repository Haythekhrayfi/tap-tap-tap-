package com.google.android.play.core.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<cd, List<Throwable>> f12287a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Throwable> f12288b = new ReferenceQueue<>();

    public final List<Throwable> a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> referencePoll = this.f12288b.poll();
            if (referencePoll == null) {
                break;
            }
            this.f12287a.remove(referencePoll);
        }
        List<Throwable> list = this.f12287a.get(new cd(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.f12287a.putIfAbsent(new cd(th, this.f12288b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
