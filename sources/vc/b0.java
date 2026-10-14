package vc;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f36991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cd.c[] f36992b;

    static {
        c0 c0Var = null;
        try {
            c0Var = (c0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0Var == null) {
            c0Var = new c0();
        }
        f36991a = c0Var;
        f36992b = new cd.c[0];
    }

    public static cd.c a(Class cls) {
        Objects.requireNonNull(f36991a);
        return new e(cls);
    }
}
