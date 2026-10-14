package q3;

import android.graphics.drawable.Drawable;
import g3.u;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class e implements com.bumptech.glide.load.e<Drawable, Drawable> {
    @Override // com.bumptech.glide.load.e
    public u<Drawable> a(Drawable drawable, int i10, int i11, d3.e eVar) throws IOException {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new c(drawable2);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.e
    public /* bridge */ /* synthetic */ boolean b(Drawable drawable, d3.e eVar) throws IOException {
        return true;
    }
}
