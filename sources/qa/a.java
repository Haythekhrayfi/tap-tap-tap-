package qa;

import androidx.activity.j;
import cd.i;
import ch.qos.logback.core.joran.action.Action;
import fd.g0;
import fd.j0;
import fd.z;
import h6.g;
import i6.f;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import jc.w;
import kotlin.reflect.KProperty;
import mc.d;
import oc.h;
import ta.e;
import uc.p;
import vc.b0;
import vc.l;
import vc.t;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements oa.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f34851e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.firebase.remoteconfig.a f34852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f34853b = new e("PremiumHelper");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34855d;

    /* JADX INFO: renamed from: qa.a$a, reason: collision with other inner class name */
    @oc.e(c = "com.zipoapps.premiumhelper.configuration.remoteconfig.RemoteConfig", f = "RemoteConfig.kt", l = {131}, m = "allValuesToString")
    public static final class C0393a extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f34856c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34858e;

        public C0393a(d<? super C0393a> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f34856c = obj;
            this.f34858e |= Integer.MIN_VALUE;
            return a.this.e(this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.configuration.remoteconfig.RemoteConfig$allValuesToString$2", f = "RemoteConfig.kt", l = {}, m = "invokeSuspend")
    public static final class b extends h implements p<g0, d<? super String>, Object> {
        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final d<w> create(Object obj, d<?> dVar) {
            return a.this.new b(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, d<? super String> dVar) {
            return a.this.new b(dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            h9.d.t(obj);
            StringBuilder sb2 = new StringBuilder();
            com.google.firebase.remoteconfig.a aVar2 = a.this.f34852a;
            if (aVar2 == null) {
                j0.r("firebaseRemoteConfig");
                throw null;
            }
            for (Map.Entry entry : ((HashMap) aVar2.a()).entrySet()) {
                sb2.append(((String) entry.getKey()) + " = " + ((g) entry.getValue()).c() + " source: " + ((g) entry.getValue()).b());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    public static final class c extends l implements uc.l<String, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ T f34861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f34862e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(T t10, String str) {
            super(1);
            this.f34861d = t10;
            this.f34862e = str;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0079  */
        /* JADX WARN: Code duplicated, block: B:25:0x0081  */
        /* JADX WARN: Code duplicated, block: B:28:0x008e  */
        /* JADX WARN: Code duplicated, block: B:31:0x009b  */
        @Override // uc.l
        public Object invoke(String str) {
            double dDoubleValue;
            long jLongValue;
            String strF;
            j0.i(str, "it");
            com.google.firebase.remoteconfig.a aVar = a.this.f34852a;
            if (aVar == null) {
                j0.r("firebaseRemoteConfig");
                throw null;
            }
            T t10 = this.f34861d;
            String str2 = this.f34862e;
            if (t10 instanceof String) {
                i6.d dVar = aVar.f12669g;
                String strF2 = i6.d.f(dVar.f31286c, str2);
                if (strF2 != null) {
                    dVar.a(str2, i6.d.b(dVar.f31286c));
                    return strF2;
                }
                String strF3 = i6.d.f(dVar.f31287d, str2);
                if (strF3 != null) {
                    return strF3;
                }
                i6.d.h(str2, "String");
                return "";
            }
            if (t10 instanceof Boolean) {
                i6.d dVar2 = aVar.f12669g;
                String strF4 = i6.d.f(dVar2.f31286c, str2);
                boolean z10 = true;
                if (strF4 == null) {
                    strF = i6.d.f(dVar2.f31287d, str2);
                    if (strF == null) {
                        i6.d.h(str2, "Boolean");
                        z10 = false;
                    } else if (!i6.d.f31282e.matcher(strF).matches()) {
                        if (!i6.d.f31283f.matcher(strF).matches()) {
                            i6.d.h(str2, "Boolean");
                        }
                        z10 = false;
                    }
                } else if (i6.d.f31282e.matcher(strF4).matches()) {
                    dVar2.a(str2, i6.d.b(dVar2.f31286c));
                } else {
                    if (i6.d.f31283f.matcher(strF4).matches()) {
                        dVar2.a(str2, i6.d.b(dVar2.f31286c));
                    } else {
                        strF = i6.d.f(dVar2.f31287d, str2);
                        if (strF == null) {
                            i6.d.h(str2, "Boolean");
                        } else if (!i6.d.f31282e.matcher(strF).matches()) {
                            if (!i6.d.f31283f.matcher(strF).matches()) {
                                i6.d.h(str2, "Boolean");
                            }
                        }
                    }
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
            if (t10 instanceof Long) {
                i6.d dVar3 = aVar.f12669g;
                Long lE = i6.d.e(dVar3.f31286c, str2);
                if (lE != null) {
                    dVar3.a(str2, i6.d.b(dVar3.f31286c));
                    jLongValue = lE.longValue();
                } else {
                    Long lE2 = i6.d.e(dVar3.f31287d, str2);
                    if (lE2 != null) {
                        jLongValue = lE2.longValue();
                    } else {
                        i6.d.h(str2, "Long");
                        jLongValue = 0;
                    }
                }
                return Long.valueOf(jLongValue);
            }
            if (!(t10 instanceof Double)) {
                throw new IllegalStateException("Unsupported type".toString());
            }
            i6.d dVar4 = aVar.f12669g;
            Double dC = i6.d.c(dVar4.f31286c, str2);
            if (dC != null) {
                dVar4.a(str2, i6.d.b(dVar4.f31286c));
                dDoubleValue = dC.doubleValue();
            } else {
                Double dC2 = i6.d.c(dVar4.f31287d, str2);
                if (dC2 != null) {
                    dDoubleValue = dC2.doubleValue();
                } else {
                    i6.d.h(str2, "Double");
                    dDoubleValue = 0.0d;
                }
            }
            return Double.valueOf(dDoubleValue);
        }
    }

    static {
        t tVar = new t(a.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(b0.f36991a);
        f34851e = new i[]{tVar};
    }

    @Override // oa.a
    public boolean a(String str, boolean z10) {
        return oa.a.C0376a.b(this, str, z10);
    }

    @Override // oa.a
    public String b() {
        return "Remote Config";
    }

    @Override // oa.a
    public Map<String, String> c() {
        HashMap map = new HashMap();
        com.google.firebase.remoteconfig.a aVar = this.f34852a;
        if (aVar == null) {
            j0.r("firebaseRemoteConfig");
            throw null;
        }
        for (Map.Entry entry : ((HashMap) aVar.a()).entrySet()) {
            Object key = entry.getKey();
            j0.h(key, "entry.key");
            String strC = ((g) entry.getValue()).c();
            j0.h(strC, "entry.value.asString()");
            String lowerCase = strC.toLowerCase(Locale.ROOT);
            j0.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            map.put(key, lowerCase);
        }
        return map;
    }

    @Override // oa.a
    public boolean contains(String str) {
        j0.i(str, Action.KEY_ATTRIBUTE);
        if (!this.f34855d) {
            f().b(j.a("!!!!!! RemoteConfig key ", str, " queried (contains) before initialization !!!!!!"), new Object[0]);
            return false;
        }
        com.google.firebase.remoteconfig.a aVar = this.f34852a;
        if (aVar == null && !this.f34854c) {
            f().b(j.a("RemoteConfig key ", str, " queried before initialization"), new Object[0]);
            return false;
        }
        if (aVar != null) {
            return ((f) aVar.f12669g.g(str)).f31292b != 0;
        }
        j0.r("firebaseRemoteConfig");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // oa.a
    public <T> T d(oa.a aVar, String str, T t10) {
        Object objInvoke;
        j0.i(aVar, "<this>");
        c cVar = new c(t10, str);
        if (this.f34855d) {
            com.google.firebase.remoteconfig.a aVar2 = this.f34852a;
            if (aVar2 != null || this.f34854c) {
                if (aVar2 == null) {
                    j0.r("firebaseRemoteConfig");
                    throw null;
                }
                if (((f) aVar2.f12669g.g(str)).f31292b != 0) {
                    objInvoke = cVar.invoke(str);
                }
                if (objInvoke == null) {
                    return t10;
                }
                return (T) objInvoke;
            }
            f().b(j.a("RemoteConfig key ", str, " queried before initialization"), new Object[0]);
        } else {
            if (this.f34854c) {
                throw new IllegalStateException(("!!!!!! RemoteConfig key " + str + " queried before initialization !!!!!!").toString());
            }
            f().b(j.a("!!!!!! RemoteConfig key ", str, " queried before initialization !!!!!!"), new Object[0]);
        }
        objInvoke = t10;
        if (objInvoke == null) {
            return t10;
        }
        return (T) objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(d<? super String> dVar) {
        C0393a c0393a;
        if (dVar instanceof C0393a) {
            c0393a = (C0393a) dVar;
            int i10 = c0393a.f34858e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0393a.f34858e = i10 - Integer.MIN_VALUE;
            } else {
                c0393a = new C0393a(dVar);
            }
        } else {
            c0393a = new C0393a(dVar);
        }
        Object objL = c0393a.f34856c;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = c0393a.f34858e;
        if (i11 == 0) {
            h9.d.t(objL);
            b bVar = new b(null);
            c0393a.f34858e = 1;
            objL = z.l(bVar, c0393a);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objL);
        }
        j0.h(objL, "suspend fun allValuesToS…oString()\n        }\n    }");
        return objL;
    }

    public final ta.d f() {
        return this.f34853b.a(this, f34851e[0]);
    }
}
