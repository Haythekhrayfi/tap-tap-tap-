package n9;

import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public interface b {

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f33712a;

        public a(float f10) {
            this.f33712a = f10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && j0.d(Float.valueOf(this.f33712a), Float.valueOf(((a) obj).f33712a));
        }

        public int hashCode() {
            return Float.hashCode(this.f33712a);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Default(spaceBetweenCenters=");
            sbA.append(this.f33712a);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    /* JADX INFO: renamed from: n9.b$b, reason: collision with other inner class name */
    public static final class C0368b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f33713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f33714b;

        public C0368b(float f10, int i10) {
            this.f33713a = f10;
            this.f33714b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0368b)) {
                return false;
            }
            C0368b c0368b = (C0368b) obj;
            return j0.d(Float.valueOf(this.f33713a), Float.valueOf(c0368b.f33713a)) && this.f33714b == c0368b.f33714b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f33714b) + (Float.hashCode(this.f33713a) * 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Stretch(itemSpacing=");
            sbA.append(this.f33713a);
            sbA.append(", maxVisibleItems=");
            return h0.f.a(sbA, this.f33714b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }
}
