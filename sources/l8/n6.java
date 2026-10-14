package l8;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class n6 extends RecyclerView.u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o8.y f32654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<RecyclerView.c0> f32655d;

    public n6(o8.y yVar) {
        fd.j0.i(yVar, "releaseViewVisitor");
        this.f32654c = yVar;
        this.f32655d = new LinkedHashSet();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a() {
        super.a();
        for (RecyclerView.c0 c0Var : this.f32655d) {
            o8.y yVar = this.f32654c;
            View view = c0Var.itemView;
            fd.j0.h(view, "viewHolder.itemView");
            u1.a.u(yVar, view);
        }
        this.f32655d.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public RecyclerView.c0 b(int i10) {
        RecyclerView.c0 c0VarB = super.b(i10);
        if (c0VarB == null) {
            return null;
        }
        this.f32655d.remove(c0VarB);
        return c0VarB;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void d(RecyclerView.c0 c0Var) {
        super.d(c0Var);
        this.f32655d.add(c0Var);
    }
}
