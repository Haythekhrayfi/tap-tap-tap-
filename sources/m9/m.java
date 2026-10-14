package m9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public class m extends View {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f33379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f33380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33384h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Paint paint = new Paint();
        paint.setColor(0);
        this.f33379c = paint;
        this.f33380d = new Rect();
        this.f33382f = true;
        this.f33384h = 17;
    }

    public /* synthetic */ m(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ void getDividerGravity$annotations() {
    }

    public final int b(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i10 : size;
        }
        return Math.min(i10, size);
    }

    public final int getDividerColor() {
        return this.f33379c.getColor();
    }

    public final int getDividerGravity() {
        return this.f33384h;
    }

    public final int getDividerThickness() {
        return this.f33383g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        j0.i(canvas, "canvas");
        super.onDraw(canvas);
        if (Color.alpha(this.f33379c.getColor()) > 0) {
            if (this.f33381e) {
                int paddingTop = this.f33382f ? getPaddingTop() : getPaddingLeft();
                int paddingBottom = this.f33382f ? getPaddingBottom() : getPaddingRight();
                int height = this.f33382f ? getHeight() : getWidth();
                int i10 = (height - paddingTop) - paddingBottom;
                int i11 = this.f33384h;
                if (i11 == 17) {
                    paddingTop = androidx.appcompat.widget.a.a(i10, this.f33383g, 2, paddingTop);
                } else if (i11 != 8388611) {
                    paddingTop = i11 != 8388613 ? 0 : (height - paddingBottom) - this.f33383g;
                }
                if (this.f33382f) {
                    Rect rect = this.f33380d;
                    rect.top = paddingTop;
                    rect.bottom = Math.min(i10, this.f33383g) + paddingTop;
                    this.f33380d.left = getPaddingLeft();
                    this.f33380d.right = getWidth() - getPaddingRight();
                } else {
                    Rect rect2 = this.f33380d;
                    rect2.left = paddingTop;
                    rect2.right = Math.min(i10, this.f33383g) + paddingTop;
                    this.f33380d.top = getPaddingTop();
                    this.f33380d.bottom = getHeight() - getPaddingBottom();
                }
                this.f33381e = false;
            }
            canvas.drawRect(this.f33380d, this.f33379c);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f33382f) {
            paddingBottom += this.f33383g;
        } else {
            paddingRight += this.f33383g;
        }
        setMeasuredDimension(b(Math.max(paddingRight, getSuggestedMinimumWidth()), i10), b(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f33381e = true;
    }

    public final void setDividerColor(int i10) {
        if (this.f33379c.getColor() != i10) {
            this.f33379c.setColor(i10);
            invalidate();
        }
    }

    public final void setDividerColorResource(int i10) {
        Context context = getContext();
        Object obj = e0.a.f28964a;
        setDividerColor(e0.a.d.a(context, i10));
    }

    public final void setDividerGravity(int i10) {
        if (this.f33384h != i10) {
            this.f33384h = i10;
            this.f33381e = true;
            invalidate();
        }
    }

    public final void setDividerHeightResource(int i10) {
        setDividerThickness(getResources().getDimensionPixelSize(i10));
    }

    public final void setDividerThickness(int i10) {
        if (this.f33383g != i10) {
            this.f33383g = i10;
            this.f33381e = true;
            requestLayout();
        }
    }

    public final void setHorizontal(boolean z10) {
        if (this.f33382f != z10) {
            this.f33382f = z10;
            this.f33381e = true;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        this.f33381e = true;
    }
}
