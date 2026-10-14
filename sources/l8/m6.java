package l8;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class m6 extends androidx.recyclerview.widget.z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32625e = k9.i.b(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.y f32626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.y f32627g;

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.d0
    public int[] c(RecyclerView.o oVar, View view) {
        fd.j0.i(oVar, "layoutManager");
        fd.j0.i(view, "targetView");
        int[] iArr = new int[2];
        androidx.recyclerview.widget.y xVar = null;
        if (oVar.canScrollHorizontally()) {
            androidx.recyclerview.widget.y yVar = this.f32627g;
            if (yVar != null && !(true ^ fd.j0.d(yVar.f2794a, oVar))) {
                xVar = yVar;
            }
            if (xVar == null) {
                xVar = new androidx.recyclerview.widget.w(oVar);
                this.f32627g = xVar;
            }
            iArr[0] = l(view, xVar);
        } else if (oVar.canScrollVertically()) {
            androidx.recyclerview.widget.y yVar2 = this.f32626f;
            if (yVar2 != null && !(!fd.j0.d(yVar2.f2794a, oVar))) {
                xVar = yVar2;
            }
            if (xVar == null) {
                xVar = new androidx.recyclerview.widget.x(oVar);
                this.f32626f = xVar;
            }
            iArr[1] = l(view, xVar);
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.d0
    public int f(RecyclerView.o oVar, int i10, int i11) {
        fd.j0.i(oVar, "manager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) oVar;
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        if (iFindFirstCompletelyVisibleItemPosition != -1) {
            return iFindFirstCompletelyVisibleItemPosition;
        }
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition == linearLayoutManager.findFirstVisibleItemPosition()) {
            if (iFindLastVisibleItemPosition != -1) {
                return iFindLastVisibleItemPosition;
            }
            return 0;
        }
        if (linearLayoutManager.getOrientation() != 0) {
            i10 = i11;
        }
        return i10 >= 0 ? iFindLastVisibleItemPosition : iFindLastVisibleItemPosition - 1;
    }

    public final int l(View view, androidx.recyclerview.widget.y yVar) {
        return yVar.e(view) - (yVar.f2794a.getPosition(view) == 0 ? yVar.k() : this.f32625e / 2);
    }
}
