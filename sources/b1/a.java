package b1;

import androidx.fragment.app.Fragment;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        j0.i(fragment, "fragment");
        j0.i(str, "previousFragmentId");
    }
}
