package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.o0;

/* JADX INFO: loaded from: classes.dex */
public class j0 implements androidx.lifecycle.h, m1.d, o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f2063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.n0 f2064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.m0.b f2065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.q f2066f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m1.c f2067g = null;

    public j0(Fragment fragment, androidx.lifecycle.n0 n0Var) {
        this.f2063c = fragment;
        this.f2064d = n0Var;
    }

    public void a(androidx.lifecycle.i.b bVar) {
        androidx.lifecycle.q qVar = this.f2066f;
        qVar.e("handleLifecycleEvent");
        qVar.h(bVar.getTargetState());
    }

    public void b() {
        if (this.f2066f == null) {
            this.f2066f = new androidx.lifecycle.q(this);
            m1.c cVarA = m1.c.a(this);
            this.f2067g = cVarA;
            cVarA.b();
            androidx.lifecycle.f0.b(this);
        }
    }

    @Override // androidx.lifecycle.h
    public e1.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f2063c.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        e1.d dVar = new e1.d();
        if (application != null) {
            dVar.b(androidx.lifecycle.m0.a.f2235g, application);
        }
        dVar.b(androidx.lifecycle.f0.f2194a, this);
        dVar.b(androidx.lifecycle.f0.f2195b, this);
        if (this.f2063c.getArguments() != null) {
            dVar.b(androidx.lifecycle.f0.f2196c, this.f2063c.getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.h
    public androidx.lifecycle.m0.b getDefaultViewModelProviderFactory() {
        androidx.lifecycle.m0.b defaultViewModelProviderFactory = this.f2063c.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f2063c.mDefaultFactory)) {
            this.f2065e = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f2065e == null) {
            Application application = null;
            for (Context applicationContext = this.f2063c.requireContext().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            this.f2065e = new androidx.lifecycle.i0(application, this, this.f2063c.getArguments());
        }
        return this.f2065e;
    }

    @Override // androidx.lifecycle.p
    public androidx.lifecycle.i getLifecycle() {
        b();
        return this.f2066f;
    }

    @Override // m1.d
    public m1.b getSavedStateRegistry() {
        b();
        return this.f2067g.f33179b;
    }

    @Override // androidx.lifecycle.o0
    public androidx.lifecycle.n0 getViewModelStore() {
        b();
        return this.f2064d;
    }
}
