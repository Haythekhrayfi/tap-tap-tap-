package o8;

import android.content.Context;
import android.graphics.Canvas;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import y9.k0;
import y9.z5;

/* JADX INFO: loaded from: classes2.dex */
public class n extends m9.l implements c, m9.p, f9.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z5 f34102u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public uc.l<? super String, jc.w> f34103v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f34104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<p7.d> f34105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f34106y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f34107z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        super(context);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f34105x = new ArrayList();
    }

    @Override // o8.c
    public void a(k0 k0Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        this.f34106y = l8.b.d0(this, k0Var, dVar);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        a aVar;
        j0.i(canvas, "canvas");
        if (this.f34107z || (aVar = this.f34106y) == null) {
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
        this.f34107z = true;
        a aVar = this.f34106y;
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
        this.f34107z = false;
    }

    @Override // m9.p
    public boolean f() {
        return this.f34104w;
    }

    @Override // o8.c
    public k0 getBorder() {
        a aVar = this.f34106y;
        if (aVar == null) {
            return null;
        }
        return aVar.f34007f;
    }

    public z5 getDiv() {
        return this.f34102u;
    }

    @Override // o8.c
    public a getDivBorderDrawer() {
        return this.f34106y;
    }

    @Override // f9.b
    public List<p7.d> getSubscriptions() {
        return this.f34105x;
    }

    public uc.l<String, jc.w> getValueUpdater() {
        return this.f34103v;
    }

    @Override // m9.f, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a aVar = this.f34106y;
        if (aVar == null) {
            return;
        }
        aVar.k();
        aVar.j();
    }

    @Override // f9.b, i8.u0
    public void release() {
        g();
        a aVar = this.f34106y;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    public void setDiv(z5 z5Var) {
        this.f34102u = z5Var;
    }

    @Override // m9.p
    public void setTransient(boolean z10) {
        this.f34104w = z10;
        invalidate();
    }

    public void setValueUpdater(uc.l<? super String, jc.w> lVar) {
        this.f34103v = lVar;
    }
}
