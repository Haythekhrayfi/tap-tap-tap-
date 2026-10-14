package s9;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9.b f35496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f35497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f35498c;

    public b(r9.b bVar) {
        j0.i(bVar, "textStyle");
        this.f35496a = bVar;
        this.f35497b = new a(bVar);
        this.f35498c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        j0.i(canvas, "canvas");
        this.f35498c.set(getBounds());
        a aVar = this.f35497b;
        float fCenterX = this.f35498c.centerX();
        float fCenterY = this.f35498c.centerY();
        Objects.requireNonNull(aVar);
        j0.i(canvas, "canvas");
        String str = aVar.f35493d;
        if (str == null) {
            return;
        }
        float f10 = fCenterX - aVar.f35494e;
        r9.b bVar = aVar.f35490a;
        canvas.drawText(str, f10 + bVar.f35308c, fCenterY + aVar.f35495f + bVar.f35309d, aVar.f35492c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        r9.b bVar = this.f35496a;
        return (int) (Math.abs(bVar.f35309d) + bVar.f35306a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (Math.abs(this.f35496a.f35308c) + this.f35498c.width());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
