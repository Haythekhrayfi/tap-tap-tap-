package a5;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class r<T> implements x5.b<Set<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set<T> f126b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set<x5.b<T>> f125a = Collections.newSetFromMap(new ConcurrentHashMap());

    public r(Collection<x5.b<T>> collection) {
        this.f125a.addAll(collection);
    }

    @Override // x5.b
    public Object get() {
        if (this.f126b == null) {
            synchronized (this) {
                if (this.f126b == null) {
                    this.f126b = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        Iterator<x5.b<T>> it = this.f125a.iterator();
                        while (it.hasNext()) {
                            this.f126b.add(it.next().get());
                        }
                        this.f125a = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.f126b);
    }
}
