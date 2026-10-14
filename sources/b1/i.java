package b1;

import androidx.fragment.app.Fragment;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Fragment fragment, Fragment fragment2, int i10) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i10 + " for fragment " + fragment);
        j0.i(fragment, "fragment");
        j0.i(fragment2, "targetFragment");
    }
}
