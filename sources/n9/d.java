package n9;

import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.a f33720b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, c.a aVar) {
            super(null);
            j0.i(aVar, "itemSize");
            this.f33719a = i10;
            this.f33720b = aVar;
        }

        @Override // n9.d
        public int a() {
            return this.f33719a;
        }

        @Override // n9.d
        public c b() {
            return this.f33720b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f33719a == aVar.f33719a && j0.d(this.f33720b, aVar.f33720b);
        }

        public int hashCode() {
            return this.f33720b.hashCode() + (Integer.hashCode(this.f33719a) * 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Circle(color=");
            sbA.append(this.f33719a);
            sbA.append(", itemSize=");
            sbA.append(this.f33720b);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.b f33722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f33723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f33724d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, c.b bVar, float f10, int i11) {
            super(null);
            j0.i(bVar, "itemSize");
            this.f33721a = i10;
            this.f33722b = bVar;
            this.f33723c = f10;
            this.f33724d = i11;
        }

        @Override // n9.d
        public int a() {
            return this.f33721a;
        }

        @Override // n9.d
        public c b() {
            return this.f33722b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f33721a == bVar.f33721a && j0.d(this.f33722b, bVar.f33722b) && j0.d(Float.valueOf(this.f33723c), Float.valueOf(bVar.f33723c)) && this.f33724d == bVar.f33724d;
        }

        public int hashCode() {
            return Integer.hashCode(this.f33724d) + ((Float.hashCode(this.f33723c) + ((this.f33722b.hashCode() + (Integer.hashCode(this.f33721a) * 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("RoundedRect(color=");
            sbA.append(this.f33721a);
            sbA.append(", itemSize=");
            sbA.append(this.f33722b);
            sbA.append(", strokeWidth=");
            sbA.append(this.f33723c);
            sbA.append(", strokeColor=");
            return h0.f.a(sbA, this.f33724d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public d() {
    }

    public d(vc.g gVar) {
    }

    public abstract int a();

    public abstract c b();
}
