package a6;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f158a = 0;

    @AutoValue.Builder
    public static abstract class a {
        public abstract d a();

        public abstract a b(String str);

        public abstract a c(long j10);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(c.a aVar);

        public abstract a h(long j10);
    }

    static {
        a6.a.b bVar = new a6.a.b();
        bVar.h(0L);
        bVar.g(c.a.ATTEMPT_MIGRATION);
        bVar.c(0L);
        bVar.a();
    }

    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract c.a f();

    public abstract long g();

    public boolean h() {
        return f() == c.a.REGISTER_ERROR;
    }

    public boolean i() {
        return f() == c.a.NOT_GENERATED || f() == c.a.ATTEMPT_MIGRATION;
    }

    public boolean j() {
        return f() == c.a.REGISTERED;
    }

    public abstract a k();
}
