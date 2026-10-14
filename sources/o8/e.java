package o8;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import y9.k0;
import y9.w2;

/* JADX INFO: loaded from: classes2.dex */
public class e extends u8.w implements c, m9.p, f9.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w2 f34046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Uri f34047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f34048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f34049q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<p7.d> f34050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f34051s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f34050r = new ArrayList();
        setCropToPadding(true);
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // o8.c
    public void a(k0 k0Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        this.f34048p = l8.b.d0(this, k0Var, dVar);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        a aVar;
        j0.i(canvas, "canvas");
        if (this.f34051s || (aVar = this.f34048p) == null) {
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
        this.f34051s = true;
        a aVar = this.f34048p;
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
        this.f34051s = false;
    }

    @Override // m9.p
    public boolean f() {
        return this.f34049q;
    }

    @Override // o8.c
    public k0 getBorder() {
        a aVar = this.f34048p;
        if (aVar == null) {
            return null;
        }
        return aVar.f34007f;
    }

    public final w2 getDiv$div_release() {
        return this.f34046n;
    }

    @Override // o8.c
    public a getDivBorderDrawer() {
        return this.f34048p;
    }

    public final Uri getGifUrl$div_release() {
        return this.f34047o;
    }

    @Override // f9.b
    public List<p7.d> getSubscriptions() {
        return this.f34050r;
    }

    @Override // u8.w
    public void l() {
        super.l();
        this.f34047o = null;
    }

    @Override // m9.a, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a aVar = this.f34048p;
        if (aVar == null) {
            return;
        }
        aVar.k();
        aVar.j();
    }

    @Override // f9.b, i8.u0
    public void release() {
        g();
        a aVar = this.f34048p;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    public final void setDiv$div_release(w2 w2Var) {
        this.f34046n = w2Var;
    }

    public final void setGifUrl$div_release(Uri uri) {
        this.f34047o = uri;
    }

    @Override // m9.p
    public void setTransient(boolean z10) {
        this.f34049q = z10;
        invalidate();
    }
}
