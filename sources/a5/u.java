package a5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends a5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Class<?>> f131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Class<?>> f132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<Class<?>> f133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<Class<?>> f134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<Class<?>> f135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<Class<?>> f136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f137g;

    public static class a implements u5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u5.c f138a;

        public a(Set<Class<?>> set, u5.c cVar) {
            this.f138a = cVar;
        }
    }

    public u(c<?> cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (l lVar : cVar.f81c) {
            int i10 = lVar.f117c;
            if (!(i10 == 0)) {
                if (i10 == 2) {
                    hashSet3.add(lVar.f115a);
                } else if (lVar.a()) {
                    hashSet5.add(lVar.f115a);
                } else {
                    hashSet2.add(lVar.f115a);
                }
            } else if (lVar.a()) {
                hashSet4.add(lVar.f115a);
            } else {
                hashSet.add(lVar.f115a);
            }
        }
        if (!cVar.f85g.isEmpty()) {
            hashSet.add(u5.c.class);
        }
        this.f131a = Collections.unmodifiableSet(hashSet);
        this.f132b = Collections.unmodifiableSet(hashSet2);
        this.f133c = Collections.unmodifiableSet(hashSet3);
        this.f134d = Collections.unmodifiableSet(hashSet4);
        this.f135e = Collections.unmodifiableSet(hashSet5);
        this.f136f = cVar.f85g;
        this.f137g = dVar;
    }

    @Override // a5.a, a5.d
    public <T> T a(Class<T> cls) {
        if (!this.f131a.contains(cls)) {
            throw new n(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f137g.a(cls);
        return !cls.equals(u5.c.class) ? t10 : (T) new a(this.f136f, (u5.c) t10);
    }

    @Override // a5.d
    public <T> x5.b<T> b(Class<T> cls) {
        if (this.f132b.contains(cls)) {
            return this.f137g.b(cls);
        }
        throw new n(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // a5.d
    public <T> x5.b<Set<T>> c(Class<T> cls) {
        if (this.f135e.contains(cls)) {
            return this.f137g.c(cls);
        }
        throw new n(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // a5.a, a5.d
    public <T> Set<T> d(Class<T> cls) {
        if (this.f134d.contains(cls)) {
            return this.f137g.d(cls);
        }
        throw new n(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // a5.d
    public <T> x5.a<T> e(Class<T> cls) {
        if (this.f133c.contains(cls)) {
            return this.f137g.e(cls);
        }
        throw new n(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}
