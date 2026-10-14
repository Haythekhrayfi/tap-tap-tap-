package j8;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import fd.j0;
import jc.w;
import uc.p;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends vc.l implements p<View, MotionEvent, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Animation f31768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Animation f31769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Animation animation, Animation animation2) {
        super(2);
        this.f31768c = animation;
        this.f31769d = animation2;
    }

    @Override // uc.p
    public w invoke(View view, MotionEvent motionEvent) {
        int action;
        Animation animation;
        View view2 = view;
        MotionEvent motionEvent2 = motionEvent;
        j0.i(view2, "v");
        j0.i(motionEvent2, "event");
        if (view2.isEnabled() && view2.isClickable() && view2.hasOnClickListeners() && ((action = motionEvent2.getAction()) == 0 ? (animation = this.f31768c) != null : (action == 1 || action == 3) && (animation = this.f31769d) != null)) {
            view2.startAnimation(animation);
        }
        return w.f31842a;
    }
}
