package y9;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i8 implements u9.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f40635e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final uc.p<u9.c, JSONObject, i8> f40636f = a.f40641c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Long> f40637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.b<String> f40638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f40639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.b<Uri> f40640d;

    public static final class a extends vc.l implements uc.p<u9.c, JSONObject, i8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40641c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public i8 invoke(u9.c cVar, JSONObject jSONObject) {
            u9.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "it");
            Objects.requireNonNull(i8.f40635e);
            fd.j0.i(cVar2, "env");
            fd.j0.i(jSONObject2, "json");
            u9.e eVarA = cVar2.a();
            v9.b bVarS = h9.c.s(jSONObject2, "bitrate", h9.h.f30982e, eVarA, cVar2, h9.l.f30998b);
            v9.b<String> bVarF = h9.c.f(jSONObject2, "mime_type", eVarA, cVar2, h9.l.f30999c);
            Objects.requireNonNull(c.f40642c);
            return new i8(bVarS, bVarF, (c) h9.c.n(jSONObject2, "resolution", c.f40645f, eVarA, cVar2), h9.c.h(jSONObject2, ImagesContract.URL, h9.h.f30979b, eVarA, cVar2, h9.l.f31001e));
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public static class c implements u9.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f40642c = new b(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final h9.m<Long> f40643d = g8.f40227k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h9.m<Long> f40644e = g8.f40228l;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final uc.p<u9.c, JSONObject, c> f40645f = a.f40648c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v9.b<Long> f40646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v9.b<Long> f40647b;

        public static final class a extends vc.l implements uc.p<u9.c, JSONObject, c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f40648c = new a();

            public a() {
                super(2);
            }

            @Override // uc.p
            public c invoke(u9.c cVar, JSONObject jSONObject) {
                u9.c cVar2 = cVar;
                JSONObject jSONObject2 = jSONObject;
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "it");
                Objects.requireNonNull(c.f40642c);
                fd.j0.i(cVar2, "env");
                fd.j0.i(jSONObject2, "json");
                u9.e eVarA = cVar2.a();
                uc.l<Number, Long> lVar = h9.h.f30982e;
                h9.m<Long> mVar = c.f40643d;
                h9.k<Long> kVar = h9.l.f30998b;
                return new c(h9.c.g(jSONObject2, "height", lVar, mVar, eVarA, kVar), h9.c.g(jSONObject2, "width", lVar, c.f40644e, eVarA, kVar));
            }
        }

        public static final class b {
            public b() {
            }

            public b(vc.g gVar) {
            }
        }

        public c(v9.b<Long> bVar, v9.b<Long> bVar2) {
            fd.j0.i(bVar, "height");
            fd.j0.i(bVar2, "width");
            this.f40646a = bVar;
            this.f40647b = bVar2;
        }
    }

    public i8(v9.b<Long> bVar, v9.b<String> bVar2, c cVar, v9.b<Uri> bVar3) {
        fd.j0.i(bVar2, "mimeType");
        fd.j0.i(bVar3, ImagesContract.URL);
        this.f40637a = bVar;
        this.f40638b = bVar2;
        this.f40639c = cVar;
        this.f40640d = bVar3;
    }

    public /* synthetic */ i8(v9.b bVar, v9.b bVar2, c cVar, v9.b bVar3, int i10, vc.g gVar) {
        this((i10 & 1) != 0 ? null : bVar, bVar2, (i10 & 4) != 0 ? null : cVar, bVar3);
    }
}
