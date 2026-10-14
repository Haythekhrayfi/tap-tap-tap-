package o8;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import y9.h8;
import y9.k0;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends FrameLayout implements c, m9.p, f9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h8 f34125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f34126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<p7.d> f34128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34129g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f34128f = new ArrayList();
    }

    public /* synthetic */ s(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R.attr.divImageStyle : i10);
    }

    @Override // o8.c
    public void a(k0 k0Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        this.f34126d = l8.b.d0(this, k0Var, dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        a aVar;
        j0.i(canvas, "canvas");
        if (this.f34129g || (aVar = this.f34126d) == null) {
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
        this.f34129g = true;
        a aVar = this.f34126d;
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
        this.f34129g = false;
    }

    @Override // m9.p
    public boolean f() {
        return this.f34127e;
    }

    @Override // o8.c
    public k0 getBorder() {
        a aVar = this.f34126d;
        if (aVar == null) {
            return null;
        }
        return aVar.f34007f;
    }

    public final h8 getDiv$div_release() {
        return this.f34125c;
    }

    @Override // o8.c
    public a getDivBorderDrawer() {
        return this.f34126d;
    }

    public final a8.f getPlayerView() {
        if (getChildCount() > 1) {
            int i10 = e9.a.f29114a;
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return null;
        }
        if (childAt instanceof a8.f) {
            return (a8.f) childAt;
        }
        int i11 = e9.a.f29114a;
        return null;
    }

    @Override // f9.b
    public List<p7.d> getSubscriptions() {
        return this.f34128f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a aVar = this.f34126d;
        if (aVar == null) {
            return;
        }
        aVar.k();
        aVar.j();
    }

    @Override // f9.b, i8.u0
    public void release() {
        g();
        getPlayerView();
        a aVar = this.f34126d;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    public final void setDiv$div_release(h8 h8Var) {
        this.f34125c = h8Var;
    }

    @Override // m9.p
    public void setTransient(boolean z10) {
        this.f34127e = z10;
        invalidate();
    }
}
