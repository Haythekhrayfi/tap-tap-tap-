package ue;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f36418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<?> f36419b;

    public j(Method method, List<?> list) {
        this.f36418a = method;
        this.f36419b = Collections.unmodifiableList(list);
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f36418a.getDeclaringClass().getName(), this.f36418a.getName(), this.f36419b);
    }
}
