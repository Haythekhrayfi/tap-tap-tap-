package h8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import jc.g;
import y9.c7;
import y9.o7;
import y9.q7;
import y9.u6;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayMetrics f30952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q7 f30953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o7 f30954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Canvas f30955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.d f30956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f30957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f30958g;

    public a(DisplayMetrics displayMetrics, q7 q7Var, o7 o7Var, Canvas canvas, v9.d dVar) {
        v9.b<Integer> bVar;
        Integer numB;
        j0.i(displayMetrics, "metrics");
        j0.i(canvas, "canvas");
        j0.i(dVar, "resolver");
        this.f30952a = displayMetrics;
        this.f30953b = q7Var;
        this.f30954c = o7Var;
        this.f30955d = canvas;
        this.f30956e = dVar;
        Paint paint = new Paint();
        this.f30957f = paint;
        if (q7Var == null) {
            this.f30958g = null;
            return;
        }
        v9.b<Long> bVar2 = q7Var.f42188a;
        float fU = l8.b.u(bVar2 != null ? bVar2.b(dVar) : null, displayMetrics);
        this.f30958g = new float[]{fU, fU, fU, fU, fU, fU, fU, fU};
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(o8.b.a(q7Var.f42189b, dVar, displayMetrics));
        c7 c7Var = q7Var.f42189b;
        if (c7Var == null || (bVar = c7Var.f39543a) == null || (numB = bVar.b(dVar)) == null) {
            return;
        }
        paint.setColor(numB.intValue());
    }

    public final void a(float[] fArr, float f10, float f11, float f12, float f13) {
        u6 u6Var;
        RectF rectF = new RectF();
        rectF.set(f10, f11, f12, f13);
        o7 o7Var = this.f30954c;
        if (o7Var == null) {
            u6Var = null;
        } else {
            if (!(o7Var instanceof o7.c)) {
                throw new g();
            }
            u6Var = ((o7.c) o7Var).f41844c;
        }
        if (u6Var instanceof u6) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(u6Var.f43113a.b(this.f30956e).intValue());
            this.f30955d.drawPath(b(fArr, rectF), paint);
        }
        q7 q7Var = this.f30953b;
        if ((q7Var == null ? null : q7Var.f42189b) == null) {
            return;
        }
        RectF rectF2 = new RectF();
        c7 c7Var = this.f30953b.f42189b;
        j0.f(c7Var);
        float fA = o8.b.a(c7Var, this.f30956e, this.f30952a) / 2;
        rectF2.set(Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f10 + fA), Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f11 + fA), Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f12 - fA), Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, f13 - fA));
        float[] fArr2 = fArr != null ? (float[]) fArr.clone() : null;
        if (fArr2 != null) {
            int length = fArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                fArr2[i10] = Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, fArr[i10] - fA);
            }
        }
        this.f30955d.drawPath(b(fArr2, rectF2), this.f30957f);
    }

    public final Path b(float[] fArr, RectF rectF) {
        Path path = new Path();
        path.reset();
        if (fArr == null) {
            path.addRect(rectF, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        path.close();
        return path;
    }
}
