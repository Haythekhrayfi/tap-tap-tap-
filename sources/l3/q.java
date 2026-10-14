package l3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class q<Model, Data> implements n<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<n<Model, Data>> f32173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0.e<List<Throwable>> f32174b;

    public static class a<Data> implements e3.d<Data>, e3.d.a<Data> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<e3.d<Data>> f32175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o0.e<List<Throwable>> f32176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f32177e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public a3.g f32178f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public e3.d.a<? super Data> f32179g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<Throwable> f32180h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f32181i;

        public a(List<e3.d<Data>> list, o0.e<List<Throwable>> eVar) {
            this.f32176d = eVar;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f32175c = list;
            this.f32177e = 0;
        }

        @Override // e3.d
        public Class<Data> a() {
            return this.f32175c.get(0).a();
        }

        @Override // e3.d
        public void b() {
            List<Throwable> list = this.f32180h;
            if (list != null) {
                this.f32176d.a(list);
            }
            this.f32180h = null;
            Iterator<e3.d<Data>> it = this.f32175c.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // e3.d.a
        public void c(Exception exc) {
            List<Throwable> list = this.f32180h;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        @Override // e3.d
        public void cancel() {
            this.f32181i = true;
            Iterator<e3.d<Data>> it = this.f32175c.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // e3.d
        public com.bumptech.glide.load.a d() {
            return this.f32175c.get(0).d();
        }

        @Override // e3.d
        public void e(a3.g gVar, e3.d.a<? super Data> aVar) {
            this.f32178f = gVar;
            this.f32179g = aVar;
            this.f32180h = this.f32176d.b();
            this.f32175c.get(this.f32177e).e(gVar, this);
            if (this.f32181i) {
                cancel();
            }
        }

        @Override // e3.d.a
        public void f(Data data) {
            if (data != null) {
                this.f32179g.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.f32181i) {
                return;
            }
            if (this.f32177e < this.f32175c.size() - 1) {
                this.f32177e++;
                e(this.f32178f, this.f32179g);
            } else {
                Objects.requireNonNull(this.f32180h, "Argument must not be null");
                this.f32179g.c(new g3.q("Fetch failed", new ArrayList(this.f32180h)));
            }
        }
    }

    public q(List<n<Model, Data>> list, o0.e<List<Throwable>> eVar) {
        this.f32173a = list;
        this.f32174b = eVar;
    }

    @Override // l3.n
    public boolean a(Model model) {
        Iterator<n<Model, Data>> it = this.f32173a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // l3.n
    public n.a<Data> b(Model model, int i10, int i11, d3.e eVar) {
        n.a<Data> aVarB;
        int size = this.f32173a.size();
        ArrayList arrayList = new ArrayList(size);
        d3.c cVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n<Model, Data> nVar = this.f32173a.get(i12);
            if (nVar.a(model) && (aVarB = nVar.b(model, i10, i11, eVar)) != null) {
                cVar = aVarB.f32166a;
                arrayList.add(aVarB.f32168c);
            }
        }
        if (arrayList.isEmpty() || cVar == null) {
            return null;
        }
        return new n.a<>(cVar, new a(arrayList, this.f32174b));
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("MultiModelLoader{modelLoaders=");
        sbA.append(Arrays.toString(this.f32173a.toArray()));
        sbA.append('}');
        return sbA.toString();
    }
}
