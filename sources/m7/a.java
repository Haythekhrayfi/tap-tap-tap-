package m7;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import fd.j0;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f33229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f33230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f33231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f33232d;

    /* JADX INFO: renamed from: m7.a$a, reason: collision with other inner class name */
    public static final class C0355a extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f33233e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0355a(Uri uri, Map<String, String> map, JSONObject jSONObject, long j10, long j11) {
            super(uri, map, jSONObject, j10);
            j0.i(uri, ImagesContract.URL);
            j0.i(map, "headers");
            this.f33233e = j11;
        }

        @Override // m7.a
        public C0355a a() {
            return this;
        }
    }

    public a(Uri uri, Map<String, String> map, JSONObject jSONObject, long j10) {
        j0.i(uri, ImagesContract.URL);
        j0.i(map, "headers");
        this.f33229a = uri;
        this.f33230b = map;
        this.f33231c = jSONObject;
        this.f33232d = j10;
    }

    public abstract C0355a a();

    public String toString() {
        StringBuilder sbA = defpackage.a.a("BeaconItem{url=");
        sbA.append(this.f33229a);
        sbA.append(", headers=");
        sbA.append(this.f33230b);
        sbA.append(", addTimestamp=");
        sbA.append(this.f33232d);
        return sbA.toString();
    }
}
