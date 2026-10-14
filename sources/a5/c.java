package a5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Class<? super T>> f80b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<l> f81c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f83e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f<T> f84f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<Class<?>> f85g;

    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f86a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set<Class<? super T>> f87b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<l> f88c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f89d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f90e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public f<T> f91f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Set<Class<?>> f92g;

        public b(Class cls, Class[] clsArr, a aVar) {
            HashSet hashSet = new HashSet();
            this.f87b = hashSet;
            this.f88c = new HashSet();
            this.f89d = 0;
            this.f90e = 0;
            this.f92g = new HashSet();
            Objects.requireNonNull(cls, "Null interface");
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                Objects.requireNonNull(cls2, "Null interface");
            }
            Collections.addAll(this.f87b, clsArr);
        }

        public b<T> a(l lVar) {
            if (!(!this.f87b.contains(lVar.f115a))) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f88c.add(lVar);
            return this;
        }

        public c<T> b() {
            if (this.f91f != null) {
                return new c<>(this.f86a, new HashSet(this.f87b), new HashSet(this.f88c), this.f89d, this.f90e, this.f91f, this.f92g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public b<T> c(f<T> fVar) {
            this.f91f = fVar;
            return this;
        }

        public final b<T> d(int i10) {
            if (!(this.f89d == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.f89d = i10;
            return this;
        }
    }

    public c(String str, Set<Class<? super T>> set, Set<l> set2, int i10, int i11, f<T> fVar, Set<Class<?>> set3) {
        this.f79a = str;
        this.f80b = Collections.unmodifiableSet(set);
        this.f81c = Collections.unmodifiableSet(set2);
        this.f82d = i10;
        this.f83e = i11;
        this.f84f = fVar;
        this.f85g = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0], null);
    }

    public static <T> c<T> b(T t10, Class<T> cls) {
        b bVarA = a(cls);
        bVarA.f90e = 1;
        bVarA.f91f = new a5.b(t10, 0);
        return bVarA.b();
    }

    @SafeVarargs
    public static <T> c<T> d(T t10, Class<T> cls, Class<? super T>... clsArr) {
        b bVar = new b(cls, clsArr, null);
        bVar.f91f = new a5.b(t10, 1);
        return bVar.b();
    }

    public boolean c() {
        return this.f83e == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f80b.toArray()) + ">{" + this.f82d + ", type=" + this.f83e + ", deps=" + Arrays.toString(this.f81c.toArray()) + "}";
    }
}
