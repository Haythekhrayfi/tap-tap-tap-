package t5;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f35683c = 0;

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f35683c++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f35683c += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f35683c += (long) i11;
    }
}
