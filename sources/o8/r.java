package o8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import y9.k0;
import y9.x6;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends m9.g implements c, f9.b, m9.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c8.e f34114n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f34115o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p0.e f34116p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public uc.a<jc.w> f34117q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public x6 f34118r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y9.k f34119s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f34120t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o8.a f34121u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<p7.d> f34122v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f34123w;

    public final class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f34124c;

        public a(r rVar) {
            j0.i(rVar, "this$0");
            this.f34124c = rVar;
        }

        public final boolean a(View view, float f10, float f11, int i10) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount() - 1;
                if (childCount >= 0) {
                    while (true) {
                        int i11 = childCount - 1;
                        View childAt = viewGroup.getChildAt(childCount);
                        if (f10 >= childAt.getLeft() && f10 < childAt.getRight() && f11 >= childAt.getTop() && f11 < childAt.getBottom() && a(childAt, f10 - childAt.getLeft(), f11 - childAt.getTop(), i10)) {
                            return true;
                        }
                        if (i11 < 0) {
                            break;
                        }
                        childCount = i11;
                    }
                }
            }
            return view.canScrollHorizontally(i10);
        }

        public final boolean b() {
            View viewC = c();
            return !((viewC == null ? 0.0f : viewC.getTranslationX()) == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }

        public final View c() {
            if (this.f34124c.getChildCount() > 0) {
                return this.f34124c.getChildAt(0);
            }
            return null;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            j0.i(motionEvent, "e");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            j0.i(motionEvent, "e1");
            j0.i(motionEvent2, "e2");
            View viewC = c();
            if (viewC == null) {
                return false;
            }
            int iSignum = (int) Math.signum(f10);
            if (viewC.getTranslationX() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                if (Math.abs(f10) > Math.abs(f11) * 2 && a(viewC, motionEvent.getX(), motionEvent.getY(), iSignum)) {
                    return false;
                }
            }
            viewC.setTranslationX(androidx.activity.i.i(viewC.getTranslationX() - f10, -viewC.getWidth(), viewC.getWidth()));
            return !(viewC.getTranslationX() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        a aVar = new a(this);
        this.f34115o = aVar;
        this.f34116p = new p0.e(context, aVar, new Handler(Looper.getMainLooper()));
        this.f34122v = new ArrayList();
    }

    public /* synthetic */ r(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // o8.c
    public void a(k0 k0Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        this.f34121u = l8.b.d0(this, k0Var, dVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (super.canScrollHorizontally(i10)) {
            return true;
        }
        if (getChildCount() < 1 || this.f34117q == null) {
            return super.canScrollHorizontally(i10);
        }
        View childAt = getChildAt(0);
        if (i10 < 0) {
            if (childAt.getTranslationX() <= childAt.getWidth()) {
                return true;
            }
        } else if ((-childAt.getTranslationX()) <= childAt.getWidth()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        o8.a aVar;
        j0.i(canvas, "canvas");
        l8.b.w(this, canvas);
        if (this.f34123w || (aVar = this.f34121u) == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            aVar.c(canvas);
            super.dispatchDraw(canvas);
            aVar.e(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        j0.i(canvas, "canvas");
        this.f34123w = true;
        o8.a aVar = this.f34121u;
        if (aVar != null) {
            int iSave = canvas.save();
            try {
                aVar.c(canvas);
                super.draw(canvas);
                aVar.e(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            super.draw(canvas);
        }
        this.f34123w = false;
    }

    @Override // m9.p
    public boolean f() {
        return this.f34120t;
    }

    public final y9.k getActiveStateDiv$div_release() {
        return this.f34119s;
    }

    @Override // o8.c
    public k0 getBorder() {
        o8.a aVar = this.f34121u;
        if (aVar == null) {
            return null;
        }
        return aVar.f34007f;
    }

    @Override // o8.c
    public o8.a getDivBorderDrawer() {
        return this.f34121u;
    }

    public final x6 getDivState$div_release() {
        return this.f34118r;
    }

    public final c8.e getPath() {
        return this.f34114n;
    }

    public final String getStateId() {
        c8.e eVar = this.f34114n;
        if (eVar == null) {
            return null;
        }
        return eVar.a();
    }

    @Override // f9.b
    public List<p7.d> getSubscriptions() {
        return this.f34122v;
    }

    public final uc.a<jc.w> getSwipeOutCallback() {
        return this.f34117q;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        j0.i(motionEvent, "event");
        if (this.f34117q == null) {
            requestDisallowInterceptTouchEvent(false);
            return false;
        }
        ((p0.e.b) this.f34116p.f34352a).f34353a.onTouchEvent(motionEvent);
        requestDisallowInterceptTouchEvent(this.f34115o.b());
        if (this.f34115o.b()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        o8.a aVar = this.f34121u;
        if (aVar == null) {
            return;
        }
        aVar.k();
        aVar.j();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        View viewC;
        float fAbs;
        q qVar;
        float fSignum;
        j0.i(motionEvent, "event");
        if (this.f34117q == null) {
            requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (viewC = (aVar = this.f34115o).c()) != null) {
            if (Math.abs(viewC.getTranslationX()) > viewC.getWidth() / 2) {
                fAbs = (Math.abs(viewC.getWidth() - viewC.getTranslationX()) * 300.0f) / viewC.getWidth();
                fSignum = Math.signum(viewC.getTranslationX()) * viewC.getWidth();
                qVar = new q(aVar.f34124c);
            } else {
                fAbs = (Math.abs(viewC.getTranslationX()) * 300.0f) / viewC.getWidth();
                qVar = null;
                fSignum = 0.0f;
            }
            viewC.animate().cancel();
            viewC.animate().setDuration((long) androidx.activity.i.i(fAbs, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 300.0f)).translationX(fSignum).setListener(qVar).start();
        }
        if (((p0.e.b) this.f34116p.f34352a).f34353a.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // f9.b, i8.u0
    public void release() {
        g();
        o8.a aVar = this.f34121u;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    public final void setActiveStateDiv$div_release(y9.k kVar) {
        this.f34119s = kVar;
    }

    public final void setDivState$div_release(x6 x6Var) {
        this.f34118r = x6Var;
    }

    public final void setPath(c8.e eVar) {
        this.f34114n = eVar;
    }

    public final void setSwipeOutCallback(uc.a<jc.w> aVar) {
        this.f34117q = aVar;
    }

    @Override // m9.p
    public void setTransient(boolean z10) {
        this.f34120t = z10;
        invalidate();
    }
}
