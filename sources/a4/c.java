package a4;

import java.security.MessageDigest;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f76b;

    public c(Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f76b = obj;
    }

    @Override // d3.c
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f76b.toString().getBytes(d3.c.f28632a));
    }

    @Override // d3.c
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f76b.equals(((c) obj).f76b);
        }
        return false;
    }

    @Override // d3.c
    public int hashCode() {
        return this.f76b.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ObjectKey{object=");
        sbA.append(this.f76b);
        sbA.append('}');
        return sbA.toString();
    }
}
