package p3;

import g3.u;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class b implements u<byte[]> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f34453c;

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.f34453c = bArr;
    }

    @Override // g3.u
    public void a() {
    }

    @Override // g3.u
    public Class<byte[]> b() {
        return byte[].class;
    }

    @Override // g3.u
    public byte[] get() {
        return this.f34453c;
    }

    @Override // g3.u
    public int getSize() {
        return this.f34453c.length;
    }
}
