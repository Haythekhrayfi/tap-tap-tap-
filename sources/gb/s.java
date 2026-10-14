package gb;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends FragmentManager.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Fragment f30402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uc.l<Fragment, jc.w> f30403b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(uc.l<? super Fragment, jc.w> lVar) {
        this.f30403b = lVar;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        j0.i(fragmentManager, "fm");
        j0.i(fragment, "currentFragment");
        super.onFragmentResumed(fragmentManager, fragment);
        if (!j0.d(this.f30402a, fragment) && fragment.isVisible() && fragment.getUserVisibleHint()) {
            this.f30403b.invoke(fragment);
            this.f30402a = fragment;
        }
    }
}
