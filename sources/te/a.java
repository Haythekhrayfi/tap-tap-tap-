package te;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import fd.j0;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends p.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc.p<Integer, Integer, w> f35894d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(uc.p<? super Integer, ? super Integer, w> pVar) {
        j0.i(pVar, "onViewMoved");
        this.f35894d = pVar;
    }

    @Override // androidx.recyclerview.widget.p.d
    public void a(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        j0.i(recyclerView, "recyclerView");
        j0.i(c0Var, "viewHolder");
        super.a(recyclerView, c0Var);
        if (c0Var instanceof b) {
            ((b) c0Var).f35897c.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.p.d
    public int e(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        j0.i(recyclerView, "recyclerView");
        j0.i(c0Var, "viewHolder");
        return 196611;
    }

    @Override // androidx.recyclerview.widget.p.d
    public boolean h(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
        j0.i(recyclerView, "recyclerView");
        this.f35894d.invoke(Integer.valueOf(c0Var.getAdapterPosition()), Integer.valueOf(c0Var2.getAdapterPosition()));
        return true;
    }

    @Override // androidx.recyclerview.widget.p.d
    public void i(RecyclerView.c0 c0Var, int i10) {
        if (i10 == 0 || !(c0Var instanceof b)) {
            return;
        }
        ((b) c0Var).f35896b.invoke();
    }

    @Override // androidx.recyclerview.widget.p.d
    public void j(RecyclerView.c0 c0Var, int i10) {
        j0.i(c0Var, "viewHolder");
    }
}
