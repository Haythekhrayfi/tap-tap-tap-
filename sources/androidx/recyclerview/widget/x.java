package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class x extends y {
    public x(RecyclerView.o oVar) {
        super(oVar, null);
    }

    @Override // androidx.recyclerview.widget.y
    public int b(View view) {
        return this.f2794a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int c(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return this.f2794a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int d(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return this.f2794a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int e(View view) {
        return this.f2794a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int f() {
        return this.f2794a.getHeight();
    }

    @Override // androidx.recyclerview.widget.y
    public int g() {
        return this.f2794a.getHeight() - this.f2794a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.y
    public int h() {
        return this.f2794a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.y
    public int i() {
        return this.f2794a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.y
    public int j() {
        return this.f2794a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.y
    public int k() {
        return this.f2794a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.y
    public int l() {
        return (this.f2794a.getHeight() - this.f2794a.getPaddingTop()) - this.f2794a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.y
    public int n(View view) {
        this.f2794a.getTransformedBoundingBox(view, true, this.f2796c);
        return this.f2796c.bottom;
    }

    @Override // androidx.recyclerview.widget.y
    public int o(View view) {
        this.f2794a.getTransformedBoundingBox(view, true, this.f2796c);
        return this.f2796c.top;
    }

    @Override // androidx.recyclerview.widget.y
    public void p(int i10) {
        this.f2794a.offsetChildrenVertical(i10);
    }
}
