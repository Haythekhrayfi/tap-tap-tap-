package p7;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34600a;

    public w(k kVar) {
        this.f34600a = kVar;
    }

    @Override // ic.a
    public Object get() {
        c1 c1Var = this.f34600a.f34544l;
        Objects.requireNonNull(c1Var, "Cannot return null from a non-@Nullable @Provides method");
        return c1Var;
    }
}
