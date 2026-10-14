package o3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class s implements com.bumptech.glide.load.e<Uri, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3.d f33936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3.d f33937b;

    public s(q3.d dVar, h3.d dVar2) {
        this.f33936a = dVar;
        this.f33937b = dVar2;
    }

    @Override // com.bumptech.glide.load.e
    public g3.u<Bitmap> a(Uri uri, int i10, int i11, d3.e eVar) throws IOException {
        g3.u uVarC = this.f33936a.c(uri);
        if (uVarC == null) {
            return null;
        }
        return l.a(this.f33937b, (Drawable) ((q3.b) uVarC).get(), i10, i11);
    }

    @Override // com.bumptech.glide.load.e
    public boolean b(Uri uri, d3.e eVar) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }
}
