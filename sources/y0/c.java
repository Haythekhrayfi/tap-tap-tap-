package y0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f37969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37971d;

    public c() {
        if (d.f37972a == null) {
            d.f37972a = new e();
        }
    }

    public int a(int i10) {
        if (i10 < this.f37971d) {
            return this.f37969b.getShort(this.f37970c + i10);
        }
        return 0;
    }

    public void b(int i10, ByteBuffer byteBuffer) {
        short s10;
        this.f37969b = byteBuffer;
        if (byteBuffer != null) {
            this.f37968a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f37970c = i11;
            s10 = this.f37969b.getShort(i11);
        } else {
            s10 = 0;
            this.f37968a = 0;
            this.f37970c = 0;
        }
        this.f37971d = s10;
    }
}
