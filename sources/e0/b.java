package e0;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
import androidx.activity.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocusId f28967b;

    public b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.f28966a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f28967b = new LocusId(str);
        } else {
            this.f28967b = null;
        }
    }

    public static b a(LocusId locusId) {
        i.f(locusId, "locusId cannot be null");
        String id2 = locusId.getId();
        if (TextUtils.isEmpty(id2)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        return new b(id2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        String str = this.f28966a;
        String str2 = ((b) obj).f28966a;
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public int hashCode() {
        String str = this.f28966a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("LocusIdCompat[");
        sbA.append(this.f28966a.length() + "_chars");
        sbA.append("]");
        return sbA.toString();
    }
}
