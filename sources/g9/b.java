package g9;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f30061e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f30063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f30064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f30065d;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }

        public final LinearGradient a(float f10, int[] iArr, int i10, int i11) {
            j0.i(iArr, "colors");
            float f11 = i10 / 2;
            double d10 = (float) ((((double) f10) * 3.141592653589793d) / ((double) 180.0f));
            float fCos = ((float) Math.cos(d10)) * f11;
            float f12 = i11 / 2;
            float fSin = ((float) Math.sin(d10)) * f12;
            return new LinearGradient(f11 - fCos, f12 + fSin, f11 + fCos, f12 - fSin, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    public b(float f10, int[] iArr) {
        j0.i(iArr, "colors");
        this.f30062a = f10;
        this.f30063b = iArr;
        this.f30064c = new Paint();
        this.f30065d = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        j0.i(canvas, "canvas");
        canvas.drawRect(this.f30065d, this.f30064c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f30064c.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        j0.i(rect, "bounds");
        super.onBoundsChange(rect);
        this.f30064c.setShader(f30061e.a(this.f30062a, this.f30063b, rect.width(), rect.height()));
        this.f30065d.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f30064c.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
