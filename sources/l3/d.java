package l3;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class d implements n<File, ByteBuffer> {

    public static final class a implements e3.d<ByteBuffer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File f32132c;

        public a(File file) {
            this.f32132c = file;
        }

        @Override // e3.d
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // e3.d
        public void b() {
        }

        @Override // e3.d
        public void cancel() {
        }

        @Override // e3.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // e3.d
        public void e(a3.g gVar, e3.d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(b4.a.a(this.f32132c));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    public static class b implements o<File, ByteBuffer> {
        @Override // l3.o
        public n<File, ByteBuffer> a(r rVar) {
            return new d();
        }
    }

    @Override // l3.n
    public /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // l3.n
    public n.a<ByteBuffer> b(File file, int i10, int i11, d3.e eVar) {
        File file2 = file;
        return new n.a<>(new a4.c(file2), new a(file2));
    }
}
