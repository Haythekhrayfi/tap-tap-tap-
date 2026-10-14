package l3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f32182e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n<Object, Object> f32183f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b<?, ?>> f32184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f32185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<b<?, ?>> f32186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0.e<List<Throwable>> f32187d;

    public static class a implements n<Object, Object> {
        @Override // l3.n
        public boolean a(Object obj) {
            return false;
        }

        @Override // l3.n
        public n.a<Object> b(Object obj, int i10, int i11, d3.e eVar) {
            return null;
        }
    }

    public static class b<Model, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<Model> f32188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<Data> f32189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f32190c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f32188a = cls;
            this.f32189b = cls2;
            this.f32190c = oVar;
        }
    }

    public static class c {
    }

    public r(o0.e<List<Throwable>> eVar) {
        c cVar = f32182e;
        this.f32184a = new ArrayList();
        this.f32186c = new HashSet();
        this.f32187d = eVar;
        this.f32185b = cVar;
    }

    public synchronized <Model> List<n<Model, ?>> a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f32184a) {
                if (!this.f32186c.contains(bVar) && bVar.f32188a.isAssignableFrom(cls)) {
                    this.f32186c.add(bVar);
                    n<? extends Object, ? extends Object> nVarA = bVar.f32190c.a(this);
                    Objects.requireNonNull(nVarA, "Argument must not be null");
                    arrayList.add(nVarA);
                    this.f32186c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f32186c.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized <Model, Data> n<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b<?, ?> bVar : this.f32184a) {
                if (this.f32186c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.f32188a.isAssignableFrom(cls) && bVar.f32189b.isAssignableFrom(cls2)) {
                    this.f32186c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f32186c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f32185b;
                o0.e<List<Throwable>> eVar = this.f32187d;
                Objects.requireNonNull(cVar);
                return new q(arrayList, eVar);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (z10) {
                return (n<Model, Data>) f32183f;
            }
            throw new a3.h.c(cls, cls2);
        } catch (Throwable th) {
            this.f32186c.clear();
            throw th;
        }
    }

    public final <Model, Data> n<Model, Data> c(b<?, ?> bVar) {
        n<Model, Data> nVar = (n<Model, Data>) bVar.f32190c.a(this);
        Objects.requireNonNull(nVar, "Argument must not be null");
        return nVar;
    }

    public synchronized List<Class<?>> d(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f32184a) {
            if (!arrayList.contains(bVar.f32189b) && bVar.f32188a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f32189b);
            }
        }
        return arrayList;
    }
}
