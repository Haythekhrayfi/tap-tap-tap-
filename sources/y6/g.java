package y6;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38192c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38193d;

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f38192c) {
            case 0:
                j jVar = (j) this.f38193d;
                fd.j0.i(jVar, "this$0");
                Rect rect = new Rect();
                View view3 = jVar.f38225q;
                if (view3 == null) {
                    fd.j0.r("measureView");
                    throw null;
                }
                view3.getWindowVisibleDisplayFrame(rect);
                View view4 = jVar.f38225q;
                if (view4 != null) {
                    view4.getRootView().getHeight();
                    return;
                } else {
                    fd.j0.r("measureView");
                    throw null;
                }
            default:
                o1 o1Var = (o1) this.f38193d;
                o1.a aVar = o1.f38296s;
                fd.j0.i(o1Var, "this$0");
                Rect rect2 = new Rect();
                View view5 = o1Var.f38310r;
                if (view5 != null) {
                    view5.getWindowVisibleDisplayFrame(rect2);
                    return;
                } else {
                    fd.j0.r("measureView");
                    throw null;
                }
        }
    }
}
