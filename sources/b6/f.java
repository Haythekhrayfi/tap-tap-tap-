package b6;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class f {

    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(long j10);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        b6.b.C0056b c0056b = new b6.b.C0056b();
        c0056b.b(0L);
        return c0056b;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
