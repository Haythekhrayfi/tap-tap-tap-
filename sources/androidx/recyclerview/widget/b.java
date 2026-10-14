package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class b implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.g f2584a;

    public b(RecyclerView.g gVar) {
        this.f2584a = gVar;
    }

    @Override // androidx.recyclerview.widget.u
    public void a(int i10, int i11) {
        this.f2584a.notifyItemMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.u
    public void b(int i10, int i11) {
        this.f2584a.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.u
    public void c(int i10, int i11) {
        this.f2584a.notifyItemRangeRemoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.u
    public void d(int i10, int i11, Object obj) {
        this.f2584a.notifyItemRangeChanged(i10, i11, obj);
    }
}
