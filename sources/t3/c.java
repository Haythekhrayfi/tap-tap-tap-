package t3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import g3.u;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e<Drawable, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3.d f35671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e<Bitmap, byte[]> f35672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e<s3.c, byte[]> f35673c;

    public c(h3.d dVar, e<Bitmap, byte[]> eVar, e<s3.c, byte[]> eVar2) {
        this.f35671a = dVar;
        this.f35672b = eVar;
        this.f35673c = eVar2;
    }

    @Override // t3.e
    public u<byte[]> a(u<Drawable> uVar, d3.e eVar) {
        Drawable drawable = uVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f35672b.a(o3.d.c(((BitmapDrawable) drawable).getBitmap(), this.f35671a), eVar);
        }
        if (drawable instanceof s3.c) {
            return this.f35673c.a(uVar, eVar);
        }
        return null;
    }
}
