package o8;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import y9.k0;
import y9.k3;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends n9.g implements c, m9.p, f9.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k3 f34084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f34085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<p7.d> f34087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34088k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f34087j = new ArrayList();
    }

    public /* synthetic */ k(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // o8.c
    public void a(k0 k0Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        this.f34085h = l8.b.d0(this, k0Var, dVar);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        a aVar;
        j0.i(canvas, "canvas");
        if (this.f34088k || (aVar = this.f34085h) == null) {
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
        this.f34088k = true;
        a aVar = this.f34085h;
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
        this.f34088k = false;
    }

    @Override // m9.p
    public boolean f() {
        return this.f34086i;
    }

    @Override // o8.c
    public k0 getBorder() {
        a aVar = this.f34085h;
        if (aVar == null) {
            return null;
        }
        return aVar.f34007f;
    }

    public final k3 getDiv$div_release() {
        return this.f34084g;
    }

    @Override // o8.c
    public a getDivBorderDrawer() {
        return this.f34085h;
    }

    @Override // f9.b
    public List<p7.d> getSubscriptions() {
        return this.f34087j;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a aVar = this.f34085h;
        if (aVar == null) {
            return;
        }
        aVar.k();
        aVar.j();
    }

    @Override // f9.b, i8.u0
    public void release() {
        g();
        a aVar = this.f34085h;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    public final void setDiv$div_release(k3 k3Var) {
        this.f34084g = k3Var;
    }

    @Override // m9.p
    public void setTransient(boolean z10) {
        this.f34086i = z10;
        invalidate();
    }
}
