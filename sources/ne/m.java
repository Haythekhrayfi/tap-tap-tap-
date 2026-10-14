package ne;

import fd.z;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends oe.e implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f33813f = new m(0, 0, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f33814g = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33817e;

    public m(int i10, int i11, int i12) {
        this.f33815c = i10;
        this.f33816d = i11;
        this.f33817e = i12;
    }

    public static m b(CharSequence charSequence) {
        z.B(charSequence, "text");
        Matcher matcher = f33814g.matcher(charSequence);
        if (matcher.matches()) {
            int i10 = "-".equals(matcher.group(1)) ? -1 : 1;
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.group(3);
            String strGroup3 = matcher.group(4);
            String strGroup4 = matcher.group(5);
            if (strGroup != null || strGroup2 != null || strGroup3 != null || strGroup4 != null) {
                try {
                    int iC = c(charSequence, strGroup, i10);
                    int iC2 = c(charSequence, strGroup2, i10);
                    int iC3 = z.C(c(charSequence, strGroup4, i10), z.E(c(charSequence, strGroup3, i10), 7));
                    return ((iC | iC2) | iC3) == 0 ? f33813f : new m(iC, iC2, iC3);
                } catch (NumberFormatException e10) {
                    throw ((pe.d) new pe.d("Text cannot be parsed to a Period", charSequence, 0).initCause(e10));
                }
            }
        }
        throw new pe.d("Text cannot be parsed to a Period", charSequence, 0);
    }

    public static int c(CharSequence charSequence, String str, int i10) {
        if (str == null) {
            return 0;
        }
        try {
            return z.E(Integer.parseInt(str), i10);
        } catch (ArithmeticException e10) {
            throw ((pe.d) new pe.d("Text cannot be parsed to a Period", charSequence, 0).initCause(e10));
        }
    }

    private Object readResolve() {
        return ((this.f33815c | this.f33816d) | this.f33817e) == 0 ? f33813f : this;
    }

    public re.d a(re.d dVar) {
        long j10;
        re.b bVar;
        int i10 = this.f33815c;
        if (i10 != 0) {
            int i11 = this.f33816d;
            if (i11 != 0) {
                dVar = ((e) dVar).b((((long) i10) * 12) + ((long) i11), re.b.MONTHS);
            } else {
                j10 = i10;
                bVar = re.b.YEARS;
                dVar = ((e) dVar).b(j10, bVar);
            }
        } else {
            int i12 = this.f33816d;
            if (i12 != 0) {
                j10 = i12;
                bVar = re.b.MONTHS;
                dVar = ((e) dVar).b(j10, bVar);
            }
        }
        int i13 = this.f33817e;
        if (i13 == 0) {
            return dVar;
        }
        return ((e) dVar).b(i13, re.b.DAYS);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f33815c == mVar.f33815c && this.f33816d == mVar.f33816d && this.f33817e == mVar.f33817e;
    }

    public int hashCode() {
        return Integer.rotateLeft(this.f33817e, 16) + Integer.rotateLeft(this.f33816d, 8) + this.f33815c;
    }

    public String toString() {
        if (this == f33813f) {
            return "P0D";
        }
        StringBuilder sbA = o2.b.a('P');
        int i10 = this.f33815c;
        if (i10 != 0) {
            sbA.append(i10);
            sbA.append('Y');
        }
        int i11 = this.f33816d;
        if (i11 != 0) {
            sbA.append(i11);
            sbA.append('M');
        }
        int i12 = this.f33817e;
        if (i12 != 0) {
            sbA.append(i12);
            sbA.append('D');
        }
        return sbA.toString();
    }
}
