package i8;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public uc.a<jc.w> f31478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uc.a<jc.w> f31479d;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        fd.j0.i(motionEvent, "e");
        uc.a<jc.w> aVar = this.f31479d;
        if (aVar == null) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        fd.j0.i(motionEvent, "e");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        uc.a<jc.w> aVar;
        fd.j0.i(motionEvent, "e");
        if (this.f31479d == null || (aVar = this.f31478c) == null) {
            return false;
        }
        if (aVar == null) {
            return true;
        }
        aVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        uc.a<jc.w> aVar;
        fd.j0.i(motionEvent, "e");
        if (this.f31479d != null || (aVar = this.f31478c) == null) {
            return false;
        }
        if (aVar == null) {
            return true;
        }
        aVar.invoke();
        return true;
    }
}
