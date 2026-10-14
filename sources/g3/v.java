package g3;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class v implements g, e3.d.a<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.a f29950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h<?> f29951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29953f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d3.c f29954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<l3.n<File, ?>> f29955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile l3.n.a<?> f29957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public File f29958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w f29959l;

    public v(h<?> hVar, g.a aVar) {
        this.f29951d = hVar;
        this.f29950c = aVar;
    }

    @Override // g3.g
    public boolean b() {
        List<Class<?>> orDefault;
        List<Class<?>> listD;
        List<d3.c> listA = this.f29951d.a();
        if (listA.isEmpty()) {
            return false;
        }
        h<?> hVar = this.f29951d;
        a3.h hVar2 = hVar.f29803c.f38b;
        Class<?> cls = hVar.f29804d.getClass();
        Class<?> cls2 = hVar.f29807g;
        Class<?> cls3 = hVar.f29811k;
        w3.d dVar = hVar2.f53h;
        b4.i andSet = dVar.f37096a.getAndSet(null);
        if (andSet == null) {
            andSet = new b4.i(cls, cls2, cls3);
        } else {
            andSet.f3304a = cls;
            andSet.f3305b = cls2;
            andSet.f3306c = cls3;
        }
        synchronized (dVar.f37097b) {
            orDefault = dVar.f37097b.getOrDefault(andSet, null);
        }
        dVar.f37096a.set(andSet);
        List list = orDefault;
        if (orDefault == null) {
            ArrayList arrayList = new ArrayList();
            l3.p pVar = hVar2.f46a;
            synchronized (pVar) {
                listD = pVar.f32169a.d(cls);
            }
            Iterator it = ((ArrayList) listD).iterator();
            while (it.hasNext()) {
                for (Class cls4 : (ArrayList) hVar2.f48c.b((Class) it.next(), cls2)) {
                    if (!((ArrayList) hVar2.f51f.a(cls4, cls3)).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            w3.d dVar2 = hVar2.f53h;
            List<Class<?>> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (dVar2.f37097b) {
                dVar2.f37097b.put(new b4.i(cls, cls2, cls3), listUnmodifiableList);
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            if (File.class.equals(this.f29951d.f29811k)) {
                return false;
            }
            StringBuilder sbA = defpackage.a.a("Failed to find any load path from ");
            sbA.append(this.f29951d.f29804d.getClass());
            sbA.append(" to ");
            sbA.append(this.f29951d.f29811k);
            throw new IllegalStateException(sbA.toString());
        }
        while (true) {
            List<l3.n<File, ?>> list2 = this.f29955h;
            if (list2 != null) {
                if (this.f29956i < list2.size()) {
                    this.f29957j = null;
                    boolean z10 = false;
                    while (!z10) {
                        if (!(this.f29956i < this.f29955h.size())) {
                            break;
                        }
                        List<l3.n<File, ?>> list3 = this.f29955h;
                        int i10 = this.f29956i;
                        this.f29956i = i10 + 1;
                        l3.n<File, ?> nVar = list3.get(i10);
                        File file = this.f29958k;
                        h<?> hVar3 = this.f29951d;
                        this.f29957j = nVar.b(file, hVar3.f29805e, hVar3.f29806f, hVar3.f29809i);
                        if (this.f29957j != null && this.f29951d.g(this.f29957j.f32168c.a())) {
                            this.f29957j.f32168c.e(this.f29951d.f29815o, this);
                            z10 = true;
                        }
                    }
                    return z10;
                }
            }
            int i11 = this.f29953f + 1;
            this.f29953f = i11;
            if (i11 >= list.size()) {
                int i12 = this.f29952e + 1;
                this.f29952e = i12;
                if (i12 >= listA.size()) {
                    return false;
                }
                this.f29953f = 0;
            }
            d3.c cVar = listA.get(this.f29952e);
            Class cls5 = (Class) list.get(this.f29953f);
            d3.g<Z> gVarF = this.f29951d.f(cls5);
            h<?> hVar4 = this.f29951d;
            this.f29959l = new w(hVar4.f29803c.f37a, cVar, hVar4.f29814n, hVar4.f29805e, hVar4.f29806f, gVarF, cls5, hVar4.f29809i);
            File fileB = hVar4.b().b(this.f29959l);
            this.f29958k = fileB;
            if (fileB != null) {
                this.f29954g = cVar;
                this.f29955h = this.f29951d.f29803c.f38b.f(fileB);
                this.f29956i = 0;
            }
        }
    }

    @Override // e3.d.a
    public void c(Exception exc) {
        this.f29950c.e(this.f29959l, exc, this.f29957j.f32168c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE);
    }

    @Override // g3.g
    public void cancel() {
        l3.n.a<?> aVar = this.f29957j;
        if (aVar != null) {
            aVar.f32168c.cancel();
        }
    }

    @Override // e3.d.a
    public void f(Object obj) {
        this.f29950c.a(this.f29954g, obj, this.f29957j.f32168c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE, this.f29959l);
    }
}
