package androidx.savedstate;

import android.os.Bundle;
import androidx.activity.j;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import fd.j0;
import i.f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import m1.d;
import vc.g;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f2888c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    public static final class b implements m1.b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<String> f2889a;

        public b(m1.b bVar) {
            j0.i(bVar, "registry");
            this.f2889a = new LinkedHashSet();
            bVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // m1.b.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f2889a));
            return bundle;
        }
    }

    static {
        new a(null);
    }

    public Recreator(d dVar) {
        j0.i(dVar, "owner");
        this.f2888c = dVar;
    }

    @Override // androidx.lifecycle.n
    public void g(p pVar, i.b bVar) {
        j0.i(pVar, "source");
        j0.i(bVar, "event");
        if (bVar != i.b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        pVar.getLifecycle().c(this);
        Bundle bundleA = this.f2888c.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(m1.b.a.class);
                j0.h(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        j0.h(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((m1.b.a) objNewInstance).a(this.f2888c);
                    } catch (Exception e10) {
                        throw new RuntimeException(f.a("Failed to instantiate ", str), e10);
                    }
                } catch (NoSuchMethodException e11) {
                    StringBuilder sbA = defpackage.a.a("Class ");
                    sbA.append(clsAsSubclass.getSimpleName());
                    sbA.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(sbA.toString(), e11);
                }
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(j.a("Class ", str, " wasn't found"), e12);
            }
        }
    }
}
