package t9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f35865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35866d;

    public interface a {
        void a(int i10, float f10);

        boolean b(int i10, float f10);

        int c(int i10, int i11);

        void d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    public /* synthetic */ u(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final int getCollapsiblePaddingBottom() {
        return this.f35866d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        a aVar = this.f35865c;
        if (aVar != null) {
            j0.f(aVar);
            i11 = View.MeasureSpec.makeMeasureSpec(aVar.c(i10, i11), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public final void setCollapsiblePaddingBottom(int i10) {
        if (this.f35866d != i10) {
            this.f35866d = i10;
        }
    }

    public final void setHeightCalculator(a aVar) {
        this.f35865c = aVar;
    }
}
