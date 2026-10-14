package o3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b implements d3.f<BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3.d f33889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3.f<Bitmap> f33890b;

    public b(h3.d dVar, d3.f<Bitmap> fVar) {
        this.f33889a = dVar;
        this.f33890b = fVar;
    }

    @Override // d3.f
    public com.bumptech.glide.load.c a(d3.e eVar) {
        return this.f33890b.a(eVar);
    }

    @Override // d3.a
    public boolean b(Object obj, File file, d3.e eVar) {
        return this.f33890b.b((Bitmap) new d(((BitmapDrawable) ((g3.u) obj).get()).getBitmap(), this.f33889a), file, eVar);
    }
}
