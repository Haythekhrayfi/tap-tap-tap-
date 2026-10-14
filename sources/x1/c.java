package x1;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<a> f37396a = new HashSet();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f37397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f37398b;

        public a(Uri uri, boolean z10) {
            this.f37397a = uri;
            this.f37398b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f37398b == aVar.f37398b && this.f37397a.equals(aVar.f37397a);
        }

        public int hashCode() {
            return (this.f37397a.hashCode() * 31) + (this.f37398b ? 1 : 0);
        }
    }

    public int a() {
        return this.f37396a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f37396a.equals(((c) obj).f37396a);
    }

    public int hashCode() {
        return this.f37396a.hashCode();
    }
}
