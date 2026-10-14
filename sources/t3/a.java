package t3;

import android.graphics.Bitmap;
import g3.u;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class a implements e<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f35668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35669b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f35668a = compressFormat;
        this.f35669b = i10;
    }

    @Override // t3.e
    public u<byte[]> a(u<Bitmap> uVar, d3.e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uVar.get().compress(this.f35668a, this.f35669b, byteArrayOutputStream);
        uVar.a();
        return new p3.b(byteArrayOutputStream.toByteArray());
    }
}
