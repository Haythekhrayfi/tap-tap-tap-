package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import y9.t2;

/* JADX INFO: loaded from: classes.dex */
public final class DivLinearLayoutManager extends LinearLayoutManager implements m8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8.k f2408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f2409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t2 f2410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet<View> f2411d;

    public static final class a extends RecyclerView.p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2413f;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f2412e = Integer.MAX_VALUE;
            this.f2413f = Integer.MAX_VALUE;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2412e = Integer.MAX_VALUE;
            this.f2413f = Integer.MAX_VALUE;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2412e = Integer.MAX_VALUE;
            this.f2413f = Integer.MAX_VALUE;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2412e = Integer.MAX_VALUE;
            this.f2413f = Integer.MAX_VALUE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a aVar) {
            super((RecyclerView.p) aVar);
            j0.i(aVar, "source");
            this.f2412e = Integer.MAX_VALUE;
            this.f2413f = Integer.MAX_VALUE;
            this.f2412e = aVar.f2412e;
            this.f2413f = aVar.f2413f;
        }

        public a(RecyclerView.p pVar) {
            super(pVar);
            this.f2412e = Integer.MAX_VALUE;
            this.f2413f = Integer.MAX_VALUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivLinearLayoutManager(i8.k kVar, RecyclerView recyclerView, t2 t2Var, int i10) {
        super(recyclerView.getContext(), i10, false);
        j0.i(kVar, "divView");
        j0.i(recyclerView, "view");
        j0.i(t2Var, "div");
        this.f2408a = kVar;
        this.f2409b = recyclerView;
        this.f2410c = t2Var;
        this.f2411d = new HashSet<>();
    }

    public /* synthetic */ DivLinearLayoutManager(i8.k kVar, RecyclerView recyclerView, t2 t2Var, int i10, int i11, vc.g gVar) {
        this(kVar, recyclerView, t2Var, (i11 & 8) != 0 ? 0 : i10);
    }

    @Override // m8.f
    public t2 a() {
        return this.f2410c;
    }

    @Override // m8.f
    public void b(int i10, int i11) {
        i(i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof a;
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
        return findLastVisibleItemPosition();
    }

    @Override // m8.f
    public void g(View view, int i10, int i11, int i12, int i13) {
        super.layoutDecoratedWithMargins(view, i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((a) layoutParams);
        }
        if (layoutParams instanceof RecyclerView.p) {
            return new a((RecyclerView.p) layoutParams);
        }
        if (!(layoutParams instanceof m9.d) && !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return new a(layoutParams);
        }
        return new a((ViewGroup.MarginLayoutParams) layoutParams);
    }

    @Override // m8.f
    public RecyclerView getView() {
        return this.f2409b;
    }

    @Override // m8.f
    public void h(int i10) {
        i(i10, 0);
    }

    @Override // m8.f
    public i8.k j() {
        return this.f2408a;
    }

    @Override // m8.f
    public int k(View view) {
        return getPosition(view);
    }

    @Override // m8.f
    public int l() {
        return findFirstVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void layoutDecorated(View view, int i10, int i11, int i12, int i13) {
        j0.i(view, "child");
        super.layoutDecorated(view, i10, i11, i12, i13);
        m8.f.t(this, view, false, 2, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void layoutDecoratedWithMargins(View view, int i10, int i11, int i12, int i13) {
        j0.i(view, "child");
        m8.f.d(this, view, i10, i11, i12, i13, false, 32, null);
    }

    @Override // m8.f
    public Set m() {
        return this.f2411d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void measureChild(View view, int i10, int i11) {
        j0.i(view, "child");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.DivLinearLayoutManager.DivRecyclerViewLayoutParams");
        a aVar = (a) layoutParams;
        Rect itemDecorInsetsForChild = this.f2409b.getItemDecorInsetsForChild(view);
        int iF = f(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i10 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right, ((ViewGroup.MarginLayoutParams) aVar).width, aVar.f2413f, canScrollHorizontally());
        int iF2 = f(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i11 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom, ((ViewGroup.MarginLayoutParams) aVar).height, aVar.f2412e, canScrollVertically());
        if (shouldMeasureChild(view, iF, iF2, aVar)) {
            view.measure(iF, iF2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void measureChildWithMargins(View view, int i10, int i11) {
        j0.i(view, "child");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.DivLinearLayoutManager.DivRecyclerViewLayoutParams");
        a aVar = (a) layoutParams;
        Rect itemDecorInsetsForChild = this.f2409b.getItemDecorInsetsForChild(view);
        int iF = f(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + i10 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right, ((ViewGroup.MarginLayoutParams) aVar).width, aVar.f2413f, canScrollHorizontally());
        int iF2 = f(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + i11 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom, ((ViewGroup.MarginLayoutParams) aVar).height, aVar.f2412e, canScrollVertically());
        if (shouldMeasureChild(view, iF, iF2, aVar)) {
            view.measure(iF, iF2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onAttachedToWindow(RecyclerView recyclerView) {
        j0.i(recyclerView, "view");
        super.onAttachedToWindow(recyclerView);
        s(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        j0.i(recyclerView, "view");
        j0.i(vVar, "recycler");
        super.onDetachedFromWindow(recyclerView, vVar);
        o(recyclerView, vVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.z zVar) {
        u(zVar);
        super.onLayoutCompleted(zVar);
    }

    @Override // m8.f
    public List<y9.k> p() {
        RecyclerView.g adapter = this.f2409b.getAdapter();
        m8.a.C0357a c0357a = adapter instanceof m8.a.C0357a ? (m8.a.C0357a) adapter : null;
        List<y9.k> list = c0357a != null ? c0357a.f32932d : null;
        return list == null ? this.f2410c.f42724r : list;
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
        return getOrientation();
    }
}
