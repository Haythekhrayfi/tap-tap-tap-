package y6;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38287c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38288d;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f38287c) {
            case 0:
                o1 o1Var = (o1) this.f38288d;
                fd.j0.i(o1Var, "this$0");
                d7.o oVarM = o1Var.m();
                fd.j0.h(view, "v");
                fd.j0.h(motionEvent, "event");
                oVarM.p(view, motionEvent);
                return false;
            default:
                f8.d dVar = (f8.d) this.f38288d;
                fd.j0.i(dVar, "$this_setDismissOnTouchOutside");
                if (motionEvent.getAction() != 4) {
                    return false;
                }
                dVar.dismiss();
                return true;
        }
    }
}
