package l3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class b<Data> implements n<byte[], Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0336b<Data> f32129a;

    public static class a implements o<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: l3.b$a$a, reason: collision with other inner class name */
        public class C0335a implements InterfaceC0336b<ByteBuffer> {
            public C0335a(a aVar) {
            }

            @Override // l3.b.InterfaceC0336b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // l3.b.InterfaceC0336b
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // l3.o
        public n<byte[], ByteBuffer> a(r rVar) {
            return new b(new C0335a(this));
        }
    }

    /* JADX INFO: renamed from: l3.b$b, reason: collision with other inner class name */
    public interface InterfaceC0336b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements e3.d<Data> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f32130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC0336b<Data> f32131d;

        public c(byte[] bArr, InterfaceC0336b<Data> interfaceC0336b) {
            this.f32130c = bArr;
            this.f32131d = interfaceC0336b;
        }

        @Override // e3.d
        public Class<Data> a() {
            return this.f32131d.a();
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
        public void e(a3.g gVar, e3.d.a<? super Data> aVar) {
            aVar.f(this.f32131d.b(this.f32130c));
        }
    }

    public static class d implements o<byte[], InputStream> {

        public class a implements InterfaceC0336b<InputStream> {
            public a(d dVar) {
            }

            @Override // l3.b.InterfaceC0336b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // l3.b.InterfaceC0336b
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // l3.o
        public n<byte[], InputStream> a(r rVar) {
            return new b(new a(this));
        }
    }

    public b(InterfaceC0336b<Data> interfaceC0336b) {
        this.f32129a = interfaceC0336b;
    }

    @Override // l3.n
    public /* bridge */ /* synthetic */ boolean a(byte[] bArr) {
        return true;
    }

    @Override // l3.n
    public n.a b(byte[] bArr, int i10, int i11, d3.e eVar) {
        byte[] bArr2 = bArr;
        return new n.a(new a4.c(bArr2), new c(bArr2, this.f32129a));
    }
}
