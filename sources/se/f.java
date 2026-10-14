package se;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import ne.r;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    public static final class a extends f implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r f35535c;

        public a(r rVar) {
            this.f35535c = rVar;
        }

        @Override // se.f
        public r a(ne.e eVar) {
            return this.f35535c;
        }

        @Override // se.f
        public d b(ne.g gVar) {
            return null;
        }

        @Override // se.f
        public List<r> c(ne.g gVar) {
            return Collections.singletonList(this.f35535c);
        }

        @Override // se.f
        public boolean d() {
            return true;
        }

        @Override // se.f
        public boolean e(ne.g gVar, r rVar) {
            return this.f35535c.equals(rVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f35535c.equals(((a) obj).f35535c);
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.d() && this.f35535c.equals(bVar.a(ne.e.f33774e));
        }

        public int hashCode() {
            int i10 = this.f35535c.f33835d;
            return ((i10 + 31) ^ (((i10 + 31) ^ 1) ^ 1)) ^ 1;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("FixedRules:");
            sbA.append(this.f35535c);
            return sbA.toString();
        }
    }

    public abstract r a(ne.e eVar);

    public abstract d b(ne.g gVar);

    public abstract List<r> c(ne.g gVar);

    public abstract boolean d();

    public abstract boolean e(ne.g gVar, r rVar);
}
