package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class f extends c0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2608s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<RecyclerView.c0> f2609h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<RecyclerView.c0> f2610i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<e> f2611j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<d> f2612k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.c0>> f2613l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<ArrayList<e>> f2614m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<ArrayList<d>> f2615n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<RecyclerView.c0> f2616o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<RecyclerView.c0> f2617p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<RecyclerView.c0> f2618q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<RecyclerView.c0> f2619r = new ArrayList<>();

    public class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2620c;

        public a(ArrayList arrayList) {
            this.f2620c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (e eVar : this.f2620c) {
                f fVar = f.this;
                RecyclerView.c0 c0Var = eVar.f2632a;
                int i10 = eVar.f2633b;
                int i11 = eVar.f2634c;
                int i12 = eVar.f2635d;
                int i13 = eVar.f2636e;
                Objects.requireNonNull(fVar);
                View view = c0Var.itemView;
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                if (i14 != 0) {
                    view.animate().translationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                }
                if (i15 != 0) {
                    view.animate().translationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                fVar.f2617p.add(c0Var);
                viewPropertyAnimatorAnimate.setDuration(fVar.f2467e).setListener(new i(fVar, c0Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
            }
            this.f2620c.clear();
            f.this.f2614m.remove(this.f2620c);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2622c;

        public b(ArrayList arrayList) {
            this.f2622c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (d dVar : this.f2622c) {
                f fVar = f.this;
                Objects.requireNonNull(fVar);
                RecyclerView.c0 c0Var = dVar.f2626a;
                View view = c0Var == null ? null : c0Var.itemView;
                RecyclerView.c0 c0Var2 = dVar.f2627b;
                View view2 = c0Var2 != null ? c0Var2.itemView : null;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(fVar.f2468f);
                    fVar.f2619r.add(dVar.f2626a);
                    duration.translationX(dVar.f2630e - dVar.f2628c);
                    duration.translationY(dVar.f2631f - dVar.f2629d);
                    duration.alpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD).setListener(new j(fVar, dVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    fVar.f2619r.add(dVar.f2627b);
                    viewPropertyAnimatorAnimate.translationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD).translationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD).setDuration(fVar.f2468f).alpha(1.0f).setListener(new k(fVar, dVar, viewPropertyAnimatorAnimate, view2)).start();
                }
            }
            this.f2622c.clear();
            f.this.f2615n.remove(this.f2622c);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2624c;

        public c(ArrayList arrayList) {
            this.f2624c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (RecyclerView.c0 c0Var : this.f2624c) {
                f fVar = f.this;
                Objects.requireNonNull(fVar);
                View view = c0Var.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                fVar.f2616o.add(c0Var);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(fVar.f2465c).setListener(new h(fVar, c0Var, view, viewPropertyAnimatorAnimate)).start();
            }
            this.f2624c.clear();
            f.this.f2613l.remove(this.f2624c);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.c0 f2626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.c0 f2627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2631f;

        public d(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i10, int i11, int i12, int i13) {
            this.f2626a = c0Var;
            this.f2627b = c0Var2;
            this.f2628c = i10;
            this.f2629d = i11;
            this.f2630e = i12;
            this.f2631f = i13;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("ChangeInfo{oldHolder=");
            sbA.append(this.f2626a);
            sbA.append(", newHolder=");
            sbA.append(this.f2627b);
            sbA.append(", fromX=");
            sbA.append(this.f2628c);
            sbA.append(", fromY=");
            sbA.append(this.f2629d);
            sbA.append(", toX=");
            sbA.append(this.f2630e);
            sbA.append(", toY=");
            return h0.f.a(sbA, this.f2631f, '}');
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.c0 f2632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2636e;

        public e(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
            this.f2632a = c0Var;
            this.f2633b = i10;
            this.f2634c = i11;
            this.f2635d = i12;
            this.f2636e = i13;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.c0 c0Var, List<Object> list) {
        return !list.isEmpty() || f(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.c0 c0Var) {
        View view = c0Var.itemView;
        view.animate().cancel();
        int size = this.f2611j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f2611j.get(size).f2632a == c0Var) {
                view.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                view.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                h(c0Var);
                this.f2611j.remove(size);
            }
        }
        u(this.f2612k, c0Var);
        if (this.f2609h.remove(c0Var)) {
            view.setAlpha(1.0f);
            h(c0Var);
        }
        if (this.f2610i.remove(c0Var)) {
            view.setAlpha(1.0f);
            h(c0Var);
        }
        for (int size2 = this.f2615n.size() - 1; size2 >= 0; size2--) {
            ArrayList<d> arrayList = this.f2615n.get(size2);
            u(arrayList, c0Var);
            if (arrayList.isEmpty()) {
                this.f2615n.remove(size2);
            }
        }
        for (int size3 = this.f2614m.size() - 1; size3 >= 0; size3--) {
            ArrayList<e> arrayList2 = this.f2614m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f2632a == c0Var) {
                    view.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    view.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    h(c0Var);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f2614m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f2613l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.c0> arrayList3 = this.f2613l.get(size5);
            if (arrayList3.remove(c0Var)) {
                view.setAlpha(1.0f);
                h(c0Var);
                if (arrayList3.isEmpty()) {
                    this.f2613l.remove(size5);
                }
            }
        }
        this.f2618q.remove(c0Var);
        this.f2616o.remove(c0Var);
        this.f2619r.remove(c0Var);
        this.f2617p.remove(c0Var);
        t();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.f2611j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = this.f2611j.get(size);
            View view = eVar.f2632a.itemView;
            view.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            view.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            h(eVar.f2632a);
            this.f2611j.remove(size);
        }
        int size2 = this.f2609h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            h(this.f2609h.get(size2));
            this.f2609h.remove(size2);
        }
        int size3 = this.f2610i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.c0 c0Var = this.f2610i.get(size3);
            c0Var.itemView.setAlpha(1.0f);
            h(c0Var);
            this.f2610i.remove(size3);
        }
        int size4 = this.f2612k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            d dVar = this.f2612k.get(size4);
            RecyclerView.c0 c0Var2 = dVar.f2626a;
            if (c0Var2 != null) {
                v(dVar, c0Var2);
            }
            RecyclerView.c0 c0Var3 = dVar.f2627b;
            if (c0Var3 != null) {
                v(dVar, c0Var3);
            }
        }
        this.f2612k.clear();
        if (!l()) {
            return;
        }
        int size5 = this.f2614m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<e> arrayList = this.f2614m.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    e eVar2 = arrayList.get(size6);
                    View view2 = eVar2.f2632a.itemView;
                    view2.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    view2.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    h(eVar2.f2632a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2614m.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f2613l.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.c0> arrayList2 = this.f2613l.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.c0 c0Var4 = arrayList2.get(size8);
                    c0Var4.itemView.setAlpha(1.0f);
                    h(c0Var4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2613l.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.f2615n.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                s(this.f2618q);
                s(this.f2617p);
                s(this.f2616o);
                s(this.f2619r);
                i();
                return;
            }
            ArrayList<d> arrayList3 = this.f2615n.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    d dVar2 = arrayList3.get(size10);
                    RecyclerView.c0 c0Var5 = dVar2.f2626a;
                    if (c0Var5 != null) {
                        v(dVar2, c0Var5);
                    }
                    RecyclerView.c0 c0Var6 = dVar2.f2627b;
                    if (c0Var6 != null) {
                        v(dVar2, c0Var6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.f2615n.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean l() {
        return (this.f2610i.isEmpty() && this.f2612k.isEmpty() && this.f2611j.isEmpty() && this.f2609h.isEmpty() && this.f2617p.isEmpty() && this.f2618q.isEmpty() && this.f2616o.isEmpty() && this.f2619r.isEmpty() && this.f2614m.isEmpty() && this.f2613l.isEmpty() && this.f2615n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void n() {
        boolean z10 = !this.f2609h.isEmpty();
        boolean z11 = !this.f2611j.isEmpty();
        boolean z12 = !this.f2612k.isEmpty();
        boolean z13 = !this.f2610i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            for (RecyclerView.c0 c0Var : this.f2609h) {
                View view = c0Var.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                this.f2618q.add(c0Var);
                viewPropertyAnimatorAnimate.setDuration(this.f2466d).alpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD).setListener(new g(this, c0Var, viewPropertyAnimatorAnimate, view)).start();
            }
            this.f2609h.clear();
            if (z11) {
                ArrayList<e> arrayList = new ArrayList<>();
                arrayList.addAll(this.f2611j);
                this.f2614m.add(arrayList);
                this.f2611j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    View view2 = arrayList.get(0).f2632a.itemView;
                    long j10 = this.f2466d;
                    WeakHashMap<View, m0> weakHashMap = p0.e0.f34354a;
                    p0.e0.d.n(view2, aVar, j10);
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<d> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f2612k);
                this.f2615n.add(arrayList2);
                this.f2612k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    View view3 = arrayList2.get(0).f2626a.itemView;
                    long j11 = this.f2466d;
                    WeakHashMap<View, m0> weakHashMap2 = p0.e0.f34354a;
                    p0.e0.d.n(view3, bVar, j11);
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.c0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f2610i);
                this.f2613l.add(arrayList3);
                this.f2610i.clear();
                c cVar = new c(arrayList3);
                if (!z10 && !z11 && !z12) {
                    cVar.run();
                    return;
                }
                long jMax = Math.max(z11 ? this.f2467e : 0L, z12 ? this.f2468f : 0L) + (z10 ? this.f2466d : 0L);
                View view4 = arrayList3.get(0).itemView;
                WeakHashMap<View, m0> weakHashMap3 = p0.e0.f34354a;
                p0.e0.d.n(view4, cVar, jMax);
            }
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public boolean o(RecyclerView.c0 c0Var) {
        w(c0Var);
        c0Var.itemView.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.f2610i.add(c0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.c0
    public boolean p(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i10, int i11, int i12, int i13) {
        if (c0Var == c0Var2) {
            return q(c0Var, i10, i11, i12, i13);
        }
        float translationX = c0Var.itemView.getTranslationX();
        float translationY = c0Var.itemView.getTranslationY();
        float alpha = c0Var.itemView.getAlpha();
        w(c0Var);
        c0Var.itemView.setTranslationX(translationX);
        c0Var.itemView.setTranslationY(translationY);
        c0Var.itemView.setAlpha(alpha);
        w(c0Var2);
        c0Var2.itemView.setTranslationX(-((int) ((i12 - i10) - translationX)));
        c0Var2.itemView.setTranslationY(-((int) ((i13 - i11) - translationY)));
        c0Var2.itemView.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.f2612k.add(new d(c0Var, c0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.c0
    public boolean q(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
        View view = c0Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) c0Var.itemView.getTranslationY());
        w(c0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            h(c0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f2611j.add(new e(c0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.c0
    public boolean r(RecyclerView.c0 c0Var) {
        w(c0Var);
        this.f2609h.add(c0Var);
        return true;
    }

    public void s(List<RecyclerView.c0> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                list.get(size).itemView.animate().cancel();
            }
        }
    }

    public void t() {
        if (l()) {
            return;
        }
        i();
    }

    public final void u(List<d> list, RecyclerView.c0 c0Var) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            d dVar = list.get(size);
            if (v(dVar, c0Var) && dVar.f2626a == null && dVar.f2627b == null) {
                list.remove(dVar);
            }
        }
    }

    public final boolean v(d dVar, RecyclerView.c0 c0Var) {
        if (dVar.f2627b == c0Var) {
            dVar.f2627b = null;
        } else {
            if (dVar.f2626a != c0Var) {
                return false;
            }
            dVar.f2626a = null;
        }
        c0Var.itemView.setAlpha(1.0f);
        c0Var.itemView.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        c0Var.itemView.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        h(c0Var);
        return true;
    }

    public final void w(RecyclerView.c0 c0Var) {
        if (f2608s == null) {
            f2608s = new ValueAnimator().getInterpolator();
        }
        c0Var.itemView.animate().setInterpolator(f2608s);
        j(c0Var);
    }
}
