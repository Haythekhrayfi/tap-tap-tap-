package y8;

/* JADX INFO: loaded from: classes2.dex */
public final class l {
    public static final int a(double d10) {
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new IllegalArgumentException();
        }
        return (int) ((d10 * ((double) 255.0f)) + ((double) 0.5f));
    }
}
