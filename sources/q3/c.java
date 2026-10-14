package q3;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b<Drawable> {
    public c(Drawable drawable) {
        super(drawable);
    }

    @Override // g3.u
    public void a() {
    }

    @Override // g3.u
    public Class<Drawable> b() {
        return this.f34771c.getClass();
    }

    @Override // g3.u
    public int getSize() {
        return Math.max(1, this.f34771c.getIntrinsicHeight() * this.f34771c.getIntrinsicWidth() * 4);
    }
}
