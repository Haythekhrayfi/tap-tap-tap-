package y6;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class z2 implements View.OnTouchListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View.OnTouchListener f38436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc.a<jc.w> f38437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x2 f38438e;

    public z2(Context context, View.OnTouchListener onTouchListener, uc.a<jc.w> aVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(onTouchListener, "externalTouchListener");
        fd.j0.i(aVar, "onTap");
        this.f38436c = onTouchListener;
        this.f38437d = aVar;
        this.f38438e = new x2(context, aVar);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        fd.j0.i(motionEvent, "event");
        this.f38436c.onTouch(view, motionEvent);
        return this.f38438e.onTouchEvent(motionEvent);
    }
}
