package b1;

import androidx.fragment.app.Fragment;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Fragment fragment, String str) {
        super(fragment, str);
        j0.i(fragment, "fragment");
    }

    public /* synthetic */ g(Fragment fragment, String str, int i10, vc.g gVar) {
        this(fragment, (i10 & 2) != 0 ? null : str);
    }
}
