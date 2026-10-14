package e3;

import java.io.IOException;
import java.io.InputStream;
import o3.r;

/* JADX INFO: loaded from: classes.dex */
public final class k implements e<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f29018a;

    public static final class a implements e.a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h3.b f29019a;

        public a(h3.b bVar) {
            this.f29019a = bVar;
        }

        @Override // e3.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // e3.e.a
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f29019a);
        }
    }

    public k(InputStream inputStream, h3.b bVar) {
        r rVar = new r(inputStream, bVar);
        this.f29018a = rVar;
        rVar.mark(5242880);
    }

    @Override // e3.e
    public InputStream a() throws IOException {
        this.f29018a.reset();
        return this.f29018a;
    }

    @Override // e3.e
    public void b() {
        this.f29018a.release();
    }
}
