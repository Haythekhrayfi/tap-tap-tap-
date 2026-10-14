package p7;

import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f34597a;

    public u0(s0 s0Var) {
        this.f34597a = s0Var;
    }

    @Override // ic.a
    public Object get() {
        ExecutorService executorService = this.f34597a.f34591b;
        Objects.requireNonNull(executorService, "Cannot return null from a non-@Nullable @Provides method");
        return executorService;
    }
}
