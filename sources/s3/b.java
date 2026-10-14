package s3;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c3.a.InterfaceC0065a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3.d f35411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3.b f35412b;

    public b(h3.d dVar) {
        this(dVar, null);
    }

    public b(h3.d dVar, h3.b bVar) {
        this.f35411a = dVar;
        this.f35412b = bVar;
    }

    public byte[] a(int i10) {
        h3.b bVar = this.f35412b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.d(i10, byte[].class);
    }
}
