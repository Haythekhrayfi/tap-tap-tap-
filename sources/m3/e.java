package m3;

import java.io.InputStream;
import java.net.URL;
import l3.g;
import l3.n;
import l3.o;
import l3.r;

/* JADX INFO: loaded from: classes.dex */
public class e implements n<URL, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<g, InputStream> f33190a;

    public static class a implements o<URL, InputStream> {
        @Override // l3.o
        public n<URL, InputStream> a(r rVar) {
            return new e(rVar.b(g.class, InputStream.class));
        }
    }

    public e(n<g, InputStream> nVar) {
        this.f33190a = nVar;
    }

    @Override // l3.n
    public /* bridge */ /* synthetic */ boolean a(URL url) {
        return true;
    }

    @Override // l3.n
    public n.a<InputStream> b(URL url, int i10, int i11, d3.e eVar) {
        return this.f33190a.b(new g(url), i10, i11, eVar);
    }
}
