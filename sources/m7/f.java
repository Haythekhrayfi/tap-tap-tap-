package m7;

import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import fd.j0;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f33243e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f33244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f33245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f33246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n7.a f33247d;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public f(Uri uri, Map<String, String> map, JSONObject jSONObject, n7.a aVar) {
        j0.i(uri, ImagesContract.URL);
        j0.i(map, "headers");
        this.f33244a = uri;
        this.f33245b = map;
        this.f33246c = jSONObject;
        this.f33247d = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return j0.d(this.f33244a, fVar.f33244a) && j0.d(this.f33245b, fVar.f33245b) && j0.d(this.f33246c, fVar.f33246c) && j0.d(this.f33247d, fVar.f33247d);
    }

    public int hashCode() {
        int iHashCode = (this.f33245b.hashCode() + (this.f33244a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.f33246c;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        n7.a aVar = this.f33247d;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SendBeaconRequest(url=");
        sbA.append(this.f33244a);
        sbA.append(", headers=");
        sbA.append(this.f33245b);
        sbA.append(", payload=");
        sbA.append(this.f33246c);
        sbA.append(", cookieStorage=");
        sbA.append(this.f33247d);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
