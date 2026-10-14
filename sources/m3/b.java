package m3;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l3.g;
import l3.n;
import l3.o;
import l3.r;

/* JADX INFO: loaded from: classes.dex */
public class b implements n<Uri, InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f33184b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<g, InputStream> f33185a;

    public static class a implements o<Uri, InputStream> {
        @Override // l3.o
        public n<Uri, InputStream> a(r rVar) {
            return new b(rVar.b(g.class, InputStream.class));
        }
    }

    public b(n<g, InputStream> nVar) {
        this.f33185a = nVar;
    }

    @Override // l3.n
    public boolean a(Uri uri) {
        return f33184b.contains(uri.getScheme());
    }

    @Override // l3.n
    public n.a<InputStream> b(Uri uri, int i10, int i11, d3.e eVar) {
        return this.f33185a.b(new g(uri.toString()), i10, i11, eVar);
    }
}
