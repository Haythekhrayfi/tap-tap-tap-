package p0;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f34442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewTreeObserver f34443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f34444e;

    public x(View view, Runnable runnable) {
        this.f34442c = view;
        this.f34443d = view.getViewTreeObserver();
        this.f34444e = runnable;
    }

    public static x a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        x xVar = new x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(xVar);
        view.addOnAttachStateChangeListener(xVar);
        return xVar;
    }

    public void b() {
        (this.f34443d.isAlive() ? this.f34443d : this.f34442c.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f34442c.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f34444e.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f34443d = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
