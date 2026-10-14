package p3;

import e3.e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class a implements e<ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f34452a;

    /* JADX INFO: renamed from: p3.a$a, reason: collision with other inner class name */
    public static class C0384a implements e.a<ByteBuffer> {
        @Override // e3.e.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // e3.e.a
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f34452a = byteBuffer;
    }

    @Override // e3.e
    public ByteBuffer a() throws IOException {
        this.f34452a.position(0);
        return this.f34452a;
    }

    @Override // e3.e
    public void b() {
    }
}
