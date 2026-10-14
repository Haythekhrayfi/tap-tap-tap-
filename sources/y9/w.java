package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum w {
    LINEAR("linear"),
    EASE("ease"),
    EASE_IN("ease_in"),
    EASE_OUT("ease_out"),
    EASE_IN_OUT("ease_in_out"),
    SPRING("spring");

    private final String value;
    public static final b Converter = new b(null);
    private static final uc.l<String, w> FROM_STRING = a.f43594c;

    public static final class a extends vc.l implements uc.l<String, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43594c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public w invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            w wVar = w.LINEAR;
            if (fd.j0.d(str2, wVar.value)) {
                return wVar;
            }
            w wVar2 = w.EASE;
            if (fd.j0.d(str2, wVar2.value)) {
                return wVar2;
            }
            w wVar3 = w.EASE_IN;
            if (fd.j0.d(str2, wVar3.value)) {
                return wVar3;
            }
            w wVar4 = w.EASE_OUT;
            if (fd.j0.d(str2, wVar4.value)) {
                return wVar4;
            }
            w wVar5 = w.EASE_IN_OUT;
            if (fd.j0.d(str2, wVar5.value)) {
                return wVar5;
            }
            w wVar6 = w.SPRING;
            if (fd.j0.d(str2, wVar6.value)) {
                return wVar6;
            }
            return null;
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    w(String str) {
        this.value = str;
    }
}
