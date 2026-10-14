package h3;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class e implements d {
    @Override // h3.d
    public void a(int i10) {
    }

    @Override // h3.d
    public void b() {
    }

    @Override // h3.d
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // h3.d
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // h3.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }
}
