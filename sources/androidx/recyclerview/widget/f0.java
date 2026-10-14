package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q.h<RecyclerView.c0, a> f2637a = new q.h<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q.e<RecyclerView.c0> f2638b = new q.e<>();

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static o0.e<a> f2639d = new o0.f(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.l.c f2641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RecyclerView.l.c f2642c;

        public static a a() {
            a aVar = (a) ((o0.f) f2639d).b();
            return aVar == null ? new a() : aVar;
        }

        public static void b(a aVar) {
            aVar.f2640a = 0;
            aVar.f2641b = null;
            aVar.f2642c = null;
            ((o0.f) f2639d).a(aVar);
        }
    }

    public interface b {
    }

    public void a(RecyclerView.c0 c0Var) {
        a orDefault = this.f2637a.getOrDefault(c0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f2637a.put(c0Var, orDefault);
        }
        orDefault.f2640a |= 1;
    }

    public void b(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a orDefault = this.f2637a.getOrDefault(c0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f2637a.put(c0Var, orDefault);
        }
        orDefault.f2642c = cVar;
        orDefault.f2640a |= 8;
    }

    public void c(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a orDefault = this.f2637a.getOrDefault(c0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f2637a.put(c0Var, orDefault);
        }
        orDefault.f2641b = cVar;
        orDefault.f2640a |= 4;
    }

    public boolean d(RecyclerView.c0 c0Var) {
        a orDefault = this.f2637a.getOrDefault(c0Var, null);
        return (orDefault == null || (orDefault.f2640a & 1) == 0) ? false : true;
    }

    public final RecyclerView.l.c e(RecyclerView.c0 c0Var, int i10) {
        a aVarL;
        RecyclerView.l.c cVar;
        int iE = this.f2637a.e(c0Var);
        if (iE >= 0 && (aVarL = this.f2637a.l(iE)) != null) {
            int i11 = aVarL.f2640a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVarL.f2640a = i12;
                if (i10 == 4) {
                    cVar = aVarL.f2641b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarL.f2642c;
                }
                if ((i12 & 12) == 0) {
                    this.f2637a.j(iE);
                    a.b(aVarL);
                }
                return cVar;
            }
        }
        return null;
    }

    public void f(RecyclerView.c0 c0Var) {
        a orDefault = this.f2637a.getOrDefault(c0Var, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f2640a &= -2;
    }

    public void g(RecyclerView.c0 c0Var) {
        for (int iL = this.f2638b.l() - 1; iL >= 0; iL--) {
            if (c0Var == this.f2638b.m(iL)) {
                q.e<RecyclerView.c0> eVar = this.f2638b;
                Object[] objArr = eVar.f34714e;
                Object obj = objArr[iL];
                Object obj2 = q.e.f34711g;
                if (obj == obj2) {
                    break;
                }
                objArr[iL] = obj2;
                eVar.f34712c = true;
                break;
            }
        }
        a aVarRemove = this.f2637a.remove(c0Var);
        if (aVarRemove != null) {
            a.b(aVarRemove);
        }
    }
}
