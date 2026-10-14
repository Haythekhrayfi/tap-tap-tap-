package a5;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class o implements u5.d, u5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, ConcurrentHashMap<u5.b<Object>, Executor>> f119a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Queue<u5.a<?>> f120b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f121c;

    public o(Executor executor) {
        this.f121c = executor;
    }

    @Override // u5.d
    public synchronized <T> void a(Class<T> cls, Executor executor, u5.b<? super T> bVar) {
        Objects.requireNonNull(cls);
        Objects.requireNonNull(bVar);
        Objects.requireNonNull(executor);
        if (!this.f119a.containsKey(cls)) {
            this.f119a.put(cls, new ConcurrentHashMap<>());
        }
        this.f119a.get(cls).put(bVar, executor);
    }

    @Override // u5.d
    public <T> void b(Class<T> cls, u5.b<? super T> bVar) {
        a(cls, this.f121c, bVar);
    }
}
