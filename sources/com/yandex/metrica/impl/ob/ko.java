package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
class ko extends Cdo<Z2> {
    public ko(lo loVar, Z2 z10) {
        super(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.impl.ob.Cdo
    public boolean a(Cdo<Z2> cdo) {
        String str = ((Z2) this.f15980a).f15607a;
        if (str == null ? cdo.f15980a.f15607a != null : !str.equals(cdo.f15980a.f15607a)) {
            return false;
        }
        String str2 = ((Z2) this.f15980a).f15608b;
        String str3 = cdo.f15980a.f15608b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = ((Z2) this.f15980a).f15607a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = ((Z2) this.f15980a).f15608b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
