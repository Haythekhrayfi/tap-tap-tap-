package p9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import n9.d;
import n9.e;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f34629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f34630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f34631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f34632d;

    public b(e eVar) {
        j0.i(eVar, "params");
        this.f34629a = eVar;
        this.f34630b = new Paint();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        this.f34631c = paint;
        this.f34632d = new RectF();
    }

    @Override // p9.c
    public void a(Canvas canvas, RectF rectF) {
        d dVar = this.f34629a.f33726b;
        d.b bVar = (d.b) dVar;
        n9.c.b bVar2 = bVar.f33722b;
        this.f34630b.setColor(dVar.a());
        float f10 = bVar2.f33718c;
        canvas.drawRoundRect(rectF, f10, f10, this.f34630b);
        int i10 = bVar.f33724d;
        if (i10 != 0) {
            if (bVar.f33723c == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                return;
            }
            Paint paint = this.f34631c;
            paint.setColor(i10);
            paint.setStrokeWidth(bVar.f33723c);
            float f11 = bVar2.f33718c;
            canvas.drawRoundRect(rectF, f11, f11, this.f34631c);
        }
    }

    @Override // p9.c
    public void b(Canvas canvas, float f10, float f11, n9.c cVar, int i10, float f12, int i11) {
        j0.i(cVar, "itemSize");
        n9.c.b bVar = (n9.c.b) cVar;
        this.f34630b.setColor(i10);
        RectF rectF = this.f34632d;
        float f13 = bVar.f33716a / 2.0f;
        rectF.left = f10 - f13;
        float f14 = bVar.f33717b / 2.0f;
        rectF.top = f11 - f14;
        rectF.right = f13 + f10;
        rectF.bottom = f14 + f11;
        float f15 = bVar.f33718c;
        canvas.drawRoundRect(rectF, f15, f15, this.f34630b);
        if (i11 != 0) {
            if (f12 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                return;
            }
            Paint paint = this.f34631c;
            paint.setColor(i11);
            paint.setStrokeWidth(f12);
            RectF rectF2 = this.f34632d;
            float f16 = bVar.f33718c;
            canvas.drawRoundRect(rectF2, f16, f16, this.f34631c);
        }
    }
}
