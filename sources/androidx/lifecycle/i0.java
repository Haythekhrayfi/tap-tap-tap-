package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends m0.d implements m0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Application f2207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.b f2208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f2209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f2210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m1.b f2211e;

    public i0() {
        this.f2208b = new m0.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(Application application, m1.d dVar) {
        this(application, dVar, null);
        fd.j0.i(dVar, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public i0(Application application, m1.d dVar, Bundle bundle) {
        m0.a aVar;
        fd.j0.i(dVar, "owner");
        this.f2211e = dVar.getSavedStateRegistry();
        this.f2210d = dVar.getLifecycle();
        this.f2209c = bundle;
        this.f2207a = application;
        if (application != null) {
            Objects.requireNonNull(m0.a.f2233e);
            fd.j0.i(application, "application");
            if (m0.a.f2234f == null) {
                m0.a.f2234f = new m0.a(application);
            }
            aVar = m0.a.f2234f;
            fd.j0.f(aVar);
        } else {
            aVar = new m0.a();
        }
        this.f2208b = aVar;
    }

    @Override // androidx.lifecycle.m0.b
    public <T extends l0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.m0.b
    public <T extends l0> T b(Class<T> cls, e1.a aVar) {
        String str = (String) aVar.a(m0.c.f2240c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (aVar.a(f0.f2194a) == null || aVar.a(f0.f2195b) == null) {
            if (this.f2210d != null) {
                return (T) d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) aVar.a(m0.a.f2235g);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = j0.a(cls, (!zIsAssignableFrom || application == null) ? j0.f2217b : j0.f2216a);
        if (constructorA == null) {
            return (T) this.f2208b.b(cls, aVar);
        }
        return (!zIsAssignableFrom || application == null) ? (T) j0.b(cls, constructorA, f0.a(aVar)) : (T) j0.b(cls, constructorA, application, f0.a(aVar));
    }

    @Override // androidx.lifecycle.m0.d
    public void c(l0 l0Var) {
        i iVar = this.f2210d;
        if (iVar != null) {
            m1.b bVar = this.f2211e;
            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) l0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
            if (savedStateHandleController == null || savedStateHandleController.f2158d) {
                return;
            }
            savedStateHandleController.h(bVar, iVar);
            LegacySavedStateHandleController.a(bVar, iVar);
        }
    }

    public final <T extends l0> T d(String str, Class<T> cls) {
        Application application;
        if (this.f2210d == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = j0.a(cls, (!zIsAssignableFrom || this.f2207a == null) ? j0.f2217b : j0.f2216a);
        if (constructorA == null) {
            if (this.f2207a != null) {
                return (T) this.f2208b.a(cls);
            }
            Objects.requireNonNull(m0.c.f2238a);
            if (m0.c.f2239b == null) {
                m0.c.f2239b = new m0.c();
            }
            m0.c cVar = m0.c.f2239b;
            fd.j0.f(cVar);
            return (T) cVar.a(cls);
        }
        m1.b bVar = this.f2211e;
        i iVar = this.f2210d;
        e0 e0VarA = e0.f2187f.a(bVar.a(str), this.f2209c);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, e0VarA);
        savedStateHandleController.h(bVar, iVar);
        LegacySavedStateHandleController.a(bVar, iVar);
        T t10 = (!zIsAssignableFrom || (application = this.f2207a) == null) ? (T) j0.b(cls, constructorA, e0VarA) : (T) j0.b(cls, constructorA, application, e0VarA);
        t10.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
        return t10;
    }
}
