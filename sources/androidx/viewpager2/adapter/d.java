package androidx.viewpager2.adapter;

/* JADX INFO: loaded from: classes.dex */
public class d implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f3005c;

    public d(FragmentStateAdapter fragmentStateAdapter) {
        this.f3005c = fragmentStateAdapter;
    }

    @Override // java.lang.Runnable
    public void run() {
        FragmentStateAdapter fragmentStateAdapter = this.f3005c;
        fragmentStateAdapter.f2986i = false;
        fragmentStateAdapter.h();
    }
}
