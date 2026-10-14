package q5;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Object> f34780b;

    public d(String str, Map<Class<?>, Object> map) {
        this.f34779a = str;
        this.f34780b = map;
    }

    public d(String str, Map map, a aVar) {
        this.f34779a = str;
        this.f34780b = map;
    }

    public static d a(String str) {
        return new d(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f34779a.equals(dVar.f34779a) && this.f34780b.equals(dVar.f34780b);
    }

    public int hashCode() {
        return this.f34780b.hashCode() + (this.f34779a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("FieldDescriptor{name=");
        sbA.append(this.f34779a);
        sbA.append(", properties=");
        sbA.append(this.f34780b.values());
        sbA.append("}");
        return sbA.toString();
    }
}
