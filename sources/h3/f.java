package h3;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a<byte[]> {
    @Override // h3.a
    public int a() {
        return 1;
    }

    @Override // h3.a
    public int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // h3.a
    public String e() {
        return "ByteArrayPool";
    }

    @Override // h3.a
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
