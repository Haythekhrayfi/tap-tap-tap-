package p0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    public static final class a implements dd.g<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f34379a;

        public a(ViewGroup viewGroup) {
            this.f34379a = viewGroup;
        }

        @Override // dd.g
        public Iterator<View> iterator() {
            ViewGroup viewGroup = this.f34379a;
            fd.j0.i(viewGroup, "<this>");
            return new j0(viewGroup);
        }
    }

    public static final View a(ViewGroup viewGroup, int i10) {
        fd.j0.i(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder sbA = androidx.appcompat.widget.r0.a("Index: ", i10, ", Size: ");
        sbA.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    public static final dd.g<View> b(ViewGroup viewGroup) {
        fd.j0.i(viewGroup, "<this>");
        return new a(viewGroup);
    }
}
