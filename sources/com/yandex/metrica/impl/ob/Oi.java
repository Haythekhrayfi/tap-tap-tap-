package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IParamsCallback;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f14649a = kc.h0.c(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Om f14650b = new Nm();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1936ri f14651c = new C1936ri();

    public static final Collection<String> a(Collection<String> collection) {
        Set<String> set = f14649a;
        fd.j0.i(collection, "<this>");
        fd.j0.i(set, "other");
        Set setK = kc.t.K(collection);
        fd.j0.i(setK, "<this>");
        fd.j0.i(set, "elements");
        fd.j0.i(set, "<this>");
        fd.j0.i(setK, "source");
        vc.f0.a(setK).retainAll(set);
        return setK;
    }

    public static final boolean a(long j10) {
        return f14650b.b() > j10;
    }

    public static final boolean a(Qi qi) {
        return a(qi.V()) && a(qi.i()) && a(qi.k());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    public static final boolean a(Qi qi, Collection<String> collection, Map<String, String> map, uc.a<Q> aVar) {
        boolean zA;
        String strI;
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "yandex_mobile_metrica_device_id":
                        strI = qi.i();
                        zA = a(strI);
                        break;
                    case "appmetrica_device_id_hash":
                        strI = qi.k();
                        zA = a(strI);
                        break;
                    case "yandex_mobile_metrica_report_ad_url":
                        strI = qi.G();
                        zA = a(strI);
                        break;
                    case "yandex_mobile_metrica_clids":
                        zA = f14651c.a(map, qi, aVar.invoke());
                        break;
                    case "yandex_mobile_metrica_uuid":
                        strI = qi.V();
                        zA = a(strI);
                        break;
                    case "yandex_mobile_metrica_get_ad_url":
                        strI = qi.q();
                        zA = a(strI);
                        break;
                    default:
                        zA = !b(qi);
                        break;
                }
                if (!zA) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    public static final boolean b(Qi qi) {
        if (!qi.D()) {
            if (!(f14650b.b() > qi.C() + ((long) qi.O().a()))) {
                return false;
            }
        }
        return true;
    }
}
