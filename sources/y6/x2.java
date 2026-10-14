package y6;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class x2 extends GestureDetector {

    public static final class a implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uc.a<jc.w> f38427c;

        public a(uc.a<jc.w> aVar) {
            this.f38427c = aVar;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            fd.j0.i(motionEvent, "e");
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            fd.j0.i(motionEvent, "e1");
            fd.j0.i(motionEvent2, "e2");
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            fd.j0.i(motionEvent, "e");
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            fd.j0.i(motionEvent, "e1");
            fd.j0.i(motionEvent2, "e2");
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            fd.j0.i(motionEvent, "e");
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            fd.j0.i(motionEvent, "e");
            this.f38427c.invoke();
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(Context context, uc.a<jc.w> aVar) {
        super(context, new a(aVar));
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(aVar, "onTap");
    }
}
