package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f2076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<e> f2077b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<e> f2078c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2079d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2080e = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f2081c;

        public a(d dVar) {
            this.f2081c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l0.this.f2077b.contains(this.f2081c)) {
                d dVar = this.f2081c;
                dVar.f2088a.applyState(dVar.f2090c.mView);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f2083c;

        public b(d dVar) {
            this.f2083c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l0.this.f2077b.remove(this.f2083c);
            l0.this.f2078c.remove(this.f2083c);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2086b;

        static {
            int[] iArr = new int[e.b.values().length];
            f2086b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2086b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2086b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f2085a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2085a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2085a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2085a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b0 f2087h;

        public d(e.c cVar, e.b bVar, b0 b0Var, l0.d dVar) {
            super(cVar, bVar, b0Var.f1984c, dVar);
            this.f2087h = b0Var;
        }

        @Override // androidx.fragment.app.l0.e
        public void b() {
            super.b();
            this.f2087h.k();
        }

        @Override // androidx.fragment.app.l0.e
        public void d() {
            e.b bVar = this.f2089b;
            if (bVar != e.b.ADDING) {
                if (bVar == e.b.REMOVING) {
                    Fragment fragment = this.f2087h.f1984c;
                    View viewRequireView = fragment.requireView();
                    if (FragmentManager.K(2)) {
                        StringBuilder sbA = defpackage.a.a("Clearing focus ");
                        sbA.append(viewRequireView.findFocus());
                        sbA.append(" on view ");
                        sbA.append(viewRequireView);
                        sbA.append(" for Fragment ");
                        sbA.append(fragment);
                        Log.v("FragmentManager", sbA.toString());
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = this.f2087h.f1984c;
            View viewFindFocus = fragment2.mView.findFocus();
            if (viewFindFocus != null) {
                fragment2.setFocusedView(viewFindFocus);
                if (FragmentManager.K(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment2);
                }
            }
            View viewRequireView2 = this.f2090c.requireView();
            if (viewRequireView2.getParent() == null) {
                this.f2087h.b();
                viewRequireView2.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            }
            if (viewRequireView2.getAlpha() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f2088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f2089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Fragment f2090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<Runnable> f2091d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final HashSet<l0.d> f2092e = new HashSet<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f2093f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2094g = false;

        public class a implements l0.d.a {
            public a() {
            }

            @Override // l0.d.a
            public void a() {
                e.this.a();
            }
        }

        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c from(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(android.support.v4.media.a.a("Unknown visibility ", i10));
            }

            public static c from(View view) {
                return (view.getAlpha() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            public void applyState(View view) {
                int i10;
                int i11 = c.f2085a[ordinal()];
                if (i11 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i11 == 2) {
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i10 = 0;
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return;
                        }
                        if (FragmentManager.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i10 = 8;
                }
                view.setVisibility(i10);
            }
        }

        public e(c cVar, b bVar, Fragment fragment, l0.d dVar) {
            this.f2088a = cVar;
            this.f2089b = bVar;
            this.f2090c = fragment;
            dVar.b(new a());
        }

        public final void a() {
            if (this.f2093f) {
                return;
            }
            this.f2093f = true;
            if (this.f2092e.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(this.f2092e).iterator();
            while (it.hasNext()) {
                ((l0.d) it.next()).a();
            }
        }

        public void b() {
            if (this.f2094g) {
                return;
            }
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2094g = true;
            Iterator<Runnable> it = this.f2091d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public final void c(c cVar, b bVar) {
            b bVar2;
            int i10 = c.f2086b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && this.f2088a != c.REMOVED) {
                        if (FragmentManager.K(2)) {
                            StringBuilder sbA = defpackage.a.a("SpecialEffectsController: For fragment ");
                            sbA.append(this.f2090c);
                            sbA.append(" mFinalState = ");
                            sbA.append(this.f2088a);
                            sbA.append(" -> ");
                            sbA.append(cVar);
                            sbA.append(". ");
                            Log.v("FragmentManager", sbA.toString());
                        }
                        this.f2088a = cVar;
                        return;
                    }
                    return;
                }
                if (FragmentManager.K(2)) {
                    StringBuilder sbA2 = defpackage.a.a("SpecialEffectsController: For fragment ");
                    sbA2.append(this.f2090c);
                    sbA2.append(" mFinalState = ");
                    sbA2.append(this.f2088a);
                    sbA2.append(" -> REMOVED. mLifecycleImpact  = ");
                    sbA2.append(this.f2089b);
                    sbA2.append(" to REMOVING.");
                    Log.v("FragmentManager", sbA2.toString());
                }
                this.f2088a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.f2088a != c.REMOVED) {
                    return;
                }
                if (FragmentManager.K(2)) {
                    StringBuilder sbA3 = defpackage.a.a("SpecialEffectsController: For fragment ");
                    sbA3.append(this.f2090c);
                    sbA3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sbA3.append(this.f2089b);
                    sbA3.append(" to ADDING.");
                    Log.v("FragmentManager", sbA3.toString());
                }
                this.f2088a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f2089b = bVar2;
        }

        public void d() {
        }

        public String toString() {
            StringBuilder sbA = android.support.v4.media.c.a("Operation ", "{");
            sbA.append(Integer.toHexString(System.identityHashCode(this)));
            sbA.append("} ");
            sbA.append("{");
            sbA.append("mFinalState = ");
            sbA.append(this.f2088a);
            sbA.append("} ");
            sbA.append("{");
            sbA.append("mLifecycleImpact = ");
            sbA.append(this.f2089b);
            sbA.append("} ");
            sbA.append("{");
            sbA.append("mFragment = ");
            sbA.append(this.f2090c);
            sbA.append("}");
            return sbA.toString();
        }
    }

    public l0(ViewGroup viewGroup) {
        this.f2076a = viewGroup;
    }

    public static l0 f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return g(viewGroup, fragmentManager.I());
    }

    public static l0 g(ViewGroup viewGroup, m0 m0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof l0) {
            return (l0) tag;
        }
        Objects.requireNonNull((FragmentManager.e) m0Var);
        androidx.fragment.app.b bVar = new androidx.fragment.app.b(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, bVar);
        return bVar;
    }

    public final void a(e.c cVar, e.b bVar, b0 b0Var) {
        synchronized (this.f2077b) {
            l0.d dVar = new l0.d();
            e eVarD = d(b0Var.f1984c);
            if (eVarD != null) {
                eVarD.c(cVar, bVar);
                return;
            }
            d dVar2 = new d(cVar, bVar, b0Var, dVar);
            this.f2077b.add(dVar2);
            dVar2.f2091d.add(new a(dVar2));
            dVar2.f2091d.add(new b(dVar2));
        }
    }

    public abstract void b(List<e> list, boolean z10);

    public void c() {
        if (this.f2080e) {
            return;
        }
        ViewGroup viewGroup = this.f2076a;
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        if (!p0.e0.g.b(viewGroup)) {
            e();
            this.f2079d = false;
            return;
        }
        synchronized (this.f2077b) {
            if (!this.f2077b.isEmpty()) {
                ArrayList<e> arrayList = new ArrayList(this.f2078c);
                this.f2078c.clear();
                for (e eVar : arrayList) {
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.a();
                    if (!eVar.f2094g) {
                        this.f2078c.add(eVar);
                    }
                }
                i();
                ArrayList arrayList2 = new ArrayList(this.f2077b);
                this.f2077b.clear();
                this.f2078c.addAll(arrayList2);
                if (FragmentManager.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).d();
                }
                b(arrayList2, this.f2079d);
                this.f2079d = false;
                if (FragmentManager.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    public final e d(Fragment fragment) {
        for (e eVar : this.f2077b) {
            if (eVar.f2090c.equals(fragment) && !eVar.f2093f) {
                return eVar;
            }
        }
        return null;
    }

    public void e() {
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f2076a;
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        boolean zB = p0.e0.g.b(viewGroup);
        synchronized (this.f2077b) {
            i();
            Iterator<e> it = this.f2077b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            for (e eVar : new ArrayList(this.f2078c)) {
                if (FragmentManager.K(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(zB ? "" : "Container " + this.f2076a + " is not attached to window. ");
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.a();
            }
            for (e eVar2 : new ArrayList(this.f2077b)) {
                if (FragmentManager.K(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    sb3.append(zB ? "" : "Container " + this.f2076a + " is not attached to window. ");
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.a();
            }
        }
    }

    public void h() {
        synchronized (this.f2077b) {
            i();
            this.f2080e = false;
            for (int size = this.f2077b.size() - 1; size >= 0; size--) {
                e eVar = this.f2077b.get(size);
                e.c cVarFrom = e.c.from(eVar.f2090c.mView);
                e.c cVar = eVar.f2088a;
                e.c cVar2 = e.c.VISIBLE;
                if (cVar == cVar2 && cVarFrom != cVar2) {
                    this.f2080e = eVar.f2090c.isPostponed();
                    break;
                }
            }
        }
    }

    public final void i() {
        for (e eVar : this.f2077b) {
            if (eVar.f2089b == e.b.ADDING) {
                eVar.c(e.c.from(eVar.f2090c.requireView().getVisibility()), e.b.NONE);
            }
        }
    }
}
