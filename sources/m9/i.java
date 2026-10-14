package m9;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends RecyclerView.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f33362g;

    public i() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public i(int i10) {
        this(i10, 0, 0, 0, 0, 0, 0, 126, null);
    }

    public i(int i10, int i11) {
        this(i10, i11, 0, 0, 0, 0, 0, 124, null);
    }

    public i(int i10, int i11, int i12) {
        this(i10, i11, i12, 0, 0, 0, 0, 120, null);
    }

    public i(int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13, 0, 0, 0, 112, null);
    }

    public i(int i10, int i11, int i12, int i13, int i14) {
        this(i10, i11, i12, i13, i14, 0, 0, 96, null);
    }

    public i(int i10, int i11, int i12, int i13, int i14, int i15) {
        this(i10, i11, i12, i13, i14, i15, 0, 64, null);
    }

    public i(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f33356a = i10;
        this.f33357b = i11;
        this.f33358c = i12;
        this.f33359d = i13;
        this.f33360e = i14;
        this.f33361f = i15;
        this.f33362g = i16;
    }

    public /* synthetic */ i(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, vc.g gVar) {
        this((i17 & 1) != 0 ? 0 : i10, (i17 & 2) != 0 ? 0 : i11, (i17 & 4) != 0 ? 0 : i12, (i17 & 8) != 0 ? 0 : i13, (i17 & 16) != 0 ? 0 : i14, (i17 & 32) != 0 ? 0 : i15, (i17 & 64) != 0 ? 0 : i16);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int i10;
        j0.i(rect, "outRect");
        j0.i(view, "view");
        j0.i(recyclerView, "parent");
        j0.i(zVar, "state");
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            i10 = ((StaggeredGridLayoutManager) layoutManager).f2519a;
        } else {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                int i11 = e9.a.f29114a;
            }
            i10 = 1;
        }
        if (i10 == 1) {
            RecyclerView.g adapter = recyclerView.getAdapter();
            Integer numValueOf = adapter == null ? null : Integer.valueOf(adapter.getItemCount());
            if (numValueOf == null) {
                return;
            }
            int iIntValue = numValueOf.intValue();
            RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
            Integer numValueOf2 = layoutManager2 != null ? Integer.valueOf(layoutManager2.getPosition(view)) : null;
            if (numValueOf2 == null) {
                return;
            }
            int iIntValue2 = numValueOf2.intValue();
            boolean z10 = iIntValue2 == 0;
            boolean z11 = iIntValue2 == iIntValue - 1;
            int i12 = this.f33362g;
            if (i12 == 0) {
                rect.set(z10 ? this.f33356a : 0, this.f33360e, z11 ? this.f33359d : this.f33357b, this.f33361f);
                return;
            } else if (i12 == 1) {
                rect.set(this.f33356a, z10 ? this.f33360e : 0, this.f33359d, z11 ? this.f33361f : this.f33357b);
                return;
            }
        } else {
            int i13 = this.f33357b / 2;
            int i14 = this.f33358c / 2;
            int i15 = this.f33362g;
            if (i15 == 0) {
                rect.set(i13, i14, i13, i14);
                return;
            } else if (i15 == 1) {
                rect.set(i14, i13, i14, i13);
                return;
            }
        }
        int i16 = e9.a.f29114a;
    }
}
