package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum u {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");

    public static final b Converter = new b(null);
    private static final uc.l<String, u> FROM_STRING = a.f42931c;
    private final String value;

    public static final class a extends vc.l implements uc.l<String, u> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42931c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public u invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            u uVar = u.TOP;
            if (fd.j0.d(str2, uVar.value)) {
                return uVar;
            }
            u uVar2 = u.CENTER;
            if (fd.j0.d(str2, uVar2.value)) {
                return uVar2;
            }
            u uVar3 = u.BOTTOM;
            if (fd.j0.d(str2, uVar3.value)) {
                return uVar3;
            }
            u uVar4 = u.BASELINE;
            if (fd.j0.d(str2, uVar4.value)) {
                return uVar4;
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

    u(String str) {
        this.value = str;
    }
}
