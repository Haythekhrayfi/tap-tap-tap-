package g5;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f29981c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k5.c f29982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g5.a f29983b;

    public static final class b implements g5.a {
        public b(a aVar) {
        }

        @Override // g5.a
        public void a() {
        }

        @Override // g5.a
        public String b() {
            return null;
        }

        @Override // g5.a
        public void c(long j10, String str) {
        }
    }

    public c(k5.c cVar) {
        this.f29982a = cVar;
        this.f29983b = f29981c;
    }

    public c(k5.c cVar, String str) {
        this(cVar);
        a(str);
    }

    public final void a(String str) {
        this.f29983b.a();
        this.f29983b = f29981c;
        if (str == null) {
            return;
        }
        this.f29983b = new f(this.f29982a.g(str, "userlog"), 65536);
    }
}
