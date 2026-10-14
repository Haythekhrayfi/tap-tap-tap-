package a5;

import android.util.Log;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class j extends a implements p5.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f102h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<c<?>, x5.b<?>> f103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, x5.b<?>> f104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, r<?>> f105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<x5.b<ComponentRegistrar>> f106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<Boolean> f108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f109g;

    public j(Executor executor, Iterable<x5.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, g gVar) {
        this.f103a = new HashMap();
        this.f104b = new HashMap();
        this.f105c = new HashMap();
        this.f108f = new AtomicReference<>();
        o oVar = new o(executor);
        this.f107e = oVar;
        this.f109g = gVar;
        ArrayList<c<?>> arrayList = new ArrayList();
        arrayList.add(c.d(oVar, o.class, u5.d.class, u5.c.class));
        arrayList.add(c.d(this, p5.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<x5.b<ComponentRegistrar>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next());
        }
        this.f106d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((x5.b) it2.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(this.f109g.a(componentRegistrar));
                        it2.remove();
                    }
                } catch (p e10) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f103a.isEmpty()) {
                k.a(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f103a.keySet());
                arrayList4.addAll(arrayList);
                k.a(arrayList4);
            }
            for (c<?> cVar2 : arrayList) {
                this.f103a.put(cVar2, new q(new u4.c(this, cVar2)));
            }
            arrayList3.addAll(h(arrayList));
            arrayList3.addAll(i());
            g();
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        Boolean bool = this.f108f.get();
        if (bool != null) {
            f(this.f103a, bool.booleanValue());
        }
    }

    @Override // a5.d
    public synchronized <T> x5.b<T> b(Class<T> cls) {
        Objects.requireNonNull(cls, "Null interface requested.");
        return (x5.b) this.f104b.get(cls);
    }

    @Override // a5.d
    public synchronized <T> x5.b<Set<T>> c(Class<T> cls) {
        r<?> rVar = this.f105c.get(cls);
        if (rVar != null) {
            return rVar;
        }
        return i.f98b;
    }

    @Override // a5.d
    public <T> x5.a<T> e(Class<T> cls) {
        x5.b<T> bVarB = b(cls);
        if (bVarB == null) {
            return new t(t.f127c, t.f128d);
        }
        return bVarB instanceof t ? (t) bVarB : new t(null, bVarB);
    }

    public final void f(Map<c<?>, x5.b<?>> map, boolean z10) {
        Queue<u5.a<?>> queue;
        Set<Map.Entry<u5.b<Object>, Executor>> setEmptySet;
        for (Map.Entry<c<?>, x5.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            x5.b<?> value = entry.getValue();
            int i10 = key.f82d;
            if (!(i10 == 1)) {
                if (!(i10 == 2) || !z10) {
                }
            }
            value.get();
        }
        o oVar = this.f107e;
        synchronized (oVar) {
            queue = oVar.f120b;
            if (queue != null) {
                oVar.f120b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (u5.a<?> aVar : queue) {
                Objects.requireNonNull(aVar);
                synchronized (oVar) {
                    Queue<u5.a<?>> queue2 = oVar.f120b;
                    if (queue2 != null) {
                        queue2.add(aVar);
                    } else {
                        synchronized (oVar) {
                            ConcurrentHashMap<u5.b<Object>, Executor> concurrentHashMap = oVar.f119a.get(aVar.f36031a);
                            setEmptySet = concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
                        }
                        for (Map.Entry<u5.b<Object>, Executor> entry2 : setEmptySet) {
                            entry2.getValue().execute(new androidx.appcompat.app.s(entry2, aVar));
                        }
                    }
                }
            }
        }
    }

    public final void g() {
        for (c<?> cVar : this.f103a.keySet()) {
            for (l lVar : cVar.f81c) {
                if (lVar.a() && !this.f105c.containsKey(lVar.f115a)) {
                    this.f105c.put(lVar.f115a, new r<>(Collections.emptySet()));
                } else if (this.f104b.containsKey(lVar.f115a)) {
                    continue;
                } else {
                    if (lVar.f116b == 1) {
                        throw new s(String.format("Unsatisfied dependency for component %s: %s", cVar, lVar.f115a));
                    }
                    if (!lVar.a()) {
                        this.f104b.put(lVar.f115a, new t(t.f127c, t.f128d));
                    }
                }
            }
        }
    }

    public final List<Runnable> h(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.c()) {
                x5.b<?> bVar = this.f103a.get(cVar);
                for (Class<? super Object> cls : cVar.f80b) {
                    if (this.f104b.containsKey(cls)) {
                        arrayList.add(new androidx.appcompat.app.s((t) this.f104b.get(cls), bVar));
                    } else {
                        this.f104b.put(cls, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> i() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<c<?>, x5.b<?>> entry : this.f103a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.c()) {
                x5.b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.f80b) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f105c.containsKey(entry2.getKey())) {
                r<?> rVar = this.f105c.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new androidx.appcompat.app.s(rVar, (x5.b) it.next()));
                }
            } else {
                this.f105c.put((Class) entry2.getKey(), new r<>((Set) ((Collection) entry2.getValue())));
            }
        }
        return arrayList;
    }

    @Deprecated
    public j(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<ComponentRegistrar> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new h(it.next(), 0));
        }
        this(executor, arrayList, Arrays.asList(componentArr), g.f95u1);
    }
}
