package y8;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.android.billingclient.api.ProxyBillingActivity;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.gms.ads.AdActivity;
import com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c0 {
    public static final u9.f A(JSONObject jSONObject, String str) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        return new u9.f(u9.g.MISSING_VALUE, androidx.activity.j.a("Value for key '", str, "' is missing"), null, new k9.d(jSONObject), P(jSONObject, 0, 1), 4, null);
    }

    public static final int B(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> gb.x<T> C(gb.x<? extends T> xVar, uc.l<? super gb.x.b, jc.w> lVar) {
        if (!(xVar instanceof gb.x.c)) {
            if (!(xVar instanceof gb.x.b)) {
                throw new jc.g();
            }
            lVar.invoke((gb.x.b) xVar);
        }
        return xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> gb.x<T> D(gb.x<? extends T> xVar, uc.l<? super T, jc.w> lVar) {
        fd.j0.i(xVar, "<this>");
        if (xVar instanceof gb.x.c) {
            lVar.invoke(((gb.x.c) xVar).f30417b);
        } else if (!(xVar instanceof gb.x.b)) {
            throw new jc.g();
        }
        return xVar;
    }

    public static final <T> T E(j9.a<T> aVar, u9.c cVar, String str, JSONObject jSONObject, uc.q<? super String, ? super JSONObject, ? super u9.c, ? extends T> qVar) {
        fd.j0.i(aVar, "<this>");
        fd.j0.i(qVar, "reader");
        if (aVar.f31788a && jSONObject.has(str)) {
            return qVar.b(str, jSONObject, cVar);
        }
        if (aVar instanceof j9.a.e) {
            return ((j9.a.e) aVar).f31792c;
        }
        if (aVar instanceof j9.a.d) {
            return qVar.b(((j9.a.d) aVar).f31791c, jSONObject, cVar);
        }
        throw A(jSONObject, str);
    }

    public static final <T> v9.c<T> F(j9.a<v9.c<T>> aVar, u9.c cVar, String str, JSONObject jSONObject, uc.q<? super String, ? super JSONObject, ? super u9.c, ? extends v9.c<T>> qVar) {
        v9.c<T> cVarB;
        fd.j0.i(aVar, "<this>");
        fd.j0.i(qVar, "reader");
        if (aVar.f31788a && jSONObject.has(str)) {
            cVarB = qVar.b(str, jSONObject, cVar);
        } else if (aVar instanceof j9.a.e) {
            cVarB = ((j9.a.e) aVar).f31792c;
        } else {
            if (!(aVar instanceof j9.a.d)) {
                throw A(jSONObject, str);
            }
            cVarB = qVar.b(((j9.a.d) aVar).f31791c, jSONObject, cVar);
        }
        return cVarB;
    }

    public static final <T> u9.f G(String str, T t10, Throwable th) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        u9.g gVar = u9.g.INVALID_VALUE;
        StringBuilder sbA = defpackage.a.a("Value '");
        sbA.append(R(t10));
        sbA.append("' for key '");
        sbA.append(str);
        sbA.append("' could not be resolved");
        return new u9.f(gVar, sbA.toString(), th, null, null, 24, null);
    }

    public static final <T> T H(j9.a<T> aVar, u9.c cVar, String str, JSONObject jSONObject, uc.q<? super String, ? super JSONObject, ? super u9.c, ? extends T> qVar) {
        fd.j0.i(aVar, "<this>");
        fd.j0.i(qVar, "reader");
        if (aVar.f31788a && jSONObject.has(str)) {
            return qVar.b(str, jSONObject, cVar);
        }
        if (aVar instanceof j9.a.e) {
            return ((j9.a.e) aVar).f31792c;
        }
        if (aVar instanceof j9.a.d) {
            return qVar.b(((j9.a.d) aVar).f31791c, jSONObject, cVar);
        }
        return null;
    }

    public static final <T extends u9.a> T I(u9.b<T> bVar, u9.c cVar, JSONObject jSONObject) {
        fd.j0.i(bVar, "<this>");
        try {
            return (T) bVar.a(cVar, jSONObject);
        } catch (u9.f e10) {
            cVar.a().b(e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    public static final <T> List<T> J(j9.a<? extends List<? extends T>> aVar, u9.c cVar, String str, JSONObject jSONObject, h9.g<T> gVar, uc.q<? super String, ? super JSONObject, ? super u9.c, ? extends List<? extends T>> qVar) {
        List<? extends T> list;
        List<? extends T> listB;
        fd.j0.i(aVar, "<this>");
        fd.j0.i(gVar, "validator");
        fd.j0.i(qVar, "reader");
        if (aVar.f31788a && jSONObject.has(str)) {
            listB = qVar.b(str, jSONObject, cVar);
        } else {
            if (!(aVar instanceof j9.a.e)) {
                if (aVar instanceof j9.a.d) {
                    listB = qVar.b(((j9.a.d) aVar).f31791c, jSONObject, cVar);
                } else {
                    list = null;
                }
                if (list == null) {
                    return null;
                }
                if (gVar.isValid(list)) {
                    return (List<T>) list;
                }
                cVar.a().b(q(jSONObject, str, list));
                return null;
            }
            listB = ((j9.a.e) aVar).f31792c;
        }
        list = listB;
        if (list == null) {
            return null;
        }
        if (gVar.isValid(list)) {
            return (List<T>) list;
        }
        cVar.a().b(q(jSONObject, str, list));
        return null;
    }

    public static final <T extends u9.a> T K(j9.a<? extends u9.b<T>> aVar, u9.c cVar, String str, JSONObject jSONObject, uc.q<? super String, ? super JSONObject, ? super u9.c, ? extends T> qVar) {
        T tB;
        fd.j0.i(aVar, "<this>");
        fd.j0.i(qVar, "reader");
        if (aVar.f31788a && jSONObject.has(str)) {
            tB = qVar.b(str, jSONObject, cVar);
        } else {
            if (aVar instanceof j9.a.e) {
                return (T) I((u9.b) ((j9.a.e) aVar).f31792c, cVar, jSONObject);
            }
            if (!(aVar instanceof j9.a.d)) {
                return null;
            }
            tB = qVar.b(((j9.a.d) aVar).f31791c, jSONObject, cVar);
        }
        return tB;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [h9.g, h9.g<T extends u9.a>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    public static final <T extends u9.a> List<T> L(j9.a<? extends List<? extends u9.b<T>>> aVar, u9.c cVar, String str, JSONObject jSONObject, h9.g<T> gVar, uc.q<? super String, ? super JSONObject, ? super u9.c, ? extends List<? extends T>> qVar) {
        ?? arrayList;
        List<? extends T> listB;
        fd.j0.i(aVar, "<this>");
        fd.j0.i(gVar, "validator");
        fd.j0.i(qVar, "reader");
        if (!aVar.f31788a || !jSONObject.has(str)) {
            if (aVar instanceof j9.a.e) {
                Iterable iterable = (Iterable) ((j9.a.e) aVar).f31792c;
                arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    u9.a aVarI = I((u9.b) it.next(), cVar, jSONObject);
                    if (aVarI != null) {
                        arrayList.add(aVarI);
                    }
                }
            } else if (aVar instanceof j9.a.d) {
                listB = qVar.b(((j9.a.d) aVar).f31791c, jSONObject, cVar);
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                return null;
            }
            if (gVar.isValid(arrayList)) {
                return (List<T>) arrayList;
            }
            cVar.a().b(q(jSONObject, str, arrayList));
            return null;
        }
        listB = qVar.b(str, jSONObject, cVar);
        arrayList = listB;
        if (arrayList == 0) {
            return null;
        }
        if (gVar.isValid(arrayList)) {
            return (List<T>) arrayList;
        }
        cVar.a().b(q(jSONObject, str, arrayList));
        return null;
    }

    public static final <T extends u9.a> T M(j9.a<? extends u9.b<T>> aVar, u9.c cVar, String str, JSONObject jSONObject, uc.q<? super String, ? super JSONObject, ? super u9.c, ? extends T> qVar) {
        T tB;
        fd.j0.i(aVar, "<this>");
        fd.j0.i(qVar, "reader");
        if (aVar.f31788a && jSONObject.has(str)) {
            tB = qVar.b(str, jSONObject, cVar);
        } else {
            if (aVar instanceof j9.a.e) {
                u9.b bVar = (u9.b) ((j9.a.e) aVar).f31792c;
                fd.j0.i(bVar, "<this>");
                try {
                    return (T) bVar.a(cVar, jSONObject);
                } catch (u9.f e10) {
                    throw h(jSONObject, str, e10);
                }
            }
            if (!(aVar instanceof j9.a.d)) {
                throw A(jSONObject, str);
            }
            tB = qVar.b(((j9.a.d) aVar).f31791c, jSONObject, cVar);
        }
        return tB;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    public static final <T extends u9.a> List<T> N(j9.a<? extends List<? extends u9.b<T>>> aVar, u9.c cVar, String str, JSONObject jSONObject, h9.g<T> gVar, uc.q<? super String, ? super JSONObject, ? super u9.c, ? extends List<? extends T>> qVar) {
        List<? extends T> listB;
        ArrayList arrayList;
        fd.j0.i(aVar, "<this>");
        fd.j0.i(gVar, "validator");
        fd.j0.i(qVar, "reader");
        if (!aVar.f31788a || !jSONObject.has(str)) {
            if (aVar instanceof j9.a.e) {
                Iterable iterable = (Iterable) ((j9.a.e) aVar).f31792c;
                arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    u9.a aVarI = I((u9.b) it.next(), cVar, jSONObject);
                    if (aVarI != null) {
                        arrayList.add(aVarI);
                    }
                }
            } else {
                if (!(aVar instanceof j9.a.d)) {
                    throw A(jSONObject, str);
                }
                listB = qVar.b(((j9.a.d) aVar).f31791c, jSONObject, cVar);
            }
            if (gVar.isValid(arrayList)) {
                return arrayList;
            }
            throw q(jSONObject, str, arrayList);
        }
        listB = qVar.b(str, jSONObject, cVar);
        arrayList = (List<T>) listB;
        if (gVar.isValid(arrayList)) {
            return arrayList;
        }
        throw q(jSONObject, str, arrayList);
    }

    public static String O(JSONArray jSONArray, int i10, int i11) throws JSONException {
        String string;
        String str;
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        k9.e eVar = new k9.e(i10, 1);
        JSONArray jSONArrayA = eVar.a(jSONArray, eVar.f31939b);
        int i12 = eVar.f31938a;
        if (i12 == 0) {
            string = jSONArrayA.toString();
            str = "copy.toString()";
        } else {
            string = jSONArrayA.toString(i12);
            str = "copy.toString(indentSpaces)";
        }
        fd.j0.h(string, str);
        return string;
    }

    public static String P(JSONObject jSONObject, int i10, int i11) throws JSONException {
        String string;
        String str;
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        k9.e eVar = new k9.e(i10, 1);
        JSONObject jSONObjectB = eVar.b(jSONObject, eVar.f31939b);
        int i12 = eVar.f31938a;
        if (i12 == 0) {
            string = jSONObjectB.toString();
            str = "copy.toString()";
        } else {
            string = jSONObjectB.toString(i12);
            str = "copy.toString(indentSpaces)";
        }
        fd.j0.h(string, str);
        return string;
    }

    public static void Q(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final String R(Object obj) {
        String strValueOf = String.valueOf(obj);
        return strValueOf.length() > 100 ? fd.j0.p(ed.w.b0(strValueOf, 97), "...") : strValueOf;
    }

    public static final u9.f S(String str, String str2, Object obj, Throwable th) {
        fd.j0.i(str, "expressionKey");
        fd.j0.i(str2, "rawExpression");
        u9.g gVar = u9.g.TYPE_MISMATCH;
        StringBuilder sbA = q2.a.a("Expression '", str, "': '", str2, "' received value of wrong type: '");
        sbA.append(obj);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        return new u9.f(gVar, sbA.toString(), th, null, null, 24, null);
    }

    public static final u9.f T(JSONArray jSONArray, String str, int i10, Object obj) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        return new u9.f(u9.g.TYPE_MISMATCH, "Value at " + i10 + " position of '" + str + "' has wrong type " + ((Object) obj.getClass().getName()), null, new k9.b(jSONArray), O(jSONArray, 0, 1), 4, null);
    }

    public static final u9.f U(JSONObject jSONObject, String str, Object obj) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        fd.j0.i(obj, "value");
        u9.g gVar = u9.g.TYPE_MISMATCH;
        StringBuilder sbA = androidx.activity.result.c.a("Value for key '", str, "' has wrong type ");
        sbA.append((Object) obj.getClass().getName());
        return new u9.f(gVar, sbA.toString(), null, new k9.d(jSONObject), P(jSONObject, 0, 1), 4, null);
    }

    public static final <T> Object V(mc.f fVar, uc.p<? super fd.g0, ? super mc.d<? super T>, ? extends Object> pVar, mc.d<? super T> dVar) throws Throwable {
        Object objZ0;
        mc.f context = dVar.getContext();
        mc.f fVarI = !fd.b0.b(fVar) ? context.i(fVar) : fd.b0.a(context, fVar, false);
        fd.z.p(fVarI);
        if (fVarI == context) {
            kd.x xVar = new kd.x(fVarI, dVar);
            objZ0 = fd.f.i(xVar, xVar, pVar);
        } else {
            int i10 = mc.e.B1;
            mc.e.a aVar = mc.e.a.f33537c;
            if (fd.j0.d(fVarI.b(aVar), context.b(aVar))) {
                fd.h2 h2Var = new fd.h2(fVarI, dVar);
                Object objC = kd.b0.c(fVarI, null);
                try {
                    Object objI = fd.f.i(h2Var, h2Var, pVar);
                    kd.b0.a(fVarI, objC);
                    objZ0 = objI;
                } catch (Throwable th) {
                    kd.b0.a(fVarI, objC);
                    throw th;
                }
            } else {
                fd.q0 q0Var = new fd.q0(fVarI, dVar);
                fd.z.L(pVar, q0Var, q0Var, null, 4);
                objZ0 = q0Var.z0();
            }
        }
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        return objZ0;
    }

    public static final String a(int i10, String str) {
        if ((str.length() == 0) || i10 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i10);
        Iterator<Integer> it = bd.e.h(0, i10).iterator();
        while (it.hasNext()) {
            sb2.append(str.charAt(((kc.c0) it).a() % str.length()));
        }
        String string = sb2.toString();
        fd.j0.h(string, "stringBuilder.toString()");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str) {
        String lowerCase = str.toLowerCase();
        fd.j0.h(lowerCase, "this as java.lang.String).toLowerCase()");
        int i10 = 2;
        if (ed.u.x(lowerCase, "z", false, 2)) {
            throw new x8.b(l8.a1.a("z/Z not supported in [", str, ']'), null, i10, 0 == true ? 1 : 0);
        }
    }

    public static final Calendar c(a9.b bVar) {
        Calendar gregorianCalendar = GregorianCalendar.getInstance();
        gregorianCalendar.setTimeZone(bVar.f206d);
        gregorianCalendar.setTimeInMillis(bVar.f205c);
        return gregorianCalendar;
    }

    public static final Date d(a9.b bVar) {
        return new Date(bVar.f205c - ((long) bVar.f206d.getRawOffset()));
    }

    public static fd.m0 e(fd.g0 g0Var, mc.f fVar, fd.h0 h0Var, uc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = mc.h.f33539c;
        }
        fd.h0 h0Var2 = (i10 & 2) != 0 ? fd.h0.DEFAULT : null;
        mc.f fVarC = fd.b0.c(g0Var, fVar);
        fd.m0 q1Var = h0Var2.isLazy() ? new fd.q1(fVarC, pVar) : new fd.n0(fVarC, true);
        h0Var2.invoke(pVar, q1Var, q1Var);
        return q1Var;
    }

    public static final <T> j9.a<T> f(j9.a<T> aVar, boolean z10) {
        if (fd.j0.d(aVar, j9.a.b.f31789c) || fd.j0.d(aVar, j9.a.c.f31790c)) {
            return j9.a.f31787b.a(z10);
        }
        if (aVar instanceof j9.a.e) {
            return new j9.a.e(z10, ((j9.a.e) aVar).f31792c);
        }
        if (aVar instanceof j9.a.d) {
            return new j9.a.d(z10, ((j9.a.d) aVar).f31791c);
        }
        throw new IllegalStateException("Unknown field type");
    }

    public static final void g(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                jc.a.a(th, th2);
            }
        }
    }

    public static final u9.f h(JSONObject jSONObject, String str, u9.f fVar) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        return new u9.f(u9.g.DEPENDENCY_FAILED, androidx.activity.j.a("Value for key '", str, "' is failed to create"), fVar, new k9.d(jSONObject), P(jSONObject, 0, 1));
    }

    public static final void i(fd.i<?> iVar, fd.t0 t0Var) {
        iVar.s(new fd.u0(t0Var));
    }

    public static final <T> Exception j(gb.x<? extends T> xVar) {
        fd.j0.i(xVar, "<this>");
        if (xVar instanceof gb.x.b) {
            return ((gb.x.b) xVar).f30416b;
        }
        return null;
    }

    public static final <T> fd.k<T> k(mc.d<? super T> dVar) {
        if (!(dVar instanceof kd.f)) {
            return new fd.k<>(dVar, 1);
        }
        fd.k<T> kVarI = ((kd.f) dVar).i();
        if (kVarI != null) {
            if (!kVarI.E()) {
                kVarI = null;
            }
            if (kVarI != null) {
                return kVarI;
            }
        }
        return new fd.k<>(dVar, 2);
    }

    public static final int l(int i10, int i11, int i12) {
        if (i12 > 0) {
            return i10 >= i11 ? i11 : i11 - B(B(i11, i12) - B(i10, i12), i12);
        }
        if (i12 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i10 <= i11) {
            return i11;
        }
        int i13 = -i12;
        return i11 + B(B(i10, i13) - B(i11, i13), i13);
    }

    public static final <T> T m(gb.x<? extends T> xVar) {
        fd.j0.i(xVar, "<this>");
        if (xVar instanceof gb.x.c) {
            return ((gb.x.c) xVar).f30417b;
        }
        return null;
    }

    public static final <T> u9.f n(String str, T t10) {
        fd.j0.i(str, "path");
        u9.g gVar = u9.g.INVALID_VALUE;
        StringBuilder sbA = defpackage.a.a("Value '");
        sbA.append(R(t10));
        sbA.append("' at path '");
        sbA.append(str);
        sbA.append("' is not valid");
        return new u9.f(gVar, sbA.toString(), null, null, null, 28, null);
    }

    public static final <T> u9.f o(JSONArray jSONArray, String str, int i10, T t10) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        u9.g gVar = u9.g.INVALID_VALUE;
        StringBuilder sbA = defpackage.a.a("Value '");
        sbA.append(R(t10));
        sbA.append("' at ");
        sbA.append(i10);
        sbA.append(" position of '");
        sbA.append(str);
        sbA.append("' is not valid");
        return new u9.f(gVar, sbA.toString(), null, new k9.b(jSONArray), O(jSONArray, 0, 1), 4, null);
    }

    public static final <T> u9.f p(JSONArray jSONArray, String str, int i10, T t10, Throwable th) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        u9.g gVar = u9.g.INVALID_VALUE;
        StringBuilder sbA = defpackage.a.a("Value '");
        sbA.append(R(t10));
        sbA.append("' at ");
        sbA.append(i10);
        sbA.append(" position of '");
        sbA.append(str);
        sbA.append("' is not valid");
        return new u9.f(gVar, sbA.toString(), th, new k9.b(jSONArray), null, 16, null);
    }

    public static final <T> u9.f q(JSONObject jSONObject, String str, T t10) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        u9.g gVar = u9.g.INVALID_VALUE;
        StringBuilder sbA = defpackage.a.a("Value '");
        sbA.append(R(t10));
        sbA.append("' for key '");
        sbA.append(str);
        sbA.append("' is not valid");
        return new u9.f(gVar, sbA.toString(), null, new k9.d(jSONObject), P(jSONObject, 0, 1), 4, null);
    }

    public static final <T> u9.f r(JSONObject jSONObject, String str, T t10, Throwable th) {
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        u9.g gVar = u9.g.INVALID_VALUE;
        StringBuilder sbA = defpackage.a.a("Value '");
        sbA.append(R(t10));
        sbA.append("' for key '");
        sbA.append(str);
        sbA.append("' is not valid");
        return new u9.f(gVar, sbA.toString(), th, new k9.d(jSONObject), null, 16, null);
    }

    public static final boolean s(Activity activity) {
        if (activity instanceof AdActivity ? true : activity instanceof AppLovinFullscreenActivity) {
            return true;
        }
        return activity instanceof AudienceNetworkActivity;
    }

    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    public static final boolean t(Activity activity) {
        boolean z10;
        fd.j0.i(activity, "<this>");
        if (!(activity instanceof ProxyBillingActivity) && !(activity instanceof RelaunchPremiumActivity) && !s(activity)) {
            boolean z11 = activity instanceof AppCompatActivity;
            if (!z11) {
                return true;
            }
            ma.h.a aVar = ma.h.f33410y;
            Objects.requireNonNull(aVar.a().f33424m);
            fd.j0.i(activity, "activity");
            if (z11) {
                if (((AppCompatActivity) activity).getSupportFragmentManager().F("RATE_DIALOG") != null) {
                    z10 = true;
                }
                if (!z10) {
                    return true;
                }
            } else {
                StringBuilder sbA = defpackage.a.a("Please use AppCompatActivity for ");
                sbA.append(activity.getClass().getName());
                String string = sbA.toString();
                fd.j0.i(string, "message");
                if (aVar.a().k()) {
                    throw new IllegalStateException(string.toString());
                }
                xe.a.f37601c.b(string, new Object[0]);
            }
            z10 = false;
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean u(View view) {
        fd.j0.i(view, "<this>");
        if (!(view instanceof m9.p)) {
            return false;
        }
        if (((m9.p) view).f()) {
            return true;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        return u(viewGroup);
    }

    public static final boolean v(com.android.billingclient.api.n nVar) {
        fd.j0.i(nVar, "<this>");
        return nVar.f3848a == 0;
    }

    public static final boolean w(com.android.billingclient.api.z zVar) {
        fd.j0.i(zVar, "<this>");
        if (zVar.f3886a.f3848a == 0) {
            List list = zVar.f3887b;
            if (!(list == null || list.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public static final <T> boolean x(gb.x<? extends T> xVar) {
        fd.j0.i(xVar, "<this>");
        return xVar instanceof gb.x.c;
    }

    public static final <T> Iterator<T> y(T[] tArr) {
        fd.j0.i(tArr, "array");
        return new vc.b(tArr);
    }

    public static fd.j1 z(fd.g0 g0Var, mc.f fVar, fd.h0 h0Var, uc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = mc.h.f33539c;
        }
        fd.h0 h0Var2 = (i10 & 2) != 0 ? fd.h0.DEFAULT : null;
        mc.f fVarC = fd.b0.c(g0Var, fVar);
        fd.j1 r1Var = h0Var2.isLazy() ? new fd.r1(fVarC, pVar) : new fd.z1(fVarC, true);
        h0Var2.invoke(pVar, r1Var, r1Var);
        return r1Var;
    }
}
