package o8;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import y9.k0;
import y9.l7;

/* JADX INFO: loaded from: classes2.dex */
public class i extends m9.o implements c, m9.p, f9.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l7 f34072r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u8.a f34073s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h8.b f34074t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f34075u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f34076v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f34077w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<p7.d> f34078x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f34079y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f34078x = new ArrayList();
    }

    public /* synthetic */ i(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R.attr.divTextStyle : i10);
    }

    @Override // o8.c
    public void a(k0 k0Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        this.f34076v = l8.b.d0(this, k0Var, dVar);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        a aVar;
        j0.i(canvas, "canvas");
        if (this.f34079y || (aVar = this.f34076v) == null) {
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
        this.f34079y = true;
        a aVar = this.f34076v;
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
        this.f34079y = false;
    }

    @Override // m9.p
    public boolean f() {
        return this.f34077w;
    }

    public u8.a getAdaptiveMaxLines$div_release() {
        return this.f34073s;
    }

    public long getAnimationStartDelay$div_release() {
        return this.f34075u;
    }

    @Override // o8.c
    public k0 getBorder() {
        a aVar = this.f34076v;
        if (aVar == null) {
            return null;
        }
        return aVar.f34007f;
    }

    public l7 getDiv$div_release() {
        return this.f34072r;
    }

    @Override // o8.c
    public a getDivBorderDrawer() {
        return this.f34076v;
    }

    @Override // f9.b
    public List<p7.d> getSubscriptions() {
        return this.f34078x;
    }

    public h8.b getTextRoundedBgHelper$div_release() {
        return this.f34074t;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        j0.i(canvas, "canvas");
        if ((getText() instanceof Spanned) && getLayout() != null) {
            h8.b textRoundedBgHelper$div_release = getTextRoundedBgHelper$div_release();
            boolean z10 = false;
            if (textRoundedBgHelper$div_release != null && (!textRoundedBgHelper$div_release.f30961c.isEmpty())) {
                z10 = true;
            }
            if (z10) {
                float totalPaddingLeft = getTotalPaddingLeft();
                float totalPaddingTop = getTotalPaddingTop();
                int iSave = canvas.save();
                canvas.translate(totalPaddingLeft, totalPaddingTop);
                try {
                    h8.b textRoundedBgHelper$div_release2 = getTextRoundedBgHelper$div_release();
                    if (textRoundedBgHelper$div_release2 != null) {
                        Spanned spanned = (Spanned) getText();
                        Layout layout = getLayout();
                        j0.h(layout, "layout");
                        textRoundedBgHelper$div_release2.a(canvas, spanned, layout);
                    }
                    canvas.restoreToCount(iSave);
                } catch (Throwable th) {
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // m9.f, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a aVar = this.f34076v;
        if (aVar == null) {
            return;
        }
        aVar.k();
        aVar.j();
    }

    @Override // f9.b, i8.u0
    public void release() {
        g();
        a aVar = this.f34076v;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    @Override // android.view.View
    public void requestLayout() {
        super.requestLayout();
    }

    public void setAdaptiveMaxLines$div_release(u8.a aVar) {
        this.f34073s = aVar;
    }

    public void setAnimationStartDelay$div_release(long j10) {
        this.f34075u = j10;
    }

    public void setDiv$div_release(l7 l7Var) {
        this.f34072r = l7Var;
    }

    public void setTextRoundedBgHelper$div_release(h8.b bVar) {
        this.f34074t = bVar;
    }

    @Override // m9.p
    public void setTransient(boolean z10) {
        this.f34077w = z10;
        invalidate();
    }
}
