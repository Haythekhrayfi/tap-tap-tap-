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
public final class e extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f30096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f30097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f30098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f30099d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f30100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f30101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f30102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f30103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f30104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Float f30105f;

        public a(float f10, float f11, int i10, float f12, Integer num, Float f13) {
            this.f30100a = f10;
            this.f30101b = f11;
            this.f30102c = i10;
            this.f30103d = f12;
            this.f30104e = num;
            this.f30105f = f13;
        }

        public /* synthetic */ a(float f10, float f11, int i10, float f12, Integer num, Float f13, int i11, g gVar) {
            this(f10, f11, i10, f12, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : f13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return j0.d(Float.valueOf(this.f30100a), Float.valueOf(aVar.f30100a)) && j0.d(Float.valueOf(this.f30101b), Float.valueOf(aVar.f30101b)) && this.f30102c == aVar.f30102c && j0.d(Float.valueOf(this.f30103d), Float.valueOf(aVar.f30103d)) && j0.d(this.f30104e, aVar.f30104e) && j0.d(this.f30105f, aVar.f30105f);
        }

        public int hashCode() {
            int iHashCode = (Float.hashCode(this.f30103d) + r6.a.a(this.f30102c, (Float.hashCode(this.f30101b) + (Float.hashCode(this.f30100a) * 31)) * 31, 31)) * 31;
            Integer num = this.f30104e;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Float f10 = this.f30105f;
            return iHashCode2 + (f10 != null ? f10.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Params(width=");
            sbA.append(this.f30100a);
            sbA.append(", height=");
            sbA.append(this.f30101b);
            sbA.append(", color=");
            sbA.append(this.f30102c);
            sbA.append(", radius=");
            sbA.append(this.f30103d);
            sbA.append(", strokeColor=");
            sbA.append(this.f30104e);
            sbA.append(", strokeWidth=");
            sbA.append(this.f30105f);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public e(a aVar) {
        Paint paint;
        j0.i(aVar, "params");
        this.f30096a = aVar;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(aVar.f30102c);
        this.f30097b = paint2;
        if (aVar.f30104e == null || aVar.f30105f == null) {
            paint = null;
        } else {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(aVar.f30104e.intValue());
            paint.setStrokeWidth(aVar.f30105f.floatValue());
        }
        this.f30098c = paint;
        RectF rectF = new RectF(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, aVar.f30100a, aVar.f30101b);
        this.f30099d = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        j0.i(canvas, "canvas");
        this.f30097b.setColor(this.f30096a.f30102c);
        this.f30099d.set(getBounds());
        RectF rectF = this.f30099d;
        float f10 = this.f30096a.f30103d;
        canvas.drawRoundRect(rectF, f10, f10, this.f30097b);
        Paint paint = this.f30098c;
        if (paint != null) {
            RectF rectF2 = this.f30099d;
            float f11 = this.f30096a.f30103d;
            canvas.drawRoundRect(rectF2, f11, f11, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f30096a.f30101b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.f30096a.f30100a;
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
