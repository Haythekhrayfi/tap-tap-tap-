package a3;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import l3.n;
import l3.o;
import l3.p;
import l3.r;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f46a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w3.a f47b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w3.e f48c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w3.f f49d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e3.f f50e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t3.f f51f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w3.b f52g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w3.d f53h = new w3.d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w3.c f54i = new w3.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0.e<List<Throwable>> f55j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public h() {
        c4.a.c cVar = new c4.a.c(new o0.g(20), new c4.b(), new c4.c());
        this.f55j = cVar;
        this.f46a = new p(cVar);
        this.f47b = new w3.a();
        w3.e eVar = new w3.e();
        this.f48c = eVar;
        this.f49d = new w3.f();
        this.f50e = new e3.f();
        this.f51f = new t3.f();
        this.f52g = new w3.b();
        List listAsList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.addAll(listAsList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (eVar) {
            ArrayList<String> arrayList2 = new ArrayList(eVar.f37098a);
            eVar.f37098a.clear();
            eVar.f37098a.addAll(arrayList);
            for (String str : arrayList2) {
                if (!arrayList.contains(str)) {
                    eVar.f37098a.add(str);
                }
            }
        }
    }

    public <Data> h a(Class<Data> cls, d3.a<Data> aVar) {
        w3.a aVar2 = this.f47b;
        synchronized (aVar2) {
            aVar2.f37089a.add(new w3.a.C0444a<>(cls, aVar));
        }
        return this;
    }

    public <TResource> h b(Class<TResource> cls, d3.f<TResource> fVar) {
        w3.f fVar2 = this.f49d;
        synchronized (fVar2) {
            fVar2.f37103a.add(new w3.f.a<>(cls, fVar));
        }
        return this;
    }

    public <Model, Data> h c(Class<Model> cls, Class<Data> cls2, o<Model, Data> oVar) {
        p pVar = this.f46a;
        synchronized (pVar) {
            r rVar = pVar.f32169a;
            synchronized (rVar) {
                r.b<?, ?> bVar = new r.b<>(cls, cls2, oVar);
                List<r.b<?, ?>> list = rVar.f32184a;
                list.add(list.size(), bVar);
            }
            pVar.f32170b.f32171a.clear();
        }
        return this;
    }

    public <Data, TResource> h d(String str, Class<Data> cls, Class<TResource> cls2, com.bumptech.glide.load.e<Data, TResource> eVar) {
        w3.e eVar2 = this.f48c;
        synchronized (eVar2) {
            eVar2.a(str).add(new w3.e.a<>(cls, cls2, eVar));
        }
        return this;
    }

    public List<ImageHeaderParser> e() {
        List<ImageHeaderParser> list;
        w3.b bVar = this.f52g;
        synchronized (bVar) {
            list = bVar.f37092a;
        }
        if (list.isEmpty()) {
            throw new b();
        }
        return list;
    }

    public <Model> List<n<Model, ?>> f(Model model) {
        List<n<?, ?>> listUnmodifiableList;
        p pVar = this.f46a;
        Objects.requireNonNull(pVar);
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            p.a.C0337a<?> c0337a = pVar.f32170b.f32171a.get(cls);
            listUnmodifiableList = c0337a == null ? null : c0337a.f32172a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(pVar.f32169a.a(cls));
                if (pVar.f32170b.f32171a.put(cls, new p.a.C0337a<>(listUnmodifiableList)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        int size = listUnmodifiableList.size();
        List<n<Model, ?>> listEmptyList = Collections.emptyList();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            n<?, ?> nVar = listUnmodifiableList.get(i10);
            if (nVar.a(model)) {
                if (z10) {
                    listEmptyList = new ArrayList<>(size - i10);
                    z10 = false;
                }
                listEmptyList.add(nVar);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new c(model);
        }
        return listEmptyList;
    }

    public h g(e3.e.a<?> aVar) {
        e3.f fVar = this.f50e;
        synchronized (fVar) {
            fVar.f29005a.put(aVar.a(), aVar);
        }
        return this;
    }

    public <TResource, Transcode> h h(Class<TResource> cls, Class<Transcode> cls2, t3.e<TResource, Transcode> eVar) {
        t3.f fVar = this.f51f;
        synchronized (fVar) {
            fVar.f35674a.add(new t3.f.a<>(cls, cls2, eVar));
        }
        return this;
    }
}
