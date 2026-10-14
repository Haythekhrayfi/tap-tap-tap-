package o8;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import y9.d6;
import y9.k0;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends m9.m implements c, m9.p, f9.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d6 f34108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f34109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<p7.d> f34111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f34112m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f34111l = new ArrayList();
    }

    public /* synthetic */ o(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // o8.c
    public void a(k0 k0Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        this.f34109j = l8.b.d0(this, k0Var, dVar);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        a aVar;
        j0.i(canvas, "canvas");
        if (this.f34112m || (aVar = this.f34109j) == null) {
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
        this.f34112m = true;
        a aVar = this.f34109j;
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
        this.f34112m = false;
    }

    @Override // m9.p
    public boolean f() {
        return this.f34110k;
    }

    @Override // o8.c
    public k0 getBorder() {
        a aVar = this.f34109j;
        if (aVar == null) {
            return null;
        }
        return aVar.f34007f;
    }

    public final d6 getDiv$div_release() {
        return this.f34108i;
    }

    @Override // o8.c
    public a getDivBorderDrawer() {
        return this.f34109j;
    }

    @Override // f9.b
    public List<p7.d> getSubscriptions() {
        return this.f34111l;
    }

    @Override // m9.m, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a aVar = this.f34109j;
        if (aVar == null) {
            return;
        }
        aVar.k();
        aVar.j();
    }

    @Override // f9.b, i8.u0
    public void release() {
        g();
        a aVar = this.f34109j;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    public final void setDiv$div_release(d6 d6Var) {
        this.f34108i = d6Var;
    }

    @Override // m9.p
    public void setTransient(boolean z10) {
        this.f34110k = z10;
        invalidate();
    }
}
