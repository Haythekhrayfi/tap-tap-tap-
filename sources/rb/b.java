package rb;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static int a(int i10, String str) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i10);
    }
}
