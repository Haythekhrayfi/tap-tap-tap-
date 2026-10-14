package h3;

import h3.l;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T extends l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<T> f30555a;

    public c() {
        char[] cArr = b4.j.f3307a;
        this.f30555a = new ArrayDeque(20);
    }

    public abstract T a();

    public T b() {
        T tPoll = this.f30555a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t10) {
        if (this.f30555a.size() < 20) {
            this.f30555a.offer(t10);
        }
    }
}
