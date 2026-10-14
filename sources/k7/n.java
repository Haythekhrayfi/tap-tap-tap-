package k7;

/* JADX INFO: loaded from: classes2.dex */
public interface n {

    public static class a implements n {
        @Override // k7.n
        public <T> boolean a(String str, T t10) {
            throw new IllegalStateException("Hawk is not built. Please call build() and wait the initialisation finishes.");
        }

        @Override // k7.n
        public <T> T b(String str, T t10) {
            throw new IllegalStateException("Hawk is not built. Please call build() and wait the initialisation finishes.");
        }
    }

    <T> boolean a(String str, T t10);

    <T> T b(String str, T t10);
}
