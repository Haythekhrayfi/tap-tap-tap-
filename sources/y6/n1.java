package y6;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o1 f38292d;

    public /* synthetic */ n1(o1 o1Var, int i10) {
        this.f38291c = i10;
        this.f38292d = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38291c) {
            case 0:
                o1 o1Var = this.f38292d;
                fd.j0.i(o1Var, "this$0");
                try {
                    View view = o1Var.f38309q;
                    if (view == null) {
                        fd.j0.r("widgetView");
                        throw null;
                    }
                    if (!view.isAttachedToWindow()) {
                        WindowManager windowManagerN = o1Var.n();
                        View view2 = o1Var.f38309q;
                        if (view2 == null) {
                            fd.j0.r("widgetView");
                            throw null;
                        }
                        Object tag = view2.getTag();
                        fd.j0.g(tag, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        windowManagerN.addView(view2, (ViewGroup.LayoutParams) tag);
                    }
                    new Handler().postDelayed(new n1(o1Var, 1), 100L);
                    return;
                } catch (Exception e10) {
                    xe.a.f37601c.a("[ERROR] display overlay view #6: " + e10 + ' ' + e10.getMessage(), new Object[0]);
                }
                break;
            default:
                o1 o1Var2 = this.f38292d;
                fd.j0.i(o1Var2, "this$0");
                try {
                    View view3 = o1Var2.f38309q;
                    if (view3 == null) {
                        fd.j0.r("widgetView");
                        throw null;
                    }
                    if (view3.isAttachedToWindow()) {
                        return;
                    }
                    WindowManager windowManagerN2 = o1Var2.n();
                    View view4 = o1Var2.f38309q;
                    if (view4 == null) {
                        fd.j0.r("widgetView");
                        throw null;
                    }
                    Object tag2 = view4.getTag();
                    fd.j0.g(tag2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    windowManagerN2.addView(view4, (ViewGroup.LayoutParams) tag2);
                    return;
                } catch (Exception e11) {
                    xe.a.f37601c.a("[ERROR] display overlay view #5: " + e11 + ' ' + e11.getMessage(), new Object[0]);
                    return;
                }
        }
    }
}
