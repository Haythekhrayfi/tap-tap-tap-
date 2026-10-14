package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 extends RecyclerView.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f2591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView.t f2592b = new a();

    public class a extends RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2593a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0 && this.f2593a) {
                this.f2593a = false;
                d0.this.g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f2593a = true;
        }
    }

    public class b extends t {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.t
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.t, androidx.recyclerview.widget.RecyclerView.y
        public void onTargetFound(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            d0 d0Var = d0.this;
            RecyclerView recyclerView = d0Var.f2591a;
            if (recyclerView == null) {
                return;
            }
            int[] iArrC = d0Var.c(recyclerView.getLayoutManager(), view);
            int i10 = iArrC[0];
            int i11 = iArrC[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.b(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i10, int i11) {
        t tVarD;
        int iF;
        boolean z10;
        RecyclerView.o layoutManager = this.f2591a.getLayoutManager();
        if (layoutManager == null || this.f2591a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f2591a.getMinFlingVelocity();
        if (Math.abs(i11) <= minFlingVelocity && Math.abs(i10) <= minFlingVelocity) {
            return false;
        }
        if (!(layoutManager instanceof RecyclerView.y.b) || (tVarD = d(layoutManager)) == null || (iF = f(layoutManager, i10, i11)) == -1) {
            z10 = false;
        } else {
            tVarD.setTargetPosition(iF);
            layoutManager.startSmoothScroll(tVarD);
            z10 = true;
        }
        return z10;
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f2591a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.f2592b);
            this.f2591a.setOnFlingListener(null);
        }
        this.f2591a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f2591a.addOnScrollListener(this.f2592b);
            this.f2591a.setOnFlingListener(this);
            new Scroller(this.f2591a.getContext(), new DecelerateInterpolator());
            g();
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    @Deprecated
    public t d(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.y.b) {
            return new b(this.f2591a.getContext());
        }
        return null;
    }

    public abstract View e(RecyclerView.o oVar);

    public abstract int f(RecyclerView.o oVar, int i10, int i11);

    public void g() {
        RecyclerView.o layoutManager;
        View viewE;
        RecyclerView recyclerView = this.f2591a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewE = e(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewE);
        if (iArrC[0] == 0 && iArrC[1] == 0) {
            return;
        }
        this.f2591a.smoothScrollBy(iArrC[0], iArrC[1]);
    }
}
