package tc;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Error {
    public a() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public a(String str) {
        super(str);
    }

    public a(String str, Throwable th) {
        super(str, th);
    }

    public a(Throwable th) {
        super(th);
    }
}
