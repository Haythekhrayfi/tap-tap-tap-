package p7;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34598a;

    public v(k kVar) {
        this.f34598a = kVar;
    }

    @Override // ic.a
    public Object get() {
        z7.d dVar = this.f34598a.f34533a;
        Objects.requireNonNull(dVar, "Cannot return null from a non-@Nullable @Provides method");
        return dVar;
    }
}
