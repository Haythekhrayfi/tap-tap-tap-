package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.b0;
import androidx.fragment.app.l;
import androidx.fragment.app.u;
import androidx.fragment.app.w;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.g<g> implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f2980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FragmentManager f2981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q.e<Fragment> f2982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q.e<Fragment.SavedState> f2983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q.e<Integer> f2984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f2985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2987j;

    public static abstract class a extends RecyclerView.i {
        public a() {
        }

        public a(androidx.viewpager2.adapter.b bVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i10, int i11, Object obj) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewPager2.g f2993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.i f2994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public n f2995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ViewPager2 f2996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f2997e = -1;

        public b() {
        }

        public final ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void b(boolean z10) {
            int currentItem;
            Fragment fragmentF;
            if (FragmentStateAdapter.this.m() || this.f2996d.getScrollState() != 0 || FragmentStateAdapter.this.f2982e.h() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f2996d.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            Objects.requireNonNull(FragmentStateAdapter.this);
            long j10 = currentItem;
            if ((j10 != this.f2997e || z10) && (fragmentF = FragmentStateAdapter.this.f2982e.f(j10)) != null && fragmentF.isAdded()) {
                this.f2997e = j10;
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(FragmentStateAdapter.this.f2981d);
                Fragment fragment = null;
                for (int i10 = 0; i10 < FragmentStateAdapter.this.f2982e.l(); i10++) {
                    long jI = FragmentStateAdapter.this.f2982e.i(i10);
                    Fragment fragmentM = FragmentStateAdapter.this.f2982e.m(i10);
                    if (fragmentM.isAdded()) {
                        if (jI != this.f2997e) {
                            aVar.h(fragmentM, i.c.STARTED);
                        } else {
                            fragment = fragmentM;
                        }
                        fragmentM.setMenuVisibility(jI == this.f2997e);
                    }
                }
                if (fragment != null) {
                    aVar.h(fragment, i.c.RESUMED);
                }
                if (aVar.f2005a.isEmpty()) {
                    return;
                }
                aVar.d();
            }
        }
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, i iVar) {
        this.f2982e = new q.e<>();
        this.f2983f = new q.e<>();
        this.f2984g = new q.e<>();
        this.f2986i = false;
        this.f2987j = false;
        this.f2981d = fragmentManager;
        this.f2980c = iVar;
        super.setHasStableIds(true);
    }

    public FragmentStateAdapter(androidx.fragment.app.n nVar) {
        this(nVar.getSupportFragmentManager(), nVar.getLifecycle());
    }

    public static boolean i(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    @Override // androidx.viewpager2.adapter.h
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.f2983f.l() + this.f2982e.l());
        for (int i10 = 0; i10 < this.f2982e.l(); i10++) {
            long jI = this.f2982e.i(i10);
            Fragment fragmentF = this.f2982e.f(jI);
            if (fragmentF != null && fragmentF.isAdded()) {
                String strA = androidx.viewpager2.adapter.a.a("f#", jI);
                FragmentManager fragmentManager = this.f2981d;
                Objects.requireNonNull(fragmentManager);
                if (fragmentF.mFragmentManager != fragmentManager) {
                    fragmentManager.k0(new IllegalStateException(l.a("Fragment ", fragmentF, " is not currently in the FragmentManager")));
                    throw null;
                }
                bundle.putString(strA, fragmentF.mWho);
            }
        }
        for (int i11 = 0; i11 < this.f2983f.l(); i11++) {
            long jI2 = this.f2983f.i(i11);
            if (e(jI2)) {
                bundle.putParcelable(androidx.viewpager2.adapter.a.a("s#", jI2), this.f2983f.f(jI2));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.h
    public final void b(Parcelable parcelable) {
        if (!this.f2983f.h() || !this.f2982e.h()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(FragmentStateAdapter.class.getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (i(str, "f#")) {
                long j10 = Long.parseLong(str.substring(2));
                FragmentManager fragmentManager = this.f2981d;
                Objects.requireNonNull(fragmentManager);
                String string = bundle.getString(str);
                Fragment fragment = null;
                if (string != null) {
                    Fragment fragmentC = fragmentManager.f1901c.c(string);
                    if (fragmentC == null) {
                        fragmentManager.k0(new IllegalStateException(w.a("Fragment no longer exists for key ", str, ": unique id ", string)));
                        throw null;
                    }
                    fragment = fragmentC;
                }
                this.f2982e.j(j10, fragment);
            } else {
                if (!i(str, "s#")) {
                    throw new IllegalArgumentException(i.f.a("Unexpected key in savedState: ", str));
                }
                long j11 = Long.parseLong(str.substring(2));
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (e(j11)) {
                    this.f2983f.j(j11, savedState);
                }
            }
        }
        if (this.f2982e.h()) {
            return;
        }
        this.f2987j = true;
        this.f2986i = true;
        h();
        final Handler handler = new Handler(Looper.getMainLooper());
        final d dVar = new d(this);
        this.f2980c.a(new n(this) { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.n
            public void g(p pVar, i.b bVar) {
                if (bVar == i.b.ON_DESTROY) {
                    handler.removeCallbacks(dVar);
                    pVar.getLifecycle().c(this);
                }
            }
        });
        handler.postDelayed(dVar, AbstractComponentTracker.LINGERING_TIMEOUT);
    }

    public void c(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean e(long j10) {
        return j10 >= 0 && j10 < ((long) getItemCount());
    }

    public abstract Fragment f(int i10);

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long getItemId(int i10) {
        return i10;
    }

    public void h() {
        Fragment fragmentG;
        View view;
        if (!this.f2987j || m()) {
            return;
        }
        q.c cVar = new q.c();
        for (int i10 = 0; i10 < this.f2982e.l(); i10++) {
            long jI = this.f2982e.i(i10);
            if (!e(jI)) {
                cVar.add(Long.valueOf(jI));
                this.f2984g.k(jI);
            }
        }
        if (!this.f2986i) {
            this.f2987j = false;
            for (int i11 = 0; i11 < this.f2982e.l(); i11++) {
                long jI2 = this.f2982e.i(i11);
                boolean z10 = true;
                if (!this.f2984g.d(jI2) && ((fragmentG = this.f2982e.g(jI2, null)) == null || (view = fragmentG.getView()) == null || view.getParent() == null)) {
                    z10 = false;
                }
                if (!z10) {
                    cVar.add(Long.valueOf(jI2));
                }
            }
        }
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            l(((Long) it.next()).longValue());
        }
    }

    public final Long j(int i10) {
        Long lValueOf = null;
        for (int i11 = 0; i11 < this.f2984g.l(); i11++) {
            if (this.f2984g.m(i11).intValue() == i10) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f2984g.i(i11));
            }
        }
        return lValueOf;
    }

    public void k(final g gVar) {
        Fragment fragmentF = this.f2982e.f(gVar.getItemId());
        if (fragmentF == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) gVar.itemView;
        View view = fragmentF.getView();
        if (!fragmentF.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragmentF.isAdded() && view == null) {
            this.f2981d.f1911m.f2115a.add(new u.a(new c(this, fragmentF, frameLayout), false));
            return;
        }
        if (fragmentF.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                c(view, frameLayout);
                return;
            }
            return;
        }
        if (fragmentF.isAdded()) {
            c(view, frameLayout);
            return;
        }
        if (m()) {
            if (this.f2981d.H) {
                return;
            }
            this.f2980c.a(new n() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.lifecycle.n
                public void g(p pVar, i.b bVar) {
                    if (FragmentStateAdapter.this.m()) {
                        return;
                    }
                    pVar.getLifecycle().c(this);
                    FrameLayout frameLayout2 = (FrameLayout) gVar.itemView;
                    WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                    if (e0.g.b(frameLayout2)) {
                        FragmentStateAdapter.this.k(gVar);
                    }
                }
            });
            return;
        }
        this.f2981d.f1911m.f2115a.add(new u.a(new c(this, fragmentF, frameLayout), false));
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(this.f2981d);
        StringBuilder sbA = defpackage.a.a("f");
        sbA.append(gVar.getItemId());
        aVar.e(0, fragmentF, sbA.toString(), 1);
        aVar.h(fragmentF, i.c.STARTED);
        aVar.d();
        this.f2985h.b(false);
    }

    public final void l(long j10) {
        Bundle bundleO;
        ViewParent parent;
        Fragment.SavedState savedState = null;
        Fragment fragmentG = this.f2982e.g(j10, null);
        if (fragmentG == null) {
            return;
        }
        if (fragmentG.getView() != null && (parent = fragmentG.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!e(j10)) {
            this.f2983f.k(j10);
        }
        if (!fragmentG.isAdded()) {
            this.f2982e.k(j10);
            return;
        }
        if (m()) {
            this.f2987j = true;
            return;
        }
        if (fragmentG.isAdded() && e(j10)) {
            q.e<Fragment.SavedState> eVar = this.f2983f;
            FragmentManager fragmentManager = this.f2981d;
            b0 b0VarG = fragmentManager.f1901c.g(fragmentG.mWho);
            if (b0VarG == null || !b0VarG.f1984c.equals(fragmentG)) {
                fragmentManager.k0(new IllegalStateException(l.a("Fragment ", fragmentG, " is not currently in the FragmentManager")));
                throw null;
            }
            if (b0VarG.f1984c.mState > -1 && (bundleO = b0VarG.o()) != null) {
                savedState = new Fragment.SavedState(bundleO);
            }
            eVar.j(j10, savedState);
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(this.f2981d);
        aVar.f(fragmentG);
        aVar.d();
        this.f2982e.k(j10);
    }

    public boolean m() {
        return this.f2981d.P();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        androidx.activity.i.b(this.f2985h == null);
        final b bVar = new b();
        this.f2985h = bVar;
        bVar.f2996d = bVar.a(recyclerView);
        e eVar = new e(bVar);
        bVar.f2993a = eVar;
        bVar.f2996d.c(eVar);
        f fVar = new f(bVar);
        bVar.f2994b = fVar;
        registerAdapterDataObserver(fVar);
        n nVar = new n() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
            @Override // androidx.lifecycle.n
            public void g(p pVar, i.b bVar2) {
                bVar.b(false);
            }
        };
        bVar.f2995c = nVar;
        this.f2980c.a(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
        g gVar = (g) c0Var;
        long itemId = gVar.getItemId();
        int id2 = ((FrameLayout) gVar.itemView).getId();
        Long lJ = j(id2);
        if (lJ != null && lJ.longValue() != itemId) {
            l(lJ.longValue());
            this.f2984g.k(lJ.longValue());
        }
        this.f2984g.j(itemId, Integer.valueOf(id2));
        long j10 = i10;
        if (!this.f2982e.d(j10)) {
            Fragment fragmentF = f(i10);
            fragmentF.setInitialSavedState(this.f2983f.f(j10));
            this.f2982e.j(j10, fragmentF);
        }
        FrameLayout frameLayout = (FrameLayout) gVar.itemView;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (e0.g.b(frameLayout)) {
            if (frameLayout.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayout.addOnLayoutChangeListener(new androidx.viewpager2.adapter.b(this, frameLayout, gVar));
        }
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        int i11 = g.f3008a;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        frameLayout.setId(e0.e.a());
        frameLayout.setSaveEnabled(false);
        return new g(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        b bVar = this.f2985h;
        bVar.a(recyclerView).g(bVar.f2993a);
        FragmentStateAdapter.this.unregisterAdapterDataObserver(bVar.f2994b);
        FragmentStateAdapter.this.f2980c.c(bVar.f2995c);
        bVar.f2996d = null;
        this.f2985h = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ boolean onFailedToRecycleView(RecyclerView.c0 c0Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(RecyclerView.c0 c0Var) {
        k((g) c0Var);
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewRecycled(RecyclerView.c0 c0Var) {
        Long lJ = j(((FrameLayout) ((g) c0Var).itemView).getId());
        if (lJ != null) {
            l(lJ.longValue());
            this.f2984g.k(lJ.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
