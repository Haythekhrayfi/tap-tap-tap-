package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1.a.b<m1.d> f2194a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1.a.b<o0> f2195b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1.a.b<Bundle> f2196c = new a();

    public static final class a implements e1.a.b<Bundle> {
    }

    public static final class b implements e1.a.b<m1.d> {
    }

    public static final class c implements e1.a.b<o0> {
    }

    public static final class d extends vc.l implements uc.l<e1.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f2197c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public h0 invoke(e1.a aVar) {
            fd.j0.i(aVar, "$this$initializer");
            return new h0();
        }
    }

    public static final e0 a(e1.a aVar) {
        m1.d dVar = (m1.d) aVar.a(f2194a);
        if (dVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        o0 o0Var = (o0) aVar.a(f2195b);
        if (o0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f2196c);
        String str = (String) aVar.a(m0.c.f2240c);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        m1.b.c cVarB = dVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        g0 g0Var = cVarB instanceof g0 ? (g0) cVarB : null;
        if (g0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        h0 h0VarC = c(o0Var);
        e0 e0Var = h0VarC.f2203a.get(str);
        if (e0Var != null) {
            return e0Var;
        }
        e0.a aVar2 = e0.f2187f;
        g0Var.b();
        Bundle bundle2 = g0Var.f2200c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = g0Var.f2200c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = g0Var.f2200c;
        if (bundle5 != null && bundle5.isEmpty()) {
            g0Var.f2200c = null;
        }
        e0 e0VarA = aVar2.a(bundle3, bundle);
        h0VarC.f2203a.put(str, e0VarA);
        return e0VarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends m1.d & o0> void b(T t10) {
        fd.j0.i(t10, "<this>");
        i.c cVarB = t10.getLifecycle().b();
        fd.j0.h(cVarB, "lifecycle.currentState");
        if (!(cVarB == i.c.INITIALIZED || cVarB == i.c.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t10.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            g0 g0Var = new g0(t10.getSavedStateRegistry(), t10);
            t10.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", g0Var);
            t10.getLifecycle().a(new SavedStateHandleAttacher(g0Var));
        }
    }

    public static final h0 c(o0 o0Var) {
        fd.j0.i(o0Var, "<this>");
        e1.c cVar = new e1.c();
        d dVar = d.f2197c;
        cd.c cVarA = vc.b0.a(h0.class);
        fd.j0.i(cVarA, "clazz");
        fd.j0.i(dVar, "initializer");
        cVar.f28971a.add(new e1.e<>(h9.d.i(cVarA), dVar));
        Object[] array = cVar.f28971a.toArray(new e1.e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        e1.e[] eVarArr = (e1.e[]) array;
        return (h0) new m0(o0Var, new e1.b((e1.e[]) Arrays.copyOf(eVarArr, eVarArr.length))).b("androidx.lifecycle.internal.SavedStateHandlesVM", h0.class);
    }
}
