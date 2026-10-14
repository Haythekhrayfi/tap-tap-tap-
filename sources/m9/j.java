package m9;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends RecyclerView.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f33363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f33369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f33370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f33371i;

    public j() {
        this(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0, 127, null);
    }

    public j(float f10) {
        this(f10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0, 126, null);
    }

    public j(float f10, float f11) {
        this(f10, f11, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0, 124, null);
    }

    public j(float f10, float f11, float f12) {
        this(f10, f11, f12, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0, 120, null);
    }

    public j(float f10, float f11, float f12, float f13) {
        this(f10, f11, f12, f13, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0, 112, null);
    }

    public j(float f10, float f11, float f12, float f13, float f14) {
        this(f10, f11, f12, f13, f14, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0, 96, null);
    }

    public j(float f10, float f11, float f12, float f13, float f14, float f15) {
        this(f10, f11, f12, f13, f14, f15, 0, 64, null);
    }

    public j(float f10, float f11, float f12, float f13, float f14, float f15, int i10) {
        int iC;
        float f16;
        this.f33363a = f14;
        this.f33364b = i10;
        this.f33365c = xc.b.c(f10);
        this.f33366d = xc.b.c(f11);
        this.f33367e = xc.b.c(f12);
        this.f33368f = xc.b.c(f13);
        this.f33369g = xc.b.c(this.f33363a + f15);
        int iC2 = 0;
        if (i10 != 0) {
            iC = i10 != 1 ? 0 : xc.b.c(((this.f33363a + f15) * 2) - f13);
        } else {
            iC = xc.b.c(((this.f33363a + f15) * 2) - f10);
        }
        this.f33370h = iC;
        if (i10 != 0) {
            f16 = i10 == 1 ? ((this.f33363a + f15) * 2) - f12 : f16;
            this.f33371i = iC2;
        }
        f16 = ((this.f33363a + f15) * 2) - f11;
        iC2 = xc.b.c(f16);
        this.f33371i = iC2;
    }

    public /* synthetic */ j(float f10, float f11, float f12, float f13, float f14, float f15, int i10, int i11, vc.g gVar) {
        this((i11 & 1) != 0 ? 0.0f : f10, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0.0f : f12, (i11 & 8) != 0 ? 0.0f : f13, (i11 & 16) != 0 ? 0.0f : f14, (i11 & 32) == 0 ? f15 : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, (i11 & 64) != 0 ? 0 : i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        j0.i(rect, "outRect");
        j0.i(view, "view");
        j0.i(recyclerView, "parent");
        j0.i(zVar, "state");
        RecyclerView.g adapter = recyclerView.getAdapter();
        boolean z10 = false;
        boolean z11 = adapter != null && adapter.getItemCount() == 2;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        boolean z12 = layoutManager != null && layoutManager.getPosition(view) == 0;
        RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 != null) {
            int position = layoutManager2.getPosition(view);
            RecyclerView.g adapter2 = recyclerView.getAdapter();
            j0.f(adapter2);
            if (position == adapter2.getItemCount() - 1) {
                z10 = true;
            }
        }
        int i14 = this.f33364b;
        if (i14 == 0) {
            if (z12) {
                i10 = this.f33365c;
            } else {
                i10 = (!z10 || z11) ? this.f33369g : this.f33371i;
            }
            int i15 = this.f33367e;
            if (z10) {
                i11 = this.f33366d;
            } else {
                i11 = (!z12 || z11) ? this.f33369g : this.f33370h;
            }
            rect.set(i10, i15, i11, this.f33368f);
            return;
        }
        if (i14 != 1) {
            int i16 = e9.a.f29114a;
            return;
        }
        int i17 = this.f33365c;
        if (z12) {
            i12 = this.f33367e;
        } else {
            i12 = (!z10 || z11) ? this.f33369g : this.f33371i;
        }
        int i18 = this.f33366d;
        if (z10) {
            i13 = this.f33368f;
        } else {
            i13 = (!z12 || z11) ? this.f33369g : this.f33370h;
        }
        rect.set(i17, i12, i18, i13);
    }
}
