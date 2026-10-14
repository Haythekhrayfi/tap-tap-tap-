package m1;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.savedstate.Recreator;
import fd.j0;
import java.util.Map;
import java.util.Objects;
import vc.g;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f33177d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f33178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f33179b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33180c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    public c(d dVar, g gVar) {
        this.f33178a = dVar;
    }

    public static final c a(d dVar) {
        Objects.requireNonNull(f33177d);
        return new c(dVar, null);
    }

    public final void b() {
        i lifecycle = this.f33178a.getLifecycle();
        j0.h(lifecycle, "owner.lifecycle");
        if (!(lifecycle.b() == i.c.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new Recreator(this.f33178a));
        final b bVar = this.f33179b;
        Objects.requireNonNull(bVar);
        j0.i(lifecycle, "lifecycle");
        if (!(!bVar.f33172b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new n() { // from class: m1.a
            @Override // androidx.lifecycle.n
            public final void g(p pVar, i.b bVar2) {
                boolean z10;
                b bVar3 = bVar;
                j0.i(bVar3, "this$0");
                j0.i(pVar, "<anonymous parameter 0>");
                j0.i(bVar2, "event");
                if (bVar2 == i.b.ON_START) {
                    z10 = true;
                } else if (bVar2 != i.b.ON_STOP) {
                    return;
                } else {
                    z10 = false;
                }
                bVar3.f33176f = z10;
            }
        });
        bVar.f33172b = true;
        this.f33180c = true;
    }

    public final void c(Bundle bundle) {
        if (!this.f33180c) {
            b();
        }
        i lifecycle = this.f33178a.getLifecycle();
        j0.h(lifecycle, "owner.lifecycle");
        if (!(!lifecycle.b().isAtLeast(i.c.STARTED))) {
            StringBuilder sbA = defpackage.a.a("performRestore cannot be called when owner is ");
            sbA.append(lifecycle.b());
            throw new IllegalStateException(sbA.toString().toString());
        }
        b bVar = this.f33179b;
        if (!bVar.f33172b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!bVar.f33174d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        bVar.f33173c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        bVar.f33174d = true;
    }

    public final void d(Bundle bundle) {
        j0.i(bundle, "outBundle");
        b bVar = this.f33179b;
        Objects.requireNonNull(bVar);
        j0.i(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = bVar.f33173c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        l.b<String, b.c>.d dVarD = bVar.f33171a.d();
        while (dVarD.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarD.next();
            bundle2.putBundle((String) entry.getKey(), ((b.c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
