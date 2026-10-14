package le;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: le.a$a, reason: collision with other inner class name */
    public static final class C0352a {
        public static wd.b a() {
            wd.a aVar = b.f33117a;
            if (aVar != null) {
                return aVar.f37307e;
            }
            throw new IllegalStateException("StandAloneContext Koin instance is null".toString());
        }
    }

    wd.b getKoin();
}
