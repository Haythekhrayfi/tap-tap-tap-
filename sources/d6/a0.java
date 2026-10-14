package d6;

import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f28649d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28652c;

    public a0(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f28649d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", strSubstring, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.f28650a = strSubstring;
        this.f28651b = str;
        this.f28652c = androidx.activity.j.a(str, "!", str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f28650a.equals(a0Var.f28650a) && this.f28651b.equals(a0Var.f28651b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f28651b, this.f28650a);
    }
}
