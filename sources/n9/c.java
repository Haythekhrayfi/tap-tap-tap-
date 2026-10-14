package n9;

import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f33715a;

        public a(float f10) {
            super(null);
            this.f33715a = f10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && j0.d(Float.valueOf(this.f33715a), Float.valueOf(((a) obj).f33715a));
        }

        public int hashCode() {
            return Float.hashCode(this.f33715a);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Circle(radius=");
            sbA.append(this.f33715a);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f33716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f33717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f33718c;

        public b(float f10, float f11, float f12) {
            super(null);
            this.f33716a = f10;
            this.f33717b = f11;
            this.f33718c = f12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return j0.d(Float.valueOf(this.f33716a), Float.valueOf(bVar.f33716a)) && j0.d(Float.valueOf(this.f33717b), Float.valueOf(bVar.f33717b)) && j0.d(Float.valueOf(this.f33718c), Float.valueOf(bVar.f33718c));
        }

        public int hashCode() {
            return Float.hashCode(this.f33718c) + ((Float.hashCode(this.f33717b) + (Float.hashCode(this.f33716a) * 31)) * 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("RoundedRect(itemWidth=");
            sbA.append(this.f33716a);
            sbA.append(", itemHeight=");
            sbA.append(this.f33717b);
            sbA.append(", cornerRadius=");
            sbA.append(this.f33718c);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public c() {
    }

    public c(vc.g gVar) {
    }

    public final float a() {
        if (this instanceof b) {
            return ((b) this).f33717b;
        }
        if (this instanceof a) {
            return ((a) this).f33715a * 2;
        }
        throw new jc.g();
    }

    public final float b() {
        if (this instanceof b) {
            return ((b) this).f33716a;
        }
        if (this instanceof a) {
            return ((a) this).f33715a * 2;
        }
        throw new jc.g();
    }
}
