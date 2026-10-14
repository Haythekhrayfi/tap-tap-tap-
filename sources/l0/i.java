package l0;

/* JADX INFO: loaded from: classes.dex */
public class i extends RuntimeException {
    public i() {
        this(null);
    }

    public i(String str) {
        super(str != null ? str.toString() : "The operation has been canceled.");
    }
}
