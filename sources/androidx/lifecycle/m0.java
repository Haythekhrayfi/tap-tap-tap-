package androidx.lifecycle;

import android.app.Application;
import ch.qos.logback.core.joran.action.Action;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f2230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f2231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1.a f2232c;

    public static class a extends c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static a f2234f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Application f2236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C0036a f2233e = new C0036a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e1.a.b<Application> f2235g = C0036a.C0037a.f2237a;

        /* JADX INFO: renamed from: androidx.lifecycle.m0$a$a, reason: collision with other inner class name */
        public static final class C0036a {

            /* JADX INFO: renamed from: androidx.lifecycle.m0$a$a$a, reason: collision with other inner class name */
            public static final class C0037a implements e1.a.b<Application> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0037a f2237a = new C0037a();
            }

            public C0036a() {
            }

            public C0036a(vc.g gVar) {
            }
        }

        public a() {
            this.f2236d = null;
        }

        @Override // androidx.lifecycle.m0.c, androidx.lifecycle.m0.b
        public <T extends l0> T a(Class<T> cls) {
            Application application = this.f2236d;
            if (application != null) {
                return (T) c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.m0.b
        public <T extends l0> T b(Class<T> cls, e1.a aVar) {
            if (this.f2236d != null) {
                return (T) a(cls);
            }
            Application application = (Application) aVar.a(f2235g);
            if (application != null) {
                return (T) c(cls, application);
            }
            if (androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.a(cls);
        }

        public final <T extends l0> T c(Class<T> cls, Application application) {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                fd.j0.h(tNewInstance, "{\n                try {\n…          }\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        public a(Application application) {
            fd.j0.i(application, "application");
            this.f2236d = application;
        }
    }

    public interface b {
        default <T extends l0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default <T extends l0> T b(Class<T> cls, e1.a aVar) {
            return (T) a(cls);
        }
    }

    public static class c implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static c f2239b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2238a = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e1.a.b<String> f2240c = a.C0038a.f2241a;

        public static final class a {

            /* JADX INFO: renamed from: androidx.lifecycle.m0$c$a$a, reason: collision with other inner class name */
            public static final class C0038a implements e1.a.b<String> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0038a f2241a = new C0038a();
            }

            public a() {
            }

            public a(vc.g gVar) {
            }
        }

        @Override // androidx.lifecycle.m0.b
        public <T extends l0> T a(Class<T> cls) {
            fd.j0.i(cls, "modelClass");
            try {
                T tNewInstance = cls.newInstance();
                fd.j0.h(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        }
    }

    public static class d {
        public void c(l0 l0Var) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, b bVar) {
        this(n0Var, bVar, null, 4, null);
        fd.j0.i(n0Var, "store");
        fd.j0.i(bVar, "factory");
    }

    public m0(n0 n0Var, b bVar, e1.a aVar) {
        fd.j0.i(n0Var, "store");
        fd.j0.i(bVar, "factory");
        fd.j0.i(aVar, "defaultCreationExtras");
        this.f2230a = n0Var;
        this.f2231b = bVar;
        this.f2232c = aVar;
    }

    public /* synthetic */ m0(n0 n0Var, b bVar, e1.a aVar, int i10, vc.g gVar) {
        this(n0Var, bVar, (i10 & 4) != 0 ? e1.a.C0248a.f28969b : aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m0(o0 o0Var) {
        b defaultViewModelProviderFactory;
        fd.j0.i(o0Var, "owner");
        n0 viewModelStore = o0Var.getViewModelStore();
        fd.j0.h(viewModelStore, "owner.viewModelStore");
        Objects.requireNonNull(a.f2233e);
        fd.j0.i(o0Var, "owner");
        if (o0Var instanceof h) {
            defaultViewModelProviderFactory = ((h) o0Var).getDefaultViewModelProviderFactory();
            fd.j0.h(defaultViewModelProviderFactory, "owner.defaultViewModelProviderFactory");
        } else {
            Objects.requireNonNull(c.f2238a);
            if (c.f2239b == null) {
                c.f2239b = new c();
            }
            defaultViewModelProviderFactory = c.f2239b;
            fd.j0.f(defaultViewModelProviderFactory);
        }
        this(viewModelStore, defaultViewModelProviderFactory, androidx.activity.l.b(o0Var));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m0(o0 o0Var, b bVar) {
        fd.j0.i(o0Var, "owner");
        fd.j0.i(bVar, "factory");
        n0 viewModelStore = o0Var.getViewModelStore();
        fd.j0.h(viewModelStore, "owner.viewModelStore");
        this(viewModelStore, bVar, androidx.activity.l.b(o0Var));
    }

    public <T extends l0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public <T extends l0> T b(String str, Class<T> cls) {
        T t10;
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        T t11 = (T) this.f2230a.f2242a.get(str);
        if (cls.isInstance(t11)) {
            Object obj = this.f2231b;
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                fd.j0.h(t11, "viewModel");
                dVar.c(t11);
            }
            Objects.requireNonNull(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t11;
        }
        e1.d dVar2 = new e1.d(this.f2232c);
        dVar2.b(c.f2240c, str);
        try {
            t10 = (T) this.f2231b.b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            t10 = (T) this.f2231b.a(cls);
        }
        l0 l0VarPut = this.f2230a.f2242a.put(str, t10);
        if (l0VarPut != null) {
            l0VarPut.onCleared();
        }
        return t10;
    }
}
