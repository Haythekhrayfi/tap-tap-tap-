package b1;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f3239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        j0.i(fragment, "fragment");
        j0.i(viewGroup, "container");
        this.f3239d = viewGroup;
    }
}
