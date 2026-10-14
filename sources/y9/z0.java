package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum z0 {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");

    public static final b Converter = new b(null);
    private static final uc.l<String, z0> FROM_STRING = a.f44581c;
    private final String value;

    public static final class a extends vc.l implements uc.l<String, z0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44581c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public z0 invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            z0 z0Var = z0.TOP;
            if (fd.j0.d(str2, z0Var.value)) {
                return z0Var;
            }
            z0 z0Var2 = z0.CENTER;
            if (fd.j0.d(str2, z0Var2.value)) {
                return z0Var2;
            }
            z0 z0Var3 = z0.BOTTOM;
            if (fd.j0.d(str2, z0Var3.value)) {
                return z0Var3;
            }
            z0 z0Var4 = z0.BASELINE;
            if (fd.j0.d(str2, z0Var4.value)) {
                return z0Var4;
            }
            z0 z0Var5 = z0.SPACE_BETWEEN;
            if (fd.j0.d(str2, z0Var5.value)) {
                return z0Var5;
            }
            z0 z0Var6 = z0.SPACE_AROUND;
            if (fd.j0.d(str2, z0Var6.value)) {
                return z0Var6;
            }
            z0 z0Var7 = z0.SPACE_EVENLY;
            if (fd.j0.d(str2, z0Var7.value)) {
                return z0Var7;
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

    z0(String str) {
        this.value = str;
    }
}
