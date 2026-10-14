package ne;

import com.google.android.material.datepicker.UtcDates;
import fd.z;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, String> f33829c;

    static {
        HashMap map = new HashMap();
        map.put("ACT", "Australia/Darwin");
        map.put("AET", "Australia/Sydney");
        map.put("AGT", "America/Argentina/Buenos_Aires");
        map.put("ART", "Africa/Cairo");
        map.put("AST", "America/Anchorage");
        map.put("BET", "America/Sao_Paulo");
        map.put("BST", "Asia/Dhaka");
        map.put("CAT", "Africa/Harare");
        map.put("CNT", "America/St_Johns");
        map.put("CST", "America/Chicago");
        map.put("CTT", "Asia/Shanghai");
        map.put("EAT", "Africa/Addis_Ababa");
        map.put("ECT", "Europe/Paris");
        map.put("IET", "America/Indiana/Indianapolis");
        map.put("IST", "Asia/Kolkata");
        map.put("JST", "Asia/Tokyo");
        map.put("MIT", "Pacific/Apia");
        map.put("NET", "Asia/Yerevan");
        map.put("NST", "Pacific/Auckland");
        map.put("PLT", "Asia/Karachi");
        map.put("PNT", "America/Phoenix");
        map.put("PRT", "America/Puerto_Rico");
        map.put("PST", "America/Los_Angeles");
        map.put("SST", "Pacific/Guadalcanal");
        map.put("VST", "Asia/Ho_Chi_Minh");
        map.put("EST", "-05:00");
        map.put("MST", "-07:00");
        map.put("HST", "-10:00");
        f33829c = Collections.unmodifiableMap(map);
    }

    public q() {
        if (getClass() != r.class && getClass() != s.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static q f(re.e eVar) {
        q qVar = (q) eVar.query(re.j.f35376d);
        if (qVar != null) {
            return qVar;
        }
        throw new a("Unable to obtain ZoneId from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    public static q i(String str, Map<String, String> map) {
        s sVar;
        s sVar2;
        z.B(str, "zoneId");
        z.B(map, "aliasMap");
        String str2 = map.get(str);
        if (str2 != null) {
            str = str2;
        }
        z.B(str, "zoneId");
        if (str.equals("Z")) {
            return r.f33832h;
        }
        if (str.length() == 1) {
            throw new a(i.f.a("Invalid zone: ", str));
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            return r.l(str);
        }
        if (str.equals(UtcDates.UTC) || str.equals("GMT") || str.equals("UT")) {
            return new s(str, r.f33832h.h());
        }
        if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
            r rVarL = r.l(str.substring(3));
            if (rVarL.f33835d == 0) {
                sVar = new s(str.substring(0, 3), rVarL.h());
            } else {
                sVar = new s(str.substring(0, 3) + rVarL.f33836e, rVarL.h());
            }
            return sVar;
        }
        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
            return s.k(str, true);
        }
        r rVarL2 = r.l(str.substring(2));
        if (rVarL2.f33835d == 0) {
            sVar2 = new s("UT", rVarL2.h());
        } else {
            StringBuilder sbA = defpackage.a.a("UT");
            sbA.append(rVarL2.f33836e);
            sVar2 = new s(sbA.toString(), rVarL2.h());
        }
        return sVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return g().equals(((q) obj).g());
        }
        return false;
    }

    public abstract String g();

    public abstract se.f h();

    public int hashCode() {
        return g().hashCode();
    }

    public abstract void j(DataOutput dataOutput) throws IOException;

    public String toString() {
        return g();
    }
}
