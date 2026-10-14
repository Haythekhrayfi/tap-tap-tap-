package o3;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class f implements com.bumptech.glide.load.e<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f33896a;

    public f(k kVar) {
        this.f33896a = kVar;
    }

    @Override // com.bumptech.glide.load.e
    public g3.u<Bitmap> a(ByteBuffer byteBuffer, int i10, int i11, d3.e eVar) throws IOException {
        int i12 = b4.a.f3283a;
        return this.f33896a.a(new b4.a.C0054a(byteBuffer), i10, i11, eVar, k.f33913i);
    }

    @Override // com.bumptech.glide.load.e
    public boolean b(ByteBuffer byteBuffer, d3.e eVar) throws IOException {
        Objects.requireNonNull(this.f33896a);
        return true;
    }
}
