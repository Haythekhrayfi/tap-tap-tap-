package o3;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements d3.g<Bitmap> {
    @Override // d3.g
    public final g3.u<Bitmap> b(Context context, g3.u<Bitmap> uVar, int i10, int i11) {
        if (!b4.j.i(i10, i11)) {
            throw new IllegalArgumentException(j1.e.a("Cannot apply transformation on width: ", i10, " or height: ", i11, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        h3.d dVar = a3.c.b(context).f13c;
        Bitmap bitmap = uVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(dVar, bitmap, i10, i11);
        return bitmap.equals(bitmapC) ? uVar : d.c(bitmapC, dVar);
    }

    public abstract Bitmap c(h3.d dVar, Bitmap bitmap, int i10, int i11);
}
