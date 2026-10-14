package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class w extends y {
    public w(RecyclerView.o oVar) {
        super(oVar, null);
    }

    @Override // androidx.recyclerview.widget.y
    public int b(View view) {
        return this.f2794a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int c(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return this.f2794a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int d(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return this.f2794a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int e(View view) {
        return this.f2794a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int f() {
        return this.f2794a.getWidth();
    }

    @Override // androidx.recyclerview.widget.y
    public int g() {
        return this.f2794a.getWidth() - this.f2794a.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.y
    public int h() {
        return this.f2794a.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.y
    public int i() {
        return this.f2794a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.y
    public int j() {
        return this.f2794a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.y
    public int k() {
        return this.f2794a.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.y
    public int l() {
        return (this.f2794a.getWidth() - this.f2794a.getPaddingLeft()) - this.f2794a.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.y
    public int n(View view) {
        this.f2794a.getTransformedBoundingBox(view, true, this.f2796c);
        return this.f2796c.right;
    }

    @Override // androidx.recyclerview.widget.y
    public int o(View view) {
        this.f2794a.getTransformedBoundingBox(view, true, this.f2796c);
        return this.f2796c.left;
    }

    @Override // androidx.recyclerview.widget.y
    public void p(int i10) {
        this.f2794a.offsetChildrenHorizontal(i10);
    }
}
