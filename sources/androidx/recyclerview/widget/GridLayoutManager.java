package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f2416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View[] f2417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f2418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseIntArray f2419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f2420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f2421h;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int b(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int c(int i10) {
            return 1;
        }
    }

    public static class b extends RecyclerView.p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2423f;

        public b(int i10, int i11) {
            super(i10, i11);
            this.f2422e = -1;
            this.f2423f = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2422e = -1;
            this.f2423f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2422e = -1;
            this.f2423f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2422e = -1;
            this.f2423f = 0;
        }

        public b(RecyclerView.p pVar) {
            super(pVar);
            this.f2422e = -1;
            this.f2423f = 0;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseIntArray f2424a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseIntArray f2425b = new SparseIntArray();

        public int a(int i10, int i11) {
            int iC = c(i10);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int iC2 = c(i14);
                i12 += iC2;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = iC2;
                }
            }
            return i12 + iC > i11 ? i13 + 1 : i13;
        }

        public int b(int i10, int i11) {
            int iC = c(i10);
            if (iC == i11) {
                return 0;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int iC2 = c(i13);
                i12 += iC2;
                if (i12 == i11) {
                    i12 = 0;
                } else if (i12 > i11) {
                    i12 = iC2;
                }
            }
            if (iC + i12 <= i11) {
                return i12;
            }
            return 0;
        }

        public abstract int c(int i10);
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.f2414a = false;
        this.f2415b = -1;
        this.f2418e = new SparseIntArray();
        this.f2419f = new SparseIntArray();
        this.f2420g = new a();
        this.f2421h = new Rect();
        E(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f2414a = false;
        this.f2415b = -1;
        this.f2418e = new SparseIntArray();
        this.f2419f = new SparseIntArray();
        this.f2420g = new a();
        this.f2421h = new Rect();
        E(i10);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f2414a = false;
        this.f2415b = -1;
        this.f2418e = new SparseIntArray();
        this.f2419f = new SparseIntArray();
        this.f2420g = new a();
        this.f2421h = new Rect();
        E(RecyclerView.o.getProperties(context, attributeSet, i10, i11).f2475b);
    }

    public final int A(RecyclerView.v vVar, RecyclerView.z zVar, int i10) {
        if (!zVar.f2511g) {
            return this.f2420g.b(i10, this.f2415b);
        }
        int i11 = this.f2419f.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iC = vVar.c(i10);
        if (iC != -1) {
            return this.f2420g.b(iC, this.f2415b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    public final int B(RecyclerView.v vVar, RecyclerView.z zVar, int i10) {
        if (!zVar.f2511g) {
            return this.f2420g.c(i10);
        }
        int i11 = this.f2418e.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iC = vVar.c(i10);
        if (iC != -1) {
            return this.f2420g.c(iC);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    public final void C(View view, int i10, boolean z10) {
        int childMeasureSpec;
        int childMeasureSpec2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f2479b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iY = y(bVar.f2422e, bVar.f2423f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.o.getChildMeasureSpec(iY, i10, i12, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            childMeasureSpec = RecyclerView.o.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i11, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.o.getChildMeasureSpec(iY, i10, i11, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int childMeasureSpec4 = RecyclerView.o.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i12, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        D(view, childMeasureSpec2, childMeasureSpec, z10);
    }

    public final void D(View view, int i10, int i11, boolean z10) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z10 ? shouldReMeasureChild(view, i10, i11, pVar) : shouldMeasureChild(view, i10, i11, pVar)) {
            view.measure(i10, i11);
        }
    }

    public void E(int i10) {
        if (i10 == this.f2415b) {
            return;
        }
        this.f2414a = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Span count should be at least 1. Provided ", i10));
        }
        this.f2415b = i10;
        this.f2420g.f2424a.clear();
        requestLayout();
    }

    public final void F() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        w(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int iC = this.f2415b;
        for (int i10 = 0; i10 < this.f2415b && cVar.b(zVar) && iC > 0; i10++) {
            int i11 = cVar.f2441d;
            ((n.b) cVar2).a(i11, Math.max(0, cVar.f2444g));
            iC -= this.f2420g.c(i11);
            cVar.f2441d += cVar.f2442e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollOffset(RecyclerView.z zVar) {
        return super.computeHorizontalScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollRange(RecyclerView.z zVar) {
        return super.computeHorizontalScrollRange(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollOffset(RecyclerView.z zVar) {
        return super.computeVerticalScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollRange(RecyclerView.z zVar) {
        return super.computeVerticalScrollRange(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(RecyclerView.v vVar, RecyclerView.z zVar, int i10, int i11, int i12) {
        ensureLayoutState();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            int position = getPosition(childAt);
            if (position >= 0 && position < i12 && A(vVar, zVar, position) == 0) {
                if (((RecyclerView.p) childAt.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) < iG && this.mOrientationHelper.b(childAt) >= iK) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getColumnCountForAccessibility(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.mOrientation == 1) {
            return this.f2415b;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return z(vVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getRowCountForAccessibility(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.mOrientation == 0) {
            return this.f2415b;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return z(vVar, zVar, zVar.b() - 1) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x022f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void layoutChunk(RecyclerView.v vVar, RecyclerView.z zVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int i12;
        int paddingLeft;
        int iD;
        int paddingTop;
        int iD2;
        int i13;
        int i14;
        int i15;
        int iD3;
        int i16;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z10;
        View viewC;
        int iJ = this.mOrientationHelper.j();
        boolean z11 = iJ != 1073741824;
        int i17 = getChildCount() > 0 ? this.f2416c[this.f2415b] : 0;
        if (z11) {
            F();
        }
        boolean z12 = cVar.f2442e == 1;
        int iA = this.f2415b;
        if (!z12) {
            iA = A(vVar, zVar, cVar.f2441d) + B(vVar, zVar, cVar.f2441d);
        }
        int i18 = 0;
        while (i18 < this.f2415b && cVar.b(zVar) && iA > 0) {
            int i19 = cVar.f2441d;
            int iB = B(vVar, zVar, i19);
            if (iB > this.f2415b) {
                throw new IllegalArgumentException(android.support.v4.media.b.a(o.a("Item at position ", i19, " requires ", iB, " spans but GridLayoutManager has only "), this.f2415b, " spans."));
            }
            iA -= iB;
            if (iA < 0 || (viewC = cVar.c(vVar)) == null) {
                break;
            }
            this.f2417d[i18] = viewC;
            i18++;
        }
        if (i18 == 0) {
            bVar.f2435b = true;
            return;
        }
        if (z12) {
            i12 = 1;
            i11 = i18;
            i10 = 0;
        } else {
            i10 = i18 - 1;
            i11 = -1;
            i12 = -1;
        }
        int i20 = 0;
        while (i10 != i11) {
            View view = this.f2417d[i10];
            b bVar2 = (b) view.getLayoutParams();
            int iB2 = B(vVar, zVar, getPosition(view));
            bVar2.f2423f = iB2;
            bVar2.f2422e = i20;
            i20 += iB2;
            i10 += i12;
        }
        float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        int i21 = 0;
        for (int i22 = 0; i22 < i18; i22++) {
            View view2 = this.f2417d[i22];
            if (cVar.f2448k != null) {
                z10 = false;
                if (z12) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z12) {
                addView(view2);
                z10 = false;
            } else {
                z10 = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f2421h);
            C(view2, iJ, z10);
            int iC = this.mOrientationHelper.c(view2);
            if (iC > i21) {
                i21 = iC;
            }
            float fD = (this.mOrientationHelper.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f2423f;
            if (fD > f10) {
                f10 = fD;
            }
        }
        if (z11) {
            w(Math.max(Math.round(f10 * this.f2415b), i17));
            i21 = 0;
            for (int i23 = 0; i23 < i18; i23++) {
                View view3 = this.f2417d[i23];
                C(view3, 1073741824, true);
                int iC2 = this.mOrientationHelper.c(view3);
                if (iC2 > i21) {
                    i21 = iC2;
                }
            }
        }
        for (int i24 = 0; i24 < i18; i24++) {
            View view4 = this.f2417d[i24];
            if (this.mOrientationHelper.c(view4) != i21) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect = bVar3.f2479b;
                int i25 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i26 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int iY = y(bVar3.f2422e, bVar3.f2423f);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.o.getChildMeasureSpec(iY, 1073741824, i26, ((ViewGroup.MarginLayoutParams) bVar3).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21 - i25, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21 - i26, 1073741824);
                    childMeasureSpec = RecyclerView.o.getChildMeasureSpec(iY, 1073741824, i25, ((ViewGroup.MarginLayoutParams) bVar3).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                D(view4, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        bVar.f2434a = i21;
        if (this.mOrientation == 1) {
            if (cVar.f2443f == -1) {
                int i27 = cVar.f2439b;
                iD2 = i27;
                i16 = i27 - i21;
            } else {
                i16 = cVar.f2439b;
                iD2 = i21 + i16;
            }
            paddingTop = i16;
            paddingLeft = 0;
            iD = 0;
        } else {
            int i28 = cVar.f2443f;
            int i29 = cVar.f2439b;
            if (i28 == -1) {
                iD = i29 - i21;
                paddingLeft = i29;
            } else {
                paddingLeft = i21 + i29;
                iD = i29;
            }
            paddingTop = 0;
            iD2 = 0;
        }
        int i30 = 0;
        while (i30 < i18) {
            View view5 = this.f2417d[i30];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    paddingLeft = getPaddingLeft() + this.f2416c[this.f2415b - bVar4.f2422e];
                    iD = paddingLeft - this.mOrientationHelper.d(view5);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.f2416c[bVar4.f2422e];
                    i14 = paddingLeft2;
                    i15 = paddingTop;
                    i13 = iD2;
                    iD3 = this.mOrientationHelper.d(view5) + paddingLeft2;
                }
                layoutDecoratedWithMargins(view5, i14, i15, iD3, i13);
                if (bVar4.c() || bVar4.b()) {
                    bVar.f2436c = true;
                }
                bVar.f2437d |= view5.hasFocusable();
                i30++;
                paddingLeft = iD3;
                paddingTop = i15;
                iD = i14;
                iD2 = i13;
            } else {
                paddingTop = getPaddingTop() + this.f2416c[bVar4.f2422e];
                iD2 = this.mOrientationHelper.d(view5) + paddingTop;
            }
            i15 = paddingTop;
            i14 = iD;
            i13 = iD2;
            iD3 = paddingLeft;
            layoutDecoratedWithMargins(view5, i14, i15, iD3, i13);
            if (bVar4.c()) {
                bVar.f2436c = true;
            } else {
                bVar.f2436c = true;
            }
            bVar.f2437d |= view5.hasFocusable();
            i30++;
            paddingLeft = iD3;
            paddingTop = i15;
            iD = i14;
            iD2 = i13;
        }
        Arrays.fill(this.f2417d, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.v vVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i10) {
        super.onAnchorReady(vVar, zVar, aVar, i10);
        F();
        if (zVar.b() > 0 && !zVar.f2511g) {
            boolean z10 = i10 == 1;
            int iA = A(vVar, zVar, aVar.f2430b);
            if (z10) {
                while (iA > 0) {
                    int i11 = aVar.f2430b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f2430b = i12;
                    iA = A(vVar, zVar, i12);
                }
            } else {
                int iB = zVar.b() - 1;
                int i13 = aVar.f2430b;
                while (i13 < iB) {
                    int i14 = i13 + 1;
                    int iA2 = A(vVar, zVar, i14);
                    if (iA2 <= iA) {
                        break;
                    }
                    i13 = i14;
                    iA = iA2;
                }
                aVar.f2430b = i13;
            }
        }
        x();
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0107  */
    /* JADX WARN: Code duplicated, block: B:81:0x010d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0123  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.z r27) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.v vVar, RecyclerView.z zVar, View view, q0.c cVar) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iZ = z(vVar, zVar, bVar.a());
        if (this.mOrientation == 0) {
            i13 = bVar.f2422e;
            i10 = bVar.f2423f;
            i12 = 1;
            z10 = false;
            z11 = false;
            i11 = iZ;
        } else {
            i10 = 1;
            i11 = bVar.f2422e;
            i12 = bVar.f2423f;
            z10 = false;
            z11 = false;
            i13 = iZ;
        }
        cVar.n(q0.c.C0389c.a(i13, i10, i11, i12, z10, z11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        this.f2420g.f2424a.clear();
        this.f2420g.f2425b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f2420g.f2424a.clear();
        this.f2420g.f2425b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f2420g.f2424a.clear();
        this.f2420g.f2425b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        this.f2420g.f2424a.clear();
        this.f2420g.f2425b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f2420g.f2424a.clear();
        this.f2420g.f2425b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (zVar.f2511g) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                b bVar = (b) getChildAt(i10).getLayoutParams();
                int iA = bVar.a();
                this.f2418e.put(iA, bVar.f2423f);
                this.f2419f.put(iA, bVar.f2422e);
            }
        }
        super.onLayoutChildren(vVar, zVar);
        this.f2418e.clear();
        this.f2419f.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.z zVar) {
        super.onLayoutCompleted(zVar);
        this.f2414a = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        F();
        x();
        return super.scrollHorizontallyBy(i10, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i10, RecyclerView.v vVar, RecyclerView.z zVar) {
        F();
        x();
        return super.scrollVerticallyBy(i10, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f2416c == null) {
            super.setMeasuredDimension(rect, i10, i11);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.o.chooseSize(i11, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f2416c;
            iChooseSize = RecyclerView.o.chooseSize(i10, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.o.chooseSize(i10, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f2416c;
            iChooseSize2 = RecyclerView.o.chooseSize(i11, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f2414a;
    }

    public final void w(int i10) {
        int i11;
        int[] iArr = this.f2416c;
        int i12 = this.f2415b;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.f2416c = iArr;
    }

    public final void x() {
        View[] viewArr = this.f2417d;
        if (viewArr == null || viewArr.length != this.f2415b) {
            this.f2417d = new View[this.f2415b];
        }
    }

    public int y(int i10, int i11) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f2416c;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f2416c;
        int i12 = this.f2415b;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int z(RecyclerView.v vVar, RecyclerView.z zVar, int i10) {
        if (!zVar.f2511g) {
            return this.f2420g.a(i10, this.f2415b);
        }
        int iC = vVar.c(i10);
        if (iC != -1) {
            return this.f2420g.a(iC, this.f2415b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }
}
