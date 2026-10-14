package g6;

import androidx.activity.k;
import java.util.Objects;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30009b;

    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f30008a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f30009b = str2;
    }

    @Override // g6.d
    @Nonnull
    public String a() {
        return this.f30008a;
    }

    @Override // g6.d
    @Nonnull
    public String b() {
        return this.f30009b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f30008a.equals(dVar.a()) && this.f30009b.equals(dVar.b());
    }

    public int hashCode() {
        return ((this.f30008a.hashCode() ^ 1000003) * 1000003) ^ this.f30009b.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("LibraryVersion{libraryName=");
        sbA.append(this.f30008a);
        sbA.append(", version=");
        return k.a(sbA, this.f30009b, "}");
    }
}
