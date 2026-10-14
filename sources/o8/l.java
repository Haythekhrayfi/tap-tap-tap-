package o8;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import y9.k0;
import y9.r4;

/* JADX INFO: loaded from: classes2.dex */
public class l extends u8.y implements c, m9.p, f9.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r4 f34089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m9.h f34090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f34091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<p7.d> f34093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34094i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f34093h = new ArrayList();
    }

    public /* synthetic */ l(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // o8.c
    public void a(k0 k0Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        this.f34091f = l8.b.d0(this, k0Var, dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        a aVar;
        j0.i(canvas, "canvas");
        l8.b.w(this, canvas);
        if (this.f34094i || (aVar = this.f34091f) == null) {
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
        this.f34094i = true;
        a aVar = this.f34091f;
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
        this.f34094i = false;
    }

    @Override // m9.p
    public boolean f() {
        return this.f34092g;
    }

    @Override // o8.c
    public k0 getBorder() {
        a aVar = this.f34091f;
        if (aVar == null) {
            return null;
        }
        return aVar.f34007f;
    }

    public int getCurrentItem$div_release() {
        return getViewPager().getCurrentItem();
    }

    public r4 getDiv$div_release() {
        return this.f34089d;
    }

    @Override // o8.c
    public a getDivBorderDrawer() {
        return this.f34091f;
    }

    public m9.h getOnInterceptTouchEventListener() {
        return this.f34090e;
    }

    @Override // f9.b
    public List<p7.d> getSubscriptions() {
        return this.f34093h;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        j0.i(motionEvent, "event");
        m9.h onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        return (onInterceptTouchEventListener == null ? false : onInterceptTouchEventListener.a(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a aVar = this.f34091f;
        if (aVar == null) {
            return;
        }
        aVar.k();
        aVar.j();
    }

    @Override // f9.b, i8.u0
    public void release() {
        g();
        a aVar = this.f34091f;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    public void setCurrentItem$div_release(int i10) {
        getViewPager().e(i10, false);
    }

    public void setDiv$div_release(r4 r4Var) {
        this.f34089d = r4Var;
    }

    public void setOnInterceptTouchEventListener(m9.h hVar) {
        this.f34090e = hVar;
    }

    @Override // m9.p
    public void setTransient(boolean z10) {
        this.f34092g = z10;
        invalidate();
    }
}
