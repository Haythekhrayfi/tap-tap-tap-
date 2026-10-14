package g9;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NinePatch f30070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f30071f = new Paint(3);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    static {
        new a(null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        j0.i(canvas, "canvas");
        NinePatch ninePatch = this.f30070e;
        if (ninePatch == null) {
            return;
        }
        ninePatch.draw(canvas, new Rect(0, 0, getBounds().width(), getBounds().height()), this.f30071f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f30071f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        j0.i(rect, "bounds");
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f30071f.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
