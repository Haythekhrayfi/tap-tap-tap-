package o3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h3.d f33920a = new a();

    public class a extends h3.e {
        @Override // h3.e, h3.d
        public void d(Bitmap bitmap) {
        }
    }

    public static g3.u<Bitmap> a(h3.d dVar, Drawable drawable, int i10, int i11) {
        StringBuilder sb2;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i10 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i11 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i10 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i11 = current.getIntrinsicHeight();
                    }
                    Lock lock = u.f33943b;
                    lock.lock();
                    Bitmap bitmapE = dVar.e(i10, i11, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapE);
                        current.setBounds(0, 0, i10, i11);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapE;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb2 = new StringBuilder();
                    sb2.append("Unable to draw ");
                    sb2.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                    sb2.append(str);
                    Log.w("DrawableToBitmap", sb2.toString());
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                sb2 = new StringBuilder();
                sb2.append("Unable to draw ");
                sb2.append(current);
                str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                sb2.append(str);
                Log.w("DrawableToBitmap", sb2.toString());
            }
            z10 = true;
        }
        if (!z10) {
            dVar = f33920a;
        }
        return d.c(bitmap, dVar);
    }
}
