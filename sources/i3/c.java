package i3;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, a> f31212a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f31213b = new b();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lock f31214a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f31215b;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<a> f31216a = new ArrayDeque();
    }

    public void a(String str) {
        a aVar;
        synchronized (this) {
            a aVar2 = this.f31212a.get(str);
            Objects.requireNonNull(aVar2, "Argument must not be null");
            aVar = aVar2;
            int i10 = aVar.f31215b;
            if (i10 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f31215b);
            }
            int i11 = i10 - 1;
            aVar.f31215b = i11;
            if (i11 == 0) {
                a aVarRemove = this.f31212a.remove(str);
                if (!aVarRemove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                }
                b bVar = this.f31213b;
                synchronized (bVar.f31216a) {
                    if (bVar.f31216a.size() < 10) {
                        bVar.f31216a.offer(aVarRemove);
                    }
                }
            }
        }
        aVar.f31214a.unlock();
    }
}
