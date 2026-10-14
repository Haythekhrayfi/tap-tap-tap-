package a5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f117c;

    public l(Class<?> cls, int i10, int i11) {
        Objects.requireNonNull(cls, "Null dependency anInterface.");
        this.f115a = cls;
        this.f116b = i10;
        this.f117c = i11;
    }

    public boolean a() {
        return this.f116b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f115a == lVar.f115a && this.f116b == lVar.f116b && this.f117c == lVar.f117c;
    }

    public int hashCode() {
        return ((((this.f115a.hashCode() ^ 1000003) * 1000003) ^ this.f116b) * 1000003) ^ this.f117c;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f115a);
        sb2.append(", type=");
        int i10 = this.f116b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f117c;
        if (i11 == 0) {
            str2 = "direct";
        } else if (i11 == 1) {
            str2 = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(android.support.v4.media.a.a("Unsupported injection: ", i11));
            }
            str2 = "deferred";
        }
        return androidx.activity.k.a(sb2, str2, "}");
    }
}
