package x8;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f37555c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f37556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f37557b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
        
            if (fd.j0.d(r19, -1L) != false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(z8.d.c.a.InterfaceC0495c r17, java.lang.Object r18, java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 431
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x8.f.a.a(z8.d$c$a$c, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        public final Object b(z8.d.c.a.f fVar, Object obj, Object obj2) {
            double dDoubleValue;
            j0.i(fVar, "operator");
            j0.i(obj, "left");
            j0.i(obj2, "right");
            if ((obj instanceof String) && (obj2 instanceof String)) {
                if (!(fVar instanceof z8.d.c.a.f.b)) {
                    c.c(fVar, obj, obj2);
                    throw null;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(obj2);
                return sb2.toString();
            }
            if (!(obj instanceof Long) || !(obj2 instanceof Long)) {
                if (!(obj instanceof Double) || !(obj2 instanceof Double)) {
                    c.c(fVar, obj, obj2);
                    throw null;
                }
                if (fVar instanceof z8.d.c.a.f.b) {
                    dDoubleValue = ((Number) obj2).doubleValue() + ((Number) obj).doubleValue();
                } else {
                    if (!(fVar instanceof z8.d.c.a.f.C0500a)) {
                        throw new jc.g();
                    }
                    dDoubleValue = ((Number) obj).doubleValue() - ((Number) obj2).doubleValue();
                }
                return Double.valueOf(dDoubleValue);
            }
            if (fVar instanceof z8.d.c.a.f.b) {
                Number number = (Number) obj;
                Number number2 = (Number) obj2;
                long jLongValue = number2.longValue() + number.longValue();
                if (((number.longValue() ^ jLongValue) & (number2.longValue() ^ jLongValue)) >= 0) {
                    return Long.valueOf(jLongValue);
                }
                throw new k(obj + " + " + obj2, null, 2, null);
            }
            if (!(fVar instanceof z8.d.c.a.f.C0500a)) {
                throw new jc.g();
            }
            Number number3 = (Number) obj;
            Number number4 = (Number) obj2;
            long jLongValue2 = number3.longValue() - number4.longValue();
            if (((number3.longValue() ^ number4.longValue()) & (number3.longValue() ^ jLongValue2)) >= 0) {
                return Long.valueOf(jLongValue2);
            }
            throw new k(obj + " - " + obj2, null, 2, null);
        }
    }

    public f(n nVar, j jVar) {
        j0.i(nVar, "variableProvider");
        j0.i(jVar, "functionProvider");
        this.f37556a = nVar;
        this.f37557b = jVar;
    }

    public final <T> T a(x8.a aVar) throws b {
        j0.i(aVar, "expr");
        try {
            return (T) aVar.a(this);
        } catch (b e10) {
            throw e10;
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            throw new b(message, e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    public final <T extends Comparable<? super T>> Object b(z8.d.c.a.InterfaceC0489a interfaceC0489a, T t10, T t11) {
        boolean z10 = true;
        if (interfaceC0489a instanceof z8.d.c.a.InterfaceC0489a.C0491c) {
            if (t10.compareTo(t11) >= 0) {
                z10 = false;
            }
        } else if (interfaceC0489a instanceof z8.d.c.a.InterfaceC0489a.C0492d) {
            if (t10.compareTo(t11) > 0) {
                z10 = false;
            }
        } else if (interfaceC0489a instanceof z8.d.c.a.InterfaceC0489a.b) {
            if (t10.compareTo(t11) < 0) {
                z10 = false;
            }
        } else {
            if (!(interfaceC0489a instanceof z8.d.c.a.InterfaceC0489a.C0490a)) {
                throw new jc.g();
            }
            if (t10.compareTo(t11) <= 0) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
