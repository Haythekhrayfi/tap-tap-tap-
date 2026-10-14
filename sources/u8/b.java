package u8;

import android.view.View;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f36067c;

    public b(a aVar) {
        this.f36067c = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        j0.i(view, "v");
        this.f36067c.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        j0.i(view, "v");
        this.f36067c.b();
    }
}
