package g3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h<Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<l3.n.a<?>> f29801a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d3.c> f29802b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a3.e f29803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f29804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Class<?> f29807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i.e f29808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d3.e f29809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<Class<?>, d3.g<?>> f29810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class<Transcode> f29811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f29812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d3.c f29814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a3.g f29815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f29816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f29817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f29818r;

    public List<d3.c> a() {
        if (!this.f29813m) {
            this.f29813m = true;
            this.f29802b.clear();
            List<l3.n.a<?>> listC = c();
            int size = listC.size();
            for (int i10 = 0; i10 < size; i10++) {
                l3.n.a<?> aVar = listC.get(i10);
                if (!this.f29802b.contains(aVar.f32166a)) {
                    this.f29802b.add(aVar.f32166a);
                }
                for (int i11 = 0; i11 < aVar.f32167b.size(); i11++) {
                    if (!this.f29802b.contains(aVar.f32167b.get(i11))) {
                        this.f29802b.add(aVar.f32167b.get(i11));
                    }
                }
            }
        }
        return this.f29802b;
    }

    public i3.a b() {
        return ((l.c) this.f29808h).a();
    }

    public List<l3.n.a<?>> c() {
        if (!this.f29812l) {
            this.f29812l = true;
            this.f29801a.clear();
            List listF = this.f29803c.f38b.f(this.f29804d);
            int size = listF.size();
            for (int i10 = 0; i10 < size; i10++) {
                l3.n.a<?> aVarB = ((l3.n) listF.get(i10)).b(this.f29804d, this.f29805e, this.f29806f, this.f29809i);
                if (aVarB != null) {
                    this.f29801a.add(aVarB);
                }
            }
        }
        return this.f29801a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <Data> s<Data, ?, Transcode> d(Class<Data> cls) {
        s<Data, ?, Transcode> sVar;
        ArrayList arrayList;
        t3.f.a<?, ?> next;
        t3.e eVar;
        t3.e eVar2;
        a3.h hVar = this.f29803c.f38b;
        Class<?> cls2 = this.f29807g;
        Class<Transcode> cls3 = this.f29811k;
        w3.c cVar = hVar.f54i;
        b4.i andSet = cVar.f37095b.getAndSet(null);
        if (andSet == null) {
            andSet = new b4.i();
        }
        andSet.f3304a = cls;
        andSet.f3305b = cls2;
        andSet.f3306c = cls3;
        synchronized (cVar.f37094a) {
            sVar = (s) cVar.f37094a.getOrDefault(andSet, null);
        }
        cVar.f37095b.set(andSet);
        Objects.requireNonNull(hVar.f54i);
        if (w3.c.f37093c.equals(sVar)) {
            return null;
        }
        if (sVar != null) {
            return sVar;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls4 : (ArrayList) hVar.f48c.b(cls, cls2)) {
            for (Class<?> cls5 : (ArrayList) hVar.f51f.a(cls4, cls3)) {
                w3.e eVar3 = hVar.f48c;
                synchronized (eVar3) {
                    arrayList = new ArrayList();
                    Iterator<String> it = eVar3.f37098a.iterator();
                    while (it.hasNext()) {
                        List<w3.e.a<?, ?>> list = eVar3.f37099b.get(it.next());
                        if (list != null) {
                            for (w3.e.a<?, ?> aVar : list) {
                                if (aVar.a(cls, cls4)) {
                                    arrayList.add(aVar.f37102c);
                                }
                            }
                        }
                    }
                }
                t3.f fVar = hVar.f51f;
                synchronized (fVar) {
                    if (cls5.isAssignableFrom(cls4)) {
                        eVar = t3.g.f35678a;
                    } else {
                        Iterator<t3.f.a<?, ?>> it2 = fVar.f35674a.iterator();
                        do {
                            if (!it2.hasNext()) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                            }
                            next = it2.next();
                        } while (!next.a(cls4, cls5));
                        eVar = next.f35677c;
                    }
                    eVar2 = eVar;
                }
                arrayList2.add(new j(cls, cls4, cls5, arrayList, eVar2, hVar.f55j));
            }
        }
        s<Data, ?, Transcode> sVar2 = arrayList2.isEmpty() ? null : new s<>(cls, cls2, cls3, arrayList2, hVar.f55j);
        w3.c cVar2 = hVar.f54i;
        synchronized (cVar2.f37094a) {
            cVar2.f37094a.put(new b4.i(cls, cls2, cls3), sVar2 != null ? sVar2 : w3.c.f37093c);
        }
        return sVar2;
    }

    public <X> d3.a<X> e(X x10) throws a3.h.e {
        d3.a<X> aVar;
        w3.a aVar2 = this.f29803c.f38b.f47b;
        Class<?> cls = x10.getClass();
        synchronized (aVar2) {
            Iterator<w3.a.C0444a<?>> it = aVar2.f37089a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                w3.a.C0444a<?> next = it.next();
                if (next.f37090a.isAssignableFrom(cls)) {
                    aVar = (d3.a<X>) next.f37091b;
                    break;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        throw new a3.h.e(x10.getClass());
    }

    public <Z> d3.g<Z> f(Class<Z> cls) {
        d3.g<Z> gVar = (d3.g) this.f29810j.get(cls);
        if (gVar == null) {
            for (Map.Entry<Class<?>, d3.g<?>> entry : this.f29810j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    gVar = (d3.g) entry.getValue();
                    break;
                }
            }
        }
        if (gVar != null) {
            return gVar;
        }
        if (!this.f29810j.isEmpty() || !this.f29817q) {
            return (n3.b) n3.b.f33615b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean g(Class<?> cls) {
        return d(cls) != null;
    }
}
