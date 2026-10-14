package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends RecyclerView.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2590g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i10;
        int i11;
        return (cVar == null || ((i10 = cVar.f2469a) == (i11 = cVar2.f2469a) && cVar.f2470b == cVar2.f2470b)) ? o(c0Var) : q(c0Var, i10, cVar.f2470b, i11, cVar2.f2470b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f2469a;
        int i13 = cVar.f2470b;
        if (c0Var2.shouldIgnore()) {
            int i14 = cVar.f2469a;
            i11 = cVar.f2470b;
            i10 = i14;
        } else {
            i10 = cVar2.f2469a;
            i11 = cVar2.f2470b;
        }
        return p(c0Var, c0Var2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i10 = cVar.f2469a;
        int i11 = cVar.f2470b;
        View view = c0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2469a;
        int top = cVar2 == null ? view.getTop() : cVar2.f2470b;
        if (c0Var.isRemoved() || (i10 == left && i11 == top)) {
            return r(c0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return q(c0Var, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i10 = cVar.f2469a;
        int i11 = cVar2.f2469a;
        if (i10 != i11 || cVar.f2470b != cVar2.f2470b) {
            return q(c0Var, i10, cVar.f2470b, i11, cVar2.f2470b);
        }
        h(c0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(RecyclerView.c0 c0Var) {
        return !this.f2590g || c0Var.isInvalid();
    }

    public abstract boolean o(RecyclerView.c0 c0Var);

    public abstract boolean p(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i10, int i11, int i12, int i13);

    public abstract boolean q(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(RecyclerView.c0 c0Var);
}
