package y3;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class c extends d<Drawable> {
    public c(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public c(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    @Override // y3.d
    public void i(Drawable drawable) {
        ((ImageView) this.f38055b).setImageDrawable(drawable);
    }
}
