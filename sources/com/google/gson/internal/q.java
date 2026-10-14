package com.google.gson.internal;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends Number {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12867c;

    public q(String str) {
        this.f12867c = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f12867c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        String str = this.f12867c;
        String str2 = ((q) obj).f12867c;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f12867c);
    }

    public int hashCode() {
        return this.f12867c.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f12867c);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f12867c);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f12867c).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f12867c);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f12867c).longValue();
        }
    }

    public String toString() {
        return this.f12867c;
    }
}
