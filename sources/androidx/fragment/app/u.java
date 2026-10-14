package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f2115a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentManager f2116b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FragmentManager.k f2117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2118b;

        public a(FragmentManager.k kVar, boolean z10) {
            this.f2117a = kVar;
            this.f2118b = z10;
        }
    }

    public u(FragmentManager fragmentManager) {
        this.f2116b = fragmentManager;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.f2116b.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.a(fragment, bundle, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentActivityCreated(this.f2116b, fragment, bundle);
            }
        }
    }

    public void b(Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f2116b;
        Context context = fragmentManager.f1919u.f2109d;
        Fragment fragment2 = fragmentManager.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.b(fragment, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentAttached(this.f2116b, fragment, context);
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.f2116b.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.c(fragment, bundle, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentCreated(this.f2116b, fragment, bundle);
            }
        }
    }

    public void d(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2116b.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.d(fragment, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentDestroyed(this.f2116b, fragment);
            }
        }
    }

    public void e(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2116b.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.e(fragment, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentDetached(this.f2116b, fragment);
            }
        }
    }

    public void f(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2116b.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.f(fragment, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentPaused(this.f2116b, fragment);
            }
        }
    }

    public void g(Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f2116b;
        Context context = fragmentManager.f1919u.f2109d;
        Fragment fragment2 = fragmentManager.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.g(fragment, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentPreAttached(this.f2116b, fragment, context);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.f2116b.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.h(fragment, bundle, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentPreCreated(this.f2116b, fragment, bundle);
            }
        }
    }

    public void i(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2116b.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.i(fragment, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentResumed(this.f2116b, fragment);
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.f2116b.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.j(fragment, bundle, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentSaveInstanceState(this.f2116b, fragment, bundle);
            }
        }
    }

    public void k(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2116b.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.k(fragment, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentStarted(this.f2116b, fragment);
            }
        }
    }

    public void l(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2116b.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.l(fragment, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentStopped(this.f2116b, fragment);
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.f2116b.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.m(fragment, view, bundle, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentViewCreated(this.f2116b, fragment, view, bundle);
            }
        }
    }

    public void n(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2116b.f1921w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f1911m.n(fragment, true);
        }
        for (a aVar : this.f2115a) {
            if (!z10 || aVar.f2118b) {
                aVar.f2117a.onFragmentViewDestroyed(this.f2116b, fragment);
            }
        }
    }
}
