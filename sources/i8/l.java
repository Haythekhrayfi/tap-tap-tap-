package i8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f31381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f31382d;

    public l(View view, k kVar) {
        this.f31381c = view;
        this.f31382d = kVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        fd.j0.i(view, "view");
        this.f31381c.removeOnAttachStateChangeListener(this);
        ((r7.a.b) this.f31382d.getDiv2Component$div_release()).b().a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        fd.j0.i(view, "view");
    }
}
