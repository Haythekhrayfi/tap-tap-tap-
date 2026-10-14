package androidx.viewpager2.adapter;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public class e extends ViewPager2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter.b f3006a;

    public e(FragmentStateAdapter.b bVar) {
        this.f3006a = bVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void onPageScrollStateChanged(int i10) {
        this.f3006a.b(false);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void onPageSelected(int i10) {
        this.f3006a.b(false);
    }
}
