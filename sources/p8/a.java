package p8;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import fd.j0;
import xc.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Drawable implements Animatable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f34623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34625e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Drawable drawable, float f10) {
        this(drawable, f10, f10);
        j0.i(drawable, "child");
    }

    public a(Drawable drawable, float f10, float f11) {
        j0.i(drawable, "child");
        this.f34623c = drawable;
        this.f34624d = f10;
        this.f34625e = f11;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        j0.i(canvas, "canvas");
        int iSave = canvas.save();
        try {
            canvas.scale(this.f34624d, this.f34625e);
            this.f34623c.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f34623c.getIntrinsicHeight() == -1) {
            return -1;
        }
        return b.c(this.f34623c.getIntrinsicHeight() * this.f34625e);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f34623c.getIntrinsicWidth() == -1) {
            return -1;
        }
        return b.c(this.f34623c.getIntrinsicWidth() * this.f34624d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f34623c.getOpacity();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Object obj = this.f34623c;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f34623c.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f34623c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.f34623c;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.f34623c;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }
}
