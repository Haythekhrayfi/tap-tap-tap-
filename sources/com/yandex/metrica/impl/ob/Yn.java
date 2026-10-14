package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Yn extends Cdo<Vj> {

    public static class a implements eo<Vj> {
        @Override // com.yandex.metrica.impl.ob.eo
        public Cdo a(Vj vj) {
            return new Yn(vj);
        }
    }

    public Yn(Vj vj) {
        super(vj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.impl.ob.Cdo
    public boolean a(Cdo<Vj> cdo) {
        Vj vj = cdo.f15980a;
        T t10 = this.f15980a;
        if (t10 == vj) {
            return true;
        }
        if (((Vj) t10).c() != vj.c()) {
            return false;
        }
        if (((Vj) this.f15980a).k() == null ? vj.k() != null : !((Vj) this.f15980a).k().equals(vj.k())) {
            return false;
        }
        if (((Vj) this.f15980a).l() == null ? vj.l() != null : !((Vj) this.f15980a).l().equals(vj.l())) {
            return false;
        }
        if (((Vj) this.f15980a).e() == null ? vj.e() != null : !((Vj) this.f15980a).e().equals(vj.e())) {
            return false;
        }
        if (((Vj) this.f15980a).b() == null ? vj.b() != null : !((Vj) this.f15980a).b().equals(vj.b())) {
            return false;
        }
        if (((Vj) this.f15980a).m() == null ? vj.m() != null : !((Vj) this.f15980a).m().equals(vj.m())) {
            return false;
        }
        if (((Vj) this.f15980a).o() != null) {
            return ((Vj) this.f15980a).o().equals(vj.o());
        }
        return vj.o() == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        return ((((Vj) this.f15980a).c() + ((((((((((((Vj) this.f15980a).k() != null ? ((Vj) this.f15980a).k().hashCode() : 0) * 31) + (((Vj) this.f15980a).l() != null ? ((Vj) this.f15980a).l().hashCode() : 0)) * 31) + (((Vj) this.f15980a).e() != null ? ((Vj) this.f15980a).e().hashCode() : 0)) * 31) + (((Vj) this.f15980a).b() != null ? ((Vj) this.f15980a).b().hashCode() : 0)) * 31) + (((Vj) this.f15980a).m() != null ? ((Vj) this.f15980a).m().hashCode() : 0)) * 31)) * 31) + (((Vj) this.f15980a).o() != null ? ((Vj) this.f15980a).o().hashCode() : 0);
    }
}
