package p7;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34581a;

    public p(k kVar) {
        this.f34581a = kVar;
    }

    @Override // ic.a
    public Object get() {
        h hVar = this.f34581a.f34535c;
        Objects.requireNonNull(hVar, "Cannot return null from a non-@Nullable @Provides method");
        return hVar;
    }
}
