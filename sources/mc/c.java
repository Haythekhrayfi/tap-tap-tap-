package mc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import java.io.Serializable;
import java.util.Objects;
import uc.p;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements f, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f33534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.a f33535d;

    public static final class a extends l implements p<String, f.a, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f33536c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public String invoke(String str, f.a aVar) {
            String str2 = str;
            f.a aVar2 = aVar;
            j0.i(str2, "acc");
            j0.i(aVar2, "element");
            if (str2.length() == 0) {
                return aVar2.toString();
            }
            return str2 + ", " + aVar2;
        }
    }

    public c(f fVar, f.a aVar) {
        j0.i(fVar, "left");
        j0.i(aVar, "element");
        this.f33534c = fVar;
        this.f33535d = aVar;
    }

    @Override // mc.f
    public <R> R Y(R r10, p<? super R, ? super f.a, ? extends R> pVar) {
        j0.i(pVar, "operation");
        return pVar.invoke((Object) this.f33534c.Y(r10, pVar), this.f33535d);
    }

    @Override // mc.f
    public <E extends f.a> E b(f.b<E> bVar) {
        j0.i(bVar, Action.KEY_ATTRIBUTE);
        c cVar = this;
        while (true) {
            E e10 = (E) cVar.f33535d.b(bVar);
            if (e10 != null) {
                return e10;
            }
            f fVar = cVar.f33534c;
            if (!(fVar instanceof c)) {
                return (E) fVar.b(bVar);
            }
            cVar = (c) fVar;
        }
    }

    public final int d() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            f fVar = cVar.f33534c;
            cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        boolean zD;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.d() != d()) {
                return false;
            }
            Objects.requireNonNull(cVar);
            c cVar2 = this;
            while (true) {
                f.a aVar = cVar2.f33535d;
                if (!j0.d(cVar.b(aVar.getKey()), aVar)) {
                    zD = false;
                    break;
                }
                f fVar = cVar2.f33534c;
                if (!(fVar instanceof c)) {
                    j0.g(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    f.a aVar2 = (f.a) fVar;
                    zD = j0.d(cVar.b(aVar2.getKey()), aVar2);
                    break;
                }
                cVar2 = (c) fVar;
            }
            if (!zD) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f33535d.hashCode() + this.f33534c.hashCode();
    }

    @Override // mc.f
    public f i(f fVar) {
        j0.i(fVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        return fVar == h.f33539c ? this : (f) fVar.Y(this, g.f33538c);
    }

    @Override // mc.f
    public f p(f.b<?> bVar) {
        j0.i(bVar, Action.KEY_ATTRIBUTE);
        if (this.f33535d.b(bVar) != null) {
            return this.f33534c;
        }
        f fVarP = this.f33534c.p(bVar);
        if (fVarP == this.f33534c) {
            return this;
        }
        return fVarP == h.f33539c ? this.f33535d : new c(fVarP, this.f33535d);
    }

    public String toString() {
        return s.a.a(o2.b.a('['), (String) Y("", a.f33536c), ']');
    }
}
