package p9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import fd.j0;
import n9.e;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f34626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f34627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f34628c;

    public a(e eVar) {
        j0.i(eVar, "params");
        this.f34626a = eVar;
        this.f34627b = new Paint();
        this.f34628c = new RectF();
    }

    @Override // p9.c
    public void a(Canvas canvas, RectF rectF) {
        this.f34627b.setColor(this.f34626a.f33726b.a());
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2, this.f34627b);
    }

    @Override // p9.c
    public void b(Canvas canvas, float f10, float f11, n9.c cVar, int i10, float f12, int i11) {
        j0.i(cVar, "itemSize");
        n9.c.a aVar = (n9.c.a) cVar;
        this.f34627b.setColor(i10);
        RectF rectF = this.f34628c;
        float f13 = aVar.f33715a;
        rectF.left = f10 - f13;
        rectF.top = f11 - f13;
        rectF.right = f10 + f13;
        rectF.bottom = f11 + f13;
        canvas.drawCircle(rectF.centerX(), this.f34628c.centerY(), aVar.f33715a, this.f34627b);
    }
}
