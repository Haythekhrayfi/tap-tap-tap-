package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ViewPager2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ViewPager2.g> f3049a;

    public c(int i10) {
        this.f3049a = new ArrayList(i10);
    }

    public final void a(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void onPageScrollStateChanged(int i10) {
        try {
            Iterator<ViewPager2.g> it = this.f3049a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i10);
            }
        } catch (ConcurrentModificationException e10) {
            a(e10);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void onPageScrolled(int i10, float f10, int i11) {
        try {
            Iterator<ViewPager2.g> it = this.f3049a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            a(e10);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void onPageSelected(int i10) {
        try {
            Iterator<ViewPager2.g> it = this.f3049a.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i10);
            }
        } catch (ConcurrentModificationException e10) {
            a(e10);
            throw null;
        }
    }
}
