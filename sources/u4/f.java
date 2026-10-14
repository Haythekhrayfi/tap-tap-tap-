package u4;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f36029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f36030g;

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f36025b = str;
        this.f36024a = str2;
        this.f36026c = str3;
        this.f36027d = str4;
        this.f36028e = str5;
        this.f36029f = str6;
        this.f36030g = str7;
    }

    public static f a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new f(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equal(this.f36025b, fVar.f36025b) && Objects.equal(this.f36024a, fVar.f36024a) && Objects.equal(this.f36026c, fVar.f36026c) && Objects.equal(this.f36027d, fVar.f36027d) && Objects.equal(this.f36028e, fVar.f36028e) && Objects.equal(this.f36029f, fVar.f36029f) && Objects.equal(this.f36030g, fVar.f36030g);
    }

    public int hashCode() {
        return Objects.hashCode(this.f36025b, this.f36024a, this.f36026c, this.f36027d, this.f36028e, this.f36029f, this.f36030g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f36025b).add("apiKey", this.f36024a).add("databaseUrl", this.f36026c).add("gcmSenderId", this.f36028e).add("storageBucket", this.f36029f).add("projectId", this.f36030g).toString();
    }
}
