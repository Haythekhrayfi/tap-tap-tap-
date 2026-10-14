package l3;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class x<Data> implements n<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f32207b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<g, Data> f32208a;

    public static class a implements o<Uri, InputStream> {
        @Override // l3.o
        public n<Uri, InputStream> a(r rVar) {
            return new x(rVar.b(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.f32208a = nVar;
    }

    @Override // l3.n
    public boolean a(Uri uri) {
        return f32207b.contains(uri.getScheme());
    }

    @Override // l3.n
    public n.a b(Uri uri, int i10, int i11, d3.e eVar) {
        return this.f32208a.b(new g(uri.toString()), i10, i11, eVar);
    }
}
