package n0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f33599a = new d(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f33600b = new d(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f33601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f33602d;

    public static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33603a = new a();

        /* JADX WARN: Code duplicated, block: B:11:0x001d  */
        /* JADX WARN: Code duplicated, block: B:12:0x001f  */
        @Override // n0.f.b
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                e eVar = f.f33599a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i13 = 1;
                                break;
                            case 16:
                            case 17:
                                i13 = 0;
                                break;
                            default:
                                i13 = 2;
                                break;
                        }
                    } else {
                        i13 = 0;
                    }
                } else {
                    i13 = 1;
                }
                i10++;
            }
            return i13;
        }
    }

    public interface b {
        int a(CharSequence charSequence, int i10, int i11);
    }

    public static abstract class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f33604a;

        public c(b bVar) {
            this.f33604a = bVar;
        }

        public abstract boolean a();

        public boolean b(CharSequence charSequence, int i10, int i11) {
            if (i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f33604a;
            if (bVar == null) {
                return a();
            }
            int iA = bVar.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }
    }

    public static class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f33605b;

        public d(b bVar, boolean z10) {
            super(bVar);
            this.f33605b = z10;
        }

        @Override // n0.f.c
        public boolean a() {
            return this.f33605b;
        }
    }

    static {
        a aVar = a.f33603a;
        f33601c = new d(aVar, false);
        f33602d = new d(aVar, true);
    }
}
