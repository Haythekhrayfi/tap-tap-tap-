package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class g implements RecyclerView.q {
    public g(ViewPager2 viewPager2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) pVar).width != -1 || ((ViewGroup.MarginLayoutParams) pVar).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
