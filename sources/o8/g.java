package o8;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import y9.d3;
import y9.k0;

/* JADX INFO: loaded from: classes2.dex */
public class g extends u8.w implements c, m9.p, f9.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d3 f34058n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Uri f34059o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f34060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f34061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f34062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<p7.d> f34063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f34064t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f34063s = new ArrayList();
        super.setAdjustViewBounds(true);
        super.setCropToPadding(true);
    }

    public /* synthetic */ g(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R.attr.divImageStyle : i10);
    }

    @Override // o8.c
    public void a(k0 k0Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        this.f34061q = l8.b.d0(this, k0Var, dVar);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        a aVar;
        j0.i(canvas, "canvas");
        if (this.f34064t || (aVar = this.f34061q) == null) {
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
        this.f34064t = true;
        a aVar = this.f34061q;
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
        this.f34064t = false;
    }

    @Override // m9.p
    public boolean f() {
        return this.f34062r;
    }

    @Override // o8.c
    public k0 getBorder() {
        a aVar = this.f34061q;
        if (aVar == null) {
            return null;
        }
        return aVar.f34007f;
    }

    public final d3 getDiv$div_release() {
        return this.f34058n;
    }

    @Override // o8.c
    public a getDivBorderDrawer() {
        return this.f34061q;
    }

    public final Uri getImageUrl$div_release() {
        return this.f34059o;
    }

    public final String getPreview$div_release() {
        return this.f34060p;
    }

    @Override // f9.b
    public List<p7.d> getSubscriptions() {
        return this.f34063s;
    }

    @Override // m9.a
    public boolean h(int i10) {
        return false;
    }

    @Override // m9.a, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a aVar = this.f34061q;
        if (aVar == null) {
            return;
        }
        aVar.k();
        aVar.j();
    }

    @Override // f9.b, i8.u0
    public void release() {
        g();
        a aVar = this.f34061q;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z10) {
    }

    @Override // android.widget.ImageView
    public void setCropToPadding(boolean z10) {
    }

    public final void setDiv$div_release(d3 d3Var) {
        this.f34058n = d3Var;
    }

    public final void setImageUrl$div_release(Uri uri) {
        this.f34059o = uri;
    }

    public final void setPreview$div_release(String str) {
        this.f34060p = str;
    }

    @Override // m9.p
    public void setTransient(boolean z10) {
        this.f34062r = z10;
        invalidate();
    }
}
