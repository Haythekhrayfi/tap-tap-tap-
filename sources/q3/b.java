package q3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import g3.r;
import g3.u;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T extends Drawable> implements u<T>, r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f34771c;

    public b(T t10) {
        Objects.requireNonNull(t10, "Argument must not be null");
        this.f34771c = t10;
    }

    @Override // g3.u
    public Object get() {
        Drawable.ConstantState constantState = this.f34771c.getConstantState();
        return constantState == null ? this.f34771c : constantState.newDrawable();
    }

    @Override // g3.r
    public void initialize() {
        Bitmap bitmapB;
        T t10 = this.f34771c;
        if (t10 instanceof BitmapDrawable) {
            bitmapB = ((BitmapDrawable) t10).getBitmap();
        } else if (!(t10 instanceof s3.c)) {
            return;
        } else {
            bitmapB = ((s3.c) t10).b();
        }
        bitmapB.prepareToDraw();
    }
}
