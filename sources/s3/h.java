package s3;

import android.graphics.Bitmap;
import g3.u;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class h implements com.bumptech.glide.load.e<c3.a, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3.d f35444a;

    public h(h3.d dVar) {
        this.f35444a = dVar;
    }

    @Override // com.bumptech.glide.load.e
    public u<Bitmap> a(c3.a aVar, int i10, int i11, d3.e eVar) throws IOException {
        return o3.d.c(aVar.a(), this.f35444a);
    }

    @Override // com.bumptech.glide.load.e
    public /* bridge */ /* synthetic */ boolean b(c3.a aVar, d3.e eVar) throws IOException {
        return true;
    }
}
