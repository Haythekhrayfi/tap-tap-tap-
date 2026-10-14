package b6;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class d {

    @AutoValue.Builder
    public static abstract class a {
    }

    public enum b {
        OK,
        BAD_CONFIG
    }

    public abstract f a();

    public abstract String b();

    public abstract String c();

    public abstract b d();

    public abstract String e();
}
