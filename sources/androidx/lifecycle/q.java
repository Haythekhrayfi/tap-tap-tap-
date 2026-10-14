package androidx.lifecycle;

import android.annotation.SuppressLint;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class q extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference<p> f2245d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l.a<o, a> f2243b = new l.a<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2246e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2247f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2248g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<i.c> f2249h = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i.c f2244c = i.c.INITIALIZED;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2250i = true;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i.c f2251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n f2252b;

        public a(o oVar, i.c cVar) {
            n reflectiveGenericLifecycleObserver;
            Map<Class<?>, Integer> map = t.f2254a;
            boolean z10 = oVar instanceof n;
            boolean z11 = oVar instanceof f;
            if (z10 && z11) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((f) oVar, (n) oVar);
            } else if (z11) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((f) oVar, null);
            } else if (z10) {
                reflectiveGenericLifecycleObserver = (n) oVar;
            } else {
                Class<?> cls = oVar.getClass();
                if (t.c(cls) == 2) {
                    List list = (List) ((HashMap) t.f2255b).get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(t.a((Constructor) list.get(0), oVar));
                    } else {
                        g[] gVarArr = new g[list.size()];
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            gVarArr[i10] = t.a((Constructor) list.get(i10), oVar);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(gVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(oVar);
                }
            }
            this.f2252b = reflectiveGenericLifecycleObserver;
            this.f2251a = cVar;
        }

        public void a(p pVar, i.b bVar) {
            i.c targetState = bVar.getTargetState();
            this.f2251a = q.g(this.f2251a, targetState);
            this.f2252b.g(pVar, bVar);
            this.f2251a = targetState;
        }
    }

    public q(p pVar) {
        this.f2245d = new WeakReference<>(pVar);
    }

    public static i.c g(i.c cVar, i.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    @Override // androidx.lifecycle.i
    public void a(o oVar) {
        p pVar;
        e("addObserver");
        i.c cVar = this.f2244c;
        i.c cVar2 = i.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = i.c.INITIALIZED;
        }
        a aVar = new a(oVar, cVar2);
        if (this.f2243b.f(oVar, aVar) == null && (pVar = this.f2245d.get()) != null) {
            boolean z10 = this.f2246e != 0 || this.f2247f;
            i.c cVarD = d(oVar);
            this.f2246e++;
            while (aVar.f2251a.compareTo(cVarD) < 0 && this.f2243b.f32075g.containsKey(oVar)) {
                this.f2249h.add(aVar.f2251a);
                i.b bVarUpFrom = i.b.upFrom(aVar.f2251a);
                if (bVarUpFrom == null) {
                    StringBuilder sbA = defpackage.a.a("no event up from ");
                    sbA.append(aVar.f2251a);
                    throw new IllegalStateException(sbA.toString());
                }
                aVar.a(pVar, bVarUpFrom);
                i();
                cVarD = d(oVar);
            }
            if (!z10) {
                k();
            }
            this.f2246e--;
        }
    }

    @Override // androidx.lifecycle.i
    public i.c b() {
        return this.f2244c;
    }

    @Override // androidx.lifecycle.i
    public void c(o oVar) {
        e("removeObserver");
        this.f2243b.g(oVar);
    }

    public final i.c d(o oVar) {
        l.a<o, a> aVar = this.f2243b;
        i.c cVar = null;
        l.b.c<o, a> cVar2 = aVar.f32075g.containsKey(oVar) ? aVar.f32075g.get(oVar).f32083f : null;
        i.c cVar3 = cVar2 != null ? cVar2.f32081d.f2251a : null;
        if (!this.f2249h.isEmpty()) {
            ArrayList<i.c> arrayList = this.f2249h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return g(g(this.f2244c, cVar3), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        if (this.f2250i && !k.a.d().b()) {
            throw new IllegalStateException(androidx.activity.j.a("Method ", str, " must be called on the main thread"));
        }
    }

    public void f(i.b bVar) {
        e("handleLifecycleEvent");
        h(bVar.getTargetState());
    }

    public final void h(i.c cVar) {
        i.c cVar2 = this.f2244c;
        if (cVar2 == cVar) {
            return;
        }
        if (cVar2 == i.c.INITIALIZED && cVar == i.c.DESTROYED) {
            StringBuilder sbA = defpackage.a.a("no event down from ");
            sbA.append(this.f2244c);
            throw new IllegalStateException(sbA.toString());
        }
        this.f2244c = cVar;
        if (this.f2247f || this.f2246e != 0) {
            this.f2248g = true;
            return;
        }
        this.f2247f = true;
        k();
        this.f2247f = false;
        if (this.f2244c == i.c.DESTROYED) {
            this.f2243b = new l.a<>();
        }
    }

    public final void i() {
        ArrayList<i.c> arrayList = this.f2249h;
        arrayList.remove(arrayList.size() - 1);
    }

    public void j(i.c cVar) {
        e("setCurrentState");
        h(cVar);
    }

    public final void k() {
        p pVar = this.f2245d.get();
        if (pVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            l.a<o, a> aVar = this.f2243b;
            boolean z10 = true;
            if (aVar.f32079f != 0) {
                i.c cVar = aVar.f32076c.f32081d.f2251a;
                i.c cVar2 = aVar.f32077d.f32081d.f2251a;
                if (cVar != cVar2 || this.f2244c != cVar2) {
                    z10 = false;
                }
            }
            this.f2248g = false;
            if (z10) {
                return;
            }
            if (this.f2244c.compareTo(aVar.f32076c.f32081d.f2251a) < 0) {
                l.a<o, a> aVar2 = this.f2243b;
                l.b.C0332b c0332b = new l.b.C0332b(aVar2.f32077d, aVar2.f32076c);
                aVar2.f32078e.put(c0332b, Boolean.FALSE);
                while (c0332b.hasNext() && !this.f2248g) {
                    Map.Entry entry = (Map.Entry) c0332b.next();
                    a aVar3 = (a) entry.getValue();
                    while (aVar3.f2251a.compareTo(this.f2244c) > 0 && !this.f2248g && this.f2243b.contains((o) entry.getKey())) {
                        i.b bVarDownFrom = i.b.downFrom(aVar3.f2251a);
                        if (bVarDownFrom == null) {
                            StringBuilder sbA = defpackage.a.a("no event down from ");
                            sbA.append(aVar3.f2251a);
                            throw new IllegalStateException(sbA.toString());
                        }
                        this.f2249h.add(bVarDownFrom.getTargetState());
                        aVar3.a(pVar, bVarDownFrom);
                        i();
                    }
                }
            }
            l.b.c<o, a> cVar3 = this.f2243b.f32077d;
            if (!this.f2248g && cVar3 != null && this.f2244c.compareTo(cVar3.f32081d.f2251a) > 0) {
                l.b<o, a>.d dVarD = this.f2243b.d();
                while (dVarD.hasNext() && !this.f2248g) {
                    Map.Entry entry2 = (Map.Entry) dVarD.next();
                    a aVar4 = (a) entry2.getValue();
                    while (aVar4.f2251a.compareTo(this.f2244c) < 0 && !this.f2248g && this.f2243b.contains((o) entry2.getKey())) {
                        this.f2249h.add(aVar4.f2251a);
                        i.b bVarUpFrom = i.b.upFrom(aVar4.f2251a);
                        if (bVarUpFrom == null) {
                            StringBuilder sbA2 = defpackage.a.a("no event up from ");
                            sbA2.append(aVar4.f2251a);
                            throw new IllegalStateException(sbA2.toString());
                        }
                        aVar4.a(pVar, bVarUpFrom);
                        i();
                    }
                }
            }
        }
    }
}
