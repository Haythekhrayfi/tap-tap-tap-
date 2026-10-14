package g9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends Drawable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bitmap f30109d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30112g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f30115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f30116k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f30106a = c.NO_SCALE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f30107b = a.LEFT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f30108c = b.TOP;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f30110e = new Paint(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Matrix f30111f = new Matrix();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f30113h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f30114i = 1.0f;

    public enum a {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum b {
        TOP,
        CENTER,
        BOTTOM
    }

    public enum c {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f30118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f30119c;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.FILL.ordinal()] = 1;
            iArr[c.FIT.ordinal()] = 2;
            iArr[c.NO_SCALE.ordinal()] = 3;
            f30117a = iArr;
            int[] iArr2 = new int[a.values().length];
            iArr2[a.CENTER.ordinal()] = 1;
            iArr2[a.RIGHT.ordinal()] = 2;
            f30118b = iArr2;
            int[] iArr3 = new int[b.values().length];
            iArr3[b.CENTER.ordinal()] = 1;
            iArr3[b.BOTTOM.ordinal()] = 2;
            f30119c = iArr3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float fMax;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        int i11;
        float f14;
        j0.i(canvas, "canvas");
        canvas.save();
        Bitmap bitmap = this.f30109d;
        int width = bitmap == null ? 0 : bitmap.getWidth();
        Bitmap bitmap2 = this.f30109d;
        int height = bitmap2 == null ? 0 : bitmap2.getHeight();
        if (height <= 0 || width <= 0) {
            Bitmap bitmap3 = this.f30109d;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, this.f30111f, this.f30110e);
            }
            canvas.restore();
            return;
        }
        if (this.f30112g) {
            float fWidth = getBounds().width();
            float fHeight = getBounds().height();
            float f15 = width;
            this.f30113h = fWidth / f15;
            float f16 = height;
            this.f30114i = fHeight / f16;
            int i12 = d.f30117a[this.f30106a.ordinal()];
            if (i12 == 1) {
                fMax = Math.max(this.f30113h, this.f30114i);
            } else if (i12 != 2) {
                if (i12 == 3) {
                    fMax = 1.0f;
                }
                f10 = f15 * this.f30113h;
                f11 = f16 * this.f30114i;
                i10 = d.f30118b[this.f30107b.ordinal()];
                float f17 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                if (i10 != 1) {
                    if (i10 != 2) {
                        f13 = 0.0f;
                    } else {
                        f12 = fWidth - f10;
                    }
                    this.f30115j = f13;
                    i11 = d.f30119c[this.f30108c.ordinal()];
                    if (i11 != 1) {
                        if (i11 == 2) {
                            f14 = fHeight - f11;
                        }
                        this.f30116k = f17;
                        this.f30112g = false;
                    } else {
                        f14 = (fHeight - f11) / 2;
                    }
                    f17 = f14 / this.f30114i;
                    this.f30116k = f17;
                    this.f30112g = false;
                } else {
                    f12 = (fWidth - f10) / 2;
                }
                f13 = f12 / this.f30113h;
                this.f30115j = f13;
                i11 = d.f30119c[this.f30108c.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        f14 = fHeight - f11;
                    }
                    this.f30116k = f17;
                    this.f30112g = false;
                } else {
                    f14 = (fHeight - f11) / 2;
                }
                f17 = f14 / this.f30114i;
                this.f30116k = f17;
                this.f30112g = false;
            } else {
                fMax = Math.min(this.f30113h, this.f30114i);
            }
            this.f30113h = fMax;
            this.f30114i = fMax;
            f10 = f15 * this.f30113h;
            f11 = f16 * this.f30114i;
            i10 = d.f30118b[this.f30107b.ordinal()];
            float f18 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            if (i10 != 1) {
                if (i10 != 2) {
                    f13 = 0.0f;
                } else {
                    f12 = fWidth - f10;
                }
                this.f30115j = f13;
                i11 = d.f30119c[this.f30108c.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        f14 = fHeight - f11;
                    }
                    this.f30116k = f18;
                    this.f30112g = false;
                } else {
                    f14 = (fHeight - f11) / 2;
                }
                f18 = f14 / this.f30114i;
                this.f30116k = f18;
                this.f30112g = false;
            } else {
                f12 = (fWidth - f10) / 2;
            }
            f13 = f12 / this.f30113h;
            this.f30115j = f13;
            i11 = d.f30119c[this.f30108c.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    f14 = fHeight - f11;
                }
                this.f30116k = f18;
                this.f30112g = false;
            } else {
                f14 = (fHeight - f11) / 2;
            }
            f18 = f14 / this.f30114i;
            this.f30116k = f18;
            this.f30112g = false;
        }
        canvas.scale(this.f30113h, this.f30114i);
        canvas.translate(this.f30115j, this.f30116k);
        Bitmap bitmap4 = this.f30109d;
        if (bitmap4 != null) {
            canvas.drawBitmap(bitmap4, this.f30111f, this.f30110e);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f30110e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        j0.i(rect, "bounds");
        super.onBoundsChange(rect);
        this.f30112g = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f30110e.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
