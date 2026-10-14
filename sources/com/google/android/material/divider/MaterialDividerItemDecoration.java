package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.v4.media.j;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.drawable.a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialDividerItemDecoration extends RecyclerView.n {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int color;
    private Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final Rect tempRect;
    private int thickness;

    public MaterialDividerItemDecoration(Context context, int i10) {
        this(context, null, i10);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, R.attr.materialDividerStyle, i10);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.tempRect = new Rect();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.MaterialDivider, i10, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.lastItemDecorated = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialDivider_lastItemDecorated, true);
        typedArrayObtainStyledAttributes.recycle();
        this.dividerDrawable = new ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i11);
    }

    private void drawForHorizontalOrientation(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i10 = paddingTop + this.insetStart;
        int i11 = height - this.insetEnd;
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
            int iRound = Math.round(childAt.getTranslationX()) + this.tempRect.right;
            this.dividerDrawable.setBounds((iRound - this.dividerDrawable.getIntrinsicWidth()) - this.thickness, i10, iRound, i11);
            this.dividerDrawable.draw(canvas);
        }
        canvas.restore();
    }

    private void drawForVerticalOrientation(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        boolean z10 = e0.e.d(recyclerView) == 1;
        int i10 = paddingLeft + (z10 ? this.insetEnd : this.insetStart);
        int i11 = width - (z10 ? this.insetStart : this.insetEnd);
        int childCount = recyclerView.getChildCount();
        if (!this.lastItemDecorated) {
            childCount--;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.tempRect);
            int iRound = Math.round(childAt.getTranslationY()) + this.tempRect.bottom;
            this.dividerDrawable.setBounds(i10, (iRound - this.dividerDrawable.getIntrinsicHeight()) - this.thickness, i11, iRound);
            this.dividerDrawable.draw(canvas);
        }
        canvas.restore();
    }

    public int getDividerColor() {
        return this.color;
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.set(0, 0, 0, 0);
        if (this.orientation == 1) {
            rect.bottom = this.dividerDrawable.getIntrinsicHeight() + this.thickness;
        } else {
            rect.right = this.dividerDrawable.getIntrinsicWidth() + this.thickness;
        }
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, recyclerView);
        } else {
            drawForHorizontalOrientation(canvas, recyclerView);
        }
    }

    public void setDividerColor(int i10) {
        this.color = i10;
        Drawable drawable = this.dividerDrawable;
        this.dividerDrawable = drawable;
        a.b.g(drawable, i10);
    }

    public void setDividerColorResource(Context context, int i10) {
        Object obj = e0.a.f28964a;
        setDividerColor(e0.a.d.a(context, i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.insetEnd = i10;
    }

    public void setDividerInsetEndResource(Context context, int i10) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.insetStart = i10;
    }

    public void setDividerInsetStartResource(Context context, int i10) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        this.thickness = i10;
    }

    public void setDividerThicknessResource(Context context, int i10) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i10));
    }

    public void setLastItemDecorated(boolean z10) {
        this.lastItemDecorated = z10;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(j.a("Invalid orientation: ", i10, ". It should be either HORIZONTAL or VERTICAL"));
        }
        this.orientation = i10;
    }
}
