package c4;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f3596a;

        public b() {
            super(null);
        }

        @Override // c4.d
        public void a() {
            if (this.f3596a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public d(a aVar) {
    }

    public abstract void a();
}
