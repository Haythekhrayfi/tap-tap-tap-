package k8;

import android.view.View;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f31933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f31934b;

    public interface a {
        boolean a();
    }

    public b(View view) {
        j0.i(view, "mOwnerView");
        this.f31933a = view;
    }

    public final void a() {
        View rootView;
        if (this.f31934b == null || !this.f31933a.hasWindowFocus()) {
            return;
        }
        View view = this.f31933a;
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        if (view.isShown()) {
            view.requestFocus();
        } else {
            if (!view.hasFocus() || (rootView = view.getRootView()) == null) {
                return;
            }
            rootView.requestFocus(33);
        }
    }
}
