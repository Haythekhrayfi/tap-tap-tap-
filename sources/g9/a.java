package g9;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0271a f30053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f30054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f30055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f30056d;

    /* JADX INFO: renamed from: g9.a$a, reason: collision with other inner class name */
    public static final class C0271a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f30057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f30058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f30059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Float f30060d;

        public C0271a(float f10, int i10, Integer num, Float f11) {
            this.f30057a = f10;
            this.f30058b = i10;
            this.f30059c = num;
            this.f30060d = f11;
        }

        public /* synthetic */ C0271a(float f10, int i10, Integer num, Float f11, int i11, g gVar) {
            this(f10, i10, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0271a)) {
                return false;
            }
            C0271a c0271a = (C0271a) obj;
            return j0.d(Float.valueOf(this.f30057a), Float.valueOf(c0271a.f30057a)) && this.f30058b == c0271a.f30058b && j0.d(this.f30059c, c0271a.f30059c) && j0.d(this.f30060d, c0271a.f30060d);
        }

        public int hashCode() {
            int iA = r6.a.a(this.f30058b, Float.hashCode(this.f30057a) * 31, 31);
            Integer num = this.f30059c;
            int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
            Float f10 = this.f30060d;
            return iHashCode + (f10 != null ? f10.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Params(radius=");
            sbA.append(this.f30057a);
            sbA.append(", color=");
            sbA.append(this.f30058b);
            sbA.append(", strokeColor=");
            sbA.append(this.f30059c);
            sbA.append(", strokeWidth=");
            sbA.append(this.f30060d);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public a(C0271a c0271a) {
        Paint paint;
        j0.i(c0271a, "params");
        this.f30053a = c0271a;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(c0271a.f30058b);
        this.f30054b = paint2;
        if (c0271a.f30059c == null || c0271a.f30060d == null) {
            paint = null;
        } else {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(c0271a.f30059c.intValue());
            paint.setStrokeWidth(c0271a.f30060d.floatValue());
        }
        this.f30055c = paint;
        float f10 = c0271a.f30057a * 2;
        RectF rectF = new RectF(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f10, f10);
        this.f30056d = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        j0.i(canvas, "canvas");
        this.f30054b.setColor(this.f30053a.f30058b);
        this.f30056d.set(getBounds());
        canvas.drawCircle(this.f30056d.centerX(), this.f30056d.centerY(), this.f30053a.f30057a, this.f30054b);
        if (this.f30055c != null) {
            canvas.drawCircle(this.f30056d.centerX(), this.f30056d.centerY(), this.f30053a.f30057a, this.f30055c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return ((int) this.f30053a.f30057a) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return ((int) this.f30053a.f30057a) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        int i11 = e9.a.f29114a;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        int i10 = e9.a.f29114a;
    }
}
