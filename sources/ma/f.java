package ma;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.gson.Gson;
import com.zipoapps.premiumhelper.util.ActivePurchaseInfo;
import fd.g0;
import fd.j0;
import fd.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements oa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f33405a;

    @oc.e(c = "com.zipoapps.premiumhelper.Preferences", f = "Preferences.kt", l = {262}, m = "allPreferencesToString")
    public static final class a extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f33406c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f33408e;

        public a(mc.d<? super a> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f33406c = obj;
            this.f33408e |= Integer.MIN_VALUE;
            return f.this.e(this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.Preferences$allPreferencesToString$2", f = "Preferences.kt", l = {}, m = "invokeSuspend")
    public static final class b extends oc.h implements uc.p<g0, mc.d<? super String>, Object> {
        public b(mc.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return f.this.new b(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super String> dVar) {
            return f.this.new b(dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            h9.d.t(obj);
            StringBuilder sb2 = new StringBuilder();
            Iterator<T> it = f.this.f33405a.getAll().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb2.append(((String) entry.getKey()) + " : " + entry.getValue());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    public f(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f33405a = context.getSharedPreferences("premium_helper_data", 0);
    }

    @Override // oa.a
    public boolean a(String str, boolean z10) {
        return oa.a.C0376a.b(this, str, z10);
    }

    @Override // oa.a
    public String b() {
        return "Premium Helper Preferences";
    }

    @Override // oa.a
    public Map<String, String> c() {
        HashMap map = new HashMap();
        Iterator<T> it = this.f33405a.getAll().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            j0.h(key, "entry.key");
            String lowerCase = String.valueOf(entry.getValue()).toLowerCase(Locale.ROOT);
            j0.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            map.put(key, lowerCase);
        }
        return map;
    }

    @Override // oa.a
    public boolean contains(String str) {
        j0.i(str, Action.KEY_ATTRIBUTE);
        return this.f33405a.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oa.a
    public <T> T d(oa.a aVar, String str, T t10) {
        Object objValueOf;
        j0.i(aVar, "<this>");
        if (t10 instanceof String) {
            objValueOf = this.f33405a.getString(str, (String) t10);
        } else if (t10 instanceof Boolean) {
            objValueOf = Boolean.valueOf(this.f33405a.getBoolean(str, ((Boolean) t10).booleanValue()));
        } else if (t10 instanceof Long) {
            objValueOf = Long.valueOf(this.f33405a.getLong(str, ((Number) t10).longValue()));
        } else {
            if (!(t10 instanceof Double)) {
                throw new IllegalStateException("Unsupported type".toString());
            }
            double dDoubleValue = ((Number) t10).doubleValue();
            if (this.f33405a.contains(str)) {
                dDoubleValue = this.f33405a.getFloat(str, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            }
            objValueOf = Double.valueOf(dDoubleValue);
        }
        return objValueOf == null ? t10 : (T) objValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(mc.d<? super String> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f33408e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f33408e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objL = aVar.f33406c;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = aVar.f33408e;
        if (i11 == 0) {
            h9.d.t(objL);
            b bVar = new b(null);
            aVar.f33408e = 1;
            objL = z.l(bVar, aVar);
            if (objL == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objL);
        }
        j0.h(objL, "suspend fun allPreferenc…String()\n        }\n\n    }");
        return objL;
    }

    public long f(String str, long j10) {
        return ((Number) d(this, str, Long.valueOf(j10))).longValue();
    }

    public final ActivePurchaseInfo g() {
        String string = this.f33405a.getString("active_purchase_info", "");
        if (string == null || string.length() == 0) {
            return null;
        }
        return (ActivePurchaseInfo) new Gson().b(string, ActivePurchaseInfo.class);
    }

    public final int h() {
        return this.f33405a.getInt("app_start_counter", 0);
    }

    public final long i() {
        return this.f33405a.getLong("one_time_offer_start_time", 0L);
    }

    public final boolean j() {
        this.f33405a.getBoolean("has_active_purchase", false);
        return true;
    }

    public final int k() {
        int i10 = this.f33405a.getInt("app_start_counter", 0);
        SharedPreferences.Editor editorEdit = this.f33405a.edit();
        int i11 = i10 + 1;
        editorEdit.putInt("app_start_counter", i11);
        editorEdit.apply();
        return i11;
    }

    public final boolean l() {
        return this.f33405a.getBoolean("is_next_app_start_ignored", false);
    }

    public final void m(String str, int i10) {
        SharedPreferences.Editor editorEdit = this.f33405a.edit();
        editorEdit.putInt(str, i10);
        editorEdit.apply();
    }

    public final void n(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f33405a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void o(String str, T t10) {
        long jLongValue;
        SharedPreferences.Editor editorEdit = this.f33405a.edit();
        if (t10 instanceof String) {
            editorEdit.putString(str, (String) t10);
        } else if (t10 instanceof Boolean) {
            editorEdit.putBoolean(str, ((Boolean) t10).booleanValue());
        } else {
            if (t10 instanceof Integer) {
                jLongValue = ((Number) t10).intValue();
            } else if (t10 instanceof Long) {
                jLongValue = ((Number) t10).longValue();
            } else {
                if (!(t10 instanceof Double)) {
                    throw new IllegalStateException("Unsupported type".toString());
                }
                editorEdit.putFloat(str, (float) ((Number) t10).doubleValue());
            }
            editorEdit.putLong(str, jLongValue);
        }
        editorEdit.apply();
    }

    public final void p(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f33405a.edit();
        editorEdit.putBoolean("has_active_purchase", z10);
        editorEdit.apply();
    }

    public final void q() {
        SharedPreferences.Editor editorEdit = this.f33405a.edit();
        editorEdit.putBoolean("is_onboarding_complete", true);
        editorEdit.apply();
    }
}
