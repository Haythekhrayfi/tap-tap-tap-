package u8;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import y9.k0;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends m9.g implements o8.c, m9.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f36072n;

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
    }

    public /* synthetic */ g(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // o8.c
    public void a(k0 k0Var, v9.d dVar) {
        j0.i(dVar, "resolver");
        KeyEvent.Callback child = getChild();
        o8.c cVar = child instanceof o8.c ? (o8.c) child : null;
        if (cVar == null) {
            return;
        }
        cVar.a(k0Var, dVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(getChildCount() == 0)) {
            throw new IllegalArgumentException("ViewWrapper can host only one child view".toString());
        }
        super.addView(view, 0, layoutParams);
    }

    @Override // m9.e, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams == null || !j0.d(layoutParams, getLayoutParams());
    }

    @Override // m9.p
    public boolean f() {
        return this.f36072n;
    }

    @Override // m9.g, m9.e, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof m9.d) {
            return layoutParams;
        }
        return layoutParams == null ? new m9.d(-2, -2) : super.generateLayoutParams(layoutParams);
    }

    @Override // m9.e, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        u1.a.c(layoutParamsGenerateDefaultLayoutParams, layoutParams);
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @Override // o8.c
    public k0 getBorder() {
        KeyEvent.Callback child = getChild();
        o8.c cVar = child instanceof o8.c ? (o8.c) child : null;
        if (cVar == null) {
            return null;
        }
        return cVar.getBorder();
    }

    public final View getChild() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    @Override // o8.c
    public o8.a getDivBorderDrawer() {
        KeyEvent.Callback child = getChild();
        o8.c cVar = child instanceof o8.c ? (o8.c) child : null;
        if (cVar == null) {
            return null;
        }
        return cVar.getDivBorderDrawer();
    }

    @Override // m9.g, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View child = getChild();
        if (child == null) {
            return;
        }
        child.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // m9.g, android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredWidthAndState;
        int measuredHeightAndState;
        View child = getChild();
        if (child == null) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth();
            int paddingBottom = getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight();
            measuredWidthAndState = ViewGroup.resolveSizeAndState(paddingRight, i10, 0);
            measuredHeightAndState = ViewGroup.resolveSizeAndState(paddingBottom, i11, 0);
        } else {
            child.measure(i10, i11);
            measuredWidthAndState = child.getMeasuredWidthAndState();
            measuredHeightAndState = child.getMeasuredHeightAndState();
        }
        setMeasuredDimension(measuredWidthAndState, measuredHeightAndState);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        View child = getChild();
        if (child == null) {
            super.setLayoutParams(layoutParams);
            return;
        }
        if (layoutParams != null) {
            u1.a.c(layoutParams, child.getLayoutParams());
        }
        super.setLayoutParams(layoutParams);
        child.setLayoutParams(layoutParams);
    }

    @Override // m9.p
    public void setTransient(boolean z10) {
        this.f36072n = z10;
        invalidate();
    }
}
