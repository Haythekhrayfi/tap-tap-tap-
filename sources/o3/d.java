package o3;

import android.graphics.Bitmap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d implements g3.u<Bitmap>, g3.r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f33894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h3.d f33895d;

    public d(Bitmap bitmap, h3.d dVar) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.f33894c = bitmap;
        Objects.requireNonNull(dVar, "BitmapPool must not be null");
        this.f33895d = dVar;
    }

    public static d c(Bitmap bitmap, h3.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new d(bitmap, dVar);
    }

    @Override // g3.u
    public void a() {
        this.f33895d.d(this.f33894c);
    }

    @Override // g3.u
    public Class<Bitmap> b() {
        return Bitmap.class;
    }

    @Override // g3.u
    public Bitmap get() {
        return this.f33894c;
    }

    @Override // g3.u
    public int getSize() {
        return b4.j.d(this.f33894c);
    }

    @Override // g3.r
    public void initialize() {
        this.f33894c.prepareToDraw();
    }
}
