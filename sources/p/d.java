package p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f34323a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f34325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f34326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f34327e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f34330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f34331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f34332j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34328f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34329g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f34333k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f34324b = new Paint(5);

    public d(ColorStateList colorStateList, float f10) {
        this.f34323a = f10;
        b(colorStateList);
        this.f34325c = new RectF();
        this.f34326d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f34330h = colorStateList;
        this.f34324b.setColor(colorStateList.getColorForState(getState(), this.f34330h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f34325c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f34326d.set(rect);
        if (this.f34328f) {
            this.f34326d.inset((int) Math.ceil(e.a(this.f34327e, this.f34323a, this.f34329g)), (int) Math.ceil(e.b(this.f34327e, this.f34323a, this.f34329g)));
            this.f34325c.set(this.f34326d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f34324b;
        if (this.f34331i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f34331i);
            z10 = true;
        }
        RectF rectF = this.f34325c;
        float f10 = this.f34323a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f34326d, this.f34323a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f34332j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f34330h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f34330h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f34324b.getColor();
        if (z10) {
            this.f34324b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f34332j;
        if (colorStateList2 == null || (mode = this.f34333k) == null) {
            return z10;
        }
        this.f34331i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f34324b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f34324b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f34332j = colorStateList;
        this.f34331i = a(colorStateList, this.f34333k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f34333k = mode;
        this.f34331i = a(this.f34332j, mode);
        invalidateSelf();
    }
}
