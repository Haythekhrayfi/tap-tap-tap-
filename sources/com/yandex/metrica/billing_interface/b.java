package com.yandex.metrica.billing_interface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f13515c = Pattern.compile("P(\\d+)(\\S+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f13517b;

    public enum a {
        TIME_UNIT_UNKNOWN,
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    public b(int i10, a aVar) {
        this.f13516a = i10;
        this.f13517b = aVar;
    }

    public static b a(String str) {
        a aVar;
        Matcher matcher = f13515c.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        if (strGroup == null || strGroup2 == null) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(strGroup);
            char cCharAt = strGroup2.charAt(0);
            if (cCharAt == 'D') {
                aVar = a.DAY;
            } else if (cCharAt == 'M') {
                aVar = a.MONTH;
            } else if (cCharAt != 'W') {
                aVar = cCharAt != 'Y' ? a.TIME_UNIT_UNKNOWN : a.YEAR;
            } else {
                aVar = a.WEEK;
            }
            return new b(i10, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13516a == bVar.f13516a && this.f13517b == bVar.f13517b;
    }

    public int hashCode() {
        return this.f13517b.hashCode() + ((this.f13516a + 0) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Period{number=");
        sbA.append(this.f13516a);
        sbA.append("timeUnit=");
        sbA.append(this.f13517b);
        sbA.append("}");
        return sbA.toString();
    }
}
