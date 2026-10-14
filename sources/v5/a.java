package v5;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f36681b;

    public a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f36680a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f36681b = list;
    }

    @Override // v5.j
    public List<String> a() {
        return this.f36681b;
    }

    @Override // v5.j
    public String b() {
        return this.f36680a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f36680a.equals(jVar.b()) && this.f36681b.equals(jVar.a());
    }

    public int hashCode() {
        return ((this.f36680a.hashCode() ^ 1000003) * 1000003) ^ this.f36681b.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("HeartBeatResult{userAgent=");
        sbA.append(this.f36680a);
        sbA.append(", usedDates=");
        sbA.append(this.f36681b);
        sbA.append("}");
        return sbA.toString();
    }
}
