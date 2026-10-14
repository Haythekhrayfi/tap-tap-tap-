package o8;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import y9.a3;
import y9.k0;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends u8.h implements c, m9.p, f9.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a3 f34052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y f34053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f34054j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34055k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<p7.d> f34056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f34057m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f34056l = new ArrayList();
    }

    public /* synthetic */ f(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // o8.c
    public void a(k0 k0Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        this.f34054j = l8.b.d0(this, k0Var, dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        a aVar;
        j0.i(canvas, "canvas");
        l8.b.w(this, canvas);
        if (this.f34057m || (aVar = this.f34054j) == null) {
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
        this.f34057m = true;
        a aVar = this.f34054j;
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
        this.f34057m = false;
    }

    @Override // m9.p
    public boolean f() {
        return this.f34055k;
    }

    @Override // o8.c
    public k0 getBorder() {
        a aVar = this.f34054j;
        if (aVar == null) {
            return null;
        }
        return aVar.f34007f;
    }

    public final a3 getDiv$div_release() {
        return this.f34052h;
    }

    @Override // o8.c
    public a getDivBorderDrawer() {
        return this.f34054j;
    }

    public final y getReleaseViewVisitor$div_release() {
        return this.f34053i;
    }

    @Override // f9.b
    public List<p7.d> getSubscriptions() {
        return this.f34056l;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a aVar = this.f34054j;
        if (aVar == null) {
            return;
        }
        aVar.k();
        aVar.j();
    }

    @Override // u8.h, android.view.ViewGroup
    public void onViewRemoved(View view) {
        j0.i(view, "child");
        super.onViewRemoved(view);
        y yVar = this.f34053i;
        if (yVar == null) {
            return;
        }
        u1.a.u(yVar, view);
    }

    @Override // f9.b, i8.u0
    public void release() {
        g();
        a aVar = this.f34054j;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    public final void setDiv$div_release(a3 a3Var) {
        this.f34052h = a3Var;
    }

    public final void setReleaseViewVisitor$div_release(y yVar) {
        this.f34053i = yVar;
    }

    @Override // m9.p
    public void setTransient(boolean z10) {
        this.f34055k = z10;
        invalidate();
    }
}
