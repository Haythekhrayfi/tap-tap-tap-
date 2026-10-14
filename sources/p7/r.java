package p7;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34587a;

    public r(k kVar) {
        this.f34587a = kVar;
    }

    @Override // ic.a
    public Object get() {
        n0 n0Var = this.f34587a.f34541i;
        Objects.requireNonNull(n0Var, "Cannot return null from a non-@Nullable @Provides method");
        return n0Var;
    }
}
