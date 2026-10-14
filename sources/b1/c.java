package b1;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f3237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        j0.i(fragment, "fragment");
        this.f3237d = viewGroup;
    }
}
