package o3;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class t implements com.bumptech.glide.load.e<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f33938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3.b f33939b;

    public static class a implements k.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f33940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b4.d f33941b;

        public a(r rVar, b4.d dVar) {
            this.f33940a = rVar;
            this.f33941b = dVar;
        }

        @Override // o3.k.b
        public void a(h3.d dVar, Bitmap bitmap) throws IOException {
            IOException iOException = this.f33941b.f3294d;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                dVar.d(bitmap);
                throw iOException;
            }
        }

        @Override // o3.k.b
        public void b() {
            r rVar = this.f33940a;
            synchronized (rVar) {
                rVar.f33932e = rVar.f33930c.length;
            }
        }
    }

    public t(k kVar, h3.b bVar) {
        this.f33938a = kVar;
        this.f33939b = bVar;
    }

    @Override // com.bumptech.glide.load.e
    public g3.u<Bitmap> a(InputStream inputStream, int i10, int i11, d3.e eVar) throws IOException {
        boolean z10;
        r rVar;
        b4.d dVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof r) {
            rVar = (r) inputStream2;
            z10 = false;
        } else {
            z10 = true;
            rVar = new r(inputStream2, this.f33939b);
        }
        Queue<b4.d> queue = b4.d.f3292e;
        synchronized (queue) {
            dVar = (b4.d) ((ArrayDeque) queue).poll();
        }
        if (dVar == null) {
            dVar = new b4.d();
        }
        dVar.f3293c = rVar;
        try {
            return this.f33938a.a(new b4.h(dVar), i10, i11, eVar, new a(rVar, dVar));
        } finally {
            dVar.release();
            if (z10) {
                rVar.release();
            }
        }
    }

    @Override // com.bumptech.glide.load.e
    public boolean b(InputStream inputStream, d3.e eVar) throws IOException {
        Objects.requireNonNull(this.f33938a);
        return true;
    }
}
