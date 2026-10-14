package g3;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f29859a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f29860b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f29861c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f29862d;

    public class a extends k {
        @Override // g3.k
        public boolean a() {
            return true;
        }

        @Override // g3.k
        public boolean b() {
            return true;
        }

        @Override // g3.k
        public boolean c(com.bumptech.glide.load.a aVar) {
            return aVar == com.bumptech.glide.load.a.REMOTE;
        }

        @Override // g3.k
        public boolean d(boolean z10, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return (aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || aVar == com.bumptech.glide.load.a.MEMORY_CACHE) ? false : true;
        }
    }

    public class b extends k {
        @Override // g3.k
        public boolean a() {
            return false;
        }

        @Override // g3.k
        public boolean b() {
            return false;
        }

        @Override // g3.k
        public boolean c(com.bumptech.glide.load.a aVar) {
            return false;
        }

        @Override // g3.k
        public boolean d(boolean z10, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return false;
        }
    }

    public class c extends k {
        @Override // g3.k
        public boolean a() {
            return true;
        }

        @Override // g3.k
        public boolean b() {
            return false;
        }

        @Override // g3.k
        public boolean c(com.bumptech.glide.load.a aVar) {
            return (aVar == com.bumptech.glide.load.a.DATA_DISK_CACHE || aVar == com.bumptech.glide.load.a.MEMORY_CACHE) ? false : true;
        }

        @Override // g3.k
        public boolean d(boolean z10, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return false;
        }
    }

    public class d extends k {
        @Override // g3.k
        public boolean a() {
            return false;
        }

        @Override // g3.k
        public boolean b() {
            return true;
        }

        @Override // g3.k
        public boolean c(com.bumptech.glide.load.a aVar) {
            return false;
        }

        @Override // g3.k
        public boolean d(boolean z10, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return (aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || aVar == com.bumptech.glide.load.a.MEMORY_CACHE) ? false : true;
        }
    }

    public class e extends k {
        @Override // g3.k
        public boolean a() {
            return true;
        }

        @Override // g3.k
        public boolean b() {
            return true;
        }

        @Override // g3.k
        public boolean c(com.bumptech.glide.load.a aVar) {
            return aVar == com.bumptech.glide.load.a.REMOTE;
        }

        @Override // g3.k
        public boolean d(boolean z10, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return ((z10 && aVar == com.bumptech.glide.load.a.DATA_DISK_CACHE) || aVar == com.bumptech.glide.load.a.LOCAL) && cVar == com.bumptech.glide.load.c.TRANSFORMED;
        }
    }

    static {
        new d();
        f29862d = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(com.bumptech.glide.load.a aVar);

    public abstract boolean d(boolean z10, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar);
}
