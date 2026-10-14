package c8;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends RecyclerView.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f3644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m8.f f3645c;

    public m(String str, f fVar, m8.f fVar2) {
        j0.i(str, "blockId");
        j0.i(fVar, "divViewState");
        j0.i(fVar2, "layoutManager");
        this.f3643a = str;
        this.f3644b = fVar;
        this.f3645c = fVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int left;
        int paddingLeft;
        j0.i(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i10, i11);
        int iL = this.f3645c.l();
        RecyclerView.c0 c0VarFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(iL);
        if (c0VarFindViewHolderForLayoutPosition != null) {
            int iV = this.f3645c.v();
            View view = c0VarFindViewHolderForLayoutPosition.itemView;
            if (iV == 1) {
                left = view.getTop();
                paddingLeft = this.f3645c.getView().getPaddingTop();
            } else {
                left = view.getLeft();
                paddingLeft = this.f3645c.getView().getPaddingLeft();
            }
            i12 = left - paddingLeft;
        } else {
            i12 = 0;
        }
        f fVar = this.f3644b;
        fVar.f3635b.put(this.f3643a, new g(iL, i12));
    }
}
