package m3;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import l3.n;
import l3.o;
import l3.r;

/* JADX INFO: loaded from: classes.dex */
public class c implements n<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33186a;

    public static class a implements o<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f33187a;

        public a(Context context) {
            this.f33187a = context;
        }

        @Override // l3.o
        public n<Uri, InputStream> a(r rVar) {
            return new c(this.f33187a);
        }
    }

    public c(Context context) {
        this.f33186a = context.getApplicationContext();
    }

    @Override // l3.n
    public boolean a(Uri uri) {
        Uri uri2 = uri;
        return u1.a.j(uri2) && !uri2.getPathSegments().contains("video");
    }

    @Override // l3.n
    public n.a<InputStream> b(Uri uri, int i10, int i11, d3.e eVar) {
        Uri uri2 = uri;
        if (!u1.a.k(i10, i11)) {
            return null;
        }
        a4.c cVar = new a4.c(uri2);
        Context context = this.f33186a;
        return new n.a<>(cVar, f3.a.c(context, uri2, new f3.a.C0255a(context.getContentResolver())));
    }
}
