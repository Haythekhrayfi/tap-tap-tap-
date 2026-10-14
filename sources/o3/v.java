package o3;

import android.graphics.Bitmap;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class v implements com.bumptech.glide.load.e<Bitmap, Bitmap> {

    public static final class a implements g3.u<Bitmap> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bitmap f33944c;

        public a(Bitmap bitmap) {
            this.f33944c = bitmap;
        }

        @Override // g3.u
        public void a() {
        }

        @Override // g3.u
        public Class<Bitmap> b() {
            return Bitmap.class;
        }

        @Override // g3.u
        public Bitmap get() {
            return this.f33944c;
        }

        @Override // g3.u
        public int getSize() {
            return b4.j.d(this.f33944c);
        }
    }

    @Override // com.bumptech.glide.load.e
    public g3.u<Bitmap> a(Bitmap bitmap, int i10, int i11, d3.e eVar) throws IOException {
        return new a(bitmap);
    }

    @Override // com.bumptech.glide.load.e
    public /* bridge */ /* synthetic */ boolean b(Bitmap bitmap, d3.e eVar) throws IOException {
        return true;
    }
}
