package y3;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class b extends d<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public b(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    @Override // y3.d
    public void i(Bitmap bitmap) {
        ((ImageView) this.f38055b).setImageBitmap(bitmap);
    }
}
