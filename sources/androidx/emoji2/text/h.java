package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<y0.a> f1801d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f1803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f1804c = 0;

    public h(n nVar, int i10) {
        this.f1803b = nVar;
        this.f1802a = i10;
    }

    public int a(int i10) {
        y0.a aVarE = e();
        int iA = aVarE.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = aVarE.f37969b;
        int i11 = iA + aVarE.f37968a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public int b() {
        y0.a aVarE = e();
        int iA = aVarE.a(16);
        if (iA == 0) {
            return 0;
        }
        int i10 = iA + aVarE.f37968a;
        return aVarE.f37969b.getInt(aVarE.f37969b.getInt(i10) + i10);
    }

    public short c() {
        y0.a aVarE = e();
        int iA = aVarE.a(14);
        if (iA != 0) {
            return aVarE.f37969b.getShort(iA + aVarE.f37968a);
        }
        return (short) 0;
    }

    public int d() {
        y0.a aVarE = e();
        int iA = aVarE.a(4);
        if (iA != 0) {
            return aVarE.f37969b.getInt(iA + aVarE.f37968a);
        }
        return 0;
    }

    public final y0.a e() {
        ThreadLocal<y0.a> threadLocal = f1801d;
        y0.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new y0.a();
            threadLocal.set(aVar);
        }
        y0.b bVar = this.f1803b.f1831a;
        int i10 = this.f1802a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i11 = iA + bVar.f37968a;
            int i12 = (i10 * 4) + bVar.f37969b.getInt(i11) + i11 + 4;
            aVar.b(bVar.f37969b.getInt(i12) + i12, bVar.f37969b);
        }
        return aVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(d()));
        sb2.append(", codepoints:");
        int iB = b();
        for (int i10 = 0; i10 < iB; i10++) {
            sb2.append(Integer.toHexString(a(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
