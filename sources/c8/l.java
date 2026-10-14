package c8;

import androidx.viewpager2.widget.ViewPager2;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends ViewPager2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f3642b;

    public l(String str, f fVar) {
        j0.i(str, "mBlockId");
        j0.i(fVar, "mDivViewState");
        this.f3641a = str;
        this.f3642b = fVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void onPageSelected(int i10) {
        super.onPageSelected(i10);
        f fVar = this.f3642b;
        fVar.f3635b.put(this.f3641a, new h(i10));
    }
}
