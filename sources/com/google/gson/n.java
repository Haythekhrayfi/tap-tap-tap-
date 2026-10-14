package com.google.gson;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f12899b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12900a;

    public n(Boolean bool) {
        i(bool);
    }

    public n(Character ch2) {
        i(ch2);
    }

    public n(Number number) {
        i(number);
    }

    public n(String str) {
        i(str);
    }

    public static boolean h(n nVar) {
        Object obj = nVar.f12900a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public boolean e() {
        Object obj = this.f12900a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(g());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f12900a == null) {
            return nVar.f12900a == null;
        }
        if (h(this) && h(nVar)) {
            return f().longValue() == nVar.f().longValue();
        }
        Object obj2 = this.f12900a;
        if (!(obj2 instanceof Number) || !(nVar.f12900a instanceof Number)) {
            return obj2.equals(nVar.f12900a);
        }
        double dDoubleValue = f().doubleValue();
        double dDoubleValue2 = nVar.f().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public Number f() {
        Object obj = this.f12900a;
        return obj instanceof String ? new com.google.gson.internal.q((String) obj) : (Number) obj;
    }

    public String g() {
        Object obj = this.f12900a;
        if (obj instanceof Number) {
            return f().toString();
        }
        return obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f12900a == null) {
            return 31;
        }
        if (h(this)) {
            jDoubleToLongBits = f().longValue();
        } else {
            Object obj = this.f12900a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(f().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    public void i(Object obj) {
        boolean z10;
        boolean z11;
        if (obj instanceof Character) {
            obj = String.valueOf(((Character) obj).charValue());
        } else {
            if (!(obj instanceof Number)) {
                if (!(obj instanceof String)) {
                    Class<?> cls = obj.getClass();
                    Class<?>[] clsArr = f12899b;
                    int length = clsArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            z11 = false;
                            break;
                        } else {
                            if (clsArr[i10].isAssignableFrom(cls)) {
                                z11 = true;
                                break;
                            }
                            i10++;
                        }
                    }
                } else {
                    z11 = true;
                    break;
                }
                z10 = z11;
            }
            x1.q.d(z10);
        }
        this.f12900a = obj;
    }
}
