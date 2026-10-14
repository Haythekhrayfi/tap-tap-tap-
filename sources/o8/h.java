package o8;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextWatcher;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import y9.k0;
import y9.s3;

/* JADX INFO: loaded from: classes2.dex */
public class h extends m9.n implements c, m9.p, f9.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s3 f34065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o8.a f34066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<p7.d> f34068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextWatcher f34070l;

    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uc.l f34071c;

        public a(uc.l lVar) {
            this.f34071c = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f34071c.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f34068j = new ArrayList();
    }

    @Override // o8.c
    public void a(k0 k0Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        this.f34066h = l8.b.d0(this, k0Var, dVar);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        j0.i(canvas, "canvas");
        if (!this.f34069k) {
            o8.a aVar = this.f34066h;
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            if (aVar != null) {
                float f10 = scrollX;
                float f11 = scrollY;
                int iSave = canvas.save();
                try {
                    canvas.translate(f10, f11);
                    aVar.c(canvas);
                    canvas.translate(-f10, -f11);
                    super.dispatchDraw(canvas);
                    canvas.translate(f10, f11);
                    aVar.e(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        j0.i(canvas, "canvas");
        this.f34069k = true;
        o8.a aVar = this.f34066h;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        if (aVar == null) {
            super.draw(canvas);
        } else {
            float f10 = scrollX;
            float f11 = scrollY;
            int iSave = canvas.save();
            try {
                canvas.translate(f10, f11);
                aVar.c(canvas);
                canvas.translate(-f10, -f11);
                super.draw(canvas);
                canvas.translate(f10, f11);
                aVar.e(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        this.f34069k = false;
    }

    @Override // m9.p
    public boolean f() {
        return this.f34067i;
    }

    @Override // o8.c
    public k0 getBorder() {
        o8.a aVar = this.f34066h;
        if (aVar == null) {
            return null;
        }
        return aVar.f34007f;
    }

    public s3 getDiv$div_release() {
        return this.f34065g;
    }

    @Override // o8.c
    public o8.a getDivBorderDrawer() {
        return this.f34066h;
    }

    @Override // f9.b
    public List<p7.d> getSubscriptions() {
        return this.f34068j;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        o8.a aVar = this.f34066h;
        if (aVar == null) {
            return;
        }
        aVar.k();
        aVar.j();
    }

    @Override // f9.b, i8.u0
    public void release() {
        g();
        o8.a aVar = this.f34066h;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    public void setBoundVariableChangeAction(uc.l<? super Editable, jc.w> lVar) {
        j0.i(lVar, "action");
        a aVar = new a(lVar);
        addTextChangedListener(aVar);
        this.f34070l = aVar;
    }

    public void setDiv$div_release(s3 s3Var) {
        this.f34065g = s3Var;
    }

    @Override // m9.p
    public void setTransient(boolean z10) {
        this.f34067i = z10;
        invalidate();
    }
}
