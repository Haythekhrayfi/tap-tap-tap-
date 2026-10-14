package m3;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import l3.n;
import l3.o;
import l3.r;
import o3.w;

/* JADX INFO: loaded from: classes.dex */
public class d implements n<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33188a;

    public static class a implements o<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f33189a;

        public a(Context context) {
            this.f33189a = context;
        }

        @Override // l3.o
        public n<Uri, InputStream> a(r rVar) {
            return new d(this.f33189a);
        }
    }

    public d(Context context) {
        this.f33188a = context.getApplicationContext();
    }

    @Override // l3.n
    public boolean a(Uri uri) {
        Uri uri2 = uri;
        return u1.a.j(uri2) && uri2.getPathSegments().contains("video");
    }

    @Override // l3.n
    public n.a<InputStream> b(Uri uri, int i10, int i11, d3.e eVar) {
        Uri uri2 = uri;
        if (u1.a.k(i10, i11)) {
            Long l10 = (Long) eVar.c(w.f33945d);
            if (l10 != null && l10.longValue() == -1) {
                a4.c cVar = new a4.c(uri2);
                Context context = this.f33188a;
                return new n.a<>(cVar, f3.a.c(context, uri2, new f3.a.b(context.getContentResolver())));
            }
        }
        return null;
    }
}
