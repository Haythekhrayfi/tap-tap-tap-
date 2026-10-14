package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import c1.d;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Objects;
import w.e;

/* JADX INFO: loaded from: classes.dex */
public class c extends Drawable implements Animatable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Interpolator f2897h = new LinearInterpolator();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Interpolator f2898i = new c1.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f2899j = {-16777216};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f2900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Animator f2902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2904g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f2905a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f2906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f2907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Paint f2908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f2910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2911g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f2912h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f2913i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2914j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f2915k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f2916l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f2917m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f2918n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Path f2919o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f2920p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f2921q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f2922r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f2923s;

        public a() {
            Paint paint = new Paint();
            this.f2906b = paint;
            Paint paint2 = new Paint();
            this.f2907c = paint2;
            Paint paint3 = new Paint();
            this.f2908d = paint3;
            this.f2909e = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f2910f = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f2911g = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f2912h = 5.0f;
            this.f2920p = 1.0f;
            this.f2922r = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void a(int i10) {
            this.f2914j = i10;
            this.f2923s = this.f2913i[i10];
        }
    }

    public c(Context context) {
        Objects.requireNonNull(context);
        context.getResources();
        a aVar = new a();
        this.f2900c = aVar;
        aVar.f2913i = f2899j;
        aVar.a(0);
        b(2.5f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new androidx.swiperefreshlayout.widget.a(this, aVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f2897h);
        valueAnimatorOfFloat.addListener(new b(this, aVar));
        this.f2902e = valueAnimatorOfFloat;
    }

    public void a(float f10, a aVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f2904g) {
            c(f10, aVar);
            float fFloor = (float) (Math.floor(aVar.f2917m / 0.8f) + 1.0d);
            float f11 = aVar.f2915k;
            float f12 = aVar.f2916l;
            aVar.f2909e = (((f12 - 0.01f) - f11) * f10) + f11;
            aVar.f2910f = f12;
            float f13 = aVar.f2917m;
            aVar.f2911g = e.a(fFloor, f13, f10, f13);
            return;
        }
        if (f10 != 1.0f || z10) {
            float f14 = aVar.f2917m;
            if (f10 < 0.5f) {
                interpolation = aVar.f2915k;
                interpolation2 = (((d) f2898i).getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f15 = aVar.f2915k + 0.79f;
                interpolation = f15 - (((1.0f - ((d) f2898i).getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f15;
            }
            float f16 = (0.20999998f * f10) + f14;
            float f17 = (f10 + this.f2903f) * 216.0f;
            aVar.f2909e = interpolation;
            aVar.f2910f = interpolation2;
            aVar.f2911g = f16;
            this.f2901d = f17;
        }
    }

    public void b(float f10) {
        a aVar = this.f2900c;
        aVar.f2912h = f10;
        aVar.f2906b.setStrokeWidth(f10);
        invalidateSelf();
    }

    public void c(float f10, a aVar) {
        int i10;
        if (f10 > 0.75f) {
            float f11 = (f10 - 0.75f) / 0.25f;
            int[] iArr = aVar.f2913i;
            int i11 = aVar.f2914j;
            int i12 = iArr[i11];
            int i13 = iArr[(i11 + 1) % iArr.length];
            int i14 = (i12 >> 24) & 255;
            int i15 = (i12 >> 16) & 255;
            int i16 = (i12 >> 8) & 255;
            int i17 = i12 & 255;
            i10 = ((i14 + ((int) ((((i13 >> 24) & 255) - i14) * f11))) << 24) | ((i15 + ((int) ((((i13 >> 16) & 255) - i15) * f11))) << 16) | ((i16 + ((int) ((((i13 >> 8) & 255) - i16) * f11))) << 8) | (i17 + ((int) (f11 * ((i13 & 255) - i17))));
        } else {
            i10 = aVar.f2913i[aVar.f2914j];
        }
        aVar.f2923s = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f2901d, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f2900c;
        RectF rectF = aVar.f2905a;
        float f10 = aVar.f2921q;
        float fMin = (aVar.f2912h / 2.0f) + f10;
        if (f10 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((0 * aVar.f2920p) / 2.0f, aVar.f2912h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f11 = aVar.f2909e;
        float f12 = aVar.f2911g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((aVar.f2910f + f12) * 360.0f) - f13;
        aVar.f2906b.setColor(aVar.f2923s);
        aVar.f2906b.setAlpha(aVar.f2922r);
        float f15 = aVar.f2912h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f2908d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, aVar.f2906b);
        if (aVar.f2918n) {
            Path path = aVar.f2919o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f2919o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f17 = 0;
            float f18 = (aVar.f2920p * f17) / 2.0f;
            aVar.f2919o.moveTo(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            aVar.f2919o.lineTo(aVar.f2920p * f17, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            Path path3 = aVar.f2919o;
            float f19 = f17 * aVar.f2920p;
            path3.lineTo(f19 / 2.0f, f19);
            aVar.f2919o.offset((rectF.centerX() + fMin2) - f18, (aVar.f2912h / 2.0f) + rectF.centerY());
            aVar.f2919o.close();
            aVar.f2907c.setColor(aVar.f2923s);
            aVar.f2907c.setAlpha(aVar.f2922r);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f2919o, aVar.f2907c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2900c.f2922r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f2902e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f2900c.f2922r = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2900c.f2906b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j10;
        this.f2902e.cancel();
        a aVar = this.f2900c;
        float f10 = aVar.f2909e;
        aVar.f2915k = f10;
        float f11 = aVar.f2910f;
        aVar.f2916l = f11;
        aVar.f2917m = aVar.f2911g;
        if (f11 != f10) {
            this.f2904g = true;
            animator = this.f2902e;
            j10 = 666;
        } else {
            aVar.a(0);
            a aVar2 = this.f2900c;
            aVar2.f2915k = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            aVar2.f2916l = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            aVar2.f2917m = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            aVar2.f2909e = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            aVar2.f2910f = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            aVar2.f2911g = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            animator = this.f2902e;
            j10 = 1332;
        }
        animator.setDuration(j10);
        this.f2902e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f2902e.cancel();
        this.f2901d = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        a aVar = this.f2900c;
        if (aVar.f2918n) {
            aVar.f2918n = false;
        }
        aVar.a(0);
        a aVar2 = this.f2900c;
        aVar2.f2915k = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        aVar2.f2916l = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        aVar2.f2917m = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        aVar2.f2909e = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        aVar2.f2910f = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        aVar2.f2911g = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        invalidateSelf();
    }
}
