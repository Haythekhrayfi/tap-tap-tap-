package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class z extends d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f2797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f2798d;

    public class a extends t {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.t
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.t
        public int calculateTimeForScrolling(int i10) {
            return Math.min(100, super.calculateTimeForScrolling(i10));
        }

        @Override // androidx.recyclerview.widget.t, androidx.recyclerview.widget.RecyclerView.y
        public void onTargetFound(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            z zVar2 = z.this;
            int[] iArrC = zVar2.c(zVar2.f2591a.getLayoutManager(), view);
            int i10 = iArrC[0];
            int i11 = iArrC[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.b(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    @Override // androidx.recyclerview.widget.d0
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.canScrollHorizontally()) {
            iArr[0] = h(view, j(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.canScrollVertically()) {
            iArr[1] = h(view, k(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.d0
    public t d(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.y.b) {
            return new a(this.f2591a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.d0
    public View e(RecyclerView.o oVar) {
        y yVarJ;
        if (oVar.canScrollVertically()) {
            yVarJ = k(oVar);
        } else {
            if (!oVar.canScrollHorizontally()) {
                return null;
            }
            yVarJ = j(oVar);
        }
        return i(oVar, yVarJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.d0
    public int f(RecyclerView.o oVar, int i10, int i11) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = oVar.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View view = null;
        y yVarK = oVar.canScrollVertically() ? k(oVar) : oVar.canScrollHorizontally() ? j(oVar) : null;
        if (yVarK == null) {
            return -1;
        }
        int childCount = oVar.getChildCount();
        boolean z10 = false;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = oVar.getChildAt(i14);
            if (childAt != null) {
                int iH = h(childAt, yVarK);
                if (iH <= 0 && iH > i13) {
                    view2 = childAt;
                    i13 = iH;
                }
                if (iH >= 0 && iH < i12) {
                    view = childAt;
                    i12 = iH;
                }
            }
        }
        boolean z11 = !oVar.canScrollHorizontally() ? i11 <= 0 : i10 <= 0;
        if (z11 && view != null) {
            return oVar.getPosition(view);
        }
        if (!z11 && view2 != null) {
            return oVar.getPosition(view2);
        }
        if (z11) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = oVar.getPosition(view);
        int itemCount2 = oVar.getItemCount();
        if ((oVar instanceof RecyclerView.y.b) && (pointFComputeScrollVectorForPosition = ((RecyclerView.y.b) oVar).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || pointFComputeScrollVectorForPosition.y < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
            z10 = true;
        }
        int i15 = position + (z10 == z11 ? -1 : 1);
        if (i15 < 0 || i15 >= itemCount) {
            return -1;
        }
        return i15;
    }

    public final int h(View view, y yVar) {
        return ((yVar.c(view) / 2) + yVar.e(view)) - ((yVar.l() / 2) + yVar.k());
    }

    public final View i(RecyclerView.o oVar, y yVar) {
        int childCount = oVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iL = (yVar.l() / 2) + yVar.k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = oVar.getChildAt(i11);
            int iAbs = Math.abs(((yVar.c(childAt) / 2) + yVar.e(childAt)) - iL);
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    public final y j(RecyclerView.o oVar) {
        y yVar = this.f2798d;
        if (yVar == null || yVar.f2794a != oVar) {
            this.f2798d = new w(oVar);
        }
        return this.f2798d;
    }

    public final y k(RecyclerView.o oVar) {
        y yVar = this.f2797c;
        if (yVar == null || yVar.f2794a != oVar) {
            this.f2797c = new x(oVar);
        }
        return this.f2797c;
    }
}
