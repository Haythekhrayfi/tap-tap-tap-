package b1;

import androidx.fragment.app.Fragment;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends RuntimeException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f3238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Fragment fragment, String str) {
        super(str);
        j0.i(fragment, "fragment");
        this.f3238c = fragment;
    }

    public /* synthetic */ l(Fragment fragment, String str, int i10, vc.g gVar) {
        this(fragment, (i10 & 2) != 0 ? null : str);
    }
}
