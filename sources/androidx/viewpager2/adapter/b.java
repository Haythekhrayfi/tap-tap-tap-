package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class b implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f3000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f3001e;

    public b(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, g gVar) {
        this.f3001e = fragmentStateAdapter;
        this.f2999c = frameLayout;
        this.f3000d = gVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f2999c.getParent() != null) {
            this.f2999c.removeOnLayoutChangeListener(this);
            this.f3001e.k(this.f3000d);
        }
    }
}
