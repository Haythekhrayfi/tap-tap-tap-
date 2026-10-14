package hd;

import java.util.ArrayList;
import kd.f0;
import kd.z;

/* JADX INFO: loaded from: classes3.dex */
public class m<E> extends a<E> {
    public m(uc.l<? super E, jc.w> lVar) {
        super(lVar);
    }

    @Override // hd.c
    public final boolean h() {
        return false;
    }

    @Override // hd.c
    public final boolean i() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hd.c
    public Object j(E e10) {
        s sVar;
        do {
            Object objJ = super.j(e10);
            z zVar = b.f31081b;
            if (objJ == zVar) {
                return zVar;
            }
            if (objJ != b.f31082c) {
                if (objJ instanceof i) {
                    return objJ;
                }
                throw new IllegalStateException(fd.j.a("Invalid offerInternal result ", objJ));
            }
            kd.i iVar = this.f31088d;
            c.a aVar = new c.a(e10);
            while (true) {
                kd.k kVarP = iVar.p();
                if (kVarP instanceof s) {
                    sVar = (s) kVarP;
                    break;
                }
                if (kVarP.k(aVar, iVar)) {
                    sVar = null;
                    break;
                }
            }
            if (sVar == null) {
                return b.f31081b;
            }
        } while (!(sVar instanceof i));
        return sVar;
    }

    @Override // hd.a
    public final boolean p() {
        return true;
    }

    @Override // hd.a
    public final boolean q() {
        return true;
    }

    @Override // hd.a
    public void w(Object obj, i<?> iVar) {
        f0 f0VarA = null;
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                f0 f0VarA2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    u uVar = (u) arrayList.get(size);
                    if (uVar instanceof c.a) {
                        uc.l<E, jc.w> lVar = this.f31087c;
                        f0VarA2 = lVar != null ? kd.t.a(lVar, ((c.a) uVar).f31089f, f0VarA2) : null;
                    } else {
                        uVar.y(iVar);
                    }
                }
                f0VarA = f0VarA2;
            } else {
                u uVar2 = (u) obj;
                if (uVar2 instanceof c.a) {
                    uc.l<E, jc.w> lVar2 = this.f31087c;
                    if (lVar2 != null) {
                        f0VarA = kd.t.a(lVar2, ((c.a) uVar2).f31089f, null);
                    }
                } else {
                    uVar2.y(iVar);
                }
            }
        }
        if (f0VarA != null) {
            throw f0VarA;
        }
    }
}
