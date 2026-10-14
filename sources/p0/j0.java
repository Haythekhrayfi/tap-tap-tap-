package p0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Iterator<View>, wc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f34384d;

    public j0(ViewGroup viewGroup) {
        this.f34384d = viewGroup;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f34383c < this.f34384d.getChildCount();
    }

    @Override // java.util.Iterator
    public View next() {
        ViewGroup viewGroup = this.f34384d;
        int i10 = this.f34383c;
        this.f34383c = i10 + 1;
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public void remove() {
        ViewGroup viewGroup = this.f34384d;
        int i10 = this.f34383c - 1;
        this.f34383c = i10;
        viewGroup.removeViewAt(i10);
    }
}
