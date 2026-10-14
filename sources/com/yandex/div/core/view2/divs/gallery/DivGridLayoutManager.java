package com.yandex.div.core.view2.divs.gallery;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import e9.a;
import fd.j0;
import i8.k;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kc.j;
import m8.f;
import v9.b;
import vc.g;
import y9.l6;
import y9.t2;

/* JADX INFO: loaded from: classes2.dex */
public final class DivGridLayoutManager extends StaggeredGridLayoutManager implements f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f13428w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RecyclerView f13429x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t2 f13430y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet<View> f13431z;

    /* JADX WARN: Illegal instructions before constructor call */
    public DivGridLayoutManager(k kVar, RecyclerView recyclerView, t2 t2Var, int i10) {
        Long lB;
        int i11;
        j0.i(kVar, "divView");
        j0.i(recyclerView, "view");
        j0.i(t2Var, "div");
        b<Long> bVar = t2Var.f42713g;
        int i12 = 1;
        if (bVar != null && (lB = bVar.b(kVar.getExpressionResolver())) != null) {
            long jLongValue = lB.longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i11 = (int) jLongValue;
            } else {
                int i13 = a.f29114a;
                i11 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            i12 = i11;
        }
        super(i12, i10);
        this.f13428w = kVar;
        this.f13429x = recyclerView;
        this.f13430y = t2Var;
        this.f13431z = new HashSet<>();
    }

    public /* synthetic */ DivGridLayoutManager(k kVar, RecyclerView recyclerView, t2 t2Var, int i10, int i11, g gVar) {
        this(kVar, recyclerView, t2Var, (i11 & 8) != 0 ? 0 : i10);
    }

    public final int W() {
        Long lB = this.f13430y.f42723q.b(this.f13428w.getExpressionResolver());
        DisplayMetrics displayMetrics = this.f13429x.getResources().getDisplayMetrics();
        j0.h(displayMetrics, "view.resources.displayMetrics");
        return l8.b.u(lB, displayMetrics);
    }

    @Override // m8.f
    public t2 a() {
        return this.f13430y;
    }

    @Override // m8.f
    public void b(int i10, int i11) {
        i(i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void detachView(View view) {
        j0.i(view, "child");
        super.detachView(view);
        r(view, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void detachViewAt(int i10) {
        super.detachViewAt(i10);
        View childAt = getChildAt(i10);
        if (childAt == null) {
            return;
        }
        r(childAt, true);
    }

    @Override // m8.f
    public int e() {
        int itemCount = getItemCount();
        int[] iArr = new int[itemCount];
        if (itemCount < this.f2519a) {
            StringBuilder sbA = defpackage.a.a("Provided int[]'s size must be more than or equal to span count. Expected:");
            sbA.append(this.f2519a);
            sbA.append(", array size:");
            sbA.append(itemCount);
            throw new IllegalArgumentException(sbA.toString());
        }
        for (int i10 = 0; i10 < this.f2519a; i10++) {
            StaggeredGridLayoutManager.d dVar = this.f2520b[i10];
            iArr[i10] = StaggeredGridLayoutManager.this.f2526h ? dVar.i(0, dVar.f2566a.size(), false) : dVar.i(dVar.f2566a.size() - 1, -1, false);
        }
        return j.v(iArr);
    }

    @Override // m8.f
    public void g(View view, int i10, int i11, int i12, int i13) {
        super.layoutDecoratedWithMargins(view, i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getDecoratedMeasuredHeight(View view) {
        j0.i(view, "child");
        boolean z10 = this.f13430y.f42724r.get(k(view)).a().getHeight() instanceof l6.c;
        int iW = 0;
        boolean z11 = this.f2519a > 1;
        int decoratedMeasuredHeight = super.getDecoratedMeasuredHeight(view);
        if (z10 && z11) {
            iW = W();
        }
        return decoratedMeasuredHeight + iW;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getDecoratedMeasuredWidth(View view) {
        j0.i(view, "child");
        boolean z10 = this.f13430y.f42724r.get(k(view)).a().getWidth() instanceof l6.c;
        int iW = 0;
        boolean z11 = this.f2519a > 1;
        int decoratedMeasuredWidth = super.getDecoratedMeasuredWidth(view);
        if (z10 && z11) {
            iW = W();
        }
        return decoratedMeasuredWidth + iW;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getPaddingBottom() {
        return super.getPaddingBottom() - (W() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getPaddingEnd() {
        return super.getPaddingEnd() - (W() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getPaddingLeft() {
        return super.getPaddingLeft() - (W() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getPaddingRight() {
        return super.getPaddingRight() - (W() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getPaddingStart() {
        return super.getPaddingStart() - (W() / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getPaddingTop() {
        return super.getPaddingTop() - (W() / 2);
    }

    @Override // m8.f
    public RecyclerView getView() {
        return this.f13429x;
    }

    @Override // m8.f
    public void h(int i10) {
        i(i10, 0);
    }

    @Override // m8.f
    public k j() {
        return this.f13428w;
    }

    @Override // m8.f
    public int k(View view) {
        return getPosition(view);
    }

    @Override // m8.f
    public int l() {
        int itemCount = getItemCount();
        int[] iArr = new int[itemCount];
        if (itemCount < this.f2519a) {
            StringBuilder sbA = defpackage.a.a("Provided int[]'s size must be more than or equal to span count. Expected:");
            sbA.append(this.f2519a);
            sbA.append(", array size:");
            sbA.append(itemCount);
            throw new IllegalArgumentException(sbA.toString());
        }
        for (int i10 = 0; i10 < this.f2519a; i10++) {
            StaggeredGridLayoutManager.d dVar = this.f2520b[i10];
            iArr[i10] = StaggeredGridLayoutManager.this.f2526h ? dVar.i(dVar.f2566a.size() - 1, -1, false) : dVar.i(0, dVar.f2566a.size(), false);
        }
        return j.p(iArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void layoutDecorated(View view, int i10, int i11, int i12, int i13) {
        j0.i(view, "child");
        super.layoutDecorated(view, i10, i11, i12, i13);
        f.t(this, view, false, 2, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void layoutDecoratedWithMargins(View view, int i10, int i11, int i12, int i13) {
        j0.i(view, "child");
        f.d(this, view, i10, i11, i12, i13, false, 32, null);
    }

    @Override // m8.f
    public Set m() {
        return this.f13431z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onAttachedToWindow(RecyclerView recyclerView) {
        j0.i(recyclerView, "view");
        super.onAttachedToWindow(recyclerView);
        s(recyclerView);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        j0.i(recyclerView, "view");
        j0.i(vVar, "recycler");
        super.onDetachedFromWindow(recyclerView, vVar);
        o(recyclerView, vVar);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.z zVar) {
        u(zVar);
        super.onLayoutCompleted(zVar);
    }

    @Override // m8.f
    public List<y9.k> p() {
        RecyclerView.g adapter = this.f13429x.getAdapter();
        m8.a.C0357a c0357a = adapter instanceof m8.a.C0357a ? (m8.a.C0357a) adapter : null;
        List<y9.k> list = c0357a != null ? c0357a.f32932d : null;
        return list == null ? this.f13430y.f42724r : list;
    }

    @Override // m8.f
    public int q() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void removeAndRecycleAllViews(RecyclerView.v vVar) {
        j0.i(vVar, "recycler");
        n(vVar);
        super.removeAndRecycleAllViews(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void removeView(View view) {
        j0.i(view, "child");
        super.removeView(view);
        r(view, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void removeViewAt(int i10) {
        super.removeViewAt(i10);
        View childAt = getChildAt(i10);
        if (childAt == null) {
            return;
        }
        r(childAt, true);
    }

    @Override // m8.f
    public int v() {
        return this.f2523e;
    }
}
