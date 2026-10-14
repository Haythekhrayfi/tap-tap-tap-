package p7;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34579a;

    public o(k kVar) {
        this.f34579a = kVar;
    }

    @Override // ic.a
    public Object get() {
        g gVar = this.f34579a.f34539g;
        Objects.requireNonNull(gVar, "Cannot return null from a non-@Nullable @Provides method");
        return gVar;
    }
}
