package y9;

import android.net.Uri;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class m4 implements u9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41439c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f41440d = new l(null, null, null, null, 15, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.b<Uri> f41441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f41442b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final m4 a(u9.c cVar, JSONObject jSONObject) {
            u9.e eVarA = cVar.a();
            v9.b bVarH = h9.c.h(jSONObject, "image_url", h9.h.f30979b, eVarA, cVar, h9.l.f31001e);
            Objects.requireNonNull(l.f41153e);
            l lVar = (l) h9.c.n(jSONObject, "insets", l.f41162n, eVarA, cVar);
            if (lVar == null) {
                lVar = m4.f41440d;
            }
            fd.j0.h(lVar, "JsonParser.readOptional(…) ?: INSETS_DEFAULT_VALUE");
            return new m4(bVarH, lVar);
        }
    }

    public m4(v9.b<Uri> bVar, l lVar) {
        fd.j0.i(bVar, "imageUrl");
        fd.j0.i(lVar, "insets");
        this.f41441a = bVar;
        this.f41442b = lVar;
    }

    public /* synthetic */ m4(v9.b bVar, l lVar, int i10, vc.g gVar) {
        this(bVar, (i10 & 2) != 0 ? f41440d : lVar);
    }
}
