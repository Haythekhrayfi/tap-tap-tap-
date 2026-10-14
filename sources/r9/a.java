package r9;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35305b;

    public final void a(Canvas canvas, Drawable drawable, int i10) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i10 - intrinsicWidth, (this.f35305b / 2) - (drawable.getIntrinsicHeight() / 2), i10 + intrinsicWidth, (drawable.getIntrinsicHeight() / 2) + (this.f35305b / 2));
        drawable.draw(canvas);
    }

    public final void b(Canvas canvas, int i10, Drawable drawable, int i11, s9.b bVar) {
        a(canvas, drawable, i10);
        if (bVar == null) {
            return;
        }
        String strValueOf = String.valueOf(i11);
        j0.i(strValueOf, "text");
        s9.a aVar = bVar.f35497b;
        aVar.f35493d = strValueOf;
        aVar.f35492c.getTextBounds(strValueOf, 0, strValueOf.length(), aVar.f35491b);
        aVar.f35494e = aVar.f35492c.measureText(aVar.f35493d) / 2.0f;
        aVar.f35495f = aVar.f35491b.height() / 2.0f;
        bVar.invalidateSelf();
        a(canvas, bVar, i10);
    }
}
