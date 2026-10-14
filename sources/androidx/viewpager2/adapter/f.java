package androidx.viewpager2.adapter;

/* JADX INFO: loaded from: classes.dex */
public class f extends FragmentStateAdapter.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter.b f3007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FragmentStateAdapter.b bVar) {
        super(null);
        this.f3007a = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void onChanged() {
        this.f3007a.b(true);
    }
}
