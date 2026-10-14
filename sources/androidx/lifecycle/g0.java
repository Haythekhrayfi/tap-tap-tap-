package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements m1.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1.b f2198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f2200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jc.e f2201d;

    public static final class a extends vc.l implements uc.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o0 f2202c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o0 o0Var) {
            super(0);
            this.f2202c = o0Var;
        }

        @Override // uc.a
        public h0 invoke() {
            return f0.c(this.f2202c);
        }
    }

    public g0(m1.b bVar, o0 o0Var) {
        fd.j0.i(bVar, "savedStateRegistry");
        fd.j0.i(o0Var, "viewModelStoreOwner");
        this.f2198a = bVar;
        this.f2201d = jc.f.b(new a(o0Var));
    }

    @Override // m1.b.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2200c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, e0> entry : ((h0) this.f2201d.getValue()).f2203a.entrySet()) {
            String key = entry.getKey();
            Bundle bundleA = entry.getValue().f2193e.a();
            if (!fd.j0.d(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(key, bundleA);
            }
        }
        this.f2199b = false;
        return bundle;
    }

    public final void b() {
        if (this.f2199b) {
            return;
        }
        this.f2200c = this.f2198a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.f2199b = true;
    }
}
